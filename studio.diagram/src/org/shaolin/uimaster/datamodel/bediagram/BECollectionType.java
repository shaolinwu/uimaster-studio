/**
 */
package org.shaolin.uimaster.datamodel.bediagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BE Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BECollectionType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBECollectionType()
 * @model abstract="true"
 *        extendedMetaData="name='BECollectionType' kind='elementOnly'"
 * @generated
 */
public interface BECollectionType extends BEComplexType {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(BEType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBECollectionType_ElementType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='elementType' namespace='##targetNamespace'"
	 * @generated
	 */
	BEType getElementType();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BECollectionType#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(BEType value);

} // BECollectionType
