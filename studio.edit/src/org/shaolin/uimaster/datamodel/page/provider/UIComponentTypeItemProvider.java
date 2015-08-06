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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PagePackage;
import org.shaolin.uimaster.datamodel.page.UIComponentType;
import org.shaolin.uimaster.datamodel.page.provider.ext.IItemActionMenu;
import org.shaolin.uimaster.datamodel.page.provider.ext.IItemPropertyMenu;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.UIComponentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIComponentTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemPropertyMenu,
		IItemActionMenu{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIComponentTypeItemProvider(AdapterFactory adapterFactory) {
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

			addUIStylePropertyDescriptor(object);
			addPreIncludePagePropertyDescriptor(object);
			addPostIncludePagePropertyDescriptor(object);
			addUIIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the UI Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUIStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIComponentType_uIStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIComponentType_uIStyle_feature", "_UI_UIComponentType_type"),
				 PagePackage.Literals.UI_COMPONENT_TYPE__UI_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pre Include Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreIncludePagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIComponentType_preIncludePage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIComponentType_preIncludePage_feature", "_UI_UIComponentType_type"),
				 PagePackage.Literals.UI_COMPONENT_TYPE__PRE_INCLUDE_PAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Post Include Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostIncludePagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIComponentType_postIncludePage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIComponentType_postIncludePage_feature", "_UI_UIComponentType_type"),
				 PagePackage.Literals.UI_COMPONENT_TYPE__POST_INCLUDE_PAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the UIID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUIIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIComponentType_uIID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIComponentType_uIID_feature", "_UI_UIComponentType_type"),
				 PagePackage.Literals.UI_COMPONENT_TYPE__UIID,
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
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__PROPERTY);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__VISIBLE);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__READ_ONLY);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__EDITABLE);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__UI_SKIN);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__WIDGET_LABEL);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__WIDGET_LABEL_COLOR);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__WIDGET_LABEL_FONT);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__INIT_VALIDATION);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__VALIDATOR);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__VIEW_PERMISSION);
			childrenFeatures.add(PagePackage.Literals.UI_COMPONENT_TYPE__EDIT_PERMISSION);
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
		String label = ((UIComponentType)object).getUIStyle();
		return label == null || label.length() == 0 ?
			getString("_UI_UIComponentType_type") :
			getString("_UI_UIComponentType_type") + " " + label;
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

		switch (notification.getFeatureID(UIComponentType.class)) {
			case PagePackage.UI_COMPONENT_TYPE__UI_STYLE:
			case PagePackage.UI_COMPONENT_TYPE__PRE_INCLUDE_PAGE:
			case PagePackage.UI_COMPONENT_TYPE__POST_INCLUDE_PAGE:
			case PagePackage.UI_COMPONENT_TYPE__UIID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PagePackage.UI_COMPONENT_TYPE__PROPERTY:
			case PagePackage.UI_COMPONENT_TYPE__EVENT_LISTENER:
			case PagePackage.UI_COMPONENT_TYPE__VISIBLE:
			case PagePackage.UI_COMPONENT_TYPE__READ_ONLY:
			case PagePackage.UI_COMPONENT_TYPE__EDITABLE:
			case PagePackage.UI_COMPONENT_TYPE__UI_SKIN:
			case PagePackage.UI_COMPONENT_TYPE__WIDGET_LABEL:
			case PagePackage.UI_COMPONENT_TYPE__WIDGET_LABEL_COLOR:
			case PagePackage.UI_COMPONENT_TYPE__WIDGET_LABEL_FONT:
			case PagePackage.UI_COMPONENT_TYPE__INIT_VALIDATION:
			case PagePackage.UI_COMPONENT_TYPE__VALIDATOR:
			case PagePackage.UI_COMPONENT_TYPE__VIEW_PERMISSION:
			case PagePackage.UI_COMPONENT_TYPE__EDIT_PERMISSION:
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
	}
	
	public void collectNewPropertyDescriptors(Collection<Object> newChildDescriptors, Object object) {

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__WIDGET_LABEL,
				 PageFactory.eINSTANCE.createStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__WIDGET_LABEL,
				PageFactory.eINSTANCE.createResourceBundlePropertyType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__WIDGET_LABEL,
				 PageFactory.eINSTANCE.createExpressionPropertyType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__VISIBLE,
				 PageFactory.eINSTANCE.createBooleanPropertyType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__VISIBLE,
				 PageFactory.eINSTANCE.createExpressionPropertyType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__READ_ONLY,
				 PageFactory.eINSTANCE.createBooleanPropertyType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__READ_ONLY,
				 PageFactory.eINSTANCE.createExpressionPropertyType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EDITABLE,
				 PageFactory.eINSTANCE.createBooleanPropertyType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EDITABLE,
				 PageFactory.eINSTANCE.createExpressionPropertyType()));

		newChildDescriptors.add
		(createChildParameter
			(PagePackage.Literals.UI_COMPONENT_TYPE__INIT_VALIDATION,
			 PageFactory.eINSTANCE.createValidatorPropertyType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__VALIDATOR,
				 PageFactory.eINSTANCE.createValidatorPropertyType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__VALIDATOR,
				 PageFactory.eINSTANCE.createExpressionPropertyType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__VIEW_PERMISSION,
				 PageFactory.eINSTANCE.createStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__VIEW_PERMISSION,
				 PageFactory.eINSTANCE.createExpressionPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EDIT_PERMISSION,
				 PageFactory.eINSTANCE.createStringPropertyType()));

		newChildDescriptors.add
		(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EDIT_PERMISSION,
						PageFactory.eINSTANCE.createExpressionPropertyType()));
	}

	public void collectNewActionDescriptors(Collection<Object> newChildDescriptors, Object object) {
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
				 PageFactory.eINSTANCE.createClickListenerType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
						PageFactory.eINSTANCE.createDblClickListenerType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
				 PageFactory.eINSTANCE.createKeyDownListenerType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
				 PageFactory.eINSTANCE.createKeyPressListenerType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
				 PageFactory.eINSTANCE.createKeyUpListenerType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
				 PageFactory.eINSTANCE.createMouseDownListenerType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
				 PageFactory.eINSTANCE.createMouseOutListenerType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
				 PageFactory.eINSTANCE.createMouseOverListenerType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
				 PageFactory.eINSTANCE.createMouseUpListenerType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__EVENT_LISTENER,
				 PageFactory.eINSTANCE.createCustomListenerType()));
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
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__VISIBLE ||
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__READ_ONLY ||
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__EDITABLE ||
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__WIDGET_LABEL ||
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__WIDGET_LABEL_COLOR ||
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__WIDGET_LABEL_FONT ||
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__INIT_VALIDATION ||
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__VALIDATOR ||
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__VIEW_PERMISSION ||
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__EDIT_PERMISSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
