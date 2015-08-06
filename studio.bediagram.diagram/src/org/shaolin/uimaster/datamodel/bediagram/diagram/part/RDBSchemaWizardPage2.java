package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl;
import org.shaolin.uimaster.wb.rcp.databinding.BeansListObservableFactory;
import org.shaolin.uimaster.wb.rcp.databinding.TreeBeanAdvisor;
import org.shaolin.uimaster.wb.rcp.databinding.TreeObservableLabelProvider;

public class RDBSchemaWizardPage2 extends WizardPage {

	private CheckboxTreeViewer checkboxTreeViewer;
	
	private RDBDiagramType diagramType;
	private Text rdbEntityNameTxt;
	
	/**
	 * Create the wizard.
	 */
	public RDBSchemaWizardPage2() {
		super("wizardPage2");
		setTitle("RDB Schema Wizard");
		setDescription("All Schemas List.");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label labelName = new Label(composite, SWT.NONE);
		labelName.setText("RDB Diagram Name:");
		
		rdbEntityNameTxt = new Text(composite, SWT.BORDER);
		rdbEntityNameTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		checkboxTreeViewer = new CheckboxTreeViewer(scrolledComposite, SWT.BORDER);
		checkboxTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent arg0) {
				arg0.getSelection();
			}
		});
		checkboxTreeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				// If the item is checked . . .
				if (event.getChecked()) {
					// . . . check all its children
					checkboxTreeViewer.setSubtreeChecked(event.getElement(),
							true);
				} else {
					checkboxTreeViewer.setSubtreeChecked(event.getElement(),
							false);
				}
			}
		});
		Tree tree = checkboxTreeViewer.getTree();
		scrolledComposite.setContent(tree);
		scrolledComposite.setMinSize(tree.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		//
		BeansListObservableFactory treeObservableFactory = new BeansListObservableFactory(TableTypeImpl.class, "column");
		TreeBeanAdvisor treeAdvisor = new TreeBeanAdvisor(TableTypeImpl.class, "entityName", "column");
		ObservableListTreeContentProvider treeContentProvider = new ObservableListTreeContentProvider(treeObservableFactory, treeAdvisor);
		checkboxTreeViewer.setLabelProvider(new TreeObservableLabelProvider(treeContentProvider.getKnownElements(), TableTypeImpl.class, "entityName", null));
		checkboxTreeViewer.setContentProvider(treeContentProvider);
		
		refreshData();
	}
	
	public void setPreviousPage(IWizardPage page) {
		super.setPreviousPage(page);
		
		refreshData();
		((WizardPage)this.getPreviousPage()).setPageComplete(true);
		this.setPageComplete(true);
	}
	
	private void refreshData() {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		BediagramDiagramEditor editor = ((BediagramDiagramEditor)page.getActiveEditor());
		String name = editor.getPartName();
		if (name.lastIndexOf('.') != -1) {
			name = name.substring(0, name.lastIndexOf('.'));
		}
		rdbEntityNameTxt.setText(name);
		
		diagramType = ((RDBSchemaWizardPage)this.getPreviousPage()).getSelectionResult();
		IObservableList selfList = Properties.selfList(TableTypeImpl.class).observe(diagramType.getTable());
		checkboxTreeViewer.setInput(selfList);
		checkboxTreeViewer.expandAll();
		
		EList<TableType> tables = diagramType.getTable();
		for (TableType table: tables) {
			checkboxTreeViewer.setSubtreeChecked(table, true);
		}
	}
	
	public RDBDiagramType getSelectionResult() {
		return diagramType;
	}
	
	public String getRDBDiagramName() {
		return rdbEntityNameTxt.getText();
	}
}
