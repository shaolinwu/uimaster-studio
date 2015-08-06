/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistent Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType#getSupportedPersistenceType <em>Supported Persistence Type</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType#getPrimaryKeyMember <em>Primary Key Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getPersistentConfigType()
 * @model extendedMetaData="name='PersistentConfigType' kind='elementOnly'"
 * @generated
 */
public interface PersistentConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Supported Persistence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Persistence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Persistence Type</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType
	 * @see #isSetSupportedPersistenceType()
	 * @see #unsetSupportedPersistenceType()
	 * @see #setSupportedPersistenceType(PersistenceTypeType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getPersistentConfigType_SupportedPersistenceType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='supportedPersistenceType' namespace='##targetNamespace'"
	 * @generated
	 */
	PersistenceTypeType getSupportedPersistenceType();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType#getSupportedPersistenceType <em>Supported Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Persistence Type</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType
	 * @see #isSetSupportedPersistenceType()
	 * @see #unsetSupportedPersistenceType()
	 * @see #getSupportedPersistenceType()
	 * @generated
	 */
	void setSupportedPersistenceType(PersistenceTypeType value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType#getSupportedPersistenceType <em>Supported Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSupportedPersistenceType()
	 * @see #getSupportedPersistenceType()
	 * @see #setSupportedPersistenceType(PersistenceTypeType)
	 * @generated
	 */
	void unsetSupportedPersistenceType();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType#getSupportedPersistenceType <em>Supported Persistence Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Supported Persistence Type</em>' attribute is set.
	 * @see #unsetSupportedPersistenceType()
	 * @see #getSupportedPersistenceType()
	 * @see #setSupportedPersistenceType(PersistenceTypeType)
	 * @generated
	 */
	boolean isSetSupportedPersistenceType();

	/**
	 * Returns the value of the '<em><b>Primary Key Member</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Member</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Member</em>' attribute list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getPersistentConfigType_PrimaryKeyMember()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='primaryKeyMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getPrimaryKeyMember();

} // PersistentConfigType
