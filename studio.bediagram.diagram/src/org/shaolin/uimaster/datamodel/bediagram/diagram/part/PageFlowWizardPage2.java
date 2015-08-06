package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.util.List;
import java.util.Set;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.PageFlowWizardData.UIFieldItem;
import org.shaolin.uimaster.datamodel.pagediagram.util.UITypeConvertor;

public class PageFlowWizardPage2 extends WizardPage {
	private Table table;

	private TableViewer tableViewer;

	private UIFieldItem selectedItem;

	private final PageFlowWizardData data;

	/**
	 * Create the wizard.
	 */
	public PageFlowWizardPage2(PageFlowWizardData data) {
		super("wizardPage2");
		this.data = data;

		setTitle("Page Flow Wizard");
		setDescription("UI Components' Mappings Configuration");
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

		tableViewer = new TableViewer(container, SWT.BORDER
				| SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		TableColumn tblclmnBEField = tableViewerColumn.getColumn();
		tblclmnBEField.setWidth(100);
		tblclmnBEField.setText("BE Field");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(
				tableViewer, SWT.NONE);
		TableColumn tblclmnBEType = tableViewerColumn_1.getColumn();
		tblclmnBEType.setWidth(300);
		tblclmnBEType.setText("BE Type");

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(
				tableViewer, SWT.NONE);
		TableColumn tblclmnUIType = tableViewerColumn_2.getColumn();
		tblclmnUIType.setWidth(300);
		tblclmnUIType.setText("UI Type");

		tableViewer.setLabelProvider(new TableLabelProvider());
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setCellModifier(new CellModifier());
		tableViewer.setColumnProperties(new String[] { "BEField", "FieldType",
				"UIType" });
		tableViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection sel = (IStructuredSelection) event
								.getSelection();
						selectedItem = (UIFieldItem) sel.getFirstElement();
					}
				});
	}

	private String[] getUITypes() {
		Set<String> typeNames = UITypeConvertor.getBEFieldMappingTypes();
		String[] types = new String[typeNames.size()];
		typeNames.toArray(types);
		return types;
	}

	private int getUITypeIndex(String type) {
		if (type == null || type.isEmpty()) {
			return -1;
		}
		String[] types = getUITypes();
		for (int i = 0; i < types.length; i++) {
			if (type.equals(types[i])) {
				return i;
			}
		}
		return -1;
	}

	public List<UIFieldItem> getSelectionResult() {
		List<UIFieldItem> items = (List<UIFieldItem>) this.tableViewer
				.getInput();
		return items;
	}

	public void setPreviousPage(IWizardPage page) {
		super.setPreviousPage(page);

		List<BusinessEntityType> list = ((PageFlowWizardPage) this
				.getPreviousPage()).getSelectionResult();
		data.setBeList(list);
		
		init();
		((WizardPage) this.getPreviousPage()).setPageComplete(true);
		((WizardPage) this.getNextPage()).setPageComplete(false);
	}

	private void init() {
		this.tableViewer.setInput(data.getUifields());
		this.tableViewer.setCellEditors(new CellEditor[] { null, null,
				new ComboBoxCellEditor(table, getUITypes()) });
	}

	private class TableLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			UIFieldItem p = (UIFieldItem) element;
			switch (columnIndex) {
			case 0:
				result = p.befield;
				break;
			case 1:
				result = p.beType;
				break;
			case 2:
				result = p.uiType;
				break;
			}
			return result;
		}
	}

	private class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			List<UIFieldItem> items = (List<UIFieldItem>) inputElement;
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
			if ("BEField".equals(property) || "FieldType".equals(property)) {
				return false;
			}
			return true;
		}

		@Override
		public Object getValue(Object element, String property) {
			if ("UIType".equals(property)) {
				UIFieldItem mapping = (UIFieldItem) element;
				return getUITypeIndex(mapping.uiType);
			}
			return null;
		}

		@Override
		public void modify(Object element, String property, Object value) {
			if (selectedItem == null) {
				return;
			}
			selectedItem.uiType = UITypeConvertor
					.getTypeByIndex((Integer) value);
			tableViewer.refresh(selectedItem);
		}
	}

}
