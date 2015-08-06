/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getRefFieldName <em>Ref Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getTimeFieldName <em>Time Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#isMustHave <em>Must Have</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getReferenceObjectType()
 * @model extendedMetaData="name='ReferenceObjectType' kind='elementOnly'"
 * @generated
 */
public interface ReferenceObjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' containment reference.
	 * @see #setRefType(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getReferenceObjectType_RefType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='refType' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getRefType();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getRefType <em>Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' containment reference.
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Ref Field Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Field Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Field Name</em>' attribute list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getReferenceObjectType_RefFieldName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='refFieldName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getRefFieldName();

	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getReferenceObjectType_FieldName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='fieldName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFieldName();

	/**
	 * Returns the value of the '<em><b>Time Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Field Name</em>' attribute.
	 * @see #setTimeFieldName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getReferenceObjectType_TimeFieldName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='timeFieldName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTimeFieldName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getTimeFieldName <em>Time Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Field Name</em>' attribute.
	 * @see #getTimeFieldName()
	 * @generated
	 */
	void setTimeFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Must Have</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Have</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Have</em>' attribute.
	 * @see #isSetMustHave()
	 * @see #unsetMustHave()
	 * @see #setMustHave(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getReferenceObjectType_MustHave()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='mustHave'"
	 * @generated
	 */
	boolean isMustHave();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#isMustHave <em>Must Have</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Have</em>' attribute.
	 * @see #isSetMustHave()
	 * @see #unsetMustHave()
	 * @see #isMustHave()
	 * @generated
	 */
	void setMustHave(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#isMustHave <em>Must Have</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMustHave()
	 * @see #isMustHave()
	 * @see #setMustHave(boolean)
	 * @generated
	 */
	void unsetMustHave();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#isMustHave <em>Must Have</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Must Have</em>' attribute is set.
	 * @see #unsetMustHave()
	 * @see #isMustHave()
	 * @see #setMustHave(boolean)
	 * @generated
	 */
	boolean isSetMustHave();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getReferenceObjectType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ReferenceObjectType
