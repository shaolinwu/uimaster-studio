/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.shaolin.uimaster.datamodel.common.ExpressionType;
import org.shaolin.uimaster.datamodel.common.MetaDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#getValue <em>Value</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#isIsEntity2 <em>Is Entity2</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#getRelationName <em>Relation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getRelationConstraintType()
 * @model extendedMetaData="name='RelationConstraintType' kind='elementOnly'"
 * @generated
 */
public interface RelationConstraintType extends MetaDataType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ExpressionType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getRelationConstraintType_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getValue();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ExpressionType value);

	/**
	 * Returns the value of the '<em><b>Is Entity2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Entity2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entity2</em>' attribute.
	 * @see #isSetIsEntity2()
	 * @see #unsetIsEntity2()
	 * @see #setIsEntity2(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getRelationConstraintType_IsEntity2()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isEntity2'"
	 * @generated
	 */
	boolean isIsEntity2();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#isIsEntity2 <em>Is Entity2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entity2</em>' attribute.
	 * @see #isSetIsEntity2()
	 * @see #unsetIsEntity2()
	 * @see #isIsEntity2()
	 * @generated
	 */
	void setIsEntity2(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#isIsEntity2 <em>Is Entity2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsEntity2()
	 * @see #isIsEntity2()
	 * @see #setIsEntity2(boolean)
	 * @generated
	 */
	void unsetIsEntity2();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#isIsEntity2 <em>Is Entity2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Entity2</em>' attribute is set.
	 * @see #unsetIsEntity2()
	 * @see #isIsEntity2()
	 * @see #setIsEntity2(boolean)
	 * @generated
	 */
	boolean isSetIsEntity2();

	/**
	 * Returns the value of the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Name</em>' attribute.
	 * @see #setRelationName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getRelationConstraintType_RelationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='relationName'"
	 * @generated
	 */
	String getRelationName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#getRelationName <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Name</em>' attribute.
	 * @see #getRelationName()
	 * @generated
	 */
	void setRelationName(String value);

} // RelationConstraintType
