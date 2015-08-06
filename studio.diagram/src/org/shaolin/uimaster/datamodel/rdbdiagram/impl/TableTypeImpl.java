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

import org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.FKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.IndexType;
import org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType;
import org.shaolin.uimaster.datamodel.rdbdiagram.PKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl#getInheritAsscociation <em>Inherit Asscociation</em>}</li>
 *   <li>{@link org.shaolin.uimaster.datamodel.rdbdiagram.impl.TableTypeImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableTypeImpl extends RDBTypeImpl implements TableType {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnType> column;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexType> index;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceType> sequence;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected EList<PKType> primaryKey;

	/**
	 * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<FKType> foreignKey;

	/**
	 * The cached value of the '{@link #getInheritAsscociation() <em>Inherit Asscociation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritAsscociation()
	 * @generated
	 * @ordered
	 */
	protected InheritAssociationType inheritAsscociation;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected ClassMappingType mapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBDiagramPackage.Literals.TABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnType> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<ColumnType>(ColumnType.class, this, RDBDiagramPackage.TABLE_TYPE__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexType> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<IndexType>(IndexType.class, this, RDBDiagramPackage.TABLE_TYPE__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceType> getSequence() {
		if (sequence == null) {
			sequence = new EObjectContainmentEList<SequenceType>(SequenceType.class, this, RDBDiagramPackage.TABLE_TYPE__SEQUENCE);
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PKType> getPrimaryKey() {
		if (primaryKey == null) {
			primaryKey = new EObjectContainmentEList<PKType>(PKType.class, this, RDBDiagramPackage.TABLE_TYPE__PRIMARY_KEY);
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FKType> getForeignKey() {
		if (foreignKey == null) {
			foreignKey = new EObjectContainmentEList<FKType>(FKType.class, this, RDBDiagramPackage.TABLE_TYPE__FOREIGN_KEY);
		}
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritAssociationType getInheritAsscociation() {
		return inheritAsscociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInheritAsscociation(InheritAssociationType newInheritAsscociation, NotificationChain msgs) {
		InheritAssociationType oldInheritAsscociation = inheritAsscociation;
		inheritAsscociation = newInheritAsscociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION, oldInheritAsscociation, newInheritAsscociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritAsscociation(InheritAssociationType newInheritAsscociation) {
		if (newInheritAsscociation != inheritAsscociation) {
			NotificationChain msgs = null;
			if (inheritAsscociation != null)
				msgs = ((InternalEObject)inheritAsscociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION, null, msgs);
			if (newInheritAsscociation != null)
				msgs = ((InternalEObject)newInheritAsscociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION, null, msgs);
			msgs = basicSetInheritAsscociation(newInheritAsscociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION, newInheritAsscociation, newInheritAsscociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMappingType getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(ClassMappingType newMapping, NotificationChain msgs) {
		ClassMappingType oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.TABLE_TYPE__MAPPING, oldMapping, newMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(ClassMappingType newMapping) {
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.TABLE_TYPE__MAPPING, null, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDBDiagramPackage.TABLE_TYPE__MAPPING, null, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBDiagramPackage.TABLE_TYPE__MAPPING, newMapping, newMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDBDiagramPackage.TABLE_TYPE__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case RDBDiagramPackage.TABLE_TYPE__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
			case RDBDiagramPackage.TABLE_TYPE__SEQUENCE:
				return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
			case RDBDiagramPackage.TABLE_TYPE__PRIMARY_KEY:
				return ((InternalEList<?>)getPrimaryKey()).basicRemove(otherEnd, msgs);
			case RDBDiagramPackage.TABLE_TYPE__FOREIGN_KEY:
				return ((InternalEList<?>)getForeignKey()).basicRemove(otherEnd, msgs);
			case RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION:
				return basicSetInheritAsscociation(null, msgs);
			case RDBDiagramPackage.TABLE_TYPE__MAPPING:
				return basicSetMapping(null, msgs);
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
			case RDBDiagramPackage.TABLE_TYPE__COLUMN:
				return getColumn();
			case RDBDiagramPackage.TABLE_TYPE__INDEX:
				return getIndex();
			case RDBDiagramPackage.TABLE_TYPE__SEQUENCE:
				return getSequence();
			case RDBDiagramPackage.TABLE_TYPE__PRIMARY_KEY:
				return getPrimaryKey();
			case RDBDiagramPackage.TABLE_TYPE__FOREIGN_KEY:
				return getForeignKey();
			case RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION:
				return getInheritAsscociation();
			case RDBDiagramPackage.TABLE_TYPE__MAPPING:
				return getMapping();
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
			case RDBDiagramPackage.TABLE_TYPE__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends ColumnType>)newValue);
				return;
			case RDBDiagramPackage.TABLE_TYPE__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends IndexType>)newValue);
				return;
			case RDBDiagramPackage.TABLE_TYPE__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection<? extends SequenceType>)newValue);
				return;
			case RDBDiagramPackage.TABLE_TYPE__PRIMARY_KEY:
				getPrimaryKey().clear();
				getPrimaryKey().addAll((Collection<? extends PKType>)newValue);
				return;
			case RDBDiagramPackage.TABLE_TYPE__FOREIGN_KEY:
				getForeignKey().clear();
				getForeignKey().addAll((Collection<? extends FKType>)newValue);
				return;
			case RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION:
				setInheritAsscociation((InheritAssociationType)newValue);
				return;
			case RDBDiagramPackage.TABLE_TYPE__MAPPING:
				setMapping((ClassMappingType)newValue);
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
			case RDBDiagramPackage.TABLE_TYPE__COLUMN:
				getColumn().clear();
				return;
			case RDBDiagramPackage.TABLE_TYPE__INDEX:
				getIndex().clear();
				return;
			case RDBDiagramPackage.TABLE_TYPE__SEQUENCE:
				getSequence().clear();
				return;
			case RDBDiagramPackage.TABLE_TYPE__PRIMARY_KEY:
				getPrimaryKey().clear();
				return;
			case RDBDiagramPackage.TABLE_TYPE__FOREIGN_KEY:
				getForeignKey().clear();
				return;
			case RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION:
				setInheritAsscociation((InheritAssociationType)null);
				return;
			case RDBDiagramPackage.TABLE_TYPE__MAPPING:
				setMapping((ClassMappingType)null);
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
			case RDBDiagramPackage.TABLE_TYPE__COLUMN:
				return column != null && !column.isEmpty();
			case RDBDiagramPackage.TABLE_TYPE__INDEX:
				return index != null && !index.isEmpty();
			case RDBDiagramPackage.TABLE_TYPE__SEQUENCE:
				return sequence != null && !sequence.isEmpty();
			case RDBDiagramPackage.TABLE_TYPE__PRIMARY_KEY:
				return primaryKey != null && !primaryKey.isEmpty();
			case RDBDiagramPackage.TABLE_TYPE__FOREIGN_KEY:
				return foreignKey != null && !foreignKey.isEmpty();
			case RDBDiagramPackage.TABLE_TYPE__INHERIT_ASSCOCIATION:
				return inheritAsscociation != null;
			case RDBDiagramPackage.TABLE_TYPE__MAPPING:
				return mapping != null;
		}
		return super.eIsSet(featureID);
	}

} //TableTypeImpl
