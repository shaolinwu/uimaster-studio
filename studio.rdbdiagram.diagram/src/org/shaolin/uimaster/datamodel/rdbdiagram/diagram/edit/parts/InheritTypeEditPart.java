package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts;

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
import org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.InheritTypeItemSemanticEditPolicy;

/**
 * @generated
 */
public class InheritTypeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public InheritTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InheritTypeItemSemanticEditPolicy());
	}

	public InheritAssociationType getInherit() {
		InheritAssociationType impl = null;
		Connector model = ((Connector) getModel());
		impl = (InheritAssociationType)model.getElement();
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new TableTypeInheritFigure(getInherit());
	}

	/**
	 * @generated
	 */
	public TableTypeInheritFigure getPrimaryShape() {
		return (TableTypeInheritFigure) getFigure();
	}
	
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			getPrimaryShape().refresh();
			return;
		}
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class TableTypeInheritFigure extends PolylineConnectionEx {

		private final PointList ARROWHEAD = new PointList(
				new int[] { 0, 0, -1, 1, -1, 0, -1, -1, 0, 0 });
		
		private WrappingLabel lineLabel;
		
		private final InheritAssociationType model;
		
		public TableTypeInheritFigure(InheritAssociationType model) {
			this.model = model;
			
			lineLabel = new WrappingLabel();
			lineLabel.setText(this.model.getName());
			this.add(lineLabel, new ConnectionLocator(this, ConnectionLocator.MIDDLE));
			this.setTargetDecoration(updateTargetAsAllow());
		}
		
		public void refresh() {
			lineLabel.setText(this.model.getName());
		}

		private PolygonDecoration updateTargetAsAllow() {
			PolygonDecoration decoration = new PolygonDecoration();
			decoration.setTemplate(ARROWHEAD);
			decoration.setBackgroundColor(ColorConstants.black);
			return decoration;
		}

	}

}
