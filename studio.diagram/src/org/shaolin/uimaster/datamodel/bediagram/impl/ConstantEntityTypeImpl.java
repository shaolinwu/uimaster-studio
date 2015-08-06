/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantValueType;

import org.shaolin.uimaster.datamodel.common.impl.EntityTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantEntityTypeImpl#getEffTime <em>Eff Time</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantEntityTypeImpl#getExpTime <em>Exp Time</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantEntityTypeImpl#getConstantValue <em>Constant Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantEntityTypeImpl extends EntityTypeImpl implements ConstantEntityType {
	/**
	 * The default value of the '{@link #getEffTime() <em>Eff Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EFF_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffTime() <em>Eff Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar effTime = EFF_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpTime() <em>Exp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpTime() <em>Exp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expTime = EXP_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstantValue() <em>Constant Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstantValueType> constantValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantEntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.CONSTANT_ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEffTime() {
		return effTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffTime(XMLGregorianCalendar newEffTime) {
		XMLGregorianCalendar oldEffTime = effTime;
		effTime = newEffTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_ENTITY_TYPE__EFF_TIME, oldEffTime, effTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getExpTime() {
		return expTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpTime(XMLGregorianCalendar newExpTime) {
		XMLGregorianCalendar oldExpTime = expTime;
		expTime = newExpTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_ENTITY_TYPE__EXP_TIME, oldExpTime, expTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstantValueType> getConstantValue() {
		if (constantValue == null) {
			constantValue = new EObjectContainmentEList<ConstantValueType>(ConstantValueType.class, this, BEDiagramPackage.CONSTANT_ENTITY_TYPE__CONSTANT_VALUE);
		}
		return constantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__CONSTANT_VALUE:
				return ((InternalEList<?>)getConstantValue()).basicRemove(otherEnd, msgs);
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
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__EFF_TIME:
				return getEffTime();
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__EXP_TIME:
				return getExpTime();
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__CONSTANT_VALUE:
				return getConstantValue();
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
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__EFF_TIME:
				setEffTime((XMLGregorianCalendar)newValue);
				return;
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__EXP_TIME:
				setExpTime((XMLGregorianCalendar)newValue);
				return;
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__CONSTANT_VALUE:
				getConstantValue().clear();
				getConstantValue().addAll((Collection<? extends ConstantValueType>)newValue);
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
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__EFF_TIME:
				setEffTime(EFF_TIME_EDEFAULT);
				return;
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__EXP_TIME:
				setExpTime(EXP_TIME_EDEFAULT);
				return;
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__CONSTANT_VALUE:
				getConstantValue().clear();
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
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__EFF_TIME:
				return EFF_TIME_EDEFAULT == null ? effTime != null : !EFF_TIME_EDEFAULT.equals(effTime);
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__EXP_TIME:
				return EXP_TIME_EDEFAULT == null ? expTime != null : !EXP_TIME_EDEFAULT.equals(expTime);
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE__CONSTANT_VALUE:
				return constantValue != null && !constantValue.isEmpty();
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
		result.append(" (effTime: ");
		result.append(effTime);
		result.append(", expTime: ");
		result.append(expTime);
		result.append(')');
		return result.toString();
	}

} //ConstantEntityTypeImpl
