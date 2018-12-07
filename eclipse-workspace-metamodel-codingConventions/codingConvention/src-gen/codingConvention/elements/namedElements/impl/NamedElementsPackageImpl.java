/**
 */
package codingConvention.elements.namedElements.impl;

import codingConvention.CodingConventionPackage;

import codingConvention.elements.ElementsPackage;

import codingConvention.elements.impl.ElementsPackageImpl;

import codingConvention.elements.namedElements.Constructor;
import codingConvention.elements.namedElements.Field;
import codingConvention.elements.namedElements.Interface;
import codingConvention.elements.namedElements.Method;
import codingConvention.elements.namedElements.NamedElement;
import codingConvention.elements.namedElements.NamedElementsFactory;
import codingConvention.elements.namedElements.NamedElementsPackage;
import codingConvention.elements.namedElements.Parameter;
import codingConvention.elements.namedElements.Variable;

import codingConvention.elements.properties.PropertiesPackage;

import codingConvention.elements.properties.impl.PropertiesPackageImpl;

import codingConvention.elements.statements.StatementsPackage;

import codingConvention.elements.statements.impl.StatementsPackageImpl;

import codingConvention.elements.types.TypesPackage;

import codingConvention.elements.types.impl.TypesPackageImpl;

import codingConvention.filters.FiltersPackage;

import codingConvention.filters.impl.FiltersPackageImpl;

import codingConvention.impl.CodingConventionPackageImpl;

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
public class NamedElementsPackageImpl extends EPackageImpl implements NamedElementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

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
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NamedElementsPackageImpl() {
		super(eNS_URI, NamedElementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NamedElementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NamedElementsPackage init() {
		if (isInited)
			return (NamedElementsPackage) EPackage.Registry.INSTANCE.getEPackage(NamedElementsPackage.eNS_URI);

		// Obtain or create and register package
		NamedElementsPackageImpl theNamedElementsPackage = (NamedElementsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof NamedElementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new NamedElementsPackageImpl());

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
		theNamedElementsPackage.createPackageContents();
		theCodingConventionPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theNamedElementsPackage.initializePackageContents();
		theCodingConventionPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNamedElementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NamedElementsPackage.eNS_URI, theNamedElementsPackage);
		return theNamedElementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_InstanceMethods() {
		return (EReference) classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Attributes() {
		return (EReference) classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SubClasses() {
		return (EReference) classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClass() {
		return (EReference) classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_ClassMethods() {
		return (EReference) classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Implements() {
		return (EReference) classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_ReturnType() {
		return (EReference) methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Parameter() {
		return (EReference) methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_SubMethods() {
		return (EReference) methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_SuperMethod() {
		return (EReference) methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Throws() {
		return (EReference) methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Type() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getException() {
		return exceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_SubInterfaces() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_InterfaceeOpposite() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementsFactory getNamedElementsFactory() {
		return (NamedElementsFactory) getEFactoryInstance();
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
		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__INSTANCE_METHODS);
		createEReference(classEClass, CLASS__ATTRIBUTES);
		createEReference(classEClass, CLASS__SUB_CLASSES);
		createEReference(classEClass, CLASS__SUPER_CLASS);
		createEReference(classEClass, CLASS__CLASS_METHODS);
		createEReference(classEClass, CLASS__IMPLEMENTS);

		methodEClass = createEClass(METHOD);
		createEReference(methodEClass, METHOD__RETURN_TYPE);
		createEReference(methodEClass, METHOD__PARAMETER);
		createEReference(methodEClass, METHOD__SUB_METHODS);
		createEReference(methodEClass, METHOD__SUPER_METHOD);
		createEReference(methodEClass, METHOD__THROWS);

		namedElementEClass = createEClass(NAMED_ELEMENT);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__TYPE);

		parameterEClass = createEClass(PARAMETER);

		exceptionEClass = createEClass(EXCEPTION);

		variableEClass = createEClass(VARIABLE);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__SUB_INTERFACES);
		createEReference(interfaceEClass, INTERFACE__INTERFACEE_OPPOSITE);

		constructorEClass = createEClass(CONSTRUCTOR);
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
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classEClass.getESuperTypes().add(theTypesPackage.getComplexType());
		namedElementEClass.getESuperTypes().add(theElementsPackage.getElement());
		fieldEClass.getESuperTypes().add(this.getVariable());
		parameterEClass.getESuperTypes().add(this.getVariable());
		exceptionEClass.getESuperTypes().add(this.getClass_());
		variableEClass.getESuperTypes().add(this.getNamedElement());
		interfaceEClass.getESuperTypes().add(theTypesPackage.getComplexType());
		constructorEClass.getESuperTypes().add(this.getMethod());

		// Initialize classes, features, and operations; add parameters
		initEClass(classEClass, codingConvention.elements.namedElements.Class.class, "Class", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_InstanceMethods(), this.getMethod(), null, "instanceMethods", null, 0, -1,
				codingConvention.elements.namedElements.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Attributes(), this.getField(), null, "attributes", null, 0, -1,
				codingConvention.elements.namedElements.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SubClasses(), this.getClass_(), this.getClass_SuperClass(), "subClasses", null, 0, -1,
				codingConvention.elements.namedElements.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SuperClass(), this.getClass_(), this.getClass_SubClasses(), "superClass", null, 0, 1,
				codingConvention.elements.namedElements.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_ClassMethods(), this.getMethod(), null, "classMethods", null, 0, -1,
				codingConvention.elements.namedElements.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Implements(), this.getInterface(), null, "implements", null, 0, -1,
				codingConvention.elements.namedElements.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethod_ReturnType(), theTypesPackage.getDataType(), null, "returnType", null, 0, 1,
				Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Method.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_SubMethods(), this.getMethod(), this.getMethod_SuperMethod(), "subMethods", null, 0, 1,
				Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_SuperMethod(), this.getMethod(), this.getMethod_SubMethods(), "superMethod", null, 0,
				1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Throws(), this.getException(), null, "throws", null, 0, -1, Method.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Type(), theTypesPackage.getDataType(), null, "type", null, 0, 1, Field.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionEClass, codingConvention.elements.namedElements.Exception.class, "Exception", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_SubInterfaces(), this.getInterface(), this.getInterface_InterfaceeOpposite(),
				"subInterfaces", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_InterfaceeOpposite(), this.getInterface(), this.getInterface_SubInterfaces(),
				"interfaceeOpposite", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorEClass, Constructor.class, "Constructor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //NamedElementsPackageImpl
