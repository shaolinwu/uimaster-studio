package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.ListCompartment;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.FieldCompartmentEditPolicy;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.TableMemberContainerSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry;

/**
 * @generated
 */
public class TableMemberContainerEditPart extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2011;

	/**
	 * @generated
	 */
	public TableMemberContainerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TableMemberContainerSemanticEditPolicy());
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						RdbdiagramVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicy.LAYOUT_ROLE, 
				new FieldCompartmentEditPolicy(
						RDBDiagramPackage.Literals.TABLE_TYPE__COLUMN));
	}

	public String getCompartmentName() {
		return "Columns List";
	}
	
	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = 
				(ResizableCompartmentFigure)super.createFigure();
		result.setBorder(null);
		return result;
	}
	
	@Override
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	public TableType getTableNode() {
		TableType impl = null;
		ListCompartment model = ((ListCompartment) getModel());
		impl = (TableType)model.getElement();
		
		return impl;
	}
	
	protected void setRatio(Double ratio) {
		if (this.getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}
	
}
