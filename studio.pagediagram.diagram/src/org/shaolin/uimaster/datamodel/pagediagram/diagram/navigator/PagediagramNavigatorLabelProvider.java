package org.shaolin.uimaster.datamodel.pagediagram.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType;
import org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.PageNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.StartNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.WebChunkType;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.ConditionalOutTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.DisplayOutTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.FlowNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.LogicNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.PageNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.StartNodeTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes;

/**
 * @generated
 */
public class PagediagramNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		PagediagramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		PagediagramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PagediagramNavigatorItem
				&& !isOwnView(((PagediagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof PagediagramNavigatorGroup) {
			PagediagramNavigatorGroup group = (PagediagramNavigatorGroup) element;
			return PagediagramDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof PagediagramNavigatorItem) {
			PagediagramNavigatorItem navigatorItem = (PagediagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (PagediagramVisualIDRegistry.getVisualID(view)) {
		case FlowNodeTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bmdp.shaolin.org/datamodel/PageDiagram?FlowNodeType", PagediagramElementTypes.FlowNodeType_2003); //$NON-NLS-1$
		case LogicNodeTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bmdp.shaolin.org/datamodel/PageDiagram?LogicNodeType", PagediagramElementTypes.LogicNodeType_2005); //$NON-NLS-1$
		case StartNodeTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bmdp.shaolin.org/datamodel/PageDiagram?StartNodeType", PagediagramElementTypes.StartNodeType_2001); //$NON-NLS-1$
		case DisplayNodeTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bmdp.shaolin.org/datamodel/PageDiagram?DisplayNodeType", PagediagramElementTypes.DisplayNodeType_2002); //$NON-NLS-1$
		case DisplayOutTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bmdp.shaolin.org/datamodel/PageDiagram?DisplayOutType", PagediagramElementTypes.DisplayOutType_4002); //$NON-NLS-1$
		case PageNodeTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bmdp.shaolin.org/datamodel/PageDiagram?PageNodeType", PagediagramElementTypes.PageNodeType_2004); //$NON-NLS-1$
		case WebChunkTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://bmdp.shaolin.org/datamodel/PageDiagram?WebChunkType", PagediagramElementTypes.WebChunkType_1000); //$NON-NLS-1$
		case ConditionalOutTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bmdp.shaolin.org/datamodel/PageDiagram?ConditionalOutType", PagediagramElementTypes.ConditionalOutType_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PagediagramDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& PagediagramElementTypes.isKnownElementType(elementType)) {
			image = PagediagramElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof PagediagramNavigatorGroup) {
			PagediagramNavigatorGroup group = (PagediagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PagediagramNavigatorItem) {
			PagediagramNavigatorItem navigatorItem = (PagediagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PagediagramVisualIDRegistry.getVisualID(view)) {
		case FlowNodeTypeEditPart.VISUAL_ID:
			return getFlowNodeType_2003Text(view);
		case LogicNodeTypeEditPart.VISUAL_ID:
			return getLogicNodeType_2005Text(view);
		case StartNodeTypeEditPart.VISUAL_ID:
			return getStartNodeType_2001Text(view);
		case DisplayNodeTypeEditPart.VISUAL_ID:
			return getDisplayNodeType_2002Text(view);
		case DisplayOutTypeEditPart.VISUAL_ID:
			return getDisplayOutType_4002Text(view);
		case PageNodeTypeEditPart.VISUAL_ID:
			return getPageNodeType_2004Text(view);
		case WebChunkTypeEditPart.VISUAL_ID:
			return getWebChunkType_1000Text(view);
		case ConditionalOutTypeEditPart.VISUAL_ID:
			return getConditionalOutType_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getFlowNodeType_2003Text(View view) {
		FlowNodeType domainModelElement = (FlowNodeType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			PagediagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogicNodeType_2005Text(View view) {
		LogicNodeType domainModelElement = (LogicNodeType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			PagediagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStartNodeType_2001Text(View view) {
		StartNodeType domainModelElement = (StartNodeType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			PagediagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDisplayNodeType_2002Text(View view) {
		DisplayNodeType domainModelElement = (DisplayNodeType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			PagediagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDisplayOutType_4002Text(View view) {
		DisplayOutType domainModelElement = (DisplayOutType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			PagediagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPageNodeType_2004Text(View view) {
		PageNodeType domainModelElement = (PageNodeType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			PagediagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWebChunkType_1000Text(View view) {
		WebChunkType domainModelElement = (WebChunkType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getEntityName());
		} else {
			PagediagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalOutType_4001Text(View view) {
		ConditionalOutType domainModelElement = (ConditionalOutType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			PagediagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebChunkTypeEditPart.MODEL_ID.equals(PagediagramVisualIDRegistry
				.getModelID(view));
	}

}
