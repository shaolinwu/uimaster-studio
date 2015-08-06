package org.shaolin.uimaster.datamodel.pagediagram.diagram.part;

/**
 * @generated
 */
public class PagediagramDiagramActionBarContributor extends org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor {

	/**
 * @generated
 */
	protected Class getEditorClass() {
		return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditor.class;
	}

	/**
 * @generated
 */
	protected String getEditorId() {
		return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditor.ID;
	}
	
	/**
 * @generated
 */
	public void init(org.eclipse.ui.IActionBars bars, org.eclipse.ui.IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		org.eclipse.jface.action.IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(org.eclipse.ui.IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
	}
	}
