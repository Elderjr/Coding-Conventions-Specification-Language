/**
 */
package ccsl.java.impl;

import ccsl.ccslPackage;

import ccsl.elements.ElementsPackage;

import ccsl.elements.datatype.DatatypePackage;

import ccsl.elements.datatype.impl.DatatypePackageImpl;

import ccsl.elements.impl.ElementsPackageImpl;

import ccsl.elements.namedElements.NamedElementsPackage;

import ccsl.elements.namedElements.impl.NamedElementsPackageImpl;

import ccsl.elements.statements.StatementsPackage;

import ccsl.elements.statements.impl.StatementsPackageImpl;

import ccsl.filters.FiltersPackage;

import ccsl.filters.impl.FiltersPackageImpl;

import ccsl.impl.ccslPackageImpl;

import ccsl.java.InstanceOf;
import ccsl.java.JCatchClause;
import ccsl.java.JConstructor;
import ccsl.java.JElement;
import ccsl.java.JFor;
import ccsl.java.JInterface;
import ccsl.java.JMethod;
import ccsl.java.JReturnStatement;
import ccsl.java.JTryCatch;
import ccsl.java.JTryClause;
import ccsl.java.JavaClass;
import ccsl.java.JavaFactory;
import ccsl.java.JavaPackage;
import ccsl.java.ThrowStatement;

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
public class JavaPackageImpl extends EPackageImpl implements JavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTryCatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTryClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jCatchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jForEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jReturnStatementEClass = null;

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
	 * @see ccsl.java.JavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaPackageImpl() {
		super(eNS_URI, JavaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaPackage init() {
		if (isInited)
			return (JavaPackage) EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Obtain or create and register package
		JavaPackageImpl theJavaPackage = (JavaPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new JavaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ccslPackageImpl theccslPackage = (ccslPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ccslPackage.eNS_URI) instanceof ccslPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ccslPackage.eNS_URI)
						: ccslPackage.eINSTANCE);
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
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI)
						: FiltersPackage.eINSTANCE);

		// Create package meta-data objects
		theJavaPackage.createPackageContents();
		theccslPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theFiltersPackage.createPackageContents();

		// Initialize created meta-data
		theJavaPackage.initializePackageContents();
		theccslPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, theJavaPackage);
		return theJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJElement() {
		return jElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaClass() {
		return javaClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaClass_NestedClasses() {
		return (EReference) javaClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaClass_Implements() {
		return (EReference) javaClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaClass_Blocks() {
		return (EReference) javaClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJInterface() {
		return jInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJMethod() {
		return jMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethod_Throws() {
		return (EReference) jMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJConstructor() {
		return jConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJTryCatch() {
		return jTryCatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTryCatch_Try() {
		return (EReference) jTryCatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTryCatch_Catches() {
		return (EReference) jTryCatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJTryClause() {
		return jTryClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTryClause_Resources() {
		return (EReference) jTryClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJCatchClause() {
		return jCatchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJCatchClause_Exceptions() {
		return (EReference) jCatchClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJCatchClause_Param() {
		return (EReference) jCatchClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceOf() {
		return instanceOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowStatement() {
		return throwStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowStatement_Throws() {
		return (EReference) throwStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJFor() {
		return jForEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJFor_Initializers() {
		return (EReference) jForEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJFor_Updaters() {
		return (EReference) jForEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJReturnStatement() {
		return jReturnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFactory getJavaFactory() {
		return (JavaFactory) getEFactoryInstance();
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
		jElementEClass = createEClass(JELEMENT);

		javaClassEClass = createEClass(JAVA_CLASS);
		createEReference(javaClassEClass, JAVA_CLASS__NESTED_CLASSES);
		createEReference(javaClassEClass, JAVA_CLASS__IMPLEMENTS);
		createEReference(javaClassEClass, JAVA_CLASS__BLOCKS);

		jInterfaceEClass = createEClass(JINTERFACE);

		jMethodEClass = createEClass(JMETHOD);
		createEReference(jMethodEClass, JMETHOD__THROWS);

		jConstructorEClass = createEClass(JCONSTRUCTOR);

		jTryCatchEClass = createEClass(JTRY_CATCH);
		createEReference(jTryCatchEClass, JTRY_CATCH__TRY);
		createEReference(jTryCatchEClass, JTRY_CATCH__CATCHES);

		jTryClauseEClass = createEClass(JTRY_CLAUSE);
		createEReference(jTryClauseEClass, JTRY_CLAUSE__RESOURCES);

		jCatchClauseEClass = createEClass(JCATCH_CLAUSE);
		createEReference(jCatchClauseEClass, JCATCH_CLAUSE__EXCEPTIONS);
		createEReference(jCatchClauseEClass, JCATCH_CLAUSE__PARAM);

		instanceOfEClass = createEClass(INSTANCE_OF);

		throwStatementEClass = createEClass(THROW_STATEMENT);
		createEReference(throwStatementEClass, THROW_STATEMENT__THROWS);

		jForEClass = createEClass(JFOR);
		createEReference(jForEClass, JFOR__INITIALIZERS);
		createEReference(jForEClass, JFOR__UPDATERS);

		jReturnStatementEClass = createEClass(JRETURN_STATEMENT);
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
		StatementsPackage theStatementsPackage = (StatementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(StatementsPackage.eNS_URI);

		// Add supertypes to classes
		javaClassEClass.getESuperTypes().add(theNamedElementsPackage.getComplexType());
		javaClassEClass.getESuperTypes().add(this.getJElement());
		jInterfaceEClass.getESuperTypes().add(this.getJElement());
		jInterfaceEClass.getESuperTypes().add(theNamedElementsPackage.getComplexType());
		jMethodEClass.getESuperTypes().add(theNamedElementsPackage.getMethod());
		jConstructorEClass.getESuperTypes().add(this.getJMethod());
		jTryCatchEClass.getESuperTypes().add(this.getJElement());
		jTryClauseEClass.getESuperTypes().add(theStatementsPackage.getBlock());
		jCatchClauseEClass.getESuperTypes().add(theStatementsPackage.getBlock());
		instanceOfEClass.getESuperTypes().add(this.getJElement());
		instanceOfEClass.getESuperTypes().add(theStatementsPackage.getStatement());
		instanceOfEClass.getESuperTypes().add(theStatementsPackage.getInfixExp());
		throwStatementEClass.getESuperTypes().add(this.getJElement());
		jForEClass.getESuperTypes().add(theStatementsPackage.getBlock());
		jForEClass.getESuperTypes().add(this.getJElement());
		jForEClass.getESuperTypes().add(theStatementsPackage.getLoopControl());
		jReturnStatementEClass.getESuperTypes().add(this.getJElement());
		jReturnStatementEClass.getESuperTypes().add(theStatementsPackage.getStatement());

		// Initialize classes and features; add operations and parameters
		initEClass(jElementEClass, JElement.class, "JElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaClassEClass, JavaClass.class, "JavaClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaClass_NestedClasses(), this.getJavaClass(), null, "nestedClasses", null, 0, -1,
				JavaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaClass_Implements(), this.getJInterface(), null, "implements", null, 0, -1,
				JavaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaClass_Blocks(), theStatementsPackage.getBlock(), null, "blocks", null, 0, -1,
				JavaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jInterfaceEClass, JInterface.class, "JInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jMethodEClass, JMethod.class, "JMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJMethod_Throws(), this.getJavaClass(), null, "throws", null, 0, -1, JMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jConstructorEClass, JConstructor.class, "JConstructor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jTryCatchEClass, JTryCatch.class, "JTryCatch", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJTryCatch_Try(), this.getJTryClause(), null, "try", null, 0, 1, JTryCatch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJTryCatch_Catches(), this.getJCatchClause(), null, "catches", null, 0, -1, JTryCatch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jTryClauseEClass, JTryClause.class, "JTryClause", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJTryClause_Resources(), theStatementsPackage.getStatement(), null, "resources", null, 0, -1,
				JTryClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jCatchClauseEClass, JCatchClause.class, "JCatchClause", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJCatchClause_Exceptions(), this.getJavaClass(), null, "exceptions", null, 0, -1,
				JCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJCatchClause_Param(), theNamedElementsPackage.getVariable(), null, "param", null, 0, 1,
				JCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceOfEClass, InstanceOf.class, "InstanceOf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(throwStatementEClass, ThrowStatement.class, "ThrowStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThrowStatement_Throws(), theStatementsPackage.getAccess(), null, "throws", null, 0, 1,
				ThrowStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jForEClass, JFor.class, "JFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJFor_Initializers(), theStatementsPackage.getStatement(), null, "initializers", null, 0, -1,
				JFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJFor_Updaters(), theStatementsPackage.getStatement(), null, "updaters", null, 0, -1,
				JFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jReturnStatementEClass, JReturnStatement.class, "JReturnStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //JavaPackageImpl
