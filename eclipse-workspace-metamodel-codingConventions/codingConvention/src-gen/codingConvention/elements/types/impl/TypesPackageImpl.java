/**
 */
package codingConvention.elements.types.impl;

import codingConvention.CodingConventionPackage;

import codingConvention.elements.ElementsPackage;

import codingConvention.elements.impl.ElementsPackageImpl;

import codingConvention.elements.namedElements.NamedElementsPackage;

import codingConvention.elements.namedElements.impl.NamedElementsPackageImpl;

import codingConvention.elements.properties.PropertiesPackage;

import codingConvention.elements.properties.impl.PropertiesPackageImpl;

import codingConvention.elements.statements.StatementsPackage;

import codingConvention.elements.statements.impl.StatementsPackageImpl;

import codingConvention.elements.types.ComplexType;
import codingConvention.elements.types.DataType;
import codingConvention.elements.types.PrimitiveType;
import codingConvention.elements.types.TypesFactory;
import codingConvention.elements.types.TypesPackage;

import codingConvention.filters.FiltersPackage;

import codingConvention.filters.impl.FiltersPackageImpl;

import codingConvention.impl.CodingConventionPackageImpl;

import codingConvention.values.ValuesPackage;

import codingConvention.values.impl.ValuesPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

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
	 * @see codingConvention.elements.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited)
			return (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new TypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CodingConventionPackageImpl theCodingConventionPackage = (CodingConventionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CodingConventionPackage.eNS_URI) instanceof CodingConventionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CodingConventionPackage.eNS_URI)
						: CodingConventionPackage.eINSTANCE);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI)
						: FiltersPackage.eINSTANCE);
		ElementsPackageImpl theElementsPackage = (ElementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI) instanceof ElementsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI)
						: ElementsPackage.eINSTANCE);
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI)
						: PropertiesPackage.eINSTANCE);
		NamedElementsPackageImpl theNamedElementsPackage = (NamedElementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI) instanceof NamedElementsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(NamedElementsPackage.eNS_URI)
						: NamedElementsPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI)
						: StatementsPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI)
						: ValuesPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theCodingConventionPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theCodingConventionPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dataTypeEClass = createEClass(DATA_TYPE);

		complexTypeEClass = createEClass(COMPLEX_TYPE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NamedElementsPackage theNamedElementsPackage = (NamedElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		complexTypeEClass.getESuperTypes().add(this.getDataType());
		complexTypeEClass.getESuperTypes().add(theNamedElementsPackage.getNamedElement());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //TypesPackageImpl
