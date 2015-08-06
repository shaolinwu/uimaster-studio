package org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands.DisplayNodeTypeCreateCommand;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands.FlowNodeTypeCreateCommand;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands.LogicNodeTypeCreateCommand;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands.PageNodeTypeCreateCommand;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands.StartNodeTypeCreateCommand;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes;

/**
 * @generated
 */
public class WebChunkTypeItemSemanticEditPolicy extends
		PagediagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WebChunkTypeItemSemanticEditPolicy() {
		super(PagediagramElementTypes.WebChunkType_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PagediagramElementTypes.StartNodeType_2001 == req.getElementType()) {
			return getGEFWrapper(new StartNodeTypeCreateCommand(req));
		}
		if (PagediagramElementTypes.DisplayNodeType_2002 == req
				.getElementType()) {
			return getGEFWrapper(new DisplayNodeTypeCreateCommand(req));
		}
		if (PagediagramElementTypes.FlowNodeType_2003 == req.getElementType()) {
			return getGEFWrapper(new FlowNodeTypeCreateCommand(req));
		}
		if (PagediagramElementTypes.PageNodeType_2004 == req.getElementType()) {
			return getGEFWrapper(new PageNodeTypeCreateCommand(req));
		}
		if (PagediagramElementTypes.LogicNodeType_2005 == req.getElementType()) {
			return getGEFWrapper(new LogicNodeTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
