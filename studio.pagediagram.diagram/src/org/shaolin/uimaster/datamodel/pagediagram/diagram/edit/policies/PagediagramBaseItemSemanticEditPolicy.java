package org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.pagediagram.WebNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands.ConditionalOutTypeCreateCommand;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands.ConditionalOutTypeReorientCommand;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands.DisplayOutTypeCreateCommand;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.commands.DisplayOutTypeReorientCommand;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.ConditionalOutTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayOutTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes;

/**
 * @generated
 */
public class PagediagramBaseItemSemanticEditPolicy extends
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * 
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final org.eclipse.gmf.runtime.emf.type.core.IElementType myElementType;

	/**
	 * @generated
	 */
	protected PagediagramBaseItemSemanticEditPolicy(
			org.eclipse.gmf.runtime.emf.type.core.IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id. Add visual id of
	 * edited editpart to extended data of the request so command switch can
	 * decide what kind of diagram element is being edited. It is done in those
	 * cases when it's not possible to deduce diagram element kind from domain
	 * element.
	 * 
	 * @generated
	 */
	public Command getCommand(org.eclipse.gef.Request request) {
		if (request instanceof org.eclipse.gef.requests.ReconnectRequest) {
			Object view = ((org.eclipse.gef.requests.ReconnectRequest) request)
					.getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry
								.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * 
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			org.eclipse.gmf.runtime.common.core.command.ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(
					org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		org.eclipse.gmf.runtime.emf.type.core.IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(
				org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		org.eclipse.gmf.runtime.common.core.command.ICommand command = requestContextElementType
				.getEditCommand(request);
		request.setParameter(
				org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
				null);
		request.setParameter(
				org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				null);
		if (command != null) {
			if (!(command instanceof org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand)) {
				command = new org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand(
						getEditingDomain(), command.getLabel())
						.compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gmf.runtime.emf.type.core.IElementType getContextElementType(
			IEditCommandRequest request) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType requestContextElementType = org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	private Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (PagediagramElementTypes.DisplayOutType_4002 == req.getElementType()) {
			return getGEFWrapper(new DisplayOutTypeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (PagediagramElementTypes.ConditionalOutType_4001 == req.getElementType()) {
			return getGEFWrapper(new ConditionalOutTypeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	private Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (PagediagramElementTypes.DisplayOutType_4002 == req.getElementType()) {
			return getGEFWrapper(new DisplayOutTypeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (PagediagramElementTypes.ConditionalOutType_4001 == req.getElementType()) {
			return getGEFWrapper(new ConditionalOutTypeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);

		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (PagediagramVisualIDRegistry.getVisualID(incomingLink) == DisplayOutTypeEditPart.VISUAL_ID
					|| PagediagramVisualIDRegistry.getVisualID(incomingLink) == ConditionalOutTypeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (PagediagramVisualIDRegistry.getVisualID(outgoingLink) == DisplayOutTypeEditPart.VISUAL_ID
					|| PagediagramVisualIDRegistry.getVisualID(outgoingLink) == ConditionalOutTypeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}

		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands:
			// false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DisplayOutTypeEditPart.VISUAL_ID:
			return getGEFWrapper(new DisplayOutTypeReorientCommand(req));
		case ConditionalOutTypeEditPart.VISUAL_ID:
			return getGEFWrapper(new ConditionalOutTypeReorientCommand(req));
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(
			org.eclipse.gmf.runtime.common.core.command.ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * 
	 * @generated
	 */
	protected org.eclipse.emf.transaction.TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * 
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(
			org.eclipse.gmf.runtime.common.core.command.ICompositeCommand cmd,
			View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (java.util.Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(
					getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin
					.getInstance().setLinkConstraints(
							cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateConditionalOutType_4001(
				org.shaolin.uimaster.datamodel.pagediagram.WebNodeType container,
				WebNodeType source, WebNodeType target) {
			return canExistConditionalOutType_4001(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDisplayOutType_4002(
				org.shaolin.uimaster.datamodel.pagediagram.WebNodeType container,
				WebNodeType source, WebNodeType target) {
			return canExistDisplayOutType_4002(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistConditionalOutType_4001(
				org.shaolin.uimaster.datamodel.pagediagram.WebNodeType container,
				org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType linkInstance,
				WebNodeType source, WebNodeType target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistDisplayOutType_4002(
				org.shaolin.uimaster.datamodel.pagediagram.WebNodeType container,
				org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType linkInstance,
				WebNodeType source, WebNodeType target) {
			return true;
		}
	}

}
