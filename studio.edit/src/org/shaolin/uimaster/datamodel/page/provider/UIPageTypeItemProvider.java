/**
 */
package org.shaolin.uimaster.datamodel.page.provider;


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

import org.shaolin.uimaster.datamodel.common.provider.EntityTypeItemProvider;

import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PagePackage;
import org.shaolin.uimaster.datamodel.page.UIPageType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.UIPageType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIPageTypeItemProvider
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
	public UIPageTypeItemProvider(AdapterFactory adapterFactory) {
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

			addIsAjaxHandlingAllowedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Ajax Handling Allowed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAjaxHandlingAllowedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIPageType_isAjaxHandlingAllowed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIPageType_isAjaxHandlingAllowed_feature", "_UI_UIPageType_type"),
				 PagePackage.Literals.UI_PAGE_TYPE__IS_AJAX_HANDLING_ALLOWED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(PagePackage.Literals.UI_PAGE_TYPE__UI_ENTITY);
			childrenFeatures.add(PagePackage.Literals.UI_PAGE_TYPE__OD_MAPPING);
			childrenFeatures.add(PagePackage.Literals.UI_PAGE_TYPE__IN);
			childrenFeatures.add(PagePackage.Literals.UI_PAGE_TYPE__OUT);
			childrenFeatures.add(PagePackage.Literals.UI_PAGE_TYPE__FINALIZE);
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
	 * This returns UIPageType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UIPageType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UIPageType)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_UIPageType_type") :
			getString("_UI_UIPageType_type") + " " + label;
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

		switch (notification.getFeatureID(UIPageType.class)) {
			case PagePackage.UI_PAGE_TYPE__IS_AJAX_HANDLING_ALLOWED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PagePackage.UI_PAGE_TYPE__UI_ENTITY:
			case PagePackage.UI_PAGE_TYPE__OD_MAPPING:
			case PagePackage.UI_PAGE_TYPE__IN:
			case PagePackage.UI_PAGE_TYPE__OUT:
			case PagePackage.UI_PAGE_TYPE__FINALIZE:
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
				(PagePackage.Literals.UI_PAGE_TYPE__UI_ENTITY,
				 PageFactory.eINSTANCE.createUIEntityType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_PAGE_TYPE__OD_MAPPING,
				 PageFactory.eINSTANCE.createPageODMappingType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_PAGE_TYPE__IN,
				 PageFactory.eINSTANCE.createPageInType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_PAGE_TYPE__OUT,
				 PageFactory.eINSTANCE.createPageOutType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_PAGE_TYPE__FINALIZE,
				 PageFactory.eINSTANCE.createClientActionType()));
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
