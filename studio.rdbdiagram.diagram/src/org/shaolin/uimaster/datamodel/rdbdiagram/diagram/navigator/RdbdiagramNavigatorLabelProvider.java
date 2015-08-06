package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.navigator;

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
import org.shaolin.uimaster.datamodel.rdbdiagram.FKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType;
import org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ViewType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.InheritTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.JoinTableTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.RDBDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.ViewTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramDiagramEditorPlugin;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramVisualIDRegistry;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers.RdbdiagramElementTypes;

/**
 * @generated
 */
public class RdbdiagramNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RdbdiagramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RdbdiagramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RdbdiagramNavigatorItem
				&& !isOwnView(((RdbdiagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RdbdiagramNavigatorGroup) {
			RdbdiagramNavigatorGroup group = (RdbdiagramNavigatorGroup) element;
			return RdbdiagramDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RdbdiagramNavigatorItem) {
			RdbdiagramNavigatorItem navigatorItem = (RdbdiagramNavigatorItem) element;
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
		switch (RdbdiagramVisualIDRegistry.getVisualID(view)) {
		case JoinTableTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bmdp.shaolin.org/datamodel/RDBDiagram?EndToEndAssociationType", RdbdiagramElementTypes.TableType_JoinTable_4003); //$NON-NLS-1$
		case InheritTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bmdp.shaolin.org/datamodel/RDBDiagram?InheritAssociationType", RdbdiagramElementTypes.TableType_Inherit_4004); //$NON-NLS-1$
		case TableTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bmdp.shaolin.org/datamodel/RDBDiagram?TableType", RdbdiagramElementTypes.TableType_2001); //$NON-NLS-1$
		case TableMemberContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://bmdp.shaolin.org/datamodel/RDBDiagram?TableType", RdbdiagramElementTypes.TableType_2011); //$NON-NLS-1$
		case ViewTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bmdp.shaolin.org/datamodel/RDBDiagram?ViewType", RdbdiagramElementTypes.ViewType_2002); //$NON-NLS-1$
		case RDBDiagramTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://bmdp.shaolin.org/datamodel/RDBDiagram?RDBDiagramType", RdbdiagramElementTypes.RDBDiagramType_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RdbdiagramDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RdbdiagramElementTypes.isKnownElementType(elementType)) {
			image = RdbdiagramElementTypes.getImage(elementType);
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
		if (element instanceof RdbdiagramNavigatorGroup) {
			RdbdiagramNavigatorGroup group = (RdbdiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RdbdiagramNavigatorItem) {
			RdbdiagramNavigatorItem navigatorItem = (RdbdiagramNavigatorItem) element;
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
		switch (RdbdiagramVisualIDRegistry.getVisualID(view)) {
		case JoinTableTypeEditPart.VISUAL_ID:
			return getJoinTableType_4003Text(view);
		case InheritTypeEditPart.VISUAL_ID:
			return getInheritType_4004Text(view);
		case TableTypeEditPart.VISUAL_ID:
		case TableMemberContainerEditPart.VISUAL_ID:
			return getTableType_2001Text(view);
		case ViewTypeEditPart.VISUAL_ID:
			return getViewType_2002Text(view);
		case RDBDiagramTypeEditPart.VISUAL_ID:
			return getRDBDiagramType_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTableType_2001Text(View view) {
		TableType domainModelElement = (TableType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			RdbdiagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRDBDiagramType_1000Text(View view) {
		RDBDiagramType domainModelElement = (RDBDiagramType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getDaoPackage());
		} else {
			RdbdiagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFKType_4001Text(View view) {
		FKType domainModelElement = (FKType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getColumnName());
		} else {
			RdbdiagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}
	
	private String getJoinTableType_4003Text(View view) {
		JoinTableType domainModelElement = (JoinTableType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			RdbdiagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}
	
	private String getInheritType_4004Text(View view) {
		InheritAssociationType domainModelElement = (InheritAssociationType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			RdbdiagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getViewType_2002Text(View view) {
		ViewType domainModelElement = (ViewType) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			RdbdiagramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
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
		return RDBDiagramTypeEditPart.MODEL_ID
				.equals(RdbdiagramVisualIDRegistry.getModelID(view));
	}

}
