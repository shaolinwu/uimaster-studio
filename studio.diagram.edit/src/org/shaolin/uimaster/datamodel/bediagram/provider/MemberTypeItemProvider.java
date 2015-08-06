/**
 */
package org.shaolin.uimaster.datamodel.bediagram.provider;


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
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEListType;
import org.shaolin.uimaster.datamodel.bediagram.BEMapType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BESetType;
import org.shaolin.uimaster.datamodel.bediagram.CEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.common.CommonFactory;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.bediagram.MemberType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MemberTypeItemProvider
	extends ItemProviderAdapter
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
	public MemberTypeItemProvider(AdapterFactory adapterFactory) {
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
		if (itemPropertyDescriptors != null) {
			itemPropertyDescriptors.clear();
		}
		
		super.getPropertyDescriptors(object);

		addNamePropertyDescriptor(object);
		addDescriptionPropertyDescriptor(object);
		addDefaultValuePropertyDescriptor(object);
		addAccessiblePropertyDescriptor(object);
		addModifiablePropertyDescriptor(object);
		addTransientPropertyDescriptor(object);
		
		MemberType type = (MemberType)object;
		if (type.getType() instanceof BEListType){
			BEListTypeItemProvider p = new BEListTypeItemProvider(this.getAdapterFactory());
			itemPropertyDescriptors.addAll(p.getPropertyDescriptors(object));
		} else if (type.getType() instanceof BEMapType){
			BEMapTypeItemProvider p = new BEMapTypeItemProvider(this.getAdapterFactory());
			itemPropertyDescriptors.addAll(p.getPropertyDescriptors(object));
		} else if (type.getType() instanceof BESetType){
			BESetTypeItemProvider p = new BESetTypeItemProvider(this.getAdapterFactory());
			itemPropertyDescriptors.addAll(p.getPropertyDescriptors(object));
		} else if (type.getType() instanceof CEObjRefType){
			CEObjRefTypeItemProvider p = new CEObjRefTypeItemProvider(this.getAdapterFactory());
			itemPropertyDescriptors.addAll(p.getPropertyDescriptors(object));
		} else if (type.getType() instanceof BEObjRefType){
			BEObjRefTypeItemProvider p = new BEObjRefTypeItemProvider(this.getAdapterFactory());
			itemPropertyDescriptors.addAll(p.getPropertyDescriptors(object));
		} else if (type.getType() instanceof JavaObjRefType){
			JavaObjRefTypeItemProvider p = new JavaObjRefTypeItemProvider(this.getAdapterFactory());
			itemPropertyDescriptors.addAll(p.getPropertyDescriptors(object));
		}
		
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberType_name_feature", "_UI_MemberType_type"),
				 BEDiagramPackage.Literals.MEMBER_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberType_description_feature", "_UI_MemberType_type"),
				 BEDiagramPackage.Literals.MEMBER_TYPE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberType_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberType_defaultValue_feature", "_UI_MemberType_type"),
				 BEDiagramPackage.Literals.MEMBER_TYPE__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Accessible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberType_accessible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberType_accessible_feature", "_UI_MemberType_type"),
				 BEDiagramPackage.Literals.MEMBER_TYPE__ACCESSIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modifiable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberType_modifiable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberType_modifiable_feature", "_UI_MemberType_type"),
				 BEDiagramPackage.Literals.MEMBER_TYPE__MODIFIABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemberType_transient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemberType_transient_feature", "_UI_MemberType_type"),
				 BEDiagramPackage.Literals.MEMBER_TYPE__TRANSIENT,
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
			childrenFeatures.add(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE);
			childrenFeatures.add(BEDiagramPackage.Literals.MEMBER_TYPE__META_INFO);
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
	 * This returns MemberType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MemberType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MemberType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MemberType_type") :
			getString("_UI_MemberType_type") + " " + label;
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

		switch (notification.getFeatureID(MemberType.class)) {
			case BEDiagramPackage.MEMBER_TYPE__NAME:
			case BEDiagramPackage.MEMBER_TYPE__DESCRIPTION:
			case BEDiagramPackage.MEMBER_TYPE__DEFAULT_VALUE:
			case BEDiagramPackage.MEMBER_TYPE__ACCESSIBLE:
			case BEDiagramPackage.MEMBER_TYPE__MODIFIABLE:
			case BEDiagramPackage.MEMBER_TYPE__TRANSIENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BEDiagramPackage.MEMBER_TYPE__TYPE:
			case BEDiagramPackage.MEMBER_TYPE__META_INFO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			case BEDiagramPackage.MEMBER_TYPE_REF_ENTITY_NAME:
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
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createBEType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createBEComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createBEListType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createBEMapType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createBEObjRefType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createBEPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createBESetType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createBinaryType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createBooleanType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createCEObjRefType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createDateTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createDoubleType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createFileType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createIntType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createJavaObjRefType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createLongType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__TYPE,
				 BEDiagramFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.MEMBER_TYPE__META_INFO,
				 CommonFactory.eINSTANCE.createMetaDataInfoType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BediagramEditPlugin.INSTANCE;
	}

}
