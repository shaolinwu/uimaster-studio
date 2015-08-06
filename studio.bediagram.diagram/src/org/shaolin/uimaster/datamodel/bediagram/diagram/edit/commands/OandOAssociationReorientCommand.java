package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.shaolin.uimaster.datamodel.bediagram.BEComplexType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.CEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.ObjectRefType;

/**
 * @generated
 */
public class OandOAssociationReorientCommand extends EditElementCommand {

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
	public OandOAssociationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ObjectRefType) {
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
		if (newEnd instanceof BusinessEntityType) {
			return true;
		}
		return false;
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
		
		String newRefEntity = this.getNewTarget().getEntityName();
		if (getLink() instanceof BEObjRefType) {
			((BEObjRefType)getLink()).getTargetEntity().setEntityName(newRefEntity);
		} else if (getLink() instanceof CEObjRefType) {
			((CEObjRefType)getLink()).getTargetEntity().setEntityName(newRefEntity);
		} 
		
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected BEComplexType getLink() {
		return (BEComplexType) getElementToEdit();
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
