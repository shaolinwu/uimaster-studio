package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.BendpointRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BEConnectionItemSemanticEditPolicy;

/**
 * @generated
 */
public class BEInheritConnectionEditPart extends ConnectionEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;
	
	private TransitionFigure transit;
	
	/**
	 * @generated
	 */
	public BEInheritConnectionEditPart(View view) {
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
	
	@Override
	public void setSelected(int value) {
		super.setSelected(value);
		if(value != SELECTED_NONE) {
			if (this.getSource() != null) {
				this.getSource().setSelected(value);
			}
			if (this.getTarget() != null) {
				this.getTarget().setSelected(value);
			}
		} else {
			if (this.getSource() != null) {
				this.getSource().setSelected(value);
			}
			if (this.getTarget() != null) {
				this.getTarget().setSelected(value);
			}
		}
	}
	
	public Command getCommand(Request _request) {
		if (_request instanceof BendpointRequest) {
			CompoundCommand cc = new CompoundCommand();
			cc.add(super.getCommand(_request));
			// bug fixed!
			cc.add(new Command() {
				public void execute() {
					refresh();
				}
			});
			//ConnectionEndpointTracker
			//SetConnectionBendpointsCommand
			return cc;
		} else {
			return super.getCommand(_request);
		}
	}
	
	/**
	 * @generated
	 */
	public class TransitionFigure extends PolylineConnectionEx {
		
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
			this.setConnectionRouter(new BendpointConnectionRouter());
			this.setLayoutManager(new DelegatingLayout());
			
			fFigureTransitionNameFigure = new WrappingLabel();
			fFigureTransitionNameFigure.setText("extends");

			this.add(fFigureTransitionNameFigure, new ConnectionLocator(this, ConnectionLocator.MIDDLE));
			
			PolygonDecoration decoration = new PolygonDecoration();
			decoration.setBackgroundColor(ColorConstants.black);
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
