/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.shaolin.uimaster.datamodel.common.NameExpressionType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * specified the next node by chunk name, the  node name and OutDataMapping. in OutDataMapping, expression can reference GlobalVariables of current chunk using prefix tag "@",  reference the OutData/variables of the current node using prefix tag "$"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.NextType#getDestNode <em>Dest Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.NextType#getOutDataMappingToNode <em>Out Data Mapping To Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.NextType#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getNextType()
 * @model extendedMetaData="name='NextType' kind='elementOnly'"
 * @generated
 */
public interface NextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dest Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the next node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dest Node</em>' attribute.
	 * @see #setDestNode(String)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getNextType_DestNode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='destNode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDestNode();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.NextType#getDestNode <em>Dest Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Node</em>' attribute.
	 * @see #getDestNode()
	 * @generated
	 */
	void setDestNode(String value);

	/**
	 * Returns the value of the '<em><b>Out Data Mapping To Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.common.NameExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * defines the mapping between the  Node OutputData/variables and the destination Node InputData/variables. the  attribute "name" is required and is the InputData/variables name of the destnode. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Data Mapping To Node</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getNextType_OutDataMappingToNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outDataMappingToNode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameExpressionType> getOutDataMappingToNode();

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
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getNextType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.NextType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // NextType
