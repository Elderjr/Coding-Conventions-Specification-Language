/**
 */
package codingConvetionMetamodel.impl;

import codingConvetionMetamodel.AtomicRule;
import codingConvetionMetamodel.CodingConventionsMetamodelFactory;
import codingConvetionMetamodel.CodingConventionsMetamodelPackage;
import codingConvetionMetamodel.CompositeRule;
import codingConvetionMetamodel.JAnnotations;
import codingConvetionMetamodel.LogicOperators;
import codingConvetionMetamodel.Rule;

import codingConvetionMetamodel.elements.ElementsPackage;

import codingConvetionMetamodel.elements.datatype.DatatypePackage;

import codingConvetionMetamodel.elements.datatype.impl.DatatypePackageImpl;

import codingConvetionMetamodel.elements.impl.ElementsPackageImpl;

import codingConvetionMetamodel.elements.namedElements.NamedElementsPackage;

import codingConvetionMetamodel.elements.namedElements.impl.NamedElementsPackageImpl;

import codingConvetionMetamodel.elements.statements.StatementsPackage;

import codingConvetionMetamodel.elements.statements.impl.StatementsPackageImpl;

import codingConvetionMetamodel.filters.FiltersPackage;

import codingConvetionMetamodel.filters.impl.FiltersPackageImpl;

import codingConvetionMetamodel.java.JavaPackage;

import codingConvetionMetamodel.java.impl.JavaPackageImpl;

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
public class CodingConventionsMetamodelPackageImpl extends EPackageImpl implements CodingConventionsMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicOperatorsEEnum = null;

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
	 * @see codingConvetionMetamodel.CodingConventionsMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodingConventionsMetamodelPackageImpl() {
		super(eNS_URI, CodingConventionsMetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodingConventionsMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodingConventionsMetamodelPackage init() {
		if (isInited)
			return (CodingConventionsMetamodelPackage) EPackage.Registry.INSTANCE
					.getEPackage(CodingConventionsMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		CodingConventionsMetamodelPackageImpl theCodingConventionsMetamodelPackage = (CodingConventionsMetamodelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CodingConventionsMetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CodingConventionsMetamodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
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
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI)
						: FiltersPackage.eINSTANCE);

		// Create package meta-data objects
		theCodingConventionsMetamodelPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theFiltersPackage.createPackageContents();

		// Initialize created meta-data
		theCodingConventionsMetamodelPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodingConventionsMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodingConventionsMetamodelPackage.eNS_URI, theCodingConventionsMetamodelPackage);
		return theCodingConventionsMetamodelPackage;
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
	public EAttribute getRule_Negated() {
		return (EAttribute) ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeRule() {
		return compositeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeRule_Operator() {
		return (EAttribute) compositeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRule_Rule() {
		return (EReference) compositeRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicRule() {
		return atomicRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicRule_Element() {
		return (EReference) atomicRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicRule_Filter() {
		return (EReference) atomicRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJAnnotations() {
		return jAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAnnotations_Name() {
		return (EAttribute) jAnnotationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicOperators() {
		return logicOperatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingConventionsMetamodelFactory getCodingConventionsMetamodelFactory() {
		return (CodingConventionsMetamodelFactory) getEFactoryInstance();
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
		createEAttribute(ruleEClass, RULE__NEGATED);

		compositeRuleEClass = createEClass(COMPOSITE_RULE);
		createEAttribute(compositeRuleEClass, COMPOSITE_RULE__OPERATOR);
		createEReference(compositeRuleEClass, COMPOSITE_RULE__RULE);

		atomicRuleEClass = createEClass(ATOMIC_RULE);
		createEReference(atomicRuleEClass, ATOMIC_RULE__ELEMENT);
		createEReference(atomicRuleEClass, ATOMIC_RULE__FILTER);

		jAnnotationsEClass = createEClass(JANNOTATIONS);
		createEAttribute(jAnnotationsEClass, JANNOTATIONS__NAME);

		// Create enums
		logicOperatorsEEnum = createEEnum(LOGIC_OPERATORS);
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
		JavaPackage theJavaPackage = (JavaPackage) EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		FiltersPackage theFiltersPackage = (FiltersPackage) EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theElementsPackage);
		getESubpackages().add(theJavaPackage);
		getESubpackages().add(theFiltersPackage);

		// Add supertypes to classes
		compositeRuleEClass.getESuperTypes().add(this.getRule());
		atomicRuleEClass.getESuperTypes().add(this.getRule());

		// Initialize classes and features; add operations and parameters
		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Negated(), theXMLTypePackage.getBoolean(), "negated", null, 0, 1, Rule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeRuleEClass, CompositeRule.class, "CompositeRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeRule_Operator(), this.getLogicOperators(), "operator", null, 0, 1,
				CompositeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeRule_Rule(), this.getRule(), null, "rule", null, 2, -1, CompositeRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicRuleEClass, AtomicRule.class, "AtomicRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicRule_Element(), theElementsPackage.getElement(), null, "element", null, 1, -1,
				AtomicRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicRule_Filter(), theFiltersPackage.getFilter(), null, "filter", null, 0, -1,
				AtomicRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jAnnotationsEClass, JAnnotations.class, "JAnnotations", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJAnnotations_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, JAnnotations.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(logicOperatorsEEnum, LogicOperators.class, "LogicOperators");
		addEEnumLiteral(logicOperatorsEEnum, LogicOperators.AND_LITERAL);
		addEEnumLiteral(logicOperatorsEEnum, LogicOperators.OR_LITERAL);
		addEEnumLiteral(logicOperatorsEEnum, LogicOperators.IF_THEN_LITERAL);
		addEEnumLiteral(logicOperatorsEEnum, LogicOperators.ANY_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //CodingConventionsMetamodelPackageImpl
