/**
 */
package codingConvetionMetamodel.elements.statements.util;

import codingConvetionMetamodel.elements.Element;

import codingConvetionMetamodel.elements.statements.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see codingConvetionMetamodel.elements.statements.StatementsPackage
 * @generated
 */
public class StatementsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatementsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementsSwitch modelSwitch = new StatementsSwitch() {
		public Object caseStatement(Statement object) {
			return createStatementAdapter();
		}

		public Object caseNamedElementAccess(NamedElementAccess object) {
			return createNamedElementAccessAdapter();
		}

		public Object caseVariableAccess(VariableAccess object) {
			return createVariableAccessAdapter();
		}

		public Object caseComplexTypeAccess(ComplexTypeAccess object) {
			return createComplexTypeAccessAdapter();
		}

		public Object caseMethodInvocation(MethodInvocation object) {
			return createMethodInvocationAdapter();
		}

		public Object caseAccess(Access object) {
			return createAccessAdapter();
		}

		public Object caseLiteralValue(LiteralValue object) {
			return createLiteralValueAdapter();
		}

		public Object caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		public Object caseCompositeExp(CompositeExp object) {
			return createCompositeExpAdapter();
		}

		public Object caseAtomicExp(AtomicExp object) {
			return createAtomicExpAdapter();
		}

		public Object caseControlFlow(ControlFlow object) {
			return createControlFlowAdapter();
		}

		public Object caseVarAssignment(VarAssignment object) {
			return createVarAssignmentAdapter();
		}

		public Object caseBranchControl(BranchControl object) {
			return createBranchControlAdapter();
		}

		public Object caseLoopControl(LoopControl object) {
			return createLoopControlAdapter();
		}

		public Object caseBlock(Block object) {
			return createBlockAdapter();
		}

		public Object caseIfStatement(IfStatement object) {
			return createIfStatementAdapter();
		}

		public Object casePrefixExp(PrefixExp object) {
			return createPrefixExpAdapter();
		}

		public Object caseInfixExp(InfixExp object) {
			return createInfixExpAdapter();
		}

		public Object casePostfixExp(PostfixExp object) {
			return createPostfixExpAdapter();
		}

		public Object caseSuperMethodInvocation(SuperMethodInvocation object) {
			return createSuperMethodInvocationAdapter();
		}

		public Object caseElement(Element object) {
			return createElementAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.NamedElementAccess <em>Named Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.NamedElementAccess
	 * @generated
	 */
	public Adapter createNamedElementAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.VariableAccess <em>Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.VariableAccess
	 * @generated
	 */
	public Adapter createVariableAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.ComplexTypeAccess <em>Complex Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.ComplexTypeAccess
	 * @generated
	 */
	public Adapter createComplexTypeAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.MethodInvocation
	 * @generated
	 */
	public Adapter createMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.Access
	 * @generated
	 */
	public Adapter createAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.LiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.LiteralValue
	 * @generated
	 */
	public Adapter createLiteralValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.CompositeExp <em>Composite Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.CompositeExp
	 * @generated
	 */
	public Adapter createCompositeExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.AtomicExp <em>Atomic Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.AtomicExp
	 * @generated
	 */
	public Adapter createAtomicExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.VarAssignment <em>Var Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.VarAssignment
	 * @generated
	 */
	public Adapter createVarAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.BranchControl <em>Branch Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.BranchControl
	 * @generated
	 */
	public Adapter createBranchControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.LoopControl <em>Loop Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.LoopControl
	 * @generated
	 */
	public Adapter createLoopControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.PrefixExp <em>Prefix Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.PrefixExp
	 * @generated
	 */
	public Adapter createPrefixExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.InfixExp <em>Infix Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.InfixExp
	 * @generated
	 */
	public Adapter createInfixExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.PostfixExp <em>Postfix Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.PostfixExp
	 * @generated
	 */
	public Adapter createPostfixExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.statements.SuperMethodInvocation <em>Super Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.statements.SuperMethodInvocation
	 * @generated
	 */
	public Adapter createSuperMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StatementsAdapterFactory
