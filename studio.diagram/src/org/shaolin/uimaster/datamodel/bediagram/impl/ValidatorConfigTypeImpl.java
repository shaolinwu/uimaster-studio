/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.DummyFieldType;
import org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType;
import org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType;
import org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ValidatorConfigTypeImpl#getDummyField <em>Dummy Field</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ValidatorConfigTypeImpl#getReferenceConfig <em>Reference Config</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ValidatorConfigTypeImpl#getExternalReferenceConfig <em>External Reference Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidatorConfigTypeImpl extends EObjectImpl implements ValidatorConfigType {
	/**
	 * The cached value of the '{@link #getDummyField() <em>Dummy Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummyField()
	 * @generated
	 * @ordered
	 */
	protected EList<DummyFieldType> dummyField;

	/**
	 * The cached value of the '{@link #getReferenceConfig() <em>Reference Config</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceObjectType> referenceConfig;

	/**
	 * The cached value of the '{@link #getExternalReferenceConfig() <em>External Reference Config</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferenceConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReferenceType> externalReferenceConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidatorConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.VALIDATOR_CONFIG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DummyFieldType> getDummyField() {
		if (dummyField == null) {
			dummyField = new EObjectContainmentEList<DummyFieldType>(DummyFieldType.class, this, BEDiagramPackage.VALIDATOR_CONFIG_TYPE__DUMMY_FIELD);
		}
		return dummyField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceObjectType> getReferenceConfig() {
		if (referenceConfig == null) {
			referenceConfig = new EObjectContainmentEList<ReferenceObjectType>(ReferenceObjectType.class, this, BEDiagramPackage.VALIDATOR_CONFIG_TYPE__REFERENCE_CONFIG);
		}
		return referenceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalReferenceType> getExternalReferenceConfig() {
		if (externalReferenceConfig == null) {
			externalReferenceConfig = new EObjectContainmentEList<ExternalReferenceType>(ExternalReferenceType.class, this, BEDiagramPackage.VALIDATOR_CONFIG_TYPE__EXTERNAL_REFERENCE_CONFIG);
		}
		return externalReferenceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__DUMMY_FIELD:
				return ((InternalEList<?>)getDummyField()).basicRemove(otherEnd, msgs);
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__REFERENCE_CONFIG:
				return ((InternalEList<?>)getReferenceConfig()).basicRemove(otherEnd, msgs);
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__EXTERNAL_REFERENCE_CONFIG:
				return ((InternalEList<?>)getExternalReferenceConfig()).basicRemove(otherEnd, msgs);
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
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__DUMMY_FIELD:
				return getDummyField();
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__REFERENCE_CONFIG:
				return getReferenceConfig();
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__EXTERNAL_REFERENCE_CONFIG:
				return getExternalReferenceConfig();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__DUMMY_FIELD:
				getDummyField().clear();
				getDummyField().addAll((Collection<? extends DummyFieldType>)newValue);
				return;
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__REFERENCE_CONFIG:
				getReferenceConfig().clear();
				getReferenceConfig().addAll((Collection<? extends ReferenceObjectType>)newValue);
				return;
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__EXTERNAL_REFERENCE_CONFIG:
				getExternalReferenceConfig().clear();
				getExternalReferenceConfig().addAll((Collection<? extends ExternalReferenceType>)newValue);
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
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__DUMMY_FIELD:
				getDummyField().clear();
				return;
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__REFERENCE_CONFIG:
				getReferenceConfig().clear();
				return;
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__EXTERNAL_REFERENCE_CONFIG:
				getExternalReferenceConfig().clear();
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
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__DUMMY_FIELD:
				return dummyField != null && !dummyField.isEmpty();
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__REFERENCE_CONFIG:
				return referenceConfig != null && !referenceConfig.isEmpty();
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE__EXTERNAL_REFERENCE_CONFIG:
				return externalReferenceConfig != null && !externalReferenceConfig.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValidatorConfigTypeImpl
