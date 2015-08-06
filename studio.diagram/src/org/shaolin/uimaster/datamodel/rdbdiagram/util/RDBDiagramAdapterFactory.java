/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.shaolin.uimaster.datamodel.common.EntityType;

import org.shaolin.uimaster.datamodel.rdbdiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage
 * @generated
 */
public class RDBDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RDBDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RDBDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBDiagramSwitch<Adapter> modelSwitch =
		new RDBDiagramSwitch<Adapter>() {
			@Override
			public Adapter caseClassMappingType(ClassMappingType object) {
				return createClassMappingTypeAdapter();
			}
			@Override
			public Adapter caseColumnType(ColumnType object) {
				return createColumnTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFieldMappingType(FieldMappingType object) {
				return createFieldMappingTypeAdapter();
			}
			@Override
			public Adapter caseFKType(FKType object) {
				return createFKTypeAdapter();
			}
			@Override
			public Adapter caseIndexType(IndexType object) {
				return createIndexTypeAdapter();
			}
			@Override
			public Adapter caseInheritAssociationType(InheritAssociationType object) {
				return createInheritAssociationTypeAdapter();
			}
			@Override
			public Adapter caseJoinTableType(JoinTableType object) {
				return createJoinTableTypeAdapter();
			}
			@Override
			public Adapter caseListFieldMappingType(ListFieldMappingType object) {
				return createListFieldMappingTypeAdapter();
			}
			@Override
			public Adapter casePKType(PKType object) {
				return createPKTypeAdapter();
			}
			@Override
			public Adapter caseRDBDiagramType(RDBDiagramType object) {
				return createRDBDiagramTypeAdapter();
			}
			@Override
			public Adapter caseRDBType(RDBType object) {
				return createRDBTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseTableType(TableType object) {
				return createTableTypeAdapter();
			}
			@Override
			public Adapter caseViewType(ViewType object) {
				return createViewTypeAdapter();
			}
			@Override
			public Adapter caseEntityType(EntityType object) {
				return createEntityTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType <em>Class Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType
	 * @generated
	 */
	public Adapter createClassMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType
	 * @generated
	 */
	public Adapter createColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType <em>Field Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType
	 * @generated
	 */
	public Adapter createFieldMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.FKType <em>FK Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.FKType
	 * @generated
	 */
	public Adapter createFKTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.IndexType <em>Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.IndexType
	 * @generated
	 */
	public Adapter createIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType <em>Inherit Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType
	 * @generated
	 */
	public Adapter createInheritAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType <em>Join Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType
	 * @generated
	 */
	public Adapter createJoinTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType <em>List Field Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType
	 * @generated
	 */
	public Adapter createListFieldMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.PKType <em>PK Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.PKType
	 * @generated
	 */
	public Adapter createPKTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType
	 * @generated
	 */
	public Adapter createRDBDiagramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.RDBType <em>RDB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBType
	 * @generated
	 */
	public Adapter createRDBTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.TableType
	 * @generated
	 */
	public Adapter createTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.rdbdiagram.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.ViewType
	 * @generated
	 */
	public Adapter createViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.common.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.common.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RDBDiagramAdapterFactory
