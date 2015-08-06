package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers;

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
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.InheritTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.JoinTableTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.RDBDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.ViewTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class RdbdiagramElementTypes {

	/**
	 * @generated
	 */
	private RdbdiagramElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType RDBDiagramType_1000 = getElementType("studio.rdbdiagram.diagram.RDBDiagramType_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TableType_2001 = getElementType("studio.rdbdiagram.diagram.TableType_2001"); //$NON-NLS-1$

	public static final IElementType TableType_2011 = getElementType("studio.rdbdiagram.diagram.TableType_2011"); //$NON-NLS-1$
	
	/**
	 * @generated
	 */
	public static final IElementType ViewType_2002 = getElementType("studio.rdbdiagram.diagram.ViewType_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FKType_4001 = getElementType("studio.rdbdiagram.diagram.FKType_4001"); //$NON-NLS-1$
	public static final IElementType PKType_4005 = getElementType("studio.rdbdiagram.diagram.PKType_4005"); //$NON-NLS-1$

	public static final IElementType TableType_ColumnType_4002 = getElementType("studio.rdbdiagram.diagram.ColumnType_4002"); //$NON-NLS-1$

	public static final IElementType TableType_JoinTable_4003 = getElementType("studio.rdbdiagram.diagram.JoinTableType_4003"); //$NON-NLS-1$

	public static final IElementType TableType_Inherit_4004 = getElementType("studio.rdbdiagram.diagram.Inherit_4004"); //$NON-NLS-1$
	
	
	
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
				return RdbdiagramDiagramEditorPlugin.getInstance()
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
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(RDBDiagramType_1000,
					RDBDiagramPackage.eINSTANCE.getRDBDiagramType());

			elements.put(TableType_2001,
					RDBDiagramPackage.eINSTANCE.getTableType());
			
			elements.put(TableType_2011,
					RDBDiagramPackage.eINSTANCE.getTableType());

			elements.put(ViewType_2002,
					RDBDiagramPackage.eINSTANCE.getViewType());

			elements.put(FKType_4001, RDBDiagramPackage.eINSTANCE.getFKType());

			elements.put(PKType_4005, RDBDiagramPackage.eINSTANCE.getPKType());			
			
			elements.put(TableType_ColumnType_4002,
					RDBDiagramPackage.eINSTANCE.getColumnType());

			elements.put(TableType_JoinTable_4003,
					RDBDiagramPackage.eINSTANCE.getJoinTableType());
			
			elements.put(TableType_Inherit_4004,
					RDBDiagramPackage.eINSTANCE.getInheritAssociationType());

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
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(RDBDiagramType_1000);
			KNOWN_ELEMENT_TYPES.add(TableType_2001);
			KNOWN_ELEMENT_TYPES.add(TableType_2011);
			KNOWN_ELEMENT_TYPES.add(ViewType_2002);
			KNOWN_ELEMENT_TYPES.add(FKType_4001);
			KNOWN_ELEMENT_TYPES.add(PKType_4005);
			KNOWN_ELEMENT_TYPES.add(TableType_ColumnType_4002);
			KNOWN_ELEMENT_TYPES.add(TableType_JoinTable_4003);
			KNOWN_ELEMENT_TYPES.add(TableType_Inherit_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RDBDiagramTypeEditPart.VISUAL_ID:
			return RDBDiagramType_1000;
		case TableTypeEditPart.VISUAL_ID:
			return TableType_2001;
		case TableMemberContainerEditPart.VISUAL_ID:
			return TableType_2011;
		case ViewTypeEditPart.VISUAL_ID:
			return ViewType_2002;
		case JoinTableTypeEditPart.VISUAL_ID:
			return TableType_JoinTable_4003;
		case InheritTypeEditPart.VISUAL_ID:
			return TableType_Inherit_4004;
		}
		return null;
	}

}
