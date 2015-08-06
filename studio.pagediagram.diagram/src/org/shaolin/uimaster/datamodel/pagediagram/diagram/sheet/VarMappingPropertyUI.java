package org.shaolin.uimaster.datamodel.pagediagram.diagram.sheet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.NameExpressionType;
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.pagediagram.util.UITypeConvertor;

public class VarMappingPropertyUI extends Composite {
	private Table mappingTable;

	private TableViewer tableViewer;
	
	private EObject container;
	
	private EList<ParamType> srcVars;
	
	private EList<ParamType> tarVars;
	
	private EList<NameExpressionType> nameExprs;
	
	private NameExpressionType selectedVar;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public VarMappingPropertyUI(Composite parent, int style) {
		super(parent, SWT.EMBEDDED);
		setLayout(new GridLayout(1, true));
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setMinHeight(150);
		GridData gd_scrolledComposite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_scrolledComposite.minimumHeight = 150;
		scrolledComposite.setLayoutData(gd_scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		TableColumnLayout colLayout = new TableColumnLayout();
		scrolledComposite.setLayout(colLayout);
		
		tableViewer = new TableViewer(scrolledComposite, SWT.BORDER | SWT.FULL_SELECTION);
		mappingTable = tableViewer.getTable();
		mappingTable.setHeaderVisible(true);
		mappingTable.setLinesVisible(true);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn varNameCol = tableViewerColumn.getColumn();
		varNameCol.setWidth(150);
		varNameCol.setText("Target Node's Var Name");
		colLayout.setColumnData(varNameCol, new ColumnWeightData(100, ColumnWeightData.MINIMUM_WIDTH, true));
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn categoriesCol = tableViewerColumn_1.getColumn();
		categoriesCol.setWidth(150);
		categoriesCol.setText("Source Var Name or Expression.");
		colLayout.setColumnData(categoriesCol, new ColumnWeightData(2, ColumnWeightData.MINIMUM_WIDTH, true));
		
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.add(new Action("Add Mapping") {
			public void run() {
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(container);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
				    @Override
				    protected void doExecute() {
				    	NameExpressionType var = CommonFactory.eINSTANCE.createNameExpressionType();
				    	nameExprs.add(var);
				    	
				    	tableViewer.refresh();
				    }
				});
			}
		});
		menuMgr.add(new Action("Remove Mapping") {
			public void run() {
				if (selectedVar == null) {
					return;
				}
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(container);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
				    @Override
				    protected void doExecute() {
				    	nameExprs.remove(selectedVar);
				    	
				    	tableViewer.remove(selectedVar);
				    	tableViewer.refresh();
				    }
				});
			}
		});
		final Menu menu = menuMgr.createContextMenu(mappingTable);
		mappingTable.setMenu(menu);
		
		scrolledComposite.setContent(mappingTable);
		scrolledComposite.setMinSize(mappingTable.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		tableViewer.setLabelProvider(new TableLabelProvider());
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setCellModifier(new CellModifier());
		tableViewer.setColumnProperties(new String[] {
				"VarName","Expression"
		});
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectedVar = (NameExpressionType)sel.getFirstElement();
			}
		});
	}

	private String[] getVarNameList() {
		String[] s = new String[srcVars.size()];
		srcVars.toArray(s);
		return s;
	}
	
	private String[] getExprList() {
		String[] s = new String[tarVars.size()];
		tarVars.toArray(s);
		return s;
	}
	
	private int getVarNameIndex(String name) {
		if (name == null || name.isEmpty()) {
			return 0;
		}
		for (int i = 0; i < srcVars.size(); i++) {
			if (name.equals(srcVars.get(i).getName())) {
				return i;
			}
		}
		return 0;
	}
	
	private int getExprIndex(String expr) {
		if (expr == null || expr.isEmpty()) {
			return -1;
		}
		String[] types = UITypeConvertor.getVarScopes();
		for (int i = 0; i < types.length; i++) {
			if (expr.equals(types[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public void init(EObject container, EList<NameExpressionType> parameters,
			EList<ParamType> srcVars, EList<ParamType> tarVars) {
		this.container = container;
		this.nameExprs = parameters;
		this.srcVars = srcVars;
		this.tarVars = tarVars;
		
		this.tableViewer.setInput(parameters);
		this.tableViewer.setCellEditors(new CellEditor[] {
				null,
				new DialogCellEditorImpl(mappingTable, tarVars)
		});
	}
	
	public void addMapping(ParamType var) {
		this.tableViewer.add(var);
		this.tableViewer.refresh();
	}
	
	public void removeMapping(ParamType var) {
		this.tableViewer.remove(var);
		this.tableViewer.refresh();
	}
	
	@Override
	protected void checkSubclass() {
	}
	
	private class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}
		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			
			NameExpressionType p = (NameExpressionType) element;
			switch(columnIndex) {
			case 0:
				result = p.getName();
				break;
			case 1:
				result = p.getExpression() != null 
				? p.getExpression().getExpressionString():"";
				break;
			}
			return result;
		}
	}
	
	private class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			return nameExprs.toArray();
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}
	
	private class CellModifier implements ICellModifier {

		@Override
		public boolean canModify(Object element, String property) {
			if ("Expression".equals(property)) {
				return true;
			}
			return false;
		}

		@Override
		public Object getValue(Object element, String property) {
			NameExpressionType p = (NameExpressionType)element;
			if ("VarName".equals(property)) {
				return getVarNameIndex(p.getName());
			} else if ("Expression".equals(property)) {
				if (p.getExpression() != null) {
					return p.getExpression().getExpressionString();
				}
			}
			
			return "";
		}

		@Override
		public void modify(Object element, final String property, final Object value) {
			TableItem tableItem = (TableItem) element;
			final NameExpressionType p = (NameExpressionType)tableItem.getData();
			tableViewer.refresh(p);
		}
	}
	
	class DialogCellEditorImpl extends DialogCellEditor {
		
		private final EList<ParamType> tarVars;
		
		public DialogCellEditorImpl(Table mappingTable, EList<ParamType> tarVars) {
			super(mappingTable);
			this.tarVars = tarVars;
		}
		
		@Override
		protected Object openDialogBox(Control cellEditorWindow) {
			VarMappingDialog wd = new VarMappingDialog(cellEditorWindow.getShell());
			
			wd.setTarVars(tarVars);
			wd.setSrcVars(srcVars);
			wd.setSelectedVar(selectedVar);
			return wd.open();
		}
	}
	
}
