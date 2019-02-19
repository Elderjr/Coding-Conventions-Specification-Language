/**
 */
package codingConvetionMetamodel.java.util;

import codingConvetionMetamodel.elements.Element;

import codingConvetionMetamodel.elements.datatype.DataType;

import codingConvetionMetamodel.elements.namedElements.ComplexType;
import codingConvetionMetamodel.elements.namedElements.Method;
import codingConvetionMetamodel.elements.namedElements.NamedElement;

import codingConvetionMetamodel.elements.statements.AtomicExp;
import codingConvetionMetamodel.elements.statements.Block;
import codingConvetionMetamodel.elements.statements.ControlFlow;
import codingConvetionMetamodel.elements.statements.Expression;
import codingConvetionMetamodel.elements.statements.InfixExp;
import codingConvetionMetamodel.elements.statements.LoopControl;
import codingConvetionMetamodel.elements.statements.Statement;

import codingConvetionMetamodel.java.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see codingConvetionMetamodel.java.JavaPackage
 * @generated
 */
public class JavaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaPackage.eINSTANCE;
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
	protected JavaSwitch modelSwitch = new JavaSwitch() {
		public Object caseJElement(JElement object) {
			return createJElementAdapter();
		}

		public Object caseJClass(JClass object) {
			return createJClassAdapter();
		}

		public Object caseJInterface(JInterface object) {
			return createJInterfaceAdapter();
		}

		public Object caseJMethod(JMethod object) {
			return createJMethodAdapter();
		}

		public Object caseJConstructor(JConstructor object) {
			return createJConstructorAdapter();
		}

		public Object caseJTryCatch(JTryCatch object) {
			return createJTryCatchAdapter();
		}

		public Object caseJTryClause(JTryClause object) {
			return createJTryClauseAdapter();
		}

		public Object caseJCatchClause(JCatchClause object) {
			return createJCatchClauseAdapter();
		}

		public Object caseInstanceOf(InstanceOf object) {
			return createInstanceOfAdapter();
		}

		public Object caseThrowStatement(ThrowStatement object) {
			return createThrowStatementAdapter();
		}

		public Object caseJFor(JFor object) {
			return createJForAdapter();
		}

		public Object caseJReturnStatement(JReturnStatement object) {
			return createJReturnStatementAdapter();
		}

		public Object caseElement(Element object) {
			return createElementAdapter();
		}

		public Object caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		public Object caseDataType(DataType object) {
			return createDataTypeAdapter();
		}

		public Object caseComplexType(ComplexType object) {
			return createComplexTypeAdapter();
		}

		public Object caseMethod(Method object) {
			return createMethodAdapter();
		}

		public Object caseBlock(Block object) {
			return createBlockAdapter();
		}

		public Object caseStatement(Statement object) {
			return createStatementAdapter();
		}

		public Object caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		public Object caseAtomicExp(AtomicExp object) {
			return createAtomicExpAdapter();
		}

		public Object caseInfixExp(InfixExp object) {
			return createInfixExpAdapter();
		}

		public Object caseControlFlow(ControlFlow object) {
			return createControlFlowAdapter();
		}

		public Object caseLoopControl(LoopControl object) {
			return createLoopControlAdapter();
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
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JElement <em>JElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JElement
	 * @generated
	 */
	public Adapter createJElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JClass
	 * @generated
	 */
	public Adapter createJClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JInterface <em>JInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JInterface
	 * @generated
	 */
	public Adapter createJInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JMethod <em>JMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JMethod
	 * @generated
	 */
	public Adapter createJMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JConstructor <em>JConstructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JConstructor
	 * @generated
	 */
	public Adapter createJConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JTryCatch <em>JTry Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JTryCatch
	 * @generated
	 */
	public Adapter createJTryCatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JTryClause <em>JTry Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JTryClause
	 * @generated
	 */
	public Adapter createJTryClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JCatchClause <em>JCatch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JCatchClause
	 * @generated
	 */
	public Adapter createJCatchClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.InstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.InstanceOf
	 * @generated
	 */
	public Adapter createInstanceOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.ThrowStatement
	 * @generated
	 */
	public Adapter createThrowStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JFor <em>JFor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JFor
	 * @generated
	 */
	public Adapter createJForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.java.JReturnStatement <em>JReturn Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.java.JReturnStatement
	 * @generated
	 */
	public Adapter createJReturnStatementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.namedElements.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.namedElements.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.datatype.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.datatype.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.namedElements.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.namedElements.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvetionMetamodel.elements.namedElements.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvetionMetamodel.elements.namedElements.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
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

} //JavaAdapterFactory
