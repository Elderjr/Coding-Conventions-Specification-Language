/**
 */
package codingConvention.impl;

import codingConvention.CodingConventionFactory;
import codingConvention.CodingConventionPackage;
import codingConvention.Rule;

import codingConvention.elements.ElementsPackage;

import codingConvention.elements.impl.ElementsPackageImpl;

import codingConvention.elements.namedElements.NamedElementsPackage;

import codingConvention.elements.namedElements.impl.NamedElementsPackageImpl;

import codingConvention.elements.properties.PropertiesPackage;

import codingConvention.elements.properties.impl.PropertiesPackageImpl;

import codingConvention.elements.statements.StatementsPackage;

import codingConvention.elements.statements.impl.StatementsPackageImpl;

import codingConvention.elements.types.TypesPackage;

import codingConvention.elements.types.impl.TypesPackageImpl;

import codingConvention.filters.FiltersPackage;

import codingConvention.filters.impl.FiltersPackageImpl;

import codingConvention.values.ValuesPackage;

import codingConvention.values.impl.ValuesPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodingConventionPackageImpl extends EPackageImpl implements CodingConventionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

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
	 * @see codingConvention.CodingConventionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodingConventionPackageImpl() {
		super(eNS_URI, CodingConventionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodingConventionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodingConventionPackage init() {
		if (isInited)
			return (CodingConventionPackage) EPackage.Registry.INSTANCE.getEPackage(CodingConventionPackage.eNS_URI);

		// Obtain or create and register package
		CodingConventionPackageImpl theCodingConventionPackage = (CodingConventionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CodingConventionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CodingConventionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
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
		TypesPackageImpl theTypesPackage = (TypesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI)
						: TypesPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI)
						: ValuesPackage.eINSTANCE);

		// Create package meta-data objects
		theCodingConventionPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theCodingConventionPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodingConventionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodingConventionPackage.eNS_URI, theCodingConventionPackage);
		return theCodingConventionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_MatchElements() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Filters() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingConventionFactory getCodingConventionFactory() {
		return (CodingConventionFactory) getEFactoryInstance();
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
		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__MATCH_ELEMENTS);
		createEReference(ruleEClass, RULE__FILTERS);
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
		FiltersPackage theFiltersPackage = (FiltersPackage) EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI);
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFiltersPackage);
		getESubpackages().add(theElementsPackage);
		getESubpackages().add(theValuesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_MatchElements(), theElementsPackage.getElement(), null, "matchElements", null, 1, -1,
				Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Filters(), theFiltersPackage.getFilter(), null, "filters", null, 0, -1, Rule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CodingConventionPackageImpl
