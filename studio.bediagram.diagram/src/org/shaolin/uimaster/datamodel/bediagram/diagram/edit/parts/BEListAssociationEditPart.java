package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ChopboxAnchor;
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
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.BendpointRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.bediagram.BECollectionType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BEListAssociationItemSemanticEditPolicy;

/**
 * @generated
 */
public class BEListAssociationEditPart extends ConnectionEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;
	
	private TransitionFigure transit;
	
	/**
	 * @generated
	 */
	public BEListAssociationEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BEListAssociationItemSemanticEditPolicy());
	}
	
	public BECollectionType getAssociation() {
		BECollectionType impl = null;
		Connector model = ((Connector) getModel());
		impl = (BECollectionType)model.getElement();
		return impl;
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
	
	/**
	 * @generated
	 */
	public TransitionFigure getPrimaryShape() {
		return (TransitionFigure) getFigure();
	}

	@Override
	protected Connection createConnectionFigure() {
		if (transit == null) {
			Connector connector = (Connector)this.getModel();
			BEDiagramTypeEditPart root = ((BEDiagramTypeEditPart)this.getRoot().getChildren().get(0));
			List<EditPart> children = root.getChildren();
			for (EditPart c : children) {
				if (c instanceof BENodeTypeEditPart) {
					if (((BENodeTypeEditPart)c).getModel() == connector.getTarget()) {
						this.setTarget(c);
						break;
					}
				} 
			}
			
			transit = new TransitionFigure(getAssociation(), this.getSource(), this.getTarget());
		}
		return transit;
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
	
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			return;
		}
		super.handleNotificationEvent(event);
	}
	
	/**
	 * @generated
	 */
	public class TransitionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionNameFigure;

		private WrappingLabel sourceLabel;
		
		private WrappingLabel targetLabel;
		
		private final BECollectionType model;
		
		private final EditPart src;
		
		private final EditPart tar;
		
		/**
		 * @generated
		 */
		public TransitionFigure(BECollectionType model, EditPart src, EditPart tar) {
			this.model = model;
			this.src = src;
			this.tar = tar;
			
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			this.setConnectionRouter(new BendpointConnectionRouter());
			
			this.setLayoutManager(new DelegatingLayout());
			
			fFigureTransitionNameFigure = new WrappingLabel();
			sourceLabel = new WrappingLabel("1");
			targetLabel = new WrappingLabel("0..*");

			ConnectionEndpointLocator srcLocator = new ConnectionEndpointLocator(this, false);
			srcLocator.setUDistance(4);
			srcLocator.setVDistance(-4);
			ConnectionEndpointLocator tarLocator = new ConnectionEndpointLocator(this, true);
			tarLocator.setUDistance(5);
			tarLocator.setVDistance(-4);
			this.add(sourceLabel, srcLocator);
			this.add(fFigureTransitionNameFigure, new ConnectionLocator(this, ConnectionLocator.MIDDLE));
			this.add(targetLabel, tarLocator);
			
			if (this.src != null) {
				this.setSourceAnchor(new ChopboxAnchor(((BEMemberTypeEditPart)this.src).getFigure()));
			}
			if (this.tar != null) {
				this.setTargetAnchor(new ChopboxAnchor(((ShapeNodeEditPart)this.tar).getFigure()));
			}
			
			updateTargetAsAggregation();
		}
		
		public void refresh() {
		}
		
		private void updateTargetAsAggregation() {
			PolygonDecoration decoration = new PolygonDecoration();
			decoration.setBackgroundColor(ColorConstants.black);
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
