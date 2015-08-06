/**
 */
package org.shaolin.uimaster.datamodel.bediagram.provider;


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

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEMapType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.bediagram.BEMapType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BEMapTypeItemProvider
	extends BECollectionTypeItemProvider
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
	public BEMapTypeItemProvider(AdapterFactory adapterFactory) {
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
			addBEKeyTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	protected void addBEKeyTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 "Map Key Type",
				 "The set type of the MemberType",
				 BEDiagramPackage.Literals.MEMBER_TYPE_MAP_KEY_TYPE,
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
			childrenFeatures.add(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE);
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
	 * This returns BEMapType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BEMapType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BEMapType_type");
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

		switch (notification.getFeatureID(BEMapType.class)) {
			case BEDiagramPackage.BE_MAP_TYPE__KEY_TYPE:
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
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createBEType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createBEComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createBEListType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createBEMapType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createBEObjRefType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createBEPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createBESetType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createBinaryType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createBooleanType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createCEObjRefType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createDateTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createDoubleType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createFileType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createIntType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createJavaObjRefType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createLongType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE,
				 BEDiagramFactory.eINSTANCE.createTimeType()));
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
			childFeature == BEDiagramPackage.Literals.BE_COLLECTION_TYPE__ELEMENT_TYPE ||
			childFeature == BEDiagramPackage.Literals.BE_MAP_TYPE__KEY_TYPE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
