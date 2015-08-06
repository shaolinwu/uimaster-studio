package org.shaolin.uimaster.datamodel.common;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

public class SearchDiagramResource extends FilteredResourcesSelectionDialog {

	public static final String BEDIAGRAM = "*.bediagram";
	public static final String RDBDIAGRAM = "*.rdbdiagram";
	public static final String PAGEDIAGRAM = "*.pagediagram";
	
	public SearchDiagramResource(Shell shell, boolean multi, 
			IContainer container, String initPattern) {
		super(shell, multi, container, IResource.FILE);
		this.setInitialPattern(initPattern);
	}
	
	public SearchDiagramResource(Shell shell, String initPattern) {
		super(shell, false, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		this.setInitialPattern(initPattern);
	}
	
	
}
