/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.provider;


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
import org.shaolin.uimaster.datamodel.common.CommonPackage;

import org.shaolin.uimaster.datamodel.common.provider.EntityTypeItemProvider;

import org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassMappingTypeItemProvider
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
	public ClassMappingTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__BUSINESS_ENTITY);
			childrenFeatures.add(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__TABLE);
			childrenFeatures.add(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__HISTORY_TABLE);
			childrenFeatures.add(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__VIEW);
			childrenFeatures.add(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING);
			childrenFeatures.add(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__FIELD_MAPPING);
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
	 * This returns ClassMappingType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassMappingType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ClassMappingType)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_ClassMappingType_type") :
			getString("_UI_ClassMappingType_type") + " " + label;
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

		switch (notification.getFeatureID(ClassMappingType.class)) {
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY:
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE:
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE:
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW:
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING:
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__FIELD_MAPPING:
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
				(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__BUSINESS_ENTITY,
				 CommonFactory.eINSTANCE.createTargetEntityType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__TABLE,
				 CommonFactory.eINSTANCE.createTargetEntityType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__HISTORY_TABLE,
				 CommonFactory.eINSTANCE.createTargetEntityType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__VIEW,
				 CommonFactory.eINSTANCE.createTargetEntityType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING,
				 CommonFactory.eINSTANCE.createTargetEntityType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__FIELD_MAPPING,
				 RDBDiagramFactory.eINSTANCE.createFieldMappingType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__FIELD_MAPPING,
				 RDBDiagramFactory.eINSTANCE.createListFieldMappingType()));
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
			childFeature == CommonPackage.Literals.ENTITY_TYPE__CATEGORY ||
			childFeature == RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__BUSINESS_ENTITY ||
			childFeature == RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__TABLE ||
			childFeature == RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__HISTORY_TABLE ||
			childFeature == RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__VIEW ||
			childFeature == RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING;

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
		return RdbdiagramEditPlugin.INSTANCE;
	}

}
