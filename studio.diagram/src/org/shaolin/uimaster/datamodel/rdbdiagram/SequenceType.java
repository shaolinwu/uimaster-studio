/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getDbcache <em>Dbcache</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getStartWith <em>Start With</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getSequenceType()
 * @model extendedMetaData="name='SequenceType' kind='empty'"
 * @generated
 */
public interface SequenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dbcache</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbcache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbcache</em>' attribute.
	 * @see #isSetDbcache()
	 * @see #unsetDbcache()
	 * @see #setDbcache(int)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getSequenceType_Dbcache()
	 * @model default="20" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='dbcache'"
	 * @generated
	 */
	int getDbcache();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getDbcache <em>Dbcache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbcache</em>' attribute.
	 * @see #isSetDbcache()
	 * @see #unsetDbcache()
	 * @see #getDbcache()
	 * @generated
	 */
	void setDbcache(int value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getDbcache <em>Dbcache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDbcache()
	 * @see #getDbcache()
	 * @see #setDbcache(int)
	 * @generated
	 */
	void unsetDbcache();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getDbcache <em>Dbcache</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dbcache</em>' attribute is set.
	 * @see #unsetDbcache()
	 * @see #getDbcache()
	 * @see #setDbcache(int)
	 * @generated
	 */
	boolean isSetDbcache();

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
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getSequenceType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #isSetSpan()
	 * @see #unsetSpan()
	 * @see #setSpan(int)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getSequenceType_Span()
	 * @model default="10" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='span'"
	 * @generated
	 */
	int getSpan();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #isSetSpan()
	 * @see #unsetSpan()
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(int value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpan()
	 * @see #getSpan()
	 * @see #setSpan(int)
	 * @generated
	 */
	void unsetSpan();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getSpan <em>Span</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Span</em>' attribute is set.
	 * @see #unsetSpan()
	 * @see #getSpan()
	 * @see #setSpan(int)
	 * @generated
	 */
	boolean isSetSpan();

	/**
	 * Returns the value of the '<em><b>Start With</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start With</em>' attribute.
	 * @see #isSetStartWith()
	 * @see #unsetStartWith()
	 * @see #setStartWith(int)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getSequenceType_StartWith()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='startWith'"
	 * @generated
	 */
	int getStartWith();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getStartWith <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start With</em>' attribute.
	 * @see #isSetStartWith()
	 * @see #unsetStartWith()
	 * @see #getStartWith()
	 * @generated
	 */
	void setStartWith(int value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getStartWith <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartWith()
	 * @see #getStartWith()
	 * @see #setStartWith(int)
	 * @generated
	 */
	void unsetStartWith();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType#getStartWith <em>Start With</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start With</em>' attribute is set.
	 * @see #unsetStartWith()
	 * @see #getStartWith()
	 * @see #setStartWith(int)
	 * @generated
	 */
	boolean isSetStartWith();

} // SequenceType
