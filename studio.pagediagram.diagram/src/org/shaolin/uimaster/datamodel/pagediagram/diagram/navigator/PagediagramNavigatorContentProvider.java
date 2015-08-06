	package org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator;

/**
 * @generated
 */
public class PagediagramNavigatorContentProvider implements org.eclipse.ui.navigator.ICommonContentProvider {

		/**
 * @generated
 */
private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
 * @generated
 */
private org.eclipse.jface.viewers.Viewer myViewer;

	/**
 * @generated
 */
private org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain myEditingDomain;

	/**
 * @generated
 */
private org.eclipse.emf.workspace.util.WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
 * @generated
 */
private Runnable myViewerRefreshRunnable;
	
	/**
 * @generated
 */
@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
public PagediagramNavigatorContentProvider() {
	org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain = org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory.INSTANCE.createEditingDomain();
myEditingDomain = (org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain) editingDomain;
myEditingDomain.setResourceToReadOnlyMap(new java.util.HashMap() {
	public Object get(Object key) {
		if (!containsKey(key)) {
			put(key, Boolean.TRUE);
		}
		return super.get(key);
	}
});
myViewerRefreshRunnable = new Runnable() {
	public void run() {
		if (myViewer != null) {
			myViewer.refresh();
		}
	}
};
myWorkspaceSynchronizer = new org.eclipse.emf.workspace.util.WorkspaceSynchronizer(editingDomain, new org.eclipse.emf.workspace.util.WorkspaceSynchronizer.Delegate() {
	public void dispose() {
	}

	public boolean handleResourceChanged(final org.eclipse.emf.ecore.resource.Resource resource) {
		unloadAllResources();
asyncRefresh();
return true;
	}
	
	public boolean handleResourceDeleted(org.eclipse.emf.ecore.resource.Resource resource) {
		unloadAllResources();
asyncRefresh();
return true;
	}
	
	public boolean handleResourceMoved(org.eclipse.emf.ecore.resource.Resource resource, final org.eclipse.emf.common.util.URI newURI) {
		unloadAllResources();
asyncRefresh();
return true;
	}
});
}

		/**
 * @generated
 */
public void dispose() {
	myWorkspaceSynchronizer.dispose();
	myWorkspaceSynchronizer = null;
	myViewerRefreshRunnable = null;
	myViewer = null;
	unloadAllResources();
	((org.eclipse.emf.transaction.TransactionalEditingDomain) myEditingDomain).dispose();
	myEditingDomain = null;
}
	
		/**
 * @generated
 */
public void inputChanged(org.eclipse.jface.viewers.Viewer viewer, Object oldInput, Object newInput) {
	myViewer = viewer;
}
	
	
	/**
 * @generated
 */
	void unloadAllResources() {
		for (org.eclipse.emf.ecore.resource.Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}
	
	/**
 * @generated
 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}
	
	/**
 * @generated
 */
public Object[] getElements(Object inputElement) {
	return getChildren(inputElement);
}
	
	/**
 * @generated
 */
public void restoreState(org.eclipse.ui.IMemento aMemento) {
}

/**
 * @generated
 */
public void saveState(org.eclipse.ui.IMemento aMemento) {
}
    
    /**
 * @generated
 */
public void init(org.eclipse.ui.navigator.ICommonContentExtensionSite aConfig) {
}
    
    	/**
 * @generated
 */
public Object[] getChildren(Object parentElement) {
	if (parentElement instanceof org.eclipse.core.resources.IFile) {
		org.eclipse.core.resources.IFile file = (org.eclipse.core.resources.IFile) parentElement;
org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
org.eclipse.emf.ecore.resource.Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
	java.util.ArrayList<org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem> result = new java.util.ArrayList<org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem>();
					java.util.ArrayList<org.eclipse.gmf.runtime.notation.View> topViews = new java.util.ArrayList<org.eclipse.gmf.runtime.notation.View>(resource.getContents().size());
		for (org.eclipse.emf.ecore.EObject o : resource.getContents()) {
			if (o instanceof org.eclipse.gmf.runtime.notation.View) {
				topViews.add((org.eclipse.gmf.runtime.notation.View) o);
			}
		}
					result.addAll(createNavigatorItems(selectViewsByType(topViews, org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID), file, false));
						return result.toArray();
   	} 
    	
   	if (parentElement instanceof org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorGroup) {
	org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorGroup group = (org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorGroup) parentElement;
return group.getChildren();
	} 
		
	if (parentElement instanceof org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem) {
	org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem navigatorItem = (org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem) parentElement;
if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
	return EMPTY_ARRAY;
}
return getViewChildren(navigatorItem.getView(), parentElement);
	}
		
		return EMPTY_ARRAY;
}
    
