/**
 */
package org.shaolin.uimaster.datamodel.pagediagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.shaolin.uimaster.datamodel.common.CommonFactory;

import org.shaolin.uimaster.datamodel.common.provider.EntityTypeItemProvider;

import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramFactory;
import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage;
import org.shaolin.uimaster.datamodel.pagediagram.WebChunkType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebChunkTypeItemProvider
	extends EntityTypeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebChunkTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addErrorHandlerPropertyDescriptor(object);
			addAccessPermissionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Error Handler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorHandlerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebChunkType_errorHandler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebChunkType_errorHandler_feature", "_UI_WebChunkType_type"),
				 PageDiagramPackage.Literals.WEB_CHUNK_TYPE__ERROR_HANDLER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Permission feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessPermissionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebChunkType_accessPermission_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebChunkType_accessPermission_feature", "_UI_WebChunkType_type"),
				 PageDiagramPackage.Literals.WEB_CHUNK_TYPE__ACCESS_PERMISSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PageDiagramPackage.Literals.WEB_CHUNK_TYPE__WEB_NODE);
			childrenFeatures.add(PageDiagramPackage.Literals.WEB_CHUNK_TYPE__GLOBAL_VARIABLE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WebChunkType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WebChunkType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WebChunkType)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_WebChunkType_type") :
			getString("_UI_WebChunkType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(WebChunkType.class)) {
			case PageDiagramPackage.WEB_CHUNK_TYPE__ERROR_HANDLER:
			case PageDiagramPackage.WEB_CHUNK_TYPE__ACCESS_PERMISSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PageDiagramPackage.WEB_CHUNK_TYPE__WEB_NODE:
			case PageDiagramPackage.WEB_CHUNK_TYPE__GLOBAL_VARIABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PageDiagramPackage.Literals.WEB_CHUNK_TYPE__WEB_NODE,
				 PageDiagramFactory.eINSTANCE.createDisplayNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(PageDiagramPackage.Literals.WEB_CHUNK_TYPE__WEB_NODE,
				 PageDiagramFactory.eINSTANCE.createFlowNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(PageDiagramPackage.Literals.WEB_CHUNK_TYPE__WEB_NODE,
				 PageDiagramFactory.eINSTANCE.createLogicNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(PageDiagramPackage.Literals.WEB_CHUNK_TYPE__WEB_NODE,
				 PageDiagramFactory.eINSTANCE.createPageNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(PageDiagramPackage.Literals.WEB_CHUNK_TYPE__WEB_NODE,
				 PageDiagramFactory.eINSTANCE.createStartNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(PageDiagramPackage.Literals.WEB_CHUNK_TYPE__GLOBAL_VARIABLE,
				 CommonFactory.eINSTANCE.createParamType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PagediagramEditPlugin.INSTANCE;
	}

}
