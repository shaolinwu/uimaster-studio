package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.sheet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IDoubleClickListener;
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
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.util.BEDiagramResourceFactoryImpl;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.DiagramInfo;
import org.shaolin.uimaster.datamodel.common.SearchDiagramResource;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.util.RDBTypeConverter;

public class ORMappingPropertyUI extends Composite {
	private Text beDiagramTxt;
	private Combo beListCombo;
	private Table mappingTable;
	private TableViewer tableViewer;
	
	private String[] rdbFields;
	
	private TableType table;
	
	private ClassMappingType classMapping;
	
	private FieldMappingType selectedMapping;
	
	private static final Map<String, BEDiagramType> bediagrams 
		= new HashMap<String, BEDiagramType>();
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ORMappingPropertyUI(final Composite parent, int style) {
		super(parent, SWT.EMBEDDED);
		setLayout(new GridLayout(1, true));
		
		
		Composite panel1 = new Composite(this, SWT.NONE);
		panel1.setLayout(new GridLayout(3, false));
		panel1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label beObjectLabel = new Label(panel1, SWT.NONE);
		beObjectLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		beObjectLabel.setText("BE Diagram:");
		
		beDiagramTxt = new Text(panel1, SWT.BORDER);
		beDiagramTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnChoose = new Button(panel1, SWT.NONE);
		btnChoose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				SearchDiagramResource sdDialog = new SearchDiagramResource(
						parent.getShell(), SearchDiagramResource.BEDIAGRAM);
				if (sdDialog.open() == SearchDiagramResource.OK) {
					if (sdDialog.getResult().length == 0){
						return;
					}
					Object obj = sdDialog.getResult()[0];
					if (obj instanceof IFile) {
						IFile file = (IFile)obj;
						final String resKey = loadBEDiagram(file);
						final BEDiagramType beDiagram = bediagrams.get(resKey);
						
						refreshBeUIInfo(beDiagram, beDiagram.getDiagramPackage());
						
						TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(classMapping);
						domain.getCommandStack().execute(new RecordingCommand(domain) {
						    @Override
						    protected void doExecute() {
						    	TargetEntityType beRef = CommonFactory.eINSTANCE.createTargetEntityType();
						    	DiagramInfo info = CommonFactory.eINSTANCE.createDiagramInfo();
						    	info.setEntityName(beDiagram.getDiagramPackage());
						    	info.setLocation(resKey);
						    	beRef.setEntityName(beListCombo.getItem(0));
						    	beRef.setDiagramInfo(info);
						    	
						    	classMapping.setBusinessEntity(beRef);
						    }
						});
					}
				}
			}

		});
		btnChoose.setText("Choose...");
		
		Label lblBeEntity = new Label(panel1, SWT.NONE);
		lblBeEntity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblBeEntity.setText("BE Entity:");
		
		beListCombo = new Combo(panel1, SWT.NONE);
		beListCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		beListCombo.addSelectionListener(new SelectionListener(){
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(classMapping);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
				    @Override
				    protected void doExecute() {
				    	TargetEntityType ref = classMapping.getBusinessEntity();
				    	ref.setEntityName(beListCombo.getItem(beListCombo.getSelectionIndex()));
				    	//TODO: refresh mappings.
				    }
				});
			}
		});
		
		Button btnRefresh = new Button(panel1, SWT.NONE);
		btnRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				TargetEntityType ref = classMapping.getBusinessEntity();
				if (ref == null || ref.getDiagramInfo() == null) {
					return;
				}
				URI uri = URI.createPlatformResourceURI(ref.getDiagramInfo().getLocation(), true);
				IFile file = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(uri.toPlatformString(true)));
				if (file != null) {
					loadBEDiagram(file);
				}
			}
		});
		btnRefresh.setText("Refresh");
		
		TableColumnLayout colLayout = new TableColumnLayout();
		
		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		mappingTable = tableViewer.getTable();
		GridData gd_mappingTable = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_mappingTable.minimumHeight = 100;
		mappingTable.setLayoutData(gd_mappingTable);
		mappingTable.setHeaderVisible(true);
		mappingTable.setLinesVisible(true);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn columnsCol = tableViewerColumn.getColumn();
		columnsCol.setWidth(100);
		columnsCol.setText("Column Name");
		colLayout.setColumnData(columnsCol, new ColumnWeightData(100, ColumnWeightData.MINIMUM_WIDTH, true));
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn fieldsCol = tableViewerColumn_1.getColumn();
		fieldsCol.setWidth(100);
		fieldsCol.setText("BE Field Name");
		colLayout.setColumnData(fieldsCol, new ColumnWeightData(2, ColumnWeightData.MINIMUM_WIDTH, true));
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn dataTypesCol = tableViewerColumn_2.getColumn();
		dataTypesCol.setWidth(300);
		dataTypesCol.setText("Mapping Type");
		colLayout.setColumnData(dataTypesCol, new ColumnWeightData(2, ColumnWeightData.MINIMUM_WIDTH, true));
		
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.add(new Action("Add Field Mapping") {
			public void run() {
				if (classMapping.getBusinessEntity() == null) {
					// show dialog for selecting be entity first.
					MessageDialog.openWarning(parent.getShell(), "", 
							"Please select a BE object at first!");
					return;
				}
				
				final FieldMappingType mapping = 
						RDBDiagramFactory.eINSTANCE.createFieldMappingType();
				ORFieldMappingDialog wd = new ORFieldMappingDialog(parent.getShell(),
											table, mapping, getSelectedBE());
				if (wd.open() == ORFieldMappingDialog.OK) {
					tableViewer.refresh();
				}
			}
		});
		menuMgr.add(new Action("Add List Mapping") {
			public void run() {
				if (classMapping.getBusinessEntity() == null) {
					// show dialog for selecting be entity first.
					MessageDialog.openWarning(parent.getShell(), "", 
							"Please select a BE object at first!");
					return;
				}
				
				final ListFieldMappingType mapping = 
						RDBDiagramFactory.eINSTANCE.createListFieldMappingType();
				ORJoinTableMappingDialog wd = new ORJoinTableMappingDialog(parent.getShell(),
											table, mapping, getSelectedBE());
				if (wd.open() == ORJoinTableMappingDialog.OK) {
					tableViewer.refresh();
				}
			}
		});
		/**
		menuMgr.add(new Action("Add List Mapping") {
			public void run() {
				if (classMapping.getBusinessEntity() == null) {
					// show dialog for selecting be entity first.
					MessageDialog.openWarning(parent.getShell(), "", 
							"Please select a BE object at first!");
					return;
				}
				
				final ListFieldMappingType mapping = 
						RDBDiagramFactory.eINSTANCE.createListFieldMappingType();
				ORListMappingDialog wd = new ORListMappingDialog(parent.getShell(),
											table, mapping, getSelectedBE());
				if (wd.open() == ORFieldMappingDialog.OK) {
					tableViewer.refresh();
				}
			}
		});
		*/
		menuMgr.add(new Action("Remove Mapping") {
			public void run() {
				if (selectedMapping == null) {
					return;
				}
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(classMapping);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
				    @Override
				    protected void doExecute() {
				    	classMapping.getFieldMapping().remove(selectedMapping);
				    	tableViewer.remove(selectedMapping);
				    	tableViewer.refresh();
				    }
				});
			}
		});
		
		final Menu menu = menuMgr.createContextMenu(mappingTable);
		mappingTable.setMenu(menu);
		
		// this code must be placed before all the column viewers.
		tableViewer.setLabelProvider(new TableLabelProvider());
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setCellModifier(new CellModifier());
		tableViewer.setColumnProperties(new String[] {
				"RDBField","BEField","MappingType"
		});
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectedMapping = (FieldMappingType)sel.getFirstElement();
			}
		});
		tableViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (selectedMapping instanceof ListFieldMappingType) {
					ORJoinTableMappingDialog wd = new ORJoinTableMappingDialog(parent.getShell(), 
							table, (ListFieldMappingType)selectedMapping, getSelectedBE());
					if (wd.open() == ORJoinTableMappingDialog.OK) {
						tableViewer.refresh(selectedMapping);
					}
				} else {
					ORFieldMappingDialog wd = new ORFieldMappingDialog(parent.getShell(), 
							table, selectedMapping, getSelectedBE());
					if (wd.open() == ORFieldMappingDialog.OK) {
						tableViewer.refresh(selectedMapping);
					}
				}
			}
		});

	}

	private String loadBEDiagram(IFile file) {
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		final String resKey = uri.toPlatformString(true);
		// always refresh if hits choice button.
		BEDiagramResourceFactoryImpl factory = new BEDiagramResourceFactoryImpl();
		Resource res = factory.createResource(uri);
		try {
			res.load(file.getContents(), null);
			
			EObject eobj = res.getContents().get(0);
			BEDiagramType beDiagram = (BEDiagramType)eobj.eContents().get(0);
			bediagrams.put(resKey, beDiagram);
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (CoreException e1) {
			e1.printStackTrace();
		} finally {
			res.unload();
		}
		return resKey;
	}
	
	private void refreshBeUIInfo(final BEDiagramType beDiagram,
			String diagramName) {
		beDiagramTxt.setText(diagramName);
		beListCombo.removeAll();
		EList<BusinessEntityType> bes = beDiagram.getBeEntity();
		for (BusinessEntityType be: bes) {
			beListCombo.add(beDiagram.getBePackage() + "." + be.getEntityName());
		}
		TargetEntityType ref = classMapping.getBusinessEntity();
		if (ref != null && ref.getEntityName() != null) {
			int count = 0;
			for(String item: beListCombo.getItems()) {
				if (item.equals(ref.getEntityName())) {
					beListCombo.select(count);
					break;
				}
				count++;
			}
		} else {
			beListCombo.select(0);
		}
	}
	
	private String[] getRDBFields(TableType table) {
		String[] cols = new String[table.getColumn().size()];
		for (int i = 0; i < cols.length; i ++) {
			cols[i] = table.getColumn().get(i).getName();
		}
		return cols;
	}
	
	private int getRDBFieldIndex(String fieldName) {
		if (fieldName == null || fieldName.isEmpty()) {
			return -1;
		}
		for (int i = 0; i < rdbFields.length; i ++) {
			if (fieldName.equals(rdbFields[i])) {
				return i;
			}
		}
		return -1;
	}
	
	private int getMappingTypeIndex(String fieldName) {
		if (fieldName == null || fieldName.isEmpty()) {
			return -1;
		}
		String[] types = RDBTypeConverter.getAllTypes();
		for (int i = 0; i < types.length; i ++) {
			if (fieldName.equals(types[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public void init(TableType table) {
		this.table = table;
		this.classMapping = table.getMapping();
		TargetEntityType ref = classMapping.getBusinessEntity();
		if (ref != null) {
			if (ref.getDiagramInfo() != null
					&& ref.getDiagramInfo().getLocation() != null
					&& !bediagrams.containsKey(ref.getDiagramInfo().getLocation())) {
				URI uri = URI.createPlatformResourceURI(ref.getDiagramInfo().getLocation(), true);
				IFile file = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(uri.toPlatformString(true)));
				if (file != null) {
					loadBEDiagram(file);
				}
			}
			BEDiagramType beDiagram = bediagrams.get(ref.getDiagramInfo().getLocation());
			if (beDiagram != null) {
				refreshBeUIInfo(beDiagram, beDiagram.getDiagramPackage());
			}
		} else {
			beDiagramTxt.setText("");
			beListCombo.removeAll();
		}
		this.rdbFields = getRDBFields(table);
		this.tableViewer.setInput(classMapping);
		this.tableViewer.setCellEditors(new CellEditor[] {
				null,
				null,
				null
		});
	}
	
	public void addMapping(FieldMappingType mapping) {
		this.tableViewer.add(mapping);
		this.tableViewer.refresh();
	}
	
	public void removeMapping(FieldMappingType mapping) {
		this.tableViewer.remove(mapping);
		this.tableViewer.refresh();
	}
	
	private BusinessEntityType getSelectedBE() {
		String selectedBE = beListCombo.getItem(beListCombo.getSelectionIndex());
		String key = classMapping.getBusinessEntity().getDiagramInfo().getLocation();
		BEDiagramType beDiagram = bediagrams.get(key);
		EList<BusinessEntityType> bes = beDiagram.getBeEntity();
		for (BusinessEntityType be: bes) {
			if (selectedBE.equals(beDiagram.getBePackage() +"."+ be.getEntityName())) {
				return be;
			}
		}
		return null;
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
			
			FieldMappingType p = (FieldMappingType) element;
			if (p instanceof FieldMappingType) {
				switch(columnIndex) {
				case 0:
					result = p.getColumnName();
					break;
				case 1:
					result = p.getBeFieldName();
					break;
				case 2:
					result = p.getClass().getName();
					break;
				}
			} 
			
			return result;
		}
	}
	
	private class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			ClassMappingType w = (ClassMappingType) inputElement;
			return w.getFieldMapping().toArray();
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}
	
	private class CellModifier implements ICellModifier {

		@Override
		public boolean canModify(Object element, String property) {
			return false;
		}

		@Override
		public Object getValue(Object element, String property) {
			//"RDBField","BEField","MappingType"
			if ("MappingType".equals(property)) {
				FieldMappingType mapping = (FieldMappingType)element;
				return getMappingTypeIndex(mapping.getClass().getName());
			}
			
			if (element instanceof FieldMappingType) {
			    FieldMappingType element2 = (FieldMappingType)element;
				if ("RDBField".equals(property)) {
					return getRDBFieldIndex(element2.getColumnName());
				}
				if ("BEField".equals(property)) {
					return element2.getBeFieldName();
				}
			} 
			return null;
		}

		@Override
		public void modify(Object element, String property, Object value) {
			TableItem tableItem = (TableItem) element;
			final FieldMappingType p = (FieldMappingType)tableItem.getData();
			tableViewer.refresh(p);
		}
	}
	
}
