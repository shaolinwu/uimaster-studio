package org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.policies.ConditionalOutTypeItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConditionalOutTypeEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public ConditionalOutTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ConditionalOutTypeItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ConditionalOutTypeFigure(getOutNode());
	}

	public ConditionalOutType getOutNode() {
		ConditionalOutType impl = null;
		Connector model = ((Connector) getModel());
		impl = (ConditionalOutType)model.getElement();
		return impl;
	}
	
	/**
	 * @generated
	 */
	public ConditionalOutTypeFigure getPrimaryShape() {
		return (ConditionalOutTypeFigure) getFigure();
	}

	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			EAttribute attr = (EAttribute)feature;
			if ("name".equals(attr.getName())){
				((ConditionalOutTypeFigure)this.getConnectionFigure()).refresh();
			}
		}
		super.handleNotificationEvent(event);
	}
	
	/**
	 * @generated
	 */
	public class ConditionalOutTypeFigure extends PolylineConnectionEx {

		private final PointList ARROWHEAD = new PointList(
				new int[] { 0, 0, -2, 2, -2, 0, -2, -2, 0, 0 });
		
		private WrappingLabel lineLabel;

		private ConditionalOutType model;
		
		public ConditionalOutTypeFigure(ConditionalOutType model) {
			this.model = model;
			
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			lineLabel = new WrappingLabel();
			lineLabel.setText(model.getName());

			this.add(lineLabel, 
					new ConnectionLocator(this, ConnectionLocator.MIDDLE));
			
			PolygonDecoration decoration = new PolygonDecoration();
			decoration.setTemplate(ARROWHEAD);
			decoration.setBackgroundColor(ColorConstants.darkGreen);
			this.setTargetDecoration(decoration);
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConditionalOutTypeNameFigure() {
			return lineLabel;
		}
		
		public void refresh() {
			lineLabel.setText(model.getName());
		}

	}

}
