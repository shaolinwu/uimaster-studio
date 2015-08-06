package org.shaolin.uimaster.datamodel.pagediagram.diagram.sheet;

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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.NameExpressionType;
import org.shaolin.uimaster.datamodel.common.ParamScopeType;
import org.shaolin.uimaster.datamodel.common.ParamType;

public class VarMappingDialog extends TitleAreaDialog {

	protected Object result;
	private Text scriptText;
	private Combo srcVarList;
	private Combo tarVarList;
	
	private Button btnVariableMapping;
	
	private EList<ParamType> srcVars;
	private EList<ParamType> tarVars;
	
	private NameExpressionType selectedVar;
	
	/**
	 * Create the dialog.
	 * @param parent
	 */
	public VarMappingDialog(Shell parent) {
		super(parent);
		this.setTitle("Variable Mapping Dialog");
	}

	public void setSrcVars(EList<ParamType> srcVars) {
		this.srcVars = srcVars;
	}

	public void setTarVars(EList<ParamType> tarVars) {
		this.tarVars = tarVars;
	}
	
	public void setSelectedVar(NameExpressionType selectedVar) {
		this.selectedVar = selectedVar;
	}
	
	/**
	 * Create contents of the dialog.
	 */
	protected Control createDialogArea(Composite parent) {
		setMessage("Variable Mapping Dialog");
		parent.setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite.setLayout(new GridLayout(2, false));
		
		Label lblTargetNodeInput = new Label(composite, SWT.NONE);
		lblTargetNodeInput.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTargetNodeInput.setText("Input Variable of Target Node:");
		
		tarVarList = new Combo(composite, SWT.NONE);
		tarVarList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		int index = 0;
		for (int i = 0; i < tarVars.size(); i++) {
			ParamType paramType = tarVars.get(i);
			if (paramType.getScope() == ParamScopeType.INTERNAL
					|| paramType.getScope() == ParamScopeType.OUT) {
				continue;
			}
			
			tarVarList.add(paramType.getName(), index);
			if (selectedVar.getName() != null
					&& selectedVar.getName().equals(paramType.getName())) {
				tarVarList.select(index);
			}
			index++;
		}
		
		Group grpMappingOperations = new Group(parent, SWT.NONE);
		grpMappingOperations.setLayout(new GridLayout(2, false));
		grpMappingOperations.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpMappingOperations.setText("Mapping Operations:");
		
		btnVariableMapping = new Button(grpMappingOperations, SWT.RADIO);
		btnVariableMapping.setSelection(true);
		btnVariableMapping.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				srcVarList.setEnabled(true);
				scriptText.setEnabled(false);
				scriptText.setEditable(false);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				scriptText.setEnabled(false);
			}
		});
		btnVariableMapping.setText("Variable Mapping:");
		
		srcVarList = new Combo(grpMappingOperations, SWT.NONE);
		srcVarList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		index = 0;
		for (int i = 0; i < srcVars.size(); i++) {
			ParamType paramType = srcVars.get(i);
			if (paramType.getScope() == ParamScopeType.INTERNAL
					|| paramType.getScope() == ParamScopeType.IN) {
				continue;
			}
			
			srcVarList.add(paramType.getName(), index);
			if (selectedVar.getName() != null
					&& selectedVar.getExpression() != null
					&& selectedVar.getExpression().getExpressionString().equals(paramType.getName())) {
				srcVarList.select(index);
			}
			index++;
		}
		
		Button btnJavaccScript = new Button(grpMappingOperations, SWT.RADIO);
		btnJavaccScript.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				srcVarList.setEnabled(false);
				scriptText.setEnabled(true);
				scriptText.setEditable(true);
			}
		});
		btnJavaccScript.setText("JavaCC Script:");
		
		scriptText = new Text(grpMappingOperations, SWT.MULTI);
		GridData gd_text = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_text.minimumHeight = 100;
		scriptText.setLayoutData(gd_text);
		if (srcVarList.getSelectionIndex() == -1 && selectedVar.getExpression() != null) {
			scriptText.setText(selectedVar.getExpression().getExpressionString());

			btnVariableMapping.setSelection(false);
			btnJavaccScript.setSelection(true);
		}
		
		return composite;
	}

	@Override
	protected void okPressed() {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(selectedVar);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
		    protected void doExecute() {
				selectedVar.setName(tarVarList.getItem(tarVarList.getSelectionIndex()));
				selectedVar.setExpression(CommonFactory.eINSTANCE.createExpressionType());
				if (btnVariableMapping.getSelection()) {
					String varName = srcVarList.getItem(srcVarList.getSelectionIndex());
					selectedVar.getExpression().setExpressionString(varName);
				} else {
					selectedVar.getExpression().setExpressionString(scriptText.getText());
				}
			}
		});
		
		super.okPressed();
	}
	
}
