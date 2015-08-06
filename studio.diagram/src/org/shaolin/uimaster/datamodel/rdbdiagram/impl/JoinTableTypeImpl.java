/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.JoinTableTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.JoinTableTypeImpl#getSrcPKColumn <em>Src PK Column</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.JoinTableTypeImpl#getSrcTable <em>Src Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.JoinTableTypeImpl#getTarTable <em>Tar Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.JoinTableTypeImpl#getTarPKColumn <em>Tar PK Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinTableTypeImpl extends EObjectImpl implements JoinTableType {
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
	 * The default value of the '{@link #getSrcPKColumn() <em>Src PK Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcPKColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_PK_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcPKColumn() <em>Src PK Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcPKColumn()
	 * @generated
	 * @ordered
	 */
	protected String srcPKColumn = SRC_PK_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcTable() <em>Src Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcTable()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcTable() <em>Src Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcTable()
	 * @generated
	 * @ordered
	 */
	protected String srcTable = SRC_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarTable() <em>Tar Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarTable()
	 * @generated
	 * @ordered
	 */
	protected static final String TAR_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarTable() <em>Tar Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarTable()
	 * @generated
	 * @ordered
	 */
	protected String tarTable = TAR_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarPKColumn() <em>Tar PK Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarPKColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String TAR_PK_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarPKColumn() <em>Tar PK Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarPKColumn()
	 * @generated
	 * @ordered
	 */
	protected String tarPKColumn = TAR_PK_COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinTableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.JOIN_TABLE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.JOIN_TABLE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcPKColumn() {
		return srcPKColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcPKColumn(String newSrcPKColumn) {
		String oldSrcPKColumn = srcPKColumn;
		srcPKColumn = newSrcPKColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_PK_COLUMN, oldSrcPKColumn, srcPKColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcTable() {
		return srcTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcTable(String newSrcTable) {
		String oldSrcTable = srcTable;
		srcTable = newSrcTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_TABLE, oldSrcTable, srcTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarTable() {
		return tarTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarTable(String newTarTable) {
		String oldTarTable = tarTable;
		tarTable = newTarTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_TABLE, oldTarTable, tarTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarPKColumn() {
		return tarPKColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarPKColumn(String newTarPKColumn) {
		String oldTarPKColumn = tarPKColumn;
		tarPKColumn = newTarPKColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_PK_COLUMN, oldTarPKColumn, tarPKColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDBDiagramPackage.JOIN_TABLE_TYPE__NAME:
				return getName();
			case RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_PK_COLUMN:
				return getSrcPKColumn();
			case RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_TABLE:
				return getSrcTable();
			case RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_TABLE:
				return getTarTable();
			case RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_PK_COLUMN:
				return getTarPKColumn();
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
			case RDBDiagramPackage.JOIN_TABLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_PK_COLUMN:
				setSrcPKColumn((String)newValue);
				return;
			case RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_TABLE:
				setSrcTable((String)newValue);
				return;
			case RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_TABLE:
				setTarTable((String)newValue);
				return;
			case RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_PK_COLUMN:
				setTarPKColumn((String)newValue);
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
			case RDBDiagramPackage.JOIN_TABLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_PK_COLUMN:
				setSrcPKColumn(SRC_PK_COLUMN_EDEFAULT);
				return;
			case RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_TABLE:
				setSrcTable(SRC_TABLE_EDEFAULT);
				return;
			case RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_TABLE:
				setTarTable(TAR_TABLE_EDEFAULT);
				return;
			case RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_PK_COLUMN:
				setTarPKColumn(TAR_PK_COLUMN_EDEFAULT);
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
			case RDBDiagramPackage.JOIN_TABLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_PK_COLUMN:
				return SRC_PK_COLUMN_EDEFAULT == null ? srcPKColumn != null : !SRC_PK_COLUMN_EDEFAULT.equals(srcPKColumn);
			case RDBDiagramPackage.JOIN_TABLE_TYPE__SRC_TABLE:
				return SRC_TABLE_EDEFAULT == null ? srcTable != null : !SRC_TABLE_EDEFAULT.equals(srcTable);
			case RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_TABLE:
				return TAR_TABLE_EDEFAULT == null ? tarTable != null : !TAR_TABLE_EDEFAULT.equals(tarTable);
			case RDBDiagramPackage.JOIN_TABLE_TYPE__TAR_PK_COLUMN:
				return TAR_PK_COLUMN_EDEFAULT == null ? tarPKColumn != null : !TAR_PK_COLUMN_EDEFAULT.equals(tarPKColumn);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", srcPKColumn: ");
		result.append(srcPKColumn);
		result.append(", srcTable: ");
		result.append(srcTable);
		result.append(", tarTable: ");
		result.append(tarTable);
		result.append(", tarPKColumn: ");
		result.append(tarPKColumn);
		result.append(')');
		return result.toString();
	}

} //JoinTableTypeImpl
