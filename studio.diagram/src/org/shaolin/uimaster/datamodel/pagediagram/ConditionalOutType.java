/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.shaolin.uimaster.datamodel.common.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  a OutType with condition expression, for LogicNode
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getConditionalOutType()
 * @model extendedMetaData="name='ConditionalOutType' kind='elementOnly'"
 * @generated
 */
public interface ConditionalOutType extends OutType {
	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the condition expression should has a value type of boolean
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Expression</em>' containment reference.
	 * @see #setConditionExpression(ExpressionType)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getConditionalOutType_ConditionExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getConditionExpression();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType#getConditionExpression <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' containment reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(ExpressionType value);

} // ConditionalOutType
