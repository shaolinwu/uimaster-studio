/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.shaolin.uimaster.datamodel.rdbdiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDBDiagramFactoryImpl extends EFactoryImpl implements RDBDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RDBDiagramFactory init() {
		try {
			RDBDiagramFactory theRDBDiagramFactory = (RDBDiagramFactory)EPackage.Registry.INSTANCE.getEFactory("http://bmdp.shaolin.org/datamodel/RDBDiagram"); 
			if (theRDBDiagramFactory != null) {
				return theRDBDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RDBDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBDiagramFactoryImpl() {
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
			case RDBDiagramPackage.CLASS_MAPPING_TYPE: return createClassMappingType();
			case RDBDiagramPackage.COLUMN_TYPE: return createColumnType();
			case RDBDiagramPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RDBDiagramPackage.FIELD_MAPPING_TYPE: return createFieldMappingType();
			case RDBDiagramPackage.FK_TYPE: return createFKType();
			case RDBDiagramPackage.INDEX_TYPE: return createIndexType();
			case RDBDiagramPackage.INHERIT_ASSOCIATION_TYPE: return createInheritAssociationType();
			case RDBDiagramPackage.JOIN_TABLE_TYPE: return createJoinTableType();
			case RDBDiagramPackage.LIST_FIELD_MAPPING_TYPE: return createListFieldMappingType();
			case RDBDiagramPackage.PK_TYPE: return createPKType();
			case RDBDiagramPackage.RDB_DIAGRAM_TYPE: return createRDBDiagramType();
			case RDBDiagramPackage.RDB_TYPE: return createRDBType();
			case RDBDiagramPackage.SEQUENCE_TYPE: return createSequenceType();
			case RDBDiagramPackage.TABLE_TYPE: return createTableType();
			case RDBDiagramPackage.VIEW_TYPE: return createViewType();
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
			case RDBDiagramPackage.MAPPING_TYPE_TYPE:
				return createMappingTypeTypeFromString(eDataType, initialValue);
			case RDBDiagramPackage.ON_DELETE_TYPE:
				return createOnDeleteTypeFromString(eDataType, initialValue);
			case RDBDiagramPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case RDBDiagramPackage.VIEW_OP_TYPE:
				return createViewOpTypeFromString(eDataType, initialValue);
			case RDBDiagramPackage.MAPPING_TYPE_TYPE_OBJECT:
				return createMappingTypeTypeObjectFromString(eDataType, initialValue);
			case RDBDiagramPackage.ON_DELETE_TYPE_OBJECT:
				return createOnDeleteTypeObjectFromString(eDataType, initialValue);
			case RDBDiagramPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case RDBDiagramPackage.VIEW_OP_TYPE_OBJECT:
				return createViewOpTypeObjectFromString(eDataType, initialValue);
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
			case RDBDiagramPackage.MAPPING_TYPE_TYPE:
				return convertMappingTypeTypeToString(eDataType, instanceValue);
			case RDBDiagramPackage.ON_DELETE_TYPE:
				return convertOnDeleteTypeToString(eDataType, instanceValue);
			case RDBDiagramPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case RDBDiagramPackage.VIEW_OP_TYPE:
				return convertViewOpTypeToString(eDataType, instanceValue);
			case RDBDiagramPackage.MAPPING_TYPE_TYPE_OBJECT:
				return convertMappingTypeTypeObjectToString(eDataType, instanceValue);
			case RDBDiagramPackage.ON_DELETE_TYPE_OBJECT:
				return convertOnDeleteTypeObjectToString(eDataType, instanceValue);
			case RDBDiagramPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case RDBDiagramPackage.VIEW_OP_TYPE_OBJECT:
				return convertViewOpTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMappingType createClassMappingType() {
		ClassMappingTypeImpl classMappingType = new ClassMappingTypeImpl();
		return classMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType createColumnType() {
		ColumnTypeImpl columnType = new ColumnTypeImpl();
		return columnType;
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
	public FieldMappingType createFieldMappingType() {
		FieldMappingTypeImpl fieldMappingType = new FieldMappingTypeImpl();
		return fieldMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FKType createFKType() {
		FKTypeImpl fkType = new FKTypeImpl();
		return fkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexType createIndexType() {
		IndexTypeImpl indexType = new IndexTypeImpl();
		return indexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritAssociationType createInheritAssociationType() {
		InheritAssociationTypeImpl inheritAssociationType = new InheritAssociationTypeImpl();
		return inheritAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTableType createJoinTableType() {
		JoinTableTypeImpl joinTableType = new JoinTableTypeImpl();
		return joinTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFieldMappingType createListFieldMappingType() {
		ListFieldMappingTypeImpl listFieldMappingType = new ListFieldMappingTypeImpl();
		return listFieldMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PKType createPKType() {
		PKTypeImpl pkType = new PKTypeImpl();
		return pkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBDiagramType createRDBDiagramType() {
		RDBDiagramTypeImpl rdbDiagramType = new RDBDiagramTypeImpl();
		return rdbDiagramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBType createRDBType() {
		RDBTypeImpl rdbType = new RDBTypeImpl();
		return rdbType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType createViewType() {
		ViewTypeImpl viewType = new ViewTypeImpl();
		return viewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTypeType createMappingTypeTypeFromString(EDataType eDataType, String initialValue) {
		MappingTypeType result = MappingTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDeleteType createOnDeleteTypeFromString(EDataType eDataType, String initialValue) {
		OnDeleteType result = OnDeleteType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnDeleteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewOpType createViewOpTypeFromString(EDataType eDataType, String initialValue) {
		ViewOpType result = ViewOpType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewOpTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTypeType createMappingTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMappingTypeTypeFromString(RDBDiagramPackage.Literals.MAPPING_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMappingTypeTypeToString(RDBDiagramPackage.Literals.MAPPING_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDeleteType createOnDeleteTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOnDeleteTypeFromString(RDBDiagramPackage.Literals.ON_DELETE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnDeleteTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOnDeleteTypeToString(RDBDiagramPackage.Literals.ON_DELETE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(RDBDiagramPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(RDBDiagramPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewOpType createViewOpTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createViewOpTypeFromString(RDBDiagramPackage.Literals.VIEW_OP_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewOpTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertViewOpTypeToString(RDBDiagramPackage.Literals.VIEW_OP_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBDiagramPackage getRDBDiagramPackage() {
		return (RDBDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RDBDiagramPackage getPackage() {
		return RDBDiagramPackage.eINSTANCE;
	}

} //RDBDiagramFactoryImpl
