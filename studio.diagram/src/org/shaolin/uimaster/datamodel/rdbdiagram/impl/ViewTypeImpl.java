/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ViewType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ViewTypeImpl#getBaseTable <em>Base Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ViewTypeImpl#getExtTable <em>Ext Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ViewTypeImpl#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewTypeImpl extends RDBTypeImpl implements ViewType {
	/**
	 * The cached value of the '{@link #getBaseTable() <em>Base Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTable()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType baseTable;

	/**
	 * The cached value of the '{@link #getExtTable() <em>Ext Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtTable()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType extTable;

	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final ViewOpType OP_EDEFAULT = ViewOpType.JOIN;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected ViewOpType op = OP_EDEFAULT;

	/**
	 * This is true if the Op attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean opESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getBaseTable() {
		return baseTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseTable(TargetEntityType newBaseTable, NotificationChain msgs) {
		TargetEntityType oldBaseTable = baseTable;
		baseTable = newBaseTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.VIEW_TYPE__BASE_TABLE, oldBaseTable, newBaseTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTable(TargetEntityType newBaseTable) {
		if (newBaseTable != baseTable) {
			NotificationChain msgs = null;
			if (baseTable != null)
				msgs = ((InternalEObject)baseTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.VIEW_TYPE__BASE_TABLE, null, msgs);
			if (newBaseTable != null)
				msgs = ((InternalEObject)newBaseTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.VIEW_TYPE__BASE_TABLE, null, msgs);
			msgs = basicSetBaseTable(newBaseTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.VIEW_TYPE__BASE_TABLE, newBaseTable, newBaseTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getExtTable() {
		return extTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtTable(TargetEntityType newExtTable, NotificationChain msgs) {
		TargetEntityType oldExtTable = extTable;
		extTable = newExtTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.VIEW_TYPE__EXT_TABLE, oldExtTable, newExtTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtTable(TargetEntityType newExtTable) {
		if (newExtTable != extTable) {
			NotificationChain msgs = null;
			if (extTable != null)
				msgs = ((InternalEObject)extTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.VIEW_TYPE__EXT_TABLE, null, msgs);
			if (newExtTable != null)
				msgs = ((InternalEObject)newExtTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.VIEW_TYPE__EXT_TABLE, null, msgs);
			msgs = basicSetExtTable(newExtTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.VIEW_TYPE__EXT_TABLE, newExtTable, newExtTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewOpType getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(ViewOpType newOp) {
		ViewOpType oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		boolean oldOpESet = opESet;
		opESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.VIEW_TYPE__OP, oldOp, op, !oldOpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOp() {
		ViewOpType oldOp = op;
		boolean oldOpESet = opESet;
		op = OP_EDEFAULT;
		opESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.VIEW_TYPE__OP, oldOp, OP_EDEFAULT, oldOpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOp() {
		return opESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDBDiagramPackage.VIEW_TYPE__BASE_TABLE:
				return basicSetBaseTable(null, msgs);
			case RDBDiagramPackage.VIEW_TYPE__EXT_TABLE:
				return basicSetExtTable(null, msgs);
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
			case RDBDiagramPackage.VIEW_TYPE__BASE_TABLE:
				return getBaseTable();
			case RDBDiagramPackage.VIEW_TYPE__EXT_TABLE:
				return getExtTable();
			case RDBDiagramPackage.VIEW_TYPE__OP:
				return getOp();
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
			case RDBDiagramPackage.VIEW_TYPE__BASE_TABLE:
				setBaseTable((TargetEntityType)newValue);
				return;
			case RDBDiagramPackage.VIEW_TYPE__EXT_TABLE:
				setExtTable((TargetEntityType)newValue);
				return;
			case RDBDiagramPackage.VIEW_TYPE__OP:
				setOp((ViewOpType)newValue);
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
			case RDBDiagramPackage.VIEW_TYPE__BASE_TABLE:
				setBaseTable((TargetEntityType)null);
				return;
			case RDBDiagramPackage.VIEW_TYPE__EXT_TABLE:
				setExtTable((TargetEntityType)null);
				return;
			case RDBDiagramPackage.VIEW_TYPE__OP:
				unsetOp();
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
			case RDBDiagramPackage.VIEW_TYPE__BASE_TABLE:
				return baseTable != null;
			case RDBDiagramPackage.VIEW_TYPE__EXT_TABLE:
				return extTable != null;
			case RDBDiagramPackage.VIEW_TYPE__OP:
				return isSetOp();
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
		result.append(" (op: ");
		if (opESet) result.append(op); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ViewTypeImpl
