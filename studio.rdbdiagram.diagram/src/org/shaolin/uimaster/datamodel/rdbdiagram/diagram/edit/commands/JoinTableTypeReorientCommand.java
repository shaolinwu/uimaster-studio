package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.commands;

import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

/**
 * @generated
 */
public class JoinTableTypeReorientCommand extends
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
	public JoinTableTypeReorientCommand(
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
		if (false == getElementToEdit() instanceof JoinTableType) {
			return false;
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
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
		if (!(newEnd instanceof ColumnType)) {
			return false;
		}

		RDBDiagramType container = (RDBDiagramType) getLink().eContainer();
		ColumnType source = getSourceColumn(getLink());
		if (source == null) {
			return false;
		}
		
		return org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.RdbdiagramBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAssociationType_4003(container, getLink(),
						source, getNewTarget());
	}

	private static ColumnType getTargetColumn(JoinTableType link) {
		RDBDiagramType rdbDiagram = (RDBDiagramType)link.eContainer();
		for (TableType t: rdbDiagram.getTable()){
			if (t.getEntityName().equals(link.getTarTable())){
				for (ColumnType col: t.getColumn()) {
					if (col.getName().equals(link.getTarPKColumn())) {
						return col;
					}
				}
			}
		}
		return null;
	}

	private ColumnType getSourceColumn(JoinTableType link) {
		RDBDiagramType rdbDiagram = (RDBDiagramType)link.eContainer();
		for (TableType t: rdbDiagram.getTable()){
			if (t.getEntityName().equals(link.getSrcTable())){
				for (ColumnType col: t.getColumn()) {
					if (col.getName().equals(link.getSrcPKColumn())) {
						return col;
					}
				}
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
		return org.eclipse.gmf.runtime.common.core.command.CommandResult
				.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientTarget()
			throws org.eclipse.core.commands.ExecutionException {
		
		getLink().setTarPKColumn(getNewTarget().getName());
		
		return org.eclipse.gmf.runtime.common.core.command.CommandResult
				.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected JoinTableType getLink() {
		return (JoinTableType) getElementToEdit();
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
