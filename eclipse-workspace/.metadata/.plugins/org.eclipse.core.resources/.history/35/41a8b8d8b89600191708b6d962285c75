/**
 */
package ccsl.elements.statements.impl;

import ccsl.ccslPackage;

import ccsl.elements.ElementsPackage;

import ccsl.elements.datatype.DatatypePackage;

import ccsl.elements.datatype.impl.DatatypePackageImpl;

import ccsl.elements.impl.ElementsPackageImpl;

import ccsl.elements.namedElements.NamedElementsPackage;

import ccsl.elements.namedElements.impl.NamedElementsPackageImpl;

import ccsl.elements.statements.Access;
import ccsl.elements.statements.AtomicExp;
import ccsl.elements.statements.Block;
import ccsl.elements.statements.BranchControl;
import ccsl.elements.statements.ComplexTypeAccess;
import ccsl.elements.statements.CompositeExp;
import ccsl.elements.statements.ControlFlow;
import ccsl.elements.statements.Expression;
import ccsl.elements.statements.IfStatement;
import ccsl.elements.statements.InfixExp;
import ccsl.elements.statements.InstanceCreation;
import ccsl.elements.statements.LiteralValue;
import ccsl.elements.statements.LoopControl;
import ccsl.elements.statements.MethodInvocation;
import ccsl.elements.statements.NamedElementAccess;
import ccsl.elements.statements.PostfixExp;
import ccsl.elements.statements.PrefixExp;
import ccsl.elements.statements.Statement;
import ccsl.elements.statements.StatementsFactory;
import ccsl.elements.statements.StatementsPackage;
import ccsl.elements.statements.SuperMethodInvocation;
import ccsl.elements.statements.VarAssignment;
import ccsl.elements.statements.VarDeclaration;
import ccsl.elements.statements.VariableAccess;

import ccsl.filters.FiltersPackage;

import ccsl.filters.impl.FiltersPackageImpl;

import ccsl.impl.ccslPackageImpl;

import ccsl.java.JavaPackage;

