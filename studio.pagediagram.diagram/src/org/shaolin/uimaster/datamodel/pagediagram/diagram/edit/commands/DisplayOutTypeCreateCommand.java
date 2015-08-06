package org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType;
import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramFactory;
import org.shaolin.uimaster.datamodel.pagediagram.WebNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.policies.PagediagramBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class DisplayOutTypeCreateCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {
	
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
	private final WebNodeType container;

	/**
 * @generated
 */
	public DisplayOutTypeCreateCommand(CreateRelationshipRequest request, org.eclipse.emf.ecore.EObject source, org.eclipse.emf.ecore.EObject target) {
		super(request.getLabel(), null, request);
			this.source = source;
	this.target = target;
	container = deduceContainer(source, target);
	}
	
	/**
 * @generated
 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof WebNodeType) {
			return false;
		}
		if (target != null && false == target instanceof WebNodeType) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
			if (getContainer() == null) {
		return false;
	}
	return PagediagramBaseItemSemanticEditPolicy.getLinkConstraints().canCreateDisplayOutType_4002(getContainer(), getSource(), getTarget());
	}

	
	/**
 * @generated
 */
	protected CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
		if (!canExecute()) {
			throw new org.eclipse.core.commands.ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}
		
		DisplayOutType newElement = PageDiagramFactory.eINSTANCE.createDisplayOutType();
		getContainer().getOut().add(newElement);					
		newElement.setName(getSource().getName() + "-linksTo-" + getTarget().getName());				
		newElement.setNext(PageDiagramFactory.eINSTANCE.createNextType());
		newElement.getNext().setDestNode(getTarget().getName());
		
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}


		/**
 * @generated
 */
	protected void doConfigure(DisplayOutType newElement, org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
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
	protected WebNodeType getSource() {
		return (WebNodeType)source;
	}

	/**
 * @generated
 */
	protected WebNodeType getTarget() {
		return (WebNodeType) target;
	}
	
	/**
 * @generated
 */
	public WebNodeType getContainer() {
		return container;
	}

	/**
 * Default approach is to traverse ancestors of the source to find instance of container.
 * Modify with appropriate logic.
 * @generated
 */
	private static WebNodeType deduceContainer(org.eclipse.emf.ecore.EObject source, org.eclipse.emf.ecore.EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (org.eclipse.emf.ecore.EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof WebNodeType) {
				return (WebNodeType) element;
			}
		}
		return null;
	}

}
