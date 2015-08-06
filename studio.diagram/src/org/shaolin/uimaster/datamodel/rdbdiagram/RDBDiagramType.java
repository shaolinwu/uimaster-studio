/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

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
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getTable <em>Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getView <em>View</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getDaoPackage <em>Dao Package</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getDiagramPackage <em>Diagram Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getRDBDiagramType()
 * @model extendedMetaData="name='RDBDiagramType' kind='elementOnly'"
 * @generated
 */
public interface RDBDiagramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getRDBDiagramType_Table()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TableType> getTable();

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getRDBDiagramType_View()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='view' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ViewType> getView();

	/**
	 * Returns the value of the '<em><b>Join Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Table</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getRDBDiagramType_JoinTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<JoinTableType> getJoinTable();

	/**
	 * Returns the value of the '<em><b>Dao Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dao Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dao Package</em>' attribute.
	 * @see #setDaoPackage(String)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getRDBDiagramType_DaoPackage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='daoPackage'"
	 * @generated
	 */
	String getDaoPackage();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getDaoPackage <em>Dao Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dao Package</em>' attribute.
	 * @see #getDaoPackage()
	 * @generated
	 */
	void setDaoPackage(String value);

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
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getRDBDiagramType_DiagramPackage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='diagramPackage'"
	 * @generated
	 */
	String getDiagramPackage();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getDiagramPackage <em>Diagram Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Package</em>' attribute.
	 * @see #getDiagramPackage()
	 * @generated
	 */
	void setDiagramPackage(String value);

} // RDBDiagramType
