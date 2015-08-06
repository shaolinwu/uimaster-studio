/**
 */
package org.shaolin.uimaster.datamodel.pagediagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.shaolin.uimaster.datamodel.common.CommonPackage;

import org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType;
import org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot;
import org.shaolin.uimaster.datamodel.pagediagram.DynamicOutType;
import org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.NextType;
import org.shaolin.uimaster.datamodel.pagediagram.OutType;
import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramFactory;
import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage;
import org.shaolin.uimaster.datamodel.pagediagram.PageNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.StartNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.WebChunkType;
import org.shaolin.uimaster.datamodel.pagediagram.WebNodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PageDiagramPackageImpl extends EPackageImpl implements PageDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayOutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicOutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webChunkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webNodeTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PageDiagramPackageImpl() {
		super(eNS_URI, PageDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PageDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PageDiagramPackage init() {
		if (isInited) return (PageDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(PageDiagramPackage.eNS_URI);

		// Obtain or create and register package
		PageDiagramPackageImpl thePageDiagramPackage = (PageDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PageDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PageDiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePageDiagramPackage.createPackageContents();

		// Initialize created meta-data
		thePageDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePageDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PageDiagramPackage.eNS_URI, thePageDiagramPackage);
		return thePageDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalOutType() {
		return conditionalOutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalOutType_ConditionExpression() {
		return (EReference)conditionalOutTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayNodeType() {
		return displayNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayNodeType_Operation() {
		return (EReference)displayNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayNodeType_QueryString() {
		return (EReference)displayNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayNodeType_Path() {
		return (EAttribute)displayNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayOutType() {
		return displayOutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WebChunk() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicOutType() {
		return dynamicOutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNodeType() {
		return flowNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeType_DestChunkName() {
		return (EReference)flowNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNodeType_DestNode() {
		return (EAttribute)flowNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeType_DataMappingToNode() {
		return (EReference)flowNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeType_DataMappingToChunk() {
		return (EReference)flowNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicNodeType() {
		return logicNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicNodeType_Operation() {
		return (EReference)logicNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicNodeType_NeedTransaction() {
		return (EAttribute)logicNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextType() {
		return nextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextType_DestNode() {
		return (EAttribute)nextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextType_OutDataMappingToNode() {
		return (EReference)nextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextType_Description() {
		return (EAttribute)nextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutType() {
		return outTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutType_Next() {
		return (EReference)outTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutType_Name() {
		return (EAttribute)outTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutType_Mappings() {
		return (EReference)outTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageNodeType() {
		return pageNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageNodeType_SourceEntity() {
		return (EReference)pageNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageNodeType_Operation() {
		return (EReference)pageNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageNodeType_NeedTransaction() {
		return (EAttribute)pageNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartNodeType() {
		return startNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebChunkType() {
		return webChunkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebChunkType_WebNode() {
		return (EReference)webChunkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebChunkType_GlobalVariable() {
		return (EReference)webChunkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebChunkType_ErrorHandler() {
		return (EAttribute)webChunkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebChunkType_AccessPermission() {
		return (EAttribute)webChunkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebNodeType() {
		return webNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebNodeType_Out() {
		return (EReference)webNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebNodeType_AccessPermission() {
		return (EAttribute)webNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebNodeType_Description() {
		return (EAttribute)webNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebNodeType_DisplayName() {
		return (EAttribute)webNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebNodeType_Name() {
		return (EAttribute)webNodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebNodeType_Variables() {
		return (EReference)webNodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageDiagramFactory getPageDiagramFactory() {
		return (PageDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		conditionalOutTypeEClass = createEClass(CONDITIONAL_OUT_TYPE);
		createEReference(conditionalOutTypeEClass, CONDITIONAL_OUT_TYPE__CONDITION_EXPRESSION);

		displayNodeTypeEClass = createEClass(DISPLAY_NODE_TYPE);
		createEReference(displayNodeTypeEClass, DISPLAY_NODE_TYPE__OPERATION);
		createEReference(displayNodeTypeEClass, DISPLAY_NODE_TYPE__QUERY_STRING);
		createEAttribute(displayNodeTypeEClass, DISPLAY_NODE_TYPE__PATH);

		displayOutTypeEClass = createEClass(DISPLAY_OUT_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WEB_CHUNK);

		dynamicOutTypeEClass = createEClass(DYNAMIC_OUT_TYPE);

		flowNodeTypeEClass = createEClass(FLOW_NODE_TYPE);
		createEReference(flowNodeTypeEClass, FLOW_NODE_TYPE__DEST_CHUNK_NAME);
		createEAttribute(flowNodeTypeEClass, FLOW_NODE_TYPE__DEST_NODE);
		createEReference(flowNodeTypeEClass, FLOW_NODE_TYPE__DATA_MAPPING_TO_NODE);
		createEReference(flowNodeTypeEClass, FLOW_NODE_TYPE__DATA_MAPPING_TO_CHUNK);

		logicNodeTypeEClass = createEClass(LOGIC_NODE_TYPE);
		createEReference(logicNodeTypeEClass, LOGIC_NODE_TYPE__OPERATION);
		createEAttribute(logicNodeTypeEClass, LOGIC_NODE_TYPE__NEED_TRANSACTION);

		nextTypeEClass = createEClass(NEXT_TYPE);
		createEAttribute(nextTypeEClass, NEXT_TYPE__DEST_NODE);
		createEReference(nextTypeEClass, NEXT_TYPE__OUT_DATA_MAPPING_TO_NODE);
		createEAttribute(nextTypeEClass, NEXT_TYPE__DESCRIPTION);

		outTypeEClass = createEClass(OUT_TYPE);
		createEReference(outTypeEClass, OUT_TYPE__NEXT);
		createEAttribute(outTypeEClass, OUT_TYPE__NAME);
		createEReference(outTypeEClass, OUT_TYPE__MAPPINGS);

		pageNodeTypeEClass = createEClass(PAGE_NODE_TYPE);
		createEReference(pageNodeTypeEClass, PAGE_NODE_TYPE__SOURCE_ENTITY);
		createEReference(pageNodeTypeEClass, PAGE_NODE_TYPE__OPERATION);
		createEAttribute(pageNodeTypeEClass, PAGE_NODE_TYPE__NEED_TRANSACTION);

		startNodeTypeEClass = createEClass(START_NODE_TYPE);

		webChunkTypeEClass = createEClass(WEB_CHUNK_TYPE);
		createEReference(webChunkTypeEClass, WEB_CHUNK_TYPE__WEB_NODE);
		createEReference(webChunkTypeEClass, WEB_CHUNK_TYPE__GLOBAL_VARIABLE);
		createEAttribute(webChunkTypeEClass, WEB_CHUNK_TYPE__ERROR_HANDLER);
		createEAttribute(webChunkTypeEClass, WEB_CHUNK_TYPE__ACCESS_PERMISSION);

		webNodeTypeEClass = createEClass(WEB_NODE_TYPE);
		createEReference(webNodeTypeEClass, WEB_NODE_TYPE__OUT);
		createEAttribute(webNodeTypeEClass, WEB_NODE_TYPE__ACCESS_PERMISSION);
		createEAttribute(webNodeTypeEClass, WEB_NODE_TYPE__DESCRIPTION);
		createEAttribute(webNodeTypeEClass, WEB_NODE_TYPE__DISPLAY_NAME);
		createEAttribute(webNodeTypeEClass, WEB_NODE_TYPE__NAME);
		createEReference(webNodeTypeEClass, WEB_NODE_TYPE__VARIABLES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conditionalOutTypeEClass.getESuperTypes().add(this.getOutType());
		displayNodeTypeEClass.getESuperTypes().add(this.getWebNodeType());
		displayOutTypeEClass.getESuperTypes().add(this.getOutType());
		dynamicOutTypeEClass.getESuperTypes().add(this.getOutType());
		flowNodeTypeEClass.getESuperTypes().add(this.getWebNodeType());
		logicNodeTypeEClass.getESuperTypes().add(this.getWebNodeType());
		pageNodeTypeEClass.getESuperTypes().add(this.getWebNodeType());
		startNodeTypeEClass.getESuperTypes().add(this.getLogicNodeType());
		webChunkTypeEClass.getESuperTypes().add(theCommonPackage.getEntityType());

		// Initialize classes and features; add operations and parameters
		initEClass(conditionalOutTypeEClass, ConditionalOutType.class, "ConditionalOutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalOutType_ConditionExpression(), theCommonPackage.getExpressionType(), null, "conditionExpression", null, 0, 1, ConditionalOutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayNodeTypeEClass, DisplayNodeType.class, "DisplayNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayNodeType_Operation(), theCommonPackage.getExpressionType(), null, "operation", null, 1, 1, DisplayNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayNodeType_QueryString(), theCommonPackage.getExpressionType(), null, "queryString", null, 1, 1, DisplayNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayNodeType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, DisplayNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayOutTypeEClass, DisplayOutType.class, "DisplayOutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WebChunk(), this.getWebChunkType(), null, "webChunk", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dynamicOutTypeEClass, DynamicOutType.class, "DynamicOutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowNodeTypeEClass, FlowNodeType.class, "FlowNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowNodeType_DestChunkName(), theCommonPackage.getTargetEntityType(), null, "destChunkName", null, 1, 1, FlowNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNodeType_DestNode(), theXMLTypePackage.getString(), "destNode", null, 1, 1, FlowNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNodeType_DataMappingToNode(), theCommonPackage.getNameExpressionType(), null, "dataMappingToNode", null, 0, -1, FlowNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNodeType_DataMappingToChunk(), theCommonPackage.getNameExpressionType(), null, "dataMappingToChunk", null, 0, -1, FlowNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicNodeTypeEClass, LogicNodeType.class, "LogicNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicNodeType_Operation(), theCommonPackage.getExpressionType(), null, "operation", null, 1, 1, LogicNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicNodeType_NeedTransaction(), theXMLTypePackage.getBoolean(), "needTransaction", "false", 0, 1, LogicNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nextTypeEClass, NextType.class, "NextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNextType_DestNode(), theXMLTypePackage.getString(), "destNode", null, 1, 1, NextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNextType_OutDataMappingToNode(), theCommonPackage.getNameExpressionType(), null, "outDataMappingToNode", null, 0, -1, NextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNextType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, NextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outTypeEClass, OutType.class, "OutType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutType_Next(), this.getNextType(), null, "next", null, 0, 1, OutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutType_Mappings(), theCommonPackage.getNameExpressionType(), null, "mappings", null, 0, -1, OutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageNodeTypeEClass, PageNodeType.class, "PageNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageNodeType_SourceEntity(), theCommonPackage.getTargetEntityType(), null, "sourceEntity", null, 1, 1, PageNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageNodeType_Operation(), theCommonPackage.getExpressionType(), null, "operation", null, 1, 1, PageNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageNodeType_NeedTransaction(), theXMLTypePackage.getBoolean(), "needTransaction", "false", 0, 1, PageNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startNodeTypeEClass, StartNodeType.class, "StartNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(webChunkTypeEClass, WebChunkType.class, "WebChunkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebChunkType_WebNode(), this.getWebNodeType(), null, "webNode", null, 0, -1, WebChunkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebChunkType_GlobalVariable(), theCommonPackage.getParamType(), null, "globalVariable", null, 0, -1, WebChunkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebChunkType_ErrorHandler(), theXMLTypePackage.getString(), "errorHandler", null, 1, 1, WebChunkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebChunkType_AccessPermission(), theXMLTypePackage.getString(), "accessPermission", null, 0, -1, WebChunkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webNodeTypeEClass, WebNodeType.class, "WebNodeType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebNodeType_Out(), this.getOutType(), null, "out", null, 0, -1, WebNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebNodeType_AccessPermission(), theXMLTypePackage.getString(), "accessPermission", null, 0, -1, WebNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebNodeType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, WebNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebNodeType_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 0, 1, WebNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebNodeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, WebNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebNodeType_Variables(), theCommonPackage.getParamType(), null, "variables", null, 0, -1, WebNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (conditionalOutTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConditionalOutType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getConditionalOutType_ConditionExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conditionExpression",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (displayNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DisplayNodeType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDisplayNodeType_Operation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "operation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDisplayNodeType_QueryString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "queryString",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDisplayNodeType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });			
		addAnnotation
		  (displayOutTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DisplayOutType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_WebChunk(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WebChunk",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (dynamicOutTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DynamicOutType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (flowNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FlowNodeType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getFlowNodeType_DestChunkName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DestChunkName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFlowNodeType_DestNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DestNode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFlowNodeType_DataMappingToNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DataMappingToNode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFlowNodeType_DataMappingToChunk(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DataMappingToChunk",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (logicNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LogicNodeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLogicNodeType_Operation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "operation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLogicNodeType_NeedTransaction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "needTransaction"
		   });			
		addAnnotation
		  (nextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NextType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getNextType_DestNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "destNode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getNextType_OutDataMappingToNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "outDataMappingToNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNextType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });			
		addAnnotation
		  (outTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OutType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOutType_Next(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "next",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getOutType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getOutType_Mappings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inputData",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (pageNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PageNodeType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPageNodeType_SourceEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sourceEntity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPageNodeType_Operation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "operation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPageNodeType_NeedTransaction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "needTransaction"
		   });		
		addAnnotation
		  (startNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StartNodeType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (webChunkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "WebChunkType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWebChunkType_WebNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "webNode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getWebChunkType_GlobalVariable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "globalVariable",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getWebChunkType_ErrorHandler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ErrorHandler",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWebChunkType_AccessPermission(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessPermission",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (webNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "WebNodeType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getWebNodeType_Out(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "out",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWebNodeType_AccessPermission(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessPermission",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWebNodeType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });		
		addAnnotation
		  (getWebNodeType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "displayName"
		   });		
		addAnnotation
		  (getWebNodeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getWebNodeType_Variables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inputData",
			 "namespace", "##targetNamespace"
		   });
	}

} //PageDiagramPackageImpl
