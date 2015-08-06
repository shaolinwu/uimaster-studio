/**
 */
package org.shaolin.uimaster.datamodel.pagediagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shaolin.uimaster.datamodel.common.NameExpressionType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;

import org.shaolin.uimaster.datamodel.pagediagram.NextType;
import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Next Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.NextTypeImpl#getDestNode <em>Dest Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.NextTypeImpl#getOutDataMappingToNode <em>Out Data Mapping To Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.NextTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NextTypeImpl extends EObjectImpl implements NextType {
	/**
	 * The default value of the '{@link #getDestNode() <em>Dest Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestNode()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestNode() <em>Dest Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestNode()
	 * @generated
	 * @ordered
	 */
	protected String destNode = DEST_NODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutDataMappingToNode() <em>Out Data Mapping To Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutDataMappingToNode()
	 * @generated
	 * @ordered
	 */
	protected EList<NameExpressionType> outDataMappingToNode;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PageDiagramPackage.Literals.NEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestNode() {
		return destNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestNode(String newDestNode) {
		String oldDestNode = destNode;
		destNode = newDestNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.NEXT_TYPE__DEST_NODE, oldDestNode, destNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameExpressionType> getOutDataMappingToNode() {
		if (outDataMappingToNode == null) {
			outDataMappingToNode = new EObjectContainmentEList<NameExpressionType>(NameExpressionType.class, this, PageDiagramPackage.NEXT_TYPE__OUT_DATA_MAPPING_TO_NODE);
		}
		return outDataMappingToNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.NEXT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PageDiagramPackage.NEXT_TYPE__OUT_DATA_MAPPING_TO_NODE:
				return ((InternalEList<?>)getOutDataMappingToNode()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PageDiagramPackage.NEXT_TYPE__DEST_NODE:
				return getDestNode();
			case PageDiagramPackage.NEXT_TYPE__OUT_DATA_MAPPING_TO_NODE:
				return getOutDataMappingToNode();
			case PageDiagramPackage.NEXT_TYPE__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PageDiagramPackage.NEXT_TYPE__DEST_NODE:
				setDestNode((String)newValue);
				return;
			case PageDiagramPackage.NEXT_TYPE__OUT_DATA_MAPPING_TO_NODE:
				getOutDataMappingToNode().clear();
				getOutDataMappingToNode().addAll((Collection<? extends NameExpressionType>)newValue);
				return;
			case PageDiagramPackage.NEXT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PageDiagramPackage.NEXT_TYPE__DEST_NODE:
				setDestNode(DEST_NODE_EDEFAULT);
				return;
			case PageDiagramPackage.NEXT_TYPE__OUT_DATA_MAPPING_TO_NODE:
				getOutDataMappingToNode().clear();
				return;
			case PageDiagramPackage.NEXT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PageDiagramPackage.NEXT_TYPE__DEST_NODE:
				return DEST_NODE_EDEFAULT == null ? destNode != null : !DEST_NODE_EDEFAULT.equals(destNode);
			case PageDiagramPackage.NEXT_TYPE__OUT_DATA_MAPPING_TO_NODE:
				return outDataMappingToNode != null && !outDataMappingToNode.isEmpty();
			case PageDiagramPackage.NEXT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (destNode: ");
		result.append(destNode);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //NextTypeImpl
