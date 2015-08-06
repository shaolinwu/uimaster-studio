package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry;

/**
 * @generated
 */
public class RdbdiagramNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RdbdiagramNavigatorItem) {
			RdbdiagramNavigatorItem item = (RdbdiagramNavigatorItem) element;
			return RdbdiagramVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
