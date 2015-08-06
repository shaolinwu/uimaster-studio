/**
 */
package org.shaolin.uimaster.datamodel.bediagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage
 * @generated
 */
public class BEDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BEDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = BEDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BEDiagramPackage.BE_COLLECTION_TYPE: {
				BECollectionType beCollectionType = (BECollectionType)theEObject;
				T result = caseBECollectionType(beCollectionType);
				if (result == null) result = caseBEComplexType(beCollectionType);
				if (result == null) result = caseBEType(beCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BE_COMPLEX_TYPE: {
				BEComplexType beComplexType = (BEComplexType)theEObject;
				T result = caseBEComplexType(beComplexType);
				if (result == null) result = caseBEType(beComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BE_DIAGRAM_TYPE: {
				BEDiagramType beDiagramType = (BEDiagramType)theEObject;
				T result = caseBEDiagramType(beDiagramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BE_LIST_TYPE: {
				BEListType beListType = (BEListType)theEObject;
				T result = caseBEListType(beListType);
				if (result == null) result = caseBECollectionType(beListType);
				if (result == null) result = caseBEComplexType(beListType);
				if (result == null) result = caseBEType(beListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BE_MAP_TYPE: {
				BEMapType beMapType = (BEMapType)theEObject;
				T result = caseBEMapType(beMapType);
				if (result == null) result = caseBECollectionType(beMapType);
				if (result == null) result = caseBEComplexType(beMapType);
				if (result == null) result = caseBEType(beMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BE_OBJ_REF_TYPE: {
				BEObjRefType beObjRefType = (BEObjRefType)theEObject;
				T result = caseBEObjRefType(beObjRefType);
				if (result == null) result = caseObjectRefType(beObjRefType);
				if (result == null) result = caseBEComplexType(beObjRefType);
				if (result == null) result = caseBEType(beObjRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BE_PRIMITIVE_TYPE: {
				BEPrimitiveType bePrimitiveType = (BEPrimitiveType)theEObject;
				T result = caseBEPrimitiveType(bePrimitiveType);
				if (result == null) result = caseBEType(bePrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BE_SET_TYPE: {
				BESetType beSetType = (BESetType)theEObject;
				T result = caseBESetType(beSetType);
				if (result == null) result = caseBECollectionType(beSetType);
				if (result == null) result = caseBEComplexType(beSetType);
				if (result == null) result = caseBEType(beSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BE_TYPE: {
				BEType beType = (BEType)theEObject;
				T result = caseBEType(beType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BINARY_TYPE: {
				BinaryType binaryType = (BinaryType)theEObject;
				T result = caseBinaryType(binaryType);
				if (result == null) result = caseBEPrimitiveType(binaryType);
				if (result == null) result = caseBEType(binaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = caseBEPrimitiveType(booleanType);
				if (result == null) result = caseBEType(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.BUSINESS_ENTITY_TYPE: {
				BusinessEntityType businessEntityType = (BusinessEntityType)theEObject;
				T result = caseBusinessEntityType(businessEntityType);
				if (result == null) result = caseEntityType(businessEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.CE_OBJ_REF_TYPE: {
				CEObjRefType ceObjRefType = (CEObjRefType)theEObject;
				T result = caseCEObjRefType(ceObjRefType);
				if (result == null) result = caseBEComplexType(ceObjRefType);
				if (result == null) result = caseBEType(ceObjRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.CONSTANT_ENTITY_TYPE: {
				ConstantEntityType constantEntityType = (ConstantEntityType)theEObject;
				T result = caseConstantEntityType(constantEntityType);
				if (result == null) result = caseEntityType(constantEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.CONSTANT_VALUE_TYPE: {
				ConstantValueType constantValueType = (ConstantValueType)theEObject;
				T result = caseConstantValueType(constantValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.DATE_TIME_TYPE: {
				DateTimeType dateTimeType = (DateTimeType)theEObject;
				T result = caseDateTimeType(dateTimeType);
				if (result == null) result = caseBEPrimitiveType(dateTimeType);
				if (result == null) result = caseBEType(dateTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.DOUBLE_TYPE: {
				DoubleType doubleType = (DoubleType)theEObject;
				T result = caseDoubleType(doubleType);
				if (result == null) result = caseBEPrimitiveType(doubleType);
				if (result == null) result = caseBEType(doubleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.DUMMY_FIELD_TYPE: {
				DummyFieldType dummyFieldType = (DummyFieldType)theEObject;
				T result = caseDummyFieldType(dummyFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE: {
				EntityNameWebServiceMappingType entityNameWebServiceMappingType = (EntityNameWebServiceMappingType)theEObject;
				T result = caseEntityNameWebServiceMappingType(entityNameWebServiceMappingType);
				if (result == null) result = caseMetaDataType(entityNameWebServiceMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.ENTITY_RELATION_TYPE: {
				EntityRelationType entityRelationType = (EntityRelationType)theEObject;
				T result = caseEntityRelationType(entityRelationType);
				if (result == null) result = caseMetaDataType(entityRelationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.EXTERNAL_REFERENCE_TYPE: {
				ExternalReferenceType externalReferenceType = (ExternalReferenceType)theEObject;
				T result = caseExternalReferenceType(externalReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.FILE_TYPE: {
				FileType fileType = (FileType)theEObject;
				T result = caseFileType(fileType);
				if (result == null) result = caseBEPrimitiveType(fileType);
				if (result == null) result = caseBEType(fileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.INT_TYPE: {
				IntType intType = (IntType)theEObject;
				T result = caseIntType(intType);
				if (result == null) result = caseBEPrimitiveType(intType);
				if (result == null) result = caseBEType(intType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.JAVA_OBJ_REF_TYPE: {
				JavaObjRefType javaObjRefType = (JavaObjRefType)theEObject;
				T result = caseJavaObjRefType(javaObjRefType);
				if (result == null) result = caseObjectRefType(javaObjRefType);
				if (result == null) result = caseBEComplexType(javaObjRefType);
				if (result == null) result = caseBEType(javaObjRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.LONG_TYPE: {
				LongType longType = (LongType)theEObject;
				T result = caseLongType(longType);
				if (result == null) result = caseBEPrimitiveType(longType);
				if (result == null) result = caseBEType(longType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.MEMBER_TYPE: {
				MemberType memberType = (MemberType)theEObject;
				T result = caseMemberType(memberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.MEMBER_WEB_SERVICE_MAPPING_TYPE: {
				MemberWebServiceMappingType memberWebServiceMappingType = (MemberWebServiceMappingType)theEObject;
				T result = caseMemberWebServiceMappingType(memberWebServiceMappingType);
				if (result == null) result = caseMetaDataType(memberWebServiceMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.OBJECT_REF_TYPE: {
				ObjectRefType objectRefType = (ObjectRefType)theEObject;
				T result = caseObjectRefType(objectRefType);
				if (result == null) result = caseBEComplexType(objectRefType);
				if (result == null) result = caseBEType(objectRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.PERSISTENT_CONFIG_TYPE: {
				PersistentConfigType persistentConfigType = (PersistentConfigType)theEObject;
				T result = casePersistentConfigType(persistentConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.REFERENCE_OBJECT_TYPE: {
				ReferenceObjectType referenceObjectType = (ReferenceObjectType)theEObject;
				T result = caseReferenceObjectType(referenceObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.RELATION_CONSTRAINT_TYPE: {
				RelationConstraintType relationConstraintType = (RelationConstraintType)theEObject;
				T result = caseRelationConstraintType(relationConstraintType);
				if (result == null) result = caseMetaDataType(relationConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.RELATION_KEY_TYPE: {
				RelationKeyType relationKeyType = (RelationKeyType)theEObject;
				T result = caseRelationKeyType(relationKeyType);
				if (result == null) result = caseMetaDataType(relationKeyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.SEARCH_METHOD_TYPE: {
				SearchMethodType searchMethodType = (SearchMethodType)theEObject;
				T result = caseSearchMethodType(searchMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = caseBEPrimitiveType(stringType);
				if (result == null) result = caseBEType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				T result = caseTimeType(timeType);
				if (result == null) result = caseBEPrimitiveType(timeType);
				if (result == null) result = caseBEType(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BEDiagramPackage.VALIDATOR_CONFIG_TYPE: {
				ValidatorConfigType validatorConfigType = (ValidatorConfigType)theEObject;
				T result = caseValidatorConfigType(validatorConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BE Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BE Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBECollectionType(BECollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BE Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BE Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBEComplexType(BEComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBEDiagramType(BEDiagramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BE List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BE List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBEListType(BEListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BE Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BE Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBEMapType(BEMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BE Obj Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BE Obj Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBEObjRefType(BEObjRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BE Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BE Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBEPrimitiveType(BEPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BE Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BE Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBESetType(BESetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBEType(BEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryType(BinaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleType(DoubleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dummy Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dummy Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDummyFieldType(DummyFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Name Web Service Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Name Web Service Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityNameWebServiceMappingType(EntityNameWebServiceMappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Relation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRelationType(EntityRelationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReferenceType(ExternalReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileType(FileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntType(IntType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Obj Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Obj Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaObjRefType(JavaObjRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongType(LongType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityType(EntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaDataType(MetaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessEntityType(BusinessEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CE Obj Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CE Obj Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEObjRefType(CEObjRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantEntityType(ConstantEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberType(MemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Web Service Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Web Service Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberWebServiceMappingType(MemberWebServiceMappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectRefType(ObjectRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistent Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistent Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistentConfigType(PersistentConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceObjectType(ReferenceObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationConstraintType(RelationConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationKeyType(RelationKeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchMethodType(SearchMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeType(TimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validator Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validator Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidatorConfigType(ValidatorConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantValueType(ConstantValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeType(DateTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BEDiagramSwitch
