/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.common.util.EList;

import org.shaolin.uimaster.datamodel.common.EntityType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * If this class is a base class, 
 * 				if rootTableName specified, engine will use that 
 * 				table to store pk to oid relation; 
 * 				if the rootTableName is not specified, engine 
 * 				will ignore oid(then doesn't support polymorphism). 
 * 				If this class is not a base class, the rootTableName must be null. 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getBusinessEntity <em>Business Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getTable <em>Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getHistoryTable <em>History Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getView <em>View</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getParentClassMapping <em>Parent Class Mapping</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getFieldMapping <em>Field Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getClassMappingType()
 * @model extendedMetaData="name='ClassMappingType' kind='elementOnly'"
 * @generated
 */
public interface ClassMappingType extends EntityType {
	/**
	 * Returns the value of the '<em><b>Business Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Entity</em>' containment reference.
	 * @see #setBusinessEntity(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getClassMappingType_BusinessEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='businessEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getBusinessEntity();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getBusinessEntity <em>Business Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Entity</em>' containment reference.
	 * @see #getBusinessEntity()
	 * @generated
	 */
	void setBusinessEntity(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getClassMappingType_Table()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getTable();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>History Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Table</em>' containment reference.
	 * @see #setHistoryTable(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getClassMappingType_HistoryTable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='historyTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getHistoryTable();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getHistoryTable <em>History Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Table</em>' containment reference.
	 * @see #getHistoryTable()
	 * @generated
	 */
	void setHistoryTable(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #setView(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getClassMappingType_View()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='view' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getView();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Parent Class Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Class Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Class Mapping</em>' containment reference.
	 * @see #setParentClassMapping(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getClassMappingType_ParentClassMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentClassMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getParentClassMapping();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getParentClassMapping <em>Parent Class Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Class Mapping</em>' containment reference.
	 * @see #getParentClassMapping()
	 * @generated
	 */
	void setParentClassMapping(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Field Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Mapping</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getClassMappingType_FieldMapping()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fieldMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FieldMappingType> getFieldMapping();

} // ClassMappingType
