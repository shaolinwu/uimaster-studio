/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import org.shaolin.uimaster.datamodel.common.MetaDataType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Relation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getEntity2 <em>Entity2</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedName <em>Refed Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedPriority <em>Refed Priority</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityRelationType()
 * @model extendedMetaData="name='EntityRelationType' kind='elementOnly'"
 * @generated
 */
public interface EntityRelationType extends MetaDataType {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityRelationType_Entity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getEntity();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Entity2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity2</em>' containment reference.
	 * @see #setEntity2(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityRelationType_Entity2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entity2' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getEntity2();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getEntity2 <em>Entity2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity2</em>' containment reference.
	 * @see #getEntity2()
	 * @generated
	 */
	void setEntity2(TargetEntityType value);

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
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityRelationType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(int)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityRelationType_Priority()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Refed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refed Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refed Name</em>' attribute.
	 * @see #setRefedName(String)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityRelationType_RefedName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='refedName'"
	 * @generated
	 */
	String getRefedName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedName <em>Refed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refed Name</em>' attribute.
	 * @see #getRefedName()
	 * @generated
	 */
	void setRefedName(String value);

	/**
	 * Returns the value of the '<em><b>Refed Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refed Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refed Priority</em>' attribute.
	 * @see #isSetRefedPriority()
	 * @see #unsetRefedPriority()
	 * @see #setRefedPriority(int)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityRelationType_RefedPriority()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='refedPriority'"
	 * @generated
	 */
	int getRefedPriority();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedPriority <em>Refed Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refed Priority</em>' attribute.
	 * @see #isSetRefedPriority()
	 * @see #unsetRefedPriority()
	 * @see #getRefedPriority()
	 * @generated
	 */
	void setRefedPriority(int value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedPriority <em>Refed Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefedPriority()
	 * @see #getRefedPriority()
	 * @see #setRefedPriority(int)
	 * @generated
	 */
	void unsetRefedPriority();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getRefedPriority <em>Refed Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refed Priority</em>' attribute is set.
	 * @see #unsetRefedPriority()
	 * @see #getRefedPriority()
	 * @see #setRefedPriority(int)
	 * @generated
	 */
	boolean isSetRefedPriority();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.shaolin.uimaster.datamodel.bediagram.RelationTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationTypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(RelationTypeType)
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getEntityRelationType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	RelationTypeType getType();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationTypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationTypeType value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(RelationTypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(RelationTypeType)
	 * @generated
	 */
	boolean isSetType();

} // EntityRelationType
