package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl;
import org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl;
import org.shaolin.uimaster.wb.rcp.databinding.BeansListObservableFactory;
import org.shaolin.uimaster.wb.rcp.databinding.TreeBeanAdvisor;
import org.shaolin.uimaster.wb.rcp.databinding.TreeObservableLabelProvider;

public class ImportJavaClassWizardPage extends WizardPage {
	private Text text;
	
	private CheckboxTreeViewer checkboxTreeViewer;
	
	/**
	 * Create the wizard.
	 */
	public ImportJavaClassWizardPage() {
		super("wizardPage");
		setTitle("Wizard Page title");
		setDescription("Wizard Page description");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Composite titlePanel = new Composite(container, SWT.NONE);
		RowLayout rl_titlePanel = new RowLayout(SWT.HORIZONTAL);
		rl_titlePanel.justify = true;
		rl_titlePanel.fill = true;
		titlePanel.setLayout(rl_titlePanel);
		
		Label lblSelectFilePath = new Label(titlePanel, SWT.NONE);
		lblSelectFilePath.setText("File Path:");
		
		text = new Text(titlePanel, SWT.BORDER);
		text.setLayoutData(new RowData(400, SWT.DEFAULT));
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				try {
					refreshData(text.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
		});
		
		Button btnSelect = new Button(titlePanel, SWT.NONE);
		btnSelect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(parent.getShell());
//				dialog.setFilterExtensions(new String[] { "*.java" });
				String path = dialog.open();
				if (path != null && !path.isEmpty()) {
					text.setText(path);
					
					try {
						refreshData(path);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnSelect.setText("Select Folder...");
		
		Group loadedBEPanel = new Group(container, SWT.NONE);
		loadedBEPanel.setLayout(new GridLayout(1, false));
		loadedBEPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		loadedBEPanel.setText("Loaded BE Objects");
		
		checkboxTreeViewer = new CheckboxTreeViewer(loadedBEPanel, SWT.BORDER);
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
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		initDataBindings();
	}
	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		BeansListObservableFactory treeObservableFactory = new BeansListObservableFactory(BusinessEntityTypeImpl.class, "member");
		TreeBeanAdvisor treeAdvisor = new TreeBeanAdvisor(BusinessEntityTypeImpl.class, "entityName", "member", "extensible");
		ObservableListTreeContentProvider treeContentProvider = new ObservableListTreeContentProvider(treeObservableFactory, treeAdvisor);
		checkboxTreeViewer.setLabelProvider(new TreeObservableLabelProvider(treeContentProvider.getKnownElements(), BusinessEntityTypeImpl.class, "entityName", null));
		checkboxTreeViewer.setContentProvider(treeContentProvider);
		//
		return bindingContext;
	}
	
	private void refreshData(String path) throws Exception {
		List<BusinessEntityType> list = new ArrayList<BusinessEntityType>();
		ImportJavaClassToDiagram.loadPath(new File(path), list);
		
		IObservableList selfList = Properties.selfList(TableTypeImpl.class).observe(list);
		checkboxTreeViewer.setInput(selfList);
		checkboxTreeViewer.expandAll();
		
		for (BusinessEntityType be: list) {
			checkboxTreeViewer.setSubtreeChecked(be, true);
		}
	}
	
	public List<BusinessEntityType> getSelectionResult() {
		List<BusinessEntityType> list = new ArrayList<BusinessEntityType>();
		
		Object[] items = checkboxTreeViewer.getCheckedElements();
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof BusinessEntityType) {
				BusinessEntityType selectedBe = (BusinessEntityType)items[i];
				BusinessEntityType newbe = BEDiagramFactory.eINSTANCE.createBusinessEntityType();
				newbe.setEntityName(selectedBe.getEntityName());
				
				list.add(newbe);
				i++;
				for (; i < items.length; i++) {
					if (items[i] instanceof MemberType) {
						MemberType beField = (MemberType)items[i];
						newbe.getMember().add(beField);
					} else {
						i--;
						break;
					}
				}
				
			}
		}
		
		return list;
		
	}
}
