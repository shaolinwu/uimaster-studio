package org.shaolin.uimaster.datamodel.page.presentation;

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
import org.shaolin.uimaster.datamodel.page.DirectComponentMappingType;

public class ODDirectMappingDialog extends TitleAreaDialog {

	protected Object result;

	private Label lblColtype;
	private Label lblFieldtype;
	private Combo beFieldsCbx;
	
	private final DirectComponentMappingType mapping;
	
	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ODDirectMappingDialog(Shell parent, DirectComponentMappingType mapping) {
		super(parent);
		this.mapping = mapping;
	}

	/**
	 * Create contents of the dialog.
	 */
	protected Control createDialogArea(Composite parent) {
		setMessage("BE<->Table Mapping Dialog");
		parent.setLayout(new GridLayout(1, false));
		
		Group grpBeInformation = new Group(parent, SWT.NONE);
		grpBeInformation.setLayout(new GridLayout(2, false));
		grpBeInformation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpBeInformation.setText("BE Information: ");
		
		Label lblNewLabel = new Label(grpBeInformation, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("               Field:");
		
		beFieldsCbx = new Combo(grpBeInformation, SWT.NONE);
		beFieldsCbx.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		beFieldsCbx.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		
		Label lblFieldType = new Label(grpBeInformation, SWT.NONE);
		lblFieldType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFieldType.setText("Field Type:");
		
		lblFieldtype = new Label(grpBeInformation, SWT.NONE);
		lblFieldtype.setText("fieldType");
		//TODO:
		
		Group grpTableInfo = new Group(parent, SWT.NONE);
		grpTableInfo.setLayout(new GridLayout(2, false));
		grpTableInfo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpTableInfo.setText("Table Information: ");
		
		Label lblColumnList = new Label(grpTableInfo, SWT.NONE);
		lblColumnList.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblColumnList.setText("Column List:");
		new Label(grpTableInfo, SWT.NONE);
		
		Label lblMappingType = new Label(grpTableInfo, SWT.NONE);
		lblMappingType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMappingType.setText("Column Type:");
		
		lblColtype = new Label(grpTableInfo, SWT.NONE);
		lblColtype.setText("colType");
		
		Label lblColumnType = new Label(grpTableInfo, SWT.NONE);
		lblColumnType.setText("Mapping Type:");
		new Label(grpTableInfo, SWT.NONE);
		
		Label lblAssociation = new Label(grpTableInfo, SWT.NONE);
		lblAssociation.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblAssociation.setText("Association:");
		new Label(grpTableInfo, SWT.NONE);
		
		return parent;
	}
	
	
	@Override
	protected void okPressed() {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(mapping);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
		    protected void doExecute() {
//				String columnName = columnsCbx.getItem(columnsCbx.getSelectionIndex());
//				String beName = beFieldsCbx.getItem(beFieldsCbx.getSelectionIndex());
//				String mappingType = mappingsCbx.getItem(mappingsCbx.getSelectionIndex());
			}
		});
		
		super.okPressed();
	}
}
