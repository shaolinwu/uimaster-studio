/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.shaolin.uimaster.datamodel.rdbdiagram.IndexType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.IndexTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.IndexTypeImpl#isIsClustered <em>Is Clustered</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.IndexTypeImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.IndexTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexTypeImpl extends EObjectImpl implements IndexType {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<String> column;

	/**
	 * The default value of the '{@link #isIsClustered() <em>Is Clustered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClustered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLUSTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsClustered() <em>Is Clustered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClustered()
	 * @generated
	 * @ordered
	 */
	protected boolean isClustered = IS_CLUSTERED_EDEFAULT;

	/**
	 * This is true if the Is Clustered attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isClusteredESet;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * This is true if the Is Unique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isUniqueESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.INDEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getColumn() {
		if (column == null) {
			column = new EDataTypeEList<String>(String.class, this, RDBDiagramPackage.INDEX_TYPE__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsClustered() {
		return isClustered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClustered(boolean newIsClustered) {
		boolean oldIsClustered = isClustered;
		isClustered = newIsClustered;
		boolean oldIsClusteredESet = isClusteredESet;
		isClusteredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.INDEX_TYPE__IS_CLUSTERED, oldIsClustered, isClustered, !oldIsClusteredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsClustered() {
		boolean oldIsClustered = isClustered;
		boolean oldIsClusteredESet = isClusteredESet;
		isClustered = IS_CLUSTERED_EDEFAULT;
		isClusteredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.INDEX_TYPE__IS_CLUSTERED, oldIsClustered, IS_CLUSTERED_EDEFAULT, oldIsClusteredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsClustered() {
		return isClusteredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		boolean oldIsUniqueESet = isUniqueESet;
		isUniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.INDEX_TYPE__IS_UNIQUE, oldIsUnique, isUnique, !oldIsUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsUnique() {
		boolean oldIsUnique = isUnique;
		boolean oldIsUniqueESet = isUniqueESet;
		isUnique = IS_UNIQUE_EDEFAULT;
		isUniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.INDEX_TYPE__IS_UNIQUE, oldIsUnique, IS_UNIQUE_EDEFAULT, oldIsUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsUnique() {
		return isUniqueESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.INDEX_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDBDiagramPackage.INDEX_TYPE__COLUMN:
				return getColumn();
			case RDBDiagramPackage.INDEX_TYPE__IS_CLUSTERED:
				return isIsClustered();
			case RDBDiagramPackage.INDEX_TYPE__IS_UNIQUE:
				return isIsUnique();
			case RDBDiagramPackage.INDEX_TYPE__NAME:
				return getName();
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
			case RDBDiagramPackage.INDEX_TYPE__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends String>)newValue);
				return;
			case RDBDiagramPackage.INDEX_TYPE__IS_CLUSTERED:
				setIsClustered((Boolean)newValue);
				return;
			case RDBDiagramPackage.INDEX_TYPE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case RDBDiagramPackage.INDEX_TYPE__NAME:
				setName((String)newValue);
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
			case RDBDiagramPackage.INDEX_TYPE__COLUMN:
				getColumn().clear();
				return;
			case RDBDiagramPackage.INDEX_TYPE__IS_CLUSTERED:
				unsetIsClustered();
				return;
			case RDBDiagramPackage.INDEX_TYPE__IS_UNIQUE:
				unsetIsUnique();
				return;
			case RDBDiagramPackage.INDEX_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case RDBDiagramPackage.INDEX_TYPE__COLUMN:
				return column != null && !column.isEmpty();
			case RDBDiagramPackage.INDEX_TYPE__IS_CLUSTERED:
				return isSetIsClustered();
			case RDBDiagramPackage.INDEX_TYPE__IS_UNIQUE:
				return isSetIsUnique();
			case RDBDiagramPackage.INDEX_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (column: ");
		result.append(column);
		result.append(", isClustered: ");
		if (isClusteredESet) result.append(isClustered); else result.append("<unset>");
		result.append(", isUnique: ");
		if (isUniqueESet) result.append(isUnique); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IndexTypeImpl
