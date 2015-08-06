package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.InheritTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.JoinTableTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.RDBDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.ViewTypeEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented by
 * a domain model object.
 * 
 * @generated
 */
public class RdbdiagramVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "studio.rdbdiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (RDBDiagramTypeEditPart.MODEL_ID.equals(view.getType())) {
				return RDBDiagramTypeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
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
				RdbdiagramDiagramEditorPlugin.getInstance().logError(
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
		if (RDBDiagramPackage.eINSTANCE.getRDBDiagramType().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((RDBDiagramType) domainElement)) {
			return RDBDiagramTypeEditPart.VISUAL_ID;
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
		String containerModelID = org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
				.getModelID(containerView);
		if (!RDBDiagramTypeEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (RDBDiagramTypeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RDBDiagramTypeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RDBDiagramTypeEditPart.VISUAL_ID:
			if (RDBDiagramPackage.eINSTANCE.getTableType().isSuperTypeOf(
					domainElement.eClass())) {
				return TableTypeEditPart.VISUAL_ID;
			}
			if (RDBDiagramPackage.eINSTANCE.getViewType().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewTypeEditPart.VISUAL_ID;
			}
			if (RDBDiagramPackage.eINSTANCE.getColumnType().isSuperTypeOf(
					domainElement.eClass())) {
				return TableMemberTypeEditPart.VISUAL_ID;
			}
		case TableMemberContainerEditPart.VISUAL_ID:
			if (RDBDiagramPackage.eINSTANCE.getColumnType().isSuperTypeOf(
					domainElement.eClass())) {
				return TableMemberTypeEditPart.VISUAL_ID;
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
				.getModelID(containerView);
		if (!RDBDiagramTypeEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (RDBDiagramTypeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RDBDiagramTypeEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RDBDiagramTypeEditPart.VISUAL_ID:
			if (TableTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableMemberContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableMemberTypeEditPart.VISUAL_ID == nodeVisualID) {
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
		if (RDBDiagramPackage.eINSTANCE.getJoinTableType().isSuperTypeOf(
				domainElement.eClass())) {
			return JoinTableTypeEditPart.VISUAL_ID;
		}
		if (RDBDiagramPackage.eINSTANCE.getInheritAssociationType().isSuperTypeOf(
				domainElement.eClass())) {
			return InheritTypeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(RDBDiagramType element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			// unrecognized id is always bad
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
		case RDBDiagramTypeEditPart.VISUAL_ID:
			return false;
		case TableTypeEditPart.VISUAL_ID:
		case TableMemberContainerEditPart.VISUAL_ID:
		case ViewTypeEditPart.VISUAL_ID:
		case TableMemberTypeEditPart.VISUAL_ID:
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
		@Override
		public int getVisualID(View view) {
			return org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
