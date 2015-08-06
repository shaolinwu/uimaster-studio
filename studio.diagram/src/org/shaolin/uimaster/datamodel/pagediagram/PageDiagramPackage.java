/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface PageDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pagediagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uimaster.shaolin.org/datamodel/PageDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pagediagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PageDiagramPackage eINSTANCE = org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.OutTypeImpl <em>Out Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.OutTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getOutType()
	 * @generated
	 */
	int OUT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TYPE__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TYPE__MAPPINGS = 2;

	/**
	 * The number of structural features of the '<em>Out Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.ConditionalOutTypeImpl <em>Conditional Out Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.ConditionalOutTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getConditionalOutType()
	 * @generated
	 */
	int CONDITIONAL_OUT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUT_TYPE__NEXT = OUT_TYPE__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUT_TYPE__NAME = OUT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUT_TYPE__MAPPINGS = OUT_TYPE__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUT_TYPE__CONDITION_EXPRESSION = OUT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Out Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OUT_TYPE_FEATURE_COUNT = OUT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl <em>Web Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getWebNodeType()
	 * @generated
	 */
	int WEB_NODE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_NODE_TYPE__OUT = 0;

	/**
	 * The feature id for the '<em><b>Access Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_NODE_TYPE__ACCESS_PERMISSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_NODE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_NODE_TYPE__DISPLAY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_NODE_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_NODE_TYPE__VARIABLES = 5;

	/**
	 * The number of structural features of the '<em>Web Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_NODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayNodeTypeImpl <em>Display Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayNodeTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getDisplayNodeType()
	 * @generated
	 */
	int DISPLAY_NODE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE__OUT = WEB_NODE_TYPE__OUT;

	/**
	 * The feature id for the '<em><b>Access Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE__ACCESS_PERMISSION = WEB_NODE_TYPE__ACCESS_PERMISSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE__DESCRIPTION = WEB_NODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE__DISPLAY_NAME = WEB_NODE_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE__NAME = WEB_NODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE__VARIABLES = WEB_NODE_TYPE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE__OPERATION = WEB_NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE__QUERY_STRING = WEB_NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE__PATH = WEB_NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Display Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NODE_TYPE_FEATURE_COUNT = WEB_NODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayOutTypeImpl <em>Display Out Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayOutTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getDisplayOutType()
	 * @generated
	 */
	int DISPLAY_OUT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OUT_TYPE__NEXT = OUT_TYPE__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OUT_TYPE__NAME = OUT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OUT_TYPE__MAPPINGS = OUT_TYPE__MAPPINGS;

	/**
	 * The number of structural features of the '<em>Display Out Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OUT_TYPE_FEATURE_COUNT = OUT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.DocumentRootImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Web Chunk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEB_CHUNK = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DynamicOutTypeImpl <em>Dynamic Out Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.DynamicOutTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getDynamicOutType()
	 * @generated
	 */
	int DYNAMIC_OUT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_OUT_TYPE__NEXT = OUT_TYPE__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_OUT_TYPE__NAME = OUT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_OUT_TYPE__MAPPINGS = OUT_TYPE__MAPPINGS;

	/**
	 * The number of structural features of the '<em>Dynamic Out Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_OUT_TYPE_FEATURE_COUNT = OUT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.FlowNodeTypeImpl <em>Flow Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.FlowNodeTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getFlowNodeType()
	 * @generated
	 */
	int FLOW_NODE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__OUT = WEB_NODE_TYPE__OUT;

	/**
	 * The feature id for the '<em><b>Access Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__ACCESS_PERMISSION = WEB_NODE_TYPE__ACCESS_PERMISSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__DESCRIPTION = WEB_NODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__DISPLAY_NAME = WEB_NODE_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__NAME = WEB_NODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__VARIABLES = WEB_NODE_TYPE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Dest Chunk Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__DEST_CHUNK_NAME = WEB_NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dest Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__DEST_NODE = WEB_NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Mapping To Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__DATA_MAPPING_TO_NODE = WEB_NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Mapping To Chunk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE__DATA_MAPPING_TO_CHUNK = WEB_NODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_TYPE_FEATURE_COUNT = WEB_NODE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.LogicNodeTypeImpl <em>Logic Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.LogicNodeTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getLogicNodeType()
	 * @generated
	 */
	int LOGIC_NODE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_NODE_TYPE__OUT = WEB_NODE_TYPE__OUT;

	/**
	 * The feature id for the '<em><b>Access Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_NODE_TYPE__ACCESS_PERMISSION = WEB_NODE_TYPE__ACCESS_PERMISSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_NODE_TYPE__DESCRIPTION = WEB_NODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_NODE_TYPE__DISPLAY_NAME = WEB_NODE_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_NODE_TYPE__NAME = WEB_NODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_NODE_TYPE__VARIABLES = WEB_NODE_TYPE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_NODE_TYPE__OPERATION = WEB_NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Need Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_NODE_TYPE__NEED_TRANSACTION = WEB_NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logic Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_NODE_TYPE_FEATURE_COUNT = WEB_NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.NextTypeImpl <em>Next Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.NextTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getNextType()
	 * @generated
	 */
	int NEXT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Dest Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TYPE__DEST_NODE = 0;

	/**
	 * The feature id for the '<em><b>Out Data Mapping To Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TYPE__OUT_DATA_MAPPING_TO_NODE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TYPE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Next Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.PageNodeTypeImpl <em>Page Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageNodeTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getPageNodeType()
	 * @generated
	 */
	int PAGE_NODE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE__OUT = WEB_NODE_TYPE__OUT;

	/**
	 * The feature id for the '<em><b>Access Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE__ACCESS_PERMISSION = WEB_NODE_TYPE__ACCESS_PERMISSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE__DESCRIPTION = WEB_NODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE__DISPLAY_NAME = WEB_NODE_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE__NAME = WEB_NODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE__VARIABLES = WEB_NODE_TYPE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE__SOURCE_ENTITY = WEB_NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE__OPERATION = WEB_NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Need Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE__NEED_TRANSACTION = WEB_NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Page Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_NODE_TYPE_FEATURE_COUNT = WEB_NODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.StartNodeTypeImpl <em>Start Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.StartNodeTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getStartNodeType()
	 * @generated
	 */
	int START_NODE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__OUT = LOGIC_NODE_TYPE__OUT;

	/**
	 * The feature id for the '<em><b>Access Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__ACCESS_PERMISSION = LOGIC_NODE_TYPE__ACCESS_PERMISSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__DESCRIPTION = LOGIC_NODE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__DISPLAY_NAME = LOGIC_NODE_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__NAME = LOGIC_NODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__VARIABLES = LOGIC_NODE_TYPE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__OPERATION = LOGIC_NODE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Need Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE__NEED_TRANSACTION = LOGIC_NODE_TYPE__NEED_TRANSACTION;

	/**
	 * The number of structural features of the '<em>Start Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_TYPE_FEATURE_COUNT = LOGIC_NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebChunkTypeImpl <em>Web Chunk Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.WebChunkTypeImpl
	 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getWebChunkType()
	 * @generated
	 */
	int WEB_CHUNK_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__ENTITY_NAME = CommonPackage.ENTITY_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__SYSTEM_VERSION = CommonPackage.ENTITY_TYPE__SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__REVISION = CommonPackage.ENTITY_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__DISPLAY_NAME = CommonPackage.ENTITY_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__DESCRIPTION = CommonPackage.ENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__AUTHOR = CommonPackage.ENTITY_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__REGION = CommonPackage.ENTITY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__CATEGORY = CommonPackage.ENTITY_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Entity Meta Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__ENTITY_META_INFO = CommonPackage.ENTITY_TYPE__ENTITY_META_INFO;

	/**
	 * The feature id for the '<em><b>Extension Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__EXTENSION_PROPERTY = CommonPackage.ENTITY_TYPE__EXTENSION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Web Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__WEB_NODE = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__GLOBAL_VARIABLE = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__ERROR_HANDLER = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE__ACCESS_PERMISSION = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Web Chunk Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_CHUNK_TYPE_FEATURE_COUNT = CommonPackage.ENTITY_TYPE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType <em>Conditional Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Out Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType
	 * @generated
	 */
	EClass getConditionalOutType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType#getConditionExpression()
	 * @see #getConditionalOutType()
	 * @generated
	 */
	EReference getConditionalOutType_ConditionExpression();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType <em>Display Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Node Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType
	 * @generated
	 */
	EClass getDisplayNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getOperation()
	 * @see #getDisplayNodeType()
	 * @generated
	 */
	EReference getDisplayNodeType_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getQueryString <em>Query String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query String</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getQueryString()
	 * @see #getDisplayNodeType()
	 * @generated
	 */
	EReference getDisplayNodeType_QueryString();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType#getPath()
	 * @see #getDisplayNodeType()
	 * @generated
	 */
	EAttribute getDisplayNodeType_Path();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType <em>Display Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Out Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType
	 * @generated
	 */
	EClass getDisplayOutType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot#getWebChunk <em>Web Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Web Chunk</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot#getWebChunk()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebChunk();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.DynamicOutType <em>Dynamic Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Out Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DynamicOutType
	 * @generated
	 */
	EClass getDynamicOutType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType <em>Flow Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType
	 * @generated
	 */
	EClass getFlowNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDestChunkName <em>Dest Chunk Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dest Chunk Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDestChunkName()
	 * @see #getFlowNodeType()
	 * @generated
	 */
	EReference getFlowNodeType_DestChunkName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDestNode <em>Dest Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Node</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDestNode()
	 * @see #getFlowNodeType()
	 * @generated
	 */
	EAttribute getFlowNodeType_DestNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDataMappingToNode <em>Data Mapping To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Mapping To Node</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDataMappingToNode()
	 * @see #getFlowNodeType()
	 * @generated
	 */
	EReference getFlowNodeType_DataMappingToNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDataMappingToChunk <em>Data Mapping To Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Mapping To Chunk</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType#getDataMappingToChunk()
	 * @see #getFlowNodeType()
	 * @generated
	 */
	EReference getFlowNodeType_DataMappingToChunk();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType <em>Logic Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Node Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType
	 * @generated
	 */
	EClass getLogicNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#getOperation()
	 * @see #getLogicNodeType()
	 * @generated
	 */
	EReference getLogicNodeType_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#isNeedTransaction <em>Need Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Transaction</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType#isNeedTransaction()
	 * @see #getLogicNodeType()
	 * @generated
	 */
	EAttribute getLogicNodeType_NeedTransaction();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.NextType <em>Next Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.NextType
	 * @generated
	 */
	EClass getNextType();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.NextType#getDestNode <em>Dest Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Node</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.NextType#getDestNode()
	 * @see #getNextType()
	 * @generated
	 */
	EAttribute getNextType_DestNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.pagediagram.NextType#getOutDataMappingToNode <em>Out Data Mapping To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Data Mapping To Node</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.NextType#getOutDataMappingToNode()
	 * @see #getNextType()
	 * @generated
	 */
	EReference getNextType_OutDataMappingToNode();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.NextType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.NextType#getDescription()
	 * @see #getNextType()
	 * @generated
	 */
	EAttribute getNextType_Description();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.OutType <em>Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.OutType
	 * @generated
	 */
	EClass getOutType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.pagediagram.OutType#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.OutType#getNext()
	 * @see #getOutType()
	 * @generated
	 */
	EReference getOutType_Next();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.OutType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.OutType#getName()
	 * @see #getOutType()
	 * @generated
	 */
	EAttribute getOutType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.pagediagram.OutType#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.OutType#getMappings()
	 * @see #getOutType()
	 * @generated
	 */
	EReference getOutType_Mappings();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType <em>Page Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Node Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageNodeType
	 * @generated
	 */
	EClass getPageNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Entity</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#getSourceEntity()
	 * @see #getPageNodeType()
	 * @generated
	 */
	EReference getPageNodeType_SourceEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#getOperation()
	 * @see #getPageNodeType()
	 * @generated
	 */
	EReference getPageNodeType_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#isNeedTransaction <em>Need Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Transaction</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageNodeType#isNeedTransaction()
	 * @see #getPageNodeType()
	 * @generated
	 */
	EAttribute getPageNodeType_NeedTransaction();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.StartNodeType <em>Start Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.StartNodeType
	 * @generated
	 */
	EClass getStartNodeType();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType <em>Web Chunk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Chunk Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebChunkType
	 * @generated
	 */
	EClass getWebChunkType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getWebNode <em>Web Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Node</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getWebNode()
	 * @see #getWebChunkType()
	 * @generated
	 */
	EReference getWebChunkType_WebNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getGlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variable</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getGlobalVariable()
	 * @see #getWebChunkType()
	 * @generated
	 */
	EReference getWebChunkType_GlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Handler</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getErrorHandler()
	 * @see #getWebChunkType()
	 * @generated
	 */
	EAttribute getWebChunkType_ErrorHandler();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getAccessPermission <em>Access Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access Permission</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebChunkType#getAccessPermission()
	 * @see #getWebChunkType()
	 * @generated
	 */
	EAttribute getWebChunkType_AccessPermission();

	/**
	 * Returns the meta object for class '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType <em>Web Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Node Type</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebNodeType
	 * @generated
	 */
	EClass getWebNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getOut()
	 * @see #getWebNodeType()
	 * @generated
	 */
	EReference getWebNodeType_Out();

	/**
	 * Returns the meta object for the attribute list '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getAccessPermission <em>Access Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access Permission</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getAccessPermission()
	 * @see #getWebNodeType()
	 * @generated
	 */
	EAttribute getWebNodeType_AccessPermission();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getDescription()
	 * @see #getWebNodeType()
	 * @generated
	 */
	EAttribute getWebNodeType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getDisplayName()
	 * @see #getWebNodeType()
	 * @generated
	 */
	EAttribute getWebNodeType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getName()
	 * @see #getWebNodeType()
	 * @generated
	 */
	EAttribute getWebNodeType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebNodeType#getVariables()
	 * @see #getWebNodeType()
	 * @generated
	 */
	EReference getWebNodeType_Variables();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PageDiagramFactory getPageDiagramFactory();

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
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.ConditionalOutTypeImpl <em>Conditional Out Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.ConditionalOutTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getConditionalOutType()
		 * @generated
		 */
		EClass CONDITIONAL_OUT_TYPE = eINSTANCE.getConditionalOutType();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OUT_TYPE__CONDITION_EXPRESSION = eINSTANCE.getConditionalOutType_ConditionExpression();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayNodeTypeImpl <em>Display Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayNodeTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getDisplayNodeType()
		 * @generated
		 */
		EClass DISPLAY_NODE_TYPE = eINSTANCE.getDisplayNodeType();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_NODE_TYPE__OPERATION = eINSTANCE.getDisplayNodeType_Operation();

		/**
		 * The meta object literal for the '<em><b>Query String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_NODE_TYPE__QUERY_STRING = eINSTANCE.getDisplayNodeType_QueryString();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_NODE_TYPE__PATH = eINSTANCE.getDisplayNodeType_Path();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayOutTypeImpl <em>Display Out Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayOutTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getDisplayOutType()
		 * @generated
		 */
		EClass DISPLAY_OUT_TYPE = eINSTANCE.getDisplayOutType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.DocumentRootImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Web Chunk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEB_CHUNK = eINSTANCE.getDocumentRoot_WebChunk();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DynamicOutTypeImpl <em>Dynamic Out Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.DynamicOutTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getDynamicOutType()
		 * @generated
		 */
		EClass DYNAMIC_OUT_TYPE = eINSTANCE.getDynamicOutType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.FlowNodeTypeImpl <em>Flow Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.FlowNodeTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getFlowNodeType()
		 * @generated
		 */
		EClass FLOW_NODE_TYPE = eINSTANCE.getFlowNodeType();

		/**
		 * The meta object literal for the '<em><b>Dest Chunk Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_TYPE__DEST_CHUNK_NAME = eINSTANCE.getFlowNodeType_DestChunkName();

		/**
		 * The meta object literal for the '<em><b>Dest Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE_TYPE__DEST_NODE = eINSTANCE.getFlowNodeType_DestNode();

		/**
		 * The meta object literal for the '<em><b>Data Mapping To Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_TYPE__DATA_MAPPING_TO_NODE = eINSTANCE.getFlowNodeType_DataMappingToNode();

		/**
		 * The meta object literal for the '<em><b>Data Mapping To Chunk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_TYPE__DATA_MAPPING_TO_CHUNK = eINSTANCE.getFlowNodeType_DataMappingToChunk();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.LogicNodeTypeImpl <em>Logic Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.LogicNodeTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getLogicNodeType()
		 * @generated
		 */
		EClass LOGIC_NODE_TYPE = eINSTANCE.getLogicNodeType();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_NODE_TYPE__OPERATION = eINSTANCE.getLogicNodeType_Operation();

		/**
		 * The meta object literal for the '<em><b>Need Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_NODE_TYPE__NEED_TRANSACTION = eINSTANCE.getLogicNodeType_NeedTransaction();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.NextTypeImpl <em>Next Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.NextTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getNextType()
		 * @generated
		 */
		EClass NEXT_TYPE = eINSTANCE.getNextType();

		/**
		 * The meta object literal for the '<em><b>Dest Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT_TYPE__DEST_NODE = eINSTANCE.getNextType_DestNode();

		/**
		 * The meta object literal for the '<em><b>Out Data Mapping To Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT_TYPE__OUT_DATA_MAPPING_TO_NODE = eINSTANCE.getNextType_OutDataMappingToNode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT_TYPE__DESCRIPTION = eINSTANCE.getNextType_Description();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.OutTypeImpl <em>Out Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.OutTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getOutType()
		 * @generated
		 */
		EClass OUT_TYPE = eINSTANCE.getOutType();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_TYPE__NEXT = eINSTANCE.getOutType_Next();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_TYPE__NAME = eINSTANCE.getOutType_Name();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_TYPE__MAPPINGS = eINSTANCE.getOutType_Mappings();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.PageNodeTypeImpl <em>Page Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageNodeTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getPageNodeType()
		 * @generated
		 */
		EClass PAGE_NODE_TYPE = eINSTANCE.getPageNodeType();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_NODE_TYPE__SOURCE_ENTITY = eINSTANCE.getPageNodeType_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_NODE_TYPE__OPERATION = eINSTANCE.getPageNodeType_Operation();

		/**
		 * The meta object literal for the '<em><b>Need Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_NODE_TYPE__NEED_TRANSACTION = eINSTANCE.getPageNodeType_NeedTransaction();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.StartNodeTypeImpl <em>Start Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.StartNodeTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getStartNodeType()
		 * @generated
		 */
		EClass START_NODE_TYPE = eINSTANCE.getStartNodeType();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebChunkTypeImpl <em>Web Chunk Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.WebChunkTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getWebChunkType()
		 * @generated
		 */
		EClass WEB_CHUNK_TYPE = eINSTANCE.getWebChunkType();

		/**
		 * The meta object literal for the '<em><b>Web Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_CHUNK_TYPE__WEB_NODE = eINSTANCE.getWebChunkType_WebNode();

		/**
		 * The meta object literal for the '<em><b>Global Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_CHUNK_TYPE__GLOBAL_VARIABLE = eINSTANCE.getWebChunkType_GlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Error Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_CHUNK_TYPE__ERROR_HANDLER = eINSTANCE.getWebChunkType_ErrorHandler();

		/**
		 * The meta object literal for the '<em><b>Access Permission</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_CHUNK_TYPE__ACCESS_PERMISSION = eINSTANCE.getWebChunkType_AccessPermission();

		/**
		 * The meta object literal for the '{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl <em>Web Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl
		 * @see org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramPackageImpl#getWebNodeType()
		 * @generated
		 */
		EClass WEB_NODE_TYPE = eINSTANCE.getWebNodeType();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_NODE_TYPE__OUT = eINSTANCE.getWebNodeType_Out();

		/**
		 * The meta object literal for the '<em><b>Access Permission</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_NODE_TYPE__ACCESS_PERMISSION = eINSTANCE.getWebNodeType_AccessPermission();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_NODE_TYPE__DESCRIPTION = eINSTANCE.getWebNodeType_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_NODE_TYPE__DISPLAY_NAME = eINSTANCE.getWebNodeType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_NODE_TYPE__NAME = eINSTANCE.getWebNodeType_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_NODE_TYPE__VARIABLES = eINSTANCE.getWebNodeType_Variables();

	}

} //PageDiagramPackage
