/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#getColumn <em>Column</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsClustered <em>Is Clustered</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getIndexType()
 * @model extendedMetaData="name='IndexType' kind='elementOnly'"
 * @generated
 */
public interface IndexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getIndexType_Column()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getColumn();

	/**
	 * Returns the value of the '<em><b>Is Clustered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Clustered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Clustered</em>' attribute.
	 * @see #isSetIsClustered()
	 * @see #unsetIsClustered()
	 * @see #setIsClustered(boolean)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getIndexType_IsClustered()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isClustered'"
	 * @generated
	 */
	boolean isIsClustered();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsClustered <em>Is Clustered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Clustered</em>' attribute.
	 * @see #isSetIsClustered()
	 * @see #unsetIsClustered()
	 * @see #isIsClustered()
	 * @generated
	 */
	void setIsClustered(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsClustered <em>Is Clustered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsClustered()
	 * @see #isIsClustered()
	 * @see #setIsClustered(boolean)
	 * @generated
	 */
	void unsetIsClustered();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsClustered <em>Is Clustered</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Clustered</em>' attribute is set.
	 * @see #unsetIsClustered()
	 * @see #isIsClustered()
	 * @see #setIsClustered(boolean)
	 * @generated
	 */
	boolean isSetIsClustered();

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #isSetIsUnique()
	 * @see #unsetIsUnique()
	 * @see #setIsUnique(boolean)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getIndexType_IsUnique()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isUnique'"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isSetIsUnique()
	 * @see #unsetIsUnique()
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsUnique()
	 * @see #isIsUnique()
	 * @see #setIsUnique(boolean)
	 * @generated
	 */
	void unsetIsUnique();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsUnique <em>Is Unique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Unique</em>' attribute is set.
	 * @see #unsetIsUnique()
	 * @see #isIsUnique()
	 * @see #setIsUnique(boolean)
	 * @generated
	 */
	boolean isSetIsUnique();

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
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getIndexType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IndexType
