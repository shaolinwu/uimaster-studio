/**
 */
package org.shaolin.uimaster.datamodel.pagediagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.shaolin.uimaster.datamodel.common.EntityType;

import org.shaolin.uimaster.datamodel.pagediagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage
 * @generated
 */
public class PageDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PageDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PageDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageDiagramSwitch<Adapter> modelSwitch =
		new PageDiagramSwitch<Adapter>() {
			@Override
			public Adapter caseConditionalOutType(ConditionalOutType object) {
				return createConditionalOutTypeAdapter();
			}
			@Override
			public Adapter caseDisplayNodeType(DisplayNodeType object) {
				return createDisplayNodeTypeAdapter();
			}
			@Override
			public Adapter caseDisplayOutType(DisplayOutType object) {
				return createDisplayOutTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDynamicOutType(DynamicOutType object) {
				return createDynamicOutTypeAdapter();
			}
			@Override
			public Adapter caseFlowNodeType(FlowNodeType object) {
				return createFlowNodeTypeAdapter();
			}
			@Override
			public Adapter caseLogicNodeType(LogicNodeType object) {
				return createLogicNodeTypeAdapter();
			}
			@Override
			public Adapter caseNextType(NextType object) {
				return createNextTypeAdapter();
			}
			@Override
			public Adapter caseOutType(OutType object) {
				return createOutTypeAdapter();
			}
			@Override
			public Adapter casePageNodeType(PageNodeType object) {
				return createPageNodeTypeAdapter();
			}
			@Override
			public Adapter caseStartNodeType(StartNodeType object) {
				return createStartNodeTypeAdapter();
			}
			@Override
			public Adapter caseWebChunkType(WebChunkType object) {
				return createWebChunkTypeAdapter();
			}
			@Override
			public Adapter caseWebNodeType(WebNodeType object) {
				return createWebNodeTypeAdapter();
			}
			@Override
			public Adapter caseEntityType(EntityType object) {
				return createEntityTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType <em>Conditional Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.ConditionalOutType
	 * @generated
	 */
	public Adapter createConditionalOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType <em>Display Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType
	 * @generated
	 */
	public Adapter createDisplayNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType <em>Display Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType
	 * @generated
	 */
	public Adapter createDisplayOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.DynamicOutType <em>Dynamic Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.DynamicOutType
	 * @generated
	 */
	public Adapter createDynamicOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType <em>Flow Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType
	 * @generated
	 */
	public Adapter createFlowNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType <em>Logic Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType
	 * @generated
	 */
	public Adapter createLogicNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.NextType <em>Next Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.NextType
	 * @generated
	 */
	public Adapter createNextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.OutType <em>Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.OutType
	 * @generated
	 */
	public Adapter createOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.PageNodeType <em>Page Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageNodeType
	 * @generated
	 */
	public Adapter createPageNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.StartNodeType <em>Start Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.StartNodeType
	 * @generated
	 */
	public Adapter createStartNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.WebChunkType <em>Web Chunk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebChunkType
	 * @generated
	 */
	public Adapter createWebChunkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.pagediagram.WebNodeType <em>Web Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.WebNodeType
	 * @generated
	 */
	public Adapter createWebNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.common.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.common.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PageDiagramAdapterFactory
