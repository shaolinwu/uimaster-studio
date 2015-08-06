/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.shaolin.uimaster.datamodel.common.MetaDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Name Web Service Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType#getNamespaceURI <em>Namespace URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityNameWebServiceMappingType()
 * @model extendedMetaData="name='EntityNameWebServiceMappingType' kind='empty'"
 * @generated
 */
public interface EntityNameWebServiceMappingType extends MetaDataType {
	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Name</em>' attribute.
	 * @see #setMappedName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityNameWebServiceMappingType_MappedName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mappedName'"
	 * @generated
	 */
	String getMappedName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType#getMappedName <em>Mapped Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' attribute.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace URI</em>' attribute.
	 * @see #setNamespaceURI(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityNameWebServiceMappingType_NamespaceURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='namespaceURI'"
	 * @generated
	 */
	String getNamespaceURI();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType#getNamespaceURI <em>Namespace URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace URI</em>' attribute.
	 * @see #getNamespaceURI()
	 * @generated
	 */
	void setNamespaceURI(String value);

} // EntityNameWebServiceMappingType
