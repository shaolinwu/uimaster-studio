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

import org.shaolin.uimaster.datamodel.common.CommonFactory;

import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PagePackage;
import org.shaolin.uimaster.datamodel.page.SimpleComponentMappingType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.SimpleComponentMappingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleComponentMappingTypeItemProvider
	extends ComponentMappingTypeItemProvider
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
	public SimpleComponentMappingTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__MAPPING_RULE);
			childrenFeatures.add(PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__UI_COMPONENT);
			childrenFeatures.add(PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__DATA_COMPONENT);
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
	 * This returns SimpleComponentMappingType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleComponentMappingType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SimpleComponentMappingType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SimpleComponentMappingType_type") :
			getString("_UI_SimpleComponentMappingType_type") + " " + label;
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

		switch (notification.getFeatureID(SimpleComponentMappingType.class)) {
			case PagePackage.SIMPLE_COMPONENT_MAPPING_TYPE__MAPPING_RULE:
			case PagePackage.SIMPLE_COMPONENT_MAPPING_TYPE__UI_COMPONENT:
			case PagePackage.SIMPLE_COMPONENT_MAPPING_TYPE__DATA_COMPONENT:
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
				(PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__MAPPING_RULE,
				 CommonFactory.eINSTANCE.createTargetEntityType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__UI_COMPONENT,
				 PageFactory.eINSTANCE.createUIComponentParamType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__DATA_COMPONENT,
				 PageFactory.eINSTANCE.createComponentParamType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__DATA_COMPONENT,
				 PageFactory.eINSTANCE.createExpressionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__DATA_COMPONENT,
				 PageFactory.eINSTANCE.createUIComponentParamType()));
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
			childFeature == PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__UI_COMPONENT ||
			childFeature == PagePackage.Literals.SIMPLE_COMPONENT_MAPPING_TYPE__DATA_COMPONENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
