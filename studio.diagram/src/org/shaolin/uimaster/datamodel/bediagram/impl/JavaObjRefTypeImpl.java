/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType;

import org.shaolin.uimaster.datamodel.common.TargetJavaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Obj Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.JavaObjRefTypeImpl#getTargetJava <em>Target Java</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaObjRefTypeImpl extends ObjectRefTypeImpl implements JavaObjRefType {
	/**
	 * The cached value of the '{@link #getTargetJava() <em>Target Java</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetJava()
	 * @generated
	 * @ordered
	 */
	protected TargetJavaType targetJava;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaObjRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.JAVA_OBJ_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetJavaType getTargetJava() {
		return targetJava;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetJava(TargetJavaType newTargetJava, NotificationChain msgs) {
		TargetJavaType oldTargetJava = targetJava;
		targetJava = newTargetJava;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.JAVA_OBJ_REF_TYPE__TARGET_JAVA, oldTargetJava, newTargetJava);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetJava(TargetJavaType newTargetJava) {
		if (newTargetJava != targetJava) {
			NotificationChain msgs = null;
			if (targetJava != null)
				msgs = ((InternalEObject)targetJava).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.JAVA_OBJ_REF_TYPE__TARGET_JAVA, null, msgs);
			if (newTargetJava != null)
				msgs = ((InternalEObject)newTargetJava).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.JAVA_OBJ_REF_TYPE__TARGET_JAVA, null, msgs);
			msgs = basicSetTargetJava(newTargetJava, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.JAVA_OBJ_REF_TYPE__TARGET_JAVA, newTargetJava, newTargetJava));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.JAVA_OBJ_REF_TYPE__TARGET_JAVA:
				return basicSetTargetJava(null, msgs);
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
			case BEDiagramPackage.JAVA_OBJ_REF_TYPE__TARGET_JAVA:
				return getTargetJava();
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
			case BEDiagramPackage.JAVA_OBJ_REF_TYPE__TARGET_JAVA:
				setTargetJava((TargetJavaType)newValue);
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
			case BEDiagramPackage.JAVA_OBJ_REF_TYPE__TARGET_JAVA:
				setTargetJava((TargetJavaType)null);
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
			case BEDiagramPackage.JAVA_OBJ_REF_TYPE__TARGET_JAVA:
				return targetJava != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaObjRefTypeImpl
