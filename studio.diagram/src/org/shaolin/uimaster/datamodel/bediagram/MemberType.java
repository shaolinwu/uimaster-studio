/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.shaolin.uimaster.datamodel.common.MetaDataInfoType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getType <em>Type</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getMetaInfo <em>Meta Info</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isAccessible <em>Accessible</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isModifiable <em>Modifiable</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isTransient <em>Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberType()
 * @model extendedMetaData="name='MemberType' kind='elementOnly'"
 * @generated
 */
public interface MemberType extends EObject {
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
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * default value expression string
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberType_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(BEType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberType_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	BEType getType();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(BEType value);

	/**
	 * Returns the value of the '<em><b>Meta Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.common.MetaDataInfoType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Info</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberType_MetaInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metaInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MetaDataInfoType> getMetaInfo();

	/**
	 * Returns the value of the '<em><b>Accessible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible</em>' attribute.
	 * @see #isSetAccessible()
	 * @see #unsetAccessible()
	 * @see #setAccessible(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberType_Accessible()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='accessible'"
	 * @generated
	 */
	boolean isAccessible();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isAccessible <em>Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessible</em>' attribute.
	 * @see #isSetAccessible()
	 * @see #unsetAccessible()
	 * @see #isAccessible()
	 * @generated
	 */
	void setAccessible(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isAccessible <em>Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessible()
	 * @see #isAccessible()
	 * @see #setAccessible(boolean)
	 * @generated
	 */
	void unsetAccessible();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isAccessible <em>Accessible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accessible</em>' attribute is set.
	 * @see #unsetAccessible()
	 * @see #isAccessible()
	 * @see #setAccessible(boolean)
	 * @generated
	 */
	boolean isSetAccessible();

	/**
	 * Returns the value of the '<em><b>Modifiable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiable</em>' attribute.
	 * @see #isSetModifiable()
	 * @see #unsetModifiable()
	 * @see #setModifiable(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberType_Modifiable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='modifiable'"
	 * @generated
	 */
	boolean isModifiable();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isModifiable <em>Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifiable</em>' attribute.
	 * @see #isSetModifiable()
	 * @see #unsetModifiable()
	 * @see #isModifiable()
	 * @generated
	 */
	void setModifiable(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isModifiable <em>Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModifiable()
	 * @see #isModifiable()
	 * @see #setModifiable(boolean)
	 * @generated
	 */
	void unsetModifiable();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isModifiable <em>Modifiable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modifiable</em>' attribute is set.
	 * @see #unsetModifiable()
	 * @see #isModifiable()
	 * @see #setModifiable(boolean)
	 * @generated
	 */
	boolean isSetModifiable();

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #isSetTransient()
	 * @see #unsetTransient()
	 * @see #setTransient(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberType_Transient()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='transient'"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isSetTransient()
	 * @see #unsetTransient()
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransient()
	 * @see #isTransient()
	 * @see #setTransient(boolean)
	 * @generated
	 */
	void unsetTransient();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType#isTransient <em>Transient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transient</em>' attribute is set.
	 * @see #unsetTransient()
	 * @see #isTransient()
	 * @see #setTransient(boolean)
	 * @generated
	 */
	boolean isSetTransient();

} // MemberType
