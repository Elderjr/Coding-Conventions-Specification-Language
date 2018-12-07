/**
 */
package codingConvention.filters.impl;

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

import codingConvention.filters.AtomicFilter;
import codingConvention.filters.CompositeFilter;
import codingConvention.filters.Filter;
import codingConvention.filters.FilterOperation;
import codingConvention.filters.FiltersFactory;
import codingConvention.filters.FiltersPackage;
import codingConvention.filters.PropertyFilter;
import codingConvention.filters.TemplateFilter;

import codingConvention.impl.CodingConventionPackageImpl;

import codingConvention.values.ValuesPackage;

import codingConvention.values.impl.ValuesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	private EClass compositeFilterEClass = null;

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
	private EEnum filterOperationEEnum = null;

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
	 * @see codingConvention.filters.FiltersPackage#eNS_URI
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
		CodingConventionPackageImpl theCodingConventionPackage = (CodingConventionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CodingConventionPackage.eNS_URI) instanceof CodingConventionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CodingConventionPackage.eNS_URI)
						: CodingConventionPackage.eINSTANCE);
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
		theFiltersPackage.createPackageContents();
		theCodingConventionPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theFiltersPackage.initializePackageContents();
		theCodingConventionPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

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
	public EAttribute getCompositeFilter_NewAttribute() {
		return (EAttribute) compositeFilterEClass.getEStructuralFeatures().get(1);
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
	public EReference getAtomicFilter_Target() {
		return (EReference) atomicFilterEClass.getEStructuralFeatures().get(0);
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
	public EReference getPropertyFilter_Property() {
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
	public EEnum getFilterOperation() {
		return filterOperationEEnum;
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

		compositeFilterEClass = createEClass(COMPOSITE_FILTER);
		createEReference(compositeFilterEClass, COMPOSITE_FILTER__FILTER);
		createEAttribute(compositeFilterEClass, COMPOSITE_FILTER__NEW_ATTRIBUTE);

		atomicFilterEClass = createEClass(ATOMIC_FILTER);
		createEReference(atomicFilterEClass, ATOMIC_FILTER__TARGET);

		propertyFilterEClass = createEClass(PROPERTY_FILTER);
		createEReference(propertyFilterEClass, PROPERTY_FILTER__PROPERTY);

		templateFilterEClass = createEClass(TEMPLATE_FILTER);
		createEReference(templateFilterEClass, TEMPLATE_FILTER__TEMPLATE);

		// Create enums
		filterOperationEEnum = createEEnum(FILTER_OPERATION);
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
		PropertiesPackage thePropertiesPackage = (PropertiesPackage) EPackage.Registry.INSTANCE
				.getEPackage(PropertiesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeFilterEClass.getESuperTypes().add(this.getFilter());
		atomicFilterEClass.getESuperTypes().add(this.getFilter());
		propertyFilterEClass.getESuperTypes().add(this.getAtomicFilter());
		templateFilterEClass.getESuperTypes().add(this.getAtomicFilter());

		// Initialize classes, features, and operations; add parameters
		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_Negated(), theXMLTypePackage.getBoolean(), "negated", null, 0, 1, Filter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeFilterEClass, CompositeFilter.class, "CompositeFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeFilter_Filter(), this.getFilter(), null, "filter", null, 0, -1,
				CompositeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeFilter_NewAttribute(), this.getFilterOperation(), "newAttribute", null, 0, 1,
				CompositeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(atomicFilterEClass, AtomicFilter.class, "AtomicFilter", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicFilter_Target(), theElementsPackage.getElement(), null, "target", null, 1, 1,
				AtomicFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyFilterEClass, PropertyFilter.class, "PropertyFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyFilter_Property(), thePropertiesPackage.getProperty(), null, "property", null, 1, 1,
				PropertyFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateFilterEClass, TemplateFilter.class, "TemplateFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateFilter_Template(), theElementsPackage.getElement(), null, "template", null, 1, 1,
				TemplateFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(filterOperationEEnum, FilterOperation.class, "FilterOperation");
		addEEnumLiteral(filterOperationEEnum, FilterOperation.AND);
		addEEnumLiteral(filterOperationEEnum, FilterOperation.OR);
		addEEnumLiteral(filterOperationEEnum, FilterOperation.IF);
	}

} //FiltersPackageImpl
