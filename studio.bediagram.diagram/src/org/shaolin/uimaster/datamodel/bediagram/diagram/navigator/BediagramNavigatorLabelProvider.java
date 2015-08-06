package org.shaolin.uimaster.datamodel.bediagram.diagram.navigator;

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
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEInheritConnectionEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEListAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.OandOAssociationEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorPlugin;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;

/**
 * @generated
 */
public class BediagramNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		BediagramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		BediagramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof BediagramNavigatorItem
				&& !isOwnView(((BediagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof BediagramNavigatorGroup) {
			BediagramNavigatorGroup group = (BediagramNavigatorGroup) element;
			return BediagramDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof BediagramNavigatorItem) {
			BediagramNavigatorItem navigatorItem = (BediagramNavigatorItem) element;
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
		switch (BediagramVisualIDRegistry.getVisualID(view)) {
		case BEDiagramTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://bmdp.shaolin.org/datamodel/BEDiagram?BEDiagramType", BediagramElementTypes.BEDiagramType_1000); //$NON-NLS-1$
		case CENodeTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bmdp.shaolin.org/datamodel/BEDiagram?CENodeType", BediagramElementTypes.CENodeType_2001); //$NON-NLS-1$
		case CEMemberContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://bmdp.shaolin.org/datamodel/BEDiagram?CENodeType", BediagramElementTypes.CENodeType_2011); //$NON-NLS-1$
		case BENodeTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bmdp.shaolin.org/datamodel/BEDiagram?BENodeType", BediagramElementTypes.BENodeType_2002); //$NON-NLS-1$
		case BEMemberContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://bmdp.shaolin.org/datamodel/BEDiagram?BENodeType", BediagramElementTypes.BENodeType_2012); //$NON-NLS-1$
		case BEInheritConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bmdp.shaolin.org/datamodel/BEDiagram?ObjectRefType", BediagramElementTypes.BEExtConnectionType_2005); //$NON-NLS-1$
		case BEListAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bmdp.shaolin.org/datamodel/BEDiagram?BECollectionType", BediagramElementTypes.BEListAssociationType_2007); //$NON-NLS-1$
		case OandOAssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bmdp.shaolin.org/datamodel/BEDiagram?BEComplexType", BediagramElementTypes.OaOAssociationType_2006); //$NON-NLS-1$

		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = BediagramDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& BediagramElementTypes.isKnownElementType(elementType)) {
			image = BediagramElementTypes.getImage(elementType);
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
		if (element instanceof BediagramNavigatorGroup) {
			BediagramNavigatorGroup group = (BediagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof BediagramNavigatorItem) {
			BediagramNavigatorItem navigatorItem = (BediagramNavigatorItem) element;
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
		switch (BediagramVisualIDRegistry.getVisualID(view)) {
		case BEDiagramTypeEditPart.VISUAL_ID:
			return getBEDiagramType_1000Text(view);
		case CENodeTypeEditPart.VISUAL_ID:
		case CEMemberContainerEditPart.VISUAL_ID:
			return getCENodeType_2001Text(view);
		case BENodeTypeEditPart.VISUAL_ID:
		case BEMemberContainerEditPart.VISUAL_ID:
			return getBENodeType_2002Text(view);
		case BEInheritConnectionEditPart.VISUAL_ID:
			return getBENodeType_2002Text(view);
		case BEListAssociationEditPart.VISUAL_ID:
			return getBENodeType_2002Text(view);
		case OandOAssociationEditPart.VISUAL_ID:
			return getBENodeType_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getBEDiagramType_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCENodeType_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBENodeType_2002Text(View view) {
		return ""; //$NON-NLS-1$
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
		return BEDiagramTypeEditPart.MODEL_ID.equals(BediagramVisualIDRegistry
				.getModelID(view));
	}

}