	/**
 * @generated
 */
private Object[] getViewChildren(org.eclipse.gmf.runtime.notation.View view, Object parentElement) {
   	switch (org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getVisualID(view)) {
	
case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID: {
	java.util.LinkedList<org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramAbstractNavigatorItem> result = new java.util.LinkedList<org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Diagram sv = (org.eclipse.gmf.runtime.notation.Diagram) view;
				org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorGroup links = new org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorGroup(
	org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.NavigatorGroupName_WebChunkType_1000_links,
	"icons/linksNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
				java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getType(org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.StartNodeTypeEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getType(org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayNodeTypeEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getType(org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.FlowNodeTypeEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getType(org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.PageNodeTypeEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getType(org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.LogicNodeTypeEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getDiagramLinksByType						(java.util.Collections.singleton(sv)					, org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getType(org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.ConditionalOutTypeEditPart.VISUAL_ID));
								links.addChildren(createNavigatorItems(connectedViews, links, false));
																	connectedViews = 						getDiagramLinksByType						(java.util.Collections.singleton(sv)					, org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getType(org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayOutTypeEditPart.VISUAL_ID));
								links.addChildren(createNavigatorItems(connectedViews, links, false));
															if (!links.isEmpty()) {		result.add(links);
					}			return result.toArray();
}
	}
	return EMPTY_ARRAY;
}
    
    /**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getLinksSourceByType(java.util.Collection<org.eclipse.gmf.runtime.notation.Edge> edges, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
 	for (org.eclipse.gmf.runtime.notation.Edge nextEdge : edges) {
 		org.eclipse.gmf.runtime.notation.View nextEdgeSource = nextEdge.getSource();
 		if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
 			result.add(nextEdgeSource);
 		}
 	}
 	return result;
}
	
/**
 * @generated
 */
 private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getLinksTargetByType(java.util.Collection<org.eclipse.gmf.runtime.notation.Edge> edges, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
 	for (org.eclipse.gmf.runtime.notation.Edge nextEdge : edges) {
 		org.eclipse.gmf.runtime.notation.View nextEdgeTarget = nextEdge.getTarget();
 		if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
 			result.add(nextEdgeTarget);
 		}
 	}
 	return result;
}

/**
 * @generated
 */
 private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getOutgoingLinksByType(java.util.Collection<? extends org.eclipse.gmf.runtime.notation.View> nodes, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
 	for (org.eclipse.gmf.runtime.notation.View nextNode : nodes) {
		result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
 	}
 	return result;
}
	
/**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getIncomingLinksByType(java.util.Collection<? extends org.eclipse.gmf.runtime.notation.View> nodes, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
 	for (org.eclipse.gmf.runtime.notation.View nextNode : nodes) {
		result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
 	}
 	return result;
}
	
/**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getChildrenByType(java.util.Collection<? extends org.eclipse.gmf.runtime.notation.View> nodes, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
	for (org.eclipse.gmf.runtime.notation.View nextNode : nodes) {
		result.addAll(selectViewsByType(nextNode.getChildren(), type));
	}
	return result;
}
	
/**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getDiagramLinksByType(java.util.Collection<org.eclipse.gmf.runtime.notation.Diagram> diagrams, String type) {
	java.util.ArrayList<org.eclipse.gmf.runtime.notation.View> result = new java.util.ArrayList<org.eclipse.gmf.runtime.notation.View>();
	for (org.eclipse.gmf.runtime.notation.Diagram nextDiagram : diagrams) {
		result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
	}
	return result;
}

// TODO refactor as static method
/**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> selectViewsByType(java.util.Collection<org.eclipse.gmf.runtime.notation.View> views, String type) {
	java.util.ArrayList<org.eclipse.gmf.runtime.notation.View> result = new java.util.ArrayList<org.eclipse.gmf.runtime.notation.View>();
	for (org.eclipse.gmf.runtime.notation.View nextView : views) {
		if (type.equals(nextView.getType()) && isOwnView(nextView)) {
			result.add(nextView);
		}
	}
	return result;
}
	
/**
 * @generated
 */
private boolean isOwnView(org.eclipse.gmf.runtime.notation.View view) {
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID.equals(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getModelID(view));
}
	
/**
 * @generated
 */
private java.util.Collection<org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem> createNavigatorItems(java.util.Collection<org.eclipse.gmf.runtime.notation.View> views, Object parent, boolean isLeafs) {
	java.util.ArrayList<org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem> result = new java.util.ArrayList<org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem>(views.size());
	for (org.eclipse.gmf.runtime.notation.View nextView : views) {
		result.add(new org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramNavigatorItem(nextView, parent, isLeafs));
	}
	return result;
}
		
	/**
 * @generated
 */
public Object getParent(Object element) {
	if (element instanceof org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramAbstractNavigatorItem) {
    	org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramAbstractNavigatorItem abstractNavigatorItem = (org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator.PagediagramAbstractNavigatorItem) element;
		return abstractNavigatorItem.getParent();
	}
	return null;
}
	
	/**
 * @generated
 */
public boolean hasChildren(Object element) {
	return element instanceof org.eclipse.core.resources.IFile || getChildren(element).length > 0;
}
    
    }
