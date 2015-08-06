/**
 */
package org.shaolin.uimaster.datamodel.bediagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BE Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BEMapType#getKeyType <em>Key Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEMapType()
 * @model extendedMetaData="name='BEMapType' kind='elementOnly'"
 * @generated
 */
public interface BEMapType extends BECollectionType {
	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' containment reference.
	 * @see #setKeyType(BEType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEMapType_KeyType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='keyType' namespace='##targetNamespace'"
	 * @generated
	 */
	BEType getKeyType();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BEMapType#getKeyType <em>Key Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' containment reference.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(BEType value);

} // BEMapType
