/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType;
import org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistent Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.PersistentConfigTypeImpl#getSupportedPersistenceType <em>Supported Persistence Type</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.PersistentConfigTypeImpl#getPrimaryKeyMember <em>Primary Key Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistentConfigTypeImpl extends EObjectImpl implements PersistentConfigType {
	/**
	 * The default value of the '{@link #getSupportedPersistenceType() <em>Supported Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final PersistenceTypeType SUPPORTED_PERSISTENCE_TYPE_EDEFAULT = PersistenceTypeType.RDB;

	/**
	 * The cached value of the '{@link #getSupportedPersistenceType() <em>Supported Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected PersistenceTypeType supportedPersistenceType = SUPPORTED_PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * This is true if the Supported Persistence Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean supportedPersistenceTypeESet;

	/**
	 * The cached value of the '{@link #getPrimaryKeyMember() <em>Primary Key Member</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyMember()
	 * @generated
	 * @ordered
	 */
	protected EList<String> primaryKeyMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistentConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.PERSISTENT_CONFIG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeType getSupportedPersistenceType() {
		return supportedPersistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedPersistenceType(PersistenceTypeType newSupportedPersistenceType) {
		PersistenceTypeType oldSupportedPersistenceType = supportedPersistenceType;
		supportedPersistenceType = newSupportedPersistenceType == null ? SUPPORTED_PERSISTENCE_TYPE_EDEFAULT : newSupportedPersistenceType;
		boolean oldSupportedPersistenceTypeESet = supportedPersistenceTypeESet;
		supportedPersistenceTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.PERSISTENT_CONFIG_TYPE__SUPPORTED_PERSISTENCE_TYPE, oldSupportedPersistenceType, supportedPersistenceType, !oldSupportedPersistenceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSupportedPersistenceType() {
		PersistenceTypeType oldSupportedPersistenceType = supportedPersistenceType;
		boolean oldSupportedPersistenceTypeESet = supportedPersistenceTypeESet;
		supportedPersistenceType = SUPPORTED_PERSISTENCE_TYPE_EDEFAULT;
		supportedPersistenceTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.PERSISTENT_CONFIG_TYPE__SUPPORTED_PERSISTENCE_TYPE, oldSupportedPersistenceType, SUPPORTED_PERSISTENCE_TYPE_EDEFAULT, oldSupportedPersistenceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSupportedPersistenceType() {
		return supportedPersistenceTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPrimaryKeyMember() {
		if (primaryKeyMember == null) {
			primaryKeyMember = new EDataTypeEList<String>(String.class, this, BEDiagramPackage.PERSISTENT_CONFIG_TYPE__PRIMARY_KEY_MEMBER);
		}
		return primaryKeyMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE__SUPPORTED_PERSISTENCE_TYPE:
				return getSupportedPersistenceType();
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE__PRIMARY_KEY_MEMBER:
				return getPrimaryKeyMember();
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
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE__SUPPORTED_PERSISTENCE_TYPE:
				setSupportedPersistenceType((PersistenceTypeType)newValue);
				return;
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE__PRIMARY_KEY_MEMBER:
				getPrimaryKeyMember().clear();
				getPrimaryKeyMember().addAll((Collection<? extends String>)newValue);
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
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE__SUPPORTED_PERSISTENCE_TYPE:
				unsetSupportedPersistenceType();
				return;
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE__PRIMARY_KEY_MEMBER:
				getPrimaryKeyMember().clear();
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
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE__SUPPORTED_PERSISTENCE_TYPE:
				return isSetSupportedPersistenceType();
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE__PRIMARY_KEY_MEMBER:
				return primaryKeyMember != null && !primaryKeyMember.isEmpty();
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
		result.append(" (supportedPersistenceType: ");
		if (supportedPersistenceTypeESet) result.append(supportedPersistenceType); else result.append("<unset>");
		result.append(", primaryKeyMember: ");
		result.append(primaryKeyMember);
		result.append(')');
		return result.toString();
	}

} //PersistentConfigTypeImpl
