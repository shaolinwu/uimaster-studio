package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.BendpointRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.OaOAssociationItemSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.WireBendpointEditPolicy;

/**
 * @generated
 */
public class OandOAssociationEditPart extends ConnectionEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;
	
	/**
	 * @generated
	 */
	public OandOAssociationEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OaOAssociationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,
				new WireBendpointEditPolicy());
	}
	
	/**
	 * @generated
	 */
	public TransitionFigure getPrimaryShape() {
		return (TransitionFigure) getFigure();
	}

	@Override
	protected Connection createConnectionFigure() {
		Connector connector = (Connector)this.getModel();
		/**
		BEDiagramTypeEditPart root = ((BEDiagramTypeEditPart)this.getRoot().getChildren().get(0));
		List<EditPart> children = root.getChildren();
		for (EditPart c : children) {
			if (c instanceof BENodeTypeEditPart) {
				if (((BENodeTypeEditPart)c).getModel() == connector.getTarget()) {
					this.setTarget(c);
					break;
				}
			} else if (c instanceof CENodeTypeEditPart) {
				if (((CENodeTypeEditPart)c).getModel() == connector.getTarget()) {
					this.setTarget(c);
					break;
				}
			}
		}
		*/
		return new TransitionFigure(connector, this.getSource(), this.getTarget());
	}
	
	@Override
	public void setSelected(int value) {
		super.setSelected(value);
		if(value != SELECTED_NONE) {
			this.getSource().setSelected(value);
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
	
	public void disconnect() {
		if (this.getSource() != null) {
			this.setSource(null);
		}
		if (this.getTarget() != null) {
			this.setTarget(null);
		}
	}
	
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			//getPrimaryShape().refresh();
			return;
		}
		super.handleNotificationEvent(event);
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
		} 
		return super.getCommand(_request);
	}
	
	public class TransitionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionNameFigure;

		private WrappingLabel sourceLabel;
		
		private WrappingLabel targetLabel;
		
		private final Connector dataModel;
		
		private final EditPart src;
		
		private final EditPart tar;
		
		/**
		 * @generated
		 */
		public TransitionFigure(Connector connector, EditPart src, EditPart tar) {
			this.dataModel = connector;
			this.src = src;
			this.tar = tar;
			
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			
			this.setLayoutManager(new DelegatingLayout());
			
			fFigureTransitionNameFigure = new WrappingLabel();
			sourceLabel = new WrappingLabel("1");
			targetLabel = new WrappingLabel("1");
			
			ConnectionEndpointLocator srcLocator = new ConnectionEndpointLocator(this, false);
			srcLocator.setUDistance(6);
			srcLocator.setVDistance(-4);
			ConnectionEndpointLocator tarLocator = new ConnectionEndpointLocator(this, true);
			tarLocator.setUDistance(5);
			tarLocator.setVDistance(-4);
			this.add(sourceLabel, srcLocator);
			this.add(fFigureTransitionNameFigure, new ConnectionLocator(this, ConnectionLocator.MIDDLE));
			this.add(targetLabel, tarLocator);
			
			this.setConnectionRouter(new BendpointConnectionRouter());
			updateTargetAsAllow();
		}
		
		public void refresh() {
			updateTargetAsAllow();
		}
		
		private void updateTargetAsAllow() {
			PolygonDecoration decoration = new PolygonDecoration();
			decoration.setBackgroundColor(ColorConstants.white);
			PointList points = new PointList();
			points.addPoint(0, 0);
			points.addPoint(-1, 1);
			points.addPoint(-2, 0);
			points.addPoint(-1, -1);
			points.addPoint(0, 0);
			decoration.setTemplate(points);
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
