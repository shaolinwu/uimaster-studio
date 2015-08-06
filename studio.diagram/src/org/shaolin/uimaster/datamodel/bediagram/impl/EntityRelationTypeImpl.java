/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.EntityRelationType;
import org.shaolin.uimaster.datamodel.bediagram.RelationTypeType;

import org.shaolin.uimaster.datamodel.common.TargetEntityType;

import org.shaolin.uimaster.datamodel.common.impl.MetaDataTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl#getEntity2 <em>Entity2</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl#getRefedName <em>Refed Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl#getRefedPriority <em>Refed Priority</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.EntityRelationTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityRelationTypeImpl extends MetaDataTypeImpl implements EntityRelationType {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType entity;

	/**
	 * The cached value of the '{@link #getEntity2() <em>Entity2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity2()
	 * @generated
	 * @ordered
	 */
	protected TargetEntityType entity2;

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The default value of the '{@link #getRefedName() <em>Refed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefedName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefedName() <em>Refed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefedName()
	 * @generated
	 * @ordered
	 */
	protected String refedName = REFED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefedPriority() <em>Refed Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefedPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int REFED_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRefedPriority() <em>Refed Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefedPriority()
	 * @generated
	 * @ordered
	 */
	protected int refedPriority = REFED_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Refed Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refedPriorityESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RelationTypeType TYPE_EDEFAULT = RelationTypeType.ONE2_ONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelationTypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityRelationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.ENTITY_RELATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(TargetEntityType newEntity, NotificationChain msgs) {
		TargetEntityType oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(TargetEntityType newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEntityType getEntity2() {
		return entity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity2(TargetEntityType newEntity2, NotificationChain msgs) {
		TargetEntityType oldEntity2 = entity2;
		entity2 = newEntity2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY2, oldEntity2, newEntity2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity2(TargetEntityType newEntity2) {
		if (newEntity2 != entity2) {
			NotificationChain msgs = null;
			if (entity2 != null)
				msgs = ((InternalEObject)entity2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY2, null, msgs);
			if (newEntity2 != null)
				msgs = ((InternalEObject)newEntity2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY2, null, msgs);
			msgs = basicSetEntity2(newEntity2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY2, newEntity2, newEntity2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.ENTITY_RELATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.ENTITY_RELATION_TYPE__PRIORITY, oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		int oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.ENTITY_RELATION_TYPE__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefedName() {
		return refedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefedName(String newRefedName) {
		String oldRefedName = refedName;
		refedName = newRefedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_NAME, oldRefedName, refedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRefedPriority() {
		return refedPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefedPriority(int newRefedPriority) {
		int oldRefedPriority = refedPriority;
		refedPriority = newRefedPriority;
		boolean oldRefedPriorityESet = refedPriorityESet;
		refedPriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_PRIORITY, oldRefedPriority, refedPriority, !oldRefedPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefedPriority() {
		int oldRefedPriority = refedPriority;
		boolean oldRefedPriorityESet = refedPriorityESet;
		refedPriority = REFED_PRIORITY_EDEFAULT;
		refedPriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_PRIORITY, oldRefedPriority, REFED_PRIORITY_EDEFAULT, oldRefedPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefedPriority() {
		return refedPriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelationTypeType newType) {
		RelationTypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.ENTITY_RELATION_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		RelationTypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.ENTITY_RELATION_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY:
				return basicSetEntity(null, msgs);
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY2:
				return basicSetEntity2(null, msgs);
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
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY:
				return getEntity();
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY2:
				return getEntity2();
			case BEDiagramPackage.ENTITY_RELATION_TYPE__NAME:
				return getName();
			case BEDiagramPackage.ENTITY_RELATION_TYPE__PRIORITY:
				return getPriority();
			case BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_NAME:
				return getRefedName();
			case BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_PRIORITY:
				return getRefedPriority();
			case BEDiagramPackage.ENTITY_RELATION_TYPE__TYPE:
				return getType();
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
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY:
				setEntity((TargetEntityType)newValue);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY2:
				setEntity2((TargetEntityType)newValue);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_NAME:
				setRefedName((String)newValue);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_PRIORITY:
				setRefedPriority((Integer)newValue);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__TYPE:
				setType((RelationTypeType)newValue);
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
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY:
				setEntity((TargetEntityType)null);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY2:
				setEntity2((TargetEntityType)null);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__PRIORITY:
				unsetPriority();
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_NAME:
				setRefedName(REFED_NAME_EDEFAULT);
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_PRIORITY:
				unsetRefedPriority();
				return;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__TYPE:
				unsetType();
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
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY:
				return entity != null;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__ENTITY2:
				return entity2 != null;
			case BEDiagramPackage.ENTITY_RELATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BEDiagramPackage.ENTITY_RELATION_TYPE__PRIORITY:
				return isSetPriority();
			case BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_NAME:
				return REFED_NAME_EDEFAULT == null ? refedName != null : !REFED_NAME_EDEFAULT.equals(refedName);
			case BEDiagramPackage.ENTITY_RELATION_TYPE__REFED_PRIORITY:
				return isSetRefedPriority();
			case BEDiagramPackage.ENTITY_RELATION_TYPE__TYPE:
				return isSetType();
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
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(", refedName: ");
		result.append(refedName);
		result.append(", refedPriority: ");
		if (refedPriorityESet) result.append(refedPriority); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EntityRelationTypeImpl
