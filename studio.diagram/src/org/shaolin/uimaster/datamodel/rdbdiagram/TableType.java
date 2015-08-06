/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getColumn <em>Column</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getIndex <em>Index</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getInheritAsscociation <em>Inherit Asscociation</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getTableType()
 * @model extendedMetaData="name='TableType' kind='elementOnly'"
 * @generated
 */
public interface TableType extends RDBType {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getTableType_Column()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColumnType> getColumn();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getTableType_Index()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IndexType> getIndex();

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getTableType_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SequenceType> getSequence();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.rdbdiagram.PKType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getTableType_PrimaryKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='primaryKey' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PKType> getPrimaryKey();

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getTableType_ForeignKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='foreignKey' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FKType> getForeignKey();

	/**
	 * Returns the value of the '<em><b>Inherit Asscociation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherit Asscociation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherit Asscociation</em>' containment reference.
	 * @see #setInheritAsscociation(InheritAssociationType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getTableType_InheritAsscociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inheritAsscociation' namespace='##targetNamespace'"
	 * @generated
	 */
	InheritAssociationType getInheritAsscociation();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getInheritAsscociation <em>Inherit Asscociation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit Asscociation</em>' containment reference.
	 * @see #getInheritAsscociation()
	 * @generated
	 */
	void setInheritAsscociation(InheritAssociationType value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(ClassMappingType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getTableType_Mapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassMappingType getMapping();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(ClassMappingType value);

} // TableType
