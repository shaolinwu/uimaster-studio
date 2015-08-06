/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BE Obj Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BEObjRefType reference BusinessEntity!
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#isAutoVersionUpdate <em>Auto Version Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEObjRefType()
 * @model extendedMetaData="name='BEObjRefType' kind='elementOnly'"
 * @generated
 */
public interface BEObjRefType extends ObjectRefType {
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
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEObjRefType_TargetEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getTargetEntity();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#getTargetEntity <em>Target Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity</em>' containment reference.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Auto Version Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Version Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Version Update</em>' attribute.
	 * @see #isSetAutoVersionUpdate()
	 * @see #unsetAutoVersionUpdate()
	 * @see #setAutoVersionUpdate(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEObjRefType_AutoVersionUpdate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='autoVersionUpdate'"
	 * @generated
	 */
	boolean isAutoVersionUpdate();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#isAutoVersionUpdate <em>Auto Version Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Version Update</em>' attribute.
	 * @see #isSetAutoVersionUpdate()
	 * @see #unsetAutoVersionUpdate()
	 * @see #isAutoVersionUpdate()
	 * @generated
	 */
	void setAutoVersionUpdate(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#isAutoVersionUpdate <em>Auto Version Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoVersionUpdate()
	 * @see #isAutoVersionUpdate()
	 * @see #setAutoVersionUpdate(boolean)
	 * @generated
	 */
	void unsetAutoVersionUpdate();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#isAutoVersionUpdate <em>Auto Version Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Version Update</em>' attribute is set.
	 * @see #unsetAutoVersionUpdate()
	 * @see #isAutoVersionUpdate()
	 * @see #setAutoVersionUpdate(boolean)
	 * @generated
	 */
	boolean isSetAutoVersionUpdate();

} // BEObjRefType
