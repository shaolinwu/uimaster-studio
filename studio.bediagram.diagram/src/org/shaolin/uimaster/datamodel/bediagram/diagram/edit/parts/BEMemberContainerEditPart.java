package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

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
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.FieldCompartmentEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry;

/**
 * @generated
 */
public class BEMemberContainerEditPart extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2012;

	/**
	 * @generated
	 */
	public BEMemberContainerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						BediagramVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicy.LAYOUT_ROLE, 
				new FieldCompartmentEditPolicy(
						BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__MEMBER));
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

	public BusinessEntityType getBENode() {
		BusinessEntityType impl = null;
		ListCompartment model = ((ListCompartment) getModel());
		impl = (BusinessEntityType)model.getElement();
		
		return impl;
	}
	
	protected void setRatio(Double ratio) {
		if (this.getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}
	
}
