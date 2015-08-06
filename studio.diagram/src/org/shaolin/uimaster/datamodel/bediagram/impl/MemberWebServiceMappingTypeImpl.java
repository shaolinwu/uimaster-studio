/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType;
import org.shaolin.uimaster.datamodel.bediagram.StyleType;

import org.shaolin.uimaster.datamodel.common.impl.MetaDataTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Web Service Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberWebServiceMappingTypeImpl#isCollectionWrapped <em>Collection Wrapped</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberWebServiceMappingTypeImpl#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberWebServiceMappingTypeImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.MemberWebServiceMappingTypeImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberWebServiceMappingTypeImpl extends MetaDataTypeImpl implements MemberWebServiceMappingType {
	/**
	 * The default value of the '{@link #isCollectionWrapped() <em>Collection Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionWrapped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_WRAPPED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCollectionWrapped() <em>Collection Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionWrapped()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionWrapped = COLLECTION_WRAPPED_EDEFAULT;

	/**
	 * This is true if the Collection Wrapped attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean collectionWrappedESet;

	/**
	 * The default value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected boolean ignore = IGNORE_EDEFAULT;

	/**
	 * This is true if the Ignore attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreESet;

	/**
	 * The default value of the '{@link #getMappedName() <em>Mapped Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedName() <em>Mapped Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected String mappedName = MAPPED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final StyleType STYLE_EDEFAULT = StyleType.ELEMENT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleType style = STYLE_EDEFAULT;

	/**
	 * This is true if the Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean styleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberWebServiceMappingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.MEMBER_WEB_SERVICE_MAPPING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollectionWrapped() {
		return collectionWrapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionWrapped(boolean newCollectionWrapped) {
		boolean oldCollectionWrapped = collectionWrapped;
		collectionWrapped = newCollectionWrapped;
		boolean oldCollectionWrappedESet = collectionWrappedESet;
		collectionWrappedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED, oldCollectionWrapped, collectionWrapped, !oldCollectionWrappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCollectionWrapped() {
		boolean oldCollectionWrapped = collectionWrapped;
		boolean oldCollectionWrappedESet = collectionWrappedESet;
		collectionWrapped = COLLECTION_WRAPPED_EDEFAULT;
		collectionWrappedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED, oldCollectionWrapped, COLLECTION_WRAPPED_EDEFAULT, oldCollectionWrappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCollectionWrapped() {
		return collectionWrappedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnore() {
		return ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnore(boolean newIgnore) {
		boolean oldIgnore = ignore;
		ignore = newIgnore;
		boolean oldIgnoreESet = ignoreESet;
		ignoreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE, oldIgnore, ignore, !oldIgnoreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnore() {
		boolean oldIgnore = ignore;
		boolean oldIgnoreESet = ignoreESet;
		ignore = IGNORE_EDEFAULT;
		ignoreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE, oldIgnore, IGNORE_EDEFAULT, oldIgnoreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnore() {
		return ignoreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappedName() {
		return mappedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedName(String newMappedName) {
		String oldMappedName = mappedName;
		mappedName = newMappedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME, oldMappedName, mappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(StyleType newStyle) {
		StyleType oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		boolean oldStyleESet = styleESet;
		styleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE, oldStyle, style, !oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyle() {
		StyleType oldStyle = style;
		boolean oldStyleESet = styleESet;
		style = STYLE_EDEFAULT;
		styleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyle() {
		return styleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED:
				return isCollectionWrapped();
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE:
				return isIgnore();
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME:
				return getMappedName();
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE:
				return getStyle();
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
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED:
				setCollectionWrapped((Boolean)newValue);
				return;
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE:
				setIgnore((Boolean)newValue);
				return;
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME:
				setMappedName((String)newValue);
				return;
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE:
				setStyle((StyleType)newValue);
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
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED:
				unsetCollectionWrapped();
				return;
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE:
				unsetIgnore();
				return;
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME:
				setMappedName(MAPPED_NAME_EDEFAULT);
				return;
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE:
				unsetStyle();
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
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED:
				return isSetCollectionWrapped();
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE:
				return isSetIgnore();
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME:
				return MAPPED_NAME_EDEFAULT == null ? mappedName != null : !MAPPED_NAME_EDEFAULT.equals(mappedName);
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE:
				return isSetStyle();
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
		result.append(" (collectionWrapped: ");
		if (collectionWrappedESet) result.append(collectionWrapped); else result.append("<unset>");
		result.append(", ignore: ");
		if (ignoreESet) result.append(ignore); else result.append("<unset>");
		result.append(", mappedName: ");
		result.append(mappedName);
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MemberWebServiceMappingTypeImpl
