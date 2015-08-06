/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getBeEntity <em>Be Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getCeEntity <em>Ce Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getBePackage <em>Be Package</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getCePackage <em>Ce Package</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getDiagramPackage <em>Diagram Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEDiagramType()
 * @model extendedMetaData="name='BEDiagramType' kind='elementOnly'"
 * @generated
 */
public interface BEDiagramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Be Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Be Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Be Entity</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEDiagramType_BeEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusinessEntityType> getBeEntity();

	/**
	 * Returns the value of the '<em><b>Ce Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ce Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ce Entity</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEDiagramType_CeEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ceEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConstantEntityType> getCeEntity();

	/**
	 * Returns the value of the '<em><b>Diagram Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Package</em>' attribute.
	 * @see #setDiagramPackage(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEDiagramType_DiagramPackage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='diagramPackage'"
	 * @generated
	 */
	String getDiagramPackage();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getDiagramPackage <em>Diagram Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Package</em>' attribute.
	 * @see #getDiagramPackage()
	 * @generated
	 */
	void setDiagramPackage(String value);

	/**
	 * Returns the value of the '<em><b>Be Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Be Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Be Package</em>' attribute.
	 * @see #setBePackage(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEDiagramType_BePackage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bePackage'"
	 * @generated
	 */
	String getBePackage();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getBePackage <em>Be Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Be Package</em>' attribute.
	 * @see #getBePackage()
	 * @generated
	 */
	void setBePackage(String value);

	/**
	 * Returns the value of the '<em><b>Ce Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ce Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ce Package</em>' attribute.
	 * @see #setCePackage(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBEDiagramType_CePackage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cePackage'"
	 * @generated
	 */
	String getCePackage();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getCePackage <em>Ce Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ce Package</em>' attribute.
	 * @see #getCePackage()
	 * @generated
	 */
	void setCePackage(String value);

} // BEDiagramType
