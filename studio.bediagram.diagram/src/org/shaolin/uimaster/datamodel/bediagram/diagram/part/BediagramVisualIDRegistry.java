package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEInheritConnectionEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEListAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.OandOAssociationEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class BediagramVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "studio.bediagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (BEDiagramTypeEditPart.MODEL_ID.equals(view.getType())) {
				return BEDiagramTypeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				BediagramDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
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
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (BEDiagramPackage.eINSTANCE.getBEDiagramType().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((BEDiagramType) domainElement)) {
			return BEDiagramTypeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
				.getModelID(containerView);
		if (!BEDiagramTypeEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (BEDiagramTypeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = BEDiagramTypeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case BEDiagramTypeEditPart.VISUAL_ID:
			if (BEDiagramPackage.eINSTANCE.getConstantEntityType().isSuperTypeOf(
					domainElement.eClass())) {
				return CENodeTypeEditPart.VISUAL_ID;
			}
			if (BEDiagramPackage.eINSTANCE.getBusinessEntityType().isSuperTypeOf(
					domainElement.eClass())) {
				return BENodeTypeEditPart.VISUAL_ID;
			}
			if (BEDiagramPackage.eINSTANCE.getMemberType().isSuperTypeOf(
					domainElement.eClass())) {
				return BEMemberTypeEditPart.VISUAL_ID;
			}
			if (BEDiagramPackage.eINSTANCE.getConstantValueType().isSuperTypeOf(
					domainElement.eClass())) {
				return CEMemberTypeEditPart.VISUAL_ID;
			}
			break;
		case BEMemberContainerEditPart.VISUAL_ID:
			if (BEDiagramPackage.eINSTANCE.getMemberType().isSuperTypeOf(
					domainElement.eClass())) {
				return BEMemberTypeEditPart.VISUAL_ID;
			}
			break;
		case CEMemberContainerEditPart.VISUAL_ID:
			if (BEDiagramPackage.eINSTANCE.getConstantEntityType().isSuperTypeOf(
					domainElement.eClass())) {
				return CENodeTypeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
				.getModelID(containerView);
		if (!BEDiagramTypeEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (BEDiagramTypeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = BEDiagramTypeEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case BEDiagramTypeEditPart.VISUAL_ID:
			if (CENodeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BENodeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BEMemberContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CEMemberContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BEMemberTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CEMemberTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (BEDiagramPackage.eINSTANCE.getBEObjRefType().isSuperTypeOf(
				domainElement.eClass()) 
				&& domainElement.eContainer() instanceof BusinessEntityType) {
			return BEInheritConnectionEditPart.VISUAL_ID;
		} 
		if (BEDiagramPackage.eINSTANCE.getBECollectionType().isSuperTypeOf(
				domainElement.eClass())) {
			return BEListAssociationEditPart.VISUAL_ID;
		}
		if (BEDiagramPackage.eINSTANCE.getBEComplexType().isSuperTypeOf(
				domainElement.eClass()) 
				&& domainElement.eContainer() instanceof MemberType) {
			return OandOAssociationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(BEDiagramType element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
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
		case BEDiagramTypeEditPart.VISUAL_ID:
			return false;
		case CENodeTypeEditPart.VISUAL_ID:
		case BENodeTypeEditPart.VISUAL_ID:
		case BEMemberTypeEditPart.VISUAL_ID:
		case BEMemberContainerEditPart.VISUAL_ID:
		case CEMemberContainerEditPart.VISUAL_ID:
		case BEInheritConnectionEditPart.VISUAL_ID:
		case BEListAssociationEditPart.VISUAL_ID:
		case OandOAssociationEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */

		public int getVisualID(View view) {
			return org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
