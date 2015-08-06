/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.shaolin.uimaster.datamodel.common.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * the attribute "path" of Display Node specifies the path of the JSP/HTML/WML page. Note: the OutType of DisplayNodeType should be the type DisplayOutType. when the node is type of UIPageDisplayNodeType, the "path" attribute is optional.
 * All these info can be imported from the UIHTML info. 
 * All these info can be imported from the UIHTML info. 
 * All these info can be imported from the UIHTML info. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getQueryString <em>Query String</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getDisplayNodeType()
 * @model extendedMetaData="name='DisplayNodeType' kind='elementOnly'"
 * @generated
 */
public interface DisplayNodeType extends WebNodeType {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * engine will execute these operations after request forwards to this page
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(ExpressionType)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getDisplayNodeType_Operation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getOperation();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ExpressionType value);

	/**
	 * Returns the value of the '<em><b>Query String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * engine will execute these operations after request forwards to this page
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query String</em>' containment reference.
	 * @see #setQueryString(ExpressionType)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getDisplayNodeType_QueryString()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='queryString' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getQueryString();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getQueryString <em>Query String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query String</em>' containment reference.
	 * @see #getQueryString()
	 * @generated
	 */
	void setQueryString(ExpressionType value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getDisplayNodeType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // DisplayNodeType
