package org.shaolin.uimaster.datamodel.page.presentation;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.ExpressionType;
import org.shaolin.uimaster.datamodel.page.ComponentMappingType;
import org.shaolin.uimaster.datamodel.page.DirectComponentMappingType;
import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PageOutType;
import org.shaolin.uimaster.datamodel.page.PagePackage;
import org.shaolin.uimaster.datamodel.page.SimpleComponentMappingType;
import org.shaolin.uimaster.datamodel.page.UIPageType;
import org.shaolin.uimaster.datamodel.page.util.PageResourceImpl;

public class JsPlusCssPanel extends Composite {
	private Text inMappingTxt;
	private TabFolder outTabFolder;
	
	private UIPageType model;
	
	private ComponentMappingType selectedMapping;
	
	private InternalViewer viewer;
	
	private AdapterFactoryEditingDomain editingDomain;
	private Table varTable;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public JsPlusCssPanel(Composite parent, int style) {
		super(parent, SWT.NONE);
		setLayout(new GridLayout(1, false));
		
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.add(new Action("Add Simple Mapping") {
			public void run() {
				int index = model.getODMapping().getComponentMapping().size();
				SimpleComponentMappingType mapping = 
						PageFactory.eINSTANCE.createSimpleComponentMappingType();
				mapping.setName("simpleMapping" + index);
				
				Command addODmappingCmd = AddCommand.create(editingDomain, model.getODMapping(), 
	    				PagePackage.eINSTANCE.getSimpleComponentMappingType(), 
	    				mapping, index);
	    		editingDomain.getCommandStack().execute(addODmappingCmd);
		    	
			}
		});
		menuMgr.add(new Action("Add Direct Mapping") {
			public void run() {
				int index = model.getODMapping().getComponentMapping().size();
				DirectComponentMappingType mapping = 
						PageFactory.eINSTANCE.createDirectComponentMappingType();
				mapping.setName("directMapping" + index);
				
				Command addODmappingCmd = AddCommand.create(editingDomain, model.getODMapping(), 
	    				PagePackage.eINSTANCE.getDirectComponentMappingType(), 
	    				mapping, index);
	    		editingDomain.getCommandStack().execute(addODmappingCmd);
		    	
			}
		});
		menuMgr.add(new Action("Remove Mapping") {
			public void run() {
				if (selectedMapping == null) {
					return;
				}
				
				Command addODmappingCmd;
				if (selectedMapping instanceof SimpleComponentMappingType) {
					addODmappingCmd = RemoveCommand.create(editingDomain, model.getODMapping(), 
	    				PagePackage.eINSTANCE.getSimpleComponentMappingType(), 
	    				selectedMapping);
				} else {
					addODmappingCmd = RemoveCommand.create(editingDomain, model.getODMapping(), 
		    				PagePackage.eINSTANCE.getDirectComponentMappingType(), 
		    				selectedMapping);
				}
				editingDomain.getCommandStack().execute(addODmappingCmd);
				
				selectedMapping = null;
			}
		});
		
		MenuManager outNodeMenuMgr = new MenuManager("#PopupMenu");
		
		Group grpPageIncomeMapping = new Group(this, SWT.NONE);
		grpPageIncomeMapping.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpPageIncomeMapping.setSize(417, 106);
		grpPageIncomeMapping.setLayout(new GridLayout(1, false));
		grpPageIncomeMapping.setText("Page Income Mapping:");
		
		inMappingTxt = new Text(grpPageIncomeMapping, SWT.BORDER | SWT.MULTI);
		inMappingTxt.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				if (model.getIn() != null
						&& model.getIn().getServerOperation() != null
						&& inMappingTxt.getText().equals(model.getIn()
								.getServerOperation().getExpressionString())) {
					return;
				}
				
				if (model.getIn() == null) {
					model.setIn(PageFactory.eINSTANCE.createPageInType());
				}
				
				ExpressionType expr = CommonFactory.eINSTANCE.createExpressionType();
				expr.setExpressionString(inMappingTxt.getText());
				
				Command addODmappingCmd = SetCommand.create(editingDomain, model.getIn(), 
	    				PagePackage.eINSTANCE.getPageInType_ServerOperation(), expr);
				editingDomain.getCommandStack().execute(addODmappingCmd);
			}
		});
		GridData gd_inMappingTxt = new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1);
		gd_inMappingTxt.minimumHeight = 120;
		inMappingTxt.setLayoutData(gd_inMappingTxt);
		
		Group grpPageOutcomeMappings = new Group(this, SWT.NONE);
		grpPageOutcomeMappings.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		grpPageOutcomeMappings.setSize(18, 80);
		grpPageOutcomeMappings.setLayout(new GridLayout(1, false));
		grpPageOutcomeMappings.setText("Page Outcome Mappings:");
		
		outTabFolder = new TabFolder(grpPageOutcomeMappings, SWT.NONE);
		outTabFolder.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		final Menu outMenu = outNodeMenuMgr.createContextMenu(outTabFolder);
		outTabFolder.setMenu(outMenu);
		
		outNodeMenuMgr.add(new Action("Rename") {
			public void run() {
				TabItem item = outTabFolder.getItem(outTabFolder.getSelectionIndex());
				InputDialog saveAsDialog = new InputDialog(
							Display.getDefault().getActiveShell(),
							"Out Name", 
							"Please enter a new name:", 
							item.getText(), 
							new IInputValidator() {  
								public String isValid(String newText) {
									EList<PageOutType> outs = model.getOut();
							    	for (PageOutType out: outs) {
							    		if (newText.equals(out.getName())) {
											return "This name has already existed!";
							    		}
							    	}
									return null;
								}
						});
				if (saveAsDialog.open() == InputDialog.OK) {
					String newOutName = saveAsDialog.getValue();
					
					EList<PageOutType> outs = model.getOut();
			    	for (PageOutType out: outs) {
			    		if (item.getText().equals(out.getName())) {
			    			Command addODmappingCmd = SetCommand.create(editingDomain, out, 
			    					PagePackage.eINSTANCE.getPageOutType_Name(), newOutName);
			    			editingDomain.getCommandStack().execute(addODmappingCmd);
			    			break;
			    		}
			    	}
					
					item.setText(newOutName);
				}
			}
		});
		outNodeMenuMgr.add(new Action("Add Out") {
			public void run() {
				int index = model.getOut().size();
				PageOutType defaultOut = PageFactory.eINSTANCE.createPageOutType();
				defaultOut.setName("Out" + index);
				Command addODmappingCmd = AddCommand.create(editingDomain, model, 
	    				PagePackage.eINSTANCE.getUIPageType_Out(), 
	    				defaultOut, index);
	    		editingDomain.getCommandStack().execute(addODmappingCmd);
				
				createTab(defaultOut);
			}
		});
		outNodeMenuMgr.add(new Action("Remove Out") {
			public void run() {
		    	if (model.getOut().size() <= 1) {
		    		return; //at least one out must be existed.
		    	}
		    	TabItem item = outTabFolder.getItem(outTabFolder.getSelectionIndex());
		    	
		    	EList<PageOutType> outs = model.getOut();
		    	for (PageOutType out: outs) {
		    		if (item.getText().equals(out.getName())) {
		    			Command cmd = RemoveCommand.create(editingDomain, model, 
			    				PagePackage.eINSTANCE.getUIPageType_Out(), 
			    				out);
		    			editingDomain.getCommandStack().execute(cmd);
		    			break;
		    		}
		    	}
		    	
		    	item.dispose();
			}
		});
		
	}

	private void createTab(final PageOutType out) {
		TabItem tbtmDefaultout = new TabItem(outTabFolder, SWT.NONE);
		tbtmDefaultout.setText(out.getName());
		
		Composite composite = new Composite(outTabFolder, SWT.NONE);
		tbtmDefaultout.setControl(composite);
		composite.setLayout(new GridLayout(1, false));
		
		final Text outMappingTxt = new Text(composite, SWT.BORDER | SWT.MULTI);
		GridData gd_outMappingTxt = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_outMappingTxt.minimumHeight = 80;
		outMappingTxt.setLayoutData(gd_outMappingTxt);
		if (out.getServerOperation() != null) {
			outMappingTxt.setText(out.getServerOperation().getExpressionString());
		}
		outMappingTxt.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				TabItem item = outTabFolder.getItem(outTabFolder.getSelectionIndex());
		    	
		    	EList<PageOutType> outs = model.getOut();
		    	for (PageOutType out: outs) {
		    		if (item.getText().equals(out.getName())) {
		    			ExpressionType expr = CommonFactory.eINSTANCE.createExpressionType();
		    			expr.setExpressionString(outMappingTxt.getText());
		    			
		    			Command addODmappingCmd = SetCommand.create(editingDomain, out, 
		    					PagePackage.eINSTANCE.getPageOutType_ServerOperation(), expr);
		    			editingDomain.getCommandStack().execute(addODmappingCmd);
		    			break;
		    		}
		    	}
			}
		});
	}
	
	public StructuredViewer getViewer() {
		if (viewer == null) {
			viewer = new InternalViewer(this);
		}
		return viewer;
	}
	
	public void setEditingDomain(AdapterFactoryEditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}
	
	public void init(UIPageType model) {
		this.model = model;
		
		inMappingTxt.setText(model.getIn().getServerOperation().getExpressionString());
		
		EList<PageOutType> outs = model.getOut();
		for (PageOutType out: outs) {
			createTab(out);
		}
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	

	class DialogCellEditorImpl extends DialogCellEditor {
		
		public DialogCellEditorImpl(Table mappingTable) {
			super(mappingTable);
		}
		
		@Override
		protected Object openDialogBox(Control cellEditorWindow) {
			if (selectedMapping instanceof SimpleComponentMappingType) {
				ODSimpleMappingDialog wd = new ODSimpleMappingDialog(
						cellEditorWindow.getShell(), (SimpleComponentMappingType)selectedMapping);
				return wd.open();
			} 
			ODDirectMappingDialog  wd = new ODDirectMappingDialog(
					cellEditorWindow.getShell(), (DirectComponentMappingType)selectedMapping);
			return wd.open();
			
		}
	}
	
	
	class InternalViewer extends StructuredViewer {

		private ISelection selection;
		
		private final Control control;
		
		public InternalViewer(Control control) {
			super();
			this.control = control;
			//this.setInput(model);
		}
		
		@Override
		public Control getControl() {
			return control;
		}

		@Override
		public ISelection getSelection() {
			return selection;
		}

		@Override
		protected void inputChanged(Object input, Object oldInput) {
			
			if (input instanceof ResourceSet) {
				ResourceSet resourceSet = (ResourceSet)input;
				PageResourceImpl pageResrc = (PageResourceImpl)resourceSet.getResources().get(0);
				EList<EObject> eobjects = pageResrc.getContents().get(0).eContents();
				for (EObject obj: eobjects) {
					if (obj instanceof UIPageType) {
						final UIPageType page = (UIPageType)obj;
				    	if (page.getIn() == null) {
						}
				    	if (page.getOut().size() == 0) {
				    	}
						init(page);
						return;
					}
				}
			} else if (input instanceof PageResourceImpl) {
				
			}
	    }
		
		@Override
		public void refresh() {
		}

		@Override
		public void setSelection(ISelection selection, boolean reveal) {
			this.selection = selection;
		}

		@Override
		protected Widget doFindInputItem(Object element) {
			return null;
		}

		@Override
		protected Widget doFindItem(Object element) {
			return null;
		}

		@Override
		protected void doUpdateItem(Widget item, Object element, boolean fullMap) {
			
		}

		@Override
		protected List getSelectionFromWidget() {
			return Collections.EMPTY_LIST;
		}

		@Override
		protected void internalRefresh(Object element) {
			
		}

		@Override
		public void reveal(Object element) {
			
		}

		@Override
		protected void setSelectionToWidget(List l, boolean reveal) {
			
		}
	}
}
