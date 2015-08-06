/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType;
import org.shaolin.uimaster.datamodel.bediagram.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl#getBEDiagram <em>BE Diagram</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl#getBusinessEntity <em>Business Entity</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.bediagram.impl.DocumentRootImpl#getConstantEntity <em>Constant Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BEDiagramPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BEDiagramPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BEDiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BEDiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEDiagramType getBEDiagram() {
		return (BEDiagramType)getMixed().get(BEDiagramPackage.Literals.DOCUMENT_ROOT__BE_DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBEDiagram(BEDiagramType newBEDiagram, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BEDiagramPackage.Literals.DOCUMENT_ROOT__BE_DIAGRAM, newBEDiagram, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBEDiagram(BEDiagramType newBEDiagram) {
		((FeatureMap.Internal)getMixed()).set(BEDiagramPackage.Literals.DOCUMENT_ROOT__BE_DIAGRAM, newBEDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntityType getBusinessEntity() {
		return (BusinessEntityType)getMixed().get(BEDiagramPackage.Literals.DOCUMENT_ROOT__BUSINESS_ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessEntity(BusinessEntityType newBusinessEntity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BEDiagramPackage.Literals.DOCUMENT_ROOT__BUSINESS_ENTITY, newBusinessEntity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessEntity(BusinessEntityType newBusinessEntity) {
		((FeatureMap.Internal)getMixed()).set(BEDiagramPackage.Literals.DOCUMENT_ROOT__BUSINESS_ENTITY, newBusinessEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantEntityType getConstantEntity() {
		return (ConstantEntityType)getMixed().get(BEDiagramPackage.Literals.DOCUMENT_ROOT__CONSTANT_ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantEntity(ConstantEntityType newConstantEntity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BEDiagramPackage.Literals.DOCUMENT_ROOT__CONSTANT_ENTITY, newConstantEntity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantEntity(ConstantEntityType newConstantEntity) {
		((FeatureMap.Internal)getMixed()).set(BEDiagramPackage.Literals.DOCUMENT_ROOT__CONSTANT_ENTITY, newConstantEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BEDiagramPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case BEDiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case BEDiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case BEDiagramPackage.DOCUMENT_ROOT__BE_DIAGRAM:
				return basicSetBEDiagram(null, msgs);
			case BEDiagramPackage.DOCUMENT_ROOT__BUSINESS_ENTITY:
				return basicSetBusinessEntity(null, msgs);
			case BEDiagramPackage.DOCUMENT_ROOT__CONSTANT_ENTITY:
				return basicSetConstantEntity(null, msgs);
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
			case BEDiagramPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BEDiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case BEDiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case BEDiagramPackage.DOCUMENT_ROOT__BE_DIAGRAM:
				return getBEDiagram();
			case BEDiagramPackage.DOCUMENT_ROOT__BUSINESS_ENTITY:
				return getBusinessEntity();
			case BEDiagramPackage.DOCUMENT_ROOT__CONSTANT_ENTITY:
				return getConstantEntity();
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
			case BEDiagramPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__BE_DIAGRAM:
				setBEDiagram((BEDiagramType)newValue);
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__BUSINESS_ENTITY:
				setBusinessEntity((BusinessEntityType)newValue);
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__CONSTANT_ENTITY:
				setConstantEntity((ConstantEntityType)newValue);
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
			case BEDiagramPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__BE_DIAGRAM:
				setBEDiagram((BEDiagramType)null);
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__BUSINESS_ENTITY:
				setBusinessEntity((BusinessEntityType)null);
				return;
			case BEDiagramPackage.DOCUMENT_ROOT__CONSTANT_ENTITY:
				setConstantEntity((ConstantEntityType)null);
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
			case BEDiagramPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BEDiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case BEDiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case BEDiagramPackage.DOCUMENT_ROOT__BE_DIAGRAM:
				return getBEDiagram() != null;
			case BEDiagramPackage.DOCUMENT_ROOT__BUSINESS_ENTITY:
				return getBusinessEntity() != null;
			case BEDiagramPackage.DOCUMENT_ROOT__CONSTANT_ENTITY:
				return getConstantEntity() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
