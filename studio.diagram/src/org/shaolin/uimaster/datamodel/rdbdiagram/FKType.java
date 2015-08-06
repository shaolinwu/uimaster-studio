/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.ecore.EObject;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FK Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getRefTable <em>Ref Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getOnDelete <em>On Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFKType()
 * @model extendedMetaData="name='FKType' kind='elementOnly'"
 * @generated
 */
public interface FKType extends EObject {
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
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFKType_ColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='columnName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Ref Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Table</em>' containment reference.
	 * @see #setRefTable(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFKType_RefTable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='refTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getRefTable();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getRefTable <em>Ref Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Table</em>' containment reference.
	 * @see #getRefTable()
	 * @generated
	 */
	void setRefTable(TargetEntityType value);

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
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFKType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' attribute.
	 * The literals are from the enumeration {@link org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType
	 * @see #isSetOnDelete()
	 * @see #unsetOnDelete()
	 * @see #setOnDelete(OnDeleteType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getFKType_OnDelete()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='onDelete'"
	 * @generated
	 */
	OnDeleteType getOnDelete();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType
	 * @see #isSetOnDelete()
	 * @see #unsetOnDelete()
	 * @see #getOnDelete()
	 * @generated
	 */
	void setOnDelete(OnDeleteType value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnDelete()
	 * @see #getOnDelete()
	 * @see #setOnDelete(OnDeleteType)
	 * @generated
	 */
	void unsetOnDelete();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getOnDelete <em>On Delete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Delete</em>' attribute is set.
	 * @see #unsetOnDelete()
	 * @see #getOnDelete()
	 * @see #setOnDelete(OnDeleteType)
	 * @generated
	 */
	boolean isSetOnDelete();

} // FKType
