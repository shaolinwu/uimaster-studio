package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.shaolin.uimaster.datamodel.bediagram.BEComplexType;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.CEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.EntityType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * @generated
 */
public class OandOAssociationCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private final BEDiagramType container;

	/**
	 * @generated
	 */
	public OandOAssociationCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
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
		if (source != null && false == source instanceof MemberType) {
			return false;
		}
		if (target != null && !(target instanceof BusinessEntityType
				|| target instanceof ConstantEntityType)) {
			return false;
		}
		if (source == target) {
			return false;
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return canExist(getContainer(), getSource(), getTarget());
	}

	private boolean canExist(BEDiagramType container, 
			MemberType source, EntityType target) {
		return true;
	}
	
	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}
		
		BEDiagramType eContainer = (BEDiagramType)this.getTarget().eContainer();
		BEComplexType newE = null;
		if (getTarget() instanceof BusinessEntityType) {
			BEObjRefType newElement = BEDiagramFactory.eINSTANCE.createBEObjRefType();
			TargetEntityType refEntity = CommonFactory.eINSTANCE.createTargetEntityType();
			refEntity.setEntityName(eContainer.getBePackage() +"."+this.getTarget().getEntityName());
			newElement.setTargetEntity(refEntity);
	
			this.getSource().setType(newElement);
			newE = newElement;
		} else if (getTarget() instanceof ConstantEntityType) {
			CEObjRefType newElement = BEDiagramFactory.eINSTANCE.createCEObjRefType();
			TargetEntityType refEntity = CommonFactory.eINSTANCE.createTargetEntityType();
			refEntity.setEntityName(eContainer.getCePackage() +"."+this.getTarget().getEntityName());
			newElement.setTargetEntity(refEntity);
	
			this.getSource().setType(newElement);
			newE = newElement;
		} 
		
		doConfigure(newE, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newE);
		return CommandResult.newOKCommandResult(newE);

	}

	/**
	 * @generated
	 */
	protected void doConfigure(BEComplexType newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE,
				getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET,
				getTarget());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected MemberType getSource() {
		return (MemberType) source;
	}

	/**
	 * @generated
	 */
	protected EntityType getTarget() {
		return (EntityType) target;
	}

	/**
	 * @generated
	 */
	public BEDiagramType getContainer() {
		return container;
	}

	/**
	 * Default approach is to traverse ancestors of the source to find instance of container.
	 * Modify with appropriate logic.
	 * @generated
	 */
	private static BEDiagramType deduceContainer(EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof BEDiagramType) {
				return (BEDiagramType) element;
			}
		}
		return null;
	}

}
