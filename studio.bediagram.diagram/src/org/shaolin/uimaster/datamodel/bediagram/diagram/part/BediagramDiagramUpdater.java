package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.bediagram.BECollectionType;
import org.shaolin.uimaster.datamodel.bediagram.BEComplexType;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.CEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantValueType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEInheritConnectionEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEListAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.OandOAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;

/**
 * @generated
 */
public class BediagramDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (BediagramVisualIDRegistry.getVisualID(view)) {
		case BEDiagramTypeEditPart.VISUAL_ID:
			return getBEDiagramType_1000SemanticChildren(view);
		case CENodeTypeEditPart.VISUAL_ID:
			return getCENodeType_2001SemanticChildren(view);
		case BENodeTypeEditPart.VISUAL_ID:
			return getBENodeType_2002SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBEDiagramType_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		BEDiagramType modelElement = (BEDiagramType) view.getElement();
		LinkedList result = new LinkedList();
		for (Iterator it = modelElement.getCeEntity().iterator(); it.hasNext();) {
			ConstantEntityType childElement = (ConstantEntityType) it.next();
			int visualID = BediagramVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CENodeTypeEditPart.VISUAL_ID) {
				result.add(new BediagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getBeEntity().iterator(); it.hasNext();) {
			BusinessEntityType childElement = (BusinessEntityType) it.next();
			int visualID = BediagramVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BENodeTypeEditPart.VISUAL_ID) {
				result.add(new BediagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		// TODO: BEConnectionEditPart.VISUAL_ID
		return result;
	}

	public static List getCENodeType_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ConstantEntityType modelElement = (ConstantEntityType) view
				.getElement();
		LinkedList result = new LinkedList();
		for (Iterator it = modelElement.getConstantValue().iterator(); it
				.hasNext();) {
			ConstantValueType childElement = (ConstantValueType) it.next();
			int visualID = BediagramVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CEMemberTypeEditPart.VISUAL_ID) {
				result.add(new BediagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	public static List getBENodeType_2002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		BusinessEntityType modelElement = (BusinessEntityType) view
				.getElement();
		LinkedList result = new LinkedList();
		for (Iterator it = modelElement.getMember().iterator(); it.hasNext();) {
			MemberType childElement = (MemberType) it.next();
			int visualID = BediagramVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BEMemberTypeEditPart.VISUAL_ID) {
				result.add(new BediagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (BediagramVisualIDRegistry.getVisualID(view)) {
		case BEDiagramTypeEditPart.VISUAL_ID:
			return getBEDiagramType_1000ContainedLinks(view);
		case CENodeTypeEditPart.VISUAL_ID:
			return getCENodeType_2001ContainedLinks(view);
		case BENodeTypeEditPart.VISUAL_ID:
			return getBENodeType_2002ContainedLinks(view);
		case BEMemberTypeEditPart.VISUAL_ID:
			return getBENodeMemberType_2003ContainedLinks(view);
		case CEMemberTypeEditPart.VISUAL_ID:
			return getBENodeMemberType_2003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (BediagramVisualIDRegistry.getVisualID(view)) {
		case CENodeTypeEditPart.VISUAL_ID:
			return getCENodeType_2001IncomingLinks(view);
		case BENodeTypeEditPart.VISUAL_ID:
			return getBENodeType_2002IncomingLinks(view);
		case BEMemberTypeEditPart.VISUAL_ID:
			return getBENodeMemberType_2003IncomingLinks(view);
		case CEMemberTypeEditPart.VISUAL_ID:
			return getBENodeMemberType_2003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (BediagramVisualIDRegistry.getVisualID(view)) {
		case CENodeTypeEditPart.VISUAL_ID:
			return getCENodeType_2001OutgoingLinks(view);
		case BENodeTypeEditPart.VISUAL_ID:
			return getBENodeType_2002OutgoingLinks(view);
		case BEMemberTypeEditPart.VISUAL_ID:
			return getBENodeMemberType_2003OutgoingLinks(view);
		case CEMemberTypeEditPart.VISUAL_ID:
			return getCENodeType_2001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBEDiagramType_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCENodeType_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBENodeType_2002ContainedLinks(View view) {
		BusinessEntityType modelElement = (BusinessEntityType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		LinkedList result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_BEInheritConnection_2005(
				modelElement, crossReferences));
		result.addAll(getOutgoingTypeModelFacetLinks_OneAndOneConnection_2006(
				modelElement, crossReferences));
		result.addAll(getOutgoingTypeModelFacetLinks_BEListConnection_2007(
				modelElement, crossReferences));
		return result;
		
	}

	public static List getBEConnection_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}
	
	public static List getOaOConnection_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}
	
	public static List getBEListConnection_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCENodeType_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBENodeType_2002IncomingLinks(View view) {

		BusinessEntityType modelElement = (BusinessEntityType) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		LinkedList result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_BEInheritConnection_2005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OneAndOneConnection_2006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BEListConnection_2007(
				modelElement, crossReferences));
		return result;
	}

	public static List getBENodeMemberType_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	public static List getBENodeMemberType_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	public static List getBENodeMemberType_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	public static List getCENodeType_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	public static List getBEInheritConnection_2005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	public static List getBEInheritConnection_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBENodeType_2002OutgoingLinks(View view) {

		BusinessEntityType modelElement = (BusinessEntityType) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		LinkedList result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_BEInheritConnection_2005(
				modelElement, crossReferences));
		result.addAll(getOutgoingTypeModelFacetLinks_OneAndOneConnection_2006(
				modelElement, crossReferences));
		result.addAll(getOutgoingTypeModelFacetLinks_BEListConnection_2007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_BEInheritConnection_2005(
			BusinessEntityType target, Map crossReferences) {
		LinkedList result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		// now incoming connection at this moment.
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_BEInheritConnection_2005(
			BusinessEntityType source, Map crossReferences) {
		LinkedList result = new LinkedList();
		if (source.getParentObject() == null
				|| !(source.getParentObject() instanceof BEObjRefType)) {
			return result;
		}
		BEObjRefType link = (BEObjRefType) source.getParentObject();
		if (BEInheritConnectionEditPart.VISUAL_ID != BediagramVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		BusinessEntityType target = getBENodeType(
				(BEDiagramType) source.eContainer(), link.getTargetEntity()
						.getEntityName());
		if (target == null) {
			return result;// the target is out of this diagram.
		}

		result.add(new BediagramLinkDescriptor(source, target, link,
				BediagramElementTypes.BEExtConnectionType_2005,
				BEInheritConnectionEditPart.VISUAL_ID));
		return result;
	}
	
	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OneAndOneConnection_2006(
			BusinessEntityType target, Map crossReferences) {
		LinkedList result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		// now incoming connection at this moment.
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OneAndOneConnection_2006(
			BusinessEntityType source, Map crossReferences) {
		LinkedList result = new LinkedList();
		EList<MemberType> members = source.getMember();
		BusinessEntityType src = source;
		for (MemberType m : members) {
			if (m.getType() instanceof BEObjRefType) {
				BEObjRefType link = (BEObjRefType) m.getType();
				if (link == null || link.getTargetEntity() == null) {
					continue;
				}

				BusinessEntityType target = getBENodeType(
						(BEDiagramType) source.eContainer(), link
								.getTargetEntity().getEntityName());
				if (target == null) {
					continue;// the target is out of this diagram.
				}
				result.add(new BediagramLinkDescriptor(m, target, link,
						BediagramElementTypes.OaOAssociationType_2006,
						OandOAssociationEditPart.VISUAL_ID));
			} else if (m.getType() instanceof CEObjRefType) {
				CEObjRefType link = (CEObjRefType) m.getType();
				if (link == null || link.getTargetEntity() == null) {
					continue;
				}
				
				ConstantEntityType target = getCENodeType(
						(BEDiagramType) source.eContainer(), link
								.getTargetEntity().getEntityName());
				if (target == null) {
					continue;// the target is out of this diagram.
				}
				result.add(new BediagramLinkDescriptor(m, target, link,
						BediagramElementTypes.OaOAssociationType_2006,
						OandOAssociationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_BEListConnection_2007(
			BusinessEntityType target, Map crossReferences) {
		LinkedList result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		// now incoming connection at this moment.
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_BEListConnection_2007(
			BusinessEntityType source, Map crossReferences) {
		LinkedList result = new LinkedList();
		EList<MemberType> members = source.getMember();
		BusinessEntityType src = source;
		for (MemberType m : members) {
			if (m.getType() instanceof BECollectionType) {
				BECollectionType link = (BECollectionType) m.getType();
				if (!(link.getElementType() instanceof BEObjRefType)) {
					continue;
				}

				BusinessEntityType target = getBENodeType(
						(BEDiagramType) source.eContainer(),
						((BEObjRefType) link.getElementType())
								.getTargetEntity().getEntityName());
				if (target == null) {
					continue;// the target is out of this diagram.
				}
				result.add(new BediagramLinkDescriptor(m, target, link,
						BediagramElementTypes.BEListAssociationType_2007,
						BEListAssociationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	private static BusinessEntityType getBENodeType(BEDiagramType container,
			String beName) {
		EList<BusinessEntityType> entities = container.getBeEntity();
		for (BusinessEntityType en : entities) {
			String enName = en.getEntityName();
			if (enName.equals(beName)) {
				return en;
			}
		}

		return null;
	}

	private static ConstantEntityType getCENodeType(BEDiagramType container,
			String ceName) {
		EList<ConstantEntityType> entities = container.getCeEntity();
		for (ConstantEntityType en : entities) {
			String enName = en.getEntityName();
			if (enName.equals(ceName)) {
				return en;
			}
		}

		return null;
	}
}
