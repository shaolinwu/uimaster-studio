package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEInheritConnectionEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEListAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.OandOAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;

/**
 * @generated
 */
public class BENodeTypeItemSemanticEditPolicy extends
		BediagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BENodeTypeItemSemanticEditPolicy() {
		super(BediagramElementTypes.BENodeType_2002);
	}

	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);

		EList<View> list = ((View)view.getChildren().get(0)).getChildren();
		for (View memeber: list) {
			for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
				Edge incomingLink = (Edge) it.next();
				if (BediagramVisualIDRegistry.getVisualID(incomingLink) == BEListAssociationEditPart.VISUAL_ID
						|| BediagramVisualIDRegistry.getVisualID(incomingLink) == OandOAssociationEditPart.VISUAL_ID) {
					DestroyElementRequest r = new DestroyElementRequest(
							incomingLink.getElement(), false);
					cmd.add(new DestroyElementCommand(r));
					cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
					continue;
				}
			}
		}
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (BediagramVisualIDRegistry.getVisualID(incomingLink) == BEInheritConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (BediagramVisualIDRegistry.getVisualID(outgoingLink) == BEInheritConnectionEditPart.VISUAL_ID) {
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
}
