/**
 */
package org.shaolin.uimaster.datamodel.bediagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.shaolin.uimaster.datamodel.bediagram.BECollectionType;
import org.shaolin.uimaster.datamodel.bediagram.BEComplexType;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BEListType;
import org.shaolin.uimaster.datamodel.bediagram.BEMapType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BEPrimitiveType;
import org.shaolin.uimaster.datamodel.bediagram.BESetType;
import org.shaolin.uimaster.datamodel.bediagram.BEType;
import org.shaolin.uimaster.datamodel.bediagram.BinaryType;
import org.shaolin.uimaster.datamodel.bediagram.BooleanType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.CEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantValueType;
import org.shaolin.uimaster.datamodel.bediagram.DateTimeType;
import org.shaolin.uimaster.datamodel.bediagram.DocumentRoot;
import org.shaolin.uimaster.datamodel.bediagram.DoubleType;
import org.shaolin.uimaster.datamodel.bediagram.DummyFieldType;
import org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType;
import org.shaolin.uimaster.datamodel.bediagram.EntityRelationType;
import org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType;
import org.shaolin.uimaster.datamodel.bediagram.FileType;
import org.shaolin.uimaster.datamodel.bediagram.IntType;
import org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.LongType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType;
import org.shaolin.uimaster.datamodel.bediagram.ObjectRefType;
import org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType;
import org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType;
import org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType;
import org.shaolin.uimaster.datamodel.bediagram.RelationKeyType;
import org.shaolin.uimaster.datamodel.bediagram.SearchMethodType;
import org.shaolin.uimaster.datamodel.bediagram.StringType;
import org.shaolin.uimaster.datamodel.bediagram.TimeType;
import org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType;
import org.shaolin.uimaster.datamodel.common.EntityType;
import org.shaolin.uimaster.datamodel.common.MetaDataType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage
 * @generated
 */
