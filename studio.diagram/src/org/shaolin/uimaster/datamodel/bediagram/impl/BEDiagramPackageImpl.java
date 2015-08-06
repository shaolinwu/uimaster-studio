/**
 */
package org.shaolin.uimaster.datamodel.bediagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.shaolin.uimaster.datamodel.bediagram.BECollectionType;
import org.shaolin.uimaster.datamodel.bediagram.BEComplexType;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
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
import org.shaolin.uimaster.datamodel.bediagram.PersistenceTypeType;
import org.shaolin.uimaster.datamodel.bediagram.PersistentConfigType;
import org.shaolin.uimaster.datamodel.bediagram.ReferenceObjectType;
import org.shaolin.uimaster.datamodel.bediagram.RelationConstraintType;
import org.shaolin.uimaster.datamodel.bediagram.RelationKeyType;
import org.shaolin.uimaster.datamodel.bediagram.RelationTypeType;
import org.shaolin.uimaster.datamodel.bediagram.SearchMethodType;
import org.shaolin.uimaster.datamodel.bediagram.StringType;
import org.shaolin.uimaster.datamodel.bediagram.StyleType;
import org.shaolin.uimaster.datamodel.bediagram.TimeType;
import org.shaolin.uimaster.datamodel.bediagram.ValidatorConfigType;
import org.shaolin.uimaster.datamodel.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BEDiagramPackageImpl extends EPackageImpl implements BEDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beDiagramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beMapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beObjRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bePrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceObjRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeTypeEClass = null;

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
	private EClass doubleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityNameWebServiceMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRelationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaObjRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberWebServiceMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistentConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationKeyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatorConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum styleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType persistenceTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleTypeObjectEDataType = null;

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
	 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BEDiagramPackageImpl() {
		super(eNS_URI, BEDiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BEDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BEDiagramPackage init() {
		if (isInited) return (BEDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(BEDiagramPackage.eNS_URI);

		// Obtain or create and register package
		BEDiagramPackageImpl theBEDiagramPackage = (BEDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BEDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BEDiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBEDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theBEDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBEDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BEDiagramPackage.eNS_URI, theBEDiagramPackage);
		return theBEDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBECollectionType() {
		return beCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBECollectionType_ElementType() {
		return (EReference)beCollectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBEComplexType() {
		return beComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBEDiagramType() {
		return beDiagramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBEDiagramType_BeEntity() {
		return (EReference)beDiagramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBEDiagramType_CeEntity() {
		return (EReference)beDiagramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBEDiagramType_DiagramPackage() {
		return (EAttribute)beDiagramTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBEListType() {
		return beListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBEMapType() {
		return beMapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBEMapType_KeyType() {
		return (EReference)beMapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBEObjRefType() {
		return beObjRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBEObjRefType_TargetEntity() {
		return (EReference)beObjRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBEObjRefType_AutoVersionUpdate() {
		return (EAttribute)beObjRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBEPrimitiveType() {
		return bePrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBESetType() {
		return beSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBEType() {
		return beTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryType() {
		return binaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessEntityType() {
		return businessEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessEntityType_ParentObject() {
		return (EReference)businessEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessEntityType_Member() {
		return (EReference)businessEntityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessEntityType_PersistentConfig() {
		return (EReference)businessEntityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessEntityType_ValidatorConfig() {
		return (EReference)businessEntityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessEntityType_SearchMethod() {
		return (EReference)businessEntityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessEntityType_Abbreviation() {
		return (EAttribute)businessEntityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessEntityType_Extensible() {
		return (EAttribute)businessEntityTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessEntityType_NeedEquals() {
		return (EAttribute)businessEntityTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessEntityType_NeedHistory() {
		return (EAttribute)businessEntityTypeEClass.getEStructuralFeatures().get(8);
	}
	
	public EAttribute getBusinessEntityType_Parent() {
		return (EAttribute)businessEntityTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEObjRefType() {
		return ceObjRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEObjRefType_TargetEntity() {
		return (EReference)ceObjRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantEntityType() {
		return constantEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantEntityType_EffTime() {
		return (EAttribute)constantEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantEntityType_ExpTime() {
		return (EAttribute)constantEntityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantEntityType_ConstantValue() {
		return (EReference)constantEntityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantValueType() {
		return constantValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValueType_Value() {
		return (EAttribute)constantValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValueType_I18nKey() {
		return (EAttribute)constantValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValueType_IntValue() {
		return (EAttribute)constantValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValueType_Description() {
		return (EAttribute)constantValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValueType_EffTime() {
		return (EAttribute)constantValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValueType_ExpTime() {
		return (EAttribute)constantValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValueType_Passivated() {
		return (EAttribute)constantValueTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValueType_Priority() {
		return (EAttribute)constantValueTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeType() {
		return dateTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBEDiagramType_BePackage() {
		return (EAttribute)beDiagramTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBEDiagramType_CePackage() {
		return (EAttribute)beDiagramTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getDocumentRoot_BEDiagram() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BusinessEntity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConstantEntity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleType() {
		return doubleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummyFieldType() {
		return dummyFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDummyFieldType_Reference() {
		return (EReference)dummyFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDummyFieldType_RefDummyFieldName() {
		return (EAttribute)dummyFieldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDummyFieldType_DummyFieldName() {
		return (EAttribute)dummyFieldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityNameWebServiceMappingType() {
		return entityNameWebServiceMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityNameWebServiceMappingType_MappedName() {
		return (EAttribute)entityNameWebServiceMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityNameWebServiceMappingType_NamespaceURI() {
		return (EAttribute)entityNameWebServiceMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityRelationType() {
		return entityRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelationType_Entity() {
		return (EReference)entityRelationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelationType_Entity2() {
		return (EReference)entityRelationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationType_Name() {
		return (EAttribute)entityRelationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationType_Priority() {
		return (EAttribute)entityRelationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationType_RefedName() {
		return (EAttribute)entityRelationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationType_RefedPriority() {
		return (EAttribute)entityRelationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationType_Type() {
		return (EAttribute)entityRelationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReferenceType() {
		return externalReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalReferenceType_Expression() {
		return (EAttribute)externalReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalReferenceType_Name() {
		return (EAttribute)externalReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileType() {
		return fileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntType() {
		return intTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaObjRefType() {
		return javaObjRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaObjRefType_TargetJava() {
		return (EReference)javaObjRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongType() {
		return longTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberType() {
		return memberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberType_Name() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberType_Description() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberType_DefaultValue() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberType_Type() {
		return (EReference)memberTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberType_MetaInfo() {
		return (EReference)memberTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberType_Accessible() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberType_Modifiable() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberType_Transient() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(7);
	}
	
	public EAttribute getMemberType_CollectionRefEntityName() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(8);
	}
	
	public EAttribute getMemberType_MapKeyType() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberWebServiceMappingType() {
		return memberWebServiceMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberWebServiceMappingType_CollectionWrapped() {
		return (EAttribute)memberWebServiceMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberWebServiceMappingType_Ignore() {
		return (EAttribute)memberWebServiceMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberWebServiceMappingType_MappedName() {
		return (EAttribute)memberWebServiceMappingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberWebServiceMappingType_Style() {
		return (EAttribute)memberWebServiceMappingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectRefType() {
		return objectRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistentConfigType() {
		return persistentConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistentConfigType_SupportedPersistenceType() {
		return (EAttribute)persistentConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistentConfigType_PrimaryKeyMember() {
		return (EAttribute)persistentConfigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceObjectType() {
		return referenceObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceObjectType_RefType() {
		return (EReference)referenceObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceObjectType_RefFieldName() {
		return (EAttribute)referenceObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceObjectType_FieldName() {
		return (EAttribute)referenceObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceObjectType_TimeFieldName() {
		return (EAttribute)referenceObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceObjectType_MustHave() {
		return (EAttribute)referenceObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceObjectType_Name() {
		return (EAttribute)referenceObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationConstraintType() {
		return relationConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationConstraintType_Value() {
		return (EReference)relationConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationConstraintType_IsEntity2() {
		return (EAttribute)relationConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationConstraintType_RelationName() {
		return (EAttribute)relationConstraintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationKeyType() {
		return relationKeyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationKeyType_FieldName() {
		return (EAttribute)relationKeyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationKeyType_IsEntity2() {
		return (EAttribute)relationKeyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationKeyType_RelationName() {
		return (EAttribute)relationKeyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchMethodType() {
		return searchMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchMethodType_Name() {
		return (EAttribute)searchMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchMethodType_Query() {
		return (EReference)searchMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchMethodType_ConditionMappingName() {
		return (EAttribute)searchMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeType() {
		return timeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidatorConfigType() {
		return validatorConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidatorConfigType_DummyField() {
		return (EReference)validatorConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidatorConfigType_ReferenceConfig() {
		return (EReference)validatorConfigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidatorConfigType_ExternalReferenceConfig() {
		return (EReference)validatorConfigTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistenceTypeType() {
		return persistenceTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationTypeType() {
		return relationTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyleType() {
		return styleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPersistenceTypeTypeObject() {
		return persistenceTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationTypeTypeObject() {
		return relationTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleTypeObject() {
		return styleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEDiagramFactory getBEDiagramFactory() {
		return (BEDiagramFactory)getEFactoryInstance();
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
		beCollectionTypeEClass = createEClass(BE_COLLECTION_TYPE);
		createEReference(beCollectionTypeEClass, BE_COLLECTION_TYPE__ELEMENT_TYPE);

		beComplexTypeEClass = createEClass(BE_COMPLEX_TYPE);

		beDiagramTypeEClass = createEClass(BE_DIAGRAM_TYPE);
		createEReference(beDiagramTypeEClass, BE_DIAGRAM_TYPE__BE_ENTITY);
		createEReference(beDiagramTypeEClass, BE_DIAGRAM_TYPE__CE_ENTITY);
		createEAttribute(beDiagramTypeEClass, BE_DIAGRAM_TYPE__BE_PACKAGE);
		createEAttribute(beDiagramTypeEClass, BE_DIAGRAM_TYPE__CE_PACKAGE);
		createEAttribute(beDiagramTypeEClass, BE_DIAGRAM_TYPE__DIAGRAM_PACKAGE);

		beListTypeEClass = createEClass(BE_LIST_TYPE);

		beMapTypeEClass = createEClass(BE_MAP_TYPE);
		createEReference(beMapTypeEClass, BE_MAP_TYPE__KEY_TYPE);

		beObjRefTypeEClass = createEClass(BE_OBJ_REF_TYPE);
		createEReference(beObjRefTypeEClass, BE_OBJ_REF_TYPE__TARGET_ENTITY);
		createEAttribute(beObjRefTypeEClass, BE_OBJ_REF_TYPE__AUTO_VERSION_UPDATE);

		bePrimitiveTypeEClass = createEClass(BE_PRIMITIVE_TYPE);

		beSetTypeEClass = createEClass(BE_SET_TYPE);

		beTypeEClass = createEClass(BE_TYPE);

		binaryTypeEClass = createEClass(BINARY_TYPE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);

		businessEntityTypeEClass = createEClass(BUSINESS_ENTITY_TYPE);
		createEReference(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__PARENT_OBJECT);
		createEReference(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__MEMBER);
		createEReference(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__PERSISTENT_CONFIG);
		createEReference(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__VALIDATOR_CONFIG);
		createEReference(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__SEARCH_METHOD);
		createEAttribute(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__ABBREVIATION);
		createEAttribute(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__EXTENSIBLE);
		createEAttribute(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__NEED_EQUALS);
		createEAttribute(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__NEED_HISTORY);
		createEAttribute(businessEntityTypeEClass, BUSINESS_ENTITY_TYPE__PARENT);
		
		ceObjRefTypeEClass = createEClass(CE_OBJ_REF_TYPE);
		createEReference(ceObjRefTypeEClass, CE_OBJ_REF_TYPE__TARGET_ENTITY);

		constantEntityTypeEClass = createEClass(CONSTANT_ENTITY_TYPE);
		createEAttribute(constantEntityTypeEClass, CONSTANT_ENTITY_TYPE__EFF_TIME);
		createEAttribute(constantEntityTypeEClass, CONSTANT_ENTITY_TYPE__EXP_TIME);
		createEReference(constantEntityTypeEClass, CONSTANT_ENTITY_TYPE__CONSTANT_VALUE);

		constantValueTypeEClass = createEClass(CONSTANT_VALUE_TYPE);
		createEAttribute(constantValueTypeEClass, CONSTANT_VALUE_TYPE__VALUE);
		createEAttribute(constantValueTypeEClass, CONSTANT_VALUE_TYPE__I18N_KEY);
		createEAttribute(constantValueTypeEClass, CONSTANT_VALUE_TYPE__INT_VALUE);
		createEAttribute(constantValueTypeEClass, CONSTANT_VALUE_TYPE__DESCRIPTION);
		createEAttribute(constantValueTypeEClass, CONSTANT_VALUE_TYPE__EFF_TIME);
		createEAttribute(constantValueTypeEClass, CONSTANT_VALUE_TYPE__EXP_TIME);
		createEAttribute(constantValueTypeEClass, CONSTANT_VALUE_TYPE__PASSIVATED);
		createEAttribute(constantValueTypeEClass, CONSTANT_VALUE_TYPE__PRIORITY);

		dateTimeTypeEClass = createEClass(DATE_TIME_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BE_DIAGRAM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUSINESS_ENTITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONSTANT_ENTITY);

		doubleTypeEClass = createEClass(DOUBLE_TYPE);

		dummyFieldTypeEClass = createEClass(DUMMY_FIELD_TYPE);
		createEReference(dummyFieldTypeEClass, DUMMY_FIELD_TYPE__REFERENCE);
		createEAttribute(dummyFieldTypeEClass, DUMMY_FIELD_TYPE__REF_DUMMY_FIELD_NAME);
		createEAttribute(dummyFieldTypeEClass, DUMMY_FIELD_TYPE__DUMMY_FIELD_NAME);

		entityNameWebServiceMappingTypeEClass = createEClass(ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE);
		createEAttribute(entityNameWebServiceMappingTypeEClass, ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME);
		createEAttribute(entityNameWebServiceMappingTypeEClass, ENTITY_NAME_WEB_SERVICE_MAPPING_TYPE__NAMESPACE_URI);

		entityRelationTypeEClass = createEClass(ENTITY_RELATION_TYPE);
		createEReference(entityRelationTypeEClass, ENTITY_RELATION_TYPE__ENTITY);
		createEReference(entityRelationTypeEClass, ENTITY_RELATION_TYPE__ENTITY2);
		createEAttribute(entityRelationTypeEClass, ENTITY_RELATION_TYPE__NAME);
		createEAttribute(entityRelationTypeEClass, ENTITY_RELATION_TYPE__PRIORITY);
		createEAttribute(entityRelationTypeEClass, ENTITY_RELATION_TYPE__REFED_NAME);
		createEAttribute(entityRelationTypeEClass, ENTITY_RELATION_TYPE__REFED_PRIORITY);
		createEAttribute(entityRelationTypeEClass, ENTITY_RELATION_TYPE__TYPE);

		externalReferenceTypeEClass = createEClass(EXTERNAL_REFERENCE_TYPE);
		createEAttribute(externalReferenceTypeEClass, EXTERNAL_REFERENCE_TYPE__EXPRESSION);
		createEAttribute(externalReferenceTypeEClass, EXTERNAL_REFERENCE_TYPE__NAME);

		fileTypeEClass = createEClass(FILE_TYPE);

		intTypeEClass = createEClass(INT_TYPE);

		javaObjRefTypeEClass = createEClass(JAVA_OBJ_REF_TYPE);
		createEReference(javaObjRefTypeEClass, JAVA_OBJ_REF_TYPE__TARGET_JAVA);

		longTypeEClass = createEClass(LONG_TYPE);

		memberTypeEClass = createEClass(MEMBER_TYPE);
		createEAttribute(memberTypeEClass, MEMBER_TYPE__NAME);
		createEAttribute(memberTypeEClass, MEMBER_TYPE__DESCRIPTION);
		createEAttribute(memberTypeEClass, MEMBER_TYPE__DEFAULT_VALUE);
		createEReference(memberTypeEClass, MEMBER_TYPE__TYPE);
		createEReference(memberTypeEClass, MEMBER_TYPE__META_INFO);
		createEAttribute(memberTypeEClass, MEMBER_TYPE__ACCESSIBLE);
		createEAttribute(memberTypeEClass, MEMBER_TYPE__MODIFIABLE);
		createEAttribute(memberTypeEClass, MEMBER_TYPE__TRANSIENT);
		createEAttribute(memberTypeEClass, MEMBER_TYPE_REF_ENTITY_NAME);
		createEAttribute(memberTypeEClass, MEMBER_TYPE_MAP_KEY_TYPE);

		memberWebServiceMappingTypeEClass = createEClass(MEMBER_WEB_SERVICE_MAPPING_TYPE);
		createEAttribute(memberWebServiceMappingTypeEClass, MEMBER_WEB_SERVICE_MAPPING_TYPE__COLLECTION_WRAPPED);
		createEAttribute(memberWebServiceMappingTypeEClass, MEMBER_WEB_SERVICE_MAPPING_TYPE__IGNORE);
		createEAttribute(memberWebServiceMappingTypeEClass, MEMBER_WEB_SERVICE_MAPPING_TYPE__MAPPED_NAME);
		createEAttribute(memberWebServiceMappingTypeEClass, MEMBER_WEB_SERVICE_MAPPING_TYPE__STYLE);

		objectRefTypeEClass = createEClass(OBJECT_REF_TYPE);

		persistentConfigTypeEClass = createEClass(PERSISTENT_CONFIG_TYPE);
		createEAttribute(persistentConfigTypeEClass, PERSISTENT_CONFIG_TYPE__SUPPORTED_PERSISTENCE_TYPE);
		createEAttribute(persistentConfigTypeEClass, PERSISTENT_CONFIG_TYPE__PRIMARY_KEY_MEMBER);

		referenceObjectTypeEClass = createEClass(REFERENCE_OBJECT_TYPE);
		createEReference(referenceObjectTypeEClass, REFERENCE_OBJECT_TYPE__REF_TYPE);
		createEAttribute(referenceObjectTypeEClass, REFERENCE_OBJECT_TYPE__REF_FIELD_NAME);
		createEAttribute(referenceObjectTypeEClass, REFERENCE_OBJECT_TYPE__FIELD_NAME);
		createEAttribute(referenceObjectTypeEClass, REFERENCE_OBJECT_TYPE__TIME_FIELD_NAME);
		createEAttribute(referenceObjectTypeEClass, REFERENCE_OBJECT_TYPE__MUST_HAVE);
		createEAttribute(referenceObjectTypeEClass, REFERENCE_OBJECT_TYPE__NAME);

		relationConstraintTypeEClass = createEClass(RELATION_CONSTRAINT_TYPE);
		createEReference(relationConstraintTypeEClass, RELATION_CONSTRAINT_TYPE__VALUE);
		createEAttribute(relationConstraintTypeEClass, RELATION_CONSTRAINT_TYPE__IS_ENTITY2);
		createEAttribute(relationConstraintTypeEClass, RELATION_CONSTRAINT_TYPE__RELATION_NAME);

		relationKeyTypeEClass = createEClass(RELATION_KEY_TYPE);
		createEAttribute(relationKeyTypeEClass, RELATION_KEY_TYPE__FIELD_NAME);
		createEAttribute(relationKeyTypeEClass, RELATION_KEY_TYPE__IS_ENTITY2);
		createEAttribute(relationKeyTypeEClass, RELATION_KEY_TYPE__RELATION_NAME);

		searchMethodTypeEClass = createEClass(SEARCH_METHOD_TYPE);
		createEAttribute(searchMethodTypeEClass, SEARCH_METHOD_TYPE__NAME);
		createEReference(searchMethodTypeEClass, SEARCH_METHOD_TYPE__QUERY);
		createEAttribute(searchMethodTypeEClass, SEARCH_METHOD_TYPE__CONDITION_MAPPING_NAME);

		stringTypeEClass = createEClass(STRING_TYPE);

		timeTypeEClass = createEClass(TIME_TYPE);

		validatorConfigTypeEClass = createEClass(VALIDATOR_CONFIG_TYPE);
		createEReference(validatorConfigTypeEClass, VALIDATOR_CONFIG_TYPE__DUMMY_FIELD);
		createEReference(validatorConfigTypeEClass, VALIDATOR_CONFIG_TYPE__REFERENCE_CONFIG);
		createEReference(validatorConfigTypeEClass, VALIDATOR_CONFIG_TYPE__EXTERNAL_REFERENCE_CONFIG);

		// Create enums
		persistenceTypeTypeEEnum = createEEnum(PERSISTENCE_TYPE_TYPE);
		relationTypeTypeEEnum = createEEnum(RELATION_TYPE_TYPE);
		styleTypeEEnum = createEEnum(STYLE_TYPE);

		// Create data types
		persistenceTypeTypeObjectEDataType = createEDataType(PERSISTENCE_TYPE_TYPE_OBJECT);
		relationTypeTypeObjectEDataType = createEDataType(RELATION_TYPE_TYPE_OBJECT);
		styleTypeObjectEDataType = createEDataType(STYLE_TYPE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		beCollectionTypeEClass.getESuperTypes().add(this.getBEComplexType());
		beComplexTypeEClass.getESuperTypes().add(this.getBEType());
		beListTypeEClass.getESuperTypes().add(this.getBECollectionType());
		beMapTypeEClass.getESuperTypes().add(this.getBECollectionType());
		beObjRefTypeEClass.getESuperTypes().add(this.getObjectRefType());
		bePrimitiveTypeEClass.getESuperTypes().add(this.getBEType());
		beSetTypeEClass.getESuperTypes().add(this.getBECollectionType());
		binaryTypeEClass.getESuperTypes().add(this.getBEPrimitiveType());
		booleanTypeEClass.getESuperTypes().add(this.getBEPrimitiveType());
		businessEntityTypeEClass.getESuperTypes().add(theCommonPackage.getEntityType());
		ceObjRefTypeEClass.getESuperTypes().add(this.getBEComplexType());
		constantEntityTypeEClass.getESuperTypes().add(theCommonPackage.getEntityType());
		dateTimeTypeEClass.getESuperTypes().add(this.getBEPrimitiveType());
		doubleTypeEClass.getESuperTypes().add(this.getBEPrimitiveType());
		entityNameWebServiceMappingTypeEClass.getESuperTypes().add(theCommonPackage.getMetaDataType());
		entityRelationTypeEClass.getESuperTypes().add(theCommonPackage.getMetaDataType());
		fileTypeEClass.getESuperTypes().add(this.getBEPrimitiveType());
		intTypeEClass.getESuperTypes().add(this.getBEPrimitiveType());
		javaObjRefTypeEClass.getESuperTypes().add(this.getObjectRefType());
		longTypeEClass.getESuperTypes().add(this.getBEPrimitiveType());
		memberWebServiceMappingTypeEClass.getESuperTypes().add(theCommonPackage.getMetaDataType());
		objectRefTypeEClass.getESuperTypes().add(this.getBEComplexType());
		relationConstraintTypeEClass.getESuperTypes().add(theCommonPackage.getMetaDataType());
		relationKeyTypeEClass.getESuperTypes().add(theCommonPackage.getMetaDataType());
		stringTypeEClass.getESuperTypes().add(this.getBEPrimitiveType());
		timeTypeEClass.getESuperTypes().add(this.getBEPrimitiveType());

		// Initialize classes and features; add operations and parameters
		initEClass(beCollectionTypeEClass, BECollectionType.class, "BECollectionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBECollectionType_ElementType(), this.getBEType(), null, "elementType", null, 1, 1, BECollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beComplexTypeEClass, BEComplexType.class, "BEComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beDiagramTypeEClass, BEDiagramType.class, "BEDiagramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBEDiagramType_BeEntity(), this.getBusinessEntityType(), null, "beEntity", null, 0, -1, BEDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBEDiagramType_CeEntity(), this.getConstantEntityType(), null, "ceEntity", null, 0, -1, BEDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBEDiagramType_BePackage(), theXMLTypePackage.getString(), "bePackage", null, 0, 1, BEDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBEDiagramType_CePackage(), theXMLTypePackage.getString(), "cePackage", null, 0, 1, BEDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBEDiagramType_DiagramPackage(), theXMLTypePackage.getString(), "diagramPackage", null, 0, 1, BEDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beListTypeEClass, BEListType.class, "BEListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beMapTypeEClass, BEMapType.class, "BEMapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBEMapType_KeyType(), this.getBEType(), null, "keyType", null, 1, 1, BEMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beObjRefTypeEClass, BEObjRefType.class, "BEObjRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBEObjRefType_TargetEntity(), theCommonPackage.getTargetEntityType(), null, "targetEntity", null, 1, 1, BEObjRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBEObjRefType_AutoVersionUpdate(), theXMLTypePackage.getBoolean(), "autoVersionUpdate", null, 0, 1, BEObjRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bePrimitiveTypeEClass, BEPrimitiveType.class, "BEPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beSetTypeEClass, BESetType.class, "BESetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beTypeEClass, BEType.class, "BEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryTypeEClass, BinaryType.class, "BinaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessEntityTypeEClass, BusinessEntityType.class, "BusinessEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessEntityType_ParentObject(), this.getObjectRefType(), null, "parentObject", null, 0, 1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessEntityType_Member(), this.getMemberType(), null, "member", null, 0, -1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessEntityType_PersistentConfig(), this.getPersistentConfigType(), null, "persistentConfig", null, 0, -1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessEntityType_ValidatorConfig(), this.getValidatorConfigType(), null, "validatorConfig", null, 0, 1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessEntityType_SearchMethod(), this.getSearchMethodType(), null, "searchMethod", null, 0, -1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessEntityType_Abbreviation(), theXMLTypePackage.getString(), "abbreviation", null, 0, 1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessEntityType_Extensible(), theXMLTypePackage.getBoolean(), "extensible", "true", 0, 1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessEntityType_NeedEquals(), theXMLTypePackage.getBoolean(), "needEquals", "true", 0, 1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessEntityType_NeedHistory(), theXMLTypePackage.getBoolean(), "needHistory", "false", 0, 1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessEntityType_Parent(), theXMLTypePackage.getString(), "parent", null, 0, 1, BusinessEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(ceObjRefTypeEClass, CEObjRefType.class, "CEObjRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCEObjRefType_TargetEntity(), theCommonPackage.getTargetEntityType(), null, "targetEntity", null, 1, 1, CEObjRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEntityTypeEClass, ConstantEntityType.class, "ConstantEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantEntityType_EffTime(), theXMLTypePackage.getDateTime(), "effTime", null, 0, 1, ConstantEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantEntityType_ExpTime(), theXMLTypePackage.getDateTime(), "expTime", null, 0, 1, ConstantEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstantEntityType_ConstantValue(), this.getConstantValueType(), null, "constantValue", null, 0, -1, ConstantEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantValueTypeEClass, ConstantValueType.class, "ConstantValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantValueType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, ConstantValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantValueType_I18nKey(), theXMLTypePackage.getString(), "i18nKey", null, 0, 1, ConstantValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantValueType_IntValue(), theXMLTypePackage.getInt(), "intValue", "-1", 0, 1, ConstantValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantValueType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, ConstantValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantValueType_EffTime(), theXMLTypePackage.getDateTime(), "effTime", null, 0, 1, ConstantValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantValueType_ExpTime(), theXMLTypePackage.getDateTime(), "expTime", null, 0, 1, ConstantValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantValueType_Passivated(), theXMLTypePackage.getBoolean(), "passivated", "false", 0, 1, ConstantValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantValueType_Priority(), theXMLTypePackage.getInt(), "priority", null, 0, 1, ConstantValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeTypeEClass, DateTimeType.class, "DateTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BEDiagram(), this.getBEDiagramType(), null, "bEDiagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BusinessEntity(), this.getBusinessEntityType(), null, "businessEntity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConstantEntity(), this.getConstantEntityType(), null, "constantEntity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(doubleTypeEClass, DoubleType.class, "DoubleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dummyFieldTypeEClass, DummyFieldType.class, "DummyFieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDummyFieldType_Reference(), this.getReferenceObjectType(), null, "reference", null, 1, 1, DummyFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDummyFieldType_RefDummyFieldName(), theXMLTypePackage.getString(), "refDummyFieldName", null, 0, -1, DummyFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDummyFieldType_DummyFieldName(), theXMLTypePackage.getString(), "dummyFieldName", null, 0, -1, DummyFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityNameWebServiceMappingTypeEClass, EntityNameWebServiceMappingType.class, "EntityNameWebServiceMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityNameWebServiceMappingType_MappedName(), theXMLTypePackage.getString(), "mappedName", null, 0, 1, EntityNameWebServiceMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityNameWebServiceMappingType_NamespaceURI(), theXMLTypePackage.getString(), "namespaceURI", null, 0, 1, EntityNameWebServiceMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityRelationTypeEClass, EntityRelationType.class, "EntityRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityRelationType_Entity(), theCommonPackage.getTargetEntityType(), null, "entity", null, 1, 1, EntityRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRelationType_Entity2(), theCommonPackage.getTargetEntityType(), null, "entity2", null, 1, 1, EntityRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EntityRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelationType_Priority(), theXMLTypePackage.getInt(), "priority", null, 0, 1, EntityRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelationType_RefedName(), theXMLTypePackage.getString(), "refedName", null, 0, 1, EntityRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelationType_RefedPriority(), theXMLTypePackage.getInt(), "refedPriority", null, 0, 1, EntityRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRelationType_Type(), this.getRelationTypeType(), "type", null, 1, 1, EntityRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalReferenceTypeEClass, ExternalReferenceType.class, "ExternalReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalReferenceType_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1, ExternalReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalReferenceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ExternalReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileTypeEClass, FileType.class, "FileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaObjRefTypeEClass, JavaObjRefType.class, "JavaObjRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaObjRefType_TargetJava(), theCommonPackage.getTargetJavaType(), null, "targetJava", null, 1, 1, JavaObjRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longTypeEClass, LongType.class, "LongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memberTypeEClass, MemberType.class, "MemberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemberType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberType_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberType_Type(), this.getBEType(), null, "type", null, 1, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberType_MetaInfo(), theCommonPackage.getMetaDataInfoType(), null, "metaInfo", null, 0, -1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberType_Accessible(), theXMLTypePackage.getBoolean(), "accessible", "true", 0, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberType_Modifiable(), theXMLTypePackage.getBoolean(), "modifiable", "true", 0, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberType_Transient(), theXMLTypePackage.getBoolean(), "transient", "false", 0, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberType_CollectionRefEntityName(), theXMLTypePackage.getString(), "refEntity", null, 0, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberType_MapKeyType(), theXMLTypePackage.getString(), "keyType", null, 0, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberWebServiceMappingTypeEClass, MemberWebServiceMappingType.class, "MemberWebServiceMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemberWebServiceMappingType_CollectionWrapped(), theXMLTypePackage.getBoolean(), "collectionWrapped", "true", 0, 1, MemberWebServiceMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberWebServiceMappingType_Ignore(), theXMLTypePackage.getBoolean(), "ignore", "false", 0, 1, MemberWebServiceMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberWebServiceMappingType_MappedName(), theXMLTypePackage.getString(), "mappedName", null, 0, 1, MemberWebServiceMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberWebServiceMappingType_Style(), this.getStyleType(), "style", "element", 0, 1, MemberWebServiceMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectRefTypeEClass, ObjectRefType.class, "ObjectRefType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(persistentConfigTypeEClass, PersistentConfigType.class, "PersistentConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistentConfigType_SupportedPersistenceType(), this.getPersistenceTypeType(), "supportedPersistenceType", null, 1, 1, PersistentConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistentConfigType_PrimaryKeyMember(), theXMLTypePackage.getString(), "primaryKeyMember", null, 0, -1, PersistentConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceObjectTypeEClass, ReferenceObjectType.class, "ReferenceObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceObjectType_RefType(), theCommonPackage.getTargetEntityType(), null, "refType", null, 1, 1, ReferenceObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceObjectType_RefFieldName(), theXMLTypePackage.getString(), "refFieldName", null, 1, -1, ReferenceObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceObjectType_FieldName(), theXMLTypePackage.getString(), "fieldName", null, 1, -1, ReferenceObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceObjectType_TimeFieldName(), theXMLTypePackage.getString(), "timeFieldName", null, 0, 1, ReferenceObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceObjectType_MustHave(), theXMLTypePackage.getBoolean(), "mustHave", "false", 0, 1, ReferenceObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceObjectType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ReferenceObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationConstraintTypeEClass, RelationConstraintType.class, "RelationConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationConstraintType_Value(), theCommonPackage.getExpressionType(), null, "value", null, 1, 1, RelationConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationConstraintType_IsEntity2(), theXMLTypePackage.getBoolean(), "isEntity2", null, 0, 1, RelationConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationConstraintType_RelationName(), theXMLTypePackage.getString(), "relationName", null, 1, 1, RelationConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationKeyTypeEClass, RelationKeyType.class, "RelationKeyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationKeyType_FieldName(), theXMLTypePackage.getString(), "fieldName", null, 1, 1, RelationKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationKeyType_IsEntity2(), theXMLTypePackage.getBoolean(), "isEntity2", null, 0, 1, RelationKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationKeyType_RelationName(), theXMLTypePackage.getString(), "relationName", null, 1, 1, RelationKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchMethodTypeEClass, SearchMethodType.class, "SearchMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchMethodType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SearchMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearchMethodType_Query(), theCommonPackage.getTargetEntityType(), null, "query", null, 1, 1, SearchMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchMethodType_ConditionMappingName(), theXMLTypePackage.getString(), "conditionMappingName", null, 1, 1, SearchMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeTypeEClass, TimeType.class, "TimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validatorConfigTypeEClass, ValidatorConfigType.class, "ValidatorConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidatorConfigType_DummyField(), this.getDummyFieldType(), null, "dummyField", null, 0, -1, ValidatorConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidatorConfigType_ReferenceConfig(), this.getReferenceObjectType(), null, "referenceConfig", null, 0, -1, ValidatorConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidatorConfigType_ExternalReferenceConfig(), this.getExternalReferenceType(), null, "externalReferenceConfig", null, 0, -1, ValidatorConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(persistenceTypeTypeEEnum, PersistenceTypeType.class, "PersistenceTypeType");
		addEEnumLiteral(persistenceTypeTypeEEnum, PersistenceTypeType.RDB);
		addEEnumLiteral(persistenceTypeTypeEEnum, PersistenceTypeType.XML);
		addEEnumLiteral(persistenceTypeTypeEEnum, PersistenceTypeType.LDAP);
		addEEnumLiteral(persistenceTypeTypeEEnum, PersistenceTypeType.MEM);

		initEEnum(relationTypeTypeEEnum, RelationTypeType.class, "RelationTypeType");
		addEEnumLiteral(relationTypeTypeEEnum, RelationTypeType.ONE2_ONE);
		addEEnumLiteral(relationTypeTypeEEnum, RelationTypeType.ONE2_N);
		addEEnumLiteral(relationTypeTypeEEnum, RelationTypeType.N2_ONE);
		addEEnumLiteral(relationTypeTypeEEnum, RelationTypeType.N2N);

		initEEnum(styleTypeEEnum, StyleType.class, "StyleType");
		addEEnumLiteral(styleTypeEEnum, StyleType.ATTRIBUTE);
		addEEnumLiteral(styleTypeEEnum, StyleType.ELEMENT);

		// Initialize data types
		initEDataType(persistenceTypeTypeObjectEDataType, PersistenceTypeType.class, "PersistenceTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationTypeTypeObjectEDataType, RelationTypeType.class, "RelationTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleTypeObjectEDataType, StyleType.class, "StyleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (beCollectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BECollectionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBECollectionType_ElementType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "elementType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (beComplexTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BEComplexType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (beDiagramTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BEDiagramType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBEDiagramType_BeEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "beEntity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBEDiagramType_CeEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ceEntity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBEDiagramType_BePackage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bePackage"
		   });		
		addAnnotation
		  (getBEDiagramType_CePackage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cePackage"
		   });		
		addAnnotation
		  (getBEDiagramType_DiagramPackage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "diagramPackage"
		   });		
		addAnnotation
		  (beListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BEListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (beMapTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BEMapType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBEMapType_KeyType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keyType",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (beObjRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BEObjRefType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBEObjRefType_TargetEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "targetEntity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBEObjRefType_AutoVersionUpdate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoVersionUpdate"
		   });		
		addAnnotation
		  (bePrimitiveTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BEPrimitiveType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (beSetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BESetType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (beTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BEType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (binaryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BinaryType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BooleanType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (businessEntityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BusinessEntityType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBusinessEntityType_ParentObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parentObject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessEntityType_Member(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "member",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessEntityType_PersistentConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "persistentConfig",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessEntityType_ValidatorConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "validatorConfig",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessEntityType_SearchMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "searchMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessEntityType_Abbreviation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "abbreviation"
		   });		
		addAnnotation
		  (getBusinessEntityType_Extensible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extensible"
		   });		
		addAnnotation
		  (getBusinessEntityType_NeedEquals(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "needEquals"
		   });		
		addAnnotation
		  (getBusinessEntityType_NeedHistory(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "needHistory"
		   });			
		addAnnotation
		  (getBusinessEntityType_Parent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parent"
		   });	
		addAnnotation
		  (ceObjRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CEObjRefType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCEObjRefType_TargetEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "targetEntity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (constantEntityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConstantEntityType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getConstantEntityType_EffTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "effTime",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstantEntityType_ExpTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "expTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConstantEntityType_ConstantValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constantValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (constantValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConstantValueType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConstantValueType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstantValueType_I18nKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "i18nKey",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConstantValueType_IntValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "intValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConstantValueType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstantValueType_EffTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "effTime",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstantValueType_ExpTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "expTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConstantValueType_Passivated(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "passivated",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConstantValueType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "priority",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dateTimeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DateTimeType",
			 "kind", "empty"
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
		  (getDocumentRoot_BEDiagram(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BEDiagram",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BusinessEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessEntity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ConstantEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConstantEntity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (doubleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DoubleType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (dummyFieldTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DummyFieldType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDummyFieldType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDummyFieldType_RefDummyFieldName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refDummyFieldName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDummyFieldType_DummyFieldName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dummyFieldName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (entityNameWebServiceMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EntityNameWebServiceMappingType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEntityNameWebServiceMappingType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mappedName"
		   });		
		addAnnotation
		  (getEntityNameWebServiceMappingType_NamespaceURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namespaceURI"
		   });		
		addAnnotation
		  (entityRelationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EntityRelationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntityRelationType_Entity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityRelationType_Entity2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity2",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityRelationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getEntityRelationType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority"
		   });		
		addAnnotation
		  (getEntityRelationType_RefedName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "refedName"
		   });		
		addAnnotation
		  (getEntityRelationType_RefedPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "refedPriority"
		   });		
		addAnnotation
		  (getEntityRelationType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (externalReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExternalReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExternalReferenceType_Expression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "expression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExternalReferenceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (fileTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FileType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (intTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IntType",
			 "kind", "empty"
		   });			
		addAnnotation
		  (javaObjRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "JavaObjRefType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getJavaObjRefType_TargetJava(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "targetJava",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (longTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LongType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (memberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MemberType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMemberType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemberType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMemberType_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defaultValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemberType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemberType_MetaInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metaInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemberType_Accessible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accessible"
		   });		
		addAnnotation
		  (getMemberType_Modifiable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modifiable"
		   });		
		addAnnotation
		  (getMemberType_Transient(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transient"
		   });	
		/**
		addAnnotation
		  (getMemberType_CollectionRefEntityName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "refEntity"
		   });	
	   addAnnotation
		  (getMemberType_MapKeyType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keyType"
		   });
		 */
		addAnnotation
		  (memberWebServiceMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MemberWebServiceMappingType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMemberWebServiceMappingType_CollectionWrapped(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "collectionWrapped"
		   });		
		addAnnotation
		  (getMemberWebServiceMappingType_Ignore(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ignore"
		   });		
		addAnnotation
		  (getMemberWebServiceMappingType_MappedName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mappedName"
		   });		
		addAnnotation
		  (getMemberWebServiceMappingType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (objectRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ObjectRefType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (persistenceTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PersistenceTypeType"
		   });		
		addAnnotation
		  (persistenceTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PersistenceTypeType:Object",
			 "baseType", "PersistenceTypeType"
		   });		
		addAnnotation
		  (persistentConfigTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PersistentConfigType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersistentConfigType_SupportedPersistenceType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supportedPersistenceType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistentConfigType_PrimaryKeyMember(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "primaryKeyMember",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (referenceObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReferenceObjectType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReferenceObjectType_RefType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceObjectType_RefFieldName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refFieldName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceObjectType_FieldName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fieldName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceObjectType_TimeFieldName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "timeFieldName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceObjectType_MustHave(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mustHave"
		   });		
		addAnnotation
		  (getReferenceObjectType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (relationConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RelationConstraintType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRelationConstraintType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRelationConstraintType_IsEntity2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isEntity2"
		   });		
		addAnnotation
		  (getRelationConstraintType_RelationName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationName"
		   });		
		addAnnotation
		  (relationKeyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RelationKeyType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRelationKeyType_FieldName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fieldName"
		   });		
		addAnnotation
		  (getRelationKeyType_IsEntity2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isEntity2"
		   });		
		addAnnotation
		  (getRelationKeyType_RelationName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationName"
		   });		
		addAnnotation
		  (relationTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "RelationTypeType"
		   });		
		addAnnotation
		  (relationTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RelationTypeType:Object",
			 "baseType", "RelationTypeType"
		   });		
		addAnnotation
		  (searchMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SearchMethodType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSearchMethodType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSearchMethodType_Query(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSearchMethodType_ConditionMappingName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conditionMappingName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (stringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StringType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (styleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "style_._type"
		   });		
		addAnnotation
		  (styleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "style_._type:Object",
			 "baseType", "style_._type"
		   });		
		addAnnotation
		  (timeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimeType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (validatorConfigTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ValidatorConfigType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getValidatorConfigType_DummyField(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dummyField",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getValidatorConfigType_ReferenceConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "referenceConfig",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getValidatorConfigType_ExternalReferenceConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalReferenceConfig",
			 "namespace", "##targetNamespace"
		   });
	}

} //BEDiagramPackageImpl
