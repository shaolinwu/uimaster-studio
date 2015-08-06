package org.shaolin.uimaster.datamodel.page.provider.ext;

import java.util.Collection;

public interface IItemActionMenu {
	
	public void collectNewActionDescriptors(
			Collection<Object> newChildDescriptors, Object object);
	
}
