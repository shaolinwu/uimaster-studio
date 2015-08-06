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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.pagediagram.OutType;
import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramPackage;
import org.shaolin.uimaster.datamodel.pagediagram.WebNodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl#getOut <em>Out</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl#getAccessPermission <em>Access Permission</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.pagediagram.impl.WebNodeTypeImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WebNodeTypeImpl extends EObjectImpl implements WebNodeType {
	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<OutType> out;

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
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamType> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PageDiagramPackage.Literals.WEB_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutType> getOut() {
		if (out == null) {
			out = new EObjectContainmentEList<OutType>(OutType.class, this, PageDiagramPackage.WEB_NODE_TYPE__OUT);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAccessPermission() {
		if (accessPermission == null) {
			accessPermission = new EDataTypeEList<String>(String.class, this, PageDiagramPackage.WEB_NODE_TYPE__ACCESS_PERMISSION);
		}
		return accessPermission;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.WEB_NODE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.WEB_NODE_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PageDiagramPackage.WEB_NODE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamType> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<ParamType>(ParamType.class, this, PageDiagramPackage.WEB_NODE_TYPE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PageDiagramPackage.WEB_NODE_TYPE__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
			case PageDiagramPackage.WEB_NODE_TYPE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case PageDiagramPackage.WEB_NODE_TYPE__OUT:
				return getOut();
			case PageDiagramPackage.WEB_NODE_TYPE__ACCESS_PERMISSION:
				return getAccessPermission();
			case PageDiagramPackage.WEB_NODE_TYPE__DESCRIPTION:
				return getDescription();
			case PageDiagramPackage.WEB_NODE_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case PageDiagramPackage.WEB_NODE_TYPE__NAME:
				return getName();
			case PageDiagramPackage.WEB_NODE_TYPE__VARIABLES:
				return getVariables();
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
			case PageDiagramPackage.WEB_NODE_TYPE__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends OutType>)newValue);
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__ACCESS_PERMISSION:
				getAccessPermission().clear();
				getAccessPermission().addAll((Collection<? extends String>)newValue);
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__NAME:
				setName((String)newValue);
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends ParamType>)newValue);
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
			case PageDiagramPackage.WEB_NODE_TYPE__OUT:
				getOut().clear();
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__ACCESS_PERMISSION:
				getAccessPermission().clear();
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PageDiagramPackage.WEB_NODE_TYPE__VARIABLES:
				getVariables().clear();
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
			case PageDiagramPackage.WEB_NODE_TYPE__OUT:
				return out != null && !out.isEmpty();
			case PageDiagramPackage.WEB_NODE_TYPE__ACCESS_PERMISSION:
				return accessPermission != null && !accessPermission.isEmpty();
			case PageDiagramPackage.WEB_NODE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PageDiagramPackage.WEB_NODE_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case PageDiagramPackage.WEB_NODE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PageDiagramPackage.WEB_NODE_TYPE__VARIABLES:
				return variables != null && !variables.isEmpty();
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
		result.append(" (accessPermission: ");
		result.append(accessPermission);
		result.append(", description: ");
		result.append(description);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WebNodeTypeImpl
