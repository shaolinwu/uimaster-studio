/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.eclipse.emf.common.util.EList;

import org.shaolin.uimaster.datamodel.common.NameExpressionType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDestChunkName <em>Dest Chunk Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDestNode <em>Dest Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDataMappingToNode <em>Data Mapping To Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDataMappingToChunk <em>Data Mapping To Chunk</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getFlowNodeType()
 * @model extendedMetaData="name='FlowNodeType' kind='elementOnly'"
 * @generated
 */
public interface FlowNodeType extends WebNodeType {
	/**
	 * Returns the value of the '<em><b>Dest Chunk Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not specified, then means in the same web chunk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dest Chunk Name</em>' containment reference.
	 * @see #setDestChunkName(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getFlowNodeType_DestChunkName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DestChunkName' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getDestChunkName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDestChunkName <em>Dest Chunk Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Chunk Name</em>' containment reference.
	 * @see #getDestChunkName()
	 * @generated
	 */
	void setDestChunkName(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Dest Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the next node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dest Node</em>' attribute.
	 * @see #setDestNode(String)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getFlowNodeType_DestNode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DestNode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDestNode();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDestNode <em>Dest Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Node</em>' attribute.
	 * @see #getDestNode()
	 * @generated
	 */
	void setDestNode(String value);

	/**
	 * Returns the value of the '<em><b>Data Mapping To Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.common.NameExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * only session variable can be used in expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Mapping To Node</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getFlowNodeType_DataMappingToNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataMappingToNode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameExpressionType> getDataMappingToNode();

	/**
	 * Returns the value of the '<em><b>Data Mapping To Chunk</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.common.NameExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * only session variable can be used in expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Mapping To Chunk</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getFlowNodeType_DataMappingToChunk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataMappingToChunk' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameExpressionType> getDataMappingToChunk();

} // FlowNodeType
