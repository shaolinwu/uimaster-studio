/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

import org.shaolin.uimaster.datamodel.rdbdiagram.FKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FK Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FKTypeImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FKTypeImpl#getRefTable <em>Ref Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FKTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FKTypeImpl#getOnDelete <em>On Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FKTypeImpl extends EObjectImpl implements FKType {
	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefTable() <em>Ref Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTable()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType refTable;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected static final OnDeleteType ON_DELETE_EDEFAULT = OnDeleteType.CASCADE;

	/**
	 * The cached value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected OnDeleteType onDelete = ON_DELETE_EDEFAULT;

	/**
	 * This is true if the On Delete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onDeleteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FKTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.FK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FK_TYPE__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getRefTable() {
		return refTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTable(TargetEntityType newRefTable, NotificationChain msgs) {
		TargetEntityType oldRefTable = refTable;
		refTable = newRefTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FK_TYPE__REF_TABLE, oldRefTable, newRefTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefTable(TargetEntityType newRefTable) {
		if (newRefTable != refTable) {
			NotificationChain msgs = null;
			if (refTable != null)
				msgs = ((InternalEObject)refTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.FK_TYPE__REF_TABLE, null, msgs);
			if (newRefTable != null)
				msgs = ((InternalEObject)newRefTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.FK_TYPE__REF_TABLE, null, msgs);
			msgs = basicSetRefTable(newRefTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FK_TYPE__REF_TABLE, newRefTable, newRefTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDeleteType getOnDelete() {
		return onDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDelete(OnDeleteType newOnDelete) {
		OnDeleteType oldOnDelete = onDelete;
		onDelete = newOnDelete == null ? ON_DELETE_EDEFAULT : newOnDelete;
		boolean oldOnDeleteESet = onDeleteESet;
		onDeleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FK_TYPE__ON_DELETE, oldOnDelete, onDelete, !oldOnDeleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnDelete() {
		OnDeleteType oldOnDelete = onDelete;
		boolean oldOnDeleteESet = onDeleteESet;
		onDelete = ON_DELETE_EDEFAULT;
		onDeleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.FK_TYPE__ON_DELETE, oldOnDelete, ON_DELETE_EDEFAULT, oldOnDeleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnDelete() {
		return onDeleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDBDiagramPackage.FK_TYPE__REF_TABLE:
				return basicSetRefTable(null, msgs);
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
			case RDBDiagramPackage.FK_TYPE__COLUMN_NAME:
				return getColumnName();
			case RDBDiagramPackage.FK_TYPE__REF_TABLE:
				return getRefTable();
			case RDBDiagramPackage.FK_TYPE__NAME:
				return getName();
			case RDBDiagramPackage.FK_TYPE__ON_DELETE:
				return getOnDelete();
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
			case RDBDiagramPackage.FK_TYPE__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case RDBDiagramPackage.FK_TYPE__REF_TABLE:
				setRefTable((TargetEntityType)newValue);
				return;
			case RDBDiagramPackage.FK_TYPE__NAME:
				setName((String)newValue);
				return;
			case RDBDiagramPackage.FK_TYPE__ON_DELETE:
				setOnDelete((OnDeleteType)newValue);
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
			case RDBDiagramPackage.FK_TYPE__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case RDBDiagramPackage.FK_TYPE__REF_TABLE:
				setRefTable((TargetEntityType)null);
				return;
			case RDBDiagramPackage.FK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RDBDiagramPackage.FK_TYPE__ON_DELETE:
				unsetOnDelete();
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
			case RDBDiagramPackage.FK_TYPE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case RDBDiagramPackage.FK_TYPE__REF_TABLE:
				return refTable != null;
			case RDBDiagramPackage.FK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RDBDiagramPackage.FK_TYPE__ON_DELETE:
				return isSetOnDelete();
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
		result.append(" (columnName: ");
		result.append(columnName);
		result.append(", name: ");
		result.append(name);
		result.append(", onDelete: ");
		if (onDeleteESet) result.append(onDelete); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FKTypeImpl
