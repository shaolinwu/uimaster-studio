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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shaolin.uimaster.datamodel.common.ParamType;

import org.shaolin.uimaster.datamodel.common.impl.EntityTypeImpl;

import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage;
import org.shaolin.uimaster.datamodel.pagediagram.WebChunkType;
import org.shaolin.uimaster.datamodel.pagediagram.WebNodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Chunk Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebChunkTypeImpl#getWebNode <em>Web Node</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebChunkTypeImpl#getGlobalVariable <em>Global Variable</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebChunkTypeImpl#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebChunkTypeImpl#getAccessPermission <em>Access Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebChunkTypeImpl extends EntityTypeImpl implements WebChunkType {
	/**
	 * The cached value of the '{@link #getWebNode() <em>Web Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebNode()
	 * @generated
	 * @ordered
	 */
	protected EList<WebNodeType> webNode;

	/**
	 * The cached value of the '{@link #getGlobalVariable() <em>Global Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamType> globalVariable;

	/**
	 * The default value of the '{@link #getErrorHandler() <em>Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_HANDLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorHandler() <em>Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected String errorHandler = ERROR_HANDLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessPermission() <em>Access Permission</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<String> accessPermission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebChunkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PageDiagramPackage.Literals.WEB_CHUNK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebNodeType> getWebNode() {
		if (webNode == null) {
			webNode = new EObjectContainmentEList<WebNodeType>(WebNodeType.class, this, PageDiagramPackage.WEB_CHUNK_TYPE__WEB_NODE);
		}
		return webNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamType> getGlobalVariable() {
		if (globalVariable == null) {
			globalVariable = new EObjectContainmentEList<ParamType>(ParamType.class, this, PageDiagramPackage.WEB_CHUNK_TYPE__GLOBAL_VARIABLE);
		}
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorHandler() {
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorHandler(String newErrorHandler) {
		String oldErrorHandler = errorHandler;
		errorHandler = newErrorHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.WEB_CHUNK_TYPE__ERROR_HANDLER, oldErrorHandler, errorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAccessPermission() {
		if (accessPermission == null) {
			accessPermission = new EDataTypeEList<String>(String.class, this, PageDiagramPackage.WEB_CHUNK_TYPE__ACCESS_PERMISSION);
		}
		return accessPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PageDiagramPackage.WEB_CHUNK_TYPE__WEB_NODE:
				return ((InternalEList<?>)getWebNode()).basicRemove(otherEnd, msgs);
			case PageDiagramPackage.WEB_CHUNK_TYPE__GLOBAL_VARIABLE:
				return ((InternalEList<?>)getGlobalVariable()).basicRemove(otherEnd, msgs);
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
			case PageDiagramPackage.WEB_CHUNK_TYPE__WEB_NODE:
				return getWebNode();
			case PageDiagramPackage.WEB_CHUNK_TYPE__GLOBAL_VARIABLE:
				return getGlobalVariable();
			case PageDiagramPackage.WEB_CHUNK_TYPE__ERROR_HANDLER:
				return getErrorHandler();
			case PageDiagramPackage.WEB_CHUNK_TYPE__ACCESS_PERMISSION:
				return getAccessPermission();
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
			case PageDiagramPackage.WEB_CHUNK_TYPE__WEB_NODE:
				getWebNode().clear();
				getWebNode().addAll((Collection<? extends WebNodeType>)newValue);
				return;
			case PageDiagramPackage.WEB_CHUNK_TYPE__GLOBAL_VARIABLE:
				getGlobalVariable().clear();
				getGlobalVariable().addAll((Collection<? extends ParamType>)newValue);
				return;
			case PageDiagramPackage.WEB_CHUNK_TYPE__ERROR_HANDLER:
				setErrorHandler((String)newValue);
				return;
			case PageDiagramPackage.WEB_CHUNK_TYPE__ACCESS_PERMISSION:
				getAccessPermission().clear();
				getAccessPermission().addAll((Collection<? extends String>)newValue);
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
			case PageDiagramPackage.WEB_CHUNK_TYPE__WEB_NODE:
				getWebNode().clear();
				return;
			case PageDiagramPackage.WEB_CHUNK_TYPE__GLOBAL_VARIABLE:
				getGlobalVariable().clear();
				return;
			case PageDiagramPackage.WEB_CHUNK_TYPE__ERROR_HANDLER:
				setErrorHandler(ERROR_HANDLER_EDEFAULT);
				return;
			case PageDiagramPackage.WEB_CHUNK_TYPE__ACCESS_PERMISSION:
				getAccessPermission().clear();
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
			case PageDiagramPackage.WEB_CHUNK_TYPE__WEB_NODE:
				return webNode != null && !webNode.isEmpty();
			case PageDiagramPackage.WEB_CHUNK_TYPE__GLOBAL_VARIABLE:
				return globalVariable != null && !globalVariable.isEmpty();
			case PageDiagramPackage.WEB_CHUNK_TYPE__ERROR_HANDLER:
				return ERROR_HANDLER_EDEFAULT == null ? errorHandler != null : !ERROR_HANDLER_EDEFAULT.equals(errorHandler);
			case PageDiagramPackage.WEB_CHUNK_TYPE__ACCESS_PERMISSION:
				return accessPermission != null && !accessPermission.isEmpty();
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
		result.append(" (errorHandler: ");
		result.append(errorHandler);
		result.append(", accessPermission: ");
		result.append(accessPermission);
		result.append(')');
		return result.toString();
	}

} //WebChunkTypeImpl
