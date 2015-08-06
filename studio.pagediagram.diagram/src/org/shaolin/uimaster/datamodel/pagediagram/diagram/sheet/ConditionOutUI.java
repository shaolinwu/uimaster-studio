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
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType;
import org.shaolin.uimaster.datamodel.pagediagram.WebNodeType;

public class ConditionOutUI extends Composite {

	private ConditionalOutType connection;
	private Text exprText;
	private Combo varList;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ConditionOutUI(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite.setLayout(new GridLayout(1, false));
		
		Group grpFlowInfo = new Group(composite, SWT.NONE);
		grpFlowInfo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpFlowInfo.setText("Condition Info");
		grpFlowInfo.setLayout(new GridLayout(2, false));
		
		Label lblFlow = new Label(grpFlowInfo, SWT.NONE);
		lblFlow.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFlow.setText("Available Vars: ");
		
		varList = new Combo(grpFlowInfo, SWT.NONE);
		varList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNode = new Label(grpFlowInfo, SWT.NONE);
		lblNode.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNode.setText("JavaCC Expression: ");
		
		exprText = new Text(grpFlowInfo, SWT.MULTI);
		GridData gd_exprText = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		gd_exprText.minimumHeight = 100;
		exprText.setLayoutData(gd_exprText);
		
		Button btnSave = new Button(this, SWT.NONE);
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				//TODO: javacc parse text.getText()
				
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(connection);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
				    @Override
				    protected void doExecute() {
				    	connection.setConditionExpression(CommonFactory.eINSTANCE.createExpressionType());
				    	connection.getConditionExpression().setExpressionString(exprText.getText());
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

	public void init(ConditionalOutType connection) {
		this.connection = connection;

		WebNodeType node = (WebNodeType) connection.eContainer();
		EList<ParamType> vars = node.getVariables();
		varList.removeAll();
		int index = 0;
		for (ParamType p : vars) {
			varList.add(p.getName(), index++);
		}
		
		if (connection.getConditionExpression() != null) {
			exprText.setText(connection.getConditionExpression().getExpressionString());
		}
	}
}
