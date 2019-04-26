/**
 */
package ccsl.elements.statements;

import ccsl.elements.ElementsPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ccsl.elements.statements.StatementsFactory
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
	String eNS_URI = "http://www.example.org/ccsl/elements/statements";

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
	StatementsPackage eINSTANCE = ccsl.elements.statements.impl.StatementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.StatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PROPERTY = ElementsPackage.ELEMENT__PROPERTY;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.NamedElementAccessImpl <em>Named Element Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.NamedElementAccessImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getNamedElementAccess()
	 * @generated
	 */
	int NAMED_ELEMENT_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ACCESS__PROPERTY = STATEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ACCESS__FROM = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_ACCESS_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.AccessImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__PROPERTY = STATEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Element Accessed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__ELEMENT_ACCESSED = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__FROM = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.VariableAccessImpl <em>Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.VariableAccessImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getVariableAccess()
	 * @generated
	 */
	int VARIABLE_ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__PROPERTY = ACCESS__PROPERTY;

	/**
	 * The feature id for the '<em><b>Element Accessed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__ELEMENT_ACCESSED = ACCESS__ELEMENT_ACCESSED;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__FROM = ACCESS__FROM;

	/**
	 * The number of structural features of the '<em>Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.ComplexTypeAccessImpl <em>Complex Type Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.ComplexTypeAccessImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getComplexTypeAccess()
	 * @generated
	 */
	int COMPLEX_TYPE_ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_ACCESS__PROPERTY = ACCESS__PROPERTY;

	/**
	 * The feature id for the '<em><b>Element Accessed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_ACCESS__ELEMENT_ACCESSED = ACCESS__ELEMENT_ACCESSED;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_ACCESS__FROM = ACCESS__FROM;

	/**
	 * The number of structural features of the '<em>Complex Type Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_ACCESS_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.MethodInvocationImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getMethodInvocation()
	 * @generated
	 */
	int METHOD_INVOCATION = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__PROPERTY = ACCESS__PROPERTY;

	/**
	 * The feature id for the '<em><b>Element Accessed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ELEMENT_ACCESSED = ACCESS__ELEMENT_ACCESSED;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__FROM = ACCESS__FROM;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ARGUMENTS = ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.LiteralValueImpl <em>Literal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.LiteralValueImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getLiteralValue()
	 * @generated
	 */
	int LITERAL_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE__PROPERTY = STATEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE__TYPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.ExpressionImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__PROPERTY = STATEMENT__PROPERTY;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.CompositeExpImpl <em>Composite Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.CompositeExpImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getCompositeExp()
	 * @generated
	 */
	int COMPOSITE_EXP = 8;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXP__PROPERTY = EXPRESSION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Logic Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXP__LOGIC_OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXP__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.AtomicExpImpl <em>Atomic Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.AtomicExpImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getAtomicExp()
	 * @generated
	 */
	int ATOMIC_EXP = 9;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXP__PROPERTY = EXPRESSION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXP__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.ControlFlowImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PROPERTY = STATEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__CONDITIONAL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.VarAssignmentImpl <em>Var Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.VarAssignmentImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getVarAssignment()
	 * @generated
	 */
	int VAR_ASSIGNMENT = 11;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT__PROPERTY = STATEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT__ASSIGNMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.BranchControlImpl <em>Branch Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.BranchControlImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getBranchControl()
	 * @generated
	 */
	int BRANCH_CONTROL = 12;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_CONTROL__PROPERTY = CONTROL_FLOW__PROPERTY;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_CONTROL__CONDITIONAL = CONTROL_FLOW__CONDITIONAL;

	/**
	 * The number of structural features of the '<em>Branch Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_CONTROL_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.LoopControlImpl <em>Loop Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.LoopControlImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getLoopControl()
	 * @generated
	 */
	int LOOP_CONTROL = 13;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONTROL__PROPERTY = CONTROL_FLOW__PROPERTY;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONTROL__CONDITIONAL = CONTROL_FLOW__CONDITIONAL;

	/**
	 * The number of structural features of the '<em>Loop Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONTROL_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.BlockImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 14;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PROPERTY = STATEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.IfStatementImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 15;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__PROPERTY = CONTROL_FLOW__PROPERTY;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITIONAL = CONTROL_FLOW__CONDITIONAL;

	/**
	 * The feature id for the '<em><b>True Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__TRUE_STATEMENTS = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__FALSE_STATEMENTS = CONTROL_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.PrefixExpImpl <em>Prefix Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.PrefixExpImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getPrefixExp()
	 * @generated
	 */
	int PREFIX_EXP = 16;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXP__PROPERTY = ATOMIC_EXP__PROPERTY;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXP__OPERATOR = ATOMIC_EXP__OPERATOR;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXP__OPERAND = ATOMIC_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prefix Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXP_FEATURE_COUNT = ATOMIC_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.InfixExpImpl <em>Infix Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.InfixExpImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getInfixExp()
	 * @generated
	 */
	int INFIX_EXP = 17;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXP__PROPERTY = ATOMIC_EXP__PROPERTY;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXP__OPERATOR = ATOMIC_EXP__OPERATOR;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXP__LEFT = ATOMIC_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXP__RIGHT = ATOMIC_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Infix Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXP_FEATURE_COUNT = ATOMIC_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.PostfixExpImpl <em>Postfix Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.PostfixExpImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getPostfixExp()
	 * @generated
	 */
	int POSTFIX_EXP = 18;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXP__PROPERTY = ATOMIC_EXP__PROPERTY;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXP__OPERATOR = ATOMIC_EXP__OPERATOR;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXP__OPERAND = ATOMIC_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postfix Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXP_FEATURE_COUNT = ATOMIC_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.SuperMethodInvocationImpl <em>Super Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.SuperMethodInvocationImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getSuperMethodInvocation()
	 * @generated
	 */
	int SUPER_METHOD_INVOCATION = 19;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__PROPERTY = METHOD_INVOCATION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Element Accessed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__ELEMENT_ACCESSED = METHOD_INVOCATION__ELEMENT_ACCESSED;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__FROM = METHOD_INVOCATION__FROM;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__ARGUMENTS = METHOD_INVOCATION__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Super Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_FEATURE_COUNT = METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.VarDeclarationImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getVarDeclaration()
	 * @generated
	 */
	int VAR_DECLARATION = 20;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION__PROPERTY = STATEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION__ASSIGNMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.elements.statements.impl.InstanceCreationImpl <em>Instance Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.elements.statements.impl.InstanceCreationImpl
	 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getInstanceCreation()
	 * @generated
	 */
	int INSTANCE_CREATION = 21;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__PROPERTY = METHOD_INVOCATION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Element Accessed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__ELEMENT_ACCESSED = METHOD_INVOCATION__ELEMENT_ACCESSED;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__FROM = METHOD_INVOCATION__FROM;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__ARGUMENTS = METHOD_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION__TYPE = METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_FEATURE_COUNT = METHOD_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see ccsl.elements.statements.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.NamedElementAccess <em>Named Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element Access</em>'.
	 * @see ccsl.elements.statements.NamedElementAccess
	 * @generated
	 */
	EClass getNamedElementAccess();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.statements.NamedElementAccess#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see ccsl.elements.statements.NamedElementAccess#getFrom()
	 * @see #getNamedElementAccess()
	 * @generated
	 */
	EReference getNamedElementAccess_From();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.VariableAccess <em>Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Access</em>'.
	 * @see ccsl.elements.statements.VariableAccess
	 * @generated
	 */
	EClass getVariableAccess();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.ComplexTypeAccess <em>Complex Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type Access</em>'.
	 * @see ccsl.elements.statements.ComplexTypeAccess
	 * @generated
	 */
	EClass getComplexTypeAccess();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation</em>'.
	 * @see ccsl.elements.statements.MethodInvocation
	 * @generated
	 */
	EClass getMethodInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.MethodInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see ccsl.elements.statements.MethodInvocation#getArguments()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_Arguments();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see ccsl.elements.statements.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.statements.Access#getElementAccessed <em>Element Accessed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Accessed</em>'.
	 * @see ccsl.elements.statements.Access#getElementAccessed()
	 * @see #getAccess()
	 * @generated
	 */
	EReference getAccess_ElementAccessed();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.statements.Access#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see ccsl.elements.statements.Access#getFrom()
	 * @see #getAccess()
	 * @generated
	 */
	EReference getAccess_From();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.LiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Value</em>'.
	 * @see ccsl.elements.statements.LiteralValue
	 * @generated
	 */
	EClass getLiteralValue();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.LiteralValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ccsl.elements.statements.LiteralValue#getValue()
	 * @see #getLiteralValue()
	 * @generated
	 */
	EAttribute getLiteralValue_Value();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.statements.LiteralValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.statements.LiteralValue#getType()
	 * @see #getLiteralValue()
	 * @generated
	 */
	EReference getLiteralValue_Type();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see ccsl.elements.statements.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.CompositeExp <em>Composite Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Exp</em>'.
	 * @see ccsl.elements.statements.CompositeExp
	 * @generated
	 */
	EClass getCompositeExp();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.CompositeExp#getLogicOperator <em>Logic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic Operator</em>'.
	 * @see ccsl.elements.statements.CompositeExp#getLogicOperator()
	 * @see #getCompositeExp()
	 * @generated
	 */
	EAttribute getCompositeExp_LogicOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.CompositeExp#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see ccsl.elements.statements.CompositeExp#getExpressions()
	 * @see #getCompositeExp()
	 * @generated
	 */
	EReference getCompositeExp_Expressions();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.AtomicExp <em>Atomic Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Exp</em>'.
	 * @see ccsl.elements.statements.AtomicExp
	 * @generated
	 */
	EClass getAtomicExp();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.elements.statements.AtomicExp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ccsl.elements.statements.AtomicExp#getOperator()
	 * @see #getAtomicExp()
	 * @generated
	 */
	EAttribute getAtomicExp_Operator();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see ccsl.elements.statements.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.ControlFlow#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditional</em>'.
	 * @see ccsl.elements.statements.ControlFlow#getConditional()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Conditional();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.VarAssignment <em>Var Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Assignment</em>'.
	 * @see ccsl.elements.statements.VarAssignment
	 * @generated
	 */
	EClass getVarAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.elements.statements.VarAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see ccsl.elements.statements.VarAssignment#getVariable()
	 * @see #getVarAssignment()
	 * @generated
	 */
	EReference getVarAssignment_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.VarAssignment#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see ccsl.elements.statements.VarAssignment#getAssignment()
	 * @see #getVarAssignment()
	 * @generated
	 */
	EReference getVarAssignment_Assignment();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.BranchControl <em>Branch Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Control</em>'.
	 * @see ccsl.elements.statements.BranchControl
	 * @generated
	 */
	EClass getBranchControl();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.LoopControl <em>Loop Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Control</em>'.
	 * @see ccsl.elements.statements.LoopControl
	 * @generated
	 */
	EClass getLoopControl();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see ccsl.elements.statements.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see ccsl.elements.statements.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see ccsl.elements.statements.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.IfStatement#getTrueStatements <em>True Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>True Statements</em>'.
	 * @see ccsl.elements.statements.IfStatement#getTrueStatements()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_TrueStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.IfStatement#getFalseStatements <em>False Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>False Statements</em>'.
	 * @see ccsl.elements.statements.IfStatement#getFalseStatements()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_FalseStatements();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.PrefixExp <em>Prefix Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix Exp</em>'.
	 * @see ccsl.elements.statements.PrefixExp
	 * @generated
	 */
	EClass getPrefixExp();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.PrefixExp#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see ccsl.elements.statements.PrefixExp#getOperand()
	 * @see #getPrefixExp()
	 * @generated
	 */
	EReference getPrefixExp_Operand();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.InfixExp <em>Infix Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infix Exp</em>'.
	 * @see ccsl.elements.statements.InfixExp
	 * @generated
	 */
	EClass getInfixExp();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.InfixExp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left</em>'.
	 * @see ccsl.elements.statements.InfixExp#getLeft()
	 * @see #getInfixExp()
	 * @generated
	 */
	EReference getInfixExp_Left();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.InfixExp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right</em>'.
	 * @see ccsl.elements.statements.InfixExp#getRight()
	 * @see #getInfixExp()
	 * @generated
	 */
	EReference getInfixExp_Right();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.PostfixExp <em>Postfix Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postfix Exp</em>'.
	 * @see ccsl.elements.statements.PostfixExp
	 * @generated
	 */
	EClass getPostfixExp();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.PostfixExp#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see ccsl.elements.statements.PostfixExp#getOperand()
	 * @see #getPostfixExp()
	 * @generated
	 */
	EReference getPostfixExp_Operand();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.SuperMethodInvocation <em>Super Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Method Invocation</em>'.
	 * @see ccsl.elements.statements.SuperMethodInvocation
	 * @generated
	 */
	EClass getSuperMethodInvocation();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.VarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Declaration</em>'.
	 * @see ccsl.elements.statements.VarDeclaration
	 * @generated
	 */
	EClass getVarDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.statements.VarDeclaration#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ccsl.elements.statements.VarDeclaration#getVariable()
	 * @see #getVarDeclaration()
	 * @generated
	 */
	EReference getVarDeclaration_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.elements.statements.VarDeclaration#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see ccsl.elements.statements.VarDeclaration#getAssignment()
	 * @see #getVarDeclaration()
	 * @generated
	 */
	EReference getVarDeclaration_Assignment();

	/**
	 * Returns the meta object for class '{@link ccsl.elements.statements.InstanceCreation <em>Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Creation</em>'.
	 * @see ccsl.elements.statements.InstanceCreation
	 * @generated
	 */
	EClass getInstanceCreation();

	/**
	 * Returns the meta object for the reference '{@link ccsl.elements.statements.InstanceCreation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ccsl.elements.statements.InstanceCreation#getType()
	 * @see #getInstanceCreation()
	 * @generated
	 */
	EReference getInstanceCreation_Type();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.StatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.NamedElementAccessImpl <em>Named Element Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.NamedElementAccessImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getNamedElementAccess()
		 * @generated
		 */
		EClass NAMED_ELEMENT_ACCESS = eINSTANCE.getNamedElementAccess();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT_ACCESS__FROM = eINSTANCE.getNamedElementAccess_From();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.VariableAccessImpl <em>Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.VariableAccessImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getVariableAccess()
		 * @generated
		 */
		EClass VARIABLE_ACCESS = eINSTANCE.getVariableAccess();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.ComplexTypeAccessImpl <em>Complex Type Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.ComplexTypeAccessImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getComplexTypeAccess()
		 * @generated
		 */
		EClass COMPLEX_TYPE_ACCESS = eINSTANCE.getComplexTypeAccess();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.MethodInvocationImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getMethodInvocation()
		 * @generated
		 */
		EClass METHOD_INVOCATION = eINSTANCE.getMethodInvocation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION__ARGUMENTS = eINSTANCE.getMethodInvocation_Arguments();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.AccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.AccessImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getAccess()
		 * @generated
		 */
		EClass ACCESS = eINSTANCE.getAccess();

		/**
		 * The meta object literal for the '<em><b>Element Accessed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS__ELEMENT_ACCESSED = eINSTANCE.getAccess_ElementAccessed();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS__FROM = eINSTANCE.getAccess_From();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.LiteralValueImpl <em>Literal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.LiteralValueImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getLiteralValue()
		 * @generated
		 */
		EClass LITERAL_VALUE = eINSTANCE.getLiteralValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_VALUE__VALUE = eINSTANCE.getLiteralValue_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_VALUE__TYPE = eINSTANCE.getLiteralValue_Type();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.ExpressionImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.CompositeExpImpl <em>Composite Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.CompositeExpImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getCompositeExp()
		 * @generated
		 */
		EClass COMPOSITE_EXP = eINSTANCE.getCompositeExp();

		/**
		 * The meta object literal for the '<em><b>Logic Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_EXP__LOGIC_OPERATOR = eINSTANCE.getCompositeExp_LogicOperator();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_EXP__EXPRESSIONS = eINSTANCE.getCompositeExp_Expressions();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.AtomicExpImpl <em>Atomic Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.AtomicExpImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getAtomicExp()
		 * @generated
		 */
		EClass ATOMIC_EXP = eINSTANCE.getAtomicExp();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_EXP__OPERATOR = eINSTANCE.getAtomicExp_Operator();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.ControlFlowImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__CONDITIONAL = eINSTANCE.getControlFlow_Conditional();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.VarAssignmentImpl <em>Var Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.VarAssignmentImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getVarAssignment()
		 * @generated
		 */
		EClass VAR_ASSIGNMENT = eINSTANCE.getVarAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_ASSIGNMENT__VARIABLE = eINSTANCE.getVarAssignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_ASSIGNMENT__ASSIGNMENT = eINSTANCE.getVarAssignment_Assignment();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.BranchControlImpl <em>Branch Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.BranchControlImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getBranchControl()
		 * @generated
		 */
		EClass BRANCH_CONTROL = eINSTANCE.getBranchControl();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.LoopControlImpl <em>Loop Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.LoopControlImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getLoopControl()
		 * @generated
		 */
		EClass LOOP_CONTROL = eINSTANCE.getLoopControl();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.BlockImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.IfStatementImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>True Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__TRUE_STATEMENTS = eINSTANCE.getIfStatement_TrueStatements();

		/**
		 * The meta object literal for the '<em><b>False Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__FALSE_STATEMENTS = eINSTANCE.getIfStatement_FalseStatements();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.PrefixExpImpl <em>Prefix Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.PrefixExpImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getPrefixExp()
		 * @generated
		 */
		EClass PREFIX_EXP = eINSTANCE.getPrefixExp();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFIX_EXP__OPERAND = eINSTANCE.getPrefixExp_Operand();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.InfixExpImpl <em>Infix Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.InfixExpImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getInfixExp()
		 * @generated
		 */
		EClass INFIX_EXP = eINSTANCE.getInfixExp();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXP__LEFT = eINSTANCE.getInfixExp_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXP__RIGHT = eINSTANCE.getInfixExp_Right();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.PostfixExpImpl <em>Postfix Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.PostfixExpImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getPostfixExp()
		 * @generated
		 */
		EClass POSTFIX_EXP = eINSTANCE.getPostfixExp();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTFIX_EXP__OPERAND = eINSTANCE.getPostfixExp_Operand();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.SuperMethodInvocationImpl <em>Super Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.SuperMethodInvocationImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getSuperMethodInvocation()
		 * @generated
		 */
		EClass SUPER_METHOD_INVOCATION = eINSTANCE.getSuperMethodInvocation();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.VarDeclarationImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getVarDeclaration()
		 * @generated
		 */
		EClass VAR_DECLARATION = eINSTANCE.getVarDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECLARATION__VARIABLE = eINSTANCE.getVarDeclaration_Variable();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECLARATION__ASSIGNMENT = eINSTANCE.getVarDeclaration_Assignment();

		/**
		 * The meta object literal for the '{@link ccsl.elements.statements.impl.InstanceCreationImpl <em>Instance Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.elements.statements.impl.InstanceCreationImpl
		 * @see ccsl.elements.statements.impl.StatementsPackageImpl#getInstanceCreation()
		 * @generated
		 */
		EClass INSTANCE_CREATION = eINSTANCE.getInstanceCreation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION__TYPE = eINSTANCE.getInstanceCreation_Type();

	}

} //StatementsPackage
