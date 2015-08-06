/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

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
import org.shaolin.uimaster.datamodel.bediagram.BECollectionType;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEMapType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BEType;
import org.shaolin.uimaster.datamodel.bediagram.CEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.util.BETypeConvertor;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.MetaDataInfoType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;
import org.shaolin.uimaster.datamodel.common.TargetJavaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl#getMetaInfo <em>Meta Info</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl#isAccessible <em>Accessible</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl#isModifiable <em>Modifiable</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberTypeImpl#isTransient <em>Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberTypeImpl extends EObjectImpl implements MemberType {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BEType type;

	/**
	 * The cached value of the '{@link #getMetaInfo() <em>Meta Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaDataInfoType> metaInfo;

	/**
	 * The default value of the '{@link #isAccessible() <em>Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCESSIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAccessible() <em>Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessible()
	 * @generated
	 * @ordered
	 */
	protected boolean accessible = ACCESSIBLE_EDEFAULT;

	/**
	 * This is true if the Accessible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessibleESet;

	/**
	 * The default value of the '{@link #isModifiable() <em>Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModifiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODIFIABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isModifiable() <em>Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModifiable()
	 * @generated
	 * @ordered
	 */
	protected boolean modifiable = MODIFIABLE_EDEFAULT;

	/**
	 * This is true if the Modifiable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modifiableESet;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * This is true if the Transient attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transientESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.MEMBER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(BEType newType, NotificationChain msgs) {
		BEType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_TYPE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BEType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.MEMBER_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.MEMBER_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_TYPE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaDataInfoType> getMetaInfo() {
		if (metaInfo == null) {
			metaInfo = new EObjectContainmentEList<MetaDataInfoType>(MetaDataInfoType.class, this, BEDiagramPackage.MEMBER_TYPE__META_INFO);
		}
		return metaInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccessible() {
		return accessible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessible(boolean newAccessible) {
		boolean oldAccessible = accessible;
		accessible = newAccessible;
		boolean oldAccessibleESet = accessibleESet;
		accessibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_TYPE__ACCESSIBLE, oldAccessible, accessible, !oldAccessibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccessible() {
		boolean oldAccessible = accessible;
		boolean oldAccessibleESet = accessibleESet;
		accessible = ACCESSIBLE_EDEFAULT;
		accessibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.MEMBER_TYPE__ACCESSIBLE, oldAccessible, ACCESSIBLE_EDEFAULT, oldAccessibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccessible() {
		return accessibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModifiable() {
		return modifiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiable(boolean newModifiable) {
		boolean oldModifiable = modifiable;
		modifiable = newModifiable;
		boolean oldModifiableESet = modifiableESet;
		modifiableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_TYPE__MODIFIABLE, oldModifiable, modifiable, !oldModifiableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModifiable() {
		boolean oldModifiable = modifiable;
		boolean oldModifiableESet = modifiableESet;
		modifiable = MODIFIABLE_EDEFAULT;
		modifiableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.MEMBER_TYPE__MODIFIABLE, oldModifiable, MODIFIABLE_EDEFAULT, oldModifiableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModifiable() {
		return modifiableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		boolean oldTransientESet = transientESet;
		transientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_TYPE__TRANSIENT, oldTransient, transient_, !oldTransientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransient() {
		boolean oldTransient = transient_;
		boolean oldTransientESet = transientESet;
		transient_ = TRANSIENT_EDEFAULT;
		transientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.MEMBER_TYPE__TRANSIENT, oldTransient, TRANSIENT_EDEFAULT, oldTransientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransient() {
		return transientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.MEMBER_TYPE__TYPE:
				return basicSetType(null, msgs);
			case BEDiagramPackage.MEMBER_TYPE__META_INFO:
				return ((InternalEList<?>)getMetaInfo()).basicRemove(otherEnd, msgs);
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
			case BEDiagramPackage.MEMBER_TYPE__NAME:
				return getName();
			case BEDiagramPackage.MEMBER_TYPE__DESCRIPTION:
				return getDescription();
			case BEDiagramPackage.MEMBER_TYPE__DEFAULT_VALUE:
				return getDefaultValue();
			case BEDiagramPackage.MEMBER_TYPE__TYPE:
				return getType();
			case BEDiagramPackage.MEMBER_TYPE__META_INFO:
				return getMetaInfo();
			case BEDiagramPackage.MEMBER_TYPE__ACCESSIBLE:
				return isAccessible();
			case BEDiagramPackage.MEMBER_TYPE__MODIFIABLE:
				return isModifiable();
			case BEDiagramPackage.MEMBER_TYPE__TRANSIENT:
				return isTransient();
			case BEDiagramPackage.MEMBER_TYPE_MAP_KEY_TYPE:
				if (this.getType() instanceof BEMapType) {
					BEMapType mapType = (BEMapType)this.getType();
					return BETypeConvertor.toJavaType(mapType.getKeyType());
				}
				return "";
			case BEDiagramPackage.MEMBER_TYPE_REF_ENTITY_NAME:
				
				if (this.getType() instanceof BECollectionType){
					BECollectionType p = (BECollectionType)this.getType();
					if (p.getElementType() != null) {
						return ((BEObjRefType)p.getElementType()).getTargetEntity().getEntityName();
					}
				} else if (this.getType() instanceof CEObjRefType){
					CEObjRefType p = (CEObjRefType)this.getType();
					if (p.getTargetEntity() != null) {
						return p.getTargetEntity().getEntityName();
					}
				} else if (this.getType() instanceof BEObjRefType){
					BEObjRefType p = (BEObjRefType)this.getType();
					if (p.getTargetEntity() != null) {
						return p.getTargetEntity().getEntityName();
					}
				} else if (this.getType() instanceof JavaObjRefType){
					JavaObjRefType p = (JavaObjRefType)this.getType();
					if (p.getTargetJava() != null) {
						return p.getTargetJava().getName();
					}
				}
				return "";
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
			case BEDiagramPackage.MEMBER_TYPE__NAME:
				setName((String)newValue);
				return;
			case BEDiagramPackage.MEMBER_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BEDiagramPackage.MEMBER_TYPE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case BEDiagramPackage.MEMBER_TYPE__TYPE:
				setType((BEType)newValue);
				return;
			case BEDiagramPackage.MEMBER_TYPE__META_INFO:
				getMetaInfo().clear();
				getMetaInfo().addAll((Collection<? extends MetaDataInfoType>)newValue);
				return;
			case BEDiagramPackage.MEMBER_TYPE__ACCESSIBLE:
				setAccessible((Boolean)newValue);
				return;
			case BEDiagramPackage.MEMBER_TYPE__MODIFIABLE:
				setModifiable((Boolean)newValue);
				return;
			case BEDiagramPackage.MEMBER_TYPE__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case BEDiagramPackage.MEMBER_TYPE_MAP_KEY_TYPE:
				if (this.getType() instanceof BEMapType) {
					BEMapType mapType = (BEMapType)this.getType();
					mapType.setKeyType(BETypeConvertor.createType(newValue.toString()));
				}
				return;
			case BEDiagramPackage.MEMBER_TYPE_REF_ENTITY_NAME:
				String oldValue = (String)eGet(featureID, true, true);
				if (this.getType() instanceof BECollectionType){
					BECollectionTypeImpl p = (BECollectionTypeImpl)this.getType();
					if (p.getElementType() == null) {
						BEObjRefType beRefType = BEDiagramFactory.eINSTANCE.createBEObjRefType();
						TargetEntityType entityType = CommonFactory.eINSTANCE.createTargetEntityType();
						beRefType.setTargetEntity(entityType);
						p.setElementType(beRefType);
					}
					((BEObjRefType)p.getElementType()).getTargetEntity().setEntityName(newValue.toString());
				} else if (this.getType() instanceof CEObjRefType){
					CEObjRefType p = (CEObjRefType)this.getType();
					if (p.getTargetEntity() == null) {
						TargetEntityType entityType = CommonFactory.eINSTANCE.createTargetEntityType();
						p.setTargetEntity(entityType);
					}
					p.getTargetEntity().setEntityName(newValue.toString());
				} else if (this.getType() instanceof BEObjRefType){
					BEObjRefType p = (BEObjRefType)this.getType();
					if (p.getTargetEntity() == null) {
						TargetEntityType entityType = CommonFactory.eINSTANCE.createTargetEntityType();
						p.setTargetEntity(entityType);
					}
					p.getTargetEntity().setEntityName(newValue.toString());
				} else if (this.getType() instanceof JavaObjRefType){
					JavaObjRefType p = (JavaObjRefType)this.getType();
					if (p.getTargetJava() == null) {
						TargetJavaType entityType = CommonFactory.eINSTANCE.createTargetJavaType();
						p.setTargetJava(entityType);
					}
					p.getTargetJava().setName(newValue.toString());
				}
				
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.SET, 
							BEDiagramPackage.MEMBER_TYPE_REF_ENTITY_NAME, 
							oldValue, newValue.toString()));
				}
				
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
			case BEDiagramPackage.MEMBER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BEDiagramPackage.MEMBER_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BEDiagramPackage.MEMBER_TYPE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case BEDiagramPackage.MEMBER_TYPE__TYPE:
				setType((BEType)null);
				return;
			case BEDiagramPackage.MEMBER_TYPE__META_INFO:
				getMetaInfo().clear();
				return;
			case BEDiagramPackage.MEMBER_TYPE__ACCESSIBLE:
				unsetAccessible();
				return;
			case BEDiagramPackage.MEMBER_TYPE__MODIFIABLE:
				unsetModifiable();
				return;
			case BEDiagramPackage.MEMBER_TYPE__TRANSIENT:
				unsetTransient();
				return;
			case BEDiagramPackage.MEMBER_TYPE_MAP_KEY_TYPE:
				if (this.getType() instanceof BEMapType) {
					BEMapType mapType = (BEMapType)this.getType();
					mapType.setKeyType(null);
				}
				return;
			case BEDiagramPackage.MEMBER_TYPE_REF_ENTITY_NAME:
				
				if (this.getType() instanceof BECollectionType){
					BECollectionType p = (BECollectionType)this.getType();
					if (p.getElementType() != null) {
						p.setElementType(null);
					}
				} else if (this.getType() instanceof CEObjRefType){
					CEObjRefType p = (CEObjRefType)this.getType();
					if (p.getTargetEntity() != null) {
						p.setTargetEntity(null);
					}
				} else if (this.getType() instanceof BEObjRefType){
					BEObjRefType p = (BEObjRefType)this.getType();
					if (p.getTargetEntity() != null) {
						p.setTargetEntity(null);
					}
				} else if (this.getType() instanceof JavaObjRefType){
					JavaObjRefType p = (JavaObjRefType)this.getType();
					if (p.getTargetJava() != null) {
						p.setTargetJava(null);
					}
				}
				
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
			case BEDiagramPackage.MEMBER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BEDiagramPackage.MEMBER_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BEDiagramPackage.MEMBER_TYPE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case BEDiagramPackage.MEMBER_TYPE__TYPE:
				return type != null;
			case BEDiagramPackage.MEMBER_TYPE__META_INFO:
				return metaInfo != null && !metaInfo.isEmpty();
			case BEDiagramPackage.MEMBER_TYPE__ACCESSIBLE:
				return isSetAccessible();
			case BEDiagramPackage.MEMBER_TYPE__MODIFIABLE:
				return isSetModifiable();
			case BEDiagramPackage.MEMBER_TYPE__TRANSIENT:
				return isSetTransient();
			case BEDiagramPackage.MEMBER_TYPE_REF_ENTITY_NAME:
				return true;
			case BEDiagramPackage.MEMBER_TYPE_MAP_KEY_TYPE:
				return true;
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
		result.append(", description: ");
		result.append(description);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", accessible: ");
		if (accessibleESet) result.append(accessible); else result.append("<unset>");
		result.append(", modifiable: ");
		if (modifiableESet) result.append(modifiable); else result.append("<unset>");
		result.append(", transient: ");
		if (transientESet) result.append(transient_); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MemberTypeImpl
