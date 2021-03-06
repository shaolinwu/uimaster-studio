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
import org.shaolin.uimaster.datamodel.page.UIContainerType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.UIContainerType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIContainerTypeItemProvider
	extends UIComponentTypeItemProvider
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
	public UIContainerTypeItemProvider(AdapterFactory adapterFactory) {
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

			addConstructorCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Constructor Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstructorCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIContainerType_constructorCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIContainerType_constructorCode_feature", "_UI_UIContainerType_type"),
				 PagePackage.Literals.UI_CONTAINER_TYPE__CONSTRUCTOR_CODE,
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
			childrenFeatures.add(PagePackage.Literals.UI_CONTAINER_TYPE__LAYOUT);
			childrenFeatures.add(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT);
			childrenFeatures.add(PagePackage.Literals.UI_CONTAINER_TYPE__LAYOUT_CONSTRAINT);
			childrenFeatures.add(PagePackage.Literals.UI_CONTAINER_TYPE__VALIDATION_LIST);
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
		String label = ((UIContainerType)object).getUIStyle();
		return label == null || label.length() == 0 ?
			getString("_UI_UIContainerType_type") :
			getString("_UI_UIContainerType_type") + " " + label;
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

		switch (notification.getFeatureID(UIContainerType.class)) {
			case PagePackage.UI_CONTAINER_TYPE__CONSTRUCTOR_CODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PagePackage.UI_CONTAINER_TYPE__LAYOUT:
			case PagePackage.UI_CONTAINER_TYPE__COMPONENT:
			case PagePackage.UI_CONTAINER_TYPE__LAYOUT_CONSTRAINT:
			case PagePackage.UI_CONTAINER_TYPE__VALIDATION_LIST:
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
				(PagePackage.Literals.UI_CONTAINER_TYPE__LAYOUT,
				 PageFactory.eINSTANCE.createTableLayoutType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__LAYOUT_CONSTRAINT,
				 PageFactory.eINSTANCE.createComponentConstraintType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIPanelType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
						PageFactory.eINSTANCE.createUITabPaneType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUITextFieldType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
						PageFactory.eINSTANCE.createUITextAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIPasswordFieldType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUILabelType()));
	
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
						PageFactory.eINSTANCE.createUIHiddenType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
						PageFactory.eINSTANCE.createUIImageType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUILinkType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUICheckBoxType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIRadioButtonType()));
		
		newChildDescriptors.add
		(createChildParameter
			(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
			 PageFactory.eINSTANCE.createUIFileType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIButtonType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIComboBoxType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIListType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUICheckBoxGroupType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIRadioButtonGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIDateType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
						PageFactory.eINSTANCE.createUIObjectListType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIFrameType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIReferenceEntityType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIWebMenuType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIWebTreeType()));
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_CONTAINER_TYPE__COMPONENT,
				 PageFactory.eINSTANCE.createUIEmptyType()));

	}
	
	public void collectNewPropertyDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewPropertyDescriptors(newChildDescriptors, object);
		
		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_COMPONENT_TYPE__UI_SKIN,
				 PageFactory.eINSTANCE.createUISkinType()));
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
			childFeature == PagePackage.Literals.UI_COMPONENT_TYPE__EDIT_PERMISSION ||
			childFeature == PagePackage.Literals.UI_CONTAINER_TYPE__VALIDATION_LIST;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
