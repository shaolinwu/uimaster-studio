/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.eclipse.emf.common.util.EList;

import org.shaolin.uimaster.datamodel.common.EntityType;
import org.shaolin.uimaster.datamodel.common.ParamType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Chunk Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of Display Nodes and Logic Nodes, which indicates a complete web process or a web application module.  the chunk is a entity so we can store in or get from component library.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getWebNode <em>Web Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getGlobalVariable <em>Global Variable</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getAccessPermission <em>Access Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebChunkType()
 * @model extendedMetaData="name='WebChunkType' kind='elementOnly'"
 * @generated
 */
public interface WebChunkType extends EntityType {
	/**
	 * Returns the value of the '<em><b>Web Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Node</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebChunkType_WebNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='webNode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WebNodeType> getWebNode();

	/**
	 * Returns the value of the '<em><b>Global Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.common.ParamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The global variables in this WebChunk. if you use variable in Expression, you can use prefix "@" to indicate  Global variable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Variable</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebChunkType_GlobalVariable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='globalVariable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParamType> getGlobalVariable();

	/**
	 * Returns the value of the '<em><b>Error Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the path of error page,  if  error/exception occurs  when WebFlowEngine process the node in this WebChunk,  WebFlowEngine forward the request to this page
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Handler</em>' attribute.
	 * @see #setErrorHandler(String)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebChunkType_ErrorHandler()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	String getErrorHandler();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getErrorHandler <em>Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler</em>' attribute.
	 * @see #getErrorHandler()
	 * @generated
	 */
	void setErrorHandler(String value);

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
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getWebChunkType_AccessPermission()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='accessPermission' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAccessPermission();

} // WebChunkType
