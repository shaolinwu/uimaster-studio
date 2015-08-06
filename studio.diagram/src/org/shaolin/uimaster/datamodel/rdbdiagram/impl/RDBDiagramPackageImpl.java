/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.shaolin.uimaster.datamodel.common.CommonPackage;

import org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot;
import org.shaolin.uimaster.datamodel.rdbdiagram.FKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.FieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.IndexType;
import org.shaolin.uimaster.datamodel.rdbdiagram.InheritAssociationType;
import org.shaolin.uimaster.datamodel.rdbdiagram.JoinTableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ListFieldMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.MappingTypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.OnDeleteType;
import org.shaolin.uimaster.datamodel.rdbdiagram.PKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBType;
import org.shaolin.uimaster.datamodel.rdbdiagram.SequenceType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ViewOpType;
import org.shaolin.uimaster.datamodel.rdbdiagram.ViewType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDBDiagramPackageImpl extends EPackageImpl implements RDBDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinTableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listFieldMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbDiagramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mappingTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum onDeleteTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum viewOpTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mappingTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType onDeleteTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType viewOpTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RDBDiagramPackageImpl() {
		super(eNS_URI, RDBDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RDBDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RDBDiagramPackage init() {
		if (isInited) return (RDBDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(RDBDiagramPackage.eNS_URI);

		// Obtain or create and register package
		RDBDiagramPackageImpl theRDBDiagramPackage = (RDBDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RDBDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RDBDiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRDBDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theRDBDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRDBDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RDBDiagramPackage.eNS_URI, theRDBDiagramPackage);
		return theRDBDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMappingType() {
		return classMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMappingType_BusinessEntity() {
		return (EReference)classMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMappingType_Table() {
		return (EReference)classMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMappingType_HistoryTable() {
		return (EReference)classMappingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMappingType_View() {
		return (EReference)classMappingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMappingType_ParentClassMapping() {
		return (EReference)classMappingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMappingType_FieldMapping() {
		return (EReference)classMappingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnType() {
		return columnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_Comment() {
		return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_Default() {
		return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_IsNull() {
		return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_Length() {
		return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_Name() {
		return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_Precision() {
		return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_Redundant() {
		return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_Type() {
		return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassMapping() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RDBDiagram() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldMappingType() {
		return fieldMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMappingType_BeFieldName() {
		return (EAttribute)fieldMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMappingType_ColumnName() {
		return (EAttribute)fieldMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMappingType_IsTimestamp() {
		return (EAttribute)fieldMappingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMappingType_Redundant() {
		return (EAttribute)fieldMappingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMappingType_UseClobBuffer() {
		return (EAttribute)fieldMappingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldMappingType_AssociationName() {
		return (EAttribute)fieldMappingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFKType() {
		return fkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFKType_ColumnName() {
		return (EAttribute)fkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFKType_RefTable() {
		return (EReference)fkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFKType_Name() {
		return (EAttribute)fkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFKType_OnDelete() {
		return (EAttribute)fkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexType() {
		return indexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexType_Column() {
		return (EAttribute)indexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexType_IsClustered() {
		return (EAttribute)indexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexType_IsUnique() {
		return (EAttribute)indexTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexType_Name() {
		return (EAttribute)indexTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritAssociationType() {
		return inheritAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritAssociationType_Name() {
		return (EAttribute)inheritAssociationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritAssociationType_ParentTable() {
		return (EAttribute)inheritAssociationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinTableType() {
		return joinTableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTableType_Name() {
		return (EAttribute)joinTableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTableType_SrcPKColumn() {
		return (EAttribute)joinTableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTableType_SrcTable() {
		return (EAttribute)joinTableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTableType_TarTable() {
		return (EAttribute)joinTableTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTableType_TarPKColumn() {
		return (EAttribute)joinTableTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListFieldMappingType() {
		return listFieldMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListFieldMappingType_CollectionTable() {
		return (EReference)listFieldMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListFieldMappingType_IsPrivateOwned() {
		return (EAttribute)listFieldMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListFieldMappingType_MappingType() {
		return (EAttribute)listFieldMappingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPKType() {
		return pkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPKType_ColumnName() {
		return (EAttribute)pkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPKType_SequenceName() {
		return (EAttribute)pkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPKType_Name() {
		return (EAttribute)pkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBDiagramType() {
		return rdbDiagramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBDiagramType_Table() {
		return (EReference)rdbDiagramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBDiagramType_View() {
		return (EReference)rdbDiagramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBDiagramType_JoinTable() {
		return (EReference)rdbDiagramTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBDiagramType_DaoPackage() {
		return (EAttribute)rdbDiagramTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBDiagramType_DiagramPackage() {
		return (EAttribute)rdbDiagramTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBType() {
		return rdbTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBType_Comment() {
		return (EAttribute)rdbTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBType_Name() {
		return (EAttribute)rdbTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_Dbcache() {
		return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_Name() {
		return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_Span() {
		return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_StartWith() {
		return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Column() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Index() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Sequence() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_PrimaryKey() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_ForeignKey() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_InheritAsscociation() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Mapping() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewType() {
		return viewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewType_BaseTable() {
		return (EReference)viewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewType_ExtTable() {
		return (EReference)viewTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_Op() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMappingTypeType() {
		return mappingTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOnDeleteType() {
		return onDeleteTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getViewOpType() {
		return viewOpTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMappingTypeTypeObject() {
		return mappingTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOnDeleteTypeObject() {
		return onDeleteTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getViewOpTypeObject() {
		return viewOpTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBDiagramFactory getRDBDiagramFactory() {
		return (RDBDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		classMappingTypeEClass = createEClass(CLASS_MAPPING_TYPE);
		createEReference(classMappingTypeEClass, CLASS_MAPPING_TYPE__BUSINESS_ENTITY);
		createEReference(classMappingTypeEClass, CLASS_MAPPING_TYPE__TABLE);
		createEReference(classMappingTypeEClass, CLASS_MAPPING_TYPE__HISTORY_TABLE);
		createEReference(classMappingTypeEClass, CLASS_MAPPING_TYPE__VIEW);
		createEReference(classMappingTypeEClass, CLASS_MAPPING_TYPE__PARENT_CLASS_MAPPING);
		createEReference(classMappingTypeEClass, CLASS_MAPPING_TYPE__FIELD_MAPPING);

		columnTypeEClass = createEClass(COLUMN_TYPE);
		createEAttribute(columnTypeEClass, COLUMN_TYPE__COMMENT);
		createEAttribute(columnTypeEClass, COLUMN_TYPE__DEFAULT);
		createEAttribute(columnTypeEClass, COLUMN_TYPE__IS_NULL);
		createEAttribute(columnTypeEClass, COLUMN_TYPE__LENGTH);
		createEAttribute(columnTypeEClass, COLUMN_TYPE__NAME);
		createEAttribute(columnTypeEClass, COLUMN_TYPE__PRECISION);
		createEAttribute(columnTypeEClass, COLUMN_TYPE__REDUNDANT);
		createEAttribute(columnTypeEClass, COLUMN_TYPE__TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASS_MAPPING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RDB_DIAGRAM);

		fieldMappingTypeEClass = createEClass(FIELD_MAPPING_TYPE);
		createEAttribute(fieldMappingTypeEClass, FIELD_MAPPING_TYPE__BE_FIELD_NAME);
		createEAttribute(fieldMappingTypeEClass, FIELD_MAPPING_TYPE__COLUMN_NAME);
		createEAttribute(fieldMappingTypeEClass, FIELD_MAPPING_TYPE__IS_TIMESTAMP);
		createEAttribute(fieldMappingTypeEClass, FIELD_MAPPING_TYPE__REDUNDANT);
		createEAttribute(fieldMappingTypeEClass, FIELD_MAPPING_TYPE__USE_CLOB_BUFFER);
		createEAttribute(fieldMappingTypeEClass, FIELD_MAPPING_TYPE__ASSOCIATION_NAME);

		fkTypeEClass = createEClass(FK_TYPE);
		createEAttribute(fkTypeEClass, FK_TYPE__COLUMN_NAME);
		createEReference(fkTypeEClass, FK_TYPE__REF_TABLE);
		createEAttribute(fkTypeEClass, FK_TYPE__NAME);
		createEAttribute(fkTypeEClass, FK_TYPE__ON_DELETE);

		indexTypeEClass = createEClass(INDEX_TYPE);
		createEAttribute(indexTypeEClass, INDEX_TYPE__COLUMN);
		createEAttribute(indexTypeEClass, INDEX_TYPE__IS_CLUSTERED);
		createEAttribute(indexTypeEClass, INDEX_TYPE__IS_UNIQUE);
		createEAttribute(indexTypeEClass, INDEX_TYPE__NAME);

		inheritAssociationTypeEClass = createEClass(INHERIT_ASSOCIATION_TYPE);
		createEAttribute(inheritAssociationTypeEClass, INHERIT_ASSOCIATION_TYPE__NAME);
		createEAttribute(inheritAssociationTypeEClass, INHERIT_ASSOCIATION_TYPE__PARENT_TABLE);

		joinTableTypeEClass = createEClass(JOIN_TABLE_TYPE);
		createEAttribute(joinTableTypeEClass, JOIN_TABLE_TYPE__NAME);
		createEAttribute(joinTableTypeEClass, JOIN_TABLE_TYPE__SRC_PK_COLUMN);
		createEAttribute(joinTableTypeEClass, JOIN_TABLE_TYPE__SRC_TABLE);
		createEAttribute(joinTableTypeEClass, JOIN_TABLE_TYPE__TAR_TABLE);
		createEAttribute(joinTableTypeEClass, JOIN_TABLE_TYPE__TAR_PK_COLUMN);

		listFieldMappingTypeEClass = createEClass(LIST_FIELD_MAPPING_TYPE);
		createEReference(listFieldMappingTypeEClass, LIST_FIELD_MAPPING_TYPE__COLLECTION_TABLE);
		createEAttribute(listFieldMappingTypeEClass, LIST_FIELD_MAPPING_TYPE__IS_PRIVATE_OWNED);
		createEAttribute(listFieldMappingTypeEClass, LIST_FIELD_MAPPING_TYPE__MAPPING_TYPE);

		pkTypeEClass = createEClass(PK_TYPE);
		createEAttribute(pkTypeEClass, PK_TYPE__COLUMN_NAME);
		createEAttribute(pkTypeEClass, PK_TYPE__SEQUENCE_NAME);
		createEAttribute(pkTypeEClass, PK_TYPE__NAME);

		rdbDiagramTypeEClass = createEClass(RDB_DIAGRAM_TYPE);
		createEReference(rdbDiagramTypeEClass, RDB_DIAGRAM_TYPE__TABLE);
		createEReference(rdbDiagramTypeEClass, RDB_DIAGRAM_TYPE__VIEW);
		createEReference(rdbDiagramTypeEClass, RDB_DIAGRAM_TYPE__JOIN_TABLE);
		createEAttribute(rdbDiagramTypeEClass, RDB_DIAGRAM_TYPE__DAO_PACKAGE);
		createEAttribute(rdbDiagramTypeEClass, RDB_DIAGRAM_TYPE__DIAGRAM_PACKAGE);

		rdbTypeEClass = createEClass(RDB_TYPE);
		createEAttribute(rdbTypeEClass, RDB_TYPE__COMMENT);
		createEAttribute(rdbTypeEClass, RDB_TYPE__NAME);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);
		createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__DBCACHE);
		createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__NAME);
		createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__SPAN);
		createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__START_WITH);

		tableTypeEClass = createEClass(TABLE_TYPE);
		createEReference(tableTypeEClass, TABLE_TYPE__COLUMN);
		createEReference(tableTypeEClass, TABLE_TYPE__INDEX);
		createEReference(tableTypeEClass, TABLE_TYPE__SEQUENCE);
		createEReference(tableTypeEClass, TABLE_TYPE__PRIMARY_KEY);
		createEReference(tableTypeEClass, TABLE_TYPE__FOREIGN_KEY);
		createEReference(tableTypeEClass, TABLE_TYPE__INHERIT_ASSCOCIATION);
		createEReference(tableTypeEClass, TABLE_TYPE__MAPPING);

		viewTypeEClass = createEClass(VIEW_TYPE);
		createEReference(viewTypeEClass, VIEW_TYPE__BASE_TABLE);
		createEReference(viewTypeEClass, VIEW_TYPE__EXT_TABLE);
		createEAttribute(viewTypeEClass, VIEW_TYPE__OP);

		// Create enums
		mappingTypeTypeEEnum = createEEnum(MAPPING_TYPE_TYPE);
		onDeleteTypeEEnum = createEEnum(ON_DELETE_TYPE);
		typeTypeEEnum = createEEnum(TYPE_TYPE);
		viewOpTypeEEnum = createEEnum(VIEW_OP_TYPE);

		// Create data types
		mappingTypeTypeObjectEDataType = createEDataType(MAPPING_TYPE_TYPE_OBJECT);
		onDeleteTypeObjectEDataType = createEDataType(ON_DELETE_TYPE_OBJECT);
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
		viewOpTypeObjectEDataType = createEDataType(VIEW_OP_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classMappingTypeEClass.getESuperTypes().add(theCommonPackage.getEntityType());
		listFieldMappingTypeEClass.getESuperTypes().add(this.getFieldMappingType());
		rdbTypeEClass.getESuperTypes().add(theCommonPackage.getEntityType());
		tableTypeEClass.getESuperTypes().add(this.getRDBType());
		viewTypeEClass.getESuperTypes().add(this.getRDBType());

		// Initialize classes and features; add operations and parameters
		initEClass(classMappingTypeEClass, ClassMappingType.class, "ClassMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassMappingType_BusinessEntity(), theCommonPackage.getTargetEntityType(), null, "businessEntity", null, 1, 1, ClassMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassMappingType_Table(), theCommonPackage.getTargetEntityType(), null, "table", null, 1, 1, ClassMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassMappingType_HistoryTable(), theCommonPackage.getTargetEntityType(), null, "historyTable", null, 0, 1, ClassMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassMappingType_View(), theCommonPackage.getTargetEntityType(), null, "view", null, 0, 1, ClassMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassMappingType_ParentClassMapping(), theCommonPackage.getTargetEntityType(), null, "parentClassMapping", null, 0, 1, ClassMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassMappingType_FieldMapping(), this.getFieldMappingType(), null, "fieldMapping", null, 1, -1, ClassMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnTypeEClass, ColumnType.class, "ColumnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnType_Default(), theXMLTypePackage.getString(), "default", null, 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnType_IsNull(), theXMLTypePackage.getBoolean(), "isNull", "true", 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnType_Length(), theXMLTypePackage.getString(), "length", null, 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnType_Precision(), theXMLTypePackage.getInt(), "precision", null, 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnType_Redundant(), theXMLTypePackage.getBoolean(), "redundant", "false", 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnType_Type(), this.getTypeType(), "type", null, 1, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassMapping(), this.getClassMappingType(), null, "classMapping", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RDBDiagram(), this.getRDBDiagramType(), null, "rDBDiagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fieldMappingTypeEClass, FieldMappingType.class, "FieldMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldMappingType_BeFieldName(), theXMLTypePackage.getString(), "beFieldName", null, 1, 1, FieldMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldMappingType_ColumnName(), theXMLTypePackage.getString(), "columnName", null, 1, 1, FieldMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldMappingType_IsTimestamp(), theXMLTypePackage.getBoolean(), "isTimestamp", "false", 0, 1, FieldMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldMappingType_Redundant(), theXMLTypePackage.getBoolean(), "redundant", "false", 0, 1, FieldMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldMappingType_UseClobBuffer(), theXMLTypePackage.getBoolean(), "useClobBuffer", "false", 0, 1, FieldMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldMappingType_AssociationName(), theXMLTypePackage.getString(), "associationName", null, 1, 1, FieldMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fkTypeEClass, FKType.class, "FKType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFKType_ColumnName(), theXMLTypePackage.getString(), "columnName", null, 1, 1, FKType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFKType_RefTable(), theCommonPackage.getTargetEntityType(), null, "refTable", null, 1, 1, FKType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFKType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, FKType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFKType_OnDelete(), this.getOnDeleteType(), "onDelete", null, 0, 1, FKType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexTypeEClass, IndexType.class, "IndexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexType_Column(), theXMLTypePackage.getString(), "column", null, 1, -1, IndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexType_IsClustered(), theXMLTypePackage.getBoolean(), "isClustered", "false", 0, 1, IndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexType_IsUnique(), theXMLTypePackage.getBoolean(), "isUnique", "false", 0, 1, IndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, IndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritAssociationTypeEClass, InheritAssociationType.class, "InheritAssociationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInheritAssociationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, InheritAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInheritAssociationType_ParentTable(), theXMLTypePackage.getString(), "parentTable", null, 1, 1, InheritAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinTableTypeEClass, JoinTableType.class, "JoinTableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinTableType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, JoinTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTableType_SrcPKColumn(), theXMLTypePackage.getString(), "srcPKColumn", null, 1, 1, JoinTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTableType_SrcTable(), theXMLTypePackage.getString(), "srcTable", null, 0, 1, JoinTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTableType_TarTable(), theXMLTypePackage.getString(), "tarTable", null, 1, 1, JoinTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTableType_TarPKColumn(), theXMLTypePackage.getString(), "tarPKColumn", null, 1, 1, JoinTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listFieldMappingTypeEClass, ListFieldMappingType.class, "ListFieldMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListFieldMappingType_CollectionTable(), theCommonPackage.getTargetEntityType(), null, "collectionTable", null, 1, 1, ListFieldMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListFieldMappingType_IsPrivateOwned(), theXMLTypePackage.getBoolean(), "isPrivateOwned", "false", 0, 1, ListFieldMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListFieldMappingType_MappingType(), this.getMappingTypeType(), "mappingType", null, 1, 1, ListFieldMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pkTypeEClass, PKType.class, "PKType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPKType_ColumnName(), theXMLTypePackage.getString(), "columnName", null, 1, 1, PKType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPKType_SequenceName(), theXMLTypePackage.getString(), "sequenceName", null, 1, 1, PKType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPKType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, PKType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbDiagramTypeEClass, RDBDiagramType.class, "RDBDiagramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDBDiagramType_Table(), this.getTableType(), null, "table", null, 0, -1, RDBDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDBDiagramType_View(), this.getViewType(), null, "view", null, 0, -1, RDBDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDBDiagramType_JoinTable(), this.getJoinTableType(), null, "joinTable", null, 0, -1, RDBDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDBDiagramType_DaoPackage(), theXMLTypePackage.getString(), "daoPackage", null, 0, 1, RDBDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDBDiagramType_DiagramPackage(), theXMLTypePackage.getString(), "diagramPackage", null, 0, 1, RDBDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbTypeEClass, RDBType.class, "RDBType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDBType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, RDBType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDBType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RDBType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceType_Dbcache(), theXMLTypePackage.getInt(), "dbcache", "20", 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceType_Span(), theXMLTypePackage.getInt(), "span", "10", 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceType_StartWith(), theXMLTypePackage.getInt(), "startWith", "1", 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableType_Column(), this.getColumnType(), null, "column", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Index(), this.getIndexType(), null, "index", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_PrimaryKey(), this.getPKType(), null, "primaryKey", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_ForeignKey(), this.getFKType(), null, "foreignKey", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_InheritAsscociation(), this.getInheritAssociationType(), null, "inheritAsscociation", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Mapping(), this.getClassMappingType(), null, "mapping", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewTypeEClass, ViewType.class, "ViewType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewType_BaseTable(), theCommonPackage.getTargetEntityType(), null, "baseTable", null, 1, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewType_ExtTable(), theCommonPackage.getTargetEntityType(), null, "extTable", null, 1, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewType_Op(), this.getViewOpType(), "op", null, 0, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mappingTypeTypeEEnum, MappingTypeType.class, "MappingTypeType");
		addEEnumLiteral(mappingTypeTypeEEnum, MappingTypeType.ONE_TO_ONE);
		addEEnumLiteral(mappingTypeTypeEEnum, MappingTypeType.ONE_TO_MANY);
		addEEnumLiteral(mappingTypeTypeEEnum, MappingTypeType.MANY_TO_MANY);

		initEEnum(onDeleteTypeEEnum, OnDeleteType.class, "OnDeleteType");
		addEEnumLiteral(onDeleteTypeEEnum, OnDeleteType.CASCADE);
		addEEnumLiteral(onDeleteTypeEEnum, OnDeleteType.SETNULL);

		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.BIGINT);
		addEEnumLiteral(typeTypeEEnum, TypeType.BIT);
		addEEnumLiteral(typeTypeEEnum, TypeType.BLOB);
		addEEnumLiteral(typeTypeEEnum, TypeType.BLOB2);
		addEEnumLiteral(typeTypeEEnum, TypeType.CLOB);
		addEEnumLiteral(typeTypeEEnum, TypeType.CLOB2);
		addEEnumLiteral(typeTypeEEnum, TypeType.DECIMAL);
		addEEnumLiteral(typeTypeEEnum, TypeType.INTEGER);
		addEEnumLiteral(typeTypeEEnum, TypeType.DATE);
		addEEnumLiteral(typeTypeEEnum, TypeType.DATETIME);
		addEEnumLiteral(typeTypeEEnum, TypeType.TIMESTAMP);
		addEEnumLiteral(typeTypeEEnum, TypeType.VARCHAR);

		initEEnum(viewOpTypeEEnum, ViewOpType.class, "ViewOpType");
		addEEnumLiteral(viewOpTypeEEnum, ViewOpType.JOIN);
		addEEnumLiteral(viewOpTypeEEnum, ViewOpType.UNION);

		// Initialize data types
		initEDataType(mappingTypeTypeObjectEDataType, MappingTypeType.class, "MappingTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(onDeleteTypeObjectEDataType, OnDeleteType.class, "OnDeleteTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(viewOpTypeObjectEDataType, ViewOpType.class, "ViewOpTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (classMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClassMappingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClassMappingType_BusinessEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "businessEntity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassMappingType_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassMappingType_HistoryTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "historyTable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassMappingType_View(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "view",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassMappingType_ParentClassMapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parentClassMapping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClassMappingType_FieldMapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fieldMapping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (columnTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ColumnType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getColumnType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment"
		   });		
		addAnnotation
		  (getColumnType_Default(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default"
		   });		
		addAnnotation
		  (getColumnType_IsNull(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isNull"
		   });			
		addAnnotation
		  (getColumnType_Length(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "length"
		   });		
		addAnnotation
		  (getColumnType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getColumnType_Precision(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "precision"
		   });		
		addAnnotation
		  (getColumnType_Redundant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "redundant"
		   });		
		addAnnotation
		  (getColumnType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassMapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClassMapping",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RDBDiagram(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RDBDiagram",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fieldMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FieldMappingType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFieldMappingType_BeFieldName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "beFieldName"
		   });		
		addAnnotation
		  (getFieldMappingType_ColumnName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "columnName"
		   });		
		addAnnotation
		  (getFieldMappingType_IsTimestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isTimestamp"
		   });		
		addAnnotation
		  (getFieldMappingType_Redundant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "redundant"
		   });		
		addAnnotation
		  (getFieldMappingType_UseClobBuffer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "useClobBuffer"
		   });		
		addAnnotation
		  (getFieldMappingType_AssociationName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "associationName"
		   });		
		addAnnotation
		  (fkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FKType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFKType_ColumnName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "columnName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFKType_RefTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refTable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFKType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getFKType_OnDelete(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onDelete"
		   });		
		addAnnotation
		  (indexTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IndexType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIndexType_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIndexType_IsClustered(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isClustered"
		   });		
		addAnnotation
		  (getIndexType_IsUnique(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isUnique"
		   });		
		addAnnotation
		  (getIndexType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (inheritAssociationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InheritAssociationType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getInheritAssociationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getInheritAssociationType_ParentTable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parentTable"
		   });		
		addAnnotation
		  (joinTableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "JoinTableType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getJoinTableType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getJoinTableType_SrcPKColumn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pkColumn"
		   });		
		addAnnotation
		  (getJoinTableType_TarPKColumn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fkColumn"
		   });		
		addAnnotation
		  (listFieldMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ListFieldMappingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getListFieldMappingType_CollectionTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "collectionTable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getListFieldMappingType_IsPrivateOwned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isPrivateOwned"
		   });		
		addAnnotation
		  (getListFieldMappingType_MappingType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mappingType"
		   });		
		addAnnotation
		  (mappingTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "mappingType_._type"
		   });		
		addAnnotation
		  (mappingTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mappingType_._type:Object",
			 "baseType", "mappingType_._type"
		   });		
		addAnnotation
		  (onDeleteTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "OnDeleteType"
		   });		
		addAnnotation
		  (onDeleteTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "OnDeleteType:Object",
			 "baseType", "OnDeleteType"
		   });		
		addAnnotation
		  (pkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PKType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPKType_ColumnName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "columnName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPKType_SequenceName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequenceName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPKType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (rdbDiagramTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RDBDiagramType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRDBDiagramType_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRDBDiagramType_View(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "view",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRDBDiagramType_DaoPackage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "daoPackage"
		   });		
		addAnnotation
		  (getRDBDiagramType_DiagramPackage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "diagramPackage"
		   });		
		addAnnotation
		  (rdbTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RDBType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRDBType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment"
		   });		
		addAnnotation
		  (getRDBType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (sequenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SequenceType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSequenceType_Dbcache(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dbcache"
		   });		
		addAnnotation
		  (getSequenceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getSequenceType_Span(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "span"
		   });		
		addAnnotation
		  (getSequenceType_StartWith(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startWith"
		   });		
		addAnnotation
		  (tableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TableType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTableType_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Index(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "index",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Sequence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_PrimaryKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "primaryKey",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_ForeignKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "foreignKey",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_InheritAsscociation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inheritAsscociation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Mapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mapping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "type_._type"
		   });		
		addAnnotation
		  (typeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "type_._type:Object",
			 "baseType", "type_._type"
		   });		
		addAnnotation
		  (viewOpTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ViewOpType"
		   });		
		addAnnotation
		  (viewOpTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ViewOpType:Object",
			 "baseType", "ViewOpType"
		   });		
		addAnnotation
		  (viewTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ViewType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getViewType_BaseTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "baseTable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getViewType_ExtTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extTable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getViewType_Op(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "op",
			 "namespace", "##targetNamespace"
		   });
	}

} //RDBDiagramPackageImpl
