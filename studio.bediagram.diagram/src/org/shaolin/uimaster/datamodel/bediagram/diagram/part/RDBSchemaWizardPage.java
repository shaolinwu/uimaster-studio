package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

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
import org.shaolin.uimaster.datamodel.bediagram.BECollectionType;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BEListType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.CEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType;
import org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.util.RDBTypeConverter;
import org.shaolin.uimaster.wb.rcp.databinding.BeansListObservableFactory;
import org.shaolin.uimaster.wb.rcp.databinding.TreeBeanAdvisor;
import org.shaolin.uimaster.wb.rcp.databinding.TreeObservableLabelProvider;

public class RDBSchemaWizardPage extends WizardPage {
	private DataBindingContext m_bindingContext;

	private final BEDiagramType modelElement;
	private CheckboxTreeViewer checkboxTreeViewer;
	
	/**
	 * Create the wizard.
	 */
	public RDBSchemaWizardPage(BEDiagramType modelElement) {
		super("wizardPage");
		this.modelElement = modelElement;
		setTitle("RDB Schema Wizard");
		setDescription("All BEs List.");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
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
				
				refresh();
			}
		});
		Tree tree = checkboxTreeViewer.getTree();
		scrolledComposite.setContent(tree);
		scrolledComposite.setMinSize(tree.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		m_bindingContext = initDataBindings();
		
		this.setPageComplete(false);
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
		IObservableList selfList = Properties.selfList(BusinessEntityTypeImpl.class).observe(modelElement.getBeEntity());
		checkboxTreeViewer.setInput(selfList);
		checkboxTreeViewer.expandAll();
		
		EList<BusinessEntityType> bes = modelElement.getBeEntity();
		for (BusinessEntityType be: bes) {
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
	
	private BusinessEntityType getBE(String entityName) {
		for (BusinessEntityType be : modelElement.getBeEntity()) {
			if (entityName.equals(be.getEntityName())) {
				return be;
			}
		}
		return null;
	}
	
	public RDBDiagramType getSelectionResult() {
		Object[] items = checkboxTreeViewer.getCheckedElements();
		RDBDiagramType root = RDBDiagramFactory.eINSTANCE.createRDBDiagramType();
		
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof BusinessEntityType) {
				BusinessEntityType beNodeType = (BusinessEntityType)items[i];
				TableType table = RDBDiagramFactory.eINSTANCE.createTableType();
				table.setEntityName(beNodeType.getEntityName().toUpperCase());
				
				ClassMappingType mapping = RDBDiagramFactory.eINSTANCE.createClassMappingType();
				mapping.setBusinessEntity(CommonFactory.eINSTANCE.createTargetEntityType());
				mapping.getBusinessEntity().setEntityName(
						modelElement.getBePackage() + "." + beNodeType.getEntityName());
				
				table.setMapping(mapping);
				root.getTable().add(table);
				
				// Gen associations
				if (beNodeType.getParentObject() != null 
						&& beNodeType.getParentObject() instanceof BEObjRefType) {
					String parentBE = ((BEObjRefType)beNodeType.getParentObject()).getTargetEntity().getEntityName();
					InheritAssociationType inherit = RDBDiagramFactory.eINSTANCE.createInheritAssociationType();
					inherit.setParentTable(parentBE);
					inherit.setName(parentBE + "_Inherit");
					table.setInheritAsscociation(inherit);
				}
				
				i++;
				for (; i < items.length; i++) {
					if (items[i] instanceof MemberType) {
						ColumnType column = RDBDiagramFactory.eINSTANCE.createColumnType();
						table.getColumn().add(column);
						
						MemberType beField = (MemberType)items[i];
						column.setName(beField.getName().toUpperCase());
						column.setType(RDBTypeConverter.getColumnType(beField.getType().getClass()));
						column.setIsNull(true);
						
						if (beField.getType() instanceof BECollectionType) {
							if (beField.getType() instanceof BEListType) {
								BEObjRefType refBE = (BEObjRefType)((BEListType)beField.getType()).getElementType();
								String entityName = "";
								if (refBE != null && refBE.getTargetEntity() != null) {
									entityName = refBE.getTargetEntity().getEntityName();
								}
								
								TargetEntityType tarEntity = CommonFactory.eINSTANCE.createTargetEntityType();
								tarEntity.setEntityName(entityName);
								String association = "list_" + beField.getName() + "_" + column.getName();
								ListFieldMappingType mt = RDBDiagramFactory.eINSTANCE.createListFieldMappingType();
								mt.setBeFieldName(beField.getName());
								mt.setCollectionTable(tarEntity);
								mt.setUseClobBuffer(true);
								mt.setAssociationName(association);
								mt.setMappingType(MappingTypeType.ONE_TO_MANY);
								
								mapping.getFieldMapping().add(mt);
							} else {
								//skip SetType and MapType.
							}
						} else if (beField.getType() instanceof BEObjRefType) {
							BEObjRefType refBE = ((BEObjRefType)beField.getType());
							if (refBE.getTargetEntity() != null) {
								BusinessEntityType tarBe = getBE(refBE.getTargetEntity().getEntityName());
								String tarTable = tarBe.getEntityName().toUpperCase();
								JoinTableType joinTable = RDBDiagramFactory.eINSTANCE.createJoinTableType();
								joinTable.setName(table.getEntityName() + tarTable);
								joinTable.setSrcPKColumn(column.getName().toUpperCase());
								joinTable.setSrcTable(table.getEntityName());
								joinTable.setTarPKColumn(tarBe.getMember().get(0).getName().toUpperCase());
								joinTable.setTarTable(tarTable);
							}
							
							FieldMappingType mt = RDBDiagramFactory.eINSTANCE.createFieldMappingType();
							mt.setBeFieldName(beField.getName());
							mt.setColumnName(column.getName());
							
							column.setLength("10");// default length of BE primary key
							mapping.getFieldMapping().add(mt);
						} else if (beField.getType() instanceof CEObjRefType) {
							FieldMappingType mt = RDBDiagramFactory.eINSTANCE.createFieldMappingType();
							mt.setBeFieldName(beField.getName());
							mt.setColumnName(column.getName());
							
							column.setLength("2");// the max length of CE value limited in 2.
							mapping.getFieldMapping().add(mt);
						} else {
							FieldMappingType mt = RDBDiagramFactory.eINSTANCE.createFieldMappingType();
							mt.setBeFieldName(beField.getName());
							mt.setColumnName(column.getName());
							
							mapping.getFieldMapping().add(mt);
						}
						
					} else {
						i--;
						break;
					}
				}
				
				// Gen history columns
				if (beNodeType.isNeedHistory() && beNodeType.getParentObject() == null) {
					ColumnType version = RDBDiagramFactory.eINSTANCE.createColumnType();
					version.setName("_version");
					version.setType(TypeType.INTEGER);
					version.setLength("2");
					table.getColumn().add(version);
					
					ColumnType starttime = RDBDiagramFactory.eINSTANCE.createColumnType();
					starttime.setName("_starttime");
					starttime.setType(TypeType.TIMESTAMP);
					table.getColumn().add(starttime);
					
					ColumnType endtime = RDBDiagramFactory.eINSTANCE.createColumnType();
					endtime.setName("_endtime");
					endtime.setType(TypeType.TIMESTAMP);
					table.getColumn().add(endtime);
					
					ColumnType optUserId = RDBDiagramFactory.eINSTANCE.createColumnType();
					optUserId.setName("_optuserid");
					optUserId.setType(TypeType.BIGINT);
					optUserId.setLength("10");
					table.getColumn().add(optUserId);
					
					FieldMappingType versionMP = RDBDiagramFactory.eINSTANCE.createFieldMappingType();
					versionMP.setBeFieldName("_version");
					versionMP.setColumnName("_version");
					mapping.getFieldMapping().add(versionMP);
					
					FieldMappingType starttimeMP = RDBDiagramFactory.eINSTANCE.createFieldMappingType();
					starttimeMP.setBeFieldName("_starttime");
					starttimeMP.setColumnName("_starttime");
					mapping.getFieldMapping().add(starttimeMP);
					
					FieldMappingType endtimeMP = RDBDiagramFactory.eINSTANCE.createFieldMappingType();
					endtimeMP.setBeFieldName("_endtime");
					endtimeMP.setColumnName("_endtime");
					mapping.getFieldMapping().add(endtimeMP);
					
					FieldMappingType userIdMP = RDBDiagramFactory.eINSTANCE.createFieldMappingType();
					userIdMP.setBeFieldName("_optuserid");
					userIdMP.setColumnName("_optuserid");
					mapping.getFieldMapping().add(userIdMP);
				}
				
			}
		}
		
		return root;
	}
}
