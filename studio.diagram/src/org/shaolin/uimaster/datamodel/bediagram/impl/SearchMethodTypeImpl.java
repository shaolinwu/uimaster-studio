/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.SearchMethodType;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.SearchMethodTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.SearchMethodTypeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.SearchMethodTypeImpl#getConditionMappingName <em>Condition Mapping Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SearchMethodTypeImpl extends EObjectImpl implements SearchMethodType {
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
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType query;

	/**
	 * The default value of the '{@link #getConditionMappingName() <em>Condition Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionMappingName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_MAPPING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionMappingName() <em>Condition Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionMappingName()
	 * @generated
	 * @ordered
	 */
	protected String conditionMappingName = CONDITION_MAPPING_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.SEARCH_METHOD_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.SEARCH_METHOD_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(TargetEntityType newQuery, NotificationChain msgs) {
		TargetEntityType oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.SEARCH_METHOD_TYPE__QUERY, oldQuery, newQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(TargetEntityType newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.SEARCH_METHOD_TYPE__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.SEARCH_METHOD_TYPE__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.SEARCH_METHOD_TYPE__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionMappingName() {
		return conditionMappingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionMappingName(String newConditionMappingName) {
		String oldConditionMappingName = conditionMappingName;
		conditionMappingName = newConditionMappingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.SEARCH_METHOD_TYPE__CONDITION_MAPPING_NAME, oldConditionMappingName, conditionMappingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.SEARCH_METHOD_TYPE__QUERY:
				return basicSetQuery(null, msgs);
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
			case BEDiagramPackage.SEARCH_METHOD_TYPE__NAME:
				return getName();
			case BEDiagramPackage.SEARCH_METHOD_TYPE__QUERY:
				return getQuery();
			case BEDiagramPackage.SEARCH_METHOD_TYPE__CONDITION_MAPPING_NAME:
				return getConditionMappingName();
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
			case BEDiagramPackage.SEARCH_METHOD_TYPE__NAME:
				setName((String)newValue);
				return;
			case BEDiagramPackage.SEARCH_METHOD_TYPE__QUERY:
				setQuery((TargetEntityType)newValue);
				return;
			case BEDiagramPackage.SEARCH_METHOD_TYPE__CONDITION_MAPPING_NAME:
				setConditionMappingName((String)newValue);
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
			case BEDiagramPackage.SEARCH_METHOD_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BEDiagramPackage.SEARCH_METHOD_TYPE__QUERY:
				setQuery((TargetEntityType)null);
				return;
			case BEDiagramPackage.SEARCH_METHOD_TYPE__CONDITION_MAPPING_NAME:
				setConditionMappingName(CONDITION_MAPPING_NAME_EDEFAULT);
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
			case BEDiagramPackage.SEARCH_METHOD_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BEDiagramPackage.SEARCH_METHOD_TYPE__QUERY:
				return query != null;
			case BEDiagramPackage.SEARCH_METHOD_TYPE__CONDITION_MAPPING_NAME:
				return CONDITION_MAPPING_NAME_EDEFAULT == null ? conditionMappingName != null : !CONDITION_MAPPING_NAME_EDEFAULT.equals(conditionMappingName);
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
		result.append(", conditionMappingName: ");
		result.append(conditionMappingName);
		result.append(')');
		return result.toString();
	}

} //SearchMethodTypeImpl
