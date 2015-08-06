/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Can be used to map primitive type fields or File type fields
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getBeFieldName <em>Be Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isIsTimestamp <em>Is Timestamp</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isRedundant <em>Redundant</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isUseClobBuffer <em>Use Clob Buffer</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getAssociationName <em>Association Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFieldMappingType()
 * @model extendedMetaData="name='FieldMappingType' kind='empty'"
 * @generated
 */
public interface FieldMappingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Be Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Be Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Be Field Name</em>' attribute.
	 * @see #setBeFieldName(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFieldMappingType_BeFieldName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='beFieldName'"
	 * @generated
	 */
	String getBeFieldName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getBeFieldName <em>Be Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Be Field Name</em>' attribute.
	 * @see #getBeFieldName()
	 * @generated
	 */
	void setBeFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFieldMappingType_ColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='columnName'"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Is Timestamp</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Timestamp</em>' attribute.
	 * @see #isSetIsTimestamp()
	 * @see #unsetIsTimestamp()
	 * @see #setIsTimestamp(boolean)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFieldMappingType_IsTimestamp()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isTimestamp'"
	 * @generated
	 */
	boolean isIsTimestamp();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isIsTimestamp <em>Is Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Timestamp</em>' attribute.
	 * @see #isSetIsTimestamp()
	 * @see #unsetIsTimestamp()
	 * @see #isIsTimestamp()
	 * @generated
	 */
	void setIsTimestamp(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isIsTimestamp <em>Is Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTimestamp()
	 * @see #isIsTimestamp()
	 * @see #setIsTimestamp(boolean)
	 * @generated
	 */
	void unsetIsTimestamp();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isIsTimestamp <em>Is Timestamp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Timestamp</em>' attribute is set.
	 * @see #unsetIsTimestamp()
	 * @see #isIsTimestamp()
	 * @see #setIsTimestamp(boolean)
	 * @generated
	 */
	boolean isSetIsTimestamp();

	/**
	 * Returns the value of the '<em><b>Redundant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redundant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redundant</em>' attribute.
	 * @see #isSetRedundant()
	 * @see #unsetRedundant()
	 * @see #setRedundant(boolean)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFieldMappingType_Redundant()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='redundant'"
	 * @generated
	 */
	boolean isRedundant();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isRedundant <em>Redundant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redundant</em>' attribute.
	 * @see #isSetRedundant()
	 * @see #unsetRedundant()
	 * @see #isRedundant()
	 * @generated
	 */
	void setRedundant(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isRedundant <em>Redundant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRedundant()
	 * @see #isRedundant()
	 * @see #setRedundant(boolean)
	 * @generated
	 */
	void unsetRedundant();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isRedundant <em>Redundant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Redundant</em>' attribute is set.
	 * @see #unsetRedundant()
	 * @see #isRedundant()
	 * @see #setRedundant(boolean)
	 * @generated
	 */
	boolean isSetRedundant();

	/**
	 * Returns the value of the '<em><b>Use Clob Buffer</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Clob Buffer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Clob Buffer</em>' attribute.
	 * @see #isSetUseClobBuffer()
	 * @see #unsetUseClobBuffer()
	 * @see #setUseClobBuffer(boolean)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFieldMappingType_UseClobBuffer()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='useClobBuffer'"
	 * @generated
	 */
	boolean isUseClobBuffer();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isUseClobBuffer <em>Use Clob Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Clob Buffer</em>' attribute.
	 * @see #isSetUseClobBuffer()
	 * @see #unsetUseClobBuffer()
	 * @see #isUseClobBuffer()
	 * @generated
	 */
	void setUseClobBuffer(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isUseClobBuffer <em>Use Clob Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseClobBuffer()
	 * @see #isUseClobBuffer()
	 * @see #setUseClobBuffer(boolean)
	 * @generated
	 */
	void unsetUseClobBuffer();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isUseClobBuffer <em>Use Clob Buffer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Clob Buffer</em>' attribute is set.
	 * @see #unsetUseClobBuffer()
	 * @see #isUseClobBuffer()
	 * @see #setUseClobBuffer(boolean)
	 * @generated
	 */
	boolean isSetUseClobBuffer();

	/**
	 * Returns the value of the '<em><b>Association Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Name</em>' attribute.
	 * @see #setAssociationName(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFieldMappingType_AssociationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='associationName'"
	 * @generated
	 */
	String getAssociationName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getAssociationName <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Name</em>' attribute.
	 * @see #getAssociationName()
	 * @generated
	 */
	void setAssociationName(String value);

} // FieldMappingType
