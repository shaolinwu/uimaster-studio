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

import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PagePackage;
import org.shaolin.uimaster.datamodel.page.UIListType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.UIListType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIListTypeItemProvider
	extends UIMultiChoiceTypeItemProvider
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
	public UIListTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PagePackage.Literals.UI_LIST_TYPE__ALLOW_BLANK);
			childrenFeatures.add(PagePackage.Literals.UI_LIST_TYPE__ALLOW_BLANK_TEXT);
			childrenFeatures.add(PagePackage.Literals.UI_LIST_TYPE__SIZE);
			childrenFeatures.add(PagePackage.Literals.UI_LIST_TYPE__MULTIPLE);
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
	 * This returns UIListType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UIListType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UIListType)object).getUIStyle();
		return label == null || label.length() == 0 ?
			getString("_UI_UIListType_type") :
			getString("_UI_UIListType_type") + " " + label;
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

		switch (notification.getFeatureID(UIListType.class)) {
			case PagePackage.UI_LIST_TYPE__ALLOW_BLANK:
			case PagePackage.UI_LIST_TYPE__ALLOW_BLANK_TEXT:
			case PagePackage.UI_LIST_TYPE__SIZE:
			case PagePackage.UI_LIST_TYPE__MULTIPLE:
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
	public void collectNewPropertyDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewPropertyDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_LIST_TYPE__ALLOW_BLANK,
				 PageFactory.eINSTANCE.createBooleanPropertyType()));
		
		newChildDescriptors.add
		(createChildParameter
				(PagePackage.Literals.UI_LIST_TYPE__ALLOW_BLANK_TEXT,
						PageFactory.eINSTANCE.createStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_LIST_TYPE__ALLOW_BLANK_TEXT,
				 PageFactory.eINSTANCE.createResourceBundlePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_LIST_TYPE__SIZE,
				 PageFactory.eINSTANCE.createNumericPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.UI_LIST_TYPE__MULTIPLE,
				 PageFactory.eINSTANCE.createBooleanPropertyType()));
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
			childFeature == PagePackage.Literals.UI_CHOICE_TYPE__OPTION_VALUE ||
			childFeature == PagePackage.Literals.UI_MULTI_CHOICE_TYPE__SELECTED_VALUES_CONSTRAINT ||
			childFeature == PagePackage.Literals.UI_MULTI_CHOICE_TYPE__SELECTED_VALUES_CONSTRAINT_TEXT ||
			childFeature == PagePackage.Literals.UI_LIST_TYPE__ALLOW_BLANK ||
			childFeature == PagePackage.Literals.UI_LIST_TYPE__ALLOW_BLANK_TEXT ||
			childFeature == PagePackage.Literals.UI_LIST_TYPE__SIZE ||
			childFeature == PagePackage.Literals.UI_LIST_TYPE__MULTIPLE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
