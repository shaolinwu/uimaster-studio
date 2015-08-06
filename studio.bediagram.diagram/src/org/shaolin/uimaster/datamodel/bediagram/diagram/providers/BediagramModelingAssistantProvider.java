package org.shaolin.uimaster.datamodel.bediagram.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BENodeTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorPlugin;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages;

/**
 * @generated
 */
public class BediagramModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof BEDiagramTypeEditPart) {
			ArrayList types = new ArrayList(7);
			types.add(BediagramElementTypes.CENodeType_2001);
			types.add(BediagramElementTypes.BENodeType_2002);
			types.add(BediagramElementTypes.BENodeType_MemberType_2003);
			types.add(BediagramElementTypes.CENodeType_MemberType_2004);
			types.add(BediagramElementTypes.BEExtConnectionType_2005);
			types.add(BediagramElementTypes.OaOAssociationType_2006);
			types.add(BediagramElementTypes.BEListAssociationType_2007);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);

		if (sourceEditPart instanceof BENodeTypeEditPart) {
			return ((BENodeTypeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		} else if (sourceEditPart instanceof BEMemberTypeEditPart) {
			return ((BEMemberTypeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}

		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);

		if (targetEditPart instanceof BENodeTypeEditPart) {
			return ((BENodeTypeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		} else if (targetEditPart instanceof BEMemberTypeEditPart) {
			return ((BEMemberTypeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}

		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);

		if (sourceEditPart instanceof BENodeTypeEditPart) {
			return ((BENodeTypeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		} else if (sourceEditPart instanceof BEMemberTypeEditPart) {
			return ((BEMemberTypeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}

		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);

		if (targetEditPart instanceof BENodeTypeEditPart) {
			return ((BENodeTypeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		} else if (targetEditPart instanceof BEMemberTypeEditPart) {
			return ((BEMemberTypeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}

		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);

		if (sourceEditPart instanceof BENodeTypeEditPart) {
			return ((BENodeTypeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		} else if (sourceEditPart instanceof BEMemberTypeEditPart) {
			return ((BEMemberTypeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}

		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				BediagramDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.BediagramModelingAssistantProviderMessage);
		dialog.setTitle(Messages.BediagramModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
