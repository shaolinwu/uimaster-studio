/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getBEDiagram <em>BE Diagram</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getBusinessEntity <em>Business Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getConstantEntity <em>Constant Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>BE Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BE diagram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BE Diagram</em>' containment reference.
	 * @see #setBEDiagram(BEDiagramType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDocumentRoot_BEDiagram()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BEDiagram' namespace='##targetNamespace'"
	 * @generated
	 */
	BEDiagramType getBEDiagram();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getBEDiagram <em>BE Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BE Diagram</em>' containment reference.
	 * @see #getBEDiagram()
	 * @generated
	 */
	void setBEDiagram(BEDiagramType value);

	/**
	 * Returns the value of the '<em><b>Business Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Entity</em>' containment reference.
	 * @see #setBusinessEntity(BusinessEntityType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDocumentRoot_BusinessEntity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessEntityType getBusinessEntity();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getBusinessEntity <em>Business Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Entity</em>' containment reference.
	 * @see #getBusinessEntity()
	 * @generated
	 */
	void setBusinessEntity(BusinessEntityType value);

	/**
	 * Returns the value of the '<em><b>Constant Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root element for a Constant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant Entity</em>' containment reference.
	 * @see #setConstantEntity(ConstantEntityType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getDocumentRoot_ConstantEntity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConstantEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantEntityType getConstantEntity();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getConstantEntity <em>Constant Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Entity</em>' containment reference.
	 * @see #getConstantEntity()
	 * @generated
	 */
	void setConstantEntity(ConstantEntityType value);

} // DocumentRoot