import ccsl.java.impl.JavaPackageImpl;

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
	private EClass namedElementAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeAccessEClass = null;

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
	private EClass accessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infixExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postfixExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superMethodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceCreationEClass = null;

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
	 * @see ccsl.elements.statements.StatementsPackage#eNS_URI
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

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

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
		theStatementsPackage.createPackageContents();
		theccslPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theFiltersPackage.createPackageContents();

		// Initialize created meta-data
		theStatementsPackage.initializePackageContents();
		theccslPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();

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
	public EClass getNamedElementAccess() {
		return namedElementAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElementAccess_From() {
		return (EReference) namedElementAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAccess() {
		return variableAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexTypeAccess() {
		return complexTypeAccessEClass;
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
	public EReference getMethodInvocation_Args() {
		return (EReference) methodInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccess() {
		return accessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccess_ElementAccessed() {
		return (EReference) accessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccess_From() {
		return (EReference) accessEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getLiteralValue_Value() {
		return (EAttribute) literalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralValue_Type() {
		return (EReference) literalValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeExp() {
		return compositeExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeExp_Expressions() {
		return (EReference) compositeExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicExp() {
		return atomicExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicExp_Operator() {
		return (EAttribute) atomicExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Conditional() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarAssignment() {
		return varAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarAssignment_Variable() {
		return (EReference) varAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarAssignment_Assignment() {
		return (EReference) varAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchControl() {
		return branchControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopControl() {
		return loopControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Statements() {
		return (EReference) blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_TrueStatements() {
		return (EReference) ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_FalseStatements() {
		return (EReference) ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefixExp() {
		return prefixExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefixExp_Operand() {
		return (EReference) prefixExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfixExp() {
		return infixExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfixExp_Left() {
		return (EReference) infixExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfixExp_Right() {
		return (EReference) infixExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostfixExp() {
		return postfixExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostfixExp_Operand() {
		return (EReference) postfixExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperMethodInvocation() {
		return superMethodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDeclaration() {
		return varDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarDeclaration_Variable() {
		return (EReference) varDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarDeclaration_Assignment() {
		return (EReference) varDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceCreation() {
		return instanceCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceCreation_Type() {
		return (EReference) instanceCreationEClass.getEStructuralFeatures().get(0);
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

		namedElementAccessEClass = createEClass(NAMED_ELEMENT_ACCESS);
		createEReference(namedElementAccessEClass, NAMED_ELEMENT_ACCESS__FROM);

		variableAccessEClass = createEClass(VARIABLE_ACCESS);

		complexTypeAccessEClass = createEClass(COMPLEX_TYPE_ACCESS);

		methodInvocationEClass = createEClass(METHOD_INVOCATION);
		createEReference(methodInvocationEClass, METHOD_INVOCATION__ARGS);

		accessEClass = createEClass(ACCESS);
		createEReference(accessEClass, ACCESS__ELEMENT_ACCESSED);
		createEReference(accessEClass, ACCESS__FROM);

		literalValueEClass = createEClass(LITERAL_VALUE);
		createEAttribute(literalValueEClass, LITERAL_VALUE__VALUE);
		createEReference(literalValueEClass, LITERAL_VALUE__TYPE);

		expressionEClass = createEClass(EXPRESSION);

		compositeExpEClass = createEClass(COMPOSITE_EXP);
		createEReference(compositeExpEClass, COMPOSITE_EXP__EXPRESSIONS);

		atomicExpEClass = createEClass(ATOMIC_EXP);
		createEAttribute(atomicExpEClass, ATOMIC_EXP__OPERATOR);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEReference(controlFlowEClass, CONTROL_FLOW__CONDITIONAL);

		varAssignmentEClass = createEClass(VAR_ASSIGNMENT);
		createEReference(varAssignmentEClass, VAR_ASSIGNMENT__VARIABLE);
		createEReference(varAssignmentEClass, VAR_ASSIGNMENT__ASSIGNMENT);

		branchControlEClass = createEClass(BRANCH_CONTROL);

		loopControlEClass = createEClass(LOOP_CONTROL);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STATEMENTS);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__TRUE_STATEMENTS);
		createEReference(ifStatementEClass, IF_STATEMENT__FALSE_STATEMENTS);

		prefixExpEClass = createEClass(PREFIX_EXP);
		createEReference(prefixExpEClass, PREFIX_EXP__OPERAND);

		infixExpEClass = createEClass(INFIX_EXP);
		createEReference(infixExpEClass, INFIX_EXP__LEFT);
		createEReference(infixExpEClass, INFIX_EXP__RIGHT);

		postfixExpEClass = createEClass(POSTFIX_EXP);
		createEReference(postfixExpEClass, POSTFIX_EXP__OPERAND);

		superMethodInvocationEClass = createEClass(SUPER_METHOD_INVOCATION);

		varDeclarationEClass = createEClass(VAR_DECLARATION);
		createEReference(varDeclarationEClass, VAR_DECLARATION__VARIABLE);
		createEReference(varDeclarationEClass, VAR_DECLARATION__ASSIGNMENT);

		instanceCreationEClass = createEClass(INSTANCE_CREATION);
		createEReference(instanceCreationEClass, INSTANCE_CREATION__TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		DatatypePackage theDatatypePackage = (DatatypePackage) EPackage.Registry.INSTANCE
				.getEPackage(DatatypePackage.eNS_URI);

		// Add supertypes to classes
		statementEClass.getESuperTypes().add(theElementsPackage.getElement());
		namedElementAccessEClass.getESuperTypes().add(this.getStatement());
		variableAccessEClass.getESuperTypes().add(this.getAccess());
		complexTypeAccessEClass.getESuperTypes().add(this.getAccess());
		methodInvocationEClass.getESuperTypes().add(this.getAccess());
		accessEClass.getESuperTypes().add(this.getStatement());
		literalValueEClass.getESuperTypes().add(this.getStatement());
		expressionEClass.getESuperTypes().add(this.getStatement());
		compositeExpEClass.getESuperTypes().add(this.getExpression());
		atomicExpEClass.getESuperTypes().add(this.getExpression());
		controlFlowEClass.getESuperTypes().add(this.getStatement());
		varAssignmentEClass.getESuperTypes().add(this.getStatement());
		branchControlEClass.getESuperTypes().add(this.getControlFlow());
		loopControlEClass.getESuperTypes().add(this.getControlFlow());
		blockEClass.getESuperTypes().add(this.getStatement());
		ifStatementEClass.getESuperTypes().add(this.getControlFlow());
		prefixExpEClass.getESuperTypes().add(this.getAtomicExp());
		infixExpEClass.getESuperTypes().add(this.getAtomicExp());
		postfixExpEClass.getESuperTypes().add(this.getAtomicExp());
		superMethodInvocationEClass.getESuperTypes().add(this.getMethodInvocation());
		varDeclarationEClass.getESuperTypes().add(this.getStatement());
		instanceCreationEClass.getESuperTypes().add(this.getMethodInvocation());

		// Initialize classes and features; add operations and parameters
		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementAccessEClass, NamedElementAccess.class, "NamedElementAccess", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedElementAccess_From(), this.getStatement(), null, "from", null, 0, 1,
				NamedElementAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAccessEClass, VariableAccess.class, "VariableAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexTypeAccessEClass, ComplexTypeAccess.class, "ComplexTypeAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodInvocationEClass, MethodInvocation.class, "MethodInvocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodInvocation_Args(), this.getStatement(), null, "args", null, 0, -1,
				MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessEClass, Access.class, "Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccess_ElementAccessed(), theNamedElementsPackage.getNamedElement(), null, "elementAccessed",
				null, 0, 1, Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAccess_From(), this.getStatement(), null, "from", null, 0, 1, Access.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(literalValueEClass, LiteralValue.class, "LiteralValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, LiteralValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiteralValue_Type(), theDatatypePackage.getPrimitiveType(), null, "type", null, 0, 1,
				LiteralValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeExpEClass, CompositeExp.class, "CompositeExp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeExp_Expressions(), this.getExpression(), null, "expressions", null, 0, -1,
				CompositeExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicExpEClass, AtomicExp.class, "AtomicExp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicExp_Operator(), theXMLTypePackage.getString(), "operator", null, 0, 1, AtomicExp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlow_Conditional(), this.getStatement(), null, "conditional", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varAssignmentEClass, VarAssignment.class, "VarAssignment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarAssignment_Variable(), theNamedElementsPackage.getVariable(), null, "variable", null, 0, 1,
				VarAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarAssignment_Assignment(), this.getStatement(), null, "assignment", null, 0, -1,
				VarAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchControlEClass, BranchControl.class, "BranchControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopControlEClass, LoopControl.class, "LoopControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_TrueStatements(), this.getStatement(), null, "trueStatements", null, 0, -1,
				IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_FalseStatements(), this.getStatement(), null, "falseStatements", null, 0, -1,
				IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prefixExpEClass, PrefixExp.class, "PrefixExp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrefixExp_Operand(), this.getVariableAccess(), null, "operand", null, 0, -1, PrefixExp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infixExpEClass, InfixExp.class, "InfixExp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfixExp_Left(), this.getStatement(), null, "left", null, 0, -1, InfixExp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfixExp_Right(), this.getStatement(), null, "right", null, 0, -1, InfixExp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postfixExpEClass, PostfixExp.class, "PostfixExp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostfixExp_Operand(), this.getStatement(), null, "operand", null, 0, -1, PostfixExp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superMethodInvocationEClass, SuperMethodInvocation.class, "SuperMethodInvocation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(varDeclarationEClass, VarDeclaration.class, "VarDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarDeclaration_Variable(), theNamedElementsPackage.getVariable(), null, "variable", null, 0,
				1, VarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarDeclaration_Assignment(), this.getStatement(), null, "assignment", null, 0, -1,
				VarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceCreationEClass, InstanceCreation.class, "InstanceCreation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceCreation_Type(), theNamedElementsPackage.getComplexType(), null, "type", null, 0, 1,
				InstanceCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StatementsPackageImpl
