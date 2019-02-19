/**
 */
package codingConvetionMetamodel.filters.impl;

import codingConvetionMetamodel.CodingConventionsMetamodelPackage;

import codingConvetionMetamodel.elements.ElementsPackage;

import codingConvetionMetamodel.elements.datatype.DatatypePackage;

import codingConvetionMetamodel.elements.datatype.impl.DatatypePackageImpl;

import codingConvetionMetamodel.elements.impl.ElementsPackageImpl;

import codingConvetionMetamodel.elements.namedElements.NamedElementsPackage;

import codingConvetionMetamodel.elements.namedElements.impl.NamedElementsPackageImpl;

import codingConvetionMetamodel.elements.statements.StatementsPackage;

import codingConvetionMetamodel.elements.statements.impl.StatementsPackageImpl;

import codingConvetionMetamodel.filters.AtomicFilter;
import codingConvetionMetamodel.filters.CompositeFilter;
import codingConvetionMetamodel.filters.CountBlockStatementsFilter;
import codingConvetionMetamodel.filters.DefinesMethod;
import codingConvetionMetamodel.filters.EqualsNamedElement;
import codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals;
import codingConvetionMetamodel.filters.Filter;
import codingConvetionMetamodel.filters.FiltersFactory;
import codingConvetionMetamodel.filters.FiltersPackage;
import codingConvetionMetamodel.filters.PropertyFilter;
import codingConvetionMetamodel.filters.RegexLiteralValueFilter;
import codingConvetionMetamodel.filters.TemplateFilter;

import codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl;

import codingConvetionMetamodel.java.JavaPackage;

import codingConvetionMetamodel.java.impl.JavaPackageImpl;

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
public class FiltersPackageImpl extends EPackageImpl implements FiltersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definesMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regexLiteralValueFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countBlockStatementsFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsNamedElementWithLiteralsEClass = null;

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
	 * @see codingConvetionMetamodel.filters.FiltersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FiltersPackageImpl() {
		super(eNS_URI, FiltersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FiltersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FiltersPackage init() {
		if (isInited)
			return (FiltersPackage) EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI);

		// Obtain or create and register package
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FiltersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new FiltersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CodingConventionsMetamodelPackageImpl theCodingConventionsMetamodelPackage = (CodingConventionsMetamodelPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CodingConventionsMetamodelPackage.eNS_URI) instanceof CodingConventionsMetamodelPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CodingConventionsMetamodelPackage.eNS_URI)
						: CodingConventionsMetamodelPackage.eINSTANCE);
		ElementsPackageImpl theElementsPackage = (ElementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI) instanceof ElementsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI)
						: ElementsPackage.eINSTANCE);
		NamedElementsPackageImpl theNamedElementsPackage = (NamedElementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI) instanceof NamedElementsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(NamedElementsPackage.eNS_URI)
						: NamedElementsPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI)
						: StatementsPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI)
						: DatatypePackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI)
						: JavaPackage.eINSTANCE);

		// Create package meta-data objects
		theFiltersPackage.createPackageContents();
		theCodingConventionsMetamodelPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theJavaPackage.createPackageContents();

		// Initialize created meta-data
		theFiltersPackage.initializePackageContents();
		theCodingConventionsMetamodelPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theJavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFiltersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FiltersPackage.eNS_URI, theFiltersPackage);
		return theFiltersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Negated() {
		return (EAttribute) filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicFilter() {
		return atomicFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicFilter_Targets() {
		return (EReference) atomicFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeFilter() {
		return compositeFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeFilter_Filter() {
		return (EReference) compositeFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeFilter_Operator() {
		return (EAttribute) compositeFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyFilter() {
		return propertyFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyFilter_Properties() {
		return (EReference) propertyFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateFilter() {
		return templateFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateFilter_Template() {
		return (EReference) templateFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateFilter_Exact() {
		return (EAttribute) templateFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinesMethod() {
		return definesMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinesMethod_Methods() {
		return (EReference) definesMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualsNamedElement() {
		return equalsNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqualsNamedElement_Elements() {
		return (EReference) equalsNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqualsNamedElement_IgnoreCase() {
		return (EAttribute) equalsNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegexLiteralValueFilter() {
		return regexLiteralValueFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegexLiteralValueFilter_Regex() {
		return (EAttribute) regexLiteralValueFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountBlockStatementsFilter() {
		return countBlockStatementsFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountBlockStatementsFilter_Count() {
		return (EAttribute) countBlockStatementsFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountBlockStatementsFilter_Operator() {
		return (EAttribute) countBlockStatementsFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualsNamedElementWithLiterals() {
		return equalsNamedElementWithLiteralsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqualsNamedElementWithLiterals_Names() {
		return (EAttribute) equalsNamedElementWithLiteralsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqualsNamedElementWithLiterals_IgnoreCase() {
		return (EAttribute) equalsNamedElementWithLiteralsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersFactory getFiltersFactory() {
		return (FiltersFactory) getEFactoryInstance();
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
		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__NEGATED);

		atomicFilterEClass = createEClass(ATOMIC_FILTER);
		createEReference(atomicFilterEClass, ATOMIC_FILTER__TARGETS);

		compositeFilterEClass = createEClass(COMPOSITE_FILTER);
		createEReference(compositeFilterEClass, COMPOSITE_FILTER__FILTER);
		createEAttribute(compositeFilterEClass, COMPOSITE_FILTER__OPERATOR);

		propertyFilterEClass = createEClass(PROPERTY_FILTER);
		createEReference(propertyFilterEClass, PROPERTY_FILTER__PROPERTIES);

		templateFilterEClass = createEClass(TEMPLATE_FILTER);
		createEReference(templateFilterEClass, TEMPLATE_FILTER__TEMPLATE);
		createEAttribute(templateFilterEClass, TEMPLATE_FILTER__EXACT);

		definesMethodEClass = createEClass(DEFINES_METHOD);
		createEReference(definesMethodEClass, DEFINES_METHOD__METHODS);

		equalsNamedElementEClass = createEClass(EQUALS_NAMED_ELEMENT);
		createEReference(equalsNamedElementEClass, EQUALS_NAMED_ELEMENT__ELEMENTS);
		createEAttribute(equalsNamedElementEClass, EQUALS_NAMED_ELEMENT__IGNORE_CASE);

		regexLiteralValueFilterEClass = createEClass(REGEX_LITERAL_VALUE_FILTER);
		createEAttribute(regexLiteralValueFilterEClass, REGEX_LITERAL_VALUE_FILTER__REGEX);

		countBlockStatementsFilterEClass = createEClass(COUNT_BLOCK_STATEMENTS_FILTER);
		createEAttribute(countBlockStatementsFilterEClass, COUNT_BLOCK_STATEMENTS_FILTER__COUNT);
		createEAttribute(countBlockStatementsFilterEClass, COUNT_BLOCK_STATEMENTS_FILTER__OPERATOR);

		equalsNamedElementWithLiteralsEClass = createEClass(EQUALS_NAMED_ELEMENT_WITH_LITERALS);
		createEAttribute(equalsNamedElementWithLiteralsEClass, EQUALS_NAMED_ELEMENT_WITH_LITERALS__NAMES);
		createEAttribute(equalsNamedElementWithLiteralsEClass, EQUALS_NAMED_ELEMENT_WITH_LITERALS__IGNORE_CASE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI);
		CodingConventionsMetamodelPackage theCodingConventionsMetamodelPackage = (CodingConventionsMetamodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodingConventionsMetamodelPackage.eNS_URI);
		NamedElementsPackage theNamedElementsPackage = (NamedElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI);

		// Add supertypes to classes
		atomicFilterEClass.getESuperTypes().add(this.getFilter());
		compositeFilterEClass.getESuperTypes().add(this.getFilter());
		propertyFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		templateFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		definesMethodEClass.getESuperTypes().add(this.getAtomicFilter());
		equalsNamedElementEClass.getESuperTypes().add(this.getAtomicFilter());
		regexLiteralValueFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		equalsNamedElementWithLiteralsEClass.getESuperTypes().add(this.getAtomicFilter());

		// Initialize classes and features; add operations and parameters
		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_Negated(), theXMLTypePackage.getBoolean(), "negated", null, 0, 1, Filter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicFilterEClass, AtomicFilter.class, "AtomicFilter", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicFilter_Targets(), theElementsPackage.getElement(), null, "targets", null, 0, -1,
				AtomicFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeFilterEClass, CompositeFilter.class, "CompositeFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeFilter_Filter(), this.getFilter(), null, "filter", null, 1, -1,
				CompositeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeFilter_Operator(), theCodingConventionsMetamodelPackage.getLogicOperators(),
				"operator", null, 0, 1, CompositeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyFilterEClass, PropertyFilter.class, "PropertyFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyFilter_Properties(), theElementsPackage.getProperty(), null, "properties", null, 1,
				-1, PropertyFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateFilterEClass, TemplateFilter.class, "TemplateFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateFilter_Template(), theElementsPackage.getElement(), null, "template", null, 1, 1,
				TemplateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateFilter_Exact(), theXMLTypePackage.getBoolean(), "exact", null, 0, 1,
				TemplateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(definesMethodEClass, DefinesMethod.class, "DefinesMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinesMethod_Methods(), theNamedElementsPackage.getMethod(), null, "methods", null, 1, -1,
				DefinesMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalsNamedElementEClass, EqualsNamedElement.class, "EqualsNamedElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEqualsNamedElement_Elements(), theNamedElementsPackage.getNamedElement(), null, "elements",
				null, 0, -1, EqualsNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqualsNamedElement_IgnoreCase(), theXMLTypePackage.getBoolean(), "ignoreCase", "true", 0, 1,
				EqualsNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(regexLiteralValueFilterEClass, RegexLiteralValueFilter.class, "RegexLiteralValueFilter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegexLiteralValueFilter_Regex(), theXMLTypePackage.getString(), "regex", null, 0, 1,
				RegexLiteralValueFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countBlockStatementsFilterEClass, CountBlockStatementsFilter.class, "CountBlockStatementsFilter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountBlockStatementsFilter_Count(), theXMLTypePackage.getInt(), "count", null, 0, 1,
				CountBlockStatementsFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountBlockStatementsFilter_Operator(), theXMLTypePackage.getString(), "operator", null, 0, 1,
				CountBlockStatementsFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalsNamedElementWithLiteralsEClass, EqualsNamedElementWithLiterals.class,
				"EqualsNamedElementWithLiterals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEqualsNamedElementWithLiterals_Names(), theXMLTypePackage.getString(), "names", null, 0, 1,
				EqualsNamedElementWithLiterals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEqualsNamedElementWithLiterals_IgnoreCase(), theXMLTypePackage.getBoolean(), "ignoreCase",
				"true", 0, 1, EqualsNamedElementWithLiterals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //FiltersPackageImpl
