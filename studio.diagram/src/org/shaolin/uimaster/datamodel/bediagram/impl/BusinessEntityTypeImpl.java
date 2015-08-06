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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.ObjectRefType;
import org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType;
import org.shaolin.uimaster.datamodel.bediagram.SearchMethodType;
import org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;
import org.shaolin.uimaster.datamodel.common.TargetJavaType;
import org.shaolin.uimaster.datamodel.common.impl.EntityTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl#getParentObject <em>Parent Object</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl#getPersistentConfig <em>Persistent Config</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl#getValidatorConfig <em>Validator Config</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl#getSearchMethod <em>Search Method</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl#isExtensible <em>Extensible</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl#isNeedEquals <em>Need Equals</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BusinessEntityTypeImpl#isNeedHistory <em>Need History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessEntityTypeImpl extends EntityTypeImpl implements BusinessEntityType {
	/**
	 * The cached value of the '{@link #getParentObject() <em>Parent Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectRefType parentObject;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberType> member;

	/**
	 * The cached value of the '{@link #getPersistentConfig() <em>Persistent Config</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<PersistentConfigType> persistentConfig;

	/**
	 * The cached value of the '{@link #getValidatorConfig() <em>Validator Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorConfig()
	 * @generated
	 * @ordered
	 */
	protected ValidatorConfigType validatorConfig;

	/**
	 * The cached value of the '{@link #getSearchMethod() <em>Search Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchMethodType> searchMethod;

	/**
	 * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected String abbreviation = ABBREVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isExtensible() <em>Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtensible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENSIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isExtensible() <em>Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtensible()
	 * @generated
	 * @ordered
	 */
	protected boolean extensible = EXTENSIBLE_EDEFAULT;

	/**
	 * This is true if the Extensible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extensibleESet;

	/**
	 * The default value of the '{@link #isNeedEquals() <em>Need Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedEquals()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_EQUALS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNeedEquals() <em>Need Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedEquals()
	 * @generated
	 * @ordered
	 */
	protected boolean needEquals = NEED_EQUALS_EDEFAULT;

	/**
	 * This is true if the Need Equals attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needEqualsESet;

	/**
	 * The default value of the '{@link #isNeedHistory() <em>Need History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_HISTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedHistory() <em>Need History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedHistory()
	 * @generated
	 * @ordered
	 */
	protected boolean needHistory = NEED_HISTORY_EDEFAULT;

	/**
	 * This is true if the Need History attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needHistoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessEntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType getParentObject() {
		return parentObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentObject(ObjectRefType newParentObject, NotificationChain msgs) {
		ObjectRefType oldParentObject = parentObject;
		parentObject = newParentObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT, oldParentObject, newParentObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentObject(ObjectRefType newParentObject) {
		if (newParentObject != parentObject) {
			NotificationChain msgs = null;
			if (parentObject != null)
				msgs = ((InternalEObject)parentObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT, null, msgs);
			if (newParentObject != null)
				msgs = ((InternalEObject)newParentObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT, null, msgs);
			msgs = basicSetParentObject(newParentObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT, newParentObject, newParentObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberType> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<MemberType>(MemberType.class, this, BEDiagramPackage.BUSINESS_ENTITY_TYPE__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersistentConfigType> getPersistentConfig() {
		if (persistentConfig == null) {
			persistentConfig = new EObjectContainmentEList<PersistentConfigType>(PersistentConfigType.class, this, BEDiagramPackage.BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG);
		}
		return persistentConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidatorConfigType getValidatorConfig() {
		return validatorConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidatorConfig(ValidatorConfigType newValidatorConfig, NotificationChain msgs) {
		ValidatorConfigType oldValidatorConfig = validatorConfig;
		validatorConfig = newValidatorConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG, oldValidatorConfig, newValidatorConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorConfig(ValidatorConfigType newValidatorConfig) {
		if (newValidatorConfig != validatorConfig) {
			NotificationChain msgs = null;
			if (validatorConfig != null)
				msgs = ((InternalEObject)validatorConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG, null, msgs);
			if (newValidatorConfig != null)
				msgs = ((InternalEObject)newValidatorConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG, null, msgs);
			msgs = basicSetValidatorConfig(newValidatorConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG, newValidatorConfig, newValidatorConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SearchMethodType> getSearchMethod() {
		if (searchMethod == null) {
			searchMethod = new EObjectContainmentEList<SearchMethodType>(SearchMethodType.class, this, BEDiagramPackage.BUSINESS_ENTITY_TYPE__SEARCH_METHOD);
		}
		return searchMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbreviation(String newAbbreviation) {
		String oldAbbreviation = abbreviation;
		abbreviation = newAbbreviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__ABBREVIATION, oldAbbreviation, abbreviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtensible() {
		return extensible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensible(boolean newExtensible) {
		boolean oldExtensible = extensible;
		extensible = newExtensible;
		boolean oldExtensibleESet = extensibleESet;
		extensibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__EXTENSIBLE, oldExtensible, extensible, !oldExtensibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtensible() {
		boolean oldExtensible = extensible;
		boolean oldExtensibleESet = extensibleESet;
		extensible = EXTENSIBLE_EDEFAULT;
		extensibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__EXTENSIBLE, oldExtensible, EXTENSIBLE_EDEFAULT, oldExtensibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtensible() {
		return extensibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedEquals() {
		return needEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedEquals(boolean newNeedEquals) {
		boolean oldNeedEquals = needEquals;
		needEquals = newNeedEquals;
		boolean oldNeedEqualsESet = needEqualsESet;
		needEqualsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_EQUALS, oldNeedEquals, needEquals, !oldNeedEqualsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNeedEquals() {
		boolean oldNeedEquals = needEquals;
		boolean oldNeedEqualsESet = needEqualsESet;
		needEquals = NEED_EQUALS_EDEFAULT;
		needEqualsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_EQUALS, oldNeedEquals, NEED_EQUALS_EDEFAULT, oldNeedEqualsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNeedEquals() {
		return needEqualsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedHistory() {
		return needHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedHistory(boolean newNeedHistory) {
		boolean oldNeedHistory = needHistory;
		needHistory = newNeedHistory;
		boolean oldNeedHistoryESet = needHistoryESet;
		needHistoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_HISTORY, oldNeedHistory, needHistory, !oldNeedHistoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNeedHistory() {
		boolean oldNeedHistory = needHistory;
		boolean oldNeedHistoryESet = needHistoryESet;
		needHistory = NEED_HISTORY_EDEFAULT;
		needHistoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_HISTORY, oldNeedHistory, NEED_HISTORY_EDEFAULT, oldNeedHistoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNeedHistory() {
		return needHistoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT:
				return basicSetParentObject(null, msgs);
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG:
				return ((InternalEList<?>)getPersistentConfig()).basicRemove(otherEnd, msgs);
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG:
				return basicSetValidatorConfig(null, msgs);
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__SEARCH_METHOD:
				return ((InternalEList<?>)getSearchMethod()).basicRemove(otherEnd, msgs);
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
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT:
				return getParentObject();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__MEMBER:
				return getMember();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG:
				return getPersistentConfig();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG:
				return getValidatorConfig();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__SEARCH_METHOD:
				return getSearchMethod();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__ABBREVIATION:
				return getAbbreviation();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__EXTENSIBLE:
				return isExtensible();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_EQUALS:
				return isNeedEquals();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_HISTORY:
				return isNeedHistory();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT:
				if (this.getParentObject() != null) {
					if (this.getParentObject() instanceof BEObjRefType) {
						return ((BEObjRefType)this.getParentObject())
								.getTargetEntity().getEntityName();
					} 
					return ((JavaObjRefType)this.getParentObject())
							.getTargetJava().getName();
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
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT:
				setParentObject((ObjectRefType)newValue);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends MemberType>)newValue);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG:
				getPersistentConfig().clear();
				getPersistentConfig().addAll((Collection<? extends PersistentConfigType>)newValue);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG:
				setValidatorConfig((ValidatorConfigType)newValue);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__SEARCH_METHOD:
				getSearchMethod().clear();
				getSearchMethod().addAll((Collection<? extends SearchMethodType>)newValue);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__ABBREVIATION:
				setAbbreviation((String)newValue);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__EXTENSIBLE:
				setExtensible((Boolean)newValue);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_EQUALS:
				setNeedEquals((Boolean)newValue);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_HISTORY:
				setNeedHistory((Boolean)newValue);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT:
				
				if (newValue.toString().trim().isEmpty()) {
					this.setParentObject(null);
					return;
				}
				
				String oldValue = (String)eGet(featureID, true, true);
				try {
					Class.forName(newValue.toString());
					JavaObjRefType javaRef = BEDiagramFactory.eINSTANCE.createJavaObjRefType();
					TargetJavaType entityType = CommonFactory.eINSTANCE.createTargetJavaType();
					entityType.setName(newValue.toString());
					javaRef.setTargetJava(entityType);
					this.setParentObject(javaRef);
				} catch (ClassNotFoundException e) {
					BEObjRefType beRef = BEDiagramFactory.eINSTANCE.createBEObjRefType();
					TargetEntityType entityType = CommonFactory.eINSTANCE.createTargetEntityType();
					entityType.setEntityName(newValue.toString());
					beRef.setTargetEntity(entityType);
					this.setParentObject(beRef);
				}
				
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.SET, 
							BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT, 
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
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT:
				setParentObject((ObjectRefType)null);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__MEMBER:
				getMember().clear();
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG:
				getPersistentConfig().clear();
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG:
				setValidatorConfig((ValidatorConfigType)null);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__SEARCH_METHOD:
				getSearchMethod().clear();
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__ABBREVIATION:
				setAbbreviation(ABBREVIATION_EDEFAULT);
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__EXTENSIBLE:
				unsetExtensible();
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_EQUALS:
				unsetNeedEquals();
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_HISTORY:
				unsetNeedHistory();
				return;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT:
				if (this.getParentObject() != null) {
					this.setParentObject(null);
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
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT_OBJECT:
				return parentObject != null;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__MEMBER:
				return member != null && !member.isEmpty();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG:
				return persistentConfig != null && !persistentConfig.isEmpty();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG:
				return validatorConfig != null;
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__SEARCH_METHOD:
				return searchMethod != null && !searchMethod.isEmpty();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__ABBREVIATION:
				return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals(abbreviation);
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__EXTENSIBLE:
				return isSetExtensible();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_EQUALS:
				return isSetNeedEquals();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__NEED_HISTORY:
				return isSetNeedHistory();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE__PARENT:
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
		result.append(" (abbreviation: ");
		result.append(abbreviation);
		result.append(", extensible: ");
		if (extensibleESet) result.append(extensible); else result.append("<unset>");
		result.append(", needEquals: ");
		if (needEqualsESet) result.append(needEquals); else result.append("<unset>");
		result.append(", needHistory: ");
		if (needHistoryESet) result.append(needHistory); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
		
	}
	
	public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
		
	}
	
} //BusinessEntityTypeImpl
