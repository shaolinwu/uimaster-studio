/**
 */
package org.shaolin.uimaster.datamodel.page.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.shaolin.uimaster.datamodel.common.CommonFactory;

import org.shaolin.uimaster.datamodel.common.provider.EntityTypeItemProvider;

import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PagePackage;
import org.shaolin.uimaster.datamodel.page.UIBaseType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.UIBaseType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIBaseTypeItemProvider
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
	public UIBaseTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PagePackage.Literals.UI_BASE_TYPE__EVENT_HANDLER);
			childrenFeatures.add(PagePackage.Literals.UI_BASE_TYPE__VARIABLE);
			childrenFeatures.add(PagePackage.Literals.UI_BASE_TYPE__RECONFIGURABLE_PROPERTY);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UIBaseType)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_UIBaseType_type") :
			getString("_UI_UIBaseType_type") + " " + label;
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

		switch (notification.getFeatureID(UIBaseType.class)) {
			case PagePackage.UI_BASE_TYPE__EVENT_HANDLER:
			case PagePackage.UI_BASE_TYPE__VARIABLE:
			case PagePackage.UI_BASE_TYPE__RECONFIGURABLE_PROPERTY:
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
				(PagePackage.Literals.UI_BASE_TYPE__EVENT_HANDLER,
				 PageFactory.eINSTANCE.createFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_BASE_TYPE__VARIABLE,
				 CommonFactory.eINSTANCE.createVariableType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_BASE_TYPE__VARIABLE,
				 CommonFactory.eINSTANCE.createParamType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_BASE_TYPE__RECONFIGURABLE_PROPERTY,
				 PageFactory.eINSTANCE.createReconfigurableType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_BASE_TYPE__RECONFIGURABLE_PROPERTY,
				 PageFactory.eINSTANCE.createReconfigurableFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_BASE_TYPE__RECONFIGURABLE_PROPERTY,
				 PageFactory.eINSTANCE.createReconfigurablePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_BASE_TYPE__RECONFIGURABLE_PROPERTY,
				 PageFactory.eINSTANCE.createReconfigurableVariableType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PageEditPlugin.INSTANCE;
	}

}
