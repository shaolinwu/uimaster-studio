package org.shaolin.uimaster.datamodel.page.presentation;

import java.util.Collections;
import java.util.List;
import java.util.Map;

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
import org.eclipse.swt.widgets.Text;
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.page.SimpleComponentMappingType;
import org.shaolin.uimaster.datamodel.page.UIEntityType;
import org.shaolin.uimaster.datamodel.page.UIPageType;
import org.shaolin.uimaster.datamodel.page.UIPanelType;
import org.shaolin.uimaster.datamodel.page.util.UIComponentHelper;

public class ODSimpleMappingDialog extends TitleAreaDialog {

	protected Object result;
	
	private final SimpleComponentMappingType mapping;
	
	private final UIPageType page;
	
	private Group grpRuleParameters;
	
	private String ruleName = "";
	
	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ODSimpleMappingDialog(Shell parent, SimpleComponentMappingType mapping) {
		super(parent);
		this.mapping = mapping;
		this.page = (UIPageType)mapping.eContainer().eContainer();
		if (mapping.getMappingRule() != null) {
			this.ruleName = mapping.getMappingRule().getEntityName();
		}
	}

	/**
	 * Create contents of the dialog.
	 */
	protected Control createDialogArea(Composite parent) {
		setMessage("Simple Data Mapping");
		parent.setLayout(new GridLayout(1, false));
		
		Group groupPanel = new Group(parent, SWT.NONE);
		groupPanel.setLayout(new GridLayout(2, false));
		groupPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		groupPanel.setText("Mapping Information: ");
		
		Label lblUiComponent = new Label(groupPanel, SWT.NONE);
		lblUiComponent.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUiComponent.setText("UI Component: ");
		
		Combo uiComponentList = new Combo(groupPanel, SWT.NONE);
		uiComponentList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		List<String> uiids = UIComponentHelper.fetchPanelElementsUIID(
				(UIPanelType)((UIEntityType)page.getUIEntity()).getBody());
		for (int i=0; i<uiids.size(); i++) {
			uiComponentList.add(uiids.get(i));
		}
		
		Label lblMappingRule = new Label(groupPanel, SWT.NONE);
		lblMappingRule.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMappingRule.setText("Mapping Rule:");
		
		final Combo ruleList = new Combo(groupPanel, SWT.NONE);
		ruleList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		ruleList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ruleName = ruleList.getItem(ruleList.getSelectionIndex());
				createRuleParameters();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				if (ruleName != null && !ruleName.isEmpty()) {
					//TODO:
				}
				createRuleParameters();
			}
		});
		
		new Label(groupPanel, SWT.NONE);
		List<String> rules = UIComponentHelper.getAllRuleNames();
		for (int i=0; i<rules.size(); i++) {
			ruleList.add(rules.get(i));
		}
		
		grpRuleParameters = new Group(groupPanel, SWT.NONE);
		grpRuleParameters.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		grpRuleParameters.setText("Rule Parameters:");
		grpRuleParameters.setLayout(new GridLayout(1, false));
		
		createRuleParameters();
		return parent;
	}
	
	private void createRuleParameters() {
		Control[] controls = grpRuleParameters.getChildren();
		for (Control c: controls) {
			c.dispose();
		}
		
		Composite composite = new Composite(grpRuleParameters, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite.setLayout(new GridLayout(3, false));
		
		Label parameterName = new Label(composite, SWT.NONE);
		parameterName.setText("New Label");
		
		final Text paramExpression = new Text(composite, SWT.BORDER);
		paramExpression.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Combo varList = new Combo(composite, SWT.NONE);
		varList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				paramExpression.setText("");
			}
		});
		EList<ParamType> vars = page.getODMapping().getDataEntity();
		for (int i=0; i<vars.size(); i++) {
			varList.add(vars.get(i).getName());
		}
	}
	
	private Map<String, Object> getAllParameterValues() {
		Control[] controls = grpRuleParameters.getChildren();
		for (Control c: controls) {
			Control[] subs = ((Composite)c).getChildren();
			((Label)subs[0]).getText();
			((Text)subs[1]).getText();
		}
		return Collections.emptyMap();
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
