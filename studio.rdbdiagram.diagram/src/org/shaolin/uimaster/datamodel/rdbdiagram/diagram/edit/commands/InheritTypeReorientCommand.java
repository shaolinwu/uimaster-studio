package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.commands;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.FKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.RdbdiagramBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InheritTypeReorientCommand extends
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
	public InheritTypeReorientCommand(
			org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof FKType) {
			return false;
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (getNewSource() == null) {
			return false;
		}

		if (!(getLink().eContainer() instanceof TableType)) {
			return false;
		}
		TableType container = (TableType) getLink().eContainer();
		ColumnType target = getTargetColumn(container, getLink());

		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (getNewTarget() == null) {
			return false;
		}

		if (!(getLink().eContainer() instanceof TableType)) {
			return false;
		}
		TableType container = (TableType) getLink().eContainer();
		ColumnType source = getColumn(container, getLink().getName());
		if (source == null) {
			return false;
		}
		
		return false;
	}

	private static ColumnType getTargetColumn(TableType container, FKType link) {
		String destTable = link.getRefTable().getEntityName();
		EList<EObject> entities = container.eContainer().eContents();
		for (EObject en : entities) {
			if (en instanceof TableType) {
				if (destTable.equals(((TableType) en).getEntityName())) {
					EList<ColumnType> columns = ((TableType) en).getColumn();
					for (ColumnType col : columns) {
						if (link.getColumnName().equals(col.getName())) {
							return col;
						}
					}
				}
			}

		}
		return null;
	}

	private ColumnType getColumn(TableType container, String name) {
		EList<ColumnType> columns = container.getColumn();
		for (ColumnType col: columns) {
			if (col.getName().equals(name)){
				return col;
			}
		}
		return null;
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
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientSource()
			throws org.eclipse.core.commands.ExecutionException {
//		getLink().setColumnName(getOldSource());
//		getLink().setColumnName(getNewSource());
//		
//		TODO:
		
		
		
		return org.eclipse.gmf.runtime.common.core.command.CommandResult
				.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientTarget()
			throws org.eclipse.core.commands.ExecutionException {
		
		TargetEntityType targetEntity = CommonFactory.eINSTANCE.createTargetEntityType();
		targetEntity.setEntityName(((TableType)(getNewTarget().eContainer())).getEntityName());
		getLink().setRefTable(targetEntity);
		getLink().setColumnName(getNewTarget().getName());
		
		return org.eclipse.gmf.runtime.common.core.command.CommandResult
				.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected FKType getLink() {
		return (FKType) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ColumnType getOldSource() {
		return (ColumnType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ColumnType getNewSource() {
		return (ColumnType) newEnd;
	}

	/**
	 * @generated
	 */
	protected ColumnType getOldTarget() {
		return (ColumnType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ColumnType getNewTarget() {
		return (ColumnType) newEnd;
	}
}
