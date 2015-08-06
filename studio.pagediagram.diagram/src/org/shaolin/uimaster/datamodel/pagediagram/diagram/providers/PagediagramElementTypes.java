package org.shaolin.uimaster.datamodel.pagediagram.diagram.providers;

/**
 * @generated
 */
public class PagediagramElementTypes {

	/**
	 * @generated
	 */
	private PagediagramElementTypes() {
	}

	/**
	 * @generated
	 */
	private static java.util.Map<org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement> elements;

	/**
	 * @generated
	 */
	private static org.eclipse.jface.resource.ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static java.util.Set<org.eclipse.gmf.runtime.emf.type.core.IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.runtime.emf.type.core.IElementType WebChunkType_1000 = getElementType("studio.pagediagram.diagram.WebChunkType_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.runtime.emf.type.core.IElementType StartNodeType_2001 = getElementType("studio.pagediagram.diagram.StartNodeType_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.runtime.emf.type.core.IElementType DisplayNodeType_2002 = getElementType("studio.pagediagram.diagram.DisplayNodeType_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.runtime.emf.type.core.IElementType FlowNodeType_2003 = getElementType("studio.pagediagram.diagram.FlowNodeType_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.runtime.emf.type.core.IElementType PageNodeType_2004 = getElementType("studio.pagediagram.diagram.PageNodeType_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.runtime.emf.type.core.IElementType LogicNodeType_2005 = getElementType("studio.pagediagram.diagram.LogicNodeType_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.runtime.emf.type.core.IElementType ConditionalOutType_4001 = getElementType("studio.pagediagram.diagram.ConditionalOutType_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.runtime.emf.type.core.IElementType DisplayOutType_4002 = getElementType("studio.pagediagram.diagram.DisplayOutType_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static org.eclipse.jface.resource.ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new org.eclipse.jface.resource.ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(
			org.eclipse.emf.ecore.ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static org.eclipse.jface.resource.ImageDescriptor getProvidedImageDescriptor(
			org.eclipse.emf.ecore.ENamedElement element) {
		if (element instanceof org.eclipse.emf.ecore.EStructuralFeature) {
			org.eclipse.emf.ecore.EStructuralFeature feature = ((org.eclipse.emf.ecore.EStructuralFeature) element);
			org.eclipse.emf.ecore.EClass eContainingClass = feature
					.getEContainingClass();
			org.eclipse.emf.ecore.EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof org.eclipse.emf.ecore.EClass
					&& !((org.eclipse.emf.ecore.EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) element;
			if (!eClass.isAbstract()) {
				return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static org.eclipse.jface.resource.ImageDescriptor getImageDescriptor(
			org.eclipse.emf.ecore.ENamedElement element) {
		String key = getImageRegistryKey(element);
		org.eclipse.jface.resource.ImageDescriptor imageDescriptor = getImageRegistry()
				.getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = org.eclipse.jface.resource.ImageDescriptor
						.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static org.eclipse.swt.graphics.Image getImage(
			org.eclipse.emf.ecore.ENamedElement element) {
		String key = getImageRegistryKey(element);
		org.eclipse.swt.graphics.Image image = getImageRegistry().get(key);
		if (image == null) {
			org.eclipse.jface.resource.ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = org.eclipse.jface.resource.ImageDescriptor
						.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static org.eclipse.jface.resource.ImageDescriptor getImageDescriptor(
			org.eclipse.core.runtime.IAdaptable hint) {
		org.eclipse.emf.ecore.ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static org.eclipse.swt.graphics.Image getImage(
			org.eclipse.core.runtime.IAdaptable hint) {
		org.eclipse.emf.ecore.ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static org.eclipse.emf.ecore.ENamedElement getElement(
			org.eclipse.core.runtime.IAdaptable hint) {
		Object type = hint
				.getAdapter(org.eclipse.gmf.runtime.emf.type.core.IElementType.class);
		if (elements == null) {
			elements = new java.util.IdentityHashMap<org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement>();

			elements.put(
					WebChunkType_1000,
					org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE
							.getWebChunkType());

			elements.put(
					StartNodeType_2001,
					org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE
							.getStartNodeType());

			elements.put(
					DisplayNodeType_2002,
					org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE
							.getDisplayNodeType());

			elements.put(
					FlowNodeType_2003,
					org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE
							.getFlowNodeType());

			elements.put(
					PageNodeType_2004,
					org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE
							.getPageNodeType());

			elements.put(
					LogicNodeType_2005,
					org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE
							.getLogicNodeType());

			elements.put(
					ConditionalOutType_4001,
					org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE
							.getConditionalOutType());

			elements.put(
					DisplayOutType_4002,
					org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage.eINSTANCE
							.getDisplayOutType());
		}
		return (org.eclipse.emf.ecore.ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static org.eclipse.gmf.runtime.emf.type.core.IElementType getElementType(
			String id) {
		return org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry
				.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(
			org.eclipse.gmf.runtime.emf.type.core.IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new java.util.HashSet<org.eclipse.gmf.runtime.emf.type.core.IElementType>();
			KNOWN_ELEMENT_TYPES.add(WebChunkType_1000);
			KNOWN_ELEMENT_TYPES.add(StartNodeType_2001);
			KNOWN_ELEMENT_TYPES.add(DisplayNodeType_2002);
			KNOWN_ELEMENT_TYPES.add(FlowNodeType_2003);
			KNOWN_ELEMENT_TYPES.add(PageNodeType_2004);
			KNOWN_ELEMENT_TYPES.add(LogicNodeType_2005);
			KNOWN_ELEMENT_TYPES.add(ConditionalOutType_4001);
			KNOWN_ELEMENT_TYPES.add(DisplayOutType_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static org.eclipse.gmf.runtime.emf.type.core.IElementType getElementType(
			int visualID) {
		switch (visualID) {
		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID:
			return WebChunkType_1000;
		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.StartNodeTypeEditPart.VISUAL_ID:
			return StartNodeType_2001;
		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayNodeTypeEditPart.VISUAL_ID:
			return DisplayNodeType_2002;
		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.FlowNodeTypeEditPart.VISUAL_ID:
			return FlowNodeType_2003;
		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.PageNodeTypeEditPart.VISUAL_ID:
			return PageNodeType_2004;
		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.LogicNodeTypeEditPart.VISUAL_ID:
			return LogicNodeType_2005;
		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.ConditionalOutTypeEditPart.VISUAL_ID:
			return ConditionalOutType_4001;
		case org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayOutTypeEditPart.VISUAL_ID:
			return DisplayOutType_4002;
		}
		return null;
	}

}
