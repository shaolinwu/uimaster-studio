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
import org.shaolin.uimaster.datamodel.page.UILinkType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.UILinkType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UILinkTypeItemProvider
	extends UILabelTypeItemProvider
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
	public UILinkTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PagePackage.Literals.UI_LINK_TYPE__HREF);
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
	 * This returns UILinkType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UILinkType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UILinkType)object).getUIStyle();
		return label == null || label.length() == 0 ?
			getString("_UI_UILinkType_type") :
			getString("_UI_UILinkType_type") + " " + label;
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

		switch (notification.getFeatureID(UILinkType.class)) {
			case PagePackage.UI_LINK_TYPE__HREF:
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
				(PagePackage.Literals.UI_LINK_TYPE__HREF,
				 PageFactory.eINSTANCE.createFunctionCallType()));
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
			childFeature == PagePackage.Literals.UI_TEXT_COMPONENT_TYPE__TEXT ||
			childFeature == PagePackage.Literals.UI_TEXT_COMPONENT_TYPE__ALLOW_BLANK ||
			childFeature == PagePackage.Literals.UI_TEXT_COMPONENT_TYPE__ALLOW_BLANK_TEXT ||
			childFeature == PagePackage.Literals.UI_TEXT_COMPONENT_TYPE__REGEX ||
			childFeature == PagePackage.Literals.UI_TEXT_COMPONENT_TYPE__REGEX_TEXT ||
			childFeature == PagePackage.Literals.UI_TEXT_COMPONENT_TYPE__MIN_LENGTH ||
			childFeature == PagePackage.Literals.UI_TEXT_COMPONENT_TYPE__LENGTH_TEXT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
