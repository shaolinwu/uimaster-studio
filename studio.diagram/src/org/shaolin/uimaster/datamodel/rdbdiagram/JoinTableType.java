/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getSrcPKColumn <em>Src PK Column</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getSrcTable <em>Src Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getTarTable <em>Tar Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getTarPKColumn <em>Tar PK Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getJoinTableType()
 * @model extendedMetaData="name='JoinTableType' kind='empty'"
 * @generated
 */
public interface JoinTableType extends EObject {
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
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getJoinTableType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Src PK Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src PK Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src PK Column</em>' attribute.
	 * @see #setSrcPKColumn(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getJoinTableType_SrcPKColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='pkColumn'"
	 * @generated
	 */
	String getSrcPKColumn();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getSrcPKColumn <em>Src PK Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src PK Column</em>' attribute.
	 * @see #getSrcPKColumn()
	 * @generated
	 */
	void setSrcPKColumn(String value);

	/**
	 * Returns the value of the '<em><b>Src Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Table</em>' attribute.
	 * @see #setSrcTable(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getJoinTableType_SrcTable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSrcTable();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getSrcTable <em>Src Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Table</em>' attribute.
	 * @see #getSrcTable()
	 * @generated
	 */
	void setSrcTable(String value);

	/**
	 * Returns the value of the '<em><b>Tar Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tar Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tar Table</em>' attribute.
	 * @see #setTarTable(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getJoinTableType_TarTable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTarTable();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getTarTable <em>Tar Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tar Table</em>' attribute.
	 * @see #getTarTable()
	 * @generated
	 */
	void setTarTable(String value);

	/**
	 * Returns the value of the '<em><b>Tar PK Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tar PK Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tar PK Column</em>' attribute.
	 * @see #setTarPKColumn(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getJoinTableType_TarPKColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='fkColumn'"
	 * @generated
	 */
	String getTarPKColumn();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getTarPKColumn <em>Tar PK Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tar PK Column</em>' attribute.
	 * @see #getTarPKColumn()
	 * @generated
	 */
	void setTarPKColumn(String value);

} // JoinTableType
