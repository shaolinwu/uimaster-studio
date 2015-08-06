package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.util.BETypeConvertor;
import org.shaolin.uimaster.wb.rcp.databinding.BeansListObservableFactory;
import org.shaolin.uimaster.wb.rcp.databinding.TreeBeanAdvisor;
import org.shaolin.uimaster.wb.rcp.databinding.TreeObservableLabelProvider;

public class PageFlowWizardPage extends WizardPage {

	private final BEDiagramType modelElement;
	private CheckboxTreeViewer checkboxTreeViewer;

	/**
	 * Create the wizard.
	 */
	public PageFlowWizardPage(BEDiagramType modelElement) {
		super("wizardPage1");
		this.modelElement = modelElement;
		setTitle("Page Flow Wizard");
		setDescription("All BEs List.");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));

		ScrolledComposite scrolledComposite = new ScrolledComposite(container,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		checkboxTreeViewer = new CheckboxTreeViewer(scrolledComposite,
				SWT.BORDER);
		checkboxTreeViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
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

				refresh();
			}
		});
		Tree tree = checkboxTreeViewer.getTree();
		scrolledComposite.setContent(tree);
		scrolledComposite
				.setMinSize(tree.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		initDataBindings();

		this.setPageComplete(false);
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		BeansListObservableFactory treeObservableFactory = new BeansListObservableFactory(
				BusinessEntityTypeImpl.class, "member");
		TreeBeanAdvisor treeAdvisor = new TreeBeanAdvisor(
				BusinessEntityTypeImpl.class, "entityName", "member",
				"extensible");
		ObservableListTreeContentProvider treeContentProvider = new ObservableListTreeContentProvider(
				treeObservableFactory, treeAdvisor);
		checkboxTreeViewer.setLabelProvider(new TreeObservableLabelProvider(
				treeContentProvider.getKnownElements(),
				BusinessEntityTypeImpl.class, "entityName", null));
		checkboxTreeViewer.setContentProvider(treeContentProvider);
		//
		IObservableList selfList = Properties.selfList(
				BusinessEntityTypeImpl.class).observe(
				modelElement.getBeEntity());
		checkboxTreeViewer.setInput(selfList);
		checkboxTreeViewer.expandAll();

		EList<BusinessEntityType> bes = modelElement.getBeEntity();
		for (BusinessEntityType be : bes) {
			checkboxTreeViewer.setSubtreeChecked(be, true);
		}
		//
		return bindingContext;
	}

	private void refresh() {
		getContainer().updateMessage();
		getContainer().updateButtons();
	}

	public boolean canFlipToNextPage() {
		if (checkboxTreeViewer.getCheckedElements().length == 0) {
			this.setErrorMessage("At least one BE object needs to be selected!");
		} else {
			this.setErrorMessage(null);
		}

		return checkboxTreeViewer.getCheckedElements().length > 0;
	}

	public List<BusinessEntityType> getSelectionResult() {
		Object[] items = checkboxTreeViewer.getCheckedElements();
		List<BusinessEntityType> list = new ArrayList<BusinessEntityType>(
				items.length);

		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof BusinessEntityType) {
				BusinessEntityType beNodeType = (BusinessEntityType) items[i];

				final BusinessEntityType newBe = BEDiagramFactory.eINSTANCE
						.createBusinessEntityType();
				newBe.setEntityName(modelElement.getBePackage()
									+ "." + beNodeType.getEntityName());
				list.add(newBe);

				i++;
				for (; i < items.length; i++) {
					if (items[i] instanceof MemberType) {
						final MemberType m = (MemberType) items[i];
						MemberType newMember = BEDiagramFactory.eINSTANCE
								.createMemberType();
						newMember.setName(m.getName());
						newMember.setType(BETypeConvertor.copy(m.getType()));
						newBe.getMember().add(newMember);
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
