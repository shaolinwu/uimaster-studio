/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getDefault <em>Default</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getLength <em>Length</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isRedundant <em>Redundant</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getColumnType()
 * @model extendedMetaData="name='ColumnType' kind='empty'"
 * @generated
 */
public interface ColumnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getColumnType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getColumnType_Default()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default'"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Is Null</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Null</em>' attribute.
	 * @see #isSetIsNull()
	 * @see #unsetIsNull()
	 * @see #setIsNull(boolean)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getColumnType_IsNull()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isNull'"
	 * @generated
	 */
	boolean isIsNull();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isIsNull <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Null</em>' attribute.
	 * @see #isSetIsNull()
	 * @see #unsetIsNull()
	 * @see #isIsNull()
	 * @generated
	 */
	void setIsNull(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isIsNull <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsNull()
	 * @see #isIsNull()
	 * @see #setIsNull(boolean)
	 * @generated
	 */
	void unsetIsNull();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isIsNull <em>Is Null</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Null</em>' attribute is set.
	 * @see #unsetIsNull()
	 * @see #isIsNull()
	 * @see #setIsNull(boolean)
	 * @generated
	 */
	boolean isSetIsNull();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getColumnType_Length()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='length'"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

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
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getColumnType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #setPrecision(int)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getColumnType_Precision()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='precision'"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(int)
	 * @generated
	 */
	void unsetPrecision();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getPrecision <em>Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision</em>' attribute is set.
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(int)
	 * @generated
	 */
	boolean isSetPrecision();

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
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getColumnType_Redundant()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='redundant'"
	 * @generated
	 */
	boolean isRedundant();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isRedundant <em>Redundant</em>}' attribute.
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
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isRedundant <em>Redundant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRedundant()
	 * @see #isRedundant()
	 * @see #setRedundant(boolean)
	 * @generated
	 */
	void unsetRedundant();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isRedundant <em>Redundant</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.shaolin.uimaster.datamodel.rdbdiagram.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getColumnType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // ColumnType
