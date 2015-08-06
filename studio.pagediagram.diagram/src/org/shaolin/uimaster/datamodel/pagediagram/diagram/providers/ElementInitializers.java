package org.shaolin.uimaster.datamodel.pagediagram.diagram.providers;

import org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin;

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
		ElementInitializers cached = PagediagramDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			PagediagramDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
