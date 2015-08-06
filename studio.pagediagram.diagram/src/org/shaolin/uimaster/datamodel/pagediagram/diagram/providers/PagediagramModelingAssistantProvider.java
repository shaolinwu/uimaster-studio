package org.shaolin.uimaster.datamodel.pagediagram.diagram.providers;

/**
 * @generated
 */
public class PagediagramModelingAssistantProvider
		extends org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider {

		/**
 * @generated
 */
	public java.util.List getTypesForPopupBar(org.eclipse.core.runtime.IAdaptable host) {
		org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart editPart =
				(org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) host.getAdapter(
						org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart.class);
							if (editPart instanceof org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart) {
			java.util.ArrayList<org.eclipse.gmf.runtime.emf.type.core.IElementType> types = new java.util.ArrayList<org.eclipse.gmf.runtime.emf.type.core.IElementType>(5);
							types.add(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.StartNodeType_2001);
							types.add(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.DisplayNodeType_2002);
							types.add(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.FlowNodeType_2003);
							types.add(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.PageNodeType_2004);
							types.add(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.LogicNodeType_2005);
							return types;
		}
																																return java.util.Collections.EMPTY_LIST;
	}

		/**
 * @generated
 */
	public java.util.List getRelTypesOnSource(org.eclipse.core.runtime.IAdaptable source) {
		org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart sourceEditPart =
				(org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) source.getAdapter(
						org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart.class);
																													return java.util.Collections.EMPTY_LIST;
	}

		/**
 * @generated
 */
	public java.util.List getRelTypesOnTarget(org.eclipse.core.runtime.IAdaptable target) {
		org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart targetEditPart =
				(org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) target.getAdapter(
						org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart.class);
																													return java.util.Collections.EMPTY_LIST;
	}

		/**
 * @generated
 */
	public java.util.List getRelTypesOnSourceAndTarget(
			org.eclipse.core.runtime.IAdaptable source, org.eclipse.core.runtime.IAdaptable target) {
		org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart sourceEditPart =
				(org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) source.getAdapter(
						org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart.class);
		org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart targetEditPart =
				(org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) target.getAdapter(
						org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart.class);
																													return java.util.Collections.EMPTY_LIST;
	}

		/**
 * @generated
 */
	public java.util.List getTypesForSource(org.eclipse.core.runtime.IAdaptable target,
			org.eclipse.gmf.runtime.emf.type.core.IElementType relationshipType) {
		org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart targetEditPart =
				(org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) target.getAdapter(
						org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart.class);
																													return java.util.Collections.EMPTY_LIST;
	}

		/**
 * @generated
 */
	public java.util.List getTypesForTarget(org.eclipse.core.runtime.IAdaptable source,
			org.eclipse.gmf.runtime.emf.type.core.IElementType relationshipType) {
		org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart sourceEditPart =
				(org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) source.getAdapter(
						org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart.class);
																													return java.util.Collections.EMPTY_LIST;
	}

		/**
 * @generated
 */
	public org.eclipse.emf.ecore.EObject selectExistingElementForSource(
			org.eclipse.core.runtime.IAdaptable target,
			org.eclipse.gmf.runtime.emf.type.core.IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

		/**
 * @generated
 */
	public org.eclipse.emf.ecore.EObject selectExistingElementForTarget(
			org.eclipse.core.runtime.IAdaptable source,
			org.eclipse.gmf.runtime.emf.type.core.IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

		/**
 * @generated
 */
	protected org.eclipse.emf.ecore.EObject selectExistingElement(
			org.eclipse.core.runtime.IAdaptable host, java.util.Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart editPart =
				(org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) host.getAdapter(
						org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		org.eclipse.gmf.runtime.notation.Diagram diagram =
				(org.eclipse.gmf.runtime.notation.Diagram) editPart.getRoot().getContents().getModel();
		java.util.HashSet<org.eclipse.emf.ecore.EObject> elements = new java.util.HashSet<org.eclipse.emf.ecore.EObject>();
		for (java.util.Iterator<org.eclipse.emf.ecore.EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
	org.eclipse.emf.ecore.EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((org.eclipse.emf.ecore.EObject[]) elements.toArray(
				new org.eclipse.emf.ecore.EObject[elements.size()]));
	}

		/**
 * @generated
 */
	protected boolean isApplicableElement(org.eclipse.emf.ecore.EObject element, java.util.Collection types) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType type =
				org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

		/**
 * @generated
 */
	protected org.eclipse.emf.ecore.EObject selectElement(org.eclipse.emf.ecore.EObject[] elements) {
		org.eclipse.swt.widgets.Shell shell = org.eclipse.swt.widgets.Display.getCurrent().getActiveShell();
		org.eclipse.jface.viewers.ILabelProvider labelProvider =
			new org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		org.eclipse.ui.dialogs.ElementListSelectionDialog dialog =
				new org.eclipse.ui.dialogs.ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramModelingAssistantProviderMessage);
		dialog.setTitle(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		org.eclipse.emf.ecore.EObject selected = null;
		if (dialog.open() == org.eclipse.jface.window.Window.OK) {
			selected = (org.eclipse.emf.ecore.EObject) dialog.getFirstResult();
		}
		return selected;
	}
	}