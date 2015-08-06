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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

import org.shaolin.uimaster.datamodel.common.impl.EntityTypeImpl;

import org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl#getBusinessEntity <em>Business Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl#getHistoryTable <em>History Table</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl#getView <em>View</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl#getParentClassMapping <em>Parent Class Mapping</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.ClassMappingTypeImpl#getFieldMapping <em>Field Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassMappingTypeImpl extends EntityTypeImpl implements ClassMappingType {
	/**
	 * The cached value of the '{@link #getBusinessEntity() <em>Business Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEntity()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType businessEntity;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType table;

	/**
	 * The cached value of the '{@link #getHistoryTable() <em>History Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryTable()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType historyTable;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType view;

	/**
	 * The cached value of the '{@link #getParentClassMapping() <em>Parent Class Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClassMapping()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType parentClassMapping;

	/**
	 * The cached value of the '{@link #getFieldMapping() <em>Field Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldMappingType> fieldMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassMappingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.CLASS_MAPPING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getBusinessEntity() {
		return businessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessEntity(TargetEntityType newBusinessEntity, NotificationChain msgs) {
		TargetEntityType oldBusinessEntity = businessEntity;
		businessEntity = newBusinessEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY, oldBusinessEntity, newBusinessEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessEntity(TargetEntityType newBusinessEntity) {
		if (newBusinessEntity != businessEntity) {
			NotificationChain msgs = null;
			if (businessEntity != null)
				msgs = ((InternalEObject)businessEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY, null, msgs);
			if (newBusinessEntity != null)
				msgs = ((InternalEObject)newBusinessEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY, null, msgs);
			msgs = basicSetBusinessEntity(newBusinessEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY, newBusinessEntity, newBusinessEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(TargetEntityType newTable, NotificationChain msgs) {
		TargetEntityType oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE, oldTable, newTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(TargetEntityType newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE, null, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE, null, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getHistoryTable() {
		return historyTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistoryTable(TargetEntityType newHistoryTable, NotificationChain msgs) {
		TargetEntityType oldHistoryTable = historyTable;
		historyTable = newHistoryTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE, oldHistoryTable, newHistoryTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistoryTable(TargetEntityType newHistoryTable) {
		if (newHistoryTable != historyTable) {
			NotificationChain msgs = null;
			if (historyTable != null)
				msgs = ((InternalEObject)historyTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE, null, msgs);
			if (newHistoryTable != null)
				msgs = ((InternalEObject)newHistoryTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE, null, msgs);
			msgs = basicSetHistoryTable(newHistoryTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE, newHistoryTable, newHistoryTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(TargetEntityType newView, NotificationChain msgs) {
		TargetEntityType oldView = view;
		view = newView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW, oldView, newView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(TargetEntityType newView) {
		if (newView != view) {
			NotificationChain msgs = null;
			if (view != null)
				msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW, null, msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW, null, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW, newView, newView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getParentClassMapping() {
		return parentClassMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentClassMapping(TargetEntityType newParentClassMapping, NotificationChain msgs) {
		TargetEntityType oldParentClassMapping = parentClassMapping;
		parentClassMapping = newParentClassMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING, oldParentClassMapping, newParentClassMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentClassMapping(TargetEntityType newParentClassMapping) {
		if (newParentClassMapping != parentClassMapping) {
			NotificationChain msgs = null;
			if (parentClassMapping != null)
				msgs = ((InternalEObject)parentClassMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING, null, msgs);
			if (newParentClassMapping != null)
				msgs = ((InternalEObject)newParentClassMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING, null, msgs);
			msgs = basicSetParentClassMapping(newParentClassMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING, newParentClassMapping, newParentClassMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldMappingType> getFieldMapping() {
		if (fieldMapping == null) {
			fieldMapping = new EObjectContainmentEList<FieldMappingType>(FieldMappingType.class, this, RDBDiagramPackage.CLASS_MAPPING_TYPE__FIELD_MAPPING);
		}
		return fieldMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY:
				return basicSetBusinessEntity(null, msgs);
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE:
				return basicSetTable(null, msgs);
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE:
				return basicSetHistoryTable(null, msgs);
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW:
				return basicSetView(null, msgs);
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING:
				return basicSetParentClassMapping(null, msgs);
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__FIELD_MAPPING:
				return ((InternalEList<?>)getFieldMapping()).basicRemove(otherEnd, msgs);
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
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY:
				return getBusinessEntity();
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE:
				return getTable();
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE:
				return getHistoryTable();
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW:
				return getView();
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING:
				return getParentClassMapping();
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__FIELD_MAPPING:
				return getFieldMapping();
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
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY:
				setBusinessEntity((TargetEntityType)newValue);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE:
				setTable((TargetEntityType)newValue);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE:
				setHistoryTable((TargetEntityType)newValue);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW:
				setView((TargetEntityType)newValue);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING:
				setParentClassMapping((TargetEntityType)newValue);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__FIELD_MAPPING:
				getFieldMapping().clear();
				getFieldMapping().addAll((Collection<? extends FieldMappingType>)newValue);
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
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY:
				setBusinessEntity((TargetEntityType)null);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE:
				setTable((TargetEntityType)null);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE:
				setHistoryTable((TargetEntityType)null);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW:
				setView((TargetEntityType)null);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING:
				setParentClassMapping((TargetEntityType)null);
				return;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__FIELD_MAPPING:
				getFieldMapping().clear();
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
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__BUSINESS_ENTITY:
				return businessEntity != null;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__TABLE:
				return table != null;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__HISTORY_TABLE:
				return historyTable != null;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__VIEW:
				return view != null;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING:
				return parentClassMapping != null;
			case RDBDiagramPackage.CLASS_MAPPING_TYPE__FIELD_MAPPING:
				return fieldMapping != null && !fieldMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassMappingTypeImpl
