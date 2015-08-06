	package org.shaolin.uimaster.datamodel.pagediagram.diagram.part;

	/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PagediagramVisualIDRegistry {

		/**
 * @generated
 */
	private static final String DEBUG_KEY = "studio.diagram.diagram/debug/visualID";  //$NON-NLS-1$

		/**
 * @generated
 */
public static int getVisualID(org.eclipse.gmf.runtime.notation.View view) {
	if (view instanceof org.eclipse.gmf.runtime.notation.Diagram) {
		if (org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID.equals(view.getType())) {
			return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID;
		} else {
			return -1;
		}
	}
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getVisualID(view.getType());
}
	
		/**
 * @generated
 */
public static String getModelID(org.eclipse.gmf.runtime.notation.View view) {
	org.eclipse.gmf.runtime.notation.View diagram = view.getDiagram();
	while (view != diagram) {
		org.eclipse.emf.ecore.EAnnotation annotation = view.getEAnnotation("Shortcut");  //$NON-NLS-1$
		if (annotation != null) {
			return (String) annotation.getDetails().get("modelID");  //$NON-NLS-1$
		}
		view = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
	}
	return diagram != null ? diagram.getType() : null;
}
	
		/**
 * @generated
 */
public static int getVisualID(String type) {
	try {
		return Integer.parseInt(type);
	} catch (NumberFormatException e) {
		if (Boolean.TRUE.toString().equalsIgnoreCase(org.eclipse.core.runtime.Platform.getDebugOption(DEBUG_KEY))) {
			org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
		}
	}
	return -1;
}

	/**
 * @generated
 */
public static String getType(int visualID) {
	return Integer.toString(visualID);
}
	
		/**
 * @generated
 */
public static int getDiagramVisualID(org.eclipse.emf.ecore.EObject domainElement) {
	if (domainElement == null) {
		return -1;
	}
	if (org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE.getWebChunkType().isSuperTypeOf(domainElement.eClass()) && isDiagram((org.shaolin.uimaster.datamodel.pagediagram.WebChunkType) domainElement)) {
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID;
}
	return -1;
}
	
		/**
 * @generated
 */
public static int getNodeVisualID(org.eclipse.gmf.runtime.notation.View containerView, org.eclipse.emf.ecore.EObject domainElement) {
	if (domainElement == null) {
		return -1;
	}
	String containerModelID = org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getModelID(containerView);
	if (!org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID.equals(containerModelID)) { 
		return -1;
	}
	int containerVisualID;
	if (org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID.equals(containerModelID)) {
		containerVisualID = org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getVisualID(containerView);
	} else {
		if (containerView instanceof org.eclipse.gmf.runtime.notation.Diagram) {
			containerVisualID = org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID;		
		} else {
			return -1;
		}
	}
	switch (containerVisualID) {
			case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID:
	if (org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE.getStartNodeType().isSuperTypeOf(domainElement.eClass())) {
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.StartNodeTypeEditPart.VISUAL_ID;
}
if (org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE.getDisplayNodeType().isSuperTypeOf(domainElement.eClass())) {
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayNodeTypeEditPart.VISUAL_ID;
}
if (org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE.getFlowNodeType().isSuperTypeOf(domainElement.eClass())) {
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.FlowNodeTypeEditPart.VISUAL_ID;
}
if (org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE.getPageNodeType().isSuperTypeOf(domainElement.eClass())) {
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.PageNodeTypeEditPart.VISUAL_ID;
}
if (org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE.getLogicNodeType().isSuperTypeOf(domainElement.eClass())) {
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.LogicNodeTypeEditPart.VISUAL_ID;
}
	break;
							}
	return -1;
}
	
		/**
 * @generated
 */
public static boolean canCreateNode(org.eclipse.gmf.runtime.notation.View containerView, int nodeVisualID) {
	String containerModelID = org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getModelID(containerView);
	if (!org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID.equals(containerModelID)) { 
		return false;
	}
	int containerVisualID;
	if (org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID.equals(containerModelID)) {
		containerVisualID = org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getVisualID(containerView);
	} else {
		if (containerView instanceof org.eclipse.gmf.runtime.notation.Diagram) {
			containerVisualID = org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID;		
		} else {
			return false;
		}
	}
	switch (containerVisualID) {
		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID:
	if (org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.StartNodeTypeEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayNodeTypeEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.FlowNodeTypeEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.PageNodeTypeEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.LogicNodeTypeEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
			}
	return false;
}
	
		/**
 * @generated
 */
public static int getLinkWithClassVisualID(org.eclipse.emf.ecore.EObject domainElement) {
	if (domainElement == null) {
		return -1;
	}
	if (org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE.getConditionalOutType().isSuperTypeOf(domainElement.eClass())) {
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.ConditionalOutTypeEditPart.VISUAL_ID;
}
if (org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE.getDisplayOutType().isSuperTypeOf(domainElement.eClass())) {
	return org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayOutTypeEditPart.VISUAL_ID;
}
	return -1;
}
	
				/**
 * User can change implementation of this method to handle some specific
 * situations not covered by default logic.
 * 
 * @generated
 */
private static boolean isDiagram(org.shaolin.uimaster.datamodel.pagediagram.WebChunkType element) {
	return true;
}
	
		
	
	/**
 * @generated
 */
	public static boolean checkNodeVisualID(org.eclipse.gmf.runtime.notation.View containerView, org.eclipse.emf.ecore.EObject domainElement, int candidate) {
		if (candidate == -1){
			//unrecognized id is always bad
			return false;
		}
				int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

		/**
 * @generated
 */
	public static boolean isCompartmentVisualID(int visualID) {
				return false;
	}

		/**
 * @generated
 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
						case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID:
				return false;
												case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.StartNodeTypeEditPart.VISUAL_ID:
																		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayNodeTypeEditPart.VISUAL_ID:
																		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.FlowNodeTypeEditPart.VISUAL_ID:
																		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.PageNodeTypeEditPart.VISUAL_ID:
																		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.LogicNodeTypeEditPart.VISUAL_ID:
													return true;
			default:
				break;
		}
		return false;
	}

		/**
 * @generated
 */
	public static final org.eclipse.gmf.tooling.runtime.structure.DiagramStructure TYPED_INSTANCE = new org.eclipse.gmf.tooling.runtime.structure.DiagramStructure() {
		/**
 * @generated
 */
		@Override

		public int getVisualID(org.eclipse.gmf.runtime.notation.View view) {
			return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getVisualID(view);
		}
		
		/**
 * @generated
 */
		@Override

		public String getModelID(org.eclipse.gmf.runtime.notation.View view) {
			return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getModelID(view);
		}
		
		/**
 * @generated
 */
		@Override

		public int getNodeVisualID(org.eclipse.gmf.runtime.notation.View containerView, org.eclipse.emf.ecore.EObject domainElement) {
			return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}
		
		/**
 * @generated
 */
		@Override

		public boolean checkNodeVisualID(org.eclipse.gmf.runtime.notation.View containerView, org.eclipse.emf.ecore.EObject domainElement, int candidate) {
			return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
 * @generated
 */
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
 * @generated
 */
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

	}
