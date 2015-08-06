/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.provider;


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

import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableTypeItemProvider
	extends RDBTypeItemProvider
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
	public TableTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RDBDiagramPackage.Literals.TABLE_TYPE__COLUMN);
			childrenFeatures.add(RDBDiagramPackage.Literals.TABLE_TYPE__INDEX);
			childrenFeatures.add(RDBDiagramPackage.Literals.TABLE_TYPE__SEQUENCE);
			childrenFeatures.add(RDBDiagramPackage.Literals.TABLE_TYPE__PRIMARY_KEY);
			childrenFeatures.add(RDBDiagramPackage.Literals.TABLE_TYPE__FOREIGN_KEY);
			childrenFeatures.add(RDBDiagramPackage.Literals.TABLE_TYPE__INHERIT_ASSCOCIATION);
			childrenFeatures.add(RDBDiagramPackage.Literals.TABLE_TYPE__MAPPING);
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
	 * This returns TableType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TableType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TableType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TableType_type") :
			getString("_UI_TableType_type") + " " + label;
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

		switch (notification.getFeatureID(TableType.class)) {
			case RDBDiagramPackage.TABLE_TYPE__COLUMN:
			case RDBDiagramPackage.TABLE_TYPE__INDEX:
			case RDBDiagramPackage.TABLE_TYPE__SEQUENCE:
			case RDBDiagramPackage.TABLE_TYPE__PRIMARY_KEY:
			case RDBDiagramPackage.TABLE_TYPE__FOREIGN_KEY:
			case RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION:
			case RDBDiagramPackage.TABLE_TYPE__MAPPING:
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
				(RDBDiagramPackage.Literals.TABLE_TYPE__COLUMN,
				 RDBDiagramFactory.eINSTANCE.createColumnType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.TABLE_TYPE__INDEX,
				 RDBDiagramFactory.eINSTANCE.createIndexType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.TABLE_TYPE__SEQUENCE,
				 RDBDiagramFactory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.TABLE_TYPE__PRIMARY_KEY,
				 RDBDiagramFactory.eINSTANCE.createPKType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.TABLE_TYPE__FOREIGN_KEY,
				 RDBDiagramFactory.eINSTANCE.createFKType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.TABLE_TYPE__INHERIT_ASSCOCIATION,
				 RDBDiagramFactory.eINSTANCE.createInheritAssociationType()));

		newChildDescriptors.add
			(createChildParameter
				(RDBDiagramPackage.Literals.TABLE_TYPE__MAPPING,
				 RDBDiagramFactory.eINSTANCE.createClassMappingType()));
	}

}
