/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.shaolin.uimaster.datamodel.common.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getEffTime <em>Eff Time</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getExpTime <em>Exp Time</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getConstantValue <em>Constant Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantEntityType()
 * @model extendedMetaData="name='ConstantEntityType' kind='elementOnly'"
 * @generated
 */
public interface ConstantEntityType extends EntityType {
	/**
	 * Returns the value of the '<em><b>Eff Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Effective Time
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eff Time</em>' attribute.
	 * @see #setEffTime(XMLGregorianCalendar)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantEntityType_EffTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='effTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEffTime();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getEffTime <em>Eff Time</em>}' attribute.
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
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantEntityType_ExpTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='expTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpTime();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getExpTime <em>Exp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Time</em>' attribute.
	 * @see #getExpTime()
	 * @generated
	 */
	void setExpTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Constant Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Value</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getConstantEntityType_ConstantValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constantValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConstantValueType> getConstantValue();

} // ConstantEntityType