public class BEDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BEDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BEDiagramPackage.eINSTANCE;
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
	protected BEDiagramSwitch<Adapter> modelSwitch =
		new BEDiagramSwitch<Adapter>() {
			@Override
			public Adapter caseBECollectionType(BECollectionType object) {
				return createBECollectionTypeAdapter();
			}
			@Override
			public Adapter caseBEComplexType(BEComplexType object) {
				return createBEComplexTypeAdapter();
			}
			@Override
			public Adapter caseBEDiagramType(BEDiagramType object) {
				return createBEDiagramTypeAdapter();
			}
			@Override
			public Adapter caseBEListType(BEListType object) {
				return createBEListTypeAdapter();
			}
			@Override
			public Adapter caseBEMapType(BEMapType object) {
				return createBEMapTypeAdapter();
			}
			@Override
			public Adapter caseBEObjRefType(BEObjRefType object) {
				return createBEObjRefTypeAdapter();
			}
			@Override
			public Adapter caseBEPrimitiveType(BEPrimitiveType object) {
				return createBEPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseBESetType(BESetType object) {
				return createBESetTypeAdapter();
			}
			@Override
			public Adapter caseBEType(BEType object) {
				return createBETypeAdapter();
			}
			@Override
			public Adapter caseBinaryType(BinaryType object) {
				return createBinaryTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseBusinessEntityType(BusinessEntityType object) {
				return createBusinessEntityTypeAdapter();
			}
			@Override
			public Adapter caseCEObjRefType(CEObjRefType object) {
				return createCEObjRefTypeAdapter();
			}
			@Override
			public Adapter caseConstantEntityType(ConstantEntityType object) {
				return createConstantEntityTypeAdapter();
			}
			@Override
			public Adapter caseConstantValueType(ConstantValueType object) {
				return createConstantValueTypeAdapter();
			}
			@Override
			public Adapter caseDateTimeType(DateTimeType object) {
				return createDateTimeTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDoubleType(DoubleType object) {
				return createDoubleTypeAdapter();
			}
			@Override
			public Adapter caseDummyFieldType(DummyFieldType object) {
				return createDummyFieldTypeAdapter();
			}
			@Override
			public Adapter caseEntityNameWebServiceMappingType(EntityNameWebServiceMappingType object) {
				return createEntityNameWebServiceMappingTypeAdapter();
			}
			@Override
			public Adapter caseEntityRelationType(EntityRelationType object) {
				return createEntityRelationTypeAdapter();
			}
			@Override
			public Adapter caseExternalReferenceType(ExternalReferenceType object) {
				return createExternalReferenceTypeAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseIntType(IntType object) {
				return createIntTypeAdapter();
			}
			@Override
			public Adapter caseJavaObjRefType(JavaObjRefType object) {
				return createJavaObjRefTypeAdapter();
			}
			@Override
			public Adapter caseLongType(LongType object) {
				return createLongTypeAdapter();
			}
			@Override
			public Adapter caseMemberType(MemberType object) {
				return createMemberTypeAdapter();
			}
			@Override
			public Adapter caseMemberWebServiceMappingType(MemberWebServiceMappingType object) {
				return createMemberWebServiceMappingTypeAdapter();
			}
			@Override
			public Adapter caseObjectRefType(ObjectRefType object) {
				return createObjectRefTypeAdapter();
			}
			@Override
			public Adapter casePersistentConfigType(PersistentConfigType object) {
				return createPersistentConfigTypeAdapter();
			}
			@Override
			public Adapter caseReferenceObjectType(ReferenceObjectType object) {
				return createReferenceObjectTypeAdapter();
			}
			@Override
			public Adapter caseRelationConstraintType(RelationConstraintType object) {
				return createRelationConstraintTypeAdapter();
			}
			@Override
			public Adapter caseRelationKeyType(RelationKeyType object) {
				return createRelationKeyTypeAdapter();
			}
			@Override
			public Adapter caseSearchMethodType(SearchMethodType object) {
				return createSearchMethodTypeAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseValidatorConfigType(ValidatorConfigType object) {
				return createValidatorConfigTypeAdapter();
			}
			@Override
			public Adapter caseEntityType(EntityType object) {
				return createEntityTypeAdapter();
			}
			@Override
			public Adapter caseMetaDataType(MetaDataType object) {
				return createMetaDataTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BECollectionType <em>BE Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BECollectionType
	 * @generated
	 */
	public Adapter createBECollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BEComplexType <em>BE Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEComplexType
	 * @generated
	 */
	public Adapter createBEComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BEDiagramType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramType
	 * @generated
	 */
	public Adapter createBEDiagramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BEListType <em>BE List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEListType
	 * @generated
	 */
	public Adapter createBEListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BEMapType <em>BE Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEMapType
	 * @generated
	 */
	public Adapter createBEMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BEObjRefType <em>BE Obj Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEObjRefType
	 * @generated
	 */
	public Adapter createBEObjRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BEPrimitiveType <em>BE Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEPrimitiveType
	 * @generated
	 */
	public Adapter createBEPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BESetType <em>BE Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BESetType
	 * @generated
	 */
	public Adapter createBESetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BEType <em>BE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEType
	 * @generated
	 */
	public Adapter createBETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BinaryType
	 * @generated
	 */
	public Adapter createBinaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.DoubleType <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DoubleType
	 * @generated
	 */
	public Adapter createDoubleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.DummyFieldType <em>Dummy Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DummyFieldType
	 * @generated
	 */
	public Adapter createDummyFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType <em>Entity Name Web Service Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityNameWebServiceMappingType
	 * @generated
	 */
	public Adapter createEntityNameWebServiceMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.EntityRelationType <em>Entity Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.EntityRelationType
	 * @generated
	 */
	public Adapter createEntityRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType <em>External Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ExternalReferenceType
	 * @generated
	 */
	public Adapter createExternalReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.IntType <em>Int Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.IntType
	 * @generated
	 */
	public Adapter createIntTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType <em>Java Obj Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType
	 * @generated
	 */
	public Adapter createJavaObjRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.LongType <em>Long Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.LongType
	 * @generated
	 */
	public Adapter createLongTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.common.MetaDataType <em>Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.common.MetaDataType
	 * @generated
	 */
	public Adapter createMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType <em>Business Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType
	 * @generated
	 */
	public Adapter createBusinessEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.CEObjRefType <em>CE Obj Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.CEObjRefType
	 * @generated
	 */
	public Adapter createCEObjRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType <em>Constant Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType
	 * @generated
	 */
	public Adapter createConstantEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.MemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberType
	 * @generated
	 */
	public Adapter createMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType <em>Member Web Service Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.MemberWebServiceMappingType
	 * @generated
	 */
	public Adapter createMemberWebServiceMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.ObjectRefType <em>Object Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ObjectRefType
	 * @generated
	 */
	public Adapter createObjectRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType <em>Persistent Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType
	 * @generated
	 */
	public Adapter createPersistentConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType <em>Reference Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType
	 * @generated
	 */
	public Adapter createReferenceObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType <em>Relation Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType
	 * @generated
	 */
	public Adapter createRelationConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.RelationKeyType <em>Relation Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.RelationKeyType
	 * @generated
	 */
	public Adapter createRelationKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.SearchMethodType <em>Search Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.SearchMethodType
	 * @generated
	 */
	public Adapter createSearchMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType <em>Validator Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType
	 * @generated
	 */
	public Adapter createValidatorConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.ConstantValueType <em>Constant Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.ConstantValueType
	 * @generated
	 */
	public Adapter createConstantValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.shaolin.uimaster.datamodel.bediagram.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.shaolin.uimaster.datamodel.bediagram.DateTimeType
	 * @generated
	 */
	public Adapter createDateTimeTypeAdapter() {
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

} //BEDiagramAdapterFactory
