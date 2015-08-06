/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.eclipse.emf.common.util.EList;

import org.shaolin.uimaster.datamodel.common.ExpressionType;
import org.shaolin.uimaster.datamodel.common.ParamType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * the Logic Node, represents some business operations. Note: the OutType of LogicNodeType should be the type ConditionalOutType.  if an out's conditionalExpression is null, this out is default out.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#isNeedTransaction <em>Need Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getLogicNodeType()
 * @model extendedMetaData="name='LogicNodeType' kind='elementOnly'"
 * @generated
 */
public interface LogicNodeType extends WebNodeType {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(ExpressionType)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getLogicNodeType_Operation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getOperation();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ExpressionType value);

	/**
	 * Returns the value of the '<em><b>Need Transaction</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need Transaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Transaction</em>' attribute.
	 * @see #isSetNeedTransaction()
	 * @see #unsetNeedTransaction()
	 * @see #setNeedTransaction(boolean)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getLogicNodeType_NeedTransaction()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='needTransaction'"
	 * @generated
	 */
	boolean isNeedTransaction();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#isNeedTransaction <em>Need Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Transaction</em>' attribute.
	 * @see #isSetNeedTransaction()
	 * @see #unsetNeedTransaction()
	 * @see #isNeedTransaction()
	 * @generated
	 */
	void setNeedTransaction(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#isNeedTransaction <em>Need Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedTransaction()
	 * @see #isNeedTransaction()
	 * @see #setNeedTransaction(boolean)
	 * @generated
	 */
	void unsetNeedTransaction();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#isNeedTransaction <em>Need Transaction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Need Transaction</em>' attribute is set.
	 * @see #unsetNeedTransaction()
	 * @see #isNeedTransaction()
	 * @see #setNeedTransaction(boolean)
	 * @generated
	 */
	boolean isSetNeedTransaction();

} // LogicNodeType
