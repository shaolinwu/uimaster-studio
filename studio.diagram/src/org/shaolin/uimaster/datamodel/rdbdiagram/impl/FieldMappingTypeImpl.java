/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl#getBeFieldName <em>Be Field Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl#isIsTimestamp <em>Is Timestamp</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl#isRedundant <em>Redundant</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl#isUseClobBuffer <em>Use Clob Buffer</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl#getAssociationName <em>Association Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldMappingTypeImpl extends EObjectImpl implements FieldMappingType {
	/**
	 * The default value of the '{@link #getBeFieldName() <em>Be Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String BE_FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeFieldName() <em>Be Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeFieldName()
	 * @generated
	 * @ordered
	 */
	protected String beFieldName = BE_FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTimestamp() <em>Is Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TIMESTAMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTimestamp() <em>Is Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTimestamp()
	 * @generated
	 * @ordered
	 */
	protected boolean isTimestamp = IS_TIMESTAMP_EDEFAULT;

	/**
	 * This is true if the Is Timestamp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isTimestampESet;

	/**
	 * The default value of the '{@link #isRedundant() <em>Redundant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRedundant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REDUNDANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRedundant() <em>Redundant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRedundant()
	 * @generated
	 * @ordered
	 */
	protected boolean redundant = REDUNDANT_EDEFAULT;

	/**
	 * This is true if the Redundant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean redundantESet;

	/**
	 * The default value of the '{@link #isUseClobBuffer() <em>Use Clob Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseClobBuffer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CLOB_BUFFER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseClobBuffer() <em>Use Clob Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseClobBuffer()
	 * @generated
	 * @ordered
	 */
	protected boolean useClobBuffer = USE_CLOB_BUFFER_EDEFAULT;

	/**
	 * This is true if the Use Clob Buffer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useClobBufferESet;

	/**
	 * The default value of the '{@link #getAssociationName() <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociationName() <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationName()
	 * @generated
	 * @ordered
	 */
	protected String associationName = ASSOCIATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldMappingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.FIELD_MAPPING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeFieldName() {
		return beFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeFieldName(String newBeFieldName) {
		String oldBeFieldName = beFieldName;
		beFieldName = newBeFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FIELD_MAPPING_TYPE__BE_FIELD_NAME, oldBeFieldName, beFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FIELD_MAPPING_TYPE__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTimestamp() {
		return isTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTimestamp(boolean newIsTimestamp) {
		boolean oldIsTimestamp = isTimestamp;
		isTimestamp = newIsTimestamp;
		boolean oldIsTimestampESet = isTimestampESet;
		isTimestampESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FIELD_MAPPING_TYPE__IS_TIMESTAMP, oldIsTimestamp, isTimestamp, !oldIsTimestampESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsTimestamp() {
		boolean oldIsTimestamp = isTimestamp;
		boolean oldIsTimestampESet = isTimestampESet;
		isTimestamp = IS_TIMESTAMP_EDEFAULT;
		isTimestampESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.FIELD_MAPPING_TYPE__IS_TIMESTAMP, oldIsTimestamp, IS_TIMESTAMP_EDEFAULT, oldIsTimestampESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsTimestamp() {
		return isTimestampESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedundant() {
		return redundant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedundant(boolean newRedundant) {
		boolean oldRedundant = redundant;
		redundant = newRedundant;
		boolean oldRedundantESet = redundantESet;
		redundantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FIELD_MAPPING_TYPE__REDUNDANT, oldRedundant, redundant, !oldRedundantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRedundant() {
		boolean oldRedundant = redundant;
		boolean oldRedundantESet = redundantESet;
		redundant = REDUNDANT_EDEFAULT;
		redundantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.FIELD_MAPPING_TYPE__REDUNDANT, oldRedundant, REDUNDANT_EDEFAULT, oldRedundantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedundant() {
		return redundantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseClobBuffer() {
		return useClobBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseClobBuffer(boolean newUseClobBuffer) {
		boolean oldUseClobBuffer = useClobBuffer;
		useClobBuffer = newUseClobBuffer;
		boolean oldUseClobBufferESet = useClobBufferESet;
		useClobBufferESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FIELD_MAPPING_TYPE__USE_CLOB_BUFFER, oldUseClobBuffer, useClobBuffer, !oldUseClobBufferESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseClobBuffer() {
		boolean oldUseClobBuffer = useClobBuffer;
		boolean oldUseClobBufferESet = useClobBufferESet;
		useClobBuffer = USE_CLOB_BUFFER_EDEFAULT;
		useClobBufferESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.FIELD_MAPPING_TYPE__USE_CLOB_BUFFER, oldUseClobBuffer, USE_CLOB_BUFFER_EDEFAULT, oldUseClobBufferESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseClobBuffer() {
		return useClobBufferESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociationName() {
		return associationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationName(String newAssociationName) {
		String oldAssociationName = associationName;
		associationName = newAssociationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.FIELD_MAPPING_TYPE__ASSOCIATION_NAME, oldAssociationName, associationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__BE_FIELD_NAME:
				return getBeFieldName();
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__COLUMN_NAME:
				return getColumnName();
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__IS_TIMESTAMP:
				return isIsTimestamp();
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__REDUNDANT:
				return isRedundant();
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__USE_CLOB_BUFFER:
				return isUseClobBuffer();
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__ASSOCIATION_NAME:
				return getAssociationName();
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
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__BE_FIELD_NAME:
				setBeFieldName((String)newValue);
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__IS_TIMESTAMP:
				setIsTimestamp((Boolean)newValue);
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__REDUNDANT:
				setRedundant((Boolean)newValue);
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__USE_CLOB_BUFFER:
				setUseClobBuffer((Boolean)newValue);
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__ASSOCIATION_NAME:
				setAssociationName((String)newValue);
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
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__BE_FIELD_NAME:
				setBeFieldName(BE_FIELD_NAME_EDEFAULT);
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__IS_TIMESTAMP:
				unsetIsTimestamp();
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__REDUNDANT:
				unsetRedundant();
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__USE_CLOB_BUFFER:
				unsetUseClobBuffer();
				return;
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__ASSOCIATION_NAME:
				setAssociationName(ASSOCIATION_NAME_EDEFAULT);
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
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__BE_FIELD_NAME:
				return BE_FIELD_NAME_EDEFAULT == null ? beFieldName != null : !BE_FIELD_NAME_EDEFAULT.equals(beFieldName);
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__IS_TIMESTAMP:
				return isSetIsTimestamp();
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__REDUNDANT:
				return isSetRedundant();
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__USE_CLOB_BUFFER:
				return isSetUseClobBuffer();
			case RDBDiagramPackage.FIELD_MAPPING_TYPE__ASSOCIATION_NAME:
				return ASSOCIATION_NAME_EDEFAULT == null ? associationName != null : !ASSOCIATION_NAME_EDEFAULT.equals(associationName);
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
		result.append(" (beFieldName: ");
		result.append(beFieldName);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", isTimestamp: ");
		if (isTimestampESet) result.append(isTimestamp); else result.append("<unset>");
		result.append(", redundant: ");
		if (redundantESet) result.append(redundant); else result.append("<unset>");
		result.append(", useClobBuffer: ");
		if (useClobBufferESet) result.append(useClobBuffer); else result.append("<unset>");
		result.append(", associationName: ");
		result.append(associationName);
		result.append(')');
		return result.toString();
	}

} //FieldMappingTypeImpl
