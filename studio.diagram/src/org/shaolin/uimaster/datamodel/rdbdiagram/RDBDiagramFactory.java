/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage
 * @generated
 */
public interface RDBDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RDBDiagramFactory eINSTANCE = org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Mapping Type</em>'.
	 * @generated
	 */
	ClassMappingType createClassMappingType();

	/**
	 * Returns a new object of class '<em>Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Type</em>'.
	 * @generated
	 */
	ColumnType createColumnType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Field Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Mapping Type</em>'.
	 * @generated
	 */
	FieldMappingType createFieldMappingType();

	/**
	 * Returns a new object of class '<em>FK Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FK Type</em>'.
	 * @generated
	 */
	FKType createFKType();

	/**
	 * Returns a new object of class '<em>Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Type</em>'.
	 * @generated
	 */
	IndexType createIndexType();

	/**
	 * Returns a new object of class '<em>Inherit Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inherit Association Type</em>'.
	 * @generated
	 */
	InheritAssociationType createInheritAssociationType();

	/**
	 * Returns a new object of class '<em>Join Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Table Type</em>'.
	 * @generated
	 */
	JoinTableType createJoinTableType();

	/**
	 * Returns a new object of class '<em>List Field Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Field Mapping Type</em>'.
	 * @generated
	 */
	ListFieldMappingType createListFieldMappingType();

	/**
	 * Returns a new object of class '<em>PK Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PK Type</em>'.
	 * @generated
	 */
	PKType createPKType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	RDBDiagramType createRDBDiagramType();

	/**
	 * Returns a new object of class '<em>RDB Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDB Type</em>'.
	 * @generated
	 */
	RDBType createRDBType();

	/**
	 * Returns a new object of class '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Type</em>'.
	 * @generated
	 */
	SequenceType createSequenceType();

	/**
	 * Returns a new object of class '<em>Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Type</em>'.
	 * @generated
	 */
	TableType createTableType();

	/**
	 * Returns a new object of class '<em>View Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Type</em>'.
	 * @generated
	 */
	ViewType createViewType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RDBDiagramPackage getRDBDiagramPackage();

} //RDBDiagramFactory
