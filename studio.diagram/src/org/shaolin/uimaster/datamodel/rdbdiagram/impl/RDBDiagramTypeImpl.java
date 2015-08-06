/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ViewType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramTypeImpl#getView <em>View</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramTypeImpl#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramTypeImpl#getDaoPackage <em>Dao Package</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.RDBDiagramTypeImpl#getDiagramPackage <em>Diagram Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDBDiagramTypeImpl extends EObjectImpl implements RDBDiagramType {
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<TableType> table;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewType> view;

	/**
	 * The cached value of the '{@link #getJoinTable() <em>Join Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinTable()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinTableType> joinTable;

	/**
	 * The default value of the '{@link #getDaoPackage() <em>Dao Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaoPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String DAO_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaoPackage() <em>Dao Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaoPackage()
	 * @generated
	 * @ordered
	 */
	protected String daoPackage = DAO_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagramPackage() <em>Diagram Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramPackage() <em>Diagram Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramPackage()
	 * @generated
	 * @ordered
	 */
	protected String diagramPackage = DIAGRAM_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBDiagramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.RDB_DIAGRAM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<TableType>(TableType.class, this, RDBDiagramPackage.RDB_DIAGRAM_TYPE__TABLE);
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewType> getView() {
		if (view == null) {
			view = new EObjectContainmentEList<ViewType>(ViewType.class, this, RDBDiagramPackage.RDB_DIAGRAM_TYPE__VIEW);
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinTableType> getJoinTable() {
		if (joinTable == null) {
			joinTable = new EObjectContainmentEList<JoinTableType>(JoinTableType.class, this, RDBDiagramPackage.RDB_DIAGRAM_TYPE__JOIN_TABLE);
		}
		return joinTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDaoPackage() {
		return daoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaoPackage(String newDaoPackage) {
		String oldDaoPackage = daoPackage;
		daoPackage = newDaoPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.RDB_DIAGRAM_TYPE__DAO_PACKAGE, oldDaoPackage, daoPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramPackage() {
		return diagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramPackage(String newDiagramPackage) {
		String oldDiagramPackage = diagramPackage;
		diagramPackage = newDiagramPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE, oldDiagramPackage, diagramPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__VIEW:
				return ((InternalEList<?>)getView()).basicRemove(otherEnd, msgs);
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__JOIN_TABLE:
				return ((InternalEList<?>)getJoinTable()).basicRemove(otherEnd, msgs);
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
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__TABLE:
				return getTable();
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__VIEW:
				return getView();
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__JOIN_TABLE:
				return getJoinTable();
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DAO_PACKAGE:
				return getDaoPackage();
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE:
				return getDiagramPackage();
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
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__VIEW:
				getView().clear();
				getView().addAll((Collection<? extends ViewType>)newValue);
				return;
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__JOIN_TABLE:
				getJoinTable().clear();
				getJoinTable().addAll((Collection<? extends JoinTableType>)newValue);
				return;
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DAO_PACKAGE:
				setDaoPackage((String)newValue);
				return;
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE:
				setDiagramPackage((String)newValue);
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
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__TABLE:
				getTable().clear();
				return;
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__VIEW:
				getView().clear();
				return;
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__JOIN_TABLE:
				getJoinTable().clear();
				return;
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DAO_PACKAGE:
				setDaoPackage(DAO_PACKAGE_EDEFAULT);
				return;
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE:
				setDiagramPackage(DIAGRAM_PACKAGE_EDEFAULT);
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
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__TABLE:
				return table != null && !table.isEmpty();
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__VIEW:
				return view != null && !view.isEmpty();
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__JOIN_TABLE:
				return joinTable != null && !joinTable.isEmpty();
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DAO_PACKAGE:
				return DAO_PACKAGE_EDEFAULT == null ? daoPackage != null : !DAO_PACKAGE_EDEFAULT.equals(daoPackage);
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE:
				return DIAGRAM_PACKAGE_EDEFAULT == null ? diagramPackage != null : !DIAGRAM_PACKAGE_EDEFAULT.equals(diagramPackage);
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
		result.append(" (daoPackage: ");
		result.append(daoPackage);
		result.append(", diagramPackage: ");
		result.append(diagramPackage);
		result.append(')');
		return result.toString();
	}

} //RDBDiagramTypeImpl
