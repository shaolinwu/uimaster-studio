package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.ContributionItemService;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramContextMenuProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BEFieldTypeItemSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.CENodeTypeItemSemanticEditPolicy;

/**
 * @generated
 */
public class DiagramEditorContextMenuProvider extends
		DiagramContextMenuProvider {

	/**
	 * @generated
	 */
	private IWorkbenchPart part;

	/**
	 * @generated
	 */
	private DeleteElementAction deleteAction;

	private EditPartViewer viewer;
	
	/**
	 * @generated
	 */
	public DiagramEditorContextMenuProvider(IWorkbenchPart part,
			EditPartViewer viewer) {
		super(part, viewer);
		this.part = part;
		this.viewer = viewer;
		
		deleteAction = new DeleteElementAction(part);
		deleteAction.init();
	}

	/**
	 * @generated
	 */
	public void dispose() {
		if (deleteAction != null) {
			deleteAction.dispose();
			deleteAction = null;
		}
		super.dispose();
	}
	
	protected IAction insertField = new Action("Insert Field") {
		
		public void run() {
			List selectedEditParts = viewer.getSelectedEditParts();
			if (selectedEditParts.size() > 0) {
				if (selectedEditParts.get(0) instanceof BEMemberTypeEditPart) {
					BEMemberTypeEditPart benodeEditPart = (BEMemberTypeEditPart)
							selectedEditParts.get(0);
					benodeEditPart.insert();
				} else if (selectedEditParts.get(0) instanceof CEMemberTypeEditPart) {
					CEMemberTypeEditPart cenodeEditPart = (CEMemberTypeEditPart)
							selectedEditParts.get(0);
					cenodeEditPart.insert();
				}
			}
		}
		
	};
	
	protected IAction fieldUp = new Action("Up") {
		
		public void run() {
			List selectedEditParts = viewer.getSelectedEditParts();
			if (selectedEditParts.size() > 0) {
				if (selectedEditParts.get(0) instanceof BEMemberTypeEditPart) {
					BEMemberTypeEditPart benodeEditPart = (BEMemberTypeEditPart)
							selectedEditParts.get(0);
					benodeEditPart.up();
				} else if (selectedEditParts.get(0) instanceof CEMemberTypeEditPart) {
					CEMemberTypeEditPart cenodeEditPart = (CEMemberTypeEditPart)
							selectedEditParts.get(0);
					cenodeEditPart.up();
				}
			}
		}
		
	};
	
	protected IAction fieldDown = new Action("Down") {
		
		public void run() {
			List selectedEditParts = viewer.getSelectedEditParts();
			if (selectedEditParts.size() > 0) {
				if (selectedEditParts.get(0) instanceof BEMemberTypeEditPart) {
					BEMemberTypeEditPart benodeEditPart = (BEMemberTypeEditPart)
							selectedEditParts.get(0);
					benodeEditPart.down();
				} else if (selectedEditParts.get(0) instanceof CEMemberTypeEditPart) {
					CEMemberTypeEditPart cenodeEditPart = (CEMemberTypeEditPart)
							selectedEditParts.get(0);
					cenodeEditPart.down();
				}
			}
		}
		
	};

	protected IAction addFieldAction = new Action("Add Field") {
		
		public void run() {
			List selectedEditParts = viewer.getSelectedEditParts();
			if (selectedEditParts.size() > 0) {
				if (selectedEditParts.get(0) instanceof BEMemberTypeEditPart) {
					BEMemberTypeEditPart benodeEditPart = (BEMemberTypeEditPart)
							selectedEditParts.get(0);
					BEFieldTypeItemSemanticEditPolicy.addField((BEMemberContainerEditPart)benodeEditPart.getParent());
				} else if (selectedEditParts.get(0) instanceof CEMemberTypeEditPart) {
					CEMemberTypeEditPart cenodeEditPart = (CEMemberTypeEditPart)
							selectedEditParts.get(0);
					CENodeTypeItemSemanticEditPolicy.addField((CEMemberContainerEditPart)cenodeEditPart.getParent());
				}
			}
		}
		
	};
	
	protected IAction genRDBAction = new Action("Generate RDB Schema Flow") {
		
		public void run() {
			/**
			Sometimes I find the need to programmatically invoke an Eclipse wizard.
			I've been using various ways of doing so, but have finally ended up with
			a more generic function. This will search through all the wizard registries
			and try to find a wizard with the specified identifier. If found the wizard
			will be opened. The code is shown below:
			*/
//			String id = "";
			 // First see if this is a "new wizard".
//			IWizardDescriptor descriptor = PlatformUI.getWorkbench()
//			   .getNewWizardRegistry().findWizard(id);
//			 // If not check if it is an "import wizard".
//			 if  (descriptor == null) {
//			   descriptor = PlatformUI.getWorkbench().getImportWizardRegistry()
//			   .findWizard(id);
//			 }
//			 // Or maybe an export wizard
//			 if  (descriptor == null) {
//			   descriptor = PlatformUI.getWorkbench().getExportWizardRegistry()
//			   .findWizard(id);
//			 }
//			 // Then if we have a wizard, open it.
//			 if  (descriptor != null) {
//				   final IWizard wizard = descriptor.createWizard();
//			 }
			
			IStructuredSelection selector = (IStructuredSelection)getViewer().getSelection();
			BEDiagramTypeEditPart part = (BEDiagramTypeEditPart)selector.getFirstElement();
			BEDiagramType model = (BEDiagramType) 
					((org.eclipse.gmf.runtime.notation.Diagram)part.getModel()).getElement();
			final RDBSchemaWizard wizard = new RDBSchemaWizard(model, selector);
			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
				public void run() {
					Shell activeShell = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell();
					WizardDialog wd = new WizardDialog(activeShell, wizard);
					wd.setTitle("RDB Schema Generator");
					wd.open();
				}
			});
		}
		
	};
	
	protected IAction genPageFlowAction = new Action("Generate Page Flow") {
		
		public void run() {
			IStructuredSelection selector = (IStructuredSelection)getViewer().getSelection();
			BEDiagramTypeEditPart part = (BEDiagramTypeEditPart)selector.getFirstElement();
			BEDiagramType model = (BEDiagramType) 
					((org.eclipse.gmf.runtime.notation.Diagram)part.getModel()).getElement();
			final PageFlowWizard wizard = new PageFlowWizard(model, selector);
			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
				public void run() {
					Shell activeShell = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell();
					WizardDialog wd = new WizardDialog(activeShell, wizard);
					wd.setTitle("Page Flow Generator");
					wd.open();
				}
			});
		}
		
	};
	
	protected IAction genBeCeCode = new Action("Generate Java Code") {
		
		public void run() {
			//TODO:
		}
		
	};
	
	protected IAction importJavaClass = new Action("Import Java Classes") {
		
		public void run() {
			IStructuredSelection selector = (IStructuredSelection)getViewer().getSelection();
			BEDiagramTypeEditPart part = (BEDiagramTypeEditPart)selector.getFirstElement();
			BEDiagramType model = (BEDiagramType) 
					((org.eclipse.gmf.runtime.notation.Diagram)part.getModel()).getElement();
			final ImportJavaClassWizard wizard = new ImportJavaClassWizard(model, selector);
			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
				public void run() {
					Shell activeShell = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell();
					WizardDialog wd = new WizardDialog(activeShell, wizard);
					wd.setTitle("Import Java Classes Wizard");
					wd.open();
				}
			});
		}
		
	};
	
	protected IAction importUMLClass = new Action("Import UML Classes") {
		public void run() {
			Shell activeShell = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell();
			MessageBox wd = new MessageBox(activeShell, SWT.ICON_INFORMATION);
			wd.setMessage("TODO: constructing...");
			wd.open();
		}
	};
	
	/**
	 * @generated
	 */
	public void buildContextMenu(final IMenuManager menu) {
		getViewer().flush();
		
		try {
			if (getViewer().getSelection() instanceof IStructuredSelection) {
			
				IStructuredSelection selector = (IStructuredSelection)getViewer().getSelection();
				Object obj = selector.getFirstElement();
				if (obj instanceof BEMemberContainerEditPart 
						|| obj instanceof CEMemberContainerEditPart) {
					TransactionUtil.getEditingDomain(
					(EObject) getViewer().getContents().getModel())
					.runExclusive(new Runnable() {

						public void run() {
							ContributionItemService
									.getInstance()
									.contributeToPopupMenu(
											DiagramEditorContextMenuProvider.this,
											part);
							menu.remove(ActionIds.ACTION_DELETE_FROM_MODEL);
							menu.appendToGroup("editGroup", deleteAction);
						}
					});
					
					return;
				} 
				if (obj instanceof BEMemberTypeEditPart 
						|| obj instanceof CEMemberTypeEditPart) {
					TransactionUtil.getEditingDomain(
					(EObject) getViewer().getContents().getModel())
					.runExclusive(new Runnable() {

						public void run() {
							ContributionItemService
									.getInstance()
									.contributeToPopupMenu(
											DiagramEditorContextMenuProvider.this,
											part);
							menu.appendToGroup("addGroup", fieldUp);
							menu.appendToGroup("addGroup", fieldDown);
							menu.appendToGroup("addGroup", insertField);
							menu.appendToGroup("addGroup", addFieldAction);
							//menu.appendToGroup("editGroup", deleteAction);
						}
					});
					
					return;
				} 
				if (obj instanceof BEDiagramTypeEditPart) {
					TransactionUtil.getEditingDomain(
					(EObject) getViewer().getContents().getModel())
					.runExclusive(new Runnable() {

						public void run() {
							ContributionItemService
									.getInstance()
									.contributeToPopupMenu(
											DiagramEditorContextMenuProvider.this,
											part);
							menu.add(new Separator()); 
							menu.add(new GroupMarker("importModeGroup"));
							menu.appendToGroup("importModeGroup", importUMLClass);
							menu.appendToGroup("importModeGroup", importJavaClass);
							menu.add(new Separator()); 
							menu.add(new GroupMarker("generatorGroup"));
							menu.appendToGroup("generatorGroup", genBeCeCode);
							menu.appendToGroup("generatorGroup", genPageFlowAction);
							menu.appendToGroup("generatorGroup", genRDBAction);
						}
					});
					
					return;
				} 
				
			} 
			TransactionUtil.getEditingDomain(
					(EObject) getViewer().getContents().getModel())
					.runExclusive(new Runnable() {

						public void run() {
							ContributionItemService
									.getInstance()
									.contributeToPopupMenu(
											DiagramEditorContextMenuProvider.this,
											part);
							menu.remove(ActionIds.ACTION_DELETE_FROM_MODEL);
							menu.appendToGroup("editGroup", deleteAction);
						}
					});
		} catch (Exception e) {
			BediagramDiagramEditorPlugin.getInstance().logError(
					"Error building context menu", e);
		}
	}
}
