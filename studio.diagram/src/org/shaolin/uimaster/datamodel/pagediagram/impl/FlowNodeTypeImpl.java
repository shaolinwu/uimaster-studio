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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shaolin.uimaster.datamodel.common.NameExpressionType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;

import org.shaolin.uimaster.datamodel.pagediagram.FlowNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.FlowNodeTypeImpl#getDestChunkName <em>Dest Chunk Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.FlowNodeTypeImpl#getDestNode <em>Dest Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.FlowNodeTypeImpl#getDataMappingToNode <em>Data Mapping To Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.FlowNodeTypeImpl#getDataMappingToChunk <em>Data Mapping To Chunk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowNodeTypeImpl extends WebNodeTypeImpl implements FlowNodeType {
	/**
	 * The cached value of the '{@link #getDestChunkName() <em>Dest Chunk Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestChunkName()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType destChunkName;

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
	 * The cached value of the '{@link #getDataMappingToNode() <em>Data Mapping To Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMappingToNode()
	 * @generated
	 * @ordered
	 */
	protected EList<NameExpressionType> dataMappingToNode;

	/**
	 * The cached value of the '{@link #getDataMappingToChunk() <em>Data Mapping To Chunk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMappingToChunk()
	 * @generated
	 * @ordered
	 */
	protected EList<NameExpressionType> dataMappingToChunk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PageDiagramPackage.Literals.FLOW_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getDestChunkName() {
		return destChunkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestChunkName(TargetEntityType newDestChunkName, NotificationChain msgs) {
		TargetEntityType oldDestChunkName = destChunkName;
		destChunkName = newDestChunkName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageDiagramPackage.FLOW_NODE_TYPE__DEST_CHUNK_NAME, oldDestChunkName, newDestChunkName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestChunkName(TargetEntityType newDestChunkName) {
		if (newDestChunkName != destChunkName) {
			NotificationChain msgs = null;
			if (destChunkName != null)
				msgs = ((InternalEObject)destChunkName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.FLOW_NODE_TYPE__DEST_CHUNK_NAME, null, msgs);
			if (newDestChunkName != null)
				msgs = ((InternalEObject)newDestChunkName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.FLOW_NODE_TYPE__DEST_CHUNK_NAME, null, msgs);
			msgs = basicSetDestChunkName(newDestChunkName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.FLOW_NODE_TYPE__DEST_CHUNK_NAME, newDestChunkName, newDestChunkName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.FLOW_NODE_TYPE__DEST_NODE, oldDestNode, destNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameExpressionType> getDataMappingToNode() {
		if (dataMappingToNode == null) {
			dataMappingToNode = new EObjectContainmentEList<NameExpressionType>(NameExpressionType.class, this, PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_NODE);
		}
		return dataMappingToNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameExpressionType> getDataMappingToChunk() {
		if (dataMappingToChunk == null) {
			dataMappingToChunk = new EObjectContainmentEList<NameExpressionType>(NameExpressionType.class, this, PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_CHUNK);
		}
		return dataMappingToChunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PageDiagramPackage.FLOW_NODE_TYPE__DEST_CHUNK_NAME:
				return basicSetDestChunkName(null, msgs);
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_NODE:
				return ((InternalEList<?>)getDataMappingToNode()).basicRemove(otherEnd, msgs);
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_CHUNK:
				return ((InternalEList<?>)getDataMappingToChunk()).basicRemove(otherEnd, msgs);
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
			case PageDiagramPackage.FLOW_NODE_TYPE__DEST_CHUNK_NAME:
				return getDestChunkName();
			case PageDiagramPackage.FLOW_NODE_TYPE__DEST_NODE:
				return getDestNode();
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_NODE:
				return getDataMappingToNode();
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_CHUNK:
				return getDataMappingToChunk();
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
			case PageDiagramPackage.FLOW_NODE_TYPE__DEST_CHUNK_NAME:
				setDestChunkName((TargetEntityType)newValue);
				return;
			case PageDiagramPackage.FLOW_NODE_TYPE__DEST_NODE:
				setDestNode((String)newValue);
				return;
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_NODE:
				getDataMappingToNode().clear();
				getDataMappingToNode().addAll((Collection<? extends NameExpressionType>)newValue);
				return;
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_CHUNK:
				getDataMappingToChunk().clear();
				getDataMappingToChunk().addAll((Collection<? extends NameExpressionType>)newValue);
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
			case PageDiagramPackage.FLOW_NODE_TYPE__DEST_CHUNK_NAME:
				setDestChunkName((TargetEntityType)null);
				return;
			case PageDiagramPackage.FLOW_NODE_TYPE__DEST_NODE:
				setDestNode(DEST_NODE_EDEFAULT);
				return;
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_NODE:
				getDataMappingToNode().clear();
				return;
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_CHUNK:
				getDataMappingToChunk().clear();
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
			case PageDiagramPackage.FLOW_NODE_TYPE__DEST_CHUNK_NAME:
				return destChunkName != null;
			case PageDiagramPackage.FLOW_NODE_TYPE__DEST_NODE:
				return DEST_NODE_EDEFAULT == null ? destNode != null : !DEST_NODE_EDEFAULT.equals(destNode);
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_NODE:
				return dataMappingToNode != null && !dataMappingToNode.isEmpty();
			case PageDiagramPackage.FLOW_NODE_TYPE__DATA_MAPPING_TO_CHUNK:
				return dataMappingToChunk != null && !dataMappingToChunk.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //FlowNodeTypeImpl
