/**
 */
package org.shaolin.uimaster.datamodel.page.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.shaolin.uimaster.datamodel.page.ArrayPropertyType;
import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PagePackage;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.ArrayPropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayPropertyTypeItemProvider
	extends PropertyValueTypeItemProvider
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
	public ArrayPropertyTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY);
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
	 * This returns ArrayPropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArrayPropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String name = ((ArrayPropertyType)object).eContainmentFeature().getName();
		String label = ((ArrayPropertyType)object).getProperty().toString();
		return label == null || label.length() == 0 ?
				name : name + " " + label;
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

		switch (notification.getFeatureID(ArrayPropertyType.class)) {
			case PagePackage.ARRAY_PROPERTY_TYPE__PROPERTY:
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
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createBooleanPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createColorPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createDatePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createEntityPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createExpressionPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createFontPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createImagePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createNullPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createNumericPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createResourceBundlePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createValidatorPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.ARRAY_PROPERTY_TYPE__PROPERTY,
				 PageFactory.eINSTANCE.createValidatorsPropertyType()));
	}

}
