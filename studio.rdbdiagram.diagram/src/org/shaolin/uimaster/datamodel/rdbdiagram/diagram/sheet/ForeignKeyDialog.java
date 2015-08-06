package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.sheet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.FKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.PKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

public class ForeignKeyDialog extends TitleAreaDialog {

	protected Object result;

	private Label lblColtype;
	private Label tarColType;
	
	private Combo columnsCbx;
	private Combo tarTableCbx;
	private Combo tarColumnListCbx;
	
	private final TableType table;
	private final FKType fkType;
	
	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ForeignKeyDialog(Shell parent,
			TableType table, FKType fkType) {
		super(parent);
		
		this.table = table;
		this.fkType = fkType;
		//TODO: getBEobject;
		//table.getMapping().getBusinessEntity();
	}

	/**
	 * Create contents of the dialog.
	 */
	protected Control createDialogArea(Composite parent) {
		setMessage("BE<->Table Mapping Dialog");
		parent.setLayout(new GridLayout(1, false));
		
		Group grpTableInfo = new Group(parent, SWT.NONE);
		grpTableInfo.setLayout(new GridLayout(2, false));
		grpTableInfo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpTableInfo.setText("Column Information: <dynamic>");
		
		Label lblColumnList = new Label(grpTableInfo, SWT.NONE);
		lblColumnList.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblColumnList.setText("Column List:");
		
		columnsCbx = new Combo(grpTableInfo, SWT.NONE);
		columnsCbx.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		columnsCbx.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		EList<ColumnType> columns = table.getColumn();
		for (int i=0; i<columns.size(); i++) {
			String columnName = columns.get(i).getName();
			if (!columnName.equals(fkType.getName())
					&& (isFK(columnName) || isPK(columnName))) {
				continue;
			}
			int count = columnsCbx.getItemCount();
			columnsCbx.add(columnName, count);
			if (columnName.equals(fkType.getName())) {
				columnsCbx.select(count);
			}
		}
		
		Label lblMappingType = new Label(grpTableInfo, SWT.NONE);
		lblMappingType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMappingType.setText("Column Type:");
		
		lblColtype = new Label(grpTableInfo, SWT.NONE);
		lblColtype.setText("colType");
		for (int i=0; i<columns.size(); i++) {
			if (fkType.getName() != null 
					&& fkType.getName().equals(columns.get(i).getName())) {
				lblColtype.setText(columns.get(i).getType().getLiteral());
			}
		}
		
		Group grpBeInformation = new Group(parent, SWT.NONE);
		grpBeInformation.setLayout(new GridLayout(2, false));
		grpBeInformation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		String selectedTarTableName = null;
		if (fkType.getRefTable() != null
				&& fkType.getRefTable().getEntityName() != null) {
			selectedTarTableName = fkType.getRefTable().getEntityName();
		}
		if (selectedTarTableName != null ) {
			grpBeInformation.setText("Target Column Info: " 
				+ fkType.getRefTable().getEntityName());
		} else {
			grpBeInformation.setText("Target Column Info: None");
		}
		
		Label lblNewLabel = new Label(grpBeInformation, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("           Table:");
		
		tarTableCbx = new Combo(grpBeInformation, SWT.NONE);
		tarTableCbx.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		tarTableCbx.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tarColumnListCbx.removeAll();
				
				EList<ColumnType> columns = 
						getTargetTable(tarTableCbx.getItem(tarTableCbx.getSelectionIndex())).getColumn();
				for (int i=0; i<columns.size(); i++) {
					tarColumnListCbx.add(columns.get(i).getName(), i);
					if (fkType.getColumnName() != null 
							&& fkType.getColumnName().equals(columns.get(i).getName())) {
						tarColumnListCbx.select(i);
						tarColType.setText(columns.get(i).getType().getLiteral());
					}
				}
			}
		});
		
		int count = 0;
		RDBDiagramType diagram = (RDBDiagramType)table.eContainer();
		EList<TableType> tables = diagram.getTable();
		for (TableType t: tables) {
			if (t.getEntityName().equals(table.getEntityName())) {
				continue;
			}
			tarTableCbx.add(t.getEntityName(), count);
			if (selectedTarTableName != null 
					&& selectedTarTableName.equals(t.getEntityName())) {
				tarTableCbx.select(count);
			}
			count++;
		}
		if (selectedTarTableName == null && tarTableCbx.getItemCount() > 0) {
			selectedTarTableName = tarTableCbx.getItem(0);
		}
		
		Label lblFieldType = new Label(grpBeInformation, SWT.NONE);
		lblFieldType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFieldType.setText("Column List:");
		
		tarColumnListCbx = new Combo(grpBeInformation, SWT.NONE);
		tarColumnListCbx.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		tarColumnListCbx.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String tarTableName = tarTableCbx.getItem(tarTableCbx.getSelectionIndex());
				String tarColumnName = tarColumnListCbx.getItem(tarColumnListCbx.getSelectionIndex());
				ColumnType column = getTargetColumn(tarTableName, tarColumnName);
				tarColType.setText(column.getType().getLiteral());
			}
		});
		String tarColumnType = "";
		if (selectedTarTableName != null) {
			columns = getTargetTable(selectedTarTableName).getColumn();
			for (int i=0; i<columns.size(); i++) {
				ColumnType columnType = columns.get(i);
				tarColumnListCbx.add(columnType.getName(), i);
				if (fkType.getColumnName() != null 
						&& fkType.getColumnName().equals(columnType.getName())) {
					tarColumnListCbx.select(i);
					tarColumnType = columnType.getType().getLiteral();
				}
			}
		}
		
		Label lblColumnType = new Label(grpBeInformation, SWT.NONE);
		lblColumnType.setText("Column Type:");
		
		tarColType = new Label(grpBeInformation, SWT.NONE);
		tarColType.setText(tarColumnType);

		return parent;
	}
	
	private boolean isFK(String columnName) {
		EList<FKType> fks = table.getForeignKey();
		for (FKType fk: fks) {
			if (fk.getName() != null && 
					fk.getName().equals(columnName)) {
				return true;
			}
 		}
		return false;
	}
	
	private boolean isPK(String columnName) {
		EList<PKType> pks = table.getPrimaryKey();
		for (PKType pk: pks) {
			if (pk.getColumnName().equals(columnName)) {
				return true;
			}
 		}
		return false;
	}
	
	private ColumnType getTargetColumn(String tableName, String columnName) {
		RDBDiagramType diagram = (RDBDiagramType)table.eContainer();
		EList<TableType> tables = diagram.getTable();
		for (TableType t: tables) {
			if (t.getEntityName().equals(tableName)){
				EList<ColumnType> columns = t.getColumn();
				for (ColumnType col: columns) {
					if(col.getName().equals(columnName)) {
						return col;
					}
				}
			}
		}
		return null;
	}
	
	private TableType getTargetTable(String tableName) {
		RDBDiagramType diagram = (RDBDiagramType)table.eContainer();
		EList<TableType> tables = diagram.getTable();
		for (TableType t: tables) {
			if (t.getEntityName().equals(tableName)){
				return t;
			}
		}
		return null;
	}
	
	@Override
	protected void okPressed() {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(table);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
		    protected void doExecute() {
				if (tarTableCbx.getSelectionIndex() == -1
						|| columnsCbx.getSelectionIndex() == -1) {
					return;
				}
				
				String localColumnName = columnsCbx.getItem(columnsCbx.getSelectionIndex());
				String tarTableName = tarTableCbx.getItem(tarTableCbx.getSelectionIndex());
				String tarColumnName = tarColumnListCbx.getItem(tarColumnListCbx.getSelectionIndex());
				
				fkType.setName(localColumnName);
				fkType.setRefTable(CommonFactory.eINSTANCE.createTargetEntityType());
				fkType.getRefTable().setEntityName(tarTableName);
				fkType.setColumnName(tarColumnName);
			}
		});
		
		super.okPressed();
	}
}
