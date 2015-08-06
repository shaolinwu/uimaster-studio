package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.sheet;

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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.PKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

public class PrimaryKeyPropertyUI extends Composite {
	
	private TableType table;
	
	private List columnList;
	
	private List selectedList;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public PrimaryKeyPropertyUI(Composite parent, int style) {
		super(parent, SWT.EMBEDDED);
		setLayout(new GridLayout(3, true));
		
		Label lblColumns = new Label(this, SWT.NONE);
		lblColumns.setText("Columns:");
		new Label(this, SWT.NONE);
		
		Label lblKeys = new Label(this, SWT.NONE);
		lblKeys.setText("Selected Keys:");
		
		columnList = new List(this, SWT.BORDER | SWT.V_SCROLL);
		GridData gd_columnList = new GridData(SWT.FILL, SWT.TOP, false, true, 1, 1);
		gd_columnList.minimumHeight = 150;
		columnList.setLayoutData(gd_columnList);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, true, 1, 1));
		composite.setLayout(new GridLayout(1, false));
		
		Button moveTo = new Button(composite, SWT.NONE);
		moveTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if (columnList.getSelectionIndex() != -1) {
					String item = columnList.getItem(columnList.getSelectionIndex());
					selectedList.add(item, selectedList.getItemCount());
					columnList.remove(columnList.getSelectionIndex());
					
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(table);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
					    @Override
					    protected void doExecute() {
					    	table.getPrimaryKey().clear();
							String[] items = selectedList.getItems();
							for (String i : items) {
								PKType pk = RDBDiagramFactory.eINSTANCE.createPKType();
								pk.setColumnName(i);
								table.getPrimaryKey().add(pk);
							}
					    }
					});
				}
			}
		});
		moveTo.setText(">>");
		
		Button moveBack = new Button(composite, SWT.NONE);
		moveBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if (selectedList.getSelectionIndex() != -1) {
					String item = selectedList.getItem(selectedList.getSelectionIndex());
					columnList.add(item, selectedList.getItemCount());
					selectedList.remove(selectedList.getSelectionIndex());
					
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(table);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
					    @Override
					    protected void doExecute() {
					    	table.getPrimaryKey().clear();
					    	String[] items = selectedList.getItems();
							for (String i : items) {
								PKType pk = RDBDiagramFactory.eINSTANCE.createPKType();
								pk.setColumnName(i);
								table.getPrimaryKey().add(pk);
							}
					    }
					});
				}
			}
		});
		moveBack.setText("<<");
		
		selectedList = new List(this, SWT.BORDER | SWT.V_SCROLL);
		GridData gd_selectedList = new GridData(SWT.FILL, SWT.TOP, false, true, 1, 1);
		gd_selectedList.minimumHeight = 150;
		selectedList.setLayoutData(gd_selectedList);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
	}
	
	public void init(TableType table) {
		this.table = table;
		
		columnList.removeAll();
		selectedList.removeAll();
		if (table.getPrimaryKey() != null) {
			EList<PKType> pks = table.getPrimaryKey();
			for (int i = 0; i < pks.size(); i++) {
				selectedList.add(pks.get(i).getColumnName(), i);
			}
		}
		
		int i=0;
		EList<ColumnType> columns = table.getColumn();
		for (ColumnType col: columns) {
			if (!isPK(col.getName())) {
				columnList.add(col.getName(), i++);
			}
		}
	}
	
	private boolean isPK(String column) {
		if (table.getPrimaryKey() == null) {
			return false;
		}
		EList<PKType> pks = table.getPrimaryKey();
		for (PKType key: pks) {
			if (key.getColumnName().equals(column)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
