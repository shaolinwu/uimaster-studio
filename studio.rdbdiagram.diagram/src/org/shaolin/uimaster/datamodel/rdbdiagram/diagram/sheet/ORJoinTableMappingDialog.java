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
import org.shaolin.uimaster.datamodel.bediagram.BEListType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

public class ORJoinTableMappingDialog extends TitleAreaDialog {

	protected Object result;

	private Group grpTableInfo;
	private Label lblFieldtype;
	private List jtablesCbx;
	private List beFieldsCbx;
	
	private final TableType table;
	private ListFieldMappingType mapping;
	private final BusinessEntityType be;
	
	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ORJoinTableMappingDialog(Shell parent,
			TableType table, ListFieldMappingType mapping, BusinessEntityType be) {
		super(parent);
		
		this.table = table;
		this.mapping = mapping;
		this.be = be;
	}

	/**
	 * Create contents of the dialog.
	 */
	protected Control createDialogArea(Composite parent) {
		setMessage("BE<->Table Join Mapping Dialog");
		parent.setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		composite.setLayout(new GridLayout(2, false));
		
		Group grpBeInformation = new Group(composite, SWT.NONE);
		grpBeInformation.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpBeInformation.setLayout(new GridLayout(2, false));
		grpBeInformation.setText("BE Information: " + be.getEntityName());
		
		Label lblNewLabel = new Label(grpBeInformation, SWT.NONE);
		lblNewLabel.setText("List Type Fields:");
		
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
		lblFieldtype.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblFieldtype.setText("fieldType");
		lblFieldtype.setSize(0, 13);
		
		grpTableInfo = new Group(composite, SWT.NONE);
		grpTableInfo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpTableInfo.setLayout(new GridLayout(2, false));
		grpTableInfo.setText("Table Information: " + table.getEntityName());
		
		Label lblColumnList = new Label(grpTableInfo, SWT.NONE);
		lblColumnList.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblColumnList.setText("Join Tables:");
		
		jtablesCbx = new List(grpTableInfo, SWT.BORDER | SWT.V_SCROLL);
		jtablesCbx.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		GridData gd_columnsCbx = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_columnsCbx.heightHint = 100;
		jtablesCbx.setLayoutData(gd_columnsCbx);
		
		initData();
		
		return parent;
	}
	
	private void initData() {
		RDBDiagramType rbdDiagram = (RDBDiagramType)table.eContainer();
		for (JoinTableType jt: rbdDiagram.getJoinTable()) {
			jtablesCbx.add(jt.getName());
			if (mapping.getAssociationName() != null
					&& jt.getName().equals(mapping.getAssociationName())) {
				jtablesCbx.select(jtablesCbx.getItemCount() - 1);
			}
		}
		
		EList<MemberType> members = be.getMember();
		for (int i=0; i<members.size(); i++) {
			MemberType member = members.get(i);
			if (!(member.getType() instanceof BEListType)) {
				continue;
			}
			
			beFieldsCbx.add(member.getName());
			if (mapping.getBeFieldName() != null
					&& mapping.getBeFieldName().equals(member.getName())) {
				beFieldsCbx.select(beFieldsCbx.getItemCount()-1);
			}
		}
		MemberType m = getMember(mapping.getBeFieldName());
		if (m != null) {
			lblFieldtype.setText(m.getType().getClass().getSimpleName());
		}
	}
	
	private JoinTableType getJoinTable(String name) {
		RDBDiagramType rbdDiagram = (RDBDiagramType)table.eContainer();
		for (JoinTableType t: rbdDiagram.getJoinTable()) {
			if (t.getName().equals(name)) {
				return t;
			}
			
		}
		return null;
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
	
	@Override
	protected void okPressed() {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(table);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
		    protected void doExecute() {
				if (jtablesCbx.getSelectionIndex() == -1 
						|| beFieldsCbx.getSelectionIndex() == -1) {
					setMessage("Both BE and Table fields must be selected.");
					return;
				}
				
//				JoinTableType jtable = getJoinTable(jtableName);
				String jtableName = jtablesCbx.getItem(jtablesCbx.getSelectionIndex());
				String beFieldName = beFieldsCbx.getItem(beFieldsCbx.getSelectionIndex());
				mapping.setBeFieldName(beFieldName);
				mapping.setAssociationName(jtableName);
				mapping.setMappingType(MappingTypeType.ONE_TO_MANY);
				mapping.setCollectionTable(CommonFactory.eINSTANCE.createTargetEntityType());
			
				String targetMappingBE = "";
				java.util.List<MemberType> members = be.getMember();
				for (MemberType m : members) {
					if (m.getName().equals(beFieldName)) {
						BEListType listType = (BEListType)m.getType();
						targetMappingBE = ((BEObjRefType)listType.getElementType())
												.getTargetEntity().getEntityName();
						break;
					}
				}
				mapping.getCollectionTable().setEntityName(targetMappingBE);
				
				
				if (!table.getMapping().getFieldMapping().contains(mapping)) {
					table.getMapping().getFieldMapping().add(mapping);
				}
			}
		});
		
		super.okPressed();
	}
}
