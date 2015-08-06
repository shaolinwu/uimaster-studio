/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CE Obj Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CEObjRefType reference ConstantEntity!
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.CEObjRefType#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getCEObjRefType()
 * @model extendedMetaData="name='CEObjRefType' kind='elementOnly'"
 * @generated
 */
public interface CEObjRefType extends BEComplexType {
	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' containment reference.
	 * @see #setTargetEntity(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getCEObjRefType_TargetEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getTargetEntity();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.CEObjRefType#getTargetEntity <em>Target Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity</em>' containment reference.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(TargetEntityType value);

} // CEObjRefType
