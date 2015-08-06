package org.shaolin.uimaster.datamodel.bediagram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry;

/**
 * @generated
 */
public class BediagramNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 2004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof BediagramNavigatorItem) {
			BediagramNavigatorItem item = (BediagramNavigatorItem) element;
			return BediagramVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
