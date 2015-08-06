/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage
 * @generated
 */
public interface PageDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PageDiagramFactory eINSTANCE = org.shaolin.uimaster.datamodel.pagediagram.impl.PageDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conditional Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Out Type</em>'.
	 * @generated
	 */
	ConditionalOutType createConditionalOutType();

	/**
	 * Returns a new object of class '<em>Display Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Node Type</em>'.
	 * @generated
	 */
	DisplayNodeType createDisplayNodeType();

	/**
	 * Returns a new object of class '<em>Display Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Out Type</em>'.
	 * @generated
	 */
	DisplayOutType createDisplayOutType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Dynamic Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Out Type</em>'.
	 * @generated
	 */
	DynamicOutType createDynamicOutType();

	/**
	 * Returns a new object of class '<em>Flow Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Node Type</em>'.
	 * @generated
	 */
	FlowNodeType createFlowNodeType();

	/**
	 * Returns a new object of class '<em>Logic Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Node Type</em>'.
	 * @generated
	 */
	LogicNodeType createLogicNodeType();

	/**
	 * Returns a new object of class '<em>Next Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next Type</em>'.
	 * @generated
	 */
	NextType createNextType();

	/**
	 * Returns a new object of class '<em>Page Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Node Type</em>'.
	 * @generated
	 */
	PageNodeType createPageNodeType();

	/**
	 * Returns a new object of class '<em>Start Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Node Type</em>'.
	 * @generated
	 */
	StartNodeType createStartNodeType();

	/**
	 * Returns a new object of class '<em>Web Chunk Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Chunk Type</em>'.
	 * @generated
	 */
	WebChunkType createWebChunkType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PageDiagramPackage getPageDiagramPackage();

} //PageDiagramFactory
