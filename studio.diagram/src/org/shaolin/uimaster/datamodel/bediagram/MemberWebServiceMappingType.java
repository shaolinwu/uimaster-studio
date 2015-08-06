/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.shaolin.uimaster.datamodel.common.MetaDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Web Service Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isCollectionWrapped <em>Collection Wrapped</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberWebServiceMappingType()
 * @model extendedMetaData="name='MemberWebServiceMappingType' kind='empty'"
 * @generated
 */
public interface MemberWebServiceMappingType extends MetaDataType {
	/**
	 * Returns the value of the '<em><b>Collection Wrapped</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Wrapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Wrapped</em>' attribute.
	 * @see #isSetCollectionWrapped()
	 * @see #unsetCollectionWrapped()
	 * @see #setCollectionWrapped(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberWebServiceMappingType_CollectionWrapped()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='collectionWrapped'"
	 * @generated
	 */
	boolean isCollectionWrapped();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isCollectionWrapped <em>Collection Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Wrapped</em>' attribute.
	 * @see #isSetCollectionWrapped()
	 * @see #unsetCollectionWrapped()
	 * @see #isCollectionWrapped()
	 * @generated
	 */
	void setCollectionWrapped(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isCollectionWrapped <em>Collection Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCollectionWrapped()
	 * @see #isCollectionWrapped()
	 * @see #setCollectionWrapped(boolean)
	 * @generated
	 */
	void unsetCollectionWrapped();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isCollectionWrapped <em>Collection Wrapped</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Collection Wrapped</em>' attribute is set.
	 * @see #unsetCollectionWrapped()
	 * @see #isCollectionWrapped()
	 * @see #setCollectionWrapped(boolean)
	 * @generated
	 */
	boolean isSetCollectionWrapped();

	/**
	 * Returns the value of the '<em><b>Ignore</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore</em>' attribute.
	 * @see #isSetIgnore()
	 * @see #unsetIgnore()
	 * @see #setIgnore(boolean)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberWebServiceMappingType_Ignore()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ignore'"
	 * @generated
	 */
	boolean isIgnore();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isIgnore <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore</em>' attribute.
	 * @see #isSetIgnore()
	 * @see #unsetIgnore()
	 * @see #isIgnore()
	 * @generated
	 */
	void setIgnore(boolean value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isIgnore <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnore()
	 * @see #isIgnore()
	 * @see #setIgnore(boolean)
	 * @generated
	 */
	void unsetIgnore();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#isIgnore <em>Ignore</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore</em>' attribute is set.
	 * @see #unsetIgnore()
	 * @see #isIgnore()
	 * @see #setIgnore(boolean)
	 * @generated
	 */
	boolean isSetIgnore();

	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Name</em>' attribute.
	 * @see #setMappedName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberWebServiceMappingType_MappedName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mappedName'"
	 * @generated
	 */
	String getMappedName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getMappedName <em>Mapped Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' attribute.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"element"</code>.
	 * The literals are from the enumeration {@link org.shaolin.uimaster.datamodel.bediagram.StyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.bediagram.StyleType
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #setStyle(StyleType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getMemberWebServiceMappingType_Style()
	 * @model default="element" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	StyleType getStyle();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.bediagram.StyleType
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleType value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleType)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType#getStyle <em>Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style</em>' attribute is set.
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleType)
	 * @generated
	 */
	boolean isSetStyle();

} // MemberWebServiceMappingType
