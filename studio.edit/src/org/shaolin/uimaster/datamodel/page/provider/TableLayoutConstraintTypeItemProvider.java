/**
 */
package org.shaolin.uimaster.datamodel.page.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.shaolin.uimaster.datamodel.page.AlignType;
import org.shaolin.uimaster.datamodel.page.PagePackage;
import org.shaolin.uimaster.datamodel.page.TableLayoutConstraintType;

/**
 * This is the item provider adapter for a {@link org.shaolin.uimaster.datamodel.page.TableLayoutConstraintType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableLayoutConstraintTypeItemProvider
	extends UILayoutConstraintTypeItemProvider
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
	public TableLayoutConstraintTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAlignPropertyDescriptor(object);
			addBgColorPropertyDescriptor(object);
			addCellUIClassPropertyDescriptor(object);
			addCellUIStylePropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addValignPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Align feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlignPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_align_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_align_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__ALIGN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bg Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBgColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_bgColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_bgColor_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__BG_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cell UI Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCellUIClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_cellUIClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_cellUIClass_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__CELL_UI_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cell UI Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCellUIStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_cellUIStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_cellUIStyle_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__CELL_UI_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_height_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valign feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValignPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_valign_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_valign_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__VALIGN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_visible_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_width_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_x_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableLayoutConstraintType_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableLayoutConstraintType_y_feature", "_UI_TableLayoutConstraintType_type"),
				 PagePackage.Literals.TABLE_LAYOUT_CONSTRAINT_TYPE__Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TableLayoutConstraintType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TableLayoutConstraintType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AlignType labelValue = ((TableLayoutConstraintType)object).getAlign();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TableLayoutConstraintType_type") :
			getString("_UI_TableLayoutConstraintType_type") + " " + label;
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

		switch (notification.getFeatureID(TableLayoutConstraintType.class)) {
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__ALIGN:
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__BG_COLOR:
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__CELL_UI_CLASS:
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__CELL_UI_STYLE:
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__HEIGHT:
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__VALIGN:
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__VISIBLE:
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__WIDTH:
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__X:
			case PagePackage.TABLE_LAYOUT_CONSTRAINT_TYPE__Y:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
