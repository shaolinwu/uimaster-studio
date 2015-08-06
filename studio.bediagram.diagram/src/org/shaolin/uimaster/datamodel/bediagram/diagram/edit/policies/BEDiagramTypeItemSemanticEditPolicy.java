package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands.BEFieldTypeAddCommand;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands.BENodeTypeAddCommand;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands.CEFieldTypeAddCommand;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands.CENodeTypeCreateCommand;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;

/**
 * @generated
 */
public class BEDiagramTypeItemSemanticEditPolicy extends
		BediagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BEDiagramTypeItemSemanticEditPolicy() {
		super(BediagramElementTypes.BEDiagramType_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BediagramElementTypes.CENodeType_2001 == req.getElementType()) {
			return getGEFWrapper(new CENodeTypeCreateCommand(req));
		}
		if (BediagramElementTypes.BENodeType_2002 == req.getElementType()) {
			return getGEFWrapper(new BENodeTypeAddCommand(req));
		}
		if (BediagramElementTypes.BENodeType_MemberType_2003 == req.getElementType()) {
			return getGEFWrapper(new BEFieldTypeAddCommand(req));
		}
		if (BediagramElementTypes.CENodeType_MemberType_2004 == req.getElementType()) {
			return getGEFWrapper(new CEFieldTypeAddCommand(req));
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
