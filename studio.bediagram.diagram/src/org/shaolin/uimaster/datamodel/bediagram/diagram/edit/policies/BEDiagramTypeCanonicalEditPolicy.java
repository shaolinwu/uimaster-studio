package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramUpdater;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramLinkDescriptor;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramNodeDescriptor;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry;

/**
 * @generated
 */
public class BEDiagramTypeCanonicalEditPolicy extends
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy {

	/**
	 * @generated
	 */
	private Set myFeaturesToSynchronize;

	protected boolean shouldHandleNotificationEvent(Notification event) {
	    return false;
	} 
	
	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical
		// refresh for EditParts to add event listeners
		List/* [?] */c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((org.eclipse.gef.EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet/*
												 * [org.eclipse.emf. ecore
												 * .EStructuralFeature ]
												 */();
			myFeaturesToSynchronize.add(BEDiagramPackage.eINSTANCE
					.getBEDiagramType_CeEntity());
			myFeaturesToSynchronize.add(BEDiagramPackage.eINSTANCE
					.getBEDiagramType_BeEntity());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */

	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList/* [EObject] */result = new LinkedList();
		List/* [BediagramNodeDescriptor] */childDescriptors = BediagramDiagramUpdater
				.getSemanticChildren(viewObject);
		for (Iterator/* [BediagramNodeDescriptor] */it = childDescriptors
				.iterator(); it.hasNext();) {
			BediagramNodeDescriptor d = (BediagramNodeDescriptor) it.next();
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		return isMyDiagramElement(view)
				&& !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = BediagramVisualIDRegistry.getVisualID(view);
		return visualID == CENodeTypeEditPart.VISUAL_ID
				|| visualID == BENodeTypeEditPart.VISUAL_ID;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList createdViews = new LinkedList();
		List childDescriptors = BediagramDiagramUpdater
				.getSemanticChildren((View) getHost().getModel());
		LinkedList/* [View] */orphaned = new LinkedList();
		// we care to check only views we recognize as ours
		LinkedList/* [View] */knownViewChildren = new LinkedList();
		for (Iterator/* [View] */it = getViewChildren().iterator(); it.hasNext();) {
			View v = (View) it.next();
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(),
		// semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to
		// find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information -
		// i.e. if there are few views to reference same EObject, only last one
		// to answer isOrphaned == true will be used for the domain element
		// representation, see #cleanCanonicalSemanticChildren()
		for (Iterator/* [BediagramNodeDescriptor] */descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			BediagramNodeDescriptor next = (BediagramNodeDescriptor) descriptorsIterator
					.next();
			String hint = BediagramVisualIDRegistry.getType(next.getVisualID());
			LinkedList/* [View] */perfectMatch = new LinkedList();
			// both semanticElement and hint match that of NodeDescriptor.
			for (Iterator/* [View] */it = getViewChildren().iterator(); it
					.hasNext();) {
				View childView = (View) it.next();
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here,
						// but
						// may want to use not the first view but last one as a
						// 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside
						// #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to
												// create anything for the
												// NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for
				// further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our
		// diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated,
		// preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList viewDescriptors = new ArrayList(childDescriptors.size());
		for (Iterator it = childDescriptors
				.iterator(); it.hasNext();) {
			BediagramNodeDescriptor next = (BediagramNodeDescriptor) it.next();
			String hint = BediagramVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(
					next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, false,
					host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		org.eclipse.gef.commands.Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand
					.makeMutable(
							new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(
									host().getNotationView())).execute();
			executeCommand(cmd);

			List nl = (List) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		if (createdViews.size() > 1) {
			// perform a layout of the container
			org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand layoutCmd = 
					new org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand(
					host().getEditingDomain(), createdViews, host());
			executeCommand(new org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy(
					layoutCmd));
		}

		java.util.Collection createdConnectionViews = refreshConnections();
		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection/* [IAdaptable] */refreshConnections() {
		Domain2Notation domain2NotationMap = new Domain2Notation();
		Collection linkDescriptors = collectAllLinks(getDiagram(),
				domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = BediagramVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			if (nextDiagramLink.getSource() == null
					|| nextDiagramLink.getTarget() == null) {
				continue;
			}
			
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
					.hasNext();) {
				BediagramLinkDescriptor nextLinkDescriptor = (BediagramLinkDescriptor) linkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection collectAllLinks(View view,
			Domain2Notation domain2NotationMap) {
		if (!BEDiagramTypeEditPart.MODEL_ID.equals(BediagramVisualIDRegistry
				.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		LinkedList result = new LinkedList();
		switch (BediagramVisualIDRegistry.getVisualID(view)) {
		case BEDiagramTypeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(BediagramDiagramUpdater
						.getBEDiagramType_1000ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case BENodeTypeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(BediagramDiagramUpdater
						.getBENodeType_2002ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case CENodeTypeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(BediagramDiagramUpdater
						.getCENodeType_2001ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case BEMemberTypeEditPart.VISUAL_ID: {
			// TODO:
			break;
		}
		case CEMemberTypeEditPart.VISUAL_ID: {
			// TODO:
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/* [IAdaptable] */createConnections(
			Collection linkDescriptors, Domain2Notation domain2NotationMap) {
		LinkedList/* [IAdaptable] */adapters = new LinkedList();
		for (Iterator it = linkDescriptors.iterator(); it.hasNext();) {
			BediagramLinkDescriptor nextLinkDescriptor = (BediagramLinkDescriptor) it
					.next();
			org.eclipse.gef.EditPart sourceEditPart = getSourceEditPart(
					nextLinkDescriptor, domain2NotationMap);
			org.eclipse.gef.EditPart targetEditPart = getTargetEditPart(
					nextLinkDescriptor, domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					BediagramVisualIDRegistry.getType(nextLinkDescriptor
							.getVisualID()), ViewUtil.APPEND, false,
					((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			org.eclipse.gef.commands.Command cmd = targetEditPart
					.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	private org.eclipse.gef.EditPart getEditPart(EObject domainModelElement,
			Domain2Notation domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (org.eclipse.gef.EditPart) getHost().getViewer()
					.getEditPartRegistry().get(view);
		}
		return null;
	}

	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	private org.eclipse.gef.EditPart getSourceEditPart(
			UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getSource(), domain2NotationMap);
	}

	private org.eclipse.gef.EditPart getTargetEditPart(
			UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getDestination(), domain2NotationMap);
	}

	@SuppressWarnings("serial")
	protected static class Domain2Notation extends HashMap {
		public boolean containsDomainElement(EObject domainElement) {
			return this.containsKey(domainElement);
		}

		public View getHinted(EObject domainEObject, String hint) {
			return (View) this.get(domainEObject);
		}

		public void putView(EObject domainElement, View view) {
			if (!containsKey(view.getElement())) {
				this.put(domainElement, view);
			}
		}
	}
}
