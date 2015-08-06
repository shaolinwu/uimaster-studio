/**
 */
package org.shaolin.uimaster.datamodel.pagediagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.shaolin.uimaster.datamodel.common.NameExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * specified the out for WebNode.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.OutType#getNext <em>Next</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.OutType#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.OutType#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getOutType()
 * @model abstract="true"
 *        extendedMetaData="name='OutType' kind='elementOnly'"
 * @generated
 */
public interface OutType extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(NextType)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getOutType_Next()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='next' namespace='##targetNamespace'"
	 * @generated
	 */
	NextType getNext();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.OutType#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(NextType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specify the name of the branch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getOutType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.shaolin.uimaster.datamodel.pagediagram.OutType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.shaolin.uimaster.datamodel.common.NameExpressionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage#getOutType_Mappings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameExpressionType> getMappings();

} // OutType
