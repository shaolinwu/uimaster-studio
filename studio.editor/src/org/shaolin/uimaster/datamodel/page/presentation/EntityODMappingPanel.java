package org.shaolin.uimaster.datamodel.page.presentation;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.ExpressionType;
import org.shaolin.uimaster.datamodel.page.ComponentMappingType;
import org.shaolin.uimaster.datamodel.page.DirectComponentMappingType;
import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PagePackage;
import org.shaolin.uimaster.datamodel.page.SimpleComponentMappingType;
import org.shaolin.uimaster.datamodel.page.UIEntityType;
import org.shaolin.uimaster.datamodel.page.util.PageResourceImpl;

public class EntityODMappingPanel extends Composite {
	private VariablesDefinitionUI varDefinition; 
	private Table mappingTable;
	private Text dataToUITxt;
	
	private TableViewer tableViewer;
	
	private UIEntityType model;
	
	private ComponentMappingType selectedMapping;
	
	private ODMappingViewer viewer;
	
	private AdapterFactoryEditingDomain editingDomain;
	private Table varTable;
	private Text uiToDataTxt;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public EntityODMappingPanel(Composite parent, int style) {
		super(parent, SWT.NONE);
		setLayout(new GridLayout(1, false));
		
		Group grpVariablesDefinition = new Group(this, SWT.NONE);
		grpVariablesDefinition.setLayout(new GridLayout(1, false));
		GridData gd_grpVariablesDefinition = new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1);
		gd_grpVariablesDefinition.minimumHeight = 100;
		grpVariablesDefinition.setLayoutData(gd_grpVariablesDefinition);
		grpVariablesDefinition.setText("Variables Definition:");
		
		varDefinition = new VariablesDefinitionUI(grpVariablesDefinition, SWT.NONE);
		varDefinition.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Group grpUiComponentMappings = new Group(this, SWT.NONE);
		grpUiComponentMappings.setText("UI Component Mappings:");
		grpUiComponentMappings.setLayout(new GridLayout(1, false));
		GridData gd_grpUiComponentMappings = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		gd_grpUiComponentMappings.minimumHeight = 100;
		grpUiComponentMappings.setLayoutData(gd_grpUiComponentMappings);
		
		tableViewer = new TableViewer(grpUiComponentMappings, SWT.BORDER | SWT.FULL_SELECTION);
		mappingTable = tableViewer.getTable();
		mappingTable.setLinesVisible(true);
		mappingTable.setHeaderVisible(true);
		mappingTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.add(new Action("Add Simple Mapping") {
			public void run() {
				int index = model.getMapping().getComponentMapping().size();
				SimpleComponentMappingType mapping = 
						PageFactory.eINSTANCE.createSimpleComponentMappingType();
				mapping.setName("simpleMapping" + index);
				
				Command addODmappingCmd = AddCommand.create(editingDomain, model.getMapping(), 
	    				PagePackage.eINSTANCE.getSimpleComponentMappingType(), 
	    				mapping, index);
	    		editingDomain.getCommandStack().execute(addODmappingCmd);
		    	
		    	tableViewer.add(mapping);
		    	tableViewer.refresh();
			}
		});
		menuMgr.add(new Action("Add Direct Mapping") {
			public void run() {
				int index = model.getMapping().getComponentMapping().size();
				DirectComponentMappingType mapping = 
						PageFactory.eINSTANCE.createDirectComponentMappingType();
				mapping.setName("directMapping" + index);
				
				Command addODmappingCmd = AddCommand.create(editingDomain, model.getMapping(), 
	    				PagePackage.eINSTANCE.getDirectComponentMappingType(), 
	    				mapping, index);
	    		editingDomain.getCommandStack().execute(addODmappingCmd);
		    	
		    	tableViewer.add(mapping);
		    	tableViewer.refresh();
			}
		});
		menuMgr.add(new Action("Remove Mapping") {
			public void run() {
				if (selectedMapping == null) {
					return;
				}
				
				Command addODmappingCmd;
				if (selectedMapping instanceof SimpleComponentMappingType) {
					addODmappingCmd = RemoveCommand.create(editingDomain, model.getMapping(), 
	    				PagePackage.eINSTANCE.getSimpleComponentMappingType(), 
	    				selectedMapping);
				} else {
					addODmappingCmd = RemoveCommand.create(editingDomain, model.getMapping(), 
		    				PagePackage.eINSTANCE.getDirectComponentMappingType(), 
		    				selectedMapping);
				}
				editingDomain.getCommandStack().execute(addODmappingCmd);
				
				selectedMapping = null;
				tableViewer.refresh();
			}
		});
		final Menu menu = menuMgr.createContextMenu(mappingTable);
		mappingTable.setMenu(menu);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnMappingName = tableViewerColumn.getColumn();
		tblclmnMappingName.setWidth(100);
		tblclmnMappingName.setText("Mapping Name");
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnMappingType = tableViewerColumn_1.getColumn();
		tblclmnMappingType.setWidth(250);
		tblclmnMappingType.setText("Mapping Type");
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnMappingRule = tableViewerColumn_2.getColumn();
		tblclmnMappingRule.setWidth(100);
		tblclmnMappingRule.setText("Mapping Rule");
		
		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnEditorDialog = tableViewerColumn_3.getColumn();
		tblclmnEditorDialog.setWidth(100);
		tblclmnEditorDialog.setText("Editor Dialog");
		
