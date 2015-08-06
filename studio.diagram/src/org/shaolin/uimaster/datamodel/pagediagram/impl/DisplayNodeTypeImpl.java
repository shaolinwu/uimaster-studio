/**
 */
package org.shaolin.uimaster.datamodel.pagediagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shaolin.uimaster.datamodel.common.ExpressionType;

import org.shaolin.uimaster.datamodel.pagediagram.DisplayNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayNodeTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayNodeTypeImpl#getQueryString <em>Query String</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.DisplayNodeTypeImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisplayNodeTypeImpl extends WebNodeTypeImpl implements DisplayNodeType {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ExpressionType operation;

	/**
	 * The cached value of the '{@link #getQueryString() <em>Query String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryString()
	 * @generated
	 * @ordered
	 */
	protected ExpressionType queryString;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PageDiagramPackage.Literals.DISPLAY_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(ExpressionType newOperation, NotificationChain msgs) {
		ExpressionType oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageDiagramPackage.DISPLAY_NODE_TYPE__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(ExpressionType newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.DISPLAY_NODE_TYPE__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.DISPLAY_NODE_TYPE__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.DISPLAY_NODE_TYPE__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getQueryString() {
		return queryString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryString(ExpressionType newQueryString, NotificationChain msgs) {
		ExpressionType oldQueryString = queryString;
		queryString = newQueryString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageDiagramPackage.DISPLAY_NODE_TYPE__QUERY_STRING, oldQueryString, newQueryString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryString(ExpressionType newQueryString) {
		if (newQueryString != queryString) {
			NotificationChain msgs = null;
			if (queryString != null)
				msgs = ((InternalEObject)queryString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.DISPLAY_NODE_TYPE__QUERY_STRING, null, msgs);
			if (newQueryString != null)
				msgs = ((InternalEObject)newQueryString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.DISPLAY_NODE_TYPE__QUERY_STRING, null, msgs);
			msgs = basicSetQueryString(newQueryString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.DISPLAY_NODE_TYPE__QUERY_STRING, newQueryString, newQueryString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.DISPLAY_NODE_TYPE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PageDiagramPackage.DISPLAY_NODE_TYPE__OPERATION:
				return basicSetOperation(null, msgs);
			case PageDiagramPackage.DISPLAY_NODE_TYPE__QUERY_STRING:
				return basicSetQueryString(null, msgs);
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
			case PageDiagramPackage.DISPLAY_NODE_TYPE__OPERATION:
				return getOperation();
			case PageDiagramPackage.DISPLAY_NODE_TYPE__QUERY_STRING:
				return getQueryString();
			case PageDiagramPackage.DISPLAY_NODE_TYPE__PATH:
				return getPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PageDiagramPackage.DISPLAY_NODE_TYPE__OPERATION:
				setOperation((ExpressionType)newValue);
				return;
			case PageDiagramPackage.DISPLAY_NODE_TYPE__QUERY_STRING:
				setQueryString((ExpressionType)newValue);
				return;
			case PageDiagramPackage.DISPLAY_NODE_TYPE__PATH:
				setPath((String)newValue);
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
			case PageDiagramPackage.DISPLAY_NODE_TYPE__OPERATION:
				setOperation((ExpressionType)null);
				return;
			case PageDiagramPackage.DISPLAY_NODE_TYPE__QUERY_STRING:
				setQueryString((ExpressionType)null);
				return;
			case PageDiagramPackage.DISPLAY_NODE_TYPE__PATH:
				setPath(PATH_EDEFAULT);
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
			case PageDiagramPackage.DISPLAY_NODE_TYPE__OPERATION:
				return operation != null;
			case PageDiagramPackage.DISPLAY_NODE_TYPE__QUERY_STRING:
				return queryString != null;
			case PageDiagramPackage.DISPLAY_NODE_TYPE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //DisplayNodeTypeImpl
