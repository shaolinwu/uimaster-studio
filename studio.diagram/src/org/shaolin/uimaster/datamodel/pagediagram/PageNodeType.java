/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.eclipse.emf.common.util.EList;

import org.shaolin.uimaster.datamodel.common.ExpressionType;
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * diaply node from UIPage
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#isNeedTransaction <em>Need Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getPageNodeType()
 * @model extendedMetaData="name='PageNodeType' kind='elementOnly'"
 * @generated
 */
public interface PageNodeType extends WebNodeType {
	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is one or zero UIPage(See UIPage module) corresponding to a Display Node. 
	 * 							This element indicates the entity name of the corresponding UIPage.  if there is no UIPage, you must also specify the entity name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Entity</em>' containment reference.
	 * @see #setSourceEntity(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getPageNodeType_SourceEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sourceEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getSourceEntity();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#getSourceEntity <em>Source Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Entity</em>' containment reference.
	 * @see #getSourceEntity()
	 * @generated
	 */
	void setSourceEntity(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * engine will execute these operations after request forwards to this page
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(ExpressionType)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getPageNodeType_Operation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getOperation();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#getOperation <em>Operation</em>}' containment reference.
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
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getPageNodeType_NeedTransaction()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='needTransaction'"
	 * @generated
	 */
	boolean isNeedTransaction();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#isNeedTransaction <em>Need Transaction</em>}' attribute.
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
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#isNeedTransaction <em>Need Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedTransaction()
	 * @see #isNeedTransaction()
	 * @see #setNeedTransaction(boolean)
	 * @generated
	 */
	void unsetNeedTransaction();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#isNeedTransaction <em>Need Transaction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Need Transaction</em>' attribute is set.
	 * @see #unsetNeedTransaction()
	 * @see #isNeedTransaction()
	 * @see #setNeedTransaction(boolean)
	 * @generated
	 */
	boolean isSetNeedTransaction();

} // PageNodeType
