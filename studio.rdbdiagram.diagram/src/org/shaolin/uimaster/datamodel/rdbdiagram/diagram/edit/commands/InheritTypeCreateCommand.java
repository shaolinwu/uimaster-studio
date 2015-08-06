package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.commands;

import org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

/**
 * @generated
 */
public class InheritTypeCreateCommand extends
		org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {

	/**
	 * @generated
	 */
	private final org.eclipse.emf.ecore.EObject source;

	/**
	 * @generated
	 */
	private final org.eclipse.emf.ecore.EObject target;

	/**
	 * @generated
	 */
	private final TableType container;

	/**
	 * @generated
	 */
	public InheritTypeCreateCommand(
			org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest request,
			org.eclipse.emf.ecore.EObject source,
			org.eclipse.emf.ecore.EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		this.container = deduceContainer(source);
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof TableType) {
			return false;
		}
		if (target != null && false == target instanceof TableType) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined
							// yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return true;
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
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		InheritAssociationType newElement = RDBDiagramFactory.eINSTANCE.createInheritAssociationType();
		newElement.setName(getSource().getEntityName() + "_InheritAssociation");
		newElement.setParentTable(getTarget().getEntityName());
		getSource().setInheritAsscociation(newElement);
		
		doConfigure(newElement, monitor, info);
		((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest())
				.setNewElement(newElement);
		return org.eclipse.gmf.runtime.common.core.command.CommandResult
				.newOKCommandResult(newElement);

	}

	/**
	 * @generated
	 */
	protected void doConfigure(
			InheritAssociationType newElement,
			org.eclipse.core.runtime.IProgressMonitor monitor,
			org.eclipse.core.runtime.IAdaptable info)
			throws org.eclipse.core.commands.ExecutionException {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = ((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest())
				.getElementType();
		org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest configureRequest = new org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest
				.setClientContext(((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest())
						.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest
				.setParameter(
						org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest.SOURCE,
						getSource());
		configureRequest
				.setParameter(
						org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest.TARGET,
						getTarget());
		org.eclipse.gmf.runtime.common.core.command.ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(org.eclipse.emf.ecore.EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected TableType getSource() {
		return (TableType) source;
	}

	/**
	 * @generated
	 */
	protected TableType getTarget() {
		return (TableType) target;
	}

	/**
	 * @generated
	 */
	public TableType getContainer() {
		return container;
	}

	/**
	 * Default approach is to traverse ancestors of the source to find instance
	 * of container. Modify with appropriate logic.
	 * 
	 * @generated
	 */
	private static TableType deduceContainer(
			org.eclipse.emf.ecore.EObject source) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		return (TableType) source;
	}

}
