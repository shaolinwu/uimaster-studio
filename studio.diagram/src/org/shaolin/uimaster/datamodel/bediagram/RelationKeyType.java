/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.shaolin.uimaster.datamodel.common.MetaDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Key Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#isIsEntity2 <em>Is Entity2</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#getRelationName <em>Relation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getRelationKeyType()
 * @model extendedMetaData="name='RelationKeyType' kind='empty'"
 * @generated
 */
public interface RelationKeyType extends MetaDataType {
	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getRelationKeyType_FieldName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='fieldName'"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Is Entity2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Entity2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entity2</em>' attribute.
	 * @see #isSetIsEntity2()
	 * @see #unsetIsEntity2()
	 * @see #setIsEntity2(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getRelationKeyType_IsEntity2()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isEntity2'"
	 * @generated
	 */
	boolean isIsEntity2();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#isIsEntity2 <em>Is Entity2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entity2</em>' attribute.
	 * @see #isSetIsEntity2()
	 * @see #unsetIsEntity2()
	 * @see #isIsEntity2()
	 * @generated
	 */
	void setIsEntity2(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#isIsEntity2 <em>Is Entity2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsEntity2()
	 * @see #isIsEntity2()
	 * @see #setIsEntity2(boolean)
	 * @generated
	 */
	void unsetIsEntity2();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#isIsEntity2 <em>Is Entity2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Entity2</em>' attribute is set.
	 * @see #unsetIsEntity2()
	 * @see #isIsEntity2()
	 * @see #setIsEntity2(boolean)
	 * @generated
	 */
	boolean isSetIsEntity2();

	/**
	 * Returns the value of the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Name</em>' attribute.
	 * @see #setRelationName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getRelationKeyType_RelationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='relationName'"
	 * @generated
	 */
	String getRelationName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType#getRelationName <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Name</em>' attribute.
	 * @see #getRelationName()
	 * @generated
	 */
	void setRelationName(String value);

} // RelationKeyType
