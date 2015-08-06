/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType#getDummyField <em>Dummy Field</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType#getReferenceConfig <em>Reference Config</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType#getExternalReferenceConfig <em>External Reference Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getValidatorConfigType()
 * @model extendedMetaData="name='ValidatorConfigType' kind='elementOnly'"
 * @generated
 */
public interface ValidatorConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dummy Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dummy Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dummy Field</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getValidatorConfigType_DummyField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dummyField' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DummyFieldType> getDummyField();

	/**
	 * Returns the value of the '<em><b>Reference Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Config</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getValidatorConfigType_ReferenceConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceConfig' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferenceObjectType> getReferenceConfig();

	/**
	 * Returns the value of the '<em><b>External Reference Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Reference Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Reference Config</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getValidatorConfigType_ExternalReferenceConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReferenceConfig' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExternalReferenceType> getExternalReferenceConfig();

} // ValidatorConfigType
