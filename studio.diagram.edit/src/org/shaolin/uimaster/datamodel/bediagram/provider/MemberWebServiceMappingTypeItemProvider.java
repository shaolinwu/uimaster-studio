/**
 */
package org.shaolin.uimaster.datamodel.bediagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType;

import org.shaolin.uimaster.datamodel.common.provider.MetaDataTypeItemProvider;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MemberWebServiceMappingTypeItemProvider
	extends MetaDataTypeItemProvider
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
	public MemberWebServiceMappingTypeItemProvider(AdapterFactory adapterFactory) {
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

			addCollectionWrappedPropertyDescriptor(object);
			addIgnorePropertyDescriptor(object);
			addMappedNamePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Collection Wrapped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionWrappedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberWebServiceMappingType_collectionWrapped_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberWebServiceMappingType_collectionWrapped_feature", "_UI_MemberWebServiceMappingType_type"),
				 BEDiagramPackage.Literals.MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ignore feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberWebServiceMappingType_ignore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberWebServiceMappingType_ignore_feature", "_UI_MemberWebServiceMappingType_type"),
				 BEDiagramPackage.Literals.MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapped Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberWebServiceMappingType_mappedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberWebServiceMappingType_mappedName_feature", "_UI_MemberWebServiceMappingType_type"),
				 BEDiagramPackage.Literals.MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberWebServiceMappingType_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberWebServiceMappingType_style_feature", "_UI_MemberWebServiceMappingType_type"),
				 BEDiagramPackage.Literals.MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns MemberWebServiceMappingType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MemberWebServiceMappingType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MemberWebServiceMappingType)object).getMappedName();
		return label == null || label.length() == 0 ?
			getString("_UI_MemberWebServiceMappingType_type") :
			getString("_UI_MemberWebServiceMappingType_type") + " " + label;
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

		switch (notification.getFeatureID(MemberWebServiceMappingType.class)) {
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED:
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE:
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME:
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BediagramEditPlugin.INSTANCE;
	}

}
