/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.shaolin.uimaster.datamodel.common.TargetJavaType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Obj Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * JavaObjRefType reference java object!
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType#getTargetJava <em>Target Java</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getJavaObjRefType()
 * @model extendedMetaData="name='JavaObjRefType' kind='elementOnly'"
 * @generated
 */
public interface JavaObjRefType extends ObjectRefType {
	/**
	 * Returns the value of the '<em><b>Target Java</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Java</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Java</em>' containment reference.
	 * @see #setTargetJava(TargetJavaType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getJavaObjRefType_TargetJava()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetJava' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetJavaType getTargetJava();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType#getTargetJava <em>Target Java</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Java</em>' containment reference.
	 * @see #getTargetJava()
	 * @generated
	 */
	void setTargetJava(TargetJavaType value);

} // JavaObjRefType
