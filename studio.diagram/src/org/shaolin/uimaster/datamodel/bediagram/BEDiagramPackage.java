/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

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
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface BEDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bediagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bmdp.shaolin.org/datamodel/BEDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bediagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BEDiagramPackage eINSTANCE = org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BETypeImpl <em>BE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BETypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEType()
	 * @generated
	 */
	int BE_TYPE = 8;

	/**
	 * The number of structural features of the '<em>BE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEComplexTypeImpl <em>BE Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEComplexTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEComplexType()
	 * @generated
	 */
	int BE_COMPLEX_TYPE = 1;

	/**
	 * The number of structural features of the '<em>BE Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_COMPLEX_TYPE_FEATURE_COUNT = BE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BECollectionTypeImpl <em>BE Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BECollectionTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBECollectionType()
	 * @generated
	 */
	int BE_COLLECTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_COLLECTION_TYPE__ELEMENT_TYPE = BE_COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BE Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_COLLECTION_TYPE_FEATURE_COUNT = BE_COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEDiagramType()
	 * @generated
	 */
	int BE_DIAGRAM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Be Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_DIAGRAM_TYPE__BE_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Ce Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_DIAGRAM_TYPE__CE_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Be Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_DIAGRAM_TYPE__BE_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Ce Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_DIAGRAM_TYPE__CE_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Diagram Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_DIAGRAM_TYPE__DIAGRAM_PACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_DIAGRAM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEListTypeImpl <em>BE List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEListTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEListType()
	 * @generated
	 */
	int BE_LIST_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_LIST_TYPE__ELEMENT_TYPE = BE_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>BE List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_LIST_TYPE_FEATURE_COUNT = BE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEMapTypeImpl <em>BE Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEMapTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEMapType()
	 * @generated
	 */
	int BE_MAP_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MAP_TYPE__ELEMENT_TYPE = BE_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MAP_TYPE__KEY_TYPE = BE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BE Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MAP_TYPE_FEATURE_COUNT = BE_COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ObjectRefTypeImpl <em>Object Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ObjectRefTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getObjectRefType()
	 * @generated
	 */
	int OBJECT_REF_TYPE = 28;

	/**
	 * The number of structural features of the '<em>Object Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE_FEATURE_COUNT = BE_COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEObjRefTypeImpl <em>BE Obj Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEObjRefTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEObjRefType()
	 * @generated
	 */
	int BE_OBJ_REF_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_OBJ_REF_TYPE__TARGET_ENTITY = OBJECT_REF_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Version Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_OBJ_REF_TYPE__AUTO_VERSION_UPDATE = OBJECT_REF_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BE Obj Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_OBJ_REF_TYPE_FEATURE_COUNT = OBJECT_REF_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEPrimitiveTypeImpl <em>BE Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEPrimitiveTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEPrimitiveType()
	 * @generated
	 */
	int BE_PRIMITIVE_TYPE = 6;

	/**
	 * The number of structural features of the '<em>BE Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_PRIMITIVE_TYPE_FEATURE_COUNT = BE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BESetTypeImpl <em>BE Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BESetTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBESetType()
	 * @generated
	 */
	int BE_SET_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_SET_TYPE__ELEMENT_TYPE = BE_COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>BE Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_SET_TYPE_FEATURE_COUNT = BE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BinaryTypeImpl <em>Binary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BinaryTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 9;

	/**
	 * The number of structural features of the '<em>Binary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE_FEATURE_COUNT = BE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BooleanTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 10;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = BE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl <em>Business Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBusinessEntityType()
	 * @generated
	 */
	int BUSINESS_ENTITY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__ENTITY_NAME = CommonPackage.ENTITY_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__SYSTEM_VERSION = CommonPackage.ENTITY_TYPE__SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__REVISION = CommonPackage.ENTITY_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__DISPLAY_NAME = CommonPackage.ENTITY_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__DESCRIPTION = CommonPackage.ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__AUTHOR = CommonPackage.ENTITY_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__REGION = CommonPackage.ENTITY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__CATEGORY = CommonPackage.ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Entity Meta Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__ENTITY_META_INFO = CommonPackage.ENTITY_TYPE__ENTITY_META_INFO;

	/**
	 * The feature id for the '<em><b>Extension Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__EXTENSION_PROPERTY = CommonPackage.ENTITY_TYPE__EXTENSION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Parent Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__PARENT_OBJECT = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__MEMBER = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persistent Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Validator Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Search Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__SEARCH_METHOD = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__ABBREVIATION = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extensible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__EXTENSIBLE = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Need Equals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__NEED_EQUALS = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Need History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE__NEED_HISTORY = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	int BUSINESS_ENTITY_TYPE__PARENT = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 9;
	
	/**
	 * The number of structural features of the '<em>Business Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_TYPE_FEATURE_COUNT = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.CEObjRefTypeImpl <em>CE Obj Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.CEObjRefTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getCEObjRefType()
	 * @generated
	 */
	int CE_OBJ_REF_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_OBJ_REF_TYPE__TARGET_ENTITY = BE_COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CE Obj Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_OBJ_REF_TYPE_FEATURE_COUNT = BE_COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantEntityTypeImpl <em>Constant Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ConstantEntityTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getConstantEntityType()
	 * @generated
	 */
	int CONSTANT_ENTITY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__ENTITY_NAME = CommonPackage.ENTITY_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__SYSTEM_VERSION = CommonPackage.ENTITY_TYPE__SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__REVISION = CommonPackage.ENTITY_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__DISPLAY_NAME = CommonPackage.ENTITY_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__DESCRIPTION = CommonPackage.ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__AUTHOR = CommonPackage.ENTITY_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__REGION = CommonPackage.ENTITY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__CATEGORY = CommonPackage.ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Entity Meta Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__ENTITY_META_INFO = CommonPackage.ENTITY_TYPE__ENTITY_META_INFO;

	/**
	 * The feature id for the '<em><b>Extension Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__EXTENSION_PROPERTY = CommonPackage.ENTITY_TYPE__EXTENSION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Eff Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__EFF_TIME = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__EXP_TIME = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constant Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE__CONSTANT_VALUE = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constant Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ENTITY_TYPE_FEATURE_COUNT = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl <em>Constant Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getConstantValueType()
	 * @generated
	 */
	int CONSTANT_VALUE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_TYPE__I18N_KEY = 1;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_TYPE__INT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Eff Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_TYPE__EFF_TIME = 4;

	/**
	 * The feature id for the '<em><b>Exp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_TYPE__EXP_TIME = 5;

	/**
	 * The feature id for the '<em><b>Passivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_TYPE__PASSIVATED = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_TYPE__PRIORITY = 7;

	/**
	 * The number of structural features of the '<em>Constant Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.DateTimeTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 15;

	/**
	 * The number of structural features of the '<em>Date Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE_FEATURE_COUNT = BE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 16;

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
	 * The feature id for the '<em><b>BE Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BE_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Business Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Constant Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONSTANT_ENTITY = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;


	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.DoubleTypeImpl <em>Double Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.DoubleTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getDoubleType()
	 * @generated
	 */
	int DOUBLE_TYPE = 17;

	/**
	 * The number of structural features of the '<em>Double Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE_FEATURE_COUNT = BE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.DummyFieldTypeImpl <em>Dummy Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.DummyFieldTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getDummyFieldType()
	 * @generated
	 */
	int DUMMY_FIELD_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_FIELD_TYPE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Ref Dummy Field Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_FIELD_TYPE__REF_DUMMY_FIELD_NAME = 1;

	/**
	 * The feature id for the '<em><b>Dummy Field Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_FIELD_TYPE__DUMMY_FIELD_NAME = 2;

	/**
	 * The number of structural features of the '<em>Dummy Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_FIELD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityNameWebServiceMappingTypeImpl <em>Entity Name Web Service Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.EntityNameWebServiceMappingTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getEntityNameWebServiceMappingType()
	 * @generated
	 */
	int ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE__NAMESPACE_URI = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Name Web Service Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE_FEATURE_COUNT = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl <em>Entity Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getEntityRelationType()
	 * @generated
	 */
	int ENTITY_RELATION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_TYPE__ENTITY = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_TYPE__ENTITY2 = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_TYPE__NAME = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_TYPE__PRIORITY = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_TYPE__REFED_NAME = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refed Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_TYPE__REFED_PRIORITY = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_TYPE__TYPE = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Entity Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_TYPE_FEATURE_COUNT = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ExternalReferenceTypeImpl <em>External Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ExternalReferenceTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getExternalReferenceType()
	 * @generated
	 */
	int EXTERNAL_REFERENCE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>External Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.FileTypeImpl <em>File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.FileTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 22;

	/**
	 * The number of structural features of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_FEATURE_COUNT = BE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.IntTypeImpl <em>Int Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.IntTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getIntType()
	 * @generated
	 */
	int INT_TYPE = 23;

	/**
	 * The number of structural features of the '<em>Int Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE_FEATURE_COUNT = BE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.JavaObjRefTypeImpl <em>Java Obj Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.JavaObjRefTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getJavaObjRefType()
	 * @generated
	 */
	int JAVA_OBJ_REF_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Target Java</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OBJ_REF_TYPE__TARGET_JAVA = OBJECT_REF_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Obj Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OBJ_REF_TYPE_FEATURE_COUNT = OBJECT_REF_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.LongTypeImpl <em>Long Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.LongTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getLongType()
	 * @generated
	 */
	int LONG_TYPE = 25;

	/**
	 * The number of structural features of the '<em>Long Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_TYPE_FEATURE_COUNT = BE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl <em>Member Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getMemberType()
	 * @generated
	 */
	int MEMBER_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Meta Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__META_INFO = 4;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__ACCESSIBLE = 5;

	/**
	 * The feature id for the '<em><b>Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__MODIFIABLE = 6;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__TRANSIENT = 7;

	/**
	 * BE customized internal type.
	 * e number of structural features of the '<em>Member Type.Type.refentity</em>' class.
	 */
	int MEMBER_TYPE_REF_ENTITY_NAME = 8;
	
	int MEMBER_TYPE_MAP_KEY_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberWebServiceMappingTypeImpl <em>Member Web Service Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.MemberWebServiceMappingTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getMemberWebServiceMappingType()
	 * @generated
	 */
	int MEMBER_WEB_SERVICE_MAPPING_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Collection Wrapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Member Web Service Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_WEB_SERVICE_MAPPING_TYPE_FEATURE_COUNT = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.PersistentConfigTypeImpl <em>Persistent Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.PersistentConfigTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getPersistentConfigType()
	 * @generated
	 */
	int PERSISTENT_CONFIG_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Supported Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_CONFIG_TYPE__SUPPORTED_PERSISTENCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Primary Key Member</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_CONFIG_TYPE__PRIMARY_KEY_MEMBER = 1;

	/**
	 * The number of structural features of the '<em>Persistent Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_CONFIG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl <em>Reference Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getReferenceObjectType()
	 * @generated
	 */
	int REFERENCE_OBJECT_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT_TYPE__REF_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Ref Field Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT_TYPE__REF_FIELD_NAME = 1;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT_TYPE__FIELD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Time Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT_TYPE__TIME_FIELD_NAME = 3;

	/**
	 * The feature id for the '<em><b>Must Have</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT_TYPE__MUST_HAVE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT_TYPE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Reference Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationConstraintTypeImpl <em>Relation Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.RelationConstraintTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getRelationConstraintType()
	 * @generated
	 */
	int RELATION_CONSTRAINT_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT_TYPE__VALUE = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Entity2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT_TYPE__IS_ENTITY2 = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT_TYPE__RELATION_NAME = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT_TYPE_FEATURE_COUNT = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationKeyTypeImpl <em>Relation Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.RelationKeyTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getRelationKeyType()
	 * @generated
	 */
	int RELATION_KEY_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_KEY_TYPE__FIELD_NAME = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Entity2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_KEY_TYPE__IS_ENTITY2 = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_KEY_TYPE__RELATION_NAME = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_KEY_TYPE_FEATURE_COUNT = CommonPackage.META_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.SearchMethodTypeImpl <em>Search Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.SearchMethodTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getSearchMethodType()
	 * @generated
	 */
	int SEARCH_METHOD_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_METHOD_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_METHOD_TYPE__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Condition Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_METHOD_TYPE__CONDITION_MAPPING_NAME = 2;

	/**
	 * The number of structural features of the '<em>Search Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.StringTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 34;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = BE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.TimeTypeImpl <em>Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.TimeTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 35;

	/**
	 * The number of structural features of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE_FEATURE_COUNT = BE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ValidatorConfigTypeImpl <em>Validator Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ValidatorConfigTypeImpl
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getValidatorConfigType()
	 * @generated
	 */
	int VALIDATOR_CONFIG_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Dummy Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_CONFIG_TYPE__DUMMY_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Reference Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_CONFIG_TYPE__REFERENCE_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>External Reference Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_CONFIG_TYPE__EXTERNAL_REFERENCE_CONFIG = 2;

	/**
	 * The number of structural features of the '<em>Validator Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_CONFIG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType <em>Persistence Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getPersistenceTypeType()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationTypeType <em>Relation Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationTypeType
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getRelationTypeType()
	 * @generated
	 */
	int RELATION_TYPE_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.bediagram.StyleType <em>Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.StyleType
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getStyleType()
	 * @generated
	 */
	int STYLE_TYPE = 39;

	/**
	 * The meta object id for the '<em>Persistence Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getPersistenceTypeTypeObject()
	 * @generated
	 */
	int PERSISTENCE_TYPE_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Relation Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationTypeType
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getRelationTypeTypeObject()
	 * @generated
	 */
	int RELATION_TYPE_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Style Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.bediagram.StyleType
	 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getStyleTypeObject()
	 * @generated
	 */
	int STYLE_TYPE_OBJECT = 42;


	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BECollectionType <em>BE Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BE Collection Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BECollectionType
	 * @generated
	 */
	EClass getBECollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.BECollectionType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BECollectionType#getElementType()
	 * @see #getBECollectionType()
	 * @generated
	 */
	EReference getBECollectionType_ElementType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BEComplexType <em>BE Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BE Complex Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEComplexType
	 * @generated
	 */
	EClass getBEComplexType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramType
	 * @generated
	 */
	EClass getBEDiagramType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getBeEntity <em>Be Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Be Entity</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getBeEntity()
	 * @see #getBEDiagramType()
	 * @generated
	 */
	EReference getBEDiagramType_BeEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getCeEntity <em>Ce Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ce Entity</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getCeEntity()
	 * @see #getBEDiagramType()
	 * @generated
	 */
	EReference getBEDiagramType_CeEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getDiagramPackage <em>Diagram Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram Package</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getDiagramPackage()
	 * @see #getBEDiagramType()
	 * @generated
	 */
	EAttribute getBEDiagramType_DiagramPackage();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BEListType <em>BE List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BE List Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEListType
	 * @generated
	 */
	EClass getBEListType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BEMapType <em>BE Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BE Map Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEMapType
	 * @generated
	 */
	EClass getBEMapType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.BEMapType#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEMapType#getKeyType()
	 * @see #getBEMapType()
	 * @generated
	 */
	EReference getBEMapType_KeyType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType <em>BE Obj Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BE Obj Ref Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEObjRefType
	 * @generated
	 */
	EClass getBEObjRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Entity</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#getTargetEntity()
	 * @see #getBEObjRefType()
	 * @generated
	 */
	EReference getBEObjRefType_TargetEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#isAutoVersionUpdate <em>Auto Version Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Version Update</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEObjRefType#isAutoVersionUpdate()
	 * @see #getBEObjRefType()
	 * @generated
	 */
	EAttribute getBEObjRefType_AutoVersionUpdate();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BEPrimitiveType <em>BE Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BE Primitive Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEPrimitiveType
	 * @generated
	 */
	EClass getBEPrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BESetType <em>BE Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BE Set Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BESetType
	 * @generated
	 */
	EClass getBESetType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BEType <em>BE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BE Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEType
	 * @generated
	 */
	EClass getBEType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BinaryType
	 * @generated
	 */
	EClass getBinaryType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType <em>Business Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Entity Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType
	 * @generated
	 */
	EClass getBusinessEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getParentObject <em>Parent Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Object</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getParentObject()
	 * @see #getBusinessEntityType()
	 * @generated
	 */
	EReference getBusinessEntityType_ParentObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getMember()
	 * @see #getBusinessEntityType()
	 * @generated
	 */
	EReference getBusinessEntityType_Member();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getPersistentConfig <em>Persistent Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistent Config</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getPersistentConfig()
	 * @see #getBusinessEntityType()
	 * @generated
	 */
	EReference getBusinessEntityType_PersistentConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getValidatorConfig <em>Validator Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validator Config</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getValidatorConfig()
	 * @see #getBusinessEntityType()
	 * @generated
	 */
	EReference getBusinessEntityType_ValidatorConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getSearchMethod <em>Search Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Search Method</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getSearchMethod()
	 * @see #getBusinessEntityType()
	 * @generated
	 */
	EReference getBusinessEntityType_SearchMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getAbbreviation()
	 * @see #getBusinessEntityType()
	 * @generated
	 */
	EAttribute getBusinessEntityType_Abbreviation();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isExtensible <em>Extensible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extensible</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isExtensible()
	 * @see #getBusinessEntityType()
	 * @generated
	 */
	EAttribute getBusinessEntityType_Extensible();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedEquals <em>Need Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Equals</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedEquals()
	 * @see #getBusinessEntityType()
	 * @generated
	 */
	EAttribute getBusinessEntityType_NeedEquals();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedHistory <em>Need History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need History</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedHistory()
	 * @see #getBusinessEntityType()
	 * @generated
	 */
	EAttribute getBusinessEntityType_NeedHistory();

	EAttribute getBusinessEntityType_Parent();
	
	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.CEObjRefType <em>CE Obj Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CE Obj Ref Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.CEObjRefType
	 * @generated
	 */
	EClass getCEObjRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.CEObjRefType#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Entity</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.CEObjRefType#getTargetEntity()
	 * @see #getCEObjRefType()
	 * @generated
	 */
	EReference getCEObjRefType_TargetEntity();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType <em>Constant Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Entity Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType
	 * @generated
	 */
	EClass getConstantEntityType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getEffTime <em>Eff Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eff Time</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getEffTime()
	 * @see #getConstantEntityType()
	 * @generated
	 */
	EAttribute getConstantEntityType_EffTime();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getExpTime <em>Exp Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Time</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getExpTime()
	 * @see #getConstantEntityType()
	 * @generated
	 */
	EAttribute getConstantEntityType_ExpTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constant Value</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType#getConstantValue()
	 * @see #getConstantEntityType()
	 * @generated
	 */
	EReference getConstantEntityType_ConstantValue();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType <em>Constant Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Value Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType
	 * @generated
	 */
	EClass getConstantValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getValue()
	 * @see #getConstantValueType()
	 * @generated
	 */
	EAttribute getConstantValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getI18nKey <em>I1 8n Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I1 8n Key</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getI18nKey()
	 * @see #getConstantValueType()
	 * @generated
	 */
	EAttribute getConstantValueType_I18nKey();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getIntValue()
	 * @see #getConstantValueType()
	 * @generated
	 */
	EAttribute getConstantValueType_IntValue();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getDescription()
	 * @see #getConstantValueType()
	 * @generated
	 */
	EAttribute getConstantValueType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getEffTime <em>Eff Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eff Time</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getEffTime()
	 * @see #getConstantValueType()
	 * @generated
	 */
	EAttribute getConstantValueType_EffTime();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getExpTime <em>Exp Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Time</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getExpTime()
	 * @see #getConstantValueType()
	 * @generated
	 */
	EAttribute getConstantValueType_ExpTime();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#isPassivated <em>Passivated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passivated</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#isPassivated()
	 * @see #getConstantValueType()
	 * @generated
	 */
	EAttribute getConstantValueType_Passivated();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType#getPriority()
	 * @see #getConstantValueType()
	 * @generated
	 */
	EAttribute getConstantValueType_Priority();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DateTimeType
	 * @generated
	 */
	EClass getDateTimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getBePackage <em>Be Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Be Package</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getBePackage()
	 * @see #getBEDiagramType()
	 * @generated
	 */
	EAttribute getBEDiagramType_BePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getCePackage <em>Ce Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ce Package</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramType#getCePackage()
	 * @see #getBEDiagramType()
	 * @generated
	 */
	EAttribute getBEDiagramType_CePackage();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getBEDiagram <em>BE Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BE Diagram</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getBEDiagram()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BEDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getBusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Entity</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getBusinessEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BusinessEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getConstantEntity <em>Constant Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant Entity</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DocumentRoot#getConstantEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConstantEntity();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.DoubleType <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DoubleType
	 * @generated
	 */
	EClass getDoubleType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType <em>Dummy Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Field Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DummyFieldType
	 * @generated
	 */
	EClass getDummyFieldType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getReference()
	 * @see #getDummyFieldType()
	 * @generated
	 */
	EReference getDummyFieldType_Reference();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getRefDummyFieldName <em>Ref Dummy Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ref Dummy Field Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getRefDummyFieldName()
	 * @see #getDummyFieldType()
	 * @generated
	 */
	EAttribute getDummyFieldType_RefDummyFieldName();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getDummyFieldName <em>Dummy Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dummy Field Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DummyFieldType#getDummyFieldName()
	 * @see #getDummyFieldType()
	 * @generated
	 */
	EAttribute getDummyFieldType_DummyFieldName();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType <em>Entity Name Web Service Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Name Web Service Mapping Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType
	 * @generated
	 */
	EClass getEntityNameWebServiceMappingType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType#getMappedName()
	 * @see #getEntityNameWebServiceMappingType()
	 * @generated
	 */
	EAttribute getEntityNameWebServiceMappingType_MappedName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType#getNamespaceURI <em>Namespace URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace URI</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType#getNamespaceURI()
	 * @see #getEntityNameWebServiceMappingType()
	 * @generated
	 */
	EAttribute getEntityNameWebServiceMappingType_NamespaceURI();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType <em>Entity Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Relation Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityRelationType
	 * @generated
	 */
	EClass getEntityRelationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getEntity()
	 * @see #getEntityRelationType()
	 * @generated
	 */
	EReference getEntityRelationType_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getEntity2 <em>Entity2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity2</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getEntity2()
	 * @see #getEntityRelationType()
	 * @generated
	 */
	EReference getEntityRelationType_Entity2();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getName()
	 * @see #getEntityRelationType()
	 * @generated
	 */
	EAttribute getEntityRelationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getPriority()
	 * @see #getEntityRelationType()
	 * @generated
	 */
	EAttribute getEntityRelationType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedName <em>Refed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refed Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedName()
	 * @see #getEntityRelationType()
	 * @generated
	 */
	EAttribute getEntityRelationType_RefedName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedPriority <em>Refed Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refed Priority</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedPriority()
	 * @see #getEntityRelationType()
	 * @generated
	 */
	EAttribute getEntityRelationType_RefedPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getType()
	 * @see #getEntityRelationType()
	 * @generated
	 */
	EAttribute getEntityRelationType_Type();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType <em>External Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType
	 * @generated
	 */
	EClass getExternalReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType#getExpression()
	 * @see #getExternalReferenceType()
	 * @generated
	 */
	EAttribute getExternalReferenceType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType#getName()
	 * @see #getExternalReferenceType()
	 * @generated
	 */
	EAttribute getExternalReferenceType_Name();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.FileType
	 * @generated
	 */
	EClass getFileType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.IntType <em>Int Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.IntType
	 * @generated
	 */
	EClass getIntType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType <em>Java Obj Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Obj Ref Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType
	 * @generated
	 */
	EClass getJavaObjRefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType#getTargetJava <em>Target Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Java</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType#getTargetJava()
	 * @see #getJavaObjRefType()
	 * @generated
	 */
	EReference getJavaObjRefType_TargetJava();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.LongType <em>Long Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.LongType
	 * @generated
	 */
	EClass getLongType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType
	 * @generated
	 */
	EClass getMemberType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType#getName()
	 * @see #getMemberType()
	 * @generated
	 */
	EAttribute getMemberType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType#getDescription()
	 * @see #getMemberType()
	 * @generated
	 */
	EAttribute getMemberType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType#getDefaultValue()
	 * @see #getMemberType()
	 * @generated
	 */
	EAttribute getMemberType_DefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType#getType()
	 * @see #getMemberType()
	 * @generated
	 */
	EReference getMemberType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getMetaInfo <em>Meta Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Info</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType#getMetaInfo()
	 * @see #getMemberType()
	 * @generated
	 */
	EReference getMemberType_MetaInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isAccessible <em>Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessible</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType#isAccessible()
	 * @see #getMemberType()
	 * @generated
	 */
	EAttribute getMemberType_Accessible();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isModifiable <em>Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifiable</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType#isModifiable()
	 * @see #getMemberType()
	 * @generated
	 */
	EAttribute getMemberType_Modifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType#isTransient()
	 * @see #getMemberType()
	 * @generated
	 */
	EAttribute getMemberType_Transient();

	EAttribute getMemberType_CollectionRefEntityName();
	
	EAttribute getMemberType_MapKeyType();
	
	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType <em>Member Web Service Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Web Service Mapping Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType
	 * @generated
	 */
	EClass getMemberWebServiceMappingType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isCollectionWrapped <em>Collection Wrapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Wrapped</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isCollectionWrapped()
	 * @see #getMemberWebServiceMappingType()
	 * @generated
	 */
	EAttribute getMemberWebServiceMappingType_CollectionWrapped();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isIgnore()
	 * @see #getMemberWebServiceMappingType()
	 * @generated
	 */
	EAttribute getMemberWebServiceMappingType_Ignore();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getMappedName()
	 * @see #getMemberWebServiceMappingType()
	 * @generated
	 */
	EAttribute getMemberWebServiceMappingType_MappedName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getStyle()
	 * @see #getMemberWebServiceMappingType()
	 * @generated
	 */
	EAttribute getMemberWebServiceMappingType_Style();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.ObjectRefType <em>Object Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ObjectRefType
	 * @generated
	 */
	EClass getObjectRefType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType <em>Persistent Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistent Config Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType
	 * @generated
	 */
	EClass getPersistentConfigType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType#getSupportedPersistenceType <em>Supported Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported Persistence Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType#getSupportedPersistenceType()
	 * @see #getPersistentConfigType()
	 * @generated
	 */
	EAttribute getPersistentConfigType_SupportedPersistenceType();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType#getPrimaryKeyMember <em>Primary Key Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Primary Key Member</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType#getPrimaryKeyMember()
	 * @see #getPersistentConfigType()
	 * @generated
	 */
	EAttribute getPersistentConfigType_PrimaryKeyMember();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType <em>Reference Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Object Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType
	 * @generated
	 */
	EClass getReferenceObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getRefType()
	 * @see #getReferenceObjectType()
	 * @generated
	 */
	EReference getReferenceObjectType_RefType();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getRefFieldName <em>Ref Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ref Field Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getRefFieldName()
	 * @see #getReferenceObjectType()
	 * @generated
	 */
	EAttribute getReferenceObjectType_RefFieldName();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Field Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getFieldName()
	 * @see #getReferenceObjectType()
	 * @generated
	 */
	EAttribute getReferenceObjectType_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getTimeFieldName <em>Time Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Field Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getTimeFieldName()
	 * @see #getReferenceObjectType()
	 * @generated
	 */
	EAttribute getReferenceObjectType_TimeFieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#isMustHave <em>Must Have</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Have</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#isMustHave()
	 * @see #getReferenceObjectType()
	 * @generated
	 */
	EAttribute getReferenceObjectType_MustHave();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType#getName()
	 * @see #getReferenceObjectType()
	 * @generated
	 */
	EAttribute getReferenceObjectType_Name();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType <em>Relation Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Constraint Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType
	 * @generated
	 */
	EClass getRelationConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#getValue()
	 * @see #getRelationConstraintType()
	 * @generated
	 */
	EReference getRelationConstraintType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#isIsEntity2 <em>Is Entity2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entity2</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#isIsEntity2()
	 * @see #getRelationConstraintType()
	 * @generated
	 */
	EAttribute getRelationConstraintType_IsEntity2();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#getRelationName <em>Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType#getRelationName()
	 * @see #getRelationConstraintType()
	 * @generated
	 */
	EAttribute getRelationConstraintType_RelationName();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType <em>Relation Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Key Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationKeyType
	 * @generated
	 */
	EClass getRelationKeyType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#getFieldName()
	 * @see #getRelationKeyType()
	 * @generated
	 */
	EAttribute getRelationKeyType_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#isIsEntity2 <em>Is Entity2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entity2</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#isIsEntity2()
	 * @see #getRelationKeyType()
	 * @generated
	 */
	EAttribute getRelationKeyType_IsEntity2();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#getRelationName <em>Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#getRelationName()
	 * @see #getRelationKeyType()
	 * @generated
	 */
	EAttribute getRelationKeyType_RelationName();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType <em>Search Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Method Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.SearchMethodType
	 * @generated
	 */
	EClass getSearchMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getName()
	 * @see #getSearchMethodType()
	 * @generated
	 */
	EAttribute getSearchMethodType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getQuery()
	 * @see #getSearchMethodType()
	 * @generated
	 */
	EReference getSearchMethodType_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getConditionMappingName <em>Condition Mapping Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Mapping Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getConditionMappingName()
	 * @see #getSearchMethodType()
	 * @generated
	 */
	EAttribute getSearchMethodType_ConditionMappingName();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.TimeType
	 * @generated
	 */
	EClass getTimeType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType <em>Validator Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validator Config Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType
	 * @generated
	 */
	EClass getValidatorConfigType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType#getDummyField <em>Dummy Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dummy Field</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType#getDummyField()
	 * @see #getValidatorConfigType()
	 * @generated
	 */
	EReference getValidatorConfigType_DummyField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType#getReferenceConfig <em>Reference Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Config</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType#getReferenceConfig()
	 * @see #getValidatorConfigType()
	 * @generated
	 */
	EReference getValidatorConfigType_ReferenceConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType#getExternalReferenceConfig <em>External Reference Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Reference Config</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType#getExternalReferenceConfig()
	 * @see #getValidatorConfigType()
	 * @generated
	 */
	EReference getValidatorConfigType_ExternalReferenceConfig();

	/**
	 * Returns the meta object for enum '{@link org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType <em>Persistence Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Type Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType
	 * @generated
	 */
	EEnum getPersistenceTypeType();

	/**
	 * Returns the meta object for enum '{@link org.shaolin.uimaster.datamodel.bediagram.RelationTypeType <em>Relation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationTypeType
	 * @generated
	 */
	EEnum getRelationTypeType();

	/**
	 * Returns the meta object for enum '{@link org.shaolin.uimaster.datamodel.bediagram.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.StyleType
	 * @generated
	 */
	EEnum getStyleType();

	/**
	 * Returns the meta object for data type '{@link org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType <em>Persistence Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Persistence Type Type Object</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType
	 * @model instanceClass="org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType"
	 *        extendedMetaData="name='PersistenceTypeType:Object' baseType='PersistenceTypeType'"
	 * @generated
	 */
	EDataType getPersistenceTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.shaolin.uimaster.datamodel.bediagram.RelationTypeType <em>Relation Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relation Type Type Object</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationTypeType
	 * @model instanceClass="org.shaolin.uimaster.datamodel.bediagram.RelationTypeType"
	 *        extendedMetaData="name='RelationTypeType:Object' baseType='RelationTypeType'"
	 * @generated
	 */
	EDataType getRelationTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.shaolin.uimaster.datamodel.bediagram.StyleType <em>Style Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Type Object</em>'.
	 * @see org.shaolin.uimaster.datamodel.bediagram.StyleType
	 * @model instanceClass="org.shaolin.uimaster.datamodel.bediagram.StyleType"
	 *        extendedMetaData="name='style_._type:Object' baseType='style_._type'"
	 * @generated
	 */
	EDataType getStyleTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BEDiagramFactory getBEDiagramFactory();

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
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BECollectionTypeImpl <em>BE Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BECollectionTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBECollectionType()
		 * @generated
		 */
		EClass BE_COLLECTION_TYPE = eINSTANCE.getBECollectionType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_COLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE.getBECollectionType_ElementType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEComplexTypeImpl <em>BE Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEComplexTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEComplexType()
		 * @generated
		 */
		EClass BE_COMPLEX_TYPE = eINSTANCE.getBEComplexType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEDiagramType()
		 * @generated
		 */
		EClass BE_DIAGRAM_TYPE = eINSTANCE.getBEDiagramType();

		/**
		 * The meta object literal for the '<em><b>Be Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_DIAGRAM_TYPE__BE_ENTITY = eINSTANCE.getBEDiagramType_BeEntity();

		/**
		 * The meta object literal for the '<em><b>Ce Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_DIAGRAM_TYPE__CE_ENTITY = eINSTANCE.getBEDiagramType_CeEntity();

		/**
		 * The meta object literal for the '<em><b>Diagram Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BE_DIAGRAM_TYPE__DIAGRAM_PACKAGE = eINSTANCE.getBEDiagramType_DiagramPackage();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEListTypeImpl <em>BE List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEListTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEListType()
		 * @generated
		 */
		EClass BE_LIST_TYPE = eINSTANCE.getBEListType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEMapTypeImpl <em>BE Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEMapTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEMapType()
		 * @generated
		 */
		EClass BE_MAP_TYPE = eINSTANCE.getBEMapType();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MAP_TYPE__KEY_TYPE = eINSTANCE.getBEMapType_KeyType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEObjRefTypeImpl <em>BE Obj Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEObjRefTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEObjRefType()
		 * @generated
		 */
		EClass BE_OBJ_REF_TYPE = eINSTANCE.getBEObjRefType();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_OBJ_REF_TYPE__TARGET_ENTITY = eINSTANCE.getBEObjRefType_TargetEntity();

		/**
		 * The meta object literal for the '<em><b>Auto Version Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BE_OBJ_REF_TYPE__AUTO_VERSION_UPDATE = eINSTANCE.getBEObjRefType_AutoVersionUpdate();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEPrimitiveTypeImpl <em>BE Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEPrimitiveTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEPrimitiveType()
		 * @generated
		 */
		EClass BE_PRIMITIVE_TYPE = eINSTANCE.getBEPrimitiveType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BESetTypeImpl <em>BE Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BESetTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBESetType()
		 * @generated
		 */
		EClass BE_SET_TYPE = eINSTANCE.getBESetType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BETypeImpl <em>BE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BETypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBEType()
		 * @generated
		 */
		EClass BE_TYPE = eINSTANCE.getBEType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BinaryTypeImpl <em>Binary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BinaryTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBinaryType()
		 * @generated
		 */
		EClass BINARY_TYPE = eINSTANCE.getBinaryType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BooleanTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl <em>Business Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getBusinessEntityType()
		 * @generated
		 */
		EClass BUSINESS_ENTITY_TYPE = eINSTANCE.getBusinessEntityType();

		/**
		 * The meta object literal for the '<em><b>Parent Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ENTITY_TYPE__PARENT_OBJECT = eINSTANCE.getBusinessEntityType_ParentObject();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ENTITY_TYPE__MEMBER = eINSTANCE.getBusinessEntityType_Member();

		/**
		 * The meta object literal for the '<em><b>Persistent Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG = eINSTANCE.getBusinessEntityType_PersistentConfig();

		/**
		 * The meta object literal for the '<em><b>Validator Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG = eINSTANCE.getBusinessEntityType_ValidatorConfig();

		/**
		 * The meta object literal for the '<em><b>Search Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ENTITY_TYPE__SEARCH_METHOD = eINSTANCE.getBusinessEntityType_SearchMethod();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ENTITY_TYPE__ABBREVIATION = eINSTANCE.getBusinessEntityType_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Extensible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ENTITY_TYPE__EXTENSIBLE = eINSTANCE.getBusinessEntityType_Extensible();

		/**
		 * The meta object literal for the '<em><b>Need Equals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ENTITY_TYPE__NEED_EQUALS = eINSTANCE.getBusinessEntityType_NeedEquals();

		/**
		 * The meta object literal for the '<em><b>Need History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ENTITY_TYPE__NEED_HISTORY = eINSTANCE.getBusinessEntityType_NeedHistory();

		EAttribute BUSINESS_ENTITY_TYPE__PARENT = eINSTANCE.getBusinessEntityType_Parent();
		
		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.CEObjRefTypeImpl <em>CE Obj Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.CEObjRefTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getCEObjRefType()
		 * @generated
		 */
		EClass CE_OBJ_REF_TYPE = eINSTANCE.getCEObjRefType();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CE_OBJ_REF_TYPE__TARGET_ENTITY = eINSTANCE.getCEObjRefType_TargetEntity();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantEntityTypeImpl <em>Constant Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ConstantEntityTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getConstantEntityType()
		 * @generated
		 */
		EClass CONSTANT_ENTITY_TYPE = eINSTANCE.getConstantEntityType();

		/**
		 * The meta object literal for the '<em><b>Eff Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_ENTITY_TYPE__EFF_TIME = eINSTANCE.getConstantEntityType_EffTime();

		/**
		 * The meta object literal for the '<em><b>Exp Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_ENTITY_TYPE__EXP_TIME = eINSTANCE.getConstantEntityType_ExpTime();

		/**
		 * The meta object literal for the '<em><b>Constant Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_ENTITY_TYPE__CONSTANT_VALUE = eINSTANCE.getConstantEntityType_ConstantValue();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl <em>Constant Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ConstantValueTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getConstantValueType()
		 * @generated
		 */
		EClass CONSTANT_VALUE_TYPE = eINSTANCE.getConstantValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE_TYPE__VALUE = eINSTANCE.getConstantValueType_Value();

		/**
		 * The meta object literal for the '<em><b>I1 8n Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE_TYPE__I18N_KEY = eINSTANCE.getConstantValueType_I18nKey();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE_TYPE__INT_VALUE = eINSTANCE.getConstantValueType_IntValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE_TYPE__DESCRIPTION = eINSTANCE.getConstantValueType_Description();

		/**
		 * The meta object literal for the '<em><b>Eff Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE_TYPE__EFF_TIME = eINSTANCE.getConstantValueType_EffTime();

		/**
		 * The meta object literal for the '<em><b>Exp Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE_TYPE__EXP_TIME = eINSTANCE.getConstantValueType_ExpTime();

		/**
		 * The meta object literal for the '<em><b>Passivated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE_TYPE__PASSIVATED = eINSTANCE.getConstantValueType_Passivated();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE_TYPE__PRIORITY = eINSTANCE.getConstantValueType_Priority();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.DateTimeTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getDateTimeType()
		 * @generated
		 */
		EClass DATE_TIME_TYPE = eINSTANCE.getDateTimeType();

		/**
		 * The meta object literal for the '<em><b>Be Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BE_DIAGRAM_TYPE__BE_PACKAGE = eINSTANCE.getBEDiagramType_BePackage();

		/**
		 * The meta object literal for the '<em><b>Ce Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BE_DIAGRAM_TYPE__CE_PACKAGE = eINSTANCE.getBEDiagramType_CePackage();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>BE Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BE_DIAGRAM = eINSTANCE.getDocumentRoot_BEDiagram();

		/**
		 * The meta object literal for the '<em><b>Business Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUSINESS_ENTITY = eINSTANCE.getDocumentRoot_BusinessEntity();

		/**
		 * The meta object literal for the '<em><b>Constant Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONSTANT_ENTITY = eINSTANCE.getDocumentRoot_ConstantEntity();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.DoubleTypeImpl <em>Double Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.DoubleTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getDoubleType()
		 * @generated
		 */
		EClass DOUBLE_TYPE = eINSTANCE.getDoubleType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.DummyFieldTypeImpl <em>Dummy Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.DummyFieldTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getDummyFieldType()
		 * @generated
		 */
		EClass DUMMY_FIELD_TYPE = eINSTANCE.getDummyFieldType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUMMY_FIELD_TYPE__REFERENCE = eINSTANCE.getDummyFieldType_Reference();

		/**
		 * The meta object literal for the '<em><b>Ref Dummy Field Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUMMY_FIELD_TYPE__REF_DUMMY_FIELD_NAME = eINSTANCE.getDummyFieldType_RefDummyFieldName();

		/**
		 * The meta object literal for the '<em><b>Dummy Field Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUMMY_FIELD_TYPE__DUMMY_FIELD_NAME = eINSTANCE.getDummyFieldType_DummyFieldName();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityNameWebServiceMappingTypeImpl <em>Entity Name Web Service Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.EntityNameWebServiceMappingTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getEntityNameWebServiceMappingType()
		 * @generated
		 */
		EClass ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE = eINSTANCE.getEntityNameWebServiceMappingType();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME = eINSTANCE.getEntityNameWebServiceMappingType_MappedName();

		/**
		 * The meta object literal for the '<em><b>Namespace URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE__NAMESPACE_URI = eINSTANCE.getEntityNameWebServiceMappingType_NamespaceURI();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl <em>Entity Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getEntityRelationType()
		 * @generated
		 */
		EClass ENTITY_RELATION_TYPE = eINSTANCE.getEntityRelationType();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATION_TYPE__ENTITY = eINSTANCE.getEntityRelationType_Entity();

		/**
		 * The meta object literal for the '<em><b>Entity2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATION_TYPE__ENTITY2 = eINSTANCE.getEntityRelationType_Entity2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATION_TYPE__NAME = eINSTANCE.getEntityRelationType_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATION_TYPE__PRIORITY = eINSTANCE.getEntityRelationType_Priority();

		/**
		 * The meta object literal for the '<em><b>Refed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATION_TYPE__REFED_NAME = eINSTANCE.getEntityRelationType_RefedName();

		/**
		 * The meta object literal for the '<em><b>Refed Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATION_TYPE__REFED_PRIORITY = eINSTANCE.getEntityRelationType_RefedPriority();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATION_TYPE__TYPE = eINSTANCE.getEntityRelationType_Type();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ExternalReferenceTypeImpl <em>External Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ExternalReferenceTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getExternalReferenceType()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE_TYPE = eINSTANCE.getExternalReferenceType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE_TYPE__EXPRESSION = eINSTANCE.getExternalReferenceType_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE_TYPE__NAME = eINSTANCE.getExternalReferenceType_Name();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.FileTypeImpl <em>File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.FileTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getFileType()
		 * @generated
		 */
		EClass FILE_TYPE = eINSTANCE.getFileType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.IntTypeImpl <em>Int Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.IntTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getIntType()
		 * @generated
		 */
		EClass INT_TYPE = eINSTANCE.getIntType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.JavaObjRefTypeImpl <em>Java Obj Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.JavaObjRefTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getJavaObjRefType()
		 * @generated
		 */
		EClass JAVA_OBJ_REF_TYPE = eINSTANCE.getJavaObjRefType();

		/**
		 * The meta object literal for the '<em><b>Target Java</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_OBJ_REF_TYPE__TARGET_JAVA = eINSTANCE.getJavaObjRefType_TargetJava();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.LongTypeImpl <em>Long Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.LongTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getLongType()
		 * @generated
		 */
		EClass LONG_TYPE = eINSTANCE.getLongType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl <em>Member Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getMemberType()
		 * @generated
		 */
		EClass MEMBER_TYPE = eINSTANCE.getMemberType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_TYPE__NAME = eINSTANCE.getMemberType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_TYPE__DESCRIPTION = eINSTANCE.getMemberType_Description();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_TYPE__DEFAULT_VALUE = eINSTANCE.getMemberType_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_TYPE__TYPE = eINSTANCE.getMemberType_Type();

		/**
		 * The meta object literal for the '<em><b>Meta Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_TYPE__META_INFO = eINSTANCE.getMemberType_MetaInfo();

		/**
		 * The meta object literal for the '<em><b>Accessible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_TYPE__ACCESSIBLE = eINSTANCE.getMemberType_Accessible();

		/**
		 * The meta object literal for the '<em><b>Modifiable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_TYPE__MODIFIABLE = eINSTANCE.getMemberType_Modifiable();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_TYPE__TRANSIENT = eINSTANCE.getMemberType_Transient();

		EAttribute MEMBER_TYPE_REF_ENTITY_NAME = eINSTANCE.getMemberType_CollectionRefEntityName();
		
		EAttribute MEMBER_TYPE_MAP_KEY_TYPE = eINSTANCE.getMemberType_MapKeyType();
		
		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberWebServiceMappingTypeImpl <em>Member Web Service Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.MemberWebServiceMappingTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getMemberWebServiceMappingType()
		 * @generated
		 */
		EClass MEMBER_WEB_SERVICE_MAPPING_TYPE = eINSTANCE.getMemberWebServiceMappingType();

		/**
		 * The meta object literal for the '<em><b>Collection Wrapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED = eINSTANCE.getMemberWebServiceMappingType_CollectionWrapped();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE = eINSTANCE.getMemberWebServiceMappingType_Ignore();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME = eINSTANCE.getMemberWebServiceMappingType_MappedName();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE = eINSTANCE.getMemberWebServiceMappingType_Style();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ObjectRefTypeImpl <em>Object Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ObjectRefTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getObjectRefType()
		 * @generated
		 */
		EClass OBJECT_REF_TYPE = eINSTANCE.getObjectRefType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.PersistentConfigTypeImpl <em>Persistent Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.PersistentConfigTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getPersistentConfigType()
		 * @generated
		 */
		EClass PERSISTENT_CONFIG_TYPE = eINSTANCE.getPersistentConfigType();

		/**
		 * The meta object literal for the '<em><b>Supported Persistence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_CONFIG_TYPE__SUPPORTED_PERSISTENCE_TYPE = eINSTANCE.getPersistentConfigType_SupportedPersistenceType();

		/**
		 * The meta object literal for the '<em><b>Primary Key Member</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_CONFIG_TYPE__PRIMARY_KEY_MEMBER = eINSTANCE.getPersistentConfigType_PrimaryKeyMember();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl <em>Reference Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ReferenceObjectTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getReferenceObjectType()
		 * @generated
		 */
		EClass REFERENCE_OBJECT_TYPE = eINSTANCE.getReferenceObjectType();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_OBJECT_TYPE__REF_TYPE = eINSTANCE.getReferenceObjectType_RefType();

		/**
		 * The meta object literal for the '<em><b>Ref Field Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_OBJECT_TYPE__REF_FIELD_NAME = eINSTANCE.getReferenceObjectType_RefFieldName();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_OBJECT_TYPE__FIELD_NAME = eINSTANCE.getReferenceObjectType_FieldName();

		/**
		 * The meta object literal for the '<em><b>Time Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_OBJECT_TYPE__TIME_FIELD_NAME = eINSTANCE.getReferenceObjectType_TimeFieldName();

		/**
		 * The meta object literal for the '<em><b>Must Have</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_OBJECT_TYPE__MUST_HAVE = eINSTANCE.getReferenceObjectType_MustHave();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_OBJECT_TYPE__NAME = eINSTANCE.getReferenceObjectType_Name();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationConstraintTypeImpl <em>Relation Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.RelationConstraintTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getRelationConstraintType()
		 * @generated
		 */
		EClass RELATION_CONSTRAINT_TYPE = eINSTANCE.getRelationConstraintType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CONSTRAINT_TYPE__VALUE = eINSTANCE.getRelationConstraintType_Value();

		/**
		 * The meta object literal for the '<em><b>Is Entity2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CONSTRAINT_TYPE__IS_ENTITY2 = eINSTANCE.getRelationConstraintType_IsEntity2();

		/**
		 * The meta object literal for the '<em><b>Relation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CONSTRAINT_TYPE__RELATION_NAME = eINSTANCE.getRelationConstraintType_RelationName();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.RelationKeyTypeImpl <em>Relation Key Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.RelationKeyTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getRelationKeyType()
		 * @generated
		 */
		EClass RELATION_KEY_TYPE = eINSTANCE.getRelationKeyType();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_KEY_TYPE__FIELD_NAME = eINSTANCE.getRelationKeyType_FieldName();

		/**
		 * The meta object literal for the '<em><b>Is Entity2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_KEY_TYPE__IS_ENTITY2 = eINSTANCE.getRelationKeyType_IsEntity2();

		/**
		 * The meta object literal for the '<em><b>Relation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_KEY_TYPE__RELATION_NAME = eINSTANCE.getRelationKeyType_RelationName();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.SearchMethodTypeImpl <em>Search Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.SearchMethodTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getSearchMethodType()
		 * @generated
		 */
		EClass SEARCH_METHOD_TYPE = eINSTANCE.getSearchMethodType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_METHOD_TYPE__NAME = eINSTANCE.getSearchMethodType_Name();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_METHOD_TYPE__QUERY = eINSTANCE.getSearchMethodType_Query();

		/**
		 * The meta object literal for the '<em><b>Condition Mapping Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_METHOD_TYPE__CONDITION_MAPPING_NAME = eINSTANCE.getSearchMethodType_ConditionMappingName();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.StringTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.TimeTypeImpl <em>Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.TimeTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getTimeType()
		 * @generated
		 */
		EClass TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.impl.ValidatorConfigTypeImpl <em>Validator Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.ValidatorConfigTypeImpl
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getValidatorConfigType()
		 * @generated
		 */
		EClass VALIDATOR_CONFIG_TYPE = eINSTANCE.getValidatorConfigType();

		/**
		 * The meta object literal for the '<em><b>Dummy Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATOR_CONFIG_TYPE__DUMMY_FIELD = eINSTANCE.getValidatorConfigType_DummyField();

		/**
		 * The meta object literal for the '<em><b>Reference Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATOR_CONFIG_TYPE__REFERENCE_CONFIG = eINSTANCE.getValidatorConfigType_ReferenceConfig();

		/**
		 * The meta object literal for the '<em><b>External Reference Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATOR_CONFIG_TYPE__EXTERNAL_REFERENCE_CONFIG = eINSTANCE.getValidatorConfigType_ExternalReferenceConfig();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType <em>Persistence Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getPersistenceTypeType()
		 * @generated
		 */
		EEnum PERSISTENCE_TYPE_TYPE = eINSTANCE.getPersistenceTypeType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationTypeType <em>Relation Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.RelationTypeType
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getRelationTypeType()
		 * @generated
		 */
		EEnum RELATION_TYPE_TYPE = eINSTANCE.getRelationTypeType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.bediagram.StyleType <em>Style Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.StyleType
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getStyleType()
		 * @generated
		 */
		EEnum STYLE_TYPE = eINSTANCE.getStyleType();

		/**
		 * The meta object literal for the '<em>Persistence Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getPersistenceTypeTypeObject()
		 * @generated
		 */
		EDataType PERSISTENCE_TYPE_TYPE_OBJECT = eINSTANCE.getPersistenceTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Relation Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.RelationTypeType
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getRelationTypeTypeObject()
		 * @generated
		 */
		EDataType RELATION_TYPE_TYPE_OBJECT = eINSTANCE.getRelationTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Style Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.bediagram.StyleType
		 * @see org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramPackageImpl#getStyleTypeObject()
		 * @generated
		 */
		EDataType STYLE_TYPE_OBJECT = eINSTANCE.getStyleTypeObject();

	}

} //BEDiagramPackage
