package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.BendpointRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.JoinTableTypeItemSemanticEditPolicy;

/**
 * @generated
 */
public class JoinTableTypeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public JoinTableTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new JoinTableTypeItemSemanticEditPolicy());
	}
	
	public JoinTableType getJoinTable() {
		JoinTableType impl = null;
		Connector model = ((Connector) getModel());
		impl = (JoinTableType)model.getElement();
		return impl;
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
		return new JoinTableFigure(getJoinTable());
	}

	/**
	 * @generated
	 */
	public JoinTableFigure getPrimaryShape() {
		return (JoinTableFigure) getFigure();
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
	
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			getPrimaryShape().refresh();
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
			return cc;
		} 
		return super.getCommand(_request);
	}

	/**
	 * @generated
	 */
	public class JoinTableFigure extends PolylineConnectionEx {

		private WrappingLabel lineLabel;
		
		private WrappingLabel sourceLabel;
		
		private WrappingLabel targetLabel;
		
		private final JoinTableType model;
		
		public JoinTableFigure(JoinTableType model) {
			this.model = model;
			
			this.setLayoutManager(new DelegatingLayout());
			
			lineLabel = new WrappingLabel();
			lineLabel.setText(this.model.getName());
			sourceLabel = new WrappingLabel("1");
			targetLabel = new WrappingLabel("0..*");
			
			ConnectionEndpointLocator srcLocator = new ConnectionEndpointLocator(this, false);
			srcLocator.setUDistance(4);
			srcLocator.setVDistance(-4);
			ConnectionEndpointLocator tarLocator = new ConnectionEndpointLocator(this, true);
			tarLocator.setUDistance(5);
			tarLocator.setVDistance(-4);
			this.add(sourceLabel, srcLocator);
			this.add(lineLabel, new ConnectionLocator(this, ConnectionLocator.MIDDLE));
			this.add(targetLabel, tarLocator);
			
			this.setConnectionRouter(new BendpointConnectionRouter());
			this.setTargetDecoration(createTargetDecoration());
			
			refresh();
		}
		
		public void refresh() {
			sourceLabel.setText("1");
			targetLabel.setText("0..*");
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

	private final class CenterAnchor extends AbstractConnectionAnchor {
		public CenterAnchor(IFigure owner) {
			super(owner);
		}

		public Point getLocation(Point reference) {
			return getOwner().getBounds().getCenter();
		}
	}
	
	private static final int RADIUS = 20;
	
	public class TripAnchor extends AbstractConnectionAnchor {
		
		public TripAnchor(IFigure owner) {
			super(owner);
		}

		public Point getLocation(Point reference) {
			Point origin = getOwner().getBounds().getCenter();
			int Ax = Math.abs(reference.x - origin.x);
			int Ay = Math.abs(reference.y - origin.y);
			int divisor = Ax + Ay;
			if (divisor == 0)
				return origin;
			int x = (RADIUS * Ax) / divisor;
			int y = (RADIUS * Ay) / divisor;
			if (reference.x < origin.x)
				x = -x;
			if (reference.y < origin.y)
				y = -y;
			return new Point(origin.x + x, origin.y + y);
		}
	}
}