		// this code must be placed before all the column viewers.
		tableViewer.setLabelProvider(new TableLabelProvider());
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setCellModifier(new CellModifier());
		tableViewer.setColumnProperties(new String[] {
				"MappingName","MappingType","MappingRule","EditDialog"
		});
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectedMapping = (ComponentMappingType)sel.getFirstElement();
			}
		});
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		composite.setLayout(new GridLayout(2, false));
		
		Group grpPageIncomeMapping = new Group(composite, SWT.NONE);
		grpPageIncomeMapping.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		grpPageIncomeMapping.setSize(417, 106);
		grpPageIncomeMapping.setLayout(new GridLayout(1, false));
		grpPageIncomeMapping.setText("Data to UI:");
		
		dataToUITxt = new Text(grpPageIncomeMapping, SWT.BORDER | SWT.MULTI);
		dataToUITxt.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				if (model.getMapping().getDataToUIMappingOperation() != null 
						&& model.getMapping().getDataToUIMappingOperation().getExpressionString().equals(dataToUITxt.getText())) {
					return;
				}
				ExpressionType expr = CommonFactory.eINSTANCE.createExpressionType();
				expr.setExpressionString(dataToUITxt.getText());
				
				Command addODmappingCmd = SetCommand.create(editingDomain, model.getMapping(), 
	    				PagePackage.eINSTANCE.getODMappingType_DataToUIMappingOperation(), expr);
				editingDomain.getCommandStack().execute(addODmappingCmd);
			}
		});
		GridData gd_dataToUITxt = new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1);
		gd_dataToUITxt.minimumHeight = 120;
		dataToUITxt.setLayoutData(gd_dataToUITxt);
		
		Group grpPageOutcomeMappings = new Group(composite, SWT.NONE);
		GridData gd_grpPageOutcomeMappings = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_grpPageOutcomeMappings.minimumHeight = 80;
		grpPageOutcomeMappings.setLayoutData(gd_grpPageOutcomeMappings);
		grpPageOutcomeMappings.setSize(18, 80);
		grpPageOutcomeMappings.setLayout(new GridLayout(1, false));
		grpPageOutcomeMappings.setText("UI to Data:");
		
		uiToDataTxt = new Text(grpPageOutcomeMappings, SWT.MULTI);
		GridData gd_uiToDataTxt = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		gd_uiToDataTxt.minimumHeight = 120;
		uiToDataTxt.setLayoutData(gd_uiToDataTxt);
		uiToDataTxt.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				if (model.getMapping().getUIToDataMappingOperation() != null 
						&& model.getMapping().getUIToDataMappingOperation().getExpressionString().equals(uiToDataTxt.getText())) {
					return;
				}
				ExpressionType expr = CommonFactory.eINSTANCE.createExpressionType();
				expr.setExpressionString(uiToDataTxt.getText());
				
				Command addODmappingCmd = SetCommand.create(editingDomain, model.getMapping(), 
	    				PagePackage.eINSTANCE.getODMappingType_UIToDataMappingOperation(), expr);
				editingDomain.getCommandStack().execute(addODmappingCmd);
			}
		});
	}
	
	public StructuredViewer getViewer() {
		if (viewer == null) {
			viewer = new ODMappingViewer(this);
		}
		return viewer;
	}
	
	public void setEditingDomain(AdapterFactoryEditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}
	
	public void init(UIEntityType model) {
		this.model = model;
		
		varDefinition.init(this.editingDomain, model.getMapping(), model.getMapping().getDataEntity());
		dataToUITxt.setText(model.getMapping().getDataToUIMappingOperation().getExpressionString());
		uiToDataTxt.setText(model.getMapping().getUIToDataMappingOperation().getExpressionString());
		
		this.tableViewer.setInput(model.getMapping().getComponentMapping());
		this.tableViewer.setCellEditors(new CellEditor[] {
				null,
				null,
				null,
				new DialogCellEditorImpl(mappingTable)
		});
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	

	class DialogCellEditorImpl extends DialogCellEditor {
		
		public DialogCellEditorImpl(Table mappingTable) {
			super(mappingTable);
		}
		
		@Override
		protected Object openDialogBox(Control cellEditorWindow) {
			if (selectedMapping instanceof SimpleComponentMappingType) {
				ODSimpleMappingDialog wd = new ODSimpleMappingDialog(
						cellEditorWindow.getShell(), (SimpleComponentMappingType)selectedMapping);
				return wd.open();
			} 
			ODDirectMappingDialog  wd = new ODDirectMappingDialog(
					cellEditorWindow.getShell(), (DirectComponentMappingType)selectedMapping);
			return wd.open();
			
		}
	}
	
	
	private class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}
		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			
			ComponentMappingType p = (ComponentMappingType) element;
			if (p instanceof SimpleComponentMappingType) {
				SimpleComponentMappingType scm = (SimpleComponentMappingType)p;
				switch(columnIndex) {
				case 0:
					result = scm.getName();
					break;
				case 1:
					result = scm.getClass().getName();
					break;
				case 2:
					result = scm.getMappingRule() !=null? scm.getMappingRule().getEntityName():"";
					break;
				case 3:
					result = "" ;
					break;
				}
			} else if (p instanceof DirectComponentMappingType) {
				DirectComponentMappingType dcm = (DirectComponentMappingType)p;
				switch(columnIndex) {
				case 0:
					result = dcm.getName();
					break;
				case 1:
					result = dcm.getClass().getName();
					break;
				case 2:
					result = dcm.getDataComponent() != null? dcm.getDataComponent().getParamName():"";
					break;
				case 3:
					result = "" ;
					break;
				}
			} 
			
			return result;
		}
	}
	
	private class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			EList<ComponentMappingType> w = (EList<ComponentMappingType>) inputElement;
			return w.toArray();
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}
	
	private class CellModifier implements ICellModifier {

		@Override
		public boolean canModify(Object element, String property) {
			if ("EditDialog".equals(property)) {
				return true;
			}
			return false;
		}

		@Override
		public Object getValue(Object element, String property) {
			// "MappingName","MappingType","MappingRule","EditDialog"
			ComponentMappingType p = (ComponentMappingType) element;
			if ("MappingName".equals(property)) {
				return p.getName();
			} else if ("MappingType".equals(property)) {
				return p.getClass().getName();
			} else if ("MappingType".equals(property)) {
				return "";
			} else if ("EditDialog".equals(property)) {
				return "";
			} 
			
			return null;
		}

		@Override
		public void modify(Object element, String property, Object value) {
			TableItem tableItem = (TableItem) element;
			final ComponentMappingType p = (ComponentMappingType)tableItem.getData();
			tableViewer.refresh(p);
		}
	}
	
	class ODMappingViewer extends StructuredViewer {

		private ISelection selection;
		
		private final Control control;
		
		public ODMappingViewer(Control control) {
			super();
			this.control = control;
			//this.setInput(model);
		}
		
		@Override
		public Control getControl() {
			return control;
		}

		@Override
		public ISelection getSelection() {
			return selection;
		}

		@Override
		protected void inputChanged(Object input, Object oldInput) {
			
			if (input instanceof ResourceSet) {
				ResourceSet resourceSet = (ResourceSet)input;
				PageResourceImpl pageResrc = (PageResourceImpl)resourceSet.getResources().get(0);
				EList<EObject> eobjects = pageResrc.getContents().get(0).eContents();
				for (EObject obj: eobjects) {
					if (obj instanceof UIEntityType) {
						final UIEntityType page = (UIEntityType)obj;
						init(page);
						return;
					}
				}
			} else if (input instanceof PageResourceImpl) {
				
			}
	    }
		
		@Override
		public void refresh() {
		}

		@Override
		public void setSelection(ISelection selection, boolean reveal) {
			this.selection = selection;
		}

		@Override
		protected Widget doFindInputItem(Object element) {
			return null;
		}

		@Override
		protected Widget doFindItem(Object element) {
			return null;
		}

		@Override
		protected void doUpdateItem(Widget item, Object element, boolean fullMap) {
			
		}

		@Override
		protected List getSelectionFromWidget() {
			return Collections.EMPTY_LIST;
		}

		@Override
		protected void internalRefresh(Object element) {
			
		}

		@Override
		public void reveal(Object element) {
			
		}

		@Override
		protected void setSelectionToWidget(List l, boolean reveal) {
			
		}
	}
}
