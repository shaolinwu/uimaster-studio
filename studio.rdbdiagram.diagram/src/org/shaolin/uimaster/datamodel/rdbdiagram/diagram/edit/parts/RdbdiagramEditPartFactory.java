package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry;

/**
 * @generated
 */
public class RdbdiagramEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RdbdiagramVisualIDRegistry.getVisualID(view)) {

			case RDBDiagramTypeEditPart.VISUAL_ID:
				return new RDBDiagramTypeEditPart(view);

			case TableTypeEditPart.VISUAL_ID:
				return new TableTypeEditPart(view);
				
			case TableMemberContainerEditPart.VISUAL_ID:
				return new TableMemberContainerEditPart(view);
				
			case ViewTypeEditPart.VISUAL_ID:
				return new ViewTypeEditPart(view);

			case TableMemberTypeEditPart.VISUAL_ID:
				return new TableMemberTypeEditPart(view);
				
			case JoinTableTypeEditPart.VISUAL_ID:
				return new JoinTableTypeEditPart(view);
				
			case InheritTypeEditPart.VISUAL_ID:
				return new InheritTypeEditPart(view);
				

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
