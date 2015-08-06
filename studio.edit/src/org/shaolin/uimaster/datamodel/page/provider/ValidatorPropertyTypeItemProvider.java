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
import org.shaolin.uimaster.datamodel.page.ValidatorPropertyType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.ValidatorPropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidatorPropertyTypeItemProvider
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
	public ValidatorPropertyTypeItemProvider(AdapterFactory adapterFactory) {
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

			addIsFuncRefPropertyDescriptor(object);
			addFuncCodePropertyDescriptor(object);
			addErrMsgPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Func Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsFuncRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValidatorPropertyType_isFuncRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValidatorPropertyType_isFuncRef_feature", "_UI_ValidatorPropertyType_type"),
				 PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__IS_FUNC_REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Func Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFuncCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValidatorPropertyType_funcCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValidatorPropertyType_funcCode_feature", "_UI_ValidatorPropertyType_type"),
				 PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__FUNC_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Err Msg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrMsgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValidatorPropertyType_errMsg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValidatorPropertyType_errMsg_feature", "_UI_ValidatorPropertyType_type"),
				 PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__ERR_MSG,
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
			childrenFeatures.add(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY);
			childrenFeatures.add(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__COMPONENT);
			childrenFeatures.add(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__PARAM);
			childrenFeatures.add(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__I18N_MSG);
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
	 * This returns ValidatorPropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValidatorPropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String name = ((ValidatorPropertyType)object).eContainmentFeature().getName();
		String label = ((ValidatorPropertyType)object).getFuncCode();
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

		switch (notification.getFeatureID(ValidatorPropertyType.class)) {
			case PagePackage.VALIDATOR_PROPERTY_TYPE__IS_FUNC_REF:
			case PagePackage.VALIDATOR_PROPERTY_TYPE__FUNC_CODE:
			case PagePackage.VALIDATOR_PROPERTY_TYPE__ERR_MSG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PagePackage.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY:
			case PagePackage.VALIDATOR_PROPERTY_TYPE__COMPONENT:
			case PagePackage.VALIDATOR_PROPERTY_TYPE__PARAM:
			case PagePackage.VALIDATOR_PROPERTY_TYPE__I18N_MSG:
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
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createBooleanPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createColorPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createDatePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createEntityPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createExpressionPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createFontPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createImagePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createNullPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createNumericPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createResourceBundlePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createValidatorPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY,
				 PageFactory.eINSTANCE.createValidatorsPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__PARAM,
				 PageFactory.eINSTANCE.createStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__I18N_MSG,
				 PageFactory.eINSTANCE.createResourceBundlePropertyType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__TARGET_ENTITY ||
			childFeature == PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__I18N_MSG ||
			childFeature == PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__COMPONENT ||
			childFeature == PagePackage.Literals.VALIDATOR_PROPERTY_TYPE__PARAM;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
