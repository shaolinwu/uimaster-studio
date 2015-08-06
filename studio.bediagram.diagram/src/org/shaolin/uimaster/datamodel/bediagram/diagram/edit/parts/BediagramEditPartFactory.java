package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry;

/**
 * @generated
 */
public class BediagramEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (BediagramVisualIDRegistry.getVisualID(view)) {

			case BEDiagramTypeEditPart.VISUAL_ID:
				return new BEDiagramTypeEditPart(view);

			case CENodeTypeEditPart.VISUAL_ID:
				return new CENodeTypeEditPart(view);
				
			case CEMemberContainerEditPart.VISUAL_ID:
				return new CEMemberContainerEditPart(view);
				
			case CEMemberTypeEditPart.VISUAL_ID:
				return new CEMemberTypeEditPart(view);

			case BENodeTypeEditPart.VISUAL_ID:
				return new BENodeTypeEditPart(view);
				
			case BEMemberContainerEditPart.VISUAL_ID:
				return new BEMemberContainerEditPart(view);
				
			case BEMemberTypeEditPart.VISUAL_ID:
				return new BEMemberTypeEditPart(view);
				
			case BEInheritConnectionEditPart.VISUAL_ID:
				return new BEInheritConnectionEditPart(view);
				
			case BEListAssociationEditPart.VISUAL_ID:
				return new BEListAssociationEditPart(view);
				
			case OandOAssociationEditPart.VISUAL_ID:
				return new OandOAssociationEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
