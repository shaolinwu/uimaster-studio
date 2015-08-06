/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BE Obj Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEObjRefTypeImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEObjRefTypeImpl#isAutoVersionUpdate <em>Auto Version Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BEObjRefTypeImpl extends ObjectRefTypeImpl implements BEObjRefType {
	/**
	 * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType targetEntity;

	/**
	 * The default value of the '{@link #isAutoVersionUpdate() <em>Auto Version Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoVersionUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_VERSION_UPDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoVersionUpdate() <em>Auto Version Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoVersionUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean autoVersionUpdate = AUTO_VERSION_UPDATE_EDEFAULT;

	/**
	 * This is true if the Auto Version Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoVersionUpdateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BEObjRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.BE_OBJ_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getTargetEntity() {
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEntity(TargetEntityType newTargetEntity, NotificationChain msgs) {
		TargetEntityType oldTargetEntity = targetEntity;
		targetEntity = newTargetEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BE_OBJ_REF_TYPE__TARGET_ENTITY, oldTargetEntity, newTargetEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEntity(TargetEntityType newTargetEntity) {
		if (newTargetEntity != targetEntity) {
			NotificationChain msgs = null;
			if (targetEntity != null)
				msgs = ((InternalEObject)targetEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.BE_OBJ_REF_TYPE__TARGET_ENTITY, null, msgs);
			if (newTargetEntity != null)
				msgs = ((InternalEObject)newTargetEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.BE_OBJ_REF_TYPE__TARGET_ENTITY, null, msgs);
			msgs = basicSetTargetEntity(newTargetEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BE_OBJ_REF_TYPE__TARGET_ENTITY, newTargetEntity, newTargetEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoVersionUpdate() {
		return autoVersionUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoVersionUpdate(boolean newAutoVersionUpdate) {
		boolean oldAutoVersionUpdate = autoVersionUpdate;
		autoVersionUpdate = newAutoVersionUpdate;
		boolean oldAutoVersionUpdateESet = autoVersionUpdateESet;
		autoVersionUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BE_OBJ_REF_TYPE__AUTO_VERSION_UPDATE, oldAutoVersionUpdate, autoVersionUpdate, !oldAutoVersionUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoVersionUpdate() {
		boolean oldAutoVersionUpdate = autoVersionUpdate;
		boolean oldAutoVersionUpdateESet = autoVersionUpdateESet;
		autoVersionUpdate = AUTO_VERSION_UPDATE_EDEFAULT;
		autoVersionUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.BE_OBJ_REF_TYPE__AUTO_VERSION_UPDATE, oldAutoVersionUpdate, AUTO_VERSION_UPDATE_EDEFAULT, oldAutoVersionUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoVersionUpdate() {
		return autoVersionUpdateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.BE_OBJ_REF_TYPE__TARGET_ENTITY:
				return basicSetTargetEntity(null, msgs);
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
			case BEDiagramPackage.BE_OBJ_REF_TYPE__TARGET_ENTITY:
				return getTargetEntity();
			case BEDiagramPackage.BE_OBJ_REF_TYPE__AUTO_VERSION_UPDATE:
				return isAutoVersionUpdate();
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
			case BEDiagramPackage.BE_OBJ_REF_TYPE__TARGET_ENTITY:
				setTargetEntity((TargetEntityType)newValue);
				return;
			case BEDiagramPackage.BE_OBJ_REF_TYPE__AUTO_VERSION_UPDATE:
				setAutoVersionUpdate((Boolean)newValue);
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
			case BEDiagramPackage.BE_OBJ_REF_TYPE__TARGET_ENTITY:
				setTargetEntity((TargetEntityType)null);
				return;
			case BEDiagramPackage.BE_OBJ_REF_TYPE__AUTO_VERSION_UPDATE:
				unsetAutoVersionUpdate();
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
			case BEDiagramPackage.BE_OBJ_REF_TYPE__TARGET_ENTITY:
				return targetEntity != null;
			case BEDiagramPackage.BE_OBJ_REF_TYPE__AUTO_VERSION_UPDATE:
				return isSetAutoVersionUpdate();
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
		result.append(" (autoVersionUpdate: ");
		if (autoVersionUpdateESet) result.append(autoVersionUpdate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BEObjRefTypeImpl
