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

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramTypeImpl#getBeEntity <em>Be Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramTypeImpl#getCeEntity <em>Ce Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramTypeImpl#getBePackage <em>Be Package</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramTypeImpl#getCePackage <em>Ce Package</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.BEDiagramTypeImpl#getDiagramPackage <em>Diagram Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BEDiagramTypeImpl extends EObjectImpl implements BEDiagramType {
	/**
	 * The cached value of the '{@link #getBeEntity() <em>Be Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessEntityType> beEntity;

	/**
	 * The cached value of the '{@link #getCeEntity() <em>Ce Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstantEntityType> ceEntity;

	/**
	 * The default value of the '{@link #getBePackage() <em>Be Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBePackage() <em>Be Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBePackage()
	 * @generated
	 * @ordered
	 */
	protected String bePackage = BE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCePackage() <em>Ce Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCePackage() <em>Ce Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCePackage()
	 * @generated
	 * @ordered
	 */
	protected String cePackage = CE_PACKAGE_EDEFAULT;

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
	protected BEDiagramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.BE_DIAGRAM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessEntityType> getBeEntity() {
		if (beEntity == null) {
			beEntity = new EObjectContainmentEList<BusinessEntityType>(BusinessEntityType.class, this, BEDiagramPackage.BE_DIAGRAM_TYPE__BE_ENTITY);
		}
		return beEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstantEntityType> getCeEntity() {
		if (ceEntity == null) {
			ceEntity = new EObjectContainmentEList<ConstantEntityType>(ConstantEntityType.class, this, BEDiagramPackage.BE_DIAGRAM_TYPE__CE_ENTITY);
		}
		return ceEntity;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BE_DIAGRAM_TYPE__DIAGRAM_PACKAGE, oldDiagramPackage, diagramPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBePackage() {
		return bePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBePackage(String newBePackage) {
		String oldBePackage = bePackage;
		bePackage = newBePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BE_DIAGRAM_TYPE__BE_PACKAGE, oldBePackage, bePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCePackage() {
		return cePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCePackage(String newCePackage) {
		String oldCePackage = cePackage;
		cePackage = newCePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BEDiagramPackage.BE_DIAGRAM_TYPE__CE_PACKAGE, oldCePackage, cePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.BE_DIAGRAM_TYPE__BE_ENTITY:
				return ((InternalEList<?>)getBeEntity()).basicRemove(otherEnd, msgs);
			case BEDiagramPackage.BE_DIAGRAM_TYPE__CE_ENTITY:
				return ((InternalEList<?>)getCeEntity()).basicRemove(otherEnd, msgs);
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
			case BEDiagramPackage.BE_DIAGRAM_TYPE__BE_ENTITY:
				return getBeEntity();
			case BEDiagramPackage.BE_DIAGRAM_TYPE__CE_ENTITY:
				return getCeEntity();
			case BEDiagramPackage.BE_DIAGRAM_TYPE__BE_PACKAGE:
				return getBePackage();
			case BEDiagramPackage.BE_DIAGRAM_TYPE__CE_PACKAGE:
				return getCePackage();
			case BEDiagramPackage.BE_DIAGRAM_TYPE__DIAGRAM_PACKAGE:
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
			case BEDiagramPackage.BE_DIAGRAM_TYPE__BE_ENTITY:
				getBeEntity().clear();
				getBeEntity().addAll((Collection<? extends BusinessEntityType>)newValue);
				return;
			case BEDiagramPackage.BE_DIAGRAM_TYPE__CE_ENTITY:
				getCeEntity().clear();
				getCeEntity().addAll((Collection<? extends ConstantEntityType>)newValue);
				return;
			case BEDiagramPackage.BE_DIAGRAM_TYPE__BE_PACKAGE:
				setBePackage((String)newValue);
				return;
			case BEDiagramPackage.BE_DIAGRAM_TYPE__CE_PACKAGE:
				setCePackage((String)newValue);
				return;
			case BEDiagramPackage.BE_DIAGRAM_TYPE__DIAGRAM_PACKAGE:
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
			case BEDiagramPackage.BE_DIAGRAM_TYPE__BE_ENTITY:
				getBeEntity().clear();
				return;
			case BEDiagramPackage.BE_DIAGRAM_TYPE__CE_ENTITY:
				getCeEntity().clear();
				return;
			case BEDiagramPackage.BE_DIAGRAM_TYPE__BE_PACKAGE:
				setBePackage(BE_PACKAGE_EDEFAULT);
				return;
			case BEDiagramPackage.BE_DIAGRAM_TYPE__CE_PACKAGE:
				setCePackage(CE_PACKAGE_EDEFAULT);
				return;
			case BEDiagramPackage.BE_DIAGRAM_TYPE__DIAGRAM_PACKAGE:
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
			case BEDiagramPackage.BE_DIAGRAM_TYPE__BE_ENTITY:
				return beEntity != null && !beEntity.isEmpty();
			case BEDiagramPackage.BE_DIAGRAM_TYPE__CE_ENTITY:
				return ceEntity != null && !ceEntity.isEmpty();
			case BEDiagramPackage.BE_DIAGRAM_TYPE__BE_PACKAGE:
				return BE_PACKAGE_EDEFAULT == null ? bePackage != null : !BE_PACKAGE_EDEFAULT.equals(bePackage);
			case BEDiagramPackage.BE_DIAGRAM_TYPE__CE_PACKAGE:
				return CE_PACKAGE_EDEFAULT == null ? cePackage != null : !CE_PACKAGE_EDEFAULT.equals(cePackage);
			case BEDiagramPackage.BE_DIAGRAM_TYPE__DIAGRAM_PACKAGE:
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
		result.append(" (bePackage: ");
		result.append(bePackage);
		result.append(", cePackage: ");
		result.append(cePackage);
		result.append(", diagramPackage: ");
		result.append(diagramPackage);
		result.append(')');
		return result.toString();
	}

} //BEDiagramTypeImpl
