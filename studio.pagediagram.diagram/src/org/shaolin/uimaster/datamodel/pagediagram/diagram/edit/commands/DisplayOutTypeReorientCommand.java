package org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands;

import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType;
import org.shaolin.uimaster.datamodel.pagediagram.NextType;
import org.shaolin.uimaster.datamodel.pagediagram.WebNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.policies.PagediagramBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class DisplayOutTypeReorientCommand extends
		org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final org.eclipse.emf.ecore.EObject oldEnd;

	/**
	 * @generated
	 */
	private final org.eclipse.emf.ecore.EObject newEnd;

	/**
	 * @generated
	 */
	public DisplayOutTypeReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof DisplayOutType) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof NextType && newEnd instanceof NextType)) {
			return false;
		}

		if (!(getLink().eContainer() instanceof WebNodeType)) {
			return false;
		}
		WebNodeType container = (WebNodeType) getLink()
				.eContainer();
		return PagediagramBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDisplayOutType_4002(container,
						getLink(), getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(
			org.eclipse.core.runtime.IProgressMonitor monitor,
			org.eclipse.core.runtime.IAdaptable info)
			throws org.eclipse.core.commands.ExecutionException {
		if (!canExecute()) {
			throw new org.eclipse.core.commands.ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientTarget()
			throws org.eclipse.core.commands.ExecutionException {
		getLink().getNext().setDestNode(getNewTarget().getName());
		return org.eclipse.gmf.runtime.common.core.command.CommandResult
				.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected DisplayOutType getLink() {
		return (DisplayOutType) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected WebNodeType getOldSource() {
		return (WebNodeType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected WebNodeType getNewSource() {
		return (WebNodeType) newEnd;
	}

	/**
	 * @generated
	 */
	protected WebNodeType getOldTarget() {
		return (WebNodeType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected WebNodeType getNewTarget() {
		return (WebNodeType) newEnd;
	}
}
