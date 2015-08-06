package org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry;

/**
 * @generated
 */
public class PagediagramNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof PagediagramNavigatorItem) {
			PagediagramNavigatorItem item = (PagediagramNavigatorItem) element;
			return PagediagramVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
