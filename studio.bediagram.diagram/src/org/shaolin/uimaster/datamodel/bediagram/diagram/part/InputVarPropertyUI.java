package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.ParamScopeType;
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.common.VariableCategoryType;
import org.shaolin.uimaster.datamodel.pagediagram.util.UITypeConvertor;

public class InputVarPropertyUI extends Composite {
	private Table mappingTable;

	private TableViewer tableViewer;
	
	private List<ParamType> parameters;
	
	private ParamType selectedVar;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public InputVarPropertyUI(Composite parent, int style) {
		super(parent, SWT.EMBEDDED);
		setLayout(new GridLayout(1, true));
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(this, SWT.NONE);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TableColumnLayout colLayout = new TableColumnLayout();
		scrolledComposite.setLayout(colLayout);
		
		tableViewer = new TableViewer(scrolledComposite, SWT.BORDER | SWT.FULL_SELECTION);
		mappingTable = tableViewer.getTable();
		mappingTable.setHeaderVisible(true);
		mappingTable.setLinesVisible(true);
		
		//"VarName","Category","Type","DefaultValue","Scope","Nodes"
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn varNameCol = tableViewerColumn.getColumn();
		varNameCol.setWidth(100);
		varNameCol.setText("Var Name");
		colLayout.setColumnData(varNameCol, new ColumnWeightData(100, ColumnWeightData.MINIMUM_WIDTH, true));
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn categoriesCol = tableViewerColumn_1.getColumn();
		categoriesCol.setWidth(100);
		categoriesCol.setText("Categories");
		colLayout.setColumnData(categoriesCol, new ColumnWeightData(2, ColumnWeightData.MINIMUM_WIDTH, true));
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn dataTypesCol = tableViewerColumn_2.getColumn();
		dataTypesCol.setWidth(100);
		dataTypesCol.setText("Data Type");
		colLayout.setColumnData(dataTypesCol, new ColumnWeightData(2, ColumnWeightData.MINIMUM_WIDTH, true));
		
		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn defaultValueCol = tableViewerColumn_3.getColumn();
		defaultValueCol.setWidth(100);
		defaultValueCol.setText("Default Value");
		colLayout.setColumnData(defaultValueCol, new ColumnWeightData(2, ColumnWeightData.MINIMUM_WIDTH, true));
		
		TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn scopesCol = tableViewerColumn_4.getColumn();
		scopesCol.setWidth(100);
		scopesCol.setText("Scopes");
		colLayout.setColumnData(scopesCol, new ColumnWeightData(2, ColumnWeightData.MINIMUM_WIDTH, true));
		
		TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn notesCol = tableViewerColumn_5.getColumn();
		notesCol.setWidth(100);
		notesCol.setText("Notes");
		colLayout.setColumnData(notesCol, new ColumnWeightData(2, ColumnWeightData.MINIMUM_WIDTH, true));
		
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.add(new Action("Add Variable") {
			public void run() {
		    	ParamType var = CommonFactory.eINSTANCE.createParamType();
		    	var.setName("var" + parameters.size());
		    	parameters.add(var);
		    	
		    	tableViewer.refresh();
			}
		});
		menuMgr.add(new Action("Remove Variable") {
			public void run() {
				if (selectedVar == null) {
					return;
				}
		    	parameters.remove(selectedVar);
		    	
		    	tableViewer.remove(selectedVar);
		    	tableViewer.refresh();
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
				"VarName","Category","Type","DefaultValue","Scope","Nodes"
		});
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectedVar = (ParamType)sel.getFirstElement();
			}
		});
	}

	private String[] getScopes() {
		return UITypeConvertor.getVarScopes();
	}
	
	private String[] getCategories() {
		return UITypeConvertor.getVarCategories();
	}
	
	private int getCategoryIndex(String literal) {
		if (literal == null || literal.isEmpty()) {
			return -1;
		}
		String[] types = UITypeConvertor.getVarCategories();
		for (int i = 0; i < types.length; i++) {
			if (literal.equals(types[i])) {
				return i;
			}
		}
		return -1;
	}
	
	private int getScopeIndex(String literal) {
		if (literal == null || literal.isEmpty()) {
			return -1;
		}
		String[] types = UITypeConvertor.getVarScopes();
		for (int i = 0; i < types.length; i++) {
			if (literal.equals(types[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public void init(List<ParamType> parameters) {
		this.parameters = parameters;
		
		this.tableViewer.setInput(parameters);
		this.tableViewer.setCellEditors(new CellEditor[] {
				new TextCellEditor(mappingTable),
				new ComboBoxCellEditor(mappingTable, getCategories()),
				new TextCellEditor(mappingTable),
				new TextCellEditor(mappingTable),
				new ComboBoxCellEditor(mappingTable, getScopes()),
				new TextCellEditor(mappingTable)
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
		// Disable the check that prevents subclassing of SWT components
	}
	
	private class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}
		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			
			//"VarName","Category","Type","DefaultValue","Scope","Nodes"
			ParamType p = (ParamType) element;
			switch(columnIndex) {
			case 0:
				result = p.getName();
				break;
			case 1:
				result = p.getCategory().getLiteral();
				break;
			case 2:
				result = p.getType() != null ? p.getType().getEntityName() : "";
				break;
			case 3:
				result = p.getDefault() != null ? p.getDefault()
						.getExpressionString() : "";
				break;
			case 4:
				result = p.getScope().getLiteral();
				break;
			case 5:
				result = p.getNotes();
				break;
			}
			
			return result;
		}
	}
	
	private class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			return parameters.toArray();
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}
	
	private class CellModifier implements ICellModifier {

		@Override
		public boolean canModify(Object element, String property) {
			//"VarName","Category","Type","DefaultValue","Scope","Nodes"
			return true;
		}

		@Override
		public Object getValue(Object element, String property) {
			//"VarName","Category","Type","DefaultValue","Scope","Nodes"
			ParamType p = (ParamType)element;
			if ("Category".equals(property)) {
				return getCategoryIndex(p.getCategory().getLiteral());
			} else if ("Scope".equals(property)) {
				return getScopeIndex(p.getScope().getLiteral());
			} else if ("VarName".equals(property)) {
				return p.getName();
			} else if ("Type".equals(property)) {
				return p.getType()!=null?p.getType().getEntityName():"";
			} else if ("DefaultValue".equals(property)) {
				return p.getDefault()!=null?p.getDefault().getExpressionString():"";
			} else if ("Nodes".equals(property)) {
				return p.getNotes();
			}
			return "";
		}

		@Override
		public void modify(Object element, final String property, final Object value) {
			TableItem tableItem = (TableItem) element;
			final ParamType p = (ParamType)tableItem.getData();
			
			if ("VarName".equals(property)) {
				p.setName(value.toString());
			} else if ("Category".equals(property)) {
				p.setCategory(VariableCategoryType.get(((Integer)value)));
			} else if ("Type".equals(property)) {
				p.setType(CommonFactory.eINSTANCE.createTargetEntityType());
				p.getType().setEntityName(value.toString());
			} else if ("DefaultValue".equals(property)) {
				p.setDefault(CommonFactory.eINSTANCE.createExpressionType());
				p.getDefault().setExpressionString(value.toString());
			} else if ("Scope".equals(property)) {
				p.setScope(ParamScopeType.get(((Integer)value)));
			} else if ("Nodes".equals(property)) {
				p.setNotes(value.toString());
			}
			tableViewer.refresh(p);
		}
	}
	
	
}
