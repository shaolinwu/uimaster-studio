	package org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator;

	/**
 * @generated
 */
public class PagediagramNavigatorLinkHelper implements org.eclipse.ui.navigator.ILinkHelper {

	/**
 * @generated
 */
private static org.eclipse.ui.IEditorInput getEditorInput(org.eclipse.gmf.runtime.notation.Diagram diagram) {
	org.eclipse.emf.ecore.resource.Resource diagramResource = diagram.eResource();
	for (org.eclipse.emf.ecore.EObject nextEObject : diagramResource.getContents()) {
		if (nextEObject == diagram) {
			return new org.eclipse.ui.part.FileEditorInput(org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(diagramResource));
		}
		if (nextEObject instanceof org.eclipse.gmf.runtime.notation.Diagram) {
			break;
		}
	}
	org.eclipse.emf.common.util.URI uri = org.eclipse.emf.ecore.util.EcoreUtil.getURI(diagram);
String editorName = uri.lastSegment() + '#' + diagram.eResource().getContents().indexOf(diagram);
org.eclipse.ui.IEditorInput editorInput = new org.eclipse.emf.common.ui.URIEditorInput(uri, editorName);
	return editorInput;
}

		/**
 * @generated
 */
public org.eclipse.jface.viewers.IStructuredSelection findSelection(org.eclipse.ui.IEditorInput anInput) {
	org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument document = org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin.getInstance().getDocumentProvider().getDiagramDocument(anInput);
		if (document == null) {
	return org.eclipse.jface.viewers.StructuredSelection.EMPTY;
}
org.eclipse.gmf.runtime.notation.Diagram diagram = document.getDiagram();
if (diagram == null || diagram.eResource() == null) {
	return org.eclipse.jface.viewers.StructuredSelection.EMPTY;
}
org.eclipse.core.resources.IFile file = org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(diagram.eResource());
if (file != null) {
		org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem item = new org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem(diagram, file, false);
		return new org.eclipse.jface.viewers.StructuredSelection(item);
}
	return org.eclipse.jface.viewers.StructuredSelection.EMPTY;
}
	
		/**
 * @generated
 */
public void activateEditor(org.eclipse.ui.IWorkbenchPage aPage, org.eclipse.jface.viewers.IStructuredSelection aSelection) {
	if (aSelection == null || aSelection.isEmpty()) {
		return;
	}
	if (false == aSelection.getFirstElement() instanceof org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramAbstractNavigatorItem) {
		return;
	}
		
	org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramAbstractNavigatorItem abstractNavigatorItem = (org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramAbstractNavigatorItem) aSelection.getFirstElement();
	org.eclipse.gmf.runtime.notation.View navigatorView = null;
	if (abstractNavigatorItem instanceof org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem) {
		navigatorView = ((org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem) abstractNavigatorItem).getView();
	} else if (abstractNavigatorItem instanceof org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorGroup) {
		org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorGroup navigatorGroup = (org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorGroup) abstractNavigatorItem;
		if (navigatorGroup.getParent() instanceof org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem) {
			navigatorView = ((org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem) navigatorGroup.getParent()).getView();
		}		}
	if (navigatorView == null) {
		return;
	}
	org.eclipse.ui.IEditorInput editorInput = getEditorInput(navigatorView.getDiagram());
	org.eclipse.ui.IEditorPart editor = aPage.findEditor(editorInput);
	if (editor == null) {
		return;
	}
	aPage.bringToTop(editor);
	if (editor instanceof org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor) {
		org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor diagramEditor = (org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor) editor;
		org.eclipse.emf.ecore.resource.ResourceSet diagramEditorResourceSet = diagramEditor.getEditingDomain().getResourceSet();
		org.eclipse.emf.ecore.EObject selectedView = diagramEditorResourceSet.getEObject(org.eclipse.emf.ecore.util.EcoreUtil.getURI(navigatorView), true);	
		if (selectedView == null) {
			return;
		}
		org.eclipse.gef.GraphicalViewer graphicalViewer = (org.eclipse.gef.GraphicalViewer) diagramEditor.getAdapter(org.eclipse.gef.GraphicalViewer.class);
		org.eclipse.gef.EditPart selectedEditPart = (org.eclipse.gef.EditPart) graphicalViewer.getEditPartRegistry().get(selectedView);
		if (selectedEditPart != null) {
			graphicalViewer.select(selectedEditPart);
		}
	}
}
	
	}
