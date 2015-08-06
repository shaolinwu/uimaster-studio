/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Field Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getCollectionTable <em>Collection Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#isIsPrivateOwned <em>Is Private Owned</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getMappingType <em>Mapping Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getListFieldMappingType()
 * @model extendedMetaData="name='ListFieldMappingType' kind='elementOnly'"
 * @generated
 */
public interface ListFieldMappingType extends FieldMappingType {
	/**
	 * Returns the value of the '<em><b>Collection Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Table</em>' containment reference.
	 * @see #setCollectionTable(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getListFieldMappingType_CollectionTable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='collectionTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getCollectionTable();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getCollectionTable <em>Collection Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Table</em>' containment reference.
	 * @see #getCollectionTable()
	 * @generated
	 */
	void setCollectionTable(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Is Private Owned</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Private Owned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Private Owned</em>' attribute.
	 * @see #isSetIsPrivateOwned()
	 * @see #unsetIsPrivateOwned()
	 * @see #setIsPrivateOwned(boolean)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getListFieldMappingType_IsPrivateOwned()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isPrivateOwned'"
	 * @generated
	 */
	boolean isIsPrivateOwned();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#isIsPrivateOwned <em>Is Private Owned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Private Owned</em>' attribute.
	 * @see #isSetIsPrivateOwned()
	 * @see #unsetIsPrivateOwned()
	 * @see #isIsPrivateOwned()
	 * @generated
	 */
	void setIsPrivateOwned(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#isIsPrivateOwned <em>Is Private Owned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPrivateOwned()
	 * @see #isIsPrivateOwned()
	 * @see #setIsPrivateOwned(boolean)
	 * @generated
	 */
	void unsetIsPrivateOwned();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#isIsPrivateOwned <em>Is Private Owned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Private Owned</em>' attribute is set.
	 * @see #unsetIsPrivateOwned()
	 * @see #isIsPrivateOwned()
	 * @see #setIsPrivateOwned(boolean)
	 * @generated
	 */
	boolean isSetIsPrivateOwned();

	/**
	 * Returns the value of the '<em><b>Mapping Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Type</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType
	 * @see #isSetMappingType()
	 * @see #unsetMappingType()
	 * @see #setMappingType(MappingTypeType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getListFieldMappingType_MappingType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='mappingType'"
	 * @generated
	 */
	MappingTypeType getMappingType();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getMappingType <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Type</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType
	 * @see #isSetMappingType()
	 * @see #unsetMappingType()
	 * @see #getMappingType()
	 * @generated
	 */
	void setMappingType(MappingTypeType value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getMappingType <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMappingType()
	 * @see #getMappingType()
	 * @see #setMappingType(MappingTypeType)
	 * @generated
	 */
	void unsetMappingType();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getMappingType <em>Mapping Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mapping Type</em>' attribute is set.
	 * @see #unsetMappingType()
	 * @see #getMappingType()
	 * @see #setMappingType(MappingTypeType)
	 * @generated
	 */
	boolean isSetMappingType();

} // ListFieldMappingType
