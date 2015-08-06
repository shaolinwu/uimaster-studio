/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.shaolin.uimaster.datamodel.common.ParamType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * an abstraction of JSP/HTML/WML page and server-side Action. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getOut <em>Out</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getAccessPermission <em>Access Permission</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebNodeType()
 * @model abstract="true"
 *        extendedMetaData="name='WebNodeType' kind='elementOnly'"
 * @generated
 */
public interface WebNodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.pagediagram.OutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specified the Out for this node.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebNodeType_Out()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='out' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutType> getOut();

	/**
	 * Returns the value of the '<em><b>Access Permission</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Permission</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Permission</em>' attribute list.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebNodeType_AccessPermission()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='accessPermission' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAccessPermission();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebNodeType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebNodeType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='displayName'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebNodeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.common.ParamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the input datas of this node. Note: the input data should not have default value, the attribute "name" is required 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebNodeType_Variables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParamType> getVariables();

} // WebNodeType
