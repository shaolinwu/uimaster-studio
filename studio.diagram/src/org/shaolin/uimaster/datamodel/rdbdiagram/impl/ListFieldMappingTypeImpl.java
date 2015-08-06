/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

import org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Field Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ListFieldMappingTypeImpl#getCollectionTable <em>Collection Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ListFieldMappingTypeImpl#isIsPrivateOwned <em>Is Private Owned</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ListFieldMappingTypeImpl#getMappingType <em>Mapping Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListFieldMappingTypeImpl extends FieldMappingTypeImpl implements ListFieldMappingType {
	/**
	 * The cached value of the '{@link #getCollectionTable() <em>Collection Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionTable()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType collectionTable;

	/**
	 * The default value of the '{@link #isIsPrivateOwned() <em>Is Private Owned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrivateOwned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIVATE_OWNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrivateOwned() <em>Is Private Owned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrivateOwned()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrivateOwned = IS_PRIVATE_OWNED_EDEFAULT;

	/**
	 * This is true if the Is Private Owned attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPrivateOwnedESet;

	/**
	 * The default value of the '{@link #getMappingType() <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingType()
	 * @generated
	 * @ordered
	 */
	protected static final MappingTypeType MAPPING_TYPE_EDEFAULT = MappingTypeType.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getMappingType() <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingType()
	 * @generated
	 * @ordered
	 */
	protected MappingTypeType mappingType = MAPPING_TYPE_EDEFAULT;

	/**
	 * This is true if the Mapping Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mappingTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListFieldMappingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.LIST_FIELD_MAPPING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getCollectionTable() {
		return collectionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectionTable(TargetEntityType newCollectionTable, NotificationChain msgs) {
		TargetEntityType oldCollectionTable = collectionTable;
		collectionTable = newCollectionTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE, oldCollectionTable, newCollectionTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionTable(TargetEntityType newCollectionTable) {
		if (newCollectionTable != collectionTable) {
			NotificationChain msgs = null;
			if (collectionTable != null)
				msgs = ((InternalEObject)collectionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE, null, msgs);
			if (newCollectionTable != null)
				msgs = ((InternalEObject)newCollectionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE, null, msgs);
			msgs = basicSetCollectionTable(newCollectionTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE, newCollectionTable, newCollectionTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrivateOwned() {
		return isPrivateOwned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrivateOwned(boolean newIsPrivateOwned) {
		boolean oldIsPrivateOwned = isPrivateOwned;
		isPrivateOwned = newIsPrivateOwned;
		boolean oldIsPrivateOwnedESet = isPrivateOwnedESet;
		isPrivateOwnedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__IS_PRIVATE_OWNED, oldIsPrivateOwned, isPrivateOwned, !oldIsPrivateOwnedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsPrivateOwned() {
		boolean oldIsPrivateOwned = isPrivateOwned;
		boolean oldIsPrivateOwnedESet = isPrivateOwnedESet;
		isPrivateOwned = IS_PRIVATE_OWNED_EDEFAULT;
		isPrivateOwnedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__IS_PRIVATE_OWNED, oldIsPrivateOwned, IS_PRIVATE_OWNED_EDEFAULT, oldIsPrivateOwnedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsPrivateOwned() {
		return isPrivateOwnedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTypeType getMappingType() {
		return mappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingType(MappingTypeType newMappingType) {
		MappingTypeType oldMappingType = mappingType;
		mappingType = newMappingType == null ? MAPPING_TYPE_EDEFAULT : newMappingType;
		boolean oldMappingTypeESet = mappingTypeESet;
		mappingTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__MAPPING_TYPE, oldMappingType, mappingType, !oldMappingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMappingType() {
		MappingTypeType oldMappingType = mappingType;
		boolean oldMappingTypeESet = mappingTypeESet;
		mappingType = MAPPING_TYPE_EDEFAULT;
		mappingTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__MAPPING_TYPE, oldMappingType, MAPPING_TYPE_EDEFAULT, oldMappingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMappingType() {
		return mappingTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE:
				return basicSetCollectionTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE:
				return getCollectionTable();
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__IS_PRIVATE_OWNED:
				return isIsPrivateOwned();
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__MAPPING_TYPE:
				return getMappingType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE:
				setCollectionTable((TargetEntityType)newValue);
				return;
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__IS_PRIVATE_OWNED:
				setIsPrivateOwned((Boolean)newValue);
				return;
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__MAPPING_TYPE:
				setMappingType((MappingTypeType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE:
				setCollectionTable((TargetEntityType)null);
				return;
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__IS_PRIVATE_OWNED:
				unsetIsPrivateOwned();
				return;
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__MAPPING_TYPE:
				unsetMappingType();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE:
				return collectionTable != null;
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__IS_PRIVATE_OWNED:
				return isSetIsPrivateOwned();
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE__MAPPING_TYPE:
				return isSetMappingType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isPrivateOwned: ");
		if (isPrivateOwnedESet) result.append(isPrivateOwned); else result.append("<unset>");
		result.append(", mappingType: ");
		if (mappingTypeESet) result.append(mappingType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ListFieldMappingTypeImpl
