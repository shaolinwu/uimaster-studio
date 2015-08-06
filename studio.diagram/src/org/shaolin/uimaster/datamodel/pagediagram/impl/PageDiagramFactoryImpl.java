/**
 */
package org.shaolin.uimaster.datamodel.pagediagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.shaolin.uimaster.datamodel.pagediagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PageDiagramFactoryImpl extends EFactoryImpl implements PageDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PageDiagramFactory init() {
		try {
			PageDiagramFactory thePageDiagramFactory = (PageDiagramFactory)EPackage.Registry.INSTANCE.getEFactory("http://uimaster.shaolin.org/datamodel/PageDiagram"); 
			if (thePageDiagramFactory != null) {
				return thePageDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PageDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PageDiagramPackage.CONDITIONAL_OUT_TYPE: return createConditionalOutType();
			case PageDiagramPackage.DISPLAY_NODE_TYPE: return createDisplayNodeType();
			case PageDiagramPackage.DISPLAY_OUT_TYPE: return createDisplayOutType();
			case PageDiagramPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case PageDiagramPackage.DYNAMIC_OUT_TYPE: return createDynamicOutType();
			case PageDiagramPackage.FLOW_NODE_TYPE: return createFlowNodeType();
			case PageDiagramPackage.LOGIC_NODE_TYPE: return createLogicNodeType();
			case PageDiagramPackage.NEXT_TYPE: return createNextType();
			case PageDiagramPackage.PAGE_NODE_TYPE: return createPageNodeType();
			case PageDiagramPackage.START_NODE_TYPE: return createStartNodeType();
			case PageDiagramPackage.WEB_CHUNK_TYPE: return createWebChunkType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalOutType createConditionalOutType() {
		ConditionalOutTypeImpl conditionalOutType = new ConditionalOutTypeImpl();
		return conditionalOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayNodeType createDisplayNodeType() {
		DisplayNodeTypeImpl displayNodeType = new DisplayNodeTypeImpl();
		return displayNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayOutType createDisplayOutType() {
		DisplayOutTypeImpl displayOutType = new DisplayOutTypeImpl();
		return displayOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicOutType createDynamicOutType() {
		DynamicOutTypeImpl dynamicOutType = new DynamicOutTypeImpl();
		return dynamicOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNodeType createFlowNodeType() {
		FlowNodeTypeImpl flowNodeType = new FlowNodeTypeImpl();
		return flowNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicNodeType createLogicNodeType() {
		LogicNodeTypeImpl logicNodeType = new LogicNodeTypeImpl();
		return logicNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextType createNextType() {
		NextTypeImpl nextType = new NextTypeImpl();
		return nextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageNodeType createPageNodeType() {
		PageNodeTypeImpl pageNodeType = new PageNodeTypeImpl();
		return pageNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNodeType createStartNodeType() {
		StartNodeTypeImpl startNodeType = new StartNodeTypeImpl();
		return startNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebChunkType createWebChunkType() {
		WebChunkTypeImpl webChunkType = new WebChunkTypeImpl();
		return webChunkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageDiagramPackage getPageDiagramPackage() {
		return (PageDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PageDiagramPackage getPackage() {
		return PageDiagramPackage.eINSTANCE;
	}

} //PageDiagramFactoryImpl
