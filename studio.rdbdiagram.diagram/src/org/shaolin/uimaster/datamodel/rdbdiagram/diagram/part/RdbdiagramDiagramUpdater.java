package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType;
import org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ViewType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.InheritTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.JoinTableTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.RDBDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.ViewTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers.RdbdiagramElementTypes;

/**
 * @generated
 */
public class RdbdiagramDiagramUpdater {

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramNodeDescriptor> getSemanticChildren(
			org.eclipse.gmf.runtime.notation.View view) {
		switch (RdbdiagramVisualIDRegistry.getVisualID(view)) {
		case RDBDiagramTypeEditPart.VISUAL_ID:
			return getRDBDiagramType_1000SemanticChildren(view);
		}
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramNodeDescriptor> getRDBDiagramType_1000SemanticChildren(
			org.eclipse.gmf.runtime.notation.View view) {
		if (!view.isSetElement()) {
			return java.util.Collections.emptyList();
		}
		RDBDiagramType modelElement = (RDBDiagramType) view
				.getElement();
		java.util.LinkedList<RdbdiagramNodeDescriptor> result = new java.util.LinkedList<RdbdiagramNodeDescriptor>();
		for (java.util.Iterator<?> it = modelElement.getTable().iterator(); it
				.hasNext();) {
			TableType childElement = (TableType) it
					.next();
			int visualID = RdbdiagramVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TableTypeEditPart.VISUAL_ID) {
				result.add(new RdbdiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (java.util.Iterator<?> it = modelElement.getView().iterator(); it
				.hasNext();) {
			ViewType childElement = (ViewType) it
					.next();
			int visualID = RdbdiagramVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ViewTypeEditPart.VISUAL_ID) {
				result.add(new RdbdiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	public static java.util.List<RdbdiagramNodeDescriptor> getTableType_2011SemanticChildren(
			org.eclipse.gmf.runtime.notation.View view) {
		java.util.LinkedList<RdbdiagramNodeDescriptor> result = new java.util.LinkedList<RdbdiagramNodeDescriptor>();
		TableType table = (TableType) view.getElement();
		for (ColumnType col : table.getColumn()) {
			int visualID = RdbdiagramVisualIDRegistry.getNodeVisualID(view,
					col);
			if (visualID == TableMemberTypeEditPart.VISUAL_ID) {
				result.add(new RdbdiagramNodeDescriptor(table, visualID));
			}
		}
		
		return result;
	}
	
	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		switch (RdbdiagramVisualIDRegistry.getVisualID(view)) {
		case RDBDiagramTypeEditPart.VISUAL_ID:
			return getRDBDiagramType_1000ContainedLinks(view);
		case TableTypeEditPart.VISUAL_ID:
			return getTableType_2001ContainedLinks(view);
		case ViewTypeEditPart.VISUAL_ID:
			return getViewType_2002ContainedLinks(view);
		case JoinTableTypeEditPart.VISUAL_ID:
			return getJoinTableType_4003ContainedLinks(view);
		case InheritTypeEditPart.VISUAL_ID:
			return getInheritType_4004ContainedLinks(view);
		}
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getIncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		switch (RdbdiagramVisualIDRegistry.getVisualID(view)) {
		case TableTypeEditPart.VISUAL_ID:
			return getTableType_2001IncomingLinks(view);
		case ViewTypeEditPart.VISUAL_ID:
			return getViewType_2002IncomingLinks(view);
		case JoinTableTypeEditPart.VISUAL_ID:
			return getJoinTableType_4003IncomingLinks(view);
		case InheritTypeEditPart.VISUAL_ID:
			return getInheritType_4004IncomingLinks(view);
		}
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getOutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		switch (RdbdiagramVisualIDRegistry.getVisualID(view)) {
		case TableTypeEditPart.VISUAL_ID:
			return getTableType_2001OutgoingLinks(view);
		case ViewTypeEditPart.VISUAL_ID:
			return getViewType_2002OutgoingLinks(view);
		case JoinTableTypeEditPart.VISUAL_ID:
			return getJoinTableType_4003OutgoingLinks(view);
		case InheritTypeEditPart.VISUAL_ID:
			return getInheritType_4004OutgoingLinks(view);
		}
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getRDBDiagramType_1000ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		java.util.LinkedList<RdbdiagramLinkDescriptor> result = new java.util.LinkedList<RdbdiagramLinkDescriptor>();
		RDBDiagramType rdbdiagram = (RDBDiagramType)view.getElement();
		for (JoinTableType joinTable : rdbdiagram.getJoinTable()) {
			ColumnType src = getTableColumnType(rdbdiagram, joinTable.getSrcTable(), joinTable.getSrcPKColumn());
			ColumnType dest = getTableColumnType(rdbdiagram, joinTable.getTarTable(), joinTable.getTarPKColumn());
			
			result.add(new RdbdiagramLinkDescriptor(src, dest, joinTable,
					RdbdiagramElementTypes.TableType_JoinTable_4003,
					JoinTableTypeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getTableType_2001ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		TableType modelElement = (TableType) view
				.getElement();
		java.util.LinkedList<RdbdiagramLinkDescriptor> result = new java.util.LinkedList<RdbdiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssociationType_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getViewType_2002ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getJoinTableType_4003ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}
	
	public static java.util.List<RdbdiagramLinkDescriptor> getInheritType_4004ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}

	public static java.util.List<RdbdiagramLinkDescriptor> getTableType_ColumnType_4002ContainedLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}
	
	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getTableType_2001IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getViewType_2002IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getJoinTableType_4003IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}
	
	public static java.util.List<RdbdiagramLinkDescriptor> getInheritType_4004IncomingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getTableType_2001OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getViewType_2002OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static java.util.List<RdbdiagramLinkDescriptor> getJoinTableType_4003OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}
	
	public static java.util.List<RdbdiagramLinkDescriptor> getInheritType_4004OutgoingLinks(
			org.eclipse.gmf.runtime.notation.View view) {
		return java.util.Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static java.util.Collection<RdbdiagramLinkDescriptor> getContainedTypeModelFacetLinks_AssociationType_4003(
			TableType container) {
		java.util.LinkedList<RdbdiagramLinkDescriptor> result = new java.util.LinkedList<RdbdiagramLinkDescriptor>();
		if (container.getInheritAsscociation() != null) {
			InheritAssociationType link = container.getInheritAsscociation();
			
			TableType src = container;
			TableType dest = getDestTableType(container, link);
			if (dest != null) {
				result.add(new RdbdiagramLinkDescriptor(src, dest, link,
						RdbdiagramElementTypes.TableType_Inherit_4004,
						InheritTypeEditPart.VISUAL_ID));
			}
		}
		
		return result;
	}

	private static TableType getDestTableType(TableType container, InheritAssociationType link) {
		String destTable = link.getParentTable();
		EList<EObject> entities = container.eContainer().eContents();
		for (EObject en : entities) {
			if (en instanceof TableType) {
				if (destTable.equals(((TableType) en).getEntityName())) {
					return ((TableType) en);
				}
			}
		}
		return null;
	}
	
	private static ColumnType getTableColumnType(RDBDiagramType diagram, 
			String tableName, String columnName) {
		for (TableType t : diagram.getTable()) {
			if (t.getEntityName().equals(tableName)) {
				for (ColumnType c : t.getColumn()) {
					if (c.getName().equals(columnName)) {
						return c;
					}
				}
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final org.eclipse.gmf.tooling.runtime.update.DiagramUpdater TYPED_INSTANCE = new org.eclipse.gmf.tooling.runtime.update.DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public java.util.List<RdbdiagramNodeDescriptor> getSemanticChildren(
				org.eclipse.gmf.runtime.notation.View view) {
			return RdbdiagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public java.util.List<RdbdiagramLinkDescriptor> getContainedLinks(
				org.eclipse.gmf.runtime.notation.View view) {
			return RdbdiagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public java.util.List<RdbdiagramLinkDescriptor> getIncomingLinks(
				org.eclipse.gmf.runtime.notation.View view) {
			return RdbdiagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public java.util.List<RdbdiagramLinkDescriptor> getOutgoingLinks(
				org.eclipse.gmf.runtime.notation.View view) {
			return RdbdiagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
