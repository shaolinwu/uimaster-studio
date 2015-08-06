/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getValue <em>Value</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getI18nKey <em>I1 8n Key</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getEffTime <em>Eff Time</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getExpTime <em>Exp Time</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#isPassivated <em>Passivated</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantValueType()
 * @model extendedMetaData="name='ConstantValueType' kind='elementOnly'"
 * @generated
 */
public interface ConstantValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantValueType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the key of displayname in resource bundle.  if not specified, use entityname + "." + value as i18nKey.  Note:  this element is available only when the constant entity is specified the "bundle" in "displayName". 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>I1 8n Key</em>' attribute.
	 * @see #setI18nKey(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantValueType_I18nKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='i18nKey' namespace='##targetNamespace'"
	 * @generated
	 */
	String getI18nKey();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getI18nKey <em>I1 8n Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I1 8n Key</em>' attribute.
	 * @see #getI18nKey()
	 * @generated
	 */
	void setI18nKey(String value);

	/**
	 * Returns the value of the '<em><b>Int Value</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Value</em>' attribute.
	 * @see #isSetIntValue()
	 * @see #unsetIntValue()
	 * @see #setIntValue(int)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantValueType_IntValue()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='intValue' namespace='##targetNamespace'"
	 * @generated
	 */
	int getIntValue();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getIntValue <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Value</em>' attribute.
	 * @see #isSetIntValue()
	 * @see #unsetIntValue()
	 * @see #getIntValue()
	 * @generated
	 */
	void setIntValue(int value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getIntValue <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntValue()
	 * @see #getIntValue()
	 * @see #setIntValue(int)
	 * @generated
	 */
	void unsetIntValue();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getIntValue <em>Int Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Int Value</em>' attribute is set.
	 * @see #unsetIntValue()
	 * @see #getIntValue()
	 * @see #setIntValue(int)
	 * @generated
	 */
	boolean isSetIntValue();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantValueType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Eff Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Effective Time
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eff Time</em>' attribute.
	 * @see #setEffTime(XMLGregorianCalendar)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantValueType_EffTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='effTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEffTime();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getEffTime <em>Eff Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eff Time</em>' attribute.
	 * @see #getEffTime()
	 * @generated
	 */
	void setEffTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Exp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expired Time
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exp Time</em>' attribute.
	 * @see #setExpTime(XMLGregorianCalendar)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantValueType_ExpTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='expTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpTime();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getExpTime <em>Exp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Time</em>' attribute.
	 * @see #getExpTime()
	 * @generated
	 */
	void setExpTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Passivated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passivated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passivated</em>' attribute.
	 * @see #isSetPassivated()
	 * @see #unsetPassivated()
	 * @see #setPassivated(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantValueType_Passivated()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='passivated' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPassivated();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#isPassivated <em>Passivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passivated</em>' attribute.
	 * @see #isSetPassivated()
	 * @see #unsetPassivated()
	 * @see #isPassivated()
	 * @generated
	 */
	void setPassivated(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#isPassivated <em>Passivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPassivated()
	 * @see #isPassivated()
	 * @see #setPassivated(boolean)
	 * @generated
	 */
	void unsetPassivated();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#isPassivated <em>Passivated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Passivated</em>' attribute is set.
	 * @see #unsetPassivated()
	 * @see #isPassivated()
	 * @see #setPassivated(boolean)
	 * @generated
	 */
	boolean isSetPassivated();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(int)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantValueType_Priority()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	boolean isSetPriority();

} // ConstantValueType
