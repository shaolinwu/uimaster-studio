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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.common.provider.EntityTypeItemProvider;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessEntityTypeItemProvider
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
	public BusinessEntityTypeItemProvider(AdapterFactory adapterFactory) {
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

			addParentPropertyDescriptor(object);
			addAbbreviationPropertyDescriptor(object);
			addExtensiblePropertyDescriptor(object);
			addNeedEqualsPropertyDescriptor(object);
			addNeedHistoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 "Parent",
				 "BE Parent",
				 BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__PARENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}
	
	/**
	 * This adds a property descriptor for the Abbreviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbbreviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessEntityType_abbreviation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessEntityType_abbreviation_feature", "_UI_BusinessEntityType_type"),
				 BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__ABBREVIATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extensible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessEntityType_extensible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessEntityType_extensible_feature", "_UI_BusinessEntityType_type"),
				 BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__EXTENSIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Need Equals feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeedEqualsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessEntityType_needEquals_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessEntityType_needEquals_feature", "_UI_BusinessEntityType_type"),
				 BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__NEED_EQUALS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Need History feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeedHistoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessEntityType_needHistory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessEntityType_needHistory_feature", "_UI_BusinessEntityType_type"),
				 BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__NEED_HISTORY,
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
			childrenFeatures.add(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__PARENT_OBJECT);
			childrenFeatures.add(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__MEMBER);
			childrenFeatures.add(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG);
			childrenFeatures.add(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG);
			childrenFeatures.add(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__SEARCH_METHOD);
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
	 * This returns BusinessEntityType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessEntityType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BusinessEntityType)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusinessEntityType_type") :
			getString("_UI_BusinessEntityType_type") + " " + label;
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

		switch (notification.getFeatureID(BusinessEntityType.class)) {
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__ABBREVIATION:
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__EXTENSIBLE:
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_EQUALS:
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_HISTORY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT:
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__MEMBER:
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG:
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG:
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__SEARCH_METHOD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT:
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
				(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__PARENT_OBJECT,
				 BEDiagramFactory.eINSTANCE.createBEObjRefType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__PARENT_OBJECT,
				 BEDiagramFactory.eINSTANCE.createJavaObjRefType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__MEMBER,
				 BEDiagramFactory.eINSTANCE.createMemberType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG,
				 BEDiagramFactory.eINSTANCE.createPersistentConfigType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG,
				 BEDiagramFactory.eINSTANCE.createValidatorConfigType()));

		newChildDescriptors.add
			(createChildParameter
				(BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__SEARCH_METHOD,
				 BEDiagramFactory.eINSTANCE.createSearchMethodType()));
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
