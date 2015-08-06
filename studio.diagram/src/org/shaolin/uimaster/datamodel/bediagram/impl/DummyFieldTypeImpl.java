/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.DummyFieldType;
import org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dummy Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.DummyFieldTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.DummyFieldTypeImpl#getRefDummyFieldName <em>Ref Dummy Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.DummyFieldTypeImpl#getDummyFieldName <em>Dummy Field Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DummyFieldTypeImpl extends EObjectImpl implements DummyFieldType {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceObjectType reference;

	/**
	 * The cached value of the '{@link #getRefDummyFieldName() <em>Ref Dummy Field Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDummyFieldName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> refDummyFieldName;

	/**
	 * The cached value of the '{@link #getDummyFieldName() <em>Dummy Field Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummyFieldName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dummyFieldName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DummyFieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.DUMMY_FIELD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceObjectType getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceObjectType newReference, NotificationChain msgs) {
		ReferenceObjectType oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.DUMMY_FIELD_TYPE__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ReferenceObjectType newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.DUMMY_FIELD_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.DUMMY_FIELD_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.DUMMY_FIELD_TYPE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRefDummyFieldName() {
		if (refDummyFieldName == null) {
			refDummyFieldName = new EDataTypeEList<String>(String.class, this, BEDiagramPackage.DUMMY_FIELD_TYPE__REF_DUMMY_FIELD_NAME);
		}
		return refDummyFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDummyFieldName() {
		if (dummyFieldName == null) {
			dummyFieldName = new EDataTypeEList<String>(String.class, this, BEDiagramPackage.DUMMY_FIELD_TYPE__DUMMY_FIELD_NAME);
		}
		return dummyFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.DUMMY_FIELD_TYPE__REFERENCE:
				return basicSetReference(null, msgs);
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
			case BEDiagramPackage.DUMMY_FIELD_TYPE__REFERENCE:
				return getReference();
			case BEDiagramPackage.DUMMY_FIELD_TYPE__REF_DUMMY_FIELD_NAME:
				return getRefDummyFieldName();
			case BEDiagramPackage.DUMMY_FIELD_TYPE__DUMMY_FIELD_NAME:
				return getDummyFieldName();
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
			case BEDiagramPackage.DUMMY_FIELD_TYPE__REFERENCE:
				setReference((ReferenceObjectType)newValue);
				return;
			case BEDiagramPackage.DUMMY_FIELD_TYPE__REF_DUMMY_FIELD_NAME:
				getRefDummyFieldName().clear();
				getRefDummyFieldName().addAll((Collection<? extends String>)newValue);
				return;
			case BEDiagramPackage.DUMMY_FIELD_TYPE__DUMMY_FIELD_NAME:
				getDummyFieldName().clear();
				getDummyFieldName().addAll((Collection<? extends String>)newValue);
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
			case BEDiagramPackage.DUMMY_FIELD_TYPE__REFERENCE:
				setReference((ReferenceObjectType)null);
				return;
			case BEDiagramPackage.DUMMY_FIELD_TYPE__REF_DUMMY_FIELD_NAME:
				getRefDummyFieldName().clear();
				return;
			case BEDiagramPackage.DUMMY_FIELD_TYPE__DUMMY_FIELD_NAME:
				getDummyFieldName().clear();
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
			case BEDiagramPackage.DUMMY_FIELD_TYPE__REFERENCE:
				return reference != null;
			case BEDiagramPackage.DUMMY_FIELD_TYPE__REF_DUMMY_FIELD_NAME:
				return refDummyFieldName != null && !refDummyFieldName.isEmpty();
			case BEDiagramPackage.DUMMY_FIELD_TYPE__DUMMY_FIELD_NAME:
				return dummyFieldName != null && !dummyFieldName.isEmpty();
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
		result.append(" (refDummyFieldName: ");
		result.append(refDummyFieldName);
		result.append(", dummyFieldName: ");
		result.append(dummyFieldName);
		result.append(')');
		return result.toString();
	}

} //DummyFieldTypeImpl
