package org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry;

/**
 * @generated
 */
public class PagediagramEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PagediagramVisualIDRegistry.getVisualID(view)) {

			case WebChunkTypeEditPart.VISUAL_ID:
				return new WebChunkTypeEditPart(view);

			case StartNodeTypeEditPart.VISUAL_ID:
				return new StartNodeTypeEditPart(view);

			case DisplayNodeTypeEditPart.VISUAL_ID:
				return new DisplayNodeTypeEditPart(view);

			case FlowNodeTypeEditPart.VISUAL_ID:
				return new FlowNodeTypeEditPart(view);

			case PageNodeTypeEditPart.VISUAL_ID:
				return new PageNodeTypeEditPart(view);

			case LogicNodeTypeEditPart.VISUAL_ID:
				return new LogicNodeTypeEditPart(view);

			case ConditionalOutTypeEditPart.VISUAL_ID:
				return new ConditionalOutTypeEditPart(view);

			case DisplayOutTypeEditPart.VISUAL_ID:
				return new DisplayOutTypeEditPart(view);

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
