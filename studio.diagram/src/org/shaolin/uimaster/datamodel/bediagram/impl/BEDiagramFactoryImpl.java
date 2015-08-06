/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.shaolin.uimaster.datamodel.bediagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BEDiagramFactoryImpl extends EFactoryImpl implements BEDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BEDiagramFactory init() {
		try {
			BEDiagramFactory theBEDiagramFactory = (BEDiagramFactory)EPackage.Registry.INSTANCE.getEFactory("http://bmdp.shaolin.org/datamodel/BEDiagram"); 
			if (theBEDiagramFactory != null) {
				return theBEDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BEDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BEDiagramPackage.BE_COMPLEX_TYPE: return createBEComplexType();
			case BEDiagramPackage.BE_DIAGRAM_TYPE: return createBEDiagramType();
			case BEDiagramPackage.BE_LIST_TYPE: return createBEListType();
			case BEDiagramPackage.BE_MAP_TYPE: return createBEMapType();
			case BEDiagramPackage.BE_OBJ_REF_TYPE: return createBEObjRefType();
			case BEDiagramPackage.BE_PRIMITIVE_TYPE: return createBEPrimitiveType();
			case BEDiagramPackage.BE_SET_TYPE: return createBESetType();
			case BEDiagramPackage.BE_TYPE: return createBEType();
			case BEDiagramPackage.BINARY_TYPE: return createBinaryType();
			case BEDiagramPackage.BOOLEAN_TYPE: return createBooleanType();
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE: return createBusinessEntityType();
			case BEDiagramPackage.CE_OBJ_REF_TYPE: return createCEObjRefType();
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE: return createConstantEntityType();
			case BEDiagramPackage.CONSTANT_VALUE_TYPE: return createConstantValueType();
			case BEDiagramPackage.DATE_TIME_TYPE: return createDateTimeType();
			case BEDiagramPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case BEDiagramPackage.DOUBLE_TYPE: return createDoubleType();
			case BEDiagramPackage.DUMMY_FIELD_TYPE: return createDummyFieldType();
			case BEDiagramPackage.ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE: return createEntityNameWebServiceMappingType();
			case BEDiagramPackage.ENTITY_RELATION_TYPE: return createEntityRelationType();
			case BEDiagramPackage.EXTERNAL_REFERENCE_TYPE: return createExternalReferenceType();
			case BEDiagramPackage.FILE_TYPE: return createFileType();
			case BEDiagramPackage.INT_TYPE: return createIntType();
			case BEDiagramPackage.JAVA_OBJ_REF_TYPE: return createJavaObjRefType();
			case BEDiagramPackage.LONG_TYPE: return createLongType();
			case BEDiagramPackage.MEMBER_TYPE: return createMemberType();
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE: return createMemberWebServiceMappingType();
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE: return createPersistentConfigType();
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE: return createReferenceObjectType();
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE: return createRelationConstraintType();
			case BEDiagramPackage.RELATION_KEY_TYPE: return createRelationKeyType();
			case BEDiagramPackage.SEARCH_METHOD_TYPE: return createSearchMethodType();
			case BEDiagramPackage.STRING_TYPE: return createStringType();
			case BEDiagramPackage.TIME_TYPE: return createTimeType();
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE: return createValidatorConfigType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BEDiagramPackage.PERSISTENCE_TYPE_TYPE:
				return createPersistenceTypeTypeFromString(eDataType, initialValue);
			case BEDiagramPackage.RELATION_TYPE_TYPE:
				return createRelationTypeTypeFromString(eDataType, initialValue);
			case BEDiagramPackage.STYLE_TYPE:
				return createStyleTypeFromString(eDataType, initialValue);
			case BEDiagramPackage.PERSISTENCE_TYPE_TYPE_OBJECT:
				return createPersistenceTypeTypeObjectFromString(eDataType, initialValue);
			case BEDiagramPackage.RELATION_TYPE_TYPE_OBJECT:
				return createRelationTypeTypeObjectFromString(eDataType, initialValue);
			case BEDiagramPackage.STYLE_TYPE_OBJECT:
				return createStyleTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BEDiagramPackage.PERSISTENCE_TYPE_TYPE:
				return convertPersistenceTypeTypeToString(eDataType, instanceValue);
			case BEDiagramPackage.RELATION_TYPE_TYPE:
				return convertRelationTypeTypeToString(eDataType, instanceValue);
			case BEDiagramPackage.STYLE_TYPE:
				return convertStyleTypeToString(eDataType, instanceValue);
			case BEDiagramPackage.PERSISTENCE_TYPE_TYPE_OBJECT:
				return convertPersistenceTypeTypeObjectToString(eDataType, instanceValue);
			case BEDiagramPackage.RELATION_TYPE_TYPE_OBJECT:
				return convertRelationTypeTypeObjectToString(eDataType, instanceValue);
			case BEDiagramPackage.STYLE_TYPE_OBJECT:
				return convertStyleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEComplexType createBEComplexType() {
		BEComplexTypeImpl beComplexType = new BEComplexTypeImpl();
		return beComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEDiagramType createBEDiagramType() {
		BEDiagramTypeImpl beDiagramType = new BEDiagramTypeImpl();
		return beDiagramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEListType createBEListType() {
		BEListTypeImpl beListType = new BEListTypeImpl();
		return beListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEMapType createBEMapType() {
		BEMapTypeImpl beMapType = new BEMapTypeImpl();
		return beMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEObjRefType createBEObjRefType() {
		BEObjRefTypeImpl beObjRefType = new BEObjRefTypeImpl();
		return beObjRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEPrimitiveType createBEPrimitiveType() {
		BEPrimitiveTypeImpl bePrimitiveType = new BEPrimitiveTypeImpl();
		return bePrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BESetType createBESetType() {
		BESetTypeImpl beSetType = new BESetTypeImpl();
		return beSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEType createBEType() {
		BETypeImpl beType = new BETypeImpl();
		return beType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType createBinaryType() {
		BinaryTypeImpl binaryType = new BinaryTypeImpl();
		return binaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntityType createBusinessEntityType() {
		BusinessEntityTypeImpl businessEntityType = new BusinessEntityTypeImpl();
		return businessEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEObjRefType createCEObjRefType() {
		CEObjRefTypeImpl ceObjRefType = new CEObjRefTypeImpl();
		return ceObjRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantEntityType createConstantEntityType() {
		ConstantEntityTypeImpl constantEntityType = new ConstantEntityTypeImpl();
		return constantEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantValueType createConstantValueType() {
		ConstantValueTypeImpl constantValueType = new ConstantValueTypeImpl();
		return constantValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType createDateTimeType() {
		DateTimeTypeImpl dateTimeType = new DateTimeTypeImpl();
		return dateTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleType createDoubleType() {
		DoubleTypeImpl doubleType = new DoubleTypeImpl();
		return doubleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyFieldType createDummyFieldType() {
		DummyFieldTypeImpl dummyFieldType = new DummyFieldTypeImpl();
		return dummyFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNameWebServiceMappingType createEntityNameWebServiceMappingType() {
		EntityNameWebServiceMappingTypeImpl entityNameWebServiceMappingType = new EntityNameWebServiceMappingTypeImpl();
		return entityNameWebServiceMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRelationType createEntityRelationType() {
		EntityRelationTypeImpl entityRelationType = new EntityRelationTypeImpl();
		return entityRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceType createExternalReferenceType() {
		ExternalReferenceTypeImpl externalReferenceType = new ExternalReferenceTypeImpl();
		return externalReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileType() {
		FileTypeImpl fileType = new FileTypeImpl();
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntType createIntType() {
		IntTypeImpl intType = new IntTypeImpl();
		return intType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaObjRefType createJavaObjRefType() {
		JavaObjRefTypeImpl javaObjRefType = new JavaObjRefTypeImpl();
		return javaObjRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongType createLongType() {
		LongTypeImpl longType = new LongTypeImpl();
		return longType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberType createMemberType() {
		MemberTypeImpl memberType = new MemberTypeImpl();
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberWebServiceMappingType createMemberWebServiceMappingType() {
		MemberWebServiceMappingTypeImpl memberWebServiceMappingType = new MemberWebServiceMappingTypeImpl();
		return memberWebServiceMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentConfigType createPersistentConfigType() {
		PersistentConfigTypeImpl persistentConfigType = new PersistentConfigTypeImpl();
		return persistentConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceObjectType createReferenceObjectType() {
		ReferenceObjectTypeImpl referenceObjectType = new ReferenceObjectTypeImpl();
		return referenceObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationConstraintType createRelationConstraintType() {
		RelationConstraintTypeImpl relationConstraintType = new RelationConstraintTypeImpl();
		return relationConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationKeyType createRelationKeyType() {
		RelationKeyTypeImpl relationKeyType = new RelationKeyTypeImpl();
		return relationKeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchMethodType createSearchMethodType() {
		SearchMethodTypeImpl searchMethodType = new SearchMethodTypeImpl();
		return searchMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidatorConfigType createValidatorConfigType() {
		ValidatorConfigTypeImpl validatorConfigType = new ValidatorConfigTypeImpl();
		return validatorConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeType createPersistenceTypeTypeFromString(EDataType eDataType, String initialValue) {
		PersistenceTypeType result = PersistenceTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTypeType createRelationTypeTypeFromString(EDataType eDataType, String initialValue) {
		RelationTypeType result = RelationTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleTypeFromString(EDataType eDataType, String initialValue) {
		StyleType result = StyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeType createPersistenceTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPersistenceTypeTypeFromString(BEDiagramPackage.Literals.PERSISTENCE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceTypeTypeToString(BEDiagramPackage.Literals.PERSISTENCE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTypeType createRelationTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRelationTypeTypeFromString(BEDiagramPackage.Literals.RELATION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationTypeTypeToString(BEDiagramPackage.Literals.RELATION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStyleTypeFromString(BEDiagramPackage.Literals.STYLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStyleTypeToString(BEDiagramPackage.Literals.STYLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEDiagramPackage getBEDiagramPackage() {
		return (BEDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BEDiagramPackage getPackage() {
		return BEDiagramPackage.eINSTANCE;
	}

} //BEDiagramFactoryImpl
