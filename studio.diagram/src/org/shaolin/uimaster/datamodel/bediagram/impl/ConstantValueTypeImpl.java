/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.ConstantValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl#getI18nKey <em>I1 8n Key</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl#getEffTime <em>Eff Time</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl#getExpTime <em>Exp Time</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl#isPassivated <em>Passivated</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantValueTypeImpl extends EObjectImpl implements ConstantValueType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getI18nKey() <em>I1 8n Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI18nKey()
	 * @generated
	 * @ordered
	 */
	protected static final String I18N_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI18nKey() <em>I1 8n Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI18nKey()
	 * @generated
	 * @ordered
	 */
	protected String i18nKey = I18N_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_VALUE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected int intValue = INT_VALUE_EDEFAULT;

	/**
	 * This is true if the Int Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intValueESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #isPassivated() <em>Passivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASSIVATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassivated() <em>Passivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassivated()
	 * @generated
	 * @ordered
	 */
	protected boolean passivated = PASSIVATED_EDEFAULT;

	/**
	 * This is true if the Passivated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean passivatedESet;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.CONSTANT_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_VALUE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI18nKey() {
		return i18nKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI18nKey(String newI18nKey) {
		String oldI18nKey = i18nKey;
		i18nKey = newI18nKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_VALUE_TYPE__I18N_KEY, oldI18nKey, i18nKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntValue() {
		return intValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntValue(int newIntValue) {
		int oldIntValue = intValue;
		intValue = newIntValue;
		boolean oldIntValueESet = intValueESet;
		intValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_VALUE_TYPE__INT_VALUE, oldIntValue, intValue, !oldIntValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntValue() {
		int oldIntValue = intValue;
		boolean oldIntValueESet = intValueESet;
		intValue = INT_VALUE_EDEFAULT;
		intValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.CONSTANT_VALUE_TYPE__INT_VALUE, oldIntValue, INT_VALUE_EDEFAULT, oldIntValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntValue() {
		return intValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_VALUE_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_VALUE_TYPE__EFF_TIME, oldEffTime, effTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_VALUE_TYPE__EXP_TIME, oldExpTime, expTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPassivated() {
		return passivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassivated(boolean newPassivated) {
		boolean oldPassivated = passivated;
		passivated = newPassivated;
		boolean oldPassivatedESet = passivatedESet;
		passivatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_VALUE_TYPE__PASSIVATED, oldPassivated, passivated, !oldPassivatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPassivated() {
		boolean oldPassivated = passivated;
		boolean oldPassivatedESet = passivatedESet;
		passivated = PASSIVATED_EDEFAULT;
		passivatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.CONSTANT_VALUE_TYPE__PASSIVATED, oldPassivated, PASSIVATED_EDEFAULT, oldPassivatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPassivated() {
		return passivatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.CONSTANT_VALUE_TYPE__PRIORITY, oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		int oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.CONSTANT_VALUE_TYPE__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__VALUE:
				return getValue();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__I18N_KEY:
				return getI18nKey();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__INT_VALUE:
				return getIntValue();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__DESCRIPTION:
				return getDescription();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__EFF_TIME:
				return getEffTime();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__EXP_TIME:
				return getExpTime();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__PASSIVATED:
				return isPassivated();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__PRIORITY:
				return getPriority();
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
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__I18N_KEY:
				setI18nKey((String)newValue);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__INT_VALUE:
				setIntValue((Integer)newValue);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__EFF_TIME:
				setEffTime((XMLGregorianCalendar)newValue);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__EXP_TIME:
				setExpTime((XMLGregorianCalendar)newValue);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__PASSIVATED:
				setPassivated((Boolean)newValue);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__PRIORITY:
				setPriority((Integer)newValue);
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
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__I18N_KEY:
				setI18nKey(I18N_KEY_EDEFAULT);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__INT_VALUE:
				unsetIntValue();
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__EFF_TIME:
				setEffTime(EFF_TIME_EDEFAULT);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__EXP_TIME:
				setExpTime(EXP_TIME_EDEFAULT);
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__PASSIVATED:
				unsetPassivated();
				return;
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__PRIORITY:
				unsetPriority();
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
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__I18N_KEY:
				return I18N_KEY_EDEFAULT == null ? i18nKey != null : !I18N_KEY_EDEFAULT.equals(i18nKey);
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__INT_VALUE:
				return isSetIntValue();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__EFF_TIME:
				return EFF_TIME_EDEFAULT == null ? effTime != null : !EFF_TIME_EDEFAULT.equals(effTime);
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__EXP_TIME:
				return EXP_TIME_EDEFAULT == null ? expTime != null : !EXP_TIME_EDEFAULT.equals(expTime);
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__PASSIVATED:
				return isSetPassivated();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE__PRIORITY:
				return isSetPriority();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", i18nKey: ");
		result.append(i18nKey);
		result.append(", intValue: ");
		if (intValueESet) result.append(intValue); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", effTime: ");
		result.append(effTime);
		result.append(", expTime: ");
		result.append(expTime);
		result.append(", passivated: ");
		if (passivatedESet) result.append(passivated); else result.append("<unset>");
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConstantValueTypeImpl
