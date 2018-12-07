/**
 */
package codingConvention.values.impl;

import codingConvention.CodingConventionPackage;

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

import codingConvention.impl.CodingConventionPackageImpl;

import codingConvention.values.LiteralValue;
import codingConvention.values.ReferencedValue;
import codingConvention.values.Value;
import codingConvention.values.ValuesFactory;
import codingConvention.values.ValuesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuesPackageImpl extends EPackageImpl implements ValuesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalValueEClass = null;

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
	 * @see codingConvention.values.ValuesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValuesPackageImpl() {
		super(eNS_URI, ValuesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValuesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValuesPackage init() {
		if (isInited)
			return (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Obtain or create and register package
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ValuesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

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
		TypesPackageImpl theTypesPackage = (TypesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI)
						: TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theValuesPackage.createPackageContents();
		theCodingConventionPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theValuesPackage.initializePackageContents();
		theCodingConventionPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValuesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValuesPackage.eNS_URI, theValuesPackage);
		return theValuesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedValue() {
		return referencedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencedValue_Type() {
		return (EReference) referencedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralValue() {
		return literalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralValue_Type() {
		return (EReference) literalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralValue_Value() {
		return (EAttribute) literalValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesFactory getValuesFactory() {
		return (ValuesFactory) getEFactoryInstance();
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
		valueEClass = createEClass(VALUE);

		referencedValueEClass = createEClass(REFERENCED_VALUE);
		createEReference(referencedValueEClass, REFERENCED_VALUE__TYPE);

		literalValueEClass = createEClass(LITERAL_VALUE);
		createEReference(literalValueEClass, LITERAL_VALUE__TYPE);
		createEAttribute(literalValueEClass, LITERAL_VALUE__VALUE);
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
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		referencedValueEClass.getESuperTypes().add(this.getValue());
		literalValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referencedValueEClass, ReferencedValue.class, "ReferencedValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencedValue_Type(), theTypesPackage.getComplexType(), null, "type", null, 0, 1,
				ReferencedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalValueEClass, LiteralValue.class, "LiteralValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralValue_Type(), theTypesPackage.getPrimitiveType(), null, "type", null, 0, 1,
				LiteralValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteralValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, LiteralValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ValuesPackageImpl
