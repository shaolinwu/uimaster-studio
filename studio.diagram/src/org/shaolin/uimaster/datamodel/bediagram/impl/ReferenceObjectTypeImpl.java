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
import org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl#getRefFieldName <em>Ref Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl#getTimeFieldName <em>Time Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl#isMustHave <em>Must Have</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceObjectTypeImpl extends EObjectImpl implements ReferenceObjectType {
	/**
	 * The cached value of the '{@link #getRefType() <em>Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefType()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType refType;

	/**
	 * The cached value of the '{@link #getRefFieldName() <em>Ref Field Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefFieldName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> refFieldName;

	/**
	 * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fieldName;

	/**
	 * The default value of the '{@link #getTimeFieldName() <em>Time Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeFieldName() <em>Time Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFieldName()
	 * @generated
	 * @ordered
	 */
	protected String timeFieldName = TIME_FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isMustHave() <em>Must Have</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustHave()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_HAVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustHave() <em>Must Have</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustHave()
	 * @generated
	 * @ordered
	 */
	protected boolean mustHave = MUST_HAVE_EDEFAULT;

	/**
	 * This is true if the Must Have attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mustHaveESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.REFERENCE_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getRefType() {
		return refType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefType(TargetEntityType newRefType, NotificationChain msgs) {
		TargetEntityType oldRefType = refType;
		refType = newRefType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_TYPE, oldRefType, newRefType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefType(TargetEntityType newRefType) {
		if (newRefType != refType) {
			NotificationChain msgs = null;
			if (refType != null)
				msgs = ((InternalEObject)refType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_TYPE, null, msgs);
			if (newRefType != null)
				msgs = ((InternalEObject)newRefType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_TYPE, null, msgs);
			msgs = basicSetRefType(newRefType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_TYPE, newRefType, newRefType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRefFieldName() {
		if (refFieldName == null) {
			refFieldName = new EDataTypeEList<String>(String.class, this, BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_FIELD_NAME);
		}
		return refFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFieldName() {
		if (fieldName == null) {
			fieldName = new EDataTypeEList<String>(String.class, this, BEDiagramPackage.REFERENCE_OBJECT_TYPE__FIELD_NAME);
		}
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeFieldName() {
		return timeFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFieldName(String newTimeFieldName) {
		String oldTimeFieldName = timeFieldName;
		timeFieldName = newTimeFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.REFERENCE_OBJECT_TYPE__TIME_FIELD_NAME, oldTimeFieldName, timeFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustHave() {
		return mustHave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustHave(boolean newMustHave) {
		boolean oldMustHave = mustHave;
		mustHave = newMustHave;
		boolean oldMustHaveESet = mustHaveESet;
		mustHaveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.REFERENCE_OBJECT_TYPE__MUST_HAVE, oldMustHave, mustHave, !oldMustHaveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMustHave() {
		boolean oldMustHave = mustHave;
		boolean oldMustHaveESet = mustHaveESet;
		mustHave = MUST_HAVE_EDEFAULT;
		mustHaveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.REFERENCE_OBJECT_TYPE__MUST_HAVE, oldMustHave, MUST_HAVE_EDEFAULT, oldMustHaveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMustHave() {
		return mustHaveESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.REFERENCE_OBJECT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_TYPE:
				return basicSetRefType(null, msgs);
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
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_TYPE:
				return getRefType();
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_FIELD_NAME:
				return getRefFieldName();
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__FIELD_NAME:
				return getFieldName();
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__TIME_FIELD_NAME:
				return getTimeFieldName();
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__MUST_HAVE:
				return isMustHave();
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__NAME:
				return getName();
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
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_TYPE:
				setRefType((TargetEntityType)newValue);
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_FIELD_NAME:
				getRefFieldName().clear();
				getRefFieldName().addAll((Collection<? extends String>)newValue);
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__FIELD_NAME:
				getFieldName().clear();
				getFieldName().addAll((Collection<? extends String>)newValue);
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__TIME_FIELD_NAME:
				setTimeFieldName((String)newValue);
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__MUST_HAVE:
				setMustHave((Boolean)newValue);
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__NAME:
				setName((String)newValue);
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
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_TYPE:
				setRefType((TargetEntityType)null);
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_FIELD_NAME:
				getRefFieldName().clear();
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__FIELD_NAME:
				getFieldName().clear();
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__TIME_FIELD_NAME:
				setTimeFieldName(TIME_FIELD_NAME_EDEFAULT);
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__MUST_HAVE:
				unsetMustHave();
				return;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_TYPE:
				return refType != null;
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__REF_FIELD_NAME:
				return refFieldName != null && !refFieldName.isEmpty();
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__FIELD_NAME:
				return fieldName != null && !fieldName.isEmpty();
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__TIME_FIELD_NAME:
				return TIME_FIELD_NAME_EDEFAULT == null ? timeFieldName != null : !TIME_FIELD_NAME_EDEFAULT.equals(timeFieldName);
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__MUST_HAVE:
				return isSetMustHave();
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (refFieldName: ");
		result.append(refFieldName);
		result.append(", fieldName: ");
		result.append(fieldName);
		result.append(", timeFieldName: ");
		result.append(timeFieldName);
		result.append(", mustHave: ");
		if (mustHaveESet) result.append(mustHave); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ReferenceObjectTypeImpl
