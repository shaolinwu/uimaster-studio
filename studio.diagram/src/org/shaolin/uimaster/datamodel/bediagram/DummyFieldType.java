/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dummy Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getRefDummyFieldName <em>Ref Dummy Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getDummyFieldName <em>Dummy Field Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDummyFieldType()
 * @model extendedMetaData="name='DummyFieldType' kind='elementOnly'"
 * @generated
 */
public interface DummyFieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceObjectType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDummyFieldType_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceObjectType getReference();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceObjectType value);

	/**
	 * Returns the value of the '<em><b>Ref Dummy Field Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Dummy Field Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Dummy Field Name</em>' attribute list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDummyFieldType_RefDummyFieldName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='refDummyFieldName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getRefDummyFieldName();

	/**
	 * Returns the value of the '<em><b>Dummy Field Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dummy Field Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dummy Field Name</em>' attribute list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDummyFieldType_DummyFieldName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='dummyFieldName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDummyFieldName();

} // DummyFieldType
