/**
 */
package codingConvention.elements.statements.impl;

import codingConvention.CodingConventionPackage;

import codingConvention.elements.ElementsPackage;

import codingConvention.elements.impl.ElementsPackageImpl;

import codingConvention.elements.namedElements.NamedElementsPackage;

import codingConvention.elements.namedElements.impl.NamedElementsPackageImpl;

import codingConvention.elements.properties.PropertiesPackage;

import codingConvention.elements.properties.impl.PropertiesPackageImpl;

import codingConvention.elements.statements.AccessModifier;
import codingConvention.elements.statements.Body;
import codingConvention.elements.statements.CatchClause;
import codingConvention.elements.statements.ExceptionHandling;
import codingConvention.elements.statements.FinallyClause;
import codingConvention.elements.statements.JavaExceptionHandling;
import codingConvention.elements.statements.MethodChaining;
import codingConvention.elements.statements.MethodInvocation;
import codingConvention.elements.statements.Statement;
import codingConvention.elements.statements.StatementsFactory;
import codingConvention.elements.statements.StatementsPackage;
import codingConvention.elements.statements.TryClause;

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
public class StatementsPackageImpl extends EPackageImpl implements StatementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodChainingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaExceptionHandlingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finallyClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryClauseEClass = null;

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
	 * @see codingConvention.elements.statements.StatementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatementsPackageImpl() {
		super(eNS_URI, StatementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatementsPackage init() {
		if (isInited)
			return (StatementsPackage) EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);

		// Obtain or create and register package
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new StatementsPackageImpl());

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
		TypesPackageImpl theTypesPackage = (TypesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI)
						: TypesPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI)
						: ValuesPackage.eINSTANCE);

		// Create package meta-data objects
		theStatementsPackage.createPackageContents();
		theCodingConventionPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theStatementsPackage.initializePackageContents();
		theCodingConventionPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatementsPackage.eNS_URI, theStatementsPackage);
		return theStatementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodInvocation() {
		return methodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodInvocation_From() {
		return (EReference) methodInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodInvocation_To() {
		return (EReference) methodInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodInvocation_Arguments() {
		return (EReference) methodInvocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodChaining() {
		return methodChainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodChaining_Invocations() {
		return (EReference) methodChainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessModifier() {
		return accessModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessModifier_Element() {
		return (EReference) accessModifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandling() {
		return exceptionHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBody() {
		return bodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_Statements() {
		return (EReference) bodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaExceptionHandling() {
		return javaExceptionHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaExceptionHandling_FinallyClause() {
		return (EReference) javaExceptionHandlingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaExceptionHandling_CatchClause() {
		return (EReference) javaExceptionHandlingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaExceptionHandling_TryClause() {
		return (EReference) javaExceptionHandlingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchClause() {
		return catchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchClause_ExceptionHandled() {
		return (EReference) catchClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinallyClause() {
		return finallyClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTryClause() {
		return tryClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsFactory getStatementsFactory() {
		return (StatementsFactory) getEFactoryInstance();
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
		statementEClass = createEClass(STATEMENT);

		methodInvocationEClass = createEClass(METHOD_INVOCATION);
		createEReference(methodInvocationEClass, METHOD_INVOCATION__FROM);
		createEReference(methodInvocationEClass, METHOD_INVOCATION__TO);
		createEReference(methodInvocationEClass, METHOD_INVOCATION__ARGUMENTS);

		methodChainingEClass = createEClass(METHOD_CHAINING);
		createEReference(methodChainingEClass, METHOD_CHAINING__INVOCATIONS);

		accessModifierEClass = createEClass(ACCESS_MODIFIER);
		createEReference(accessModifierEClass, ACCESS_MODIFIER__ELEMENT);

		exceptionHandlingEClass = createEClass(EXCEPTION_HANDLING);

		bodyEClass = createEClass(BODY);
		createEReference(bodyEClass, BODY__STATEMENTS);

		javaExceptionHandlingEClass = createEClass(JAVA_EXCEPTION_HANDLING);
		createEReference(javaExceptionHandlingEClass, JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE);
		createEReference(javaExceptionHandlingEClass, JAVA_EXCEPTION_HANDLING__CATCH_CLAUSE);
		createEReference(javaExceptionHandlingEClass, JAVA_EXCEPTION_HANDLING__TRY_CLAUSE);

		catchClauseEClass = createEClass(CATCH_CLAUSE);
		createEReference(catchClauseEClass, CATCH_CLAUSE__EXCEPTION_HANDLED);

		finallyClauseEClass = createEClass(FINALLY_CLAUSE);

		tryClauseEClass = createEClass(TRY_CLAUSE);
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
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI);
		NamedElementsPackage theNamedElementsPackage = (NamedElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		statementEClass.getESuperTypes().add(theElementsPackage.getElement());
		methodInvocationEClass.getESuperTypes().add(this.getStatement());
		methodChainingEClass.getESuperTypes().add(this.getStatement());
		accessModifierEClass.getESuperTypes().add(this.getStatement());
		exceptionHandlingEClass.getESuperTypes().add(this.getStatement());
		bodyEClass.getESuperTypes().add(this.getStatement());
		javaExceptionHandlingEClass.getESuperTypes().add(this.getExceptionHandling());
		catchClauseEClass.getESuperTypes().add(this.getBody());
		finallyClauseEClass.getESuperTypes().add(this.getBody());
		tryClauseEClass.getESuperTypes().add(this.getBody());

		// Initialize classes, features, and operations; add parameters
		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodInvocationEClass, MethodInvocation.class, "MethodInvocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodInvocation_From(), theNamedElementsPackage.getNamedElement(), null, "from", null, 0, 1,
				MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodInvocation_To(), theNamedElementsPackage.getNamedElement(), null, "to", null, 0, 1,
				MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodInvocation_Arguments(), this.getStatement(), null, "arguments", null, 0, -1,
				MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodChainingEClass, MethodChaining.class, "MethodChaining", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodChaining_Invocations(), this.getMethodInvocation(), null, "invocations", null, 0, -1,
				MethodChaining.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessModifierEClass, AccessModifier.class, "AccessModifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessModifier_Element(), theNamedElementsPackage.getNamedElement(), null, "element", null, 0,
				1, AccessModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionHandlingEClass, ExceptionHandling.class, "ExceptionHandling", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodyEClass, Body.class, "Body", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBody_Statements(), this.getStatement(), null, "statements", null, 0, -1, Body.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaExceptionHandlingEClass, JavaExceptionHandling.class, "JavaExceptionHandling", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaExceptionHandling_FinallyClause(), this.getFinallyClause(), null, "finallyClause", null,
				0, 1, JavaExceptionHandling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaExceptionHandling_CatchClause(), this.getCatchClause(), null, "catchClause", null, 0, -1,
				JavaExceptionHandling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaExceptionHandling_TryClause(), this.getTryClause(), null, "tryClause", null, 0, 1,
				JavaExceptionHandling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catchClauseEClass, CatchClause.class, "CatchClause", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatchClause_ExceptionHandled(), theNamedElementsPackage.getException(), null,
				"exceptionHandled", null, 0, -1, CatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finallyClauseEClass, FinallyClause.class, "FinallyClause", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tryClauseEClass, TryClause.class, "TryClause", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //StatementsPackageImpl
