/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType;

import org.shaolin.uimaster.datamodel.common.ExpressionType;

import org.shaolin.uimaster.datamodel.common.impl.MetaDataTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationConstraintTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationConstraintTypeImpl#isIsEntity2 <em>Is Entity2</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationConstraintTypeImpl#getRelationName <em>Relation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationConstraintTypeImpl extends MetaDataTypeImpl implements RelationConstraintType {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ExpressionType value;

	/**
	 * The default value of the '{@link #isIsEntity2() <em>Is Entity2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntity2()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENTITY2_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEntity2() <em>Is Entity2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntity2()
	 * @generated
	 * @ordered
	 */
	protected boolean isEntity2 = IS_ENTITY2_EDEFAULT;

	/**
	 * This is true if the Is Entity2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isEntity2ESet;

	/**
	 * The default value of the '{@link #getRelationName() <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationName()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationName() <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationName()
	 * @generated
	 * @ordered
	 */
	protected String relationName = RELATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.RELATION_CONSTRAINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ExpressionType newValue, NotificationChain msgs) {
		ExpressionType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.RELATION_CONSTRAINT_TYPE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ExpressionType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.RELATION_CONSTRAINT_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.RELATION_CONSTRAINT_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.RELATION_CONSTRAINT_TYPE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEntity2() {
		return isEntity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEntity2(boolean newIsEntity2) {
		boolean oldIsEntity2 = isEntity2;
		isEntity2 = newIsEntity2;
		boolean oldIsEntity2ESet = isEntity2ESet;
		isEntity2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.RELATION_CONSTRAINT_TYPE__IS_ENTITY2, oldIsEntity2, isEntity2, !oldIsEntity2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsEntity2() {
		boolean oldIsEntity2 = isEntity2;
		boolean oldIsEntity2ESet = isEntity2ESet;
		isEntity2 = IS_ENTITY2_EDEFAULT;
		isEntity2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.RELATION_CONSTRAINT_TYPE__IS_ENTITY2, oldIsEntity2, IS_ENTITY2_EDEFAULT, oldIsEntity2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsEntity2() {
		return isEntity2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationName() {
		return relationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationName(String newRelationName) {
		String oldRelationName = relationName;
		relationName = newRelationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.RELATION_CONSTRAINT_TYPE__RELATION_NAME, oldRelationName, relationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__VALUE:
				return basicSetValue(null, msgs);
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
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__VALUE:
				return getValue();
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__IS_ENTITY2:
				return isIsEntity2();
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__RELATION_NAME:
				return getRelationName();
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
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__VALUE:
				setValue((ExpressionType)newValue);
				return;
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__IS_ENTITY2:
				setIsEntity2((Boolean)newValue);
				return;
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__RELATION_NAME:
				setRelationName((String)newValue);
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
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__VALUE:
				setValue((ExpressionType)null);
				return;
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__IS_ENTITY2:
				unsetIsEntity2();
				return;
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__RELATION_NAME:
				setRelationName(RELATION_NAME_EDEFAULT);
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
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__VALUE:
				return value != null;
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__IS_ENTITY2:
				return isSetIsEntity2();
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE__RELATION_NAME:
				return RELATION_NAME_EDEFAULT == null ? relationName != null : !RELATION_NAME_EDEFAULT.equals(relationName);
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
		result.append(" (isEntity2: ");
		if (isEntity2ESet) result.append(isEntity2); else result.append("<unset>");
		result.append(", relationName: ");
		result.append(relationName);
		result.append(')');
		return result.toString();
	}

} //RelationConstraintTypeImpl
