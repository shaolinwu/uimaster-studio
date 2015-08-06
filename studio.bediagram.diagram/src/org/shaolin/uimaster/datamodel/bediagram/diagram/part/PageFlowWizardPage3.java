package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.PageFlowWizardData.PageItem;

public class PageFlowWizardPage3 extends WizardPage {

	private final PageFlowWizardData data;
	
	private InputVarPropertyUI inputVarUI;
	
	private Table table;

	private TableViewer tableViewer;
	
	private Text flowNameLabel;

	private Label lblBenamelabel;
	
	/**
	 * Create the wizard.
	 */
	public PageFlowWizardPage3(PageFlowWizardData data) {
		super("wizardPage3");
		this.data = data;

		setTitle("Page Flow Wizard");
		setDescription("Page Info Configuration");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		GridLayout gl_container = new GridLayout(1, false);
		gl_container.verticalSpacing = 2;
		container.setLayout(gl_container);
		
		Composite flowInfoPanel = new Composite(container, SWT.NONE);
		flowInfoPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		flowInfoPanel.setLayout(new GridLayout(2, false));
		
		Label lblPageFlow = new Label(flowInfoPanel, SWT.NONE);
		lblPageFlow.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPageFlow.setText("Page Flow:");
		
		flowNameLabel = new Text(flowInfoPanel, SWT.BORDER);
		flowNameLabel.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				data.setFlowName(flowNameLabel.getText());
			}
		});
		flowNameLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		TabFolder tabFolder = new TabFolder(container, SWT.NONE);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		TabItem tbtmBasicInfo = new TabItem(tabFolder, SWT.NONE);
		tbtmBasicInfo.setText("Basic Info");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmBasicInfo.setControl(composite_1);
		composite_1.setLayout(new GridLayout(1, false));
		
		tableViewer = new TableViewer(composite_1, SWT.BORDER
				| SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setSize(521, 41);
		GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_table.minimumHeight = 100;
		table.setLayoutData(gd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		TableColumn tblclmnBeName = tableViewerColumn.getColumn();
		tblclmnBeName.setWidth(100);
		tblclmnBeName.setText("Page Name");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(
				tableViewer, SWT.NONE);
		TableColumn tblclmnGenUientity = tableViewerColumn_1.getColumn();
		tblclmnGenUientity.setWidth(100);
		tblclmnGenUientity.setText("Gen UIEntity");

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(
				tableViewer, SWT.NONE);
		TableColumn tblclmnGenSearchPage = tableViewerColumn_2.getColumn();
		tblclmnGenSearchPage.setWidth(100);
		tblclmnGenSearchPage.setText("Gen Search Page");

		tableViewer.setLabelProvider(new TableLabelProvider());
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setCellModifier(new CellModifier());
		tableViewer.setColumnProperties(new String[] { "BEName", "GenUIEntity",
				"GenSearchPage" });
		tableViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection sel = (IStructuredSelection) event
								.getSelection();
						PageItem pageItem = (PageItem) sel.getFirstElement();
						lblBenamelabel.setText(pageItem.pageName);
						inputVarUI.init(data.getInputParams().get(
								pageItem.pageName));
					}
				});
		
		Composite composite = new Composite(composite_1, SWT.NONE);
		composite.setSize(564, 169);
		GridLayout gl_composite = new GridLayout(2, false);
		gl_composite.marginHeight = 2;
		gl_composite.verticalSpacing = 0;
		composite.setLayout(gl_composite);
		
		Label lblPageNodeVariables = new Label(composite, SWT.NONE);
		lblPageNodeVariables.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblPageNodeVariables.setText("Page Node Variables Definition:");
		
		lblBenamelabel = new Label(composite, SWT.NONE);
		lblBenamelabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblBenamelabel.setText("beNameLabel");
		
		Composite varsPanel = new Composite(composite_1, SWT.NONE);
		varsPanel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		varsPanel.setSize(564, 113);
		GridLayout gl_varsPanel = new GridLayout(3, false);
		gl_varsPanel.marginHeight = 0;
		gl_varsPanel.marginWidth = 0;
		gl_varsPanel.verticalSpacing = 0;
		varsPanel.setLayout(gl_varsPanel);
		
		inputVarUI = new InputVarPropertyUI(varsPanel, SWT.NONE);
		GridLayout gridLayout = (GridLayout) inputVarUI.getLayout();
		gridLayout.marginHeight = 0;
		gridLayout.verticalSpacing = 0;
		gridLayout.marginWidth = 0;
		GridData gd_inputVarUI = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
		gd_inputVarUI.minimumHeight = 100;
		inputVarUI.setLayoutData(gd_inputVarUI);
		new Label(varsPanel, SWT.NONE);
		new Label(varsPanel, SWT.NONE);
		new Label(varsPanel, SWT.NONE);
		new Label(varsPanel, SWT.NONE);
		new Label(varsPanel, SWT.NONE);
	}

	public List<PageItem> getSelectionResult() {
		return data.getPageItems();
	}

	public void setPreviousPage(IWizardPage page) {
		super.setPreviousPage(page);

		init();
		((WizardPage) this.getPreviousPage()).setPageComplete(true);
		this.setPageComplete(true);
	}

	private void init() {
		PageItem be0 = data.getPageItems().get(0);
		if (data.getFlowName().isEmpty()) {
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			BediagramDiagramEditor editor = ((BediagramDiagramEditor)page.getActiveEditor());
			String name = editor.getPartName();
			if (name.lastIndexOf('.') != -1) {
				name = name.substring(0, name.lastIndexOf('.'));
			}
			flowNameLabel.setText(name + "PageFlow");
		} else {
			flowNameLabel.setText(data.getFlowName());
		}
		
		lblBenamelabel.setText(be0.pageName);
		inputVarUI.init(data.getInputParams().get(be0.pageName));
		
		this.tableViewer.setInput(data.getPageItems());
		this.tableViewer.setCellEditors(new CellEditor[] { new TextCellEditor(table),
				new CheckboxCellEditor(table), new CheckboxCellEditor(table) });
	}

	private class TableLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			PageItem p = (PageItem) element;
			switch (columnIndex) {
			case 0:
				result = p.pageName;
				break;
			case 1:
				result = p.genUIEntity ? "true" : "false";
				break;
			case 2:
				result = p.genSearchPage ? "true" : "false";
				break;
			}
			return result;
		}
	}

	private class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			List<PageItem> items = (List<PageItem>) inputElement;
			Object[] objs = new Object[items.size()];
			items.toArray(objs);
			return objs;
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	private class CellModifier implements ICellModifier {

		@Override
		public boolean canModify(Object element, String property) {
			return true;
		}

		@Override
		public Object getValue(Object element, String property) {
			PageItem data = (PageItem) element;
			
			if ("BEName".equals(property)) {
				return data.pageName;
			} else if ("GenUIEntity".equals(property)) {
				return data.genUIEntity;
			} else if ("GenSearchPage".equals(property)) {
				return data.genSearchPage;
			} 
			return null;
		}

		@Override
		public void modify(Object element, String property, Object value) {
			TableItem tableItem = (TableItem) element;
			PageItem data = (PageItem)tableItem.getData();
			
			if ("BEName".equals(property)) {
				data.pageName = value.toString();
			} else if ("GenUIEntity".equals(property)) {
				data.genUIEntity = (Boolean) value;
			} else if ("GenSearchPage".equals(property)) {
				data.genSearchPage = (Boolean) value;
			} 
			tableViewer.refresh(data);
		}
	}
}
