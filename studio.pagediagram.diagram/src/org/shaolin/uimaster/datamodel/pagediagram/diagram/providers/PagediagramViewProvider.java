package org.shaolin.uimaster.datamodel.pagediagram.diagram.providers;

import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.ConditionalOutTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayOutTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.FlowNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.LogicNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.PageNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.StartNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry;

/**
 * @generated
 */
public class PagediagramViewProvider extends
		org.eclipse.gmf.runtime.common.core.service.AbstractProvider implements
		org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(
			org.eclipse.gmf.runtime.common.core.service.IOperation operation) {
		if (operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation) {
			return provides((org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation) operation);
		}
		assert operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
		if (operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation) {
			return provides((org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation) operation);
		} else if (operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation) {
			return provides((org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation) operation);
		} else if (operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation) {
			return provides((org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(
			org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation op) {
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
	protected boolean provides(
			org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation op) {
		return WebChunkTypeEditPart.MODEL_ID.equals(op.getSemanticHint())
				&& PagediagramVisualIDRegistry
						.getDiagramVisualID(getSemanticElement(op
								.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(
			org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		org.eclipse.emf.ecore.EObject domainElement = getSemanticElement(op
				.getSemanticAdapter());
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
			visualID = PagediagramVisualIDRegistry.getNodeVisualID(
					op.getContainerView(), domainElement);
		} else {
			visualID = PagediagramVisualIDRegistry.getVisualID(op
					.getSemanticHint());
			if (elementType != null) {
				if (!org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
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
						&& visualID != PagediagramVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match
									// visual id from element type
				}
			} else {
				if (!WebChunkTypeEditPart.MODEL_ID
						.equals(PagediagramVisualIDRegistry.getModelID(op
								.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case StartNodeTypeEditPart.VISUAL_ID:
				case DisplayNodeTypeEditPart.VISUAL_ID:
				case FlowNodeTypeEditPart.VISUAL_ID:
				case PageNodeTypeEditPart.VISUAL_ID:
				case LogicNodeTypeEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != PagediagramVisualIDRegistry
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
		return StartNodeTypeEditPart.VISUAL_ID == visualID
				|| DisplayNodeTypeEditPart.VISUAL_ID == visualID
				|| FlowNodeTypeEditPart.VISUAL_ID == visualID
				|| PageNodeTypeEditPart.VISUAL_ID == visualID
				|| LogicNodeTypeEditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(
			org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation op) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
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
		int visualID = PagediagramVisualIDRegistry.getVisualID(elementTypeHint);
		org.eclipse.emf.ecore.EObject domainElement = getSemanticElement(op
				.getSemanticAdapter());
		if (domainElement != null
				&& visualID != PagediagramVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id
							// from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(
			org.eclipse.core.runtime.IAdaptable semanticAdapter,
			String diagramKind,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(WebChunkTypeEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(
			org.eclipse.core.runtime.IAdaptable semanticAdapter,
			View containerView,
			String semanticHint,
			int index,
			boolean persisted,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		final org.eclipse.emf.ecore.EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = PagediagramVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		} else {
			visualID = PagediagramVisualIDRegistry.getVisualID(semanticHint);
		}
		switch (visualID) {
		case StartNodeTypeEditPart.VISUAL_ID:
			return createStartNodeType_2001(domainElement, containerView,
					index, persisted, preferencesHint);
		case DisplayNodeTypeEditPart.VISUAL_ID:
			return createDisplayNodeType_2002(domainElement, containerView,
					index, persisted, preferencesHint);
		case FlowNodeTypeEditPart.VISUAL_ID:
			return createFlowNodeType_2003(domainElement, containerView, index,
					persisted, preferencesHint);
		case PageNodeTypeEditPart.VISUAL_ID:
			return createPageNodeType_2004(domainElement, containerView, index,
					persisted, preferencesHint);
		case LogicNodeTypeEditPart.VISUAL_ID:
			return createLogicNodeType_2005(domainElement, containerView,
					index, persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(
			org.eclipse.core.runtime.IAdaptable semanticAdapter,
			View containerView,
			String semanticHint,
			int index,
			boolean persisted,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((org.eclipse.gmf.runtime.emf.type.core.IHintedType) elementType)
				.getSemanticHint();
		switch (PagediagramVisualIDRegistry.getVisualID(elementTypeHint)) {
		case ConditionalOutTypeEditPart.VISUAL_ID:
			return createConditionalOutType_4001(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case DisplayOutTypeEditPart.VISUAL_ID:
			return createDisplayOutType_4002(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is
		// correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createStartNodeType_2001(
			org.eclipse.emf.ecore.EObject domainElement,
			View containerView,
			int index,
			boolean persisted,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PagediagramVisualIDRegistry
				.getType(StartNodeTypeEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(
				containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter
					.getFontData(prefStore,
							IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle
					.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
			nodeFontStyle
					.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle
					.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
							.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getFillStyle_FillColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(fillRGB));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDisplayNodeType_2002(
			org.eclipse.emf.ecore.EObject domainElement,
			View containerView,
			int index,
			boolean persisted,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PagediagramVisualIDRegistry
				.getType(DisplayNodeTypeEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(
				containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter
					.getFontData(prefStore,
							IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle
					.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
			nodeFontStyle
					.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle
					.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
							.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getFillStyle_FillColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(fillRGB));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createFlowNodeType_2003(
			org.eclipse.emf.ecore.EObject domainElement,
			View containerView,
			int index,
			boolean persisted,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PagediagramVisualIDRegistry
				.getType(FlowNodeTypeEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(
				containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter
					.getFontData(prefStore,
							IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle
					.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
			nodeFontStyle
					.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle
					.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
							.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getFillStyle_FillColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(fillRGB));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createPageNodeType_2004(
			org.eclipse.emf.ecore.EObject domainElement,
			View containerView,
			int index,
			boolean persisted,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PagediagramVisualIDRegistry
				.getType(PageNodeTypeEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(
				containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter
					.getFontData(prefStore,
							IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle
					.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
			nodeFontStyle
					.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle
					.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
							.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getFillStyle_FillColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(fillRGB));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLogicNodeType_2005(
			org.eclipse.emf.ecore.EObject domainElement,
			View containerView,
			int index,
			boolean persisted,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PagediagramVisualIDRegistry
				.getType(LogicNodeTypeEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(
				containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter
					.getFontData(prefStore,
							IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle
					.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
			nodeFontStyle
					.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle
					.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
							.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						node,
						NotationPackage.eINSTANCE.getFillStyle_FillColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(fillRGB));
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createConditionalOutType_4001(
			org.eclipse.emf.ecore.EObject domainElement,
			View containerView,
			int index,
			boolean persisted,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		java.util.ArrayList<RelativeBendpoint> points = new java.util.ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(
				containerView, edge, index, persisted);
		edge.setType(PagediagramVisualIDRegistry
				.getType(ConditionalOutTypeEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						edge,
						NotationPackage.eINSTANCE.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter
					.getFontData(prefStore,
							IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle
					.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
			edgeFontStyle
					.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle
					.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
							.RGBToInteger(fontRGB).intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
					.setStructuralFeatureValue(
							edge,
							NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
							routing);
		}
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createDisplayOutType_4002(
			org.eclipse.emf.ecore.EObject domainElement,
			View containerView,
			int index,
			boolean persisted,
			org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		java.util.ArrayList<RelativeBendpoint> points = new java.util.ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(
				containerView, edge, index, persisted);
		edge.setType(PagediagramVisualIDRegistry
				.getType(DisplayOutTypeEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter
				.getColor(prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						edge,
						NotationPackage.eINSTANCE.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter
					.getFontData(prefStore,
							IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle
					.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
			edgeFontStyle
					.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle
					.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
							.RGBToInteger(fontRGB).intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
					.setStructuralFeatureValue(
							edge,
							NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
							routing);
		}
		return edge;
	}

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!WebChunkTypeEditPart.MODEL_ID.equals(PagediagramVisualIDRegistry
				.getModelID(containerView))) {
			org.eclipse.emf.ecore.EAnnotation shortcutAnnotation = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", WebChunkTypeEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private org.eclipse.emf.ecore.EObject getSemanticElement(
			org.eclipse.core.runtime.IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) semanticAdapter
				.getAdapter(org.eclipse.emf.ecore.EObject.class);
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
