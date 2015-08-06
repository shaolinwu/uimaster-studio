package org.shaolin.uimaster.datamodel.pagediagram.diagram.sheet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
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
import org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.PageNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.WebNodeType;

public class ScriptOperationUI extends Composite {
	private Text text;

	private Combo varList;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ScriptOperationUI(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setSize(62, 13);
		lblNewLabel.setText("Variables List");
		
		varList = new Combo(composite, SWT.NONE);
		varList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		varList.setSize(373, 21);
		
		Group grpJavaccScript = new Group(this, SWT.NONE);
		grpJavaccScript.setText("JavaCC Script");
		grpJavaccScript.setLayout(new GridLayout(1, false));
		grpJavaccScript.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(grpJavaccScript, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setMinHeight(150);
		scrolledComposite.setAlwaysShowScrollBars(true);
		GridData gd_scrolledComposite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_scrolledComposite.minimumHeight = 150;
		scrolledComposite.setLayoutData(gd_scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		text = new Text(scrolledComposite, SWT.MULTI);
		scrolledComposite.setContent(text);
		scrolledComposite.setMinSize(new Point(64, 13));
		
		Button btnSave = new Button(this, SWT.NONE);
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				//TODO: javacc parse text.getText()
				
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(node);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
				    @Override
				    protected void doExecute() {
				    	String expr = text.getText();
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

	private WebNodeType node;
	
	public void init(WebNodeType node) {
		this.node = node;
		EList<ParamType> vars = node.getVariables();
		
		varList.removeAll();
		int index = 0;
		for (ParamType p: vars) {
			varList.add(p.getName(), index++);
		}
		
		text.setText("");
		ExpressionType expression = null;
		if (node instanceof LogicNodeType) {
			expression = ((LogicNodeType)node).getOperation();
		} else if (node instanceof PageNodeType) {
			expression = ((PageNodeType)node).getOperation();
		} else if (node instanceof DisplayNodeType) {
			expression = ((DisplayNodeType)node).getOperation();
		}
		if (expression != null && expression.getExpressionString() != null) {
			text.setText(expression.getExpressionString());
		}
	}
}
