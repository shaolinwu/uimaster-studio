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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.shaolin.uimaster.datamodel.bediagram.BECollectionType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

public class ORFieldMappingDialog extends TitleAreaDialog {

	protected Object result;

	private Label lblColtype;
	private Label lblFieldtype;
	
	private List columnsCbx;
	private List beFieldsCbx;
	
	private final TableType table;
	private FieldMappingType mapping;
	private final BusinessEntityType be;
	
	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ORFieldMappingDialog(Shell parent,
			TableType table, FieldMappingType mapping, BusinessEntityType be) {
		super(parent);
		
		this.table = table;
		this.mapping = mapping;
		this.be = be;
	}

	/**
	 * Create contents of the dialog.
	 */
	protected Control createDialogArea(Composite parent) {
		setMessage("BE<->Table Field Mapping Dialog");
		parent.setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		composite.setLayout(new GridLayout(2, false));
		
		Group grpBeInformation = new Group(composite, SWT.NONE);
		grpBeInformation.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpBeInformation.setLayout(new GridLayout(2, false));
		grpBeInformation.setText("BE Information: " + be.getEntityName());
		
		Label lblNewLabel = new Label(grpBeInformation, SWT.NONE);
		lblNewLabel.setText("Primitive Fields:");
		
		beFieldsCbx = new List(grpBeInformation, SWT.BORDER | SWT.V_SCROLL);
		GridData gd_beFieldsCbx = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		gd_beFieldsCbx.heightHint = 100;
		beFieldsCbx.setLayoutData(gd_beFieldsCbx);
		beFieldsCbx.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MemberType m = getMember(beFieldsCbx.getItem(beFieldsCbx.getSelectionIndex()));
				if (m != null) {
					lblFieldtype.setText(m.getType().getClass().getSimpleName());
				}
			}
		});
		
		Label lblFieldType = new Label(grpBeInformation, SWT.NONE);
		lblFieldType.setText("Field Type:");
		
		lblFieldtype = new Label(grpBeInformation, SWT.NONE);
		lblFieldtype.setSize(0, 13);
		
		Group grpTableInfo = new Group(composite, SWT.NONE);
		grpTableInfo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpTableInfo.setLayout(new GridLayout(2, false));
		grpTableInfo.setText("Table Information: " + table.getEntityName());
		
		Label lblColumnList = new Label(grpTableInfo, SWT.NONE);
		lblColumnList.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblColumnList.setText("Column List:");
		
		columnsCbx = new List(grpTableInfo, SWT.BORDER | SWT.V_SCROLL);
		columnsCbx.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ColumnType coulmn = getColumn(columnsCbx.getItem(columnsCbx.getSelectionIndex()));
				lblColtype.setText(coulmn.getType().getLiteral());
			}
		});
		GridData gd_columnsCbx = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		gd_columnsCbx.heightHint = 100;
		columnsCbx.setLayoutData(gd_columnsCbx);
		
		Label lblMappingType = new Label(grpTableInfo, SWT.NONE);
		lblMappingType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMappingType.setText("Column Type:");
		
		lblColtype = new Label(grpTableInfo, SWT.NONE);
		lblColtype.setText("colType");
		EList<MemberType> members = be.getMember();
		for (int i=0; i<members.size(); i++) {
			MemberType member = members.get(i);
			if ((member.getType() instanceof BECollectionType)) {
				continue;
			}
			
			beFieldsCbx.add(member.getName());
			if (mapping.getBeFieldName() != null
					&& mapping.getBeFieldName().equals(member.getName())) {
				beFieldsCbx.select(beFieldsCbx.getItemCount() - 1);
			}
		}
		MemberType m = getMember(mapping.getBeFieldName());
		if (m != null) {
			lblFieldtype.setText(m.getType().getClass().getSimpleName());
		}
		EList<ColumnType> columns = table.getColumn();
		for (int i=0; i<columns.size(); i++) {
			columnsCbx.add(columns.get(i).getName(), i);
			if (mapping.getColumnName() != null 
					&& mapping.getColumnName().equals(columns.get(i).getName())) {
				columnsCbx.select(i);
			}
		}
		for (int i=0; i<columns.size(); i++) {
			if (mapping.getColumnName() != null 
					&& mapping.getColumnName().equals(columns.get(i).getName())) {
				lblColtype.setText(columns.get(i).getType().getLiteral());
			}
		}
		
		return parent;
	}
	
	private MemberType getMember(String fileName) {
		EList<MemberType> members = be.getMember();
		for (MemberType m : members) {
			if (m.getName().equals(fileName)) {
				return m;
			}
		}
		return null;
	}
	
	private ColumnType getColumn(String columnName) {
		EList<ColumnType> columns = table.getColumn();
		for (ColumnType col: columns) {
			if(col.getName().equals(columnName)) {
				return col;
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
				if (columnsCbx.getSelectionIndex() == -1 
						|| beFieldsCbx.getSelectionIndex() == -1) {
					setMessage("Both BE and Table fields must be selected.");
					return;
				}
				
				String columnName = columnsCbx.getItem(columnsCbx.getSelectionIndex());
				String beName = beFieldsCbx.getItem(beFieldsCbx.getSelectionIndex());
				mapping.setBeFieldName(beName);
				mapping.setColumnName(columnName);
				mapping.setAssociationName("oto_"+ beName + "_" + columnName);
				
				if (!table.getMapping().getFieldMapping().contains(mapping)) {
					table.getMapping().getFieldMapping().add(mapping);
				}
			}
		});
		
		super.okPressed();
	}
}
