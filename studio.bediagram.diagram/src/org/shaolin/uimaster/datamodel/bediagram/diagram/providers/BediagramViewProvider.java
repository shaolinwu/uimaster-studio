package org.shaolin.uimaster.datamodel.bediagram.diagram.providers;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.shaolin.uimaster.datamodel.bediagram.BECollectionType;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
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
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.OandOAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry;

/**
 * @generated
 */
public class BediagramViewProvider extends
		org.eclipse.gmf.runtime.common.core.service.AbstractProvider implements
		org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(
			org.eclipse.gmf.runtime.common.core.service.IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 * if (op.getViewKind() == Node.class) return
		 * getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(),
		 * op.getSemanticHint()) != null; if (op.getViewKind() == Edge.class)
		 * return getEdgeViewClass(op.getSemanticAdapter(),
		 * op.getContainerView(), op.getSemanticHint()) != null;
		 */
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return BEDiagramTypeEditPart.MODEL_ID.equals(op.getSemanticHint())
				&& BediagramVisualIDRegistry
						.getDiagramVisualID(getSemanticElement(op
								.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from
			// CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will
			// be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = BediagramVisualIDRegistry.getNodeVisualID(
					op.getContainerView(), domainElement);
		} else {
			visualID = BediagramVisualIDRegistry.getVisualID(op
					.getSemanticHint());
			if (elementType != null) {
				if (!org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof org.eclipse.gmf.runtime.emf.type.core.IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((org.eclipse.gmf.runtime.emf.type.core.IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be
									// the same as in element type
				}
				if (domainElement != null
						&& visualID != BediagramVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match
									// visual id from element type
				}
			} else {
				if (!BEDiagramTypeEditPart.MODEL_ID
						.equals(BediagramVisualIDRegistry.getModelID(op
								.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case CENodeTypeEditPart.VISUAL_ID:
				case BENodeTypeEditPart.VISUAL_ID:
				case CEMemberContainerEditPart.VISUAL_ID:
				case BEMemberContainerEditPart.VISUAL_ID:
				case BEMemberTypeEditPart.VISUAL_ID:
				case CEMemberTypeEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != BediagramVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match
										// visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return CENodeTypeEditPart.VISUAL_ID == visualID
				|| BENodeTypeEditPart.VISUAL_ID == visualID
				|| BEMemberTypeEditPart.VISUAL_ID == visualID
				|| CEMemberTypeEditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof org.eclipse.gmf.runtime.emf.type.core.IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((org.eclipse.gmf.runtime.emf.type.core.IHintedType) elementType)
				.getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it
							// should be the same as in element type
		}
		int visualID = BediagramVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != BediagramVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id
							// from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	@Override
	public Diagram createDiagram(
			org.eclipse.core.runtime.IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(BEDiagramTypeEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		
		BEDiagramType model = (BEDiagramType)diagram.getElement();
		for (BusinessEntityType be: model.getBeEntity()) {
			createBENodeType_2002(be, diagram, ViewUtil.APPEND,
					true, preferencesHint);
		}
		for (ConstantEntityType ce: model.getCeEntity()) {
			createCENodeType_2001(ce, diagram, ViewUtil.APPEND,
					true, preferencesHint);
		}
		
		return diagram;
	}

	/**
	 * @generated
	 */
	@Override
	public Node createNode(org.eclipse.core.runtime.IAdaptable semanticAdapter,
			View containerView, String semanticHint, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = BediagramVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = BediagramVisualIDRegistry.getVisualID(semanticHint);
		}
		switch (visualID) {
		case CENodeTypeEditPart.VISUAL_ID:
			return createCENodeType_2001(domainElement, containerView, index,
					persisted, preferencesHint);
		case CEMemberTypeEditPart.VISUAL_ID:
			return createCEMemberType_2004(domainElement, containerView, index,
					persisted, preferencesHint);
		case BENodeTypeEditPart.VISUAL_ID:
			return createBENodeType_2002(domainElement, containerView, index,
					persisted, preferencesHint);
		case BEMemberTypeEditPart.VISUAL_ID:
			return createBENodeMemberType_2003(domainElement, containerView,
					index, persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	public Edge createEdge(org.eclipse.core.runtime.IAdaptable semanticAdapter,
			View containerView, String semanticHint, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		IElementType elementType = getSemanticElementType(semanticAdapter);
		
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (BediagramVisualIDRegistry.getVisualID(elementTypeHint)) {
		case BEInheritConnectionEditPart.VISUAL_ID:
			return createBEInheritConnectionType_2005(domainElement, containerView,
					index, persisted, preferencesHint);
		case OandOAssociationEditPart.VISUAL_ID:
			return createOandOConnectionType_2006(domainElement, containerView,
					index, persisted, preferencesHint);
		case BEListAssociationEditPart.VISUAL_ID:
			return createBEListConnectionType_2007(domainElement, containerView,
					index, persisted, preferencesHint);
			
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is
		// correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createCENodeType_2001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(BediagramVisualIDRegistry
				.getType(CENodeTypeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		org.eclipse.swt.graphics.RGB lineRGB = 
				new org.eclipse.swt.graphics.RGB(0, 205, 102);
		LineStyle nodeLineStyle = (LineStyle) node
				.getStyle(NotationPackage.Literals.LINE_STYLE);
		nodeLineStyle.setLineColor(FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		
		Node columnsNode = createCompartment(node, 
				BediagramVisualIDRegistry.getType(CEMemberContainerEditPart.VISUAL_ID), 
				true, false, false, false);
		
		ConstantEntityType ceNode = (ConstantEntityType)domainElement;
		if (ceNode.getConstantValue().size() == 0) {
			ConstantValueType newElement = BEDiagramFactory.eINSTANCE.createConstantValueType();
			newElement.setValue("Constant0");
			newElement.setIntValue(0);
			newElement.setDescription("This is Constant0 item.");
			ceNode.getConstantValue().add(newElement);
			createCEMemberType_2004(newElement, columnsNode, persisted, preferencesHint);
		} else {
			EList<ConstantValueType> values = ceNode.getConstantValue();
			for (ConstantValueType value: values) {
				createCEMemberType_2004(value, columnsNode, persisted, preferencesHint);
				//TODO: add links
			}
		}
		
		return node;
	}

	/**
	 * @generated
	 */
	public Node createBENodeType_2002(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(BediagramVisualIDRegistry
				.getType(BENodeTypeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		org.eclipse.swt.graphics.RGB lineRGB = 
				new org.eclipse.swt.graphics.RGB(152, 168, 191);
		LineStyle nodeLineStyle = (LineStyle) node
				.getStyle(NotationPackage.Literals.LINE_STYLE);
		nodeLineStyle.setLineColor(FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		
		Node columnsNode = createCompartment(node, 
				BediagramVisualIDRegistry.getType(BEMemberContainerEditPart.VISUAL_ID), 
				true, false, false, false);
		
		BusinessEntityType beNode = (BusinessEntityType)domainElement;
		if (beNode.getMember().size() == 0) {
			MemberType newElement = BEDiagramFactory.eINSTANCE.createMemberType();
			newElement.setName("field0");
			newElement.setType(BEDiagramFactory.eINSTANCE.createStringType());
			beNode.getMember().add(newElement);

			createBENodeMemberType_2003(newElement, columnsNode, persisted, preferencesHint);
		} else {
			EList<MemberType> members = beNode.getMember();
			for (MemberType m: members) {
				Shape beField = createBENodeMemberType_2003(m, columnsNode, persisted, preferencesHint);
				
				if (m.getType() instanceof BEObjRefType) {
					BEObjRefType link = (BEObjRefType) m.getType();
					Edge edge = createOandOConnectionType_2006(link, containerView,
							ViewUtil.APPEND, persisted, preferencesHint);
					beField.getTargetEdges().add(edge);
				} else if (m.getType() instanceof CEObjRefType) {
					CEObjRefType link = (CEObjRefType) m.getType();
					Edge edge = createOandOConnectionType_2006(link, containerView,
							ViewUtil.APPEND, persisted, preferencesHint);
					beField.getTargetEdges().add(edge);
				} else if (m.getType() instanceof BECollectionType) {
					BECollectionType link = (BECollectionType) m.getType();
					if (link.getElementType() instanceof BEObjRefType) {
						Edge edge = createBEListConnectionType_2007(link, containerView,
								ViewUtil.APPEND, persisted, preferencesHint);
						beField.getTargetEdges().add(edge);
					}
				}
				
			}
		}
		// add associations:
		if (beNode.getParentObject() != null
				&& beNode.getParentObject() instanceof BEObjRefType) {
			BEObjRefType link = (BEObjRefType) beNode.getParentObject();
			Edge edge = createBEInheritConnectionType_2005(link, node,
					ViewUtil.APPEND, persisted, preferencesHint);
			node.getTargetEdges().add(edge);
		}
		
		return node;
	}

	public Shape createBENodeMemberType_2003(EObject domainElement,
			View containerView, boolean persisted,
			PreferencesHint preferencesHint) {
		return createBENodeMemberType_2003(domainElement, 
				containerView, -1, persisted, preferencesHint);
	}
	
	public Shape createBENodeMemberType_2003(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setType(BediagramVisualIDRegistry
				.getType(BEMemberTypeEditPart.VISUAL_ID));
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		
		if (index == -1) {
			ViewUtil.insertChildView(containerView, node, ViewUtil.APPEND, persisted);
		} else {
			ViewUtil.insertChildView(containerView, node, index, persisted);
		}
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(8);
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		return node;
	}
	
	public Node createCEMemberType_2004(EObject domainElement,
			View containerView, boolean persisted,
			PreferencesHint preferencesHint) {
		return createCEMemberType_2004(domainElement, 
				containerView , -1, persisted, preferencesHint);
	}

	public Node createCEMemberType_2004(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setType(BediagramVisualIDRegistry
				.getType(CEMemberTypeEditPart.VISUAL_ID));
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(8);
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		return node;
	}

	public Edge createBEInheritConnectionType_2005(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector connector = NotationFactory.eINSTANCE.createConnector();
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		connector.setBendpoints(bendpoints);
		
		ViewUtil.insertChildView(containerView, connector, index, persisted);
		connector.setType(BediagramVisualIDRegistry.getType(BEInheritConnectionEditPart.VISUAL_ID));
		connector.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(connector,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) connector
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(connector,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		return connector;
	}
	
	public Edge createOandOConnectionType_2006(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector connector = NotationFactory.eINSTANCE.createConnector();
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		connector.setBendpoints(bendpoints);
		
		ViewUtil.insertChildView(containerView, connector, index, persisted);
		connector.setType(BediagramVisualIDRegistry.getType(OandOAssociationEditPart.VISUAL_ID));
		connector.setElement(domainElement);
		
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		
		RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(connector,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) connector
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(connector,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		return connector;
	}
	
	public Edge createBEListConnectionType_2007(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector connector = NotationFactory.eINSTANCE.createConnector();
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		connector.setBendpoints(bendpoints);
//		connector.setRouting(Routing.MANUAL_LITERAL);
//		connector.setJumpLinkType(JumpLinkType.CHAMFERED_LITERAL);
//		connector.setJumpLinkStatus(JumpLinkStatus.ABOVE_LITERAL);
		
		ViewUtil.insertChildView(containerView, connector, index, persisted);
		connector.setType(BediagramVisualIDRegistry.getType(BEListAssociationEditPart.VISUAL_ID));
		connector.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(connector,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) connector
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(connector,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		return connector;
	}
	
	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!BEDiagramTypeEditPart.MODEL_ID.equals(BediagramVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", BEDiagramTypeEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	private Node createCompartment(View owner, String hint, 
			boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		Node rv = NotationFactory.eINSTANCE.createListCompartment();
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		} 
		if (canFilter) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}
	
	/**
	 * @generated
	 */
	private EObject getSemanticElement(
			org.eclipse.core.runtime.IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil.resolve(
					org.eclipse.emf.transaction.util.TransactionUtil
							.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gmf.runtime.emf.type.core.IElementType getSemanticElementType(
			org.eclipse.core.runtime.IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (org.eclipse.gmf.runtime.emf.type.core.IElementType) semanticAdapter
				.getAdapter(org.eclipse.gmf.runtime.emf.type.core.IElementType.class);
	}
}
