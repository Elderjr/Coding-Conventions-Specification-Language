/**
 */
package codingConvention.elements.statements;

import codingConvention.elements.ElementsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see codingConvention.elements.statements.StatementsFactory
 * @model kind="package"
 * @generated
 */
public interface StatementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codingConvention/elements/statements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementsPackage eINSTANCE = codingConvention.elements.statements.impl.StatementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.StatementImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PROPERTIES = ElementsPackage.ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = ElementsPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.MethodInvocationImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getMethodInvocation()
	 * @generated
	 */
	int METHOD_INVOCATION = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__PROPERTIES = STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__FROM = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__TO = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ARGUMENTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.MethodChainingImpl <em>Method Chaining</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.MethodChainingImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getMethodChaining()
	 * @generated
	 */
	int METHOD_CHAINING = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CHAINING__PROPERTIES = STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CHAINING__INVOCATIONS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Chaining</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CHAINING_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method Chaining</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CHAINING_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.AccessModifierImpl <em>Access Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.AccessModifierImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getAccessModifier()
	 * @generated
	 */
	int ACCESS_MODIFIER = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MODIFIER__PROPERTIES = STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MODIFIER__ELEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MODIFIER_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Access Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MODIFIER_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.ExceptionHandlingImpl <em>Exception Handling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.ExceptionHandlingImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getExceptionHandling()
	 * @generated
	 */
	int EXCEPTION_HANDLING = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLING__PROPERTIES = STATEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Exception Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLING_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exception Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLING_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.BodyImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__PROPERTIES = STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.JavaExceptionHandlingImpl <em>Java Exception Handling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.JavaExceptionHandlingImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getJavaExceptionHandling()
	 * @generated
	 */
	int JAVA_EXCEPTION_HANDLING = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXCEPTION_HANDLING__PROPERTIES = EXCEPTION_HANDLING__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Finally Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE = EXCEPTION_HANDLING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXCEPTION_HANDLING__CATCH_CLAUSE = EXCEPTION_HANDLING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Try Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXCEPTION_HANDLING__TRY_CLAUSE = EXCEPTION_HANDLING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java Exception Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXCEPTION_HANDLING_FEATURE_COUNT = EXCEPTION_HANDLING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Java Exception Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXCEPTION_HANDLING_OPERATION_COUNT = EXCEPTION_HANDLING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.CatchClauseImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getCatchClause()
	 * @generated
	 */
	int CATCH_CLAUSE = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__PROPERTIES = BODY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__STATEMENTS = BODY__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Exception Handled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__EXCEPTION_HANDLED = BODY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE_FEATURE_COUNT = BODY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Catch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE_OPERATION_COUNT = BODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.FinallyClauseImpl <em>Finally Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.FinallyClauseImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getFinallyClause()
	 * @generated
	 */
	int FINALLY_CLAUSE = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_CLAUSE__PROPERTIES = BODY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_CLAUSE__STATEMENTS = BODY__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Finally Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_CLAUSE_FEATURE_COUNT = BODY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Finally Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_CLAUSE_OPERATION_COUNT = BODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.statements.impl.TryClauseImpl <em>Try Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.statements.impl.TryClauseImpl
	 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getTryClause()
	 * @generated
	 */
	int TRY_CLAUSE = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CLAUSE__PROPERTIES = BODY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CLAUSE__STATEMENTS = BODY__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Try Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CLAUSE_FEATURE_COUNT = BODY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Try Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CLAUSE_OPERATION_COUNT = BODY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see codingConvention.elements.statements.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation</em>'.
	 * @see codingConvention.elements.statements.MethodInvocation
	 * @generated
	 */
	EClass getMethodInvocation();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.elements.statements.MethodInvocation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see codingConvention.elements.statements.MethodInvocation#getFrom()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_From();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.elements.statements.MethodInvocation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see codingConvention.elements.statements.MethodInvocation#getTo()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_To();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.elements.statements.MethodInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see codingConvention.elements.statements.MethodInvocation#getArguments()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_Arguments();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.MethodChaining <em>Method Chaining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Chaining</em>'.
	 * @see codingConvention.elements.statements.MethodChaining
	 * @generated
	 */
	EClass getMethodChaining();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.elements.statements.MethodChaining#getInvocations <em>Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invocations</em>'.
	 * @see codingConvention.elements.statements.MethodChaining#getInvocations()
	 * @see #getMethodChaining()
	 * @generated
	 */
	EReference getMethodChaining_Invocations();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Modifier</em>'.
	 * @see codingConvention.elements.statements.AccessModifier
	 * @generated
	 */
	EClass getAccessModifier();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.elements.statements.AccessModifier#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see codingConvention.elements.statements.AccessModifier#getElement()
	 * @see #getAccessModifier()
	 * @generated
	 */
	EReference getAccessModifier_Element();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.ExceptionHandling <em>Exception Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Handling</em>'.
	 * @see codingConvention.elements.statements.ExceptionHandling
	 * @generated
	 */
	EClass getExceptionHandling();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see codingConvention.elements.statements.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.elements.statements.Body#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see codingConvention.elements.statements.Body#getStatements()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Statements();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.JavaExceptionHandling <em>Java Exception Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Exception Handling</em>'.
	 * @see codingConvention.elements.statements.JavaExceptionHandling
	 * @generated
	 */
	EClass getJavaExceptionHandling();

	/**
	 * Returns the meta object for the containment reference '{@link codingConvention.elements.statements.JavaExceptionHandling#getFinallyClause <em>Finally Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finally Clause</em>'.
	 * @see codingConvention.elements.statements.JavaExceptionHandling#getFinallyClause()
	 * @see #getJavaExceptionHandling()
	 * @generated
	 */
	EReference getJavaExceptionHandling_FinallyClause();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.elements.statements.JavaExceptionHandling#getCatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch Clause</em>'.
	 * @see codingConvention.elements.statements.JavaExceptionHandling#getCatchClause()
	 * @see #getJavaExceptionHandling()
	 * @generated
	 */
	EReference getJavaExceptionHandling_CatchClause();

	/**
	 * Returns the meta object for the containment reference '{@link codingConvention.elements.statements.JavaExceptionHandling#getTryClause <em>Try Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Try Clause</em>'.
	 * @see codingConvention.elements.statements.JavaExceptionHandling#getTryClause()
	 * @see #getJavaExceptionHandling()
	 * @generated
	 */
	EReference getJavaExceptionHandling_TryClause();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.CatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Clause</em>'.
	 * @see codingConvention.elements.statements.CatchClause
	 * @generated
	 */
	EClass getCatchClause();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.elements.statements.CatchClause#getExceptionHandled <em>Exception Handled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handled</em>'.
	 * @see codingConvention.elements.statements.CatchClause#getExceptionHandled()
	 * @see #getCatchClause()
	 * @generated
	 */
	EReference getCatchClause_ExceptionHandled();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.FinallyClause <em>Finally Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finally Clause</em>'.
	 * @see codingConvention.elements.statements.FinallyClause
	 * @generated
	 */
	EClass getFinallyClause();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.statements.TryClause <em>Try Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Clause</em>'.
	 * @see codingConvention.elements.statements.TryClause
	 * @generated
	 */
	EClass getTryClause();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatementsFactory getStatementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.StatementImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.MethodInvocationImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getMethodInvocation()
		 * @generated
		 */
		EClass METHOD_INVOCATION = eINSTANCE.getMethodInvocation();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION__FROM = eINSTANCE.getMethodInvocation_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION__TO = eINSTANCE.getMethodInvocation_To();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION__ARGUMENTS = eINSTANCE.getMethodInvocation_Arguments();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.MethodChainingImpl <em>Method Chaining</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.MethodChainingImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getMethodChaining()
		 * @generated
		 */
		EClass METHOD_CHAINING = eINSTANCE.getMethodChaining();

		/**
		 * The meta object literal for the '<em><b>Invocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CHAINING__INVOCATIONS = eINSTANCE.getMethodChaining_Invocations();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.AccessModifierImpl <em>Access Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.AccessModifierImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getAccessModifier()
		 * @generated
		 */
		EClass ACCESS_MODIFIER = eINSTANCE.getAccessModifier();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_MODIFIER__ELEMENT = eINSTANCE.getAccessModifier_Element();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.ExceptionHandlingImpl <em>Exception Handling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.ExceptionHandlingImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getExceptionHandling()
		 * @generated
		 */
		EClass EXCEPTION_HANDLING = eINSTANCE.getExceptionHandling();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.BodyImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__STATEMENTS = eINSTANCE.getBody_Statements();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.JavaExceptionHandlingImpl <em>Java Exception Handling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.JavaExceptionHandlingImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getJavaExceptionHandling()
		 * @generated
		 */
		EClass JAVA_EXCEPTION_HANDLING = eINSTANCE.getJavaExceptionHandling();

		/**
		 * The meta object literal for the '<em><b>Finally Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE = eINSTANCE.getJavaExceptionHandling_FinallyClause();

		/**
		 * The meta object literal for the '<em><b>Catch Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_EXCEPTION_HANDLING__CATCH_CLAUSE = eINSTANCE.getJavaExceptionHandling_CatchClause();

		/**
		 * The meta object literal for the '<em><b>Try Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_EXCEPTION_HANDLING__TRY_CLAUSE = eINSTANCE.getJavaExceptionHandling_TryClause();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.CatchClauseImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getCatchClause()
		 * @generated
		 */
		EClass CATCH_CLAUSE = eINSTANCE.getCatchClause();

		/**
		 * The meta object literal for the '<em><b>Exception Handled</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_CLAUSE__EXCEPTION_HANDLED = eINSTANCE.getCatchClause_ExceptionHandled();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.FinallyClauseImpl <em>Finally Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.FinallyClauseImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getFinallyClause()
		 * @generated
		 */
		EClass FINALLY_CLAUSE = eINSTANCE.getFinallyClause();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.statements.impl.TryClauseImpl <em>Try Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.statements.impl.TryClauseImpl
		 * @see codingConvention.elements.statements.impl.StatementsPackageImpl#getTryClause()
		 * @generated
		 */
		EClass TRY_CLAUSE = eINSTANCE.getTryClause();

	}

} //StatementsPackage
