package org.shaolin.uimaster.datamodel.bediagram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEInheritConnectionEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEListAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.OandOAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorPlugin;

/**
 * @generated
 */
public class BediagramElementTypes {

	/**
	 * @generated
	 */
	private BediagramElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/KNOWN_ELEMENT_TYPES;

	public static final IElementType BEDiagramType_1000 = 
			getElementType("studio.bediagram.diagram.BEDiagramType_1000"); 

	public static final IElementType CENodeType_2001 = 
			getElementType("studio.bediagram.diagram.CENodeType_2001"); 
	public static final IElementType CENodeType_2011 = 
			getElementType("studio.bediagram.diagram.CENodeType_2011"); 
	public static final IElementType CENodeType_MemberType_2004 = 
			getElementType("studio.bediagram.diagram.CENodeType_MemberType_2004"); 

	public static final IElementType BENodeType_2002 = 
			getElementType("studio.bediagram.diagram.BENodeType_2002"); 
	public static final IElementType BENodeType_2012 = 
			getElementType("studio.bediagram.diagram.BENodeType_2012"); 
	public static final IElementType BENodeType_MemberType_2003 = 
			getElementType("studio.bediagram.diagram.BENodeType_MemberType_2003"); 
	
	public static final IElementType BEExtConnectionType_2005 = 
			getElementType("studio.bediagram.diagram.BEInheritConnectionType_2005"); 
	public static final IElementType OaOAssociationType_2006 = 
			getElementType("studio.bediagram.diagram.OaOAssociationType_2006"); 
	public static final IElementType BEListAssociationType_2007 = 
			getElementType("studio.bediagram.diagram.BEListAssociationType_2007"); 

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return BediagramDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
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
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
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
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap/*[org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement]*/();

			elements.put(BEDiagramType_1000,
					BEDiagramPackage.eINSTANCE.getBEDiagramType());

			elements.put(CENodeType_2001,
					BEDiagramPackage.eINSTANCE.getConstantEntityType());
			
			elements.put(CENodeType_2011,
					BEDiagramPackage.eINSTANCE.getConstantEntityType());
			
			elements.put(CENodeType_MemberType_2004,
					BEDiagramPackage.eINSTANCE.getConstantValueType());
			
			elements.put(BENodeType_2002,
					BEDiagramPackage.eINSTANCE.getBusinessEntityType());
			
			elements.put(BENodeType_2012,
					BEDiagramPackage.eINSTANCE.getBusinessEntityType());
			
			elements.put(BENodeType_MemberType_2003,
					BEDiagramPackage.eINSTANCE.getMemberType());
			
			elements.put(BEExtConnectionType_2005,
					BEDiagramPackage.eINSTANCE.getBEObjRefType());
			
			elements.put(OaOAssociationType_2006,
					BEDiagramPackage.eINSTANCE.getCEObjRefType());
			
			elements.put(BEListAssociationType_2007,
					BEDiagramPackage.eINSTANCE.getBEListType());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
			KNOWN_ELEMENT_TYPES.add(BEDiagramType_1000);
			KNOWN_ELEMENT_TYPES.add(CENodeType_2001);
			KNOWN_ELEMENT_TYPES.add(BENodeType_2002);
			KNOWN_ELEMENT_TYPES.add(CENodeType_2011);
			KNOWN_ELEMENT_TYPES.add(BENodeType_2012);
			KNOWN_ELEMENT_TYPES.add(BENodeType_MemberType_2003);
			KNOWN_ELEMENT_TYPES.add(CENodeType_MemberType_2004);
			KNOWN_ELEMENT_TYPES.add(BEExtConnectionType_2005);
			KNOWN_ELEMENT_TYPES.add(OaOAssociationType_2006);
			KNOWN_ELEMENT_TYPES.add(BEListAssociationType_2007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case BEDiagramTypeEditPart.VISUAL_ID:
			return BEDiagramType_1000;
		case CENodeTypeEditPart.VISUAL_ID:
			return CENodeType_2001;
		case CEMemberContainerEditPart.VISUAL_ID:
			return CENodeType_2011;
		case CEMemberTypeEditPart.VISUAL_ID:
			return CENodeType_MemberType_2004;
		case BENodeTypeEditPart.VISUAL_ID:
			return BENodeType_2002;
		case BEMemberContainerEditPart.VISUAL_ID:
			return BENodeType_2012;
		case BEInheritConnectionEditPart.VISUAL_ID:
			return BEExtConnectionType_2005;
		case OandOAssociationEditPart.VISUAL_ID:
			return OaOAssociationType_2006;
		case BEListAssociationEditPart.VISUAL_ID:
			return BEListAssociationType_2007;
		}
		return null;
	}

}
