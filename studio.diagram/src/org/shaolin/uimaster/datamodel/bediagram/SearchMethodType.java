/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.eclipse.emf.ecore.EObject;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getQuery <em>Query</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getConditionMappingName <em>Condition Mapping Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getSearchMethodType()
 * @model extendedMetaData="name='SearchMethodType' kind='elementOnly'"
 * @generated
 */
public interface SearchMethodType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getSearchMethodType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getSearchMethodType_Query()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getQuery();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Condition Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Mapping Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Mapping Name</em>' attribute.
	 * @see #setConditionMappingName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getSearchMethodType_ConditionMappingName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='conditionMappingName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConditionMappingName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType#getConditionMappingName <em>Condition Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Mapping Name</em>' attribute.
	 * @see #getConditionMappingName()
	 * @generated
	 */
	void setConditionMappingName(String value);

} // SearchMethodType
