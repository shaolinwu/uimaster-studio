package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;

/**
 * @generated
 */
public class BEConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public BEConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof BEObjRefType) {
			return false;
		}
//		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
//			return canReorientSource();
//		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		return false;
	}
	
	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		return true;
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
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
	protected CommandResult reorientTarget() throws ExecutionException {
		
		getLink().getTargetEntity().setEntityName(this.getNewTarget().getEntityName());
		
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected BEObjRefType getLink() {
		return (BEObjRefType) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected BusinessEntityType getOldSource() {
		return (BusinessEntityType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected BusinessEntityType getNewSource() {
		return (BusinessEntityType) newEnd;
	}

	/**
	 * @generated
	 */
	protected BusinessEntityType getOldTarget() {
		return (BusinessEntityType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected BusinessEntityType getNewTarget() {
		return (BusinessEntityType) newEnd;
	}
}
