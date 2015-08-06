/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.eclipse.emf.common.util.EList;

import org.shaolin.uimaster.datamodel.common.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getParentObject <em>Parent Object</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getMember <em>Member</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getPersistentConfig <em>Persistent Config</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getValidatorConfig <em>Validator Config</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getSearchMethod <em>Search Method</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isExtensible <em>Extensible</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedEquals <em>Need Equals</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedHistory <em>Need History</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType()
 * @model extendedMetaData="name='BusinessEntityType' kind='elementOnly'"
 * @generated
 */
public interface BusinessEntityType extends EntityType {
	/**
	 * Returns the value of the '<em><b>Parent Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Object</em>' containment reference.
	 * @see #setParentObject(ObjectRefType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType_ParentObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentObject' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectRefType getParentObject();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getParentObject <em>Parent Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Object</em>' containment reference.
	 * @see #getParentObject()
	 * @generated
	 */
	void setParentObject(ObjectRefType value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.bediagram.MemberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MemberType> getMember();

	/**
	 * Returns the value of the '<em><b>Persistent Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent Config</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType_PersistentConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistentConfig' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersistentConfigType> getPersistentConfig();

	/**
	 * Returns the value of the '<em><b>Validator Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Config</em>' containment reference.
	 * @see #setValidatorConfig(ValidatorConfigType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType_ValidatorConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validatorConfig' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidatorConfigType getValidatorConfig();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getValidatorConfig <em>Validator Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator Config</em>' containment reference.
	 * @see #getValidatorConfig()
	 * @generated
	 */
	void setValidatorConfig(ValidatorConfigType value);

	/**
	 * Returns the value of the '<em><b>Search Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Method</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType_SearchMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SearchMethodType> getSearchMethod();

	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' attribute.
	 * @see #setAbbreviation(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType_Abbreviation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='abbreviation'"
	 * @generated
	 */
	String getAbbreviation();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#getAbbreviation <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' attribute.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(String value);

	/**
	 * Returns the value of the '<em><b>Extensible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensible</em>' attribute.
	 * @see #isSetExtensible()
	 * @see #unsetExtensible()
	 * @see #setExtensible(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType_Extensible()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='extensible'"
	 * @generated
	 */
	boolean isExtensible();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isExtensible <em>Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensible</em>' attribute.
	 * @see #isSetExtensible()
	 * @see #unsetExtensible()
	 * @see #isExtensible()
	 * @generated
	 */
	void setExtensible(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isExtensible <em>Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtensible()
	 * @see #isExtensible()
	 * @see #setExtensible(boolean)
	 * @generated
	 */
	void unsetExtensible();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isExtensible <em>Extensible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extensible</em>' attribute is set.
	 * @see #unsetExtensible()
	 * @see #isExtensible()
	 * @see #setExtensible(boolean)
	 * @generated
	 */
	boolean isSetExtensible();

	/**
	 * Returns the value of the '<em><b>Need Equals</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need Equals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Equals</em>' attribute.
	 * @see #isSetNeedEquals()
	 * @see #unsetNeedEquals()
	 * @see #setNeedEquals(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType_NeedEquals()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='needEquals'"
	 * @generated
	 */
	boolean isNeedEquals();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedEquals <em>Need Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Equals</em>' attribute.
	 * @see #isSetNeedEquals()
	 * @see #unsetNeedEquals()
	 * @see #isNeedEquals()
	 * @generated
	 */
	void setNeedEquals(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedEquals <em>Need Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedEquals()
	 * @see #isNeedEquals()
	 * @see #setNeedEquals(boolean)
	 * @generated
	 */
	void unsetNeedEquals();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedEquals <em>Need Equals</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Need Equals</em>' attribute is set.
	 * @see #unsetNeedEquals()
	 * @see #isNeedEquals()
	 * @see #setNeedEquals(boolean)
	 * @generated
	 */
	boolean isSetNeedEquals();

	/**
	 * Returns the value of the '<em><b>Need History</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need History</em>' attribute.
	 * @see #isSetNeedHistory()
	 * @see #unsetNeedHistory()
	 * @see #setNeedHistory(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getBusinessEntityType_NeedHistory()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='needHistory'"
	 * @generated
	 */
	boolean isNeedHistory();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedHistory <em>Need History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need History</em>' attribute.
	 * @see #isSetNeedHistory()
	 * @see #unsetNeedHistory()
	 * @see #isNeedHistory()
	 * @generated
	 */
	void setNeedHistory(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedHistory <em>Need History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedHistory()
	 * @see #isNeedHistory()
	 * @see #setNeedHistory(boolean)
	 * @generated
	 */
	void unsetNeedHistory();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType#isNeedHistory <em>Need History</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Need History</em>' attribute is set.
	 * @see #unsetNeedHistory()
	 * @see #isNeedHistory()
	 * @see #setNeedHistory(boolean)
	 * @generated
	 */
	boolean isSetNeedHistory();

} // BusinessEntityType
