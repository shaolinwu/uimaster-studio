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

import org.shaolin.uimaster.datamodel.common.ExpressionType;
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;

import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage;
import org.shaolin.uimaster.datamodel.pagediagram.PageNodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.PageNodeTypeImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.PageNodeTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.PageNodeTypeImpl#isNeedTransaction <em>Need Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageNodeTypeImpl extends WebNodeTypeImpl implements PageNodeType {
	/**
	 * The cached value of the '{@link #getSourceEntity() <em>Source Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntity()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType sourceEntity;

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
	 * The default value of the '{@link #isNeedTransaction() <em>Need Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_TRANSACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedTransaction() <em>Need Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedTransaction()
	 * @generated
	 * @ordered
	 */
	protected boolean needTransaction = NEED_TRANSACTION_EDEFAULT;

	/**
	 * This is true if the Need Transaction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needTransactionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PageDiagramPackage.Literals.PAGE_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getSourceEntity() {
		return sourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceEntity(TargetEntityType newSourceEntity, NotificationChain msgs) {
		TargetEntityType oldSourceEntity = sourceEntity;
		sourceEntity = newSourceEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageDiagramPackage.PAGE_NODE_TYPE__SOURCE_ENTITY, oldSourceEntity, newSourceEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEntity(TargetEntityType newSourceEntity) {
		if (newSourceEntity != sourceEntity) {
			NotificationChain msgs = null;
			if (sourceEntity != null)
				msgs = ((InternalEObject)sourceEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.PAGE_NODE_TYPE__SOURCE_ENTITY, null, msgs);
			if (newSourceEntity != null)
				msgs = ((InternalEObject)newSourceEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.PAGE_NODE_TYPE__SOURCE_ENTITY, null, msgs);
			msgs = basicSetSourceEntity(newSourceEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.PAGE_NODE_TYPE__SOURCE_ENTITY, newSourceEntity, newSourceEntity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageDiagramPackage.PAGE_NODE_TYPE__OPERATION, oldOperation, newOperation);
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
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.PAGE_NODE_TYPE__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageDiagramPackage.PAGE_NODE_TYPE__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.PAGE_NODE_TYPE__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedTransaction() {
		return needTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedTransaction(boolean newNeedTransaction) {
		boolean oldNeedTransaction = needTransaction;
		needTransaction = newNeedTransaction;
		boolean oldNeedTransactionESet = needTransactionESet;
		needTransactionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.PAGE_NODE_TYPE__NEED_TRANSACTION, oldNeedTransaction, needTransaction, !oldNeedTransactionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNeedTransaction() {
		boolean oldNeedTransaction = needTransaction;
		boolean oldNeedTransactionESet = needTransactionESet;
		needTransaction = NEED_TRANSACTION_EDEFAULT;
		needTransactionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PageDiagramPackage.PAGE_NODE_TYPE__NEED_TRANSACTION, oldNeedTransaction, NEED_TRANSACTION_EDEFAULT, oldNeedTransactionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNeedTransaction() {
		return needTransactionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PageDiagramPackage.PAGE_NODE_TYPE__SOURCE_ENTITY:
				return basicSetSourceEntity(null, msgs);
			case PageDiagramPackage.PAGE_NODE_TYPE__OPERATION:
				return basicSetOperation(null, msgs);
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
			case PageDiagramPackage.PAGE_NODE_TYPE__SOURCE_ENTITY:
				return getSourceEntity();
			case PageDiagramPackage.PAGE_NODE_TYPE__OPERATION:
				return getOperation();
			case PageDiagramPackage.PAGE_NODE_TYPE__NEED_TRANSACTION:
				return isNeedTransaction();
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
			case PageDiagramPackage.PAGE_NODE_TYPE__SOURCE_ENTITY:
				setSourceEntity((TargetEntityType)newValue);
				return;
			case PageDiagramPackage.PAGE_NODE_TYPE__OPERATION:
				setOperation((ExpressionType)newValue);
				return;
			case PageDiagramPackage.PAGE_NODE_TYPE__NEED_TRANSACTION:
				setNeedTransaction((Boolean)newValue);
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
			case PageDiagramPackage.PAGE_NODE_TYPE__SOURCE_ENTITY:
				setSourceEntity((TargetEntityType)null);
				return;
			case PageDiagramPackage.PAGE_NODE_TYPE__OPERATION:
				setOperation((ExpressionType)null);
				return;
			case PageDiagramPackage.PAGE_NODE_TYPE__NEED_TRANSACTION:
				unsetNeedTransaction();
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
			case PageDiagramPackage.PAGE_NODE_TYPE__SOURCE_ENTITY:
				return sourceEntity != null;
			case PageDiagramPackage.PAGE_NODE_TYPE__OPERATION:
				return operation != null;
			case PageDiagramPackage.PAGE_NODE_TYPE__NEED_TRANSACTION:
				return isSetNeedTransaction();
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
		result.append(" (needTransaction: ");
		if (needTransactionESet) result.append(needTransaction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PageNodeTypeImpl
