/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.provider;


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

import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RDBDiagramTypeItemProvider
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
	public RDBDiagramTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDaoPackagePropertyDescriptor(object);
			addDiagramPackagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dao Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDaoPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDBDiagramType_daoPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDBDiagramType_daoPackage_feature", "_UI_RDBDiagramType_type"),
				 RDBDiagramPackage.Literals.RDB_DIAGRAM_TYPE__DAO_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDBDiagramType_diagramPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDBDiagramType_diagramPackage_feature", "_UI_RDBDiagramType_type"),
				 RDBDiagramPackage.Literals.RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE,
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
			childrenFeatures.add(RDBDiagramPackage.Literals.RDB_DIAGRAM_TYPE__TABLE);
			childrenFeatures.add(RDBDiagramPackage.Literals.RDB_DIAGRAM_TYPE__VIEW);
			childrenFeatures.add(RDBDiagramPackage.Literals.RDB_DIAGRAM_TYPE__JOIN_TABLE);
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
	 * This returns RDBDiagramType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RDBDiagramType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RDBDiagramType)object).getDaoPackage();
		return label == null || label.length() == 0 ?
			getString("_UI_RDBDiagramType_type") :
			getString("_UI_RDBDiagramType_type") + " " + label;
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

		switch (notification.getFeatureID(RDBDiagramType.class)) {
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DAO_PACKAGE:
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__TABLE:
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__VIEW:
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__JOIN_TABLE:
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
				(RDBDiagramPackage.Literals.RDB_DIAGRAM_TYPE__TABLE,
				 RDBDiagramFactory.eINSTANCE.createTableType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.RDB_DIAGRAM_TYPE__VIEW,
				 RDBDiagramFactory.eINSTANCE.createViewType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.RDB_DIAGRAM_TYPE__JOIN_TABLE,
				 RDBDiagramFactory.eINSTANCE.createJoinTableType()));
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
