/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getBaseTable <em>Base Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getExtTable <em>Ext Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getViewType()
 * @model extendedMetaData="name='ViewType' kind='elementOnly'"
 * @generated
 */
public interface ViewType extends RDBType {
	/**
	 * Returns the value of the '<em><b>Base Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Table</em>' containment reference.
	 * @see #setBaseTable(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getViewType_BaseTable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getBaseTable();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getBaseTable <em>Base Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Table</em>' containment reference.
	 * @see #getBaseTable()
	 * @generated
	 */
	void setBaseTable(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Ext Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Table</em>' containment reference.
	 * @see #setExtTable(TargetEntityType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getViewType_ExtTable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetEntityType getExtTable();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getExtTable <em>Ext Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Table</em>' containment reference.
	 * @see #getExtTable()
	 * @generated
	 */
	void setExtTable(TargetEntityType value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType
	 * @see #isSetOp()
	 * @see #unsetOp()
	 * @see #setOp(ViewOpType)
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#getViewType_Op()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='op' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewOpType getOp();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType
	 * @see #isSetOp()
	 * @see #unsetOp()
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ViewOpType value);

	/**
	 * Unsets the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOp()
	 * @see #getOp()
	 * @see #setOp(ViewOpType)
	 * @generated
	 */
	void unsetOp();

	/**
	 * Returns whether the value of the '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType#getOp <em>Op</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Op</em>' attribute is set.
	 * @see #unsetOp()
	 * @see #getOp()
	 * @see #setOp(ViewOpType)
	 * @generated
	 */
	boolean isSetOp();

} // ViewType
