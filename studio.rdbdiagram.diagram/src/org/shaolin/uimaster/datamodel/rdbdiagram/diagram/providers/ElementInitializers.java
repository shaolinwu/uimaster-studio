package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers;

import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = RdbdiagramDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			RdbdiagramDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
