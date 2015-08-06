package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BEConnectionItemSemanticEditPolicy;

/**
 * @generated
 */
public class BEConnectionEditPart extends ConnectionEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;
	
	private TransitionFigure transit;
	
	/**
	 * @generated
	 */
	public BEConnectionEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BEConnectionItemSemanticEditPolicy());
	}
	
	/**
	 * @generated
	 */
	public TransitionFigure getPrimaryShape() {
		return (TransitionFigure) getFigure();
	}

	@Override
	protected Connection createConnectionFigure() {
		if (transit == null) {
			transit = new TransitionFigure();
		}
		return transit;
	}
	
	/**
	 * @generated
	 */
	public class TransitionFigure extends PolylineConnectionEx {

		private final PointList ARROWHEAD = new PointList(
				new int[] { 0, 0, -2, 2, -2, 0, -2, -2, 0, 0 });
		
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionNameFigure;

		/**
		 * @generated
		 */
		public TransitionFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			
			this.setLayoutManager(new DelegatingLayout());
			
			fFigureTransitionNameFigure = new WrappingLabel();
			fFigureTransitionNameFigure.setText("extends");

//			BendpointLocator locator = new BendpointLocator(this, ConnectionLocator.MIDDLE);
//			locator.setRelativePosition(PositionConstants.WEST);
//			locator.setGap(5);
			this.add(fFigureTransitionNameFigure, new ConnectionLocator(this, ConnectionLocator.MIDDLE));
			
			PolygonDecoration decoration = new PolygonDecoration();
			decoration.setTemplate(ARROWHEAD);
			decoration.setBackgroundColor(ColorConstants.darkGray);
			this.setTargetDecoration(decoration);
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionNameFigure() {
			return fFigureTransitionNameFigure;
		}

	}
}
