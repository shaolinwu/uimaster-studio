/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.SequenceTypeImpl#getDbcache <em>Dbcache</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.SequenceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.SequenceTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.SequenceTypeImpl#getStartWith <em>Start With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceTypeImpl extends EObjectImpl implements SequenceType {
	/**
	 * The default value of the '{@link #getDbcache() <em>Dbcache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbcache()
	 * @generated
	 * @ordered
	 */
	protected static final int DBCACHE_EDEFAULT = 20;

	/**
	 * The cached value of the '{@link #getDbcache() <em>Dbcache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbcache()
	 * @generated
	 * @ordered
	 */
	protected int dbcache = DBCACHE_EDEFAULT;

	/**
	 * This is true if the Dbcache attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dbcacheESet;

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
	 * The default value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int SPAN_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected int span = SPAN_EDEFAULT;

	/**
	 * This is true if the Span attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spanESet;

	/**
	 * The default value of the '{@link #getStartWith() <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWith()
	 * @generated
	 * @ordered
	 */
	protected static final int START_WITH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getStartWith() <em>Start With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWith()
	 * @generated
	 * @ordered
	 */
	protected int startWith = START_WITH_EDEFAULT;

	/**
	 * This is true if the Start With attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startWithESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.SEQUENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDbcache() {
		return dbcache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbcache(int newDbcache) {
		int oldDbcache = dbcache;
		dbcache = newDbcache;
		boolean oldDbcacheESet = dbcacheESet;
		dbcacheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.SEQUENCE_TYPE__DBCACHE, oldDbcache, dbcache, !oldDbcacheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDbcache() {
		int oldDbcache = dbcache;
		boolean oldDbcacheESet = dbcacheESet;
		dbcache = DBCACHE_EDEFAULT;
		dbcacheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.SEQUENCE_TYPE__DBCACHE, oldDbcache, DBCACHE_EDEFAULT, oldDbcacheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDbcache() {
		return dbcacheESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.SEQUENCE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpan() {
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(int newSpan) {
		int oldSpan = span;
		span = newSpan;
		boolean oldSpanESet = spanESet;
		spanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.SEQUENCE_TYPE__SPAN, oldSpan, span, !oldSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpan() {
		int oldSpan = span;
		boolean oldSpanESet = spanESet;
		span = SPAN_EDEFAULT;
		spanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.SEQUENCE_TYPE__SPAN, oldSpan, SPAN_EDEFAULT, oldSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpan() {
		return spanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartWith() {
		return startWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartWith(int newStartWith) {
		int oldStartWith = startWith;
		startWith = newStartWith;
		boolean oldStartWithESet = startWithESet;
		startWithESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.SEQUENCE_TYPE__START_WITH, oldStartWith, startWith, !oldStartWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartWith() {
		int oldStartWith = startWith;
		boolean oldStartWithESet = startWithESet;
		startWith = START_WITH_EDEFAULT;
		startWithESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RDBDiagramPackage.SEQUENCE_TYPE__START_WITH, oldStartWith, START_WITH_EDEFAULT, oldStartWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartWith() {
		return startWithESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDBDiagramPackage.SEQUENCE_TYPE__DBCACHE:
				return getDbcache();
			case RDBDiagramPackage.SEQUENCE_TYPE__NAME:
				return getName();
			case RDBDiagramPackage.SEQUENCE_TYPE__SPAN:
				return getSpan();
			case RDBDiagramPackage.SEQUENCE_TYPE__START_WITH:
				return getStartWith();
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
			case RDBDiagramPackage.SEQUENCE_TYPE__DBCACHE:
				setDbcache((Integer)newValue);
				return;
			case RDBDiagramPackage.SEQUENCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case RDBDiagramPackage.SEQUENCE_TYPE__SPAN:
				setSpan((Integer)newValue);
				return;
			case RDBDiagramPackage.SEQUENCE_TYPE__START_WITH:
				setStartWith((Integer)newValue);
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
			case RDBDiagramPackage.SEQUENCE_TYPE__DBCACHE:
				unsetDbcache();
				return;
			case RDBDiagramPackage.SEQUENCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RDBDiagramPackage.SEQUENCE_TYPE__SPAN:
				unsetSpan();
				return;
			case RDBDiagramPackage.SEQUENCE_TYPE__START_WITH:
				unsetStartWith();
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
			case RDBDiagramPackage.SEQUENCE_TYPE__DBCACHE:
				return isSetDbcache();
			case RDBDiagramPackage.SEQUENCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RDBDiagramPackage.SEQUENCE_TYPE__SPAN:
				return isSetSpan();
			case RDBDiagramPackage.SEQUENCE_TYPE__START_WITH:
				return isSetStartWith();
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
		result.append(" (dbcache: ");
		if (dbcacheESet) result.append(dbcache); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", span: ");
		if (spanESet) result.append(span); else result.append("<unset>");
		result.append(", startWith: ");
		if (startWithESet) result.append(startWith); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SequenceTypeImpl
