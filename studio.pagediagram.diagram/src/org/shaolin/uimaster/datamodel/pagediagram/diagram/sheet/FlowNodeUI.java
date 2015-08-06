package org.shaolin.uimaster.datamodel.pagediagram.diagram.sheet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.ExpressionType;
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.PageNodeType;

public class FlowNodeUI extends Composite {

	private FlowNodeType node;
	
	private Combo localVarList;
	
	private Text flowName;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public FlowNodeUI(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite.setLayout(new GridLayout(1, false));
		
		Group grpFlowInfo = new Group(composite, SWT.NONE);
		grpFlowInfo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpFlowInfo.setText("Flow Info");
		grpFlowInfo.setLayout(new GridLayout(2, false));
		
		Label lblFlow = new Label(grpFlowInfo, SWT.NONE);
		lblFlow.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFlow.setText("Flow: ");
		
		flowName = new Text(grpFlowInfo, SWT.BORDER);
		flowName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNode = new Label(grpFlowInfo, SWT.NONE);
		lblNode.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNode.setText("Node:");
		
		Combo flowNodeList = new Combo(grpFlowInfo, SWT.NONE);
		flowNodeList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Group grpVariablesMapping = new Group(composite, SWT.NONE);
		grpVariablesMapping.setText("Variables Mapping");
		grpVariablesMapping.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		grpVariablesMapping.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(grpVariablesMapping, SWT.NONE);
		lblNewLabel.setText("Local Variables List:");
		
		localVarList = new Combo(grpVariablesMapping, SWT.NONE);
		localVarList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblFlowVariablesList = new Label(grpVariablesMapping, SWT.NONE);
		lblFlowVariablesList.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFlowVariablesList.setText("Flow Variables List:");
		
		Combo flowVarList = new Combo(grpVariablesMapping, SWT.NONE);
		flowVarList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNodeVariablesList = new Label(grpVariablesMapping, SWT.NONE);
		lblNodeVariablesList.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNodeVariablesList.setText("Node Variables List");
		
		Combo nodeVarList = new Combo(grpVariablesMapping, SWT.NONE);
		nodeVarList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnSave = new Button(this, SWT.NONE);
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				//TODO: javacc parse text.getText()
				
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(node);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
				    @Override
				    protected void doExecute() {
				    	String expr = flowName.getText();
						ExpressionType createExpressionType = CommonFactory.eINSTANCE.createExpressionType();
						if (node instanceof LogicNodeType) {
							((LogicNodeType)node).setOperation(createExpressionType);
							((LogicNodeType)node).getOperation().setExpressionString(expr);
						} else if (node instanceof PageNodeType) {
							((PageNodeType)node).setOperation(createExpressionType);
							((PageNodeType)node).getOperation().setExpressionString(expr);
						} else if (node instanceof DisplayNodeType) {
							((DisplayNodeType)node).setOperation(createExpressionType);
							((DisplayNodeType)node).getOperation().setExpressionString(expr);
						}
				    }
				});
			}
		});
		btnSave.setText("Save");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public void init(FlowNodeType node) {
		this.node = node;
		
		if (node.getDestChunkName() != null) {
			this.flowName.setText(node.getDestChunkName().getEntityName());
		}
		
		EList<ParamType> vars = node.getVariables();
		localVarList.removeAll();
		int index = 0;
		for (ParamType p: vars) {
			localVarList.add(p.getName(), index++);
		}
	}
}
