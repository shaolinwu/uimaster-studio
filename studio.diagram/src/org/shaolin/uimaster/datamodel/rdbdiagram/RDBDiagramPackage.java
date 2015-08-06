/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.shaolin.uimaster.datamodel.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface RDBDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdbdiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bmdp.shaolin.org/datamodel/RDBDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdbdiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RDBDiagramPackage eINSTANCE = org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl <em>Class Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getClassMappingType()
	 * @generated
	 */
	int CLASS_MAPPING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__ENTITY_NAME = CommonPackage.ENTITY_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__SYSTEM_VERSION = CommonPackage.ENTITY_TYPE__SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__REVISION = CommonPackage.ENTITY_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__DISPLAY_NAME = CommonPackage.ENTITY_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__DESCRIPTION = CommonPackage.ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__AUTHOR = CommonPackage.ENTITY_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__REGION = CommonPackage.ENTITY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__CATEGORY = CommonPackage.ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Entity Meta Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__ENTITY_META_INFO = CommonPackage.ENTITY_TYPE__ENTITY_META_INFO;

	/**
	 * The feature id for the '<em><b>Extension Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__EXTENSION_PROPERTY = CommonPackage.ENTITY_TYPE__EXTENSION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Business Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__BUSINESS_ENTITY = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__TABLE = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>History Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__HISTORY_TABLE = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__VIEW = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Class Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Field Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE__FIELD_MAPPING = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_TYPE_FEATURE_COUNT = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ColumnTypeImpl <em>Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.ColumnTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getColumnType()
	 * @generated
	 */
	int COLUMN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Is Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__IS_NULL = 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__PRECISION = 5;

	/**
	 * The feature id for the '<em><b>Redundant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__REDUNDANT = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.DocumentRootImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Class Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>RDB Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RDB_DIAGRAM = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl <em>Field Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getFieldMappingType()
	 * @generated
	 */
	int FIELD_MAPPING_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Be Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING_TYPE__BE_FIELD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING_TYPE__COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING_TYPE__IS_TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Redundant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING_TYPE__REDUNDANT = 3;

	/**
	 * The feature id for the '<em><b>Use Clob Buffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING_TYPE__USE_CLOB_BUFFER = 4;

	/**
	 * The feature id for the '<em><b>Association Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING_TYPE__ASSOCIATION_NAME = 5;

	/**
	 * The number of structural features of the '<em>Field Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_MAPPING_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FKTypeImpl <em>FK Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.FKTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getFKType()
	 * @generated
	 */
	int FK_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_TYPE__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_TYPE__REF_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_TYPE__ON_DELETE = 3;

	/**
	 * The number of structural features of the '<em>FK Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.IndexTypeImpl <em>Index Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.IndexTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getIndexType()
	 * @generated
	 */
	int INDEX_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Is Clustered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE__IS_CLUSTERED = 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE__IS_UNIQUE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Index Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.InheritAssociationTypeImpl <em>Inherit Association Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.InheritAssociationTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getInheritAssociationType()
	 * @generated
	 */
	int INHERIT_ASSOCIATION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERIT_ASSOCIATION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERIT_ASSOCIATION_TYPE__PARENT_TABLE = 1;

	/**
	 * The number of structural features of the '<em>Inherit Association Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERIT_ASSOCIATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.JoinTableTypeImpl <em>Join Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.JoinTableTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getJoinTableType()
	 * @generated
	 */
	int JOIN_TABLE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Src PK Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_TYPE__SRC_PK_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Src Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_TYPE__SRC_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Tar Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_TYPE__TAR_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Tar PK Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_TYPE__TAR_PK_COLUMN = 4;

	/**
	 * The number of structural features of the '<em>Join Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ListFieldMappingTypeImpl <em>List Field Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.ListFieldMappingTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getListFieldMappingType()
	 * @generated
	 */
	int LIST_FIELD_MAPPING_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Be Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE__BE_FIELD_NAME = FIELD_MAPPING_TYPE__BE_FIELD_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE__COLUMN_NAME = FIELD_MAPPING_TYPE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Is Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE__IS_TIMESTAMP = FIELD_MAPPING_TYPE__IS_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Redundant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE__REDUNDANT = FIELD_MAPPING_TYPE__REDUNDANT;

	/**
	 * The feature id for the '<em><b>Use Clob Buffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE__USE_CLOB_BUFFER = FIELD_MAPPING_TYPE__USE_CLOB_BUFFER;

	/**
	 * The feature id for the '<em><b>Association Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE__ASSOCIATION_NAME = FIELD_MAPPING_TYPE__ASSOCIATION_NAME;

	/**
	 * The feature id for the '<em><b>Collection Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE = FIELD_MAPPING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Private Owned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE__IS_PRIVATE_OWNED = FIELD_MAPPING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE__MAPPING_TYPE = FIELD_MAPPING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Field Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_MAPPING_TYPE_FEATURE_COUNT = FIELD_MAPPING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.PKTypeImpl <em>PK Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.PKTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getPKType()
	 * @generated
	 */
	int PK_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PK_TYPE__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PK_TYPE__SEQUENCE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PK_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>PK Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getRDBDiagramType()
	 * @generated
	 */
	int RDB_DIAGRAM_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_DIAGRAM_TYPE__TABLE = 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_DIAGRAM_TYPE__VIEW = 1;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_DIAGRAM_TYPE__JOIN_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Dao Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_DIAGRAM_TYPE__DAO_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Diagram Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_DIAGRAM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBTypeImpl <em>RDB Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getRDBType()
	 * @generated
	 */
	int RDB_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__ENTITY_NAME = CommonPackage.ENTITY_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__SYSTEM_VERSION = CommonPackage.ENTITY_TYPE__SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__REVISION = CommonPackage.ENTITY_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__DISPLAY_NAME = CommonPackage.ENTITY_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__DESCRIPTION = CommonPackage.ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__AUTHOR = CommonPackage.ENTITY_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__REGION = CommonPackage.ENTITY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__CATEGORY = CommonPackage.ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Entity Meta Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__ENTITY_META_INFO = CommonPackage.ENTITY_TYPE__ENTITY_META_INFO;

	/**
	 * The feature id for the '<em><b>Extension Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__EXTENSION_PROPERTY = CommonPackage.ENTITY_TYPE__EXTENSION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__COMMENT = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE__NAME = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RDB Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB_TYPE_FEATURE_COUNT = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.SequenceTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Dbcache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__DBCACHE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__SPAN = 2;

	/**
	 * The feature id for the '<em><b>Start With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__START_WITH = 3;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__ENTITY_NAME = RDB_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SYSTEM_VERSION = RDB_TYPE__SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__REVISION = RDB_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__DISPLAY_NAME = RDB_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__DESCRIPTION = RDB_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__AUTHOR = RDB_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__REGION = RDB_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__CATEGORY = RDB_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Entity Meta Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__ENTITY_META_INFO = RDB_TYPE__ENTITY_META_INFO;

	/**
	 * The feature id for the '<em><b>Extension Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__EXTENSION_PROPERTY = RDB_TYPE__EXTENSION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COMMENT = RDB_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__NAME = RDB_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COLUMN = RDB_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__INDEX = RDB_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SEQUENCE = RDB_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__PRIMARY_KEY = RDB_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__FOREIGN_KEY = RDB_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inherit Asscociation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__INHERIT_ASSCOCIATION = RDB_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__MAPPING = RDB_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = RDB_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ViewTypeImpl <em>View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.ViewTypeImpl
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getViewType()
	 * @generated
	 */
	int VIEW_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__ENTITY_NAME = RDB_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__SYSTEM_VERSION = RDB_TYPE__SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__REVISION = RDB_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__DISPLAY_NAME = RDB_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__DESCRIPTION = RDB_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__AUTHOR = RDB_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__REGION = RDB_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__CATEGORY = RDB_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Entity Meta Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__ENTITY_META_INFO = RDB_TYPE__ENTITY_META_INFO;

	/**
	 * The feature id for the '<em><b>Extension Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__EXTENSION_PROPERTY = RDB_TYPE__EXTENSION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__COMMENT = RDB_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__NAME = RDB_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Base Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__BASE_TABLE = RDB_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ext Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__EXT_TABLE = RDB_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__OP = RDB_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE_FEATURE_COUNT = RDB_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType <em>Mapping Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getMappingTypeType()
	 * @generated
	 */
	int MAPPING_TYPE_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType <em>On Delete Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getOnDeleteType()
	 * @generated
	 */
	int ON_DELETE_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TypeType
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType <em>View Op Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getViewOpType()
	 * @generated
	 */
	int VIEW_OP_TYPE = 18;

	/**
	 * The meta object id for the '<em>Mapping Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getMappingTypeTypeObject()
	 * @generated
	 */
	int MAPPING_TYPE_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>On Delete Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getOnDeleteTypeObject()
	 * @generated
	 */
	int ON_DELETE_TYPE_OBJECT = 20;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TypeType
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>View Op Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getViewOpTypeObject()
	 * @generated
	 */
	int VIEW_OP_TYPE_OBJECT = 22;


	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType <em>Class Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Mapping Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType
	 * @generated
	 */
	EClass getClassMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getBusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Entity</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getBusinessEntity()
	 * @see #getClassMappingType()
	 * @generated
	 */
	EReference getClassMappingType_BusinessEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getTable()
	 * @see #getClassMappingType()
	 * @generated
	 */
	EReference getClassMappingType_Table();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getHistoryTable <em>History Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>History Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getHistoryTable()
	 * @see #getClassMappingType()
	 * @generated
	 */
	EReference getClassMappingType_HistoryTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getView()
	 * @see #getClassMappingType()
	 * @generated
	 */
	EReference getClassMappingType_View();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getParentClassMapping <em>Parent Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Class Mapping</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getParentClassMapping()
	 * @see #getClassMappingType()
	 * @generated
	 */
	EReference getClassMappingType_ParentClassMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getFieldMapping <em>Field Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Mapping</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType#getFieldMapping()
	 * @see #getClassMappingType()
	 * @generated
	 */
	EReference getClassMappingType_FieldMapping();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType
	 * @generated
	 */
	EClass getColumnType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getComment()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getDefault()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isIsNull <em>Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Null</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isIsNull()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_IsNull();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getLength()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getName()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getPrecision()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isRedundant <em>Redundant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redundant</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#isRedundant()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Redundant();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType#getType()
	 * @see #getColumnType()
	 * @generated
	 */
	EAttribute getColumnType_Type();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getClassMapping <em>Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Mapping</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getClassMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getRDBDiagram <em>RDB Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RDB Diagram</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot#getRDBDiagram()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RDBDiagram();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType <em>Field Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Mapping Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType
	 * @generated
	 */
	EClass getFieldMappingType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getBeFieldName <em>Be Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Be Field Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getBeFieldName()
	 * @see #getFieldMappingType()
	 * @generated
	 */
	EAttribute getFieldMappingType_BeFieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getColumnName()
	 * @see #getFieldMappingType()
	 * @generated
	 */
	EAttribute getFieldMappingType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isIsTimestamp <em>Is Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Timestamp</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isIsTimestamp()
	 * @see #getFieldMappingType()
	 * @generated
	 */
	EAttribute getFieldMappingType_IsTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isRedundant <em>Redundant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redundant</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isRedundant()
	 * @see #getFieldMappingType()
	 * @generated
	 */
	EAttribute getFieldMappingType_Redundant();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isUseClobBuffer <em>Use Clob Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Clob Buffer</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#isUseClobBuffer()
	 * @see #getFieldMappingType()
	 * @generated
	 */
	EAttribute getFieldMappingType_UseClobBuffer();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getAssociationName <em>Association Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType#getAssociationName()
	 * @see #getFieldMappingType()
	 * @generated
	 */
	EAttribute getFieldMappingType_AssociationName();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType <em>FK Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FK Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FKType
	 * @generated
	 */
	EClass getFKType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getColumnName()
	 * @see #getFKType()
	 * @generated
	 */
	EAttribute getFKType_ColumnName();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getRefTable <em>Ref Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getRefTable()
	 * @see #getFKType()
	 * @generated
	 */
	EReference getFKType_RefTable();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getName()
	 * @see #getFKType()
	 * @generated
	 */
	EAttribute getFKType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FKType#getOnDelete()
	 * @see #getFKType()
	 * @generated
	 */
	EAttribute getFKType_OnDelete();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType <em>Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.IndexType
	 * @generated
	 */
	EClass getIndexType();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#getColumn()
	 * @see #getIndexType()
	 * @generated
	 */
	EAttribute getIndexType_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsClustered <em>Is Clustered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Clustered</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsClustered()
	 * @see #getIndexType()
	 * @generated
	 */
	EAttribute getIndexType_IsClustered();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#isIsUnique()
	 * @see #getIndexType()
	 * @generated
	 */
	EAttribute getIndexType_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.IndexType#getName()
	 * @see #getIndexType()
	 * @generated
	 */
	EAttribute getIndexType_Name();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType <em>Inherit Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherit Association Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType
	 * @generated
	 */
	EClass getInheritAssociationType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType#getName()
	 * @see #getInheritAssociationType()
	 * @generated
	 */
	EAttribute getInheritAssociationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType#getParentTable <em>Parent Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType#getParentTable()
	 * @see #getInheritAssociationType()
	 * @generated
	 */
	EAttribute getInheritAssociationType_ParentTable();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType <em>Join Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Table Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType
	 * @generated
	 */
	EClass getJoinTableType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getName()
	 * @see #getJoinTableType()
	 * @generated
	 */
	EAttribute getJoinTableType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getSrcPKColumn <em>Src PK Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src PK Column</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getSrcPKColumn()
	 * @see #getJoinTableType()
	 * @generated
	 */
	EAttribute getJoinTableType_SrcPKColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getSrcTable <em>Src Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getSrcTable()
	 * @see #getJoinTableType()
	 * @generated
	 */
	EAttribute getJoinTableType_SrcTable();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getTarTable <em>Tar Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tar Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getTarTable()
	 * @see #getJoinTableType()
	 * @generated
	 */
	EAttribute getJoinTableType_TarTable();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getTarPKColumn <em>Tar PK Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tar PK Column</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType#getTarPKColumn()
	 * @see #getJoinTableType()
	 * @generated
	 */
	EAttribute getJoinTableType_TarPKColumn();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType <em>List Field Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Field Mapping Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType
	 * @generated
	 */
	EClass getListFieldMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getCollectionTable <em>Collection Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getCollectionTable()
	 * @see #getListFieldMappingType()
	 * @generated
	 */
	EReference getListFieldMappingType_CollectionTable();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#isIsPrivateOwned <em>Is Private Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Private Owned</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#isIsPrivateOwned()
	 * @see #getListFieldMappingType()
	 * @generated
	 */
	EAttribute getListFieldMappingType_IsPrivateOwned();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getMappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType#getMappingType()
	 * @see #getListFieldMappingType()
	 * @generated
	 */
	EAttribute getListFieldMappingType_MappingType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.PKType <em>PK Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PK Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.PKType
	 * @generated
	 */
	EClass getPKType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.PKType#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.PKType#getColumnName()
	 * @see #getPKType()
	 * @generated
	 */
	EAttribute getPKType_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.PKType#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.PKType#getSequenceName()
	 * @see #getPKType()
	 * @generated
	 */
	EAttribute getPKType_SequenceName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.PKType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.PKType#getName()
	 * @see #getPKType()
	 * @generated
	 */
	EAttribute getPKType_Name();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType
	 * @generated
	 */
	EClass getRDBDiagramType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getTable()
	 * @see #getRDBDiagramType()
	 * @generated
	 */
	EReference getRDBDiagramType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getView()
	 * @see #getRDBDiagramType()
	 * @generated
	 */
	EReference getRDBDiagramType_View();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getJoinTable()
	 * @see #getRDBDiagramType()
	 * @generated
	 */
	EReference getRDBDiagramType_JoinTable();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getDaoPackage <em>Dao Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dao Package</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getDaoPackage()
	 * @see #getRDBDiagramType()
	 * @generated
	 */
	EAttribute getRDBDiagramType_DaoPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getDiagramPackage <em>Diagram Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram Package</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType#getDiagramPackage()
	 * @see #getRDBDiagramType()
	 * @generated
	 */
	EAttribute getRDBDiagramType_DiagramPackage();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBType <em>RDB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDB Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBType
	 * @generated
	 */
	EClass getRDBType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBType#getComment()
	 * @see #getRDBType()
	 * @generated
	 */
	EAttribute getRDBType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBType#getName()
	 * @see #getRDBType()
	 * @generated
	 */
	EAttribute getRDBType_Name();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getDbcache <em>Dbcache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbcache</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getDbcache()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_Dbcache();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getName()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getSpan()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getStartWith <em>Start With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start With</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getStartWith()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_StartWith();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getColumn()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getIndex()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getSequence()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getPrimaryKey()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getForeignKey()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getInheritAsscociation <em>Inherit Asscociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inherit Asscociation</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getInheritAsscociation()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_InheritAsscociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TableType#getMapping()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Mapping();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewType
	 * @generated
	 */
	EClass getViewType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getBaseTable <em>Base Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getBaseTable()
	 * @see #getViewType()
	 * @generated
	 */
	EReference getViewType_BaseTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getExtTable <em>Ext Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext Table</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getExtTable()
	 * @see #getViewType()
	 * @generated
	 */
	EReference getViewType_ExtTable();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getOp()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_Op();

	/**
	 * Returns the meta object for enum '{@link org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType <em>Mapping Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mapping Type Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType
	 * @generated
	 */
	EEnum getMappingTypeType();

	/**
	 * Returns the meta object for enum '{@link org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType <em>On Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>On Delete Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType
	 * @generated
	 */
	EEnum getOnDeleteType();

	/**
	 * Returns the meta object for enum '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType <em>View Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>View Op Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType
	 * @generated
	 */
	EEnum getViewOpType();

	/**
	 * Returns the meta object for data type '{@link org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType <em>Mapping Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mapping Type Type Object</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType
	 * @model instanceClass="org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType"
	 *        extendedMetaData="name='mappingType_._type:Object' baseType='mappingType_._type'"
	 * @generated
	 */
	EDataType getMappingTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType <em>On Delete Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>On Delete Type Object</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType
	 * @model instanceClass="org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType"
	 *        extendedMetaData="name='OnDeleteType:Object' baseType='OnDeleteType'"
	 * @generated
	 */
	EDataType getOnDeleteTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TypeType
	 * @model instanceClass="org.shaolin.uimaster.datamodel.rdbdiagram.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType <em>View Op Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>View Op Type Object</em>'.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType
	 * @model instanceClass="org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType"
	 *        extendedMetaData="name='ViewOpType:Object' baseType='ViewOpType'"
	 * @generated
	 */
	EDataType getViewOpTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RDBDiagramFactory getRDBDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl <em>Class Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getClassMappingType()
		 * @generated
		 */
		EClass CLASS_MAPPING_TYPE = eINSTANCE.getClassMappingType();

		/**
		 * The meta object literal for the '<em><b>Business Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MAPPING_TYPE__BUSINESS_ENTITY = eINSTANCE.getClassMappingType_BusinessEntity();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MAPPING_TYPE__TABLE = eINSTANCE.getClassMappingType_Table();

		/**
		 * The meta object literal for the '<em><b>History Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MAPPING_TYPE__HISTORY_TABLE = eINSTANCE.getClassMappingType_HistoryTable();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MAPPING_TYPE__VIEW = eINSTANCE.getClassMappingType_View();

		/**
		 * The meta object literal for the '<em><b>Parent Class Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING = eINSTANCE.getClassMappingType_ParentClassMapping();

		/**
		 * The meta object literal for the '<em><b>Field Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MAPPING_TYPE__FIELD_MAPPING = eINSTANCE.getClassMappingType_FieldMapping();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ColumnTypeImpl <em>Column Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.ColumnTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getColumnType()
		 * @generated
		 */
		EClass COLUMN_TYPE = eINSTANCE.getColumnType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_TYPE__COMMENT = eINSTANCE.getColumnType_Comment();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_TYPE__DEFAULT = eINSTANCE.getColumnType_Default();

		/**
		 * The meta object literal for the '<em><b>Is Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_TYPE__IS_NULL = eINSTANCE.getColumnType_IsNull();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_TYPE__LENGTH = eINSTANCE.getColumnType_Length();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_TYPE__NAME = eINSTANCE.getColumnType_Name();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_TYPE__PRECISION = eINSTANCE.getColumnType_Precision();

		/**
		 * The meta object literal for the '<em><b>Redundant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_TYPE__REDUNDANT = eINSTANCE.getColumnType_Redundant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_TYPE__TYPE = eINSTANCE.getColumnType_Type();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.DocumentRootImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Class Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASS_MAPPING = eINSTANCE.getDocumentRoot_ClassMapping();

		/**
		 * The meta object literal for the '<em><b>RDB Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RDB_DIAGRAM = eINSTANCE.getDocumentRoot_RDBDiagram();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl <em>Field Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getFieldMappingType()
		 * @generated
		 */
		EClass FIELD_MAPPING_TYPE = eINSTANCE.getFieldMappingType();

		/**
		 * The meta object literal for the '<em><b>Be Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_MAPPING_TYPE__BE_FIELD_NAME = eINSTANCE.getFieldMappingType_BeFieldName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_MAPPING_TYPE__COLUMN_NAME = eINSTANCE.getFieldMappingType_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Is Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_MAPPING_TYPE__IS_TIMESTAMP = eINSTANCE.getFieldMappingType_IsTimestamp();

		/**
		 * The meta object literal for the '<em><b>Redundant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_MAPPING_TYPE__REDUNDANT = eINSTANCE.getFieldMappingType_Redundant();

		/**
		 * The meta object literal for the '<em><b>Use Clob Buffer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_MAPPING_TYPE__USE_CLOB_BUFFER = eINSTANCE.getFieldMappingType_UseClobBuffer();

		/**
		 * The meta object literal for the '<em><b>Association Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_MAPPING_TYPE__ASSOCIATION_NAME = eINSTANCE.getFieldMappingType_AssociationName();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FKTypeImpl <em>FK Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.FKTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getFKType()
		 * @generated
		 */
		EClass FK_TYPE = eINSTANCE.getFKType();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FK_TYPE__COLUMN_NAME = eINSTANCE.getFKType_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Ref Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FK_TYPE__REF_TABLE = eINSTANCE.getFKType_RefTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FK_TYPE__NAME = eINSTANCE.getFKType_Name();

		/**
		 * The meta object literal for the '<em><b>On Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FK_TYPE__ON_DELETE = eINSTANCE.getFKType_OnDelete();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.IndexTypeImpl <em>Index Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.IndexTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getIndexType()
		 * @generated
		 */
		EClass INDEX_TYPE = eINSTANCE.getIndexType();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_TYPE__COLUMN = eINSTANCE.getIndexType_Column();

		/**
		 * The meta object literal for the '<em><b>Is Clustered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_TYPE__IS_CLUSTERED = eINSTANCE.getIndexType_IsClustered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_TYPE__IS_UNIQUE = eINSTANCE.getIndexType_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_TYPE__NAME = eINSTANCE.getIndexType_Name();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.InheritAssociationTypeImpl <em>Inherit Association Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.InheritAssociationTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getInheritAssociationType()
		 * @generated
		 */
		EClass INHERIT_ASSOCIATION_TYPE = eINSTANCE.getInheritAssociationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERIT_ASSOCIATION_TYPE__NAME = eINSTANCE.getInheritAssociationType_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERIT_ASSOCIATION_TYPE__PARENT_TABLE = eINSTANCE.getInheritAssociationType_ParentTable();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.JoinTableTypeImpl <em>Join Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.JoinTableTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getJoinTableType()
		 * @generated
		 */
		EClass JOIN_TABLE_TYPE = eINSTANCE.getJoinTableType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TABLE_TYPE__NAME = eINSTANCE.getJoinTableType_Name();

		/**
		 * The meta object literal for the '<em><b>Src PK Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TABLE_TYPE__SRC_PK_COLUMN = eINSTANCE.getJoinTableType_SrcPKColumn();

		/**
		 * The meta object literal for the '<em><b>Src Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TABLE_TYPE__SRC_TABLE = eINSTANCE.getJoinTableType_SrcTable();

		/**
		 * The meta object literal for the '<em><b>Tar Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TABLE_TYPE__TAR_TABLE = eINSTANCE.getJoinTableType_TarTable();

		/**
		 * The meta object literal for the '<em><b>Tar PK Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TABLE_TYPE__TAR_PK_COLUMN = eINSTANCE.getJoinTableType_TarPKColumn();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ListFieldMappingTypeImpl <em>List Field Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.ListFieldMappingTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getListFieldMappingType()
		 * @generated
		 */
		EClass LIST_FIELD_MAPPING_TYPE = eINSTANCE.getListFieldMappingType();

		/**
		 * The meta object literal for the '<em><b>Collection Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE = eINSTANCE.getListFieldMappingType_CollectionTable();

		/**
		 * The meta object literal for the '<em><b>Is Private Owned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FIELD_MAPPING_TYPE__IS_PRIVATE_OWNED = eINSTANCE.getListFieldMappingType_IsPrivateOwned();

		/**
		 * The meta object literal for the '<em><b>Mapping Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FIELD_MAPPING_TYPE__MAPPING_TYPE = eINSTANCE.getListFieldMappingType_MappingType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.PKTypeImpl <em>PK Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.PKTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getPKType()
		 * @generated
		 */
		EClass PK_TYPE = eINSTANCE.getPKType();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PK_TYPE__COLUMN_NAME = eINSTANCE.getPKType_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PK_TYPE__SEQUENCE_NAME = eINSTANCE.getPKType_SequenceName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PK_TYPE__NAME = eINSTANCE.getPKType_Name();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getRDBDiagramType()
		 * @generated
		 */
		EClass RDB_DIAGRAM_TYPE = eINSTANCE.getRDBDiagramType();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDB_DIAGRAM_TYPE__TABLE = eINSTANCE.getRDBDiagramType_Table();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDB_DIAGRAM_TYPE__VIEW = eINSTANCE.getRDBDiagramType_View();

		/**
		 * The meta object literal for the '<em><b>Join Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDB_DIAGRAM_TYPE__JOIN_TABLE = eINSTANCE.getRDBDiagramType_JoinTable();

		/**
		 * The meta object literal for the '<em><b>Dao Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDB_DIAGRAM_TYPE__DAO_PACKAGE = eINSTANCE.getRDBDiagramType_DaoPackage();

		/**
		 * The meta object literal for the '<em><b>Diagram Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE = eINSTANCE.getRDBDiagramType_DiagramPackage();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBTypeImpl <em>RDB Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getRDBType()
		 * @generated
		 */
		EClass RDB_TYPE = eINSTANCE.getRDBType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDB_TYPE__COMMENT = eINSTANCE.getRDBType_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDB_TYPE__NAME = eINSTANCE.getRDBType_Name();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.SequenceTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '<em><b>Dbcache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_TYPE__DBCACHE = eINSTANCE.getSequenceType_Dbcache();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_TYPE__NAME = eINSTANCE.getSequenceType_Name();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_TYPE__SPAN = eINSTANCE.getSequenceType_Span();

		/**
		 * The meta object literal for the '<em><b>Start With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_TYPE__START_WITH = eINSTANCE.getSequenceType_StartWith();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl <em>Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getTableType()
		 * @generated
		 */
		EClass TABLE_TYPE = eINSTANCE.getTableType();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__COLUMN = eINSTANCE.getTableType_Column();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__INDEX = eINSTANCE.getTableType_Index();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__SEQUENCE = eINSTANCE.getTableType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__PRIMARY_KEY = eINSTANCE.getTableType_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__FOREIGN_KEY = eINSTANCE.getTableType_ForeignKey();

		/**
		 * The meta object literal for the '<em><b>Inherit Asscociation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__INHERIT_ASSCOCIATION = eINSTANCE.getTableType_InheritAsscociation();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__MAPPING = eINSTANCE.getTableType_Mapping();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ViewTypeImpl <em>View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.ViewTypeImpl
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getViewType()
		 * @generated
		 */
		EClass VIEW_TYPE = eINSTANCE.getViewType();

		/**
		 * The meta object literal for the '<em><b>Base Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_TYPE__BASE_TABLE = eINSTANCE.getViewType_BaseTable();

		/**
		 * The meta object literal for the '<em><b>Ext Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_TYPE__EXT_TABLE = eINSTANCE.getViewType_ExtTable();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__OP = eINSTANCE.getViewType_Op();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType <em>Mapping Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getMappingTypeType()
		 * @generated
		 */
		EEnum MAPPING_TYPE_TYPE = eINSTANCE.getMappingTypeType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType <em>On Delete Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getOnDeleteType()
		 * @generated
		 */
		EEnum ON_DELETE_TYPE = eINSTANCE.getOnDeleteType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TypeType
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType <em>View Op Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getViewOpType()
		 * @generated
		 */
		EEnum VIEW_OP_TYPE = eINSTANCE.getViewOpType();

		/**
		 * The meta object literal for the '<em>Mapping Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getMappingTypeTypeObject()
		 * @generated
		 */
		EDataType MAPPING_TYPE_TYPE_OBJECT = eINSTANCE.getMappingTypeTypeObject();

		/**
		 * The meta object literal for the '<em>On Delete Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getOnDeleteTypeObject()
		 * @generated
		 */
		EDataType ON_DELETE_TYPE_OBJECT = eINSTANCE.getOnDeleteTypeObject();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TypeType
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

		/**
		 * The meta object literal for the '<em>View Op Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType
		 * @see org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramPackageImpl#getViewOpTypeObject()
		 * @generated
		 */
		EDataType VIEW_OP_TYPE_OBJECT = eINSTANCE.getViewOpTypeObject();

	}

} //RDBDiagramPackage
