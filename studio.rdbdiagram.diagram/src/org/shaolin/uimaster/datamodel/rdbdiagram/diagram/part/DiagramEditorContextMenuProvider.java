package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.ContributionItemService;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramContextMenuProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.TableMemberTypeItemSemanticEditPolicy;

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

	protected IAction addFieldAction = new Action("Add Column") {
		
		public void run() {
			List selectedEditParts = viewer.getSelectedEditParts();
			if (selectedEditParts.size() > 0) {
				if (selectedEditParts.get(0) instanceof TableMemberTypeEditPart) {
					TableMemberTypeEditPart editPart = (TableMemberTypeEditPart)
							selectedEditParts.get(0);
					TableMemberContainerEditPart p = (TableMemberContainerEditPart)editPart.getParent();
					TableMemberTypeItemSemanticEditPolicy.addColumn(p);
				} 
			}
		}
		
	};
	
	protected IAction insertField = new Action("Insert Field") {
		
		public void run() {
			List selectedEditParts = viewer.getSelectedEditParts();
			if (selectedEditParts.size() > 0) {
				if (selectedEditParts.get(0) instanceof TableMemberTypeEditPart) {
					TableMemberTypeEditPart benodeEditPart = (TableMemberTypeEditPart)
							selectedEditParts.get(0);
					benodeEditPart.insert();
				} 
			}
		}
		
	};
	
	protected IAction fieldUp = new Action("Up") {
		
		public void run() {
			List selectedEditParts = viewer.getSelectedEditParts();
			if (selectedEditParts.size() > 0) {
				if (selectedEditParts.get(0) instanceof TableMemberTypeEditPart) {
					TableMemberTypeEditPart benodeEditPart = (TableMemberTypeEditPart)
							selectedEditParts.get(0);
					benodeEditPart.up();
				} 
			}
		}
		
	};
	
	protected IAction fieldDown = new Action("Down") {
		
		public void run() {
			List selectedEditParts = viewer.getSelectedEditParts();
			if (selectedEditParts.size() > 0) {
				if (selectedEditParts.get(0) instanceof TableMemberTypeEditPart) {
					TableMemberTypeEditPart benodeEditPart = (TableMemberTypeEditPart)
							selectedEditParts.get(0);
					benodeEditPart.down();
				} 
			}
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
				if (obj instanceof TableMemberContainerEditPart) {
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
				if (obj instanceof TableMemberTypeEditPart) {
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
							menu.appendToGroup("editGroup", deleteAction);
						}
					});
					
					return;
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
			}
		} catch (Exception e) {
			RdbdiagramDiagramEditorPlugin.getInstance().logError(
					"Error building context menu", e);
		}
	}
}
