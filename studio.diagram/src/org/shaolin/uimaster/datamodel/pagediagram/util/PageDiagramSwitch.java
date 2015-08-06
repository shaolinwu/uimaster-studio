/**
 */
package org.shaolin.uimaster.datamodel.pagediagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.shaolin.uimaster.datamodel.common.EntityType;

import org.shaolin.uimaster.datamodel.pagediagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage
 * @generated
 */
public class PageDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PageDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = PageDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PageDiagramPackage.CONDITIONAL_OUT_TYPE: {
				ConditionalOutType conditionalOutType = (ConditionalOutType)theEObject;
				T result = caseConditionalOutType(conditionalOutType);
				if (result == null) result = caseOutType(conditionalOutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.DISPLAY_NODE_TYPE: {
				DisplayNodeType displayNodeType = (DisplayNodeType)theEObject;
				T result = caseDisplayNodeType(displayNodeType);
				if (result == null) result = caseWebNodeType(displayNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.DISPLAY_OUT_TYPE: {
				DisplayOutType displayOutType = (DisplayOutType)theEObject;
				T result = caseDisplayOutType(displayOutType);
				if (result == null) result = caseOutType(displayOutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.DYNAMIC_OUT_TYPE: {
				DynamicOutType dynamicOutType = (DynamicOutType)theEObject;
				T result = caseDynamicOutType(dynamicOutType);
				if (result == null) result = caseOutType(dynamicOutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.FLOW_NODE_TYPE: {
				FlowNodeType flowNodeType = (FlowNodeType)theEObject;
				T result = caseFlowNodeType(flowNodeType);
				if (result == null) result = caseWebNodeType(flowNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.LOGIC_NODE_TYPE: {
				LogicNodeType logicNodeType = (LogicNodeType)theEObject;
				T result = caseLogicNodeType(logicNodeType);
				if (result == null) result = caseWebNodeType(logicNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.NEXT_TYPE: {
				NextType nextType = (NextType)theEObject;
				T result = caseNextType(nextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.OUT_TYPE: {
				OutType outType = (OutType)theEObject;
				T result = caseOutType(outType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.PAGE_NODE_TYPE: {
				PageNodeType pageNodeType = (PageNodeType)theEObject;
				T result = casePageNodeType(pageNodeType);
				if (result == null) result = caseWebNodeType(pageNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.START_NODE_TYPE: {
				StartNodeType startNodeType = (StartNodeType)theEObject;
				T result = caseStartNodeType(startNodeType);
				if (result == null) result = caseLogicNodeType(startNodeType);
				if (result == null) result = caseWebNodeType(startNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.WEB_CHUNK_TYPE: {
				WebChunkType webChunkType = (WebChunkType)theEObject;
				T result = caseWebChunkType(webChunkType);
				if (result == null) result = caseEntityType(webChunkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PageDiagramPackage.WEB_NODE_TYPE: {
				WebNodeType webNodeType = (WebNodeType)theEObject;
				T result = caseWebNodeType(webNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalOutType(ConditionalOutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayNodeType(DisplayNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayOutType(DisplayOutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicOutType(DynamicOutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNodeType(FlowNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicNodeType(LogicNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextType(NextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutType(OutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageNodeType(PageNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartNodeType(StartNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Chunk Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Chunk Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebChunkType(WebChunkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebNodeType(WebNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityType(EntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PageDiagramSwitch
