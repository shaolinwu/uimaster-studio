package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.sheet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.CellEditor;
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.FKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

public class ForeignKeyPropertyUI extends Composite {
	
	private TableType table;
	
	private TableViewer tableViewer;
	
	private Table table_1;
	
	private FKType selectedFK;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ForeignKeyPropertyUI(final Composite parent, int style) {
		super(parent, SWT.EMBEDDED);
		setLayout(new GridLayout(1, false));
		
		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		table_1 = tableViewer.getTable();
		table_1.setLinesVisible(true);
		table_1.setHeaderVisible(true);
		GridData gd_table_1 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_table_1.minimumHeight = 150;
		table_1.setLayoutData(gd_table_1);
		
		TableColumn tblclmnColumn_1 = new TableColumn(table_1, SWT.NONE);
		tblclmnColumn_1.setWidth(100);
		tblclmnColumn_1.setText("Column");
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnTableName = tableViewerColumn.getColumn();
		tblclmnTableName.setWidth(150);
		tblclmnTableName.setText("Target Table Name");
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnColumn = tableViewerColumn_1.getColumn();
		tblclmnColumn.setWidth(150);
		tblclmnColumn.setText("Target Table's Column Name");
		
		tableViewer.setLabelProvider(new TableLabelProvider());
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setCellModifier(new CellModifier());
		tableViewer.setColumnProperties(new String[] {
				"ColName", "TableName", "ColumnName"
		});
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectedFK = (FKType)sel.getFirstElement();
			}
		});
		tableViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				ForeignKeyDialog wd = new ForeignKeyDialog(parent.getShell(), table, selectedFK);
				if (wd.open() == ForeignKeyDialog.OK) {
					tableViewer.refresh(selectedFK);
				}
			}
		});
		
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.add(new Action("Add Mapping") {
			public void run() {
				final FKType mapping = RDBDiagramFactory.eINSTANCE.createFKType();
				mapping.setRefTable(CommonFactory.eINSTANCE.createTargetEntityType());
				
				ForeignKeyDialog wd = new ForeignKeyDialog(parent.getShell(), table, mapping);
				if (wd.open() == ForeignKeyDialog.OK) {
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(table);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
					    @Override
					    protected void doExecute() {
					    	table.getForeignKey().add(mapping);
						}
					});
					tableViewer.add(mapping);
					tableViewer.refresh();
				}
			}
		});
		menuMgr.add(new Action("Remove Mapping") {
			public void run() {
				if (selectedFK == null) {
					return;
				}
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(table);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
				    @Override
				    protected void doExecute() {
				    	table.getForeignKey().remove(selectedFK);
				    	
				    	tableViewer.remove(selectedFK);
				    	tableViewer.refresh();
				    }
				});
			}
		});
		final Menu menu = menuMgr.createContextMenu(table_1);
		table_1.setMenu(menu);
	}
	
	public void init(TableType table) {
		this.table = table;
		
		this.tableViewer.setInput(table.getForeignKey());
		this.tableViewer.setCellEditors(new CellEditor[] {
				null, null, null});
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
			
			FKType p = (FKType) element;
			switch(columnIndex) {
			case 0:
				result = p.getName();
				break;
			case 1:
				result = p.getRefTable() != null?p.getRefTable().getEntityName():"";
				break;
			case 2:
				result = p.getColumnName();
				break;
			}
			
			return result;
		}
	}
	
	private class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			EList<FKType> w = (EList<FKType>) inputElement;
			FKType[] fks = new FKType[w.size()];
			w.toArray(fks);
			return fks;
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
			//"ColName", "TableName", "ColumnName"
			FKType p = (FKType) element;
			if ("ColName".equals(property)) {
				return p.getName();
			} else if ("TableName".equals(property)) {
				return p.getRefTable() != null?p.getRefTable().getEntityName():"";
			} else if ("ColumnName".equals(property)) {
				return p.getColumnName();
			} 
			
			return null;
		}

		@Override
		public void modify(Object element, String property, Object value) {
			TableItem tableItem = (TableItem) element;
			final FKType p = (FKType)tableItem.getData();
			tableViewer.refresh(p);
		}
		
	}
	
}
