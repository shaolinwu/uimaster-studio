/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.RelationKeyType;

import org.shaolin.uimaster.datamodel.common.impl.MetaDataTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Key Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationKeyTypeImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationKeyTypeImpl#isIsEntity2 <em>Is Entity2</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationKeyTypeImpl#getRelationName <em>Relation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationKeyTypeImpl extends MetaDataTypeImpl implements RelationKeyType {
	/**
	 * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected String fieldName = FIELD_NAME_EDEFAULT;

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
	protected RelationKeyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.RELATION_KEY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(String newFieldName) {
		String oldFieldName = fieldName;
		fieldName = newFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.RELATION_KEY_TYPE__FIELD_NAME, oldFieldName, fieldName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.RELATION_KEY_TYPE__IS_ENTITY2, oldIsEntity2, isEntity2, !oldIsEntity2ESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.RELATION_KEY_TYPE__IS_ENTITY2, oldIsEntity2, IS_ENTITY2_EDEFAULT, oldIsEntity2ESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.RELATION_KEY_TYPE__RELATION_NAME, oldRelationName, relationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BEDiagramPackage.RELATION_KEY_TYPE__FIELD_NAME:
				return getFieldName();
			case BEDiagramPackage.RELATION_KEY_TYPE__IS_ENTITY2:
				return isIsEntity2();
			case BEDiagramPackage.RELATION_KEY_TYPE__RELATION_NAME:
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
			case BEDiagramPackage.RELATION_KEY_TYPE__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case BEDiagramPackage.RELATION_KEY_TYPE__IS_ENTITY2:
				setIsEntity2((Boolean)newValue);
				return;
			case BEDiagramPackage.RELATION_KEY_TYPE__RELATION_NAME:
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
			case BEDiagramPackage.RELATION_KEY_TYPE__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case BEDiagramPackage.RELATION_KEY_TYPE__IS_ENTITY2:
				unsetIsEntity2();
				return;
			case BEDiagramPackage.RELATION_KEY_TYPE__RELATION_NAME:
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
			case BEDiagramPackage.RELATION_KEY_TYPE__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
			case BEDiagramPackage.RELATION_KEY_TYPE__IS_ENTITY2:
				return isSetIsEntity2();
			case BEDiagramPackage.RELATION_KEY_TYPE__RELATION_NAME:
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
		result.append(" (fieldName: ");
		result.append(fieldName);
		result.append(", isEntity2: ");
		if (isEntity2ESet) result.append(isEntity2); else result.append("<unset>");
		result.append(", relationName: ");
		result.append(relationName);
		result.append(')');
		return result.toString();
	}

} //RelationKeyTypeImpl
