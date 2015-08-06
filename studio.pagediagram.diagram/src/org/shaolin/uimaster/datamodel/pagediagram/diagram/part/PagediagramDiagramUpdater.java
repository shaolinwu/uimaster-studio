package org.shaolin.uimaster.datamodel.pagediagram.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType;
import org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.PageNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.StartNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.WebChunkType;
import org.shaolin.uimaster.datamodel.pagediagram.WebNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.ConditionalOutTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayOutTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.FlowNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.LogicNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.PageNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.StartNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes;

/**
 * @generated
 */
public class PagediagramDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<PagediagramNodeDescriptor> getSemanticChildren(
			org.eclipse.gmf.runtime.notation.View view) {
		switch (PagediagramVisualIDRegistry.getVisualID(view)) {
		case WebChunkTypeEditPart.VISUAL_ID:
			return getWebChunkType_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramNodeDescriptor> getWebChunkType_1000SemanticChildren(
			org.eclipse.gmf.runtime.notation.View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebChunkType modelElement = (WebChunkType) view.getElement();
		LinkedList<PagediagramNodeDescriptor> result = new LinkedList<PagediagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWebNode().iterator(); it
				.hasNext();) {
			WebNodeType childElement = (WebNodeType) it.next();
			int visualID = PagediagramVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartNodeTypeEditPart.VISUAL_ID) {
				result.add(new PagediagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DisplayNodeTypeEditPart.VISUAL_ID) {
				result.add(new PagediagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FlowNodeTypeEditPart.VISUAL_ID) {
				result.add(new PagediagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PageNodeTypeEditPart.VISUAL_ID) {
				result.add(new PagediagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogicNodeTypeEditPart.VISUAL_ID) {
				result.add(new PagediagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		switch (PagediagramVisualIDRegistry.getVisualID(view)) {
		case WebChunkTypeEditPart.VISUAL_ID:
			return getWebChunkType_1000ContainedLinks(view);
		case StartNodeTypeEditPart.VISUAL_ID:
			return getStartNodeType_2001ContainedLinks(view);
		case DisplayNodeTypeEditPart.VISUAL_ID:
			return getDisplayNodeType_2002ContainedLinks(view);
		case FlowNodeTypeEditPart.VISUAL_ID:
			return getFlowNodeType_2003ContainedLinks(view);
		case PageNodeTypeEditPart.VISUAL_ID:
			return getPageNodeType_2004ContainedLinks(view);
		case LogicNodeTypeEditPart.VISUAL_ID:
			return getLogicNodeType_2005ContainedLinks(view);
		case ConditionalOutTypeEditPart.VISUAL_ID:
			return getConditionalOutType_4001ContainedLinks(view);
		case DisplayOutTypeEditPart.VISUAL_ID:
			return getDisplayOutType_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getIncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		switch (PagediagramVisualIDRegistry.getVisualID(view)) {
		case StartNodeTypeEditPart.VISUAL_ID:
			return getStartNodeType_2001IncomingLinks(view);
		case DisplayNodeTypeEditPart.VISUAL_ID:
			return getDisplayNodeType_2002IncomingLinks(view);
		case FlowNodeTypeEditPart.VISUAL_ID:
			return getFlowNodeType_2003IncomingLinks(view);
		case PageNodeTypeEditPart.VISUAL_ID:
			return getPageNodeType_2004IncomingLinks(view);
		case LogicNodeTypeEditPart.VISUAL_ID:
			return getLogicNodeType_2005IncomingLinks(view);
		case ConditionalOutTypeEditPart.VISUAL_ID:
			return getConditionalOutType_4001IncomingLinks(view);
		case DisplayOutTypeEditPart.VISUAL_ID:
			return getDisplayOutType_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getOutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		switch (PagediagramVisualIDRegistry.getVisualID(view)) {
		case StartNodeTypeEditPart.VISUAL_ID:
			return getStartNodeType_2001OutgoingLinks(view);
		case DisplayNodeTypeEditPart.VISUAL_ID:
			return getDisplayNodeType_2002OutgoingLinks(view);
		case FlowNodeTypeEditPart.VISUAL_ID:
			return getFlowNodeType_2003OutgoingLinks(view);
		case PageNodeTypeEditPart.VISUAL_ID:
			return getPageNodeType_2004OutgoingLinks(view);
		case LogicNodeTypeEditPart.VISUAL_ID:
			return getLogicNodeType_2005OutgoingLinks(view);
		case ConditionalOutTypeEditPart.VISUAL_ID:
			return getConditionalOutType_4001OutgoingLinks(view);
		case DisplayOutTypeEditPart.VISUAL_ID:
			return getDisplayOutType_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getWebChunkType_1000ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getStartNodeType_2001ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		StartNodeType modelElement = (StartNodeType) view.getElement();
		LinkedList<PagediagramLinkDescriptor> result = new LinkedList<PagediagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConditionalOutType_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DisplayOutType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getDisplayNodeType_2002ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		DisplayNodeType modelElement = (DisplayNodeType) view.getElement();
		LinkedList<PagediagramLinkDescriptor> result = new LinkedList<PagediagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConditionalOutType_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DisplayOutType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getFlowNodeType_2003ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		FlowNodeType modelElement = (FlowNodeType) view.getElement();
		LinkedList<PagediagramLinkDescriptor> result = new LinkedList<PagediagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConditionalOutType_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DisplayOutType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getPageNodeType_2004ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		PageNodeType modelElement = (PageNodeType) view.getElement();
		LinkedList<PagediagramLinkDescriptor> result = new LinkedList<PagediagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConditionalOutType_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DisplayOutType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getLogicNodeType_2005ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		LogicNodeType modelElement = (LogicNodeType) view.getElement();
		LinkedList<PagediagramLinkDescriptor> result = new LinkedList<PagediagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConditionalOutType_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DisplayOutType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getConditionalOutType_4001ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getDisplayOutType_4002ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getStartNodeType_2001IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getDisplayNodeType_2002IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getFlowNodeType_2003IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getPageNodeType_2004IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getLogicNodeType_2005IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getConditionalOutType_4001IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getDisplayOutType_4002IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getStartNodeType_2001OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getDisplayNodeType_2002OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getFlowNodeType_2003OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getPageNodeType_2004OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getLogicNodeType_2005OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getConditionalOutType_4001OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PagediagramLinkDescriptor> getDisplayOutType_4002OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<PagediagramLinkDescriptor> getContainedTypeModelFacetLinks_ConditionalOutType_4001(
			WebNodeType container) {
		LinkedList<PagediagramLinkDescriptor> result = new LinkedList<PagediagramLinkDescriptor>();
		for (Iterator<?> links = container.getOut().iterator(); links
				.hasNext();) {
			org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject) links
					.next();
			if (linkObject == null || false == linkObject instanceof ConditionalOutType) {
				continue;
			}
			ConditionalOutType link = (ConditionalOutType) linkObject;
			if (ConditionalOutTypeEditPart.VISUAL_ID != PagediagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebNodeType src = container;
			String destNode = link.getNext().getDestNode();
			WebNodeType dest = getNode((WebChunkType)container.eContainer(), destNode);
			if (dest == null) {
				continue;
			}
			
			result.add(new PagediagramLinkDescriptor(src, dest, link,
					PagediagramElementTypes.ConditionalOutType_4001,
					ConditionalOutTypeEditPart.VISUAL_ID));
		}
		return result;
	}

	private static WebNodeType getNode(WebChunkType container, String nodeName) {
		EList<WebNodeType> nodes = container.getWebNode();
		for (WebNodeType node: nodes) {
			if (nodeName.equals(node.getName())) {
				return node;
			}
		}
		return null;
	}
	
	/**
	 * @generated
	 */
	private static Collection<PagediagramLinkDescriptor> getContainedTypeModelFacetLinks_DisplayOutType_4002(
			WebNodeType container) {
		LinkedList<PagediagramLinkDescriptor> result = new LinkedList<PagediagramLinkDescriptor>();
		for (Iterator<?> links = container.getOut().iterator(); links
				.hasNext();) {
			org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject) links
					.next();
			if (linkObject == null || false == linkObject instanceof DisplayOutType) {
				continue;
			}
			DisplayOutType link = (DisplayOutType) linkObject;
			if (DisplayOutTypeEditPart.VISUAL_ID != PagediagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebNodeType src = container;
			String destNode = link.getNext().getDestNode();
			WebNodeType dest = getNode((WebChunkType)container.eContainer(), destNode);
			if (dest == null) {
				continue;
			}
			
			result.add(new PagediagramLinkDescriptor(src, dest, link,
					PagediagramElementTypes.DisplayOutType_4002,
					DisplayOutTypeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.tooling.runtime.update.DiagramUpdater TYPED_INSTANCE = new org.eclipse.gmf.tooling.runtime.update.DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<PagediagramNodeDescriptor> getSemanticChildren(
				org.eclipse.gmf.runtime.notation.View view) {
			return PagediagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PagediagramLinkDescriptor> getContainedLinks(
				org.eclipse.gmf.runtime.notation.View view) {
			return PagediagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PagediagramLinkDescriptor> getIncomingLinks(
				org.eclipse.gmf.runtime.notation.View view) {
			return PagediagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PagediagramLinkDescriptor> getOutgoingLinks(
				org.eclipse.gmf.runtime.notation.View view) {
			return PagediagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
