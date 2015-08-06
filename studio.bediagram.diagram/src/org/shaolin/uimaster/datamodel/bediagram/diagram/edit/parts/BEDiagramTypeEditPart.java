package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BEDiagramTypeCanonicalEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BEDiagramTypeItemSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry;

/**
 * @generated
 */
public class BEDiagramTypeEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Bediagram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public BEDiagramTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BEDiagramTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new BEDiagramTypeCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						BediagramVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	// How to change the color of the editor canvas?
	protected IFigure createFigure() {
		IFigure fig = super.createFigure();
//		fig.setBackgroundColor(ColorConstants.green);
//		fig.setOpaque(true);
		return fig;
	}
}
