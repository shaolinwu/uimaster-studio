/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inherit Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.InheritAssociationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.InheritAssociationTypeImpl#getParentTable <em>Parent Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InheritAssociationTypeImpl extends EObjectImpl implements InheritAssociationType {
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
	 * The default value of the '{@link #getParentTable() <em>Parent Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTable()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentTable() <em>Parent Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTable()
	 * @generated
	 * @ordered
	 */
	protected String parentTable = PARENT_TABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.INHERIT_ASSOCIATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentTable() {
		return parentTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTable(String newParentTable) {
		String oldParentTable = parentTable;
		parentTable = newParentTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__PARENT_TABLE, oldParentTable, parentTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__NAME:
				return getName();
			case RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__PARENT_TABLE:
				return getParentTable();
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
			case RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__PARENT_TABLE:
				setParentTable((String)newValue);
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
			case RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__PARENT_TABLE:
				setParentTable(PARENT_TABLE_EDEFAULT);
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
			case RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE__PARENT_TABLE:
				return PARENT_TABLE_EDEFAULT == null ? parentTable != null : !PARENT_TABLE_EDEFAULT.equals(parentTable);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", parentTable: ");
		result.append(parentTable);
		result.append(')');
		return result.toString();
	}

} //InheritAssociationTypeImpl
