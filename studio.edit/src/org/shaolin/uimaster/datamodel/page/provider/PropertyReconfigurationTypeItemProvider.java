/**
 */
package org.shaolin.uimaster.datamodel.page.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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

import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PagePackage;
import org.shaolin.uimaster.datamodel.page.PropertyReconfigurationType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.PropertyReconfigurationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyReconfigurationTypeItemProvider
	extends ReconfigurationTypeItemProvider
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
	public PropertyReconfigurationTypeItemProvider(AdapterFactory adapterFactory) {
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

			addPropertyNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyReconfigurationType_propertyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyReconfigurationType_propertyName_feature", "_UI_PropertyReconfigurationType_type"),
				 PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__PROPERTY_NAME,
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
			childrenFeatures.add(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE);
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
	 * This returns PropertyReconfigurationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertyReconfigurationType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PropertyReconfigurationType)object).getPropertyName();
		return label == null || label.length() == 0 ?
			getString("_UI_PropertyReconfigurationType_type") :
			getString("_UI_PropertyReconfigurationType_type") + " " + label;
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

		switch (notification.getFeatureID(PropertyReconfigurationType.class)) {
			case PagePackage.PROPERTY_RECONFIGURATION_TYPE__PROPERTY_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PagePackage.PROPERTY_RECONFIGURATION_TYPE__VALUE:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createBooleanPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createColorPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createDatePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createEntityPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createExpressionPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createFontPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createImagePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createNullPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createNumericPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createResourceBundlePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createValidatorPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.PROPERTY_RECONFIGURATION_TYPE__VALUE,
				 PageFactory.eINSTANCE.createValidatorsPropertyType()));
	}

}
