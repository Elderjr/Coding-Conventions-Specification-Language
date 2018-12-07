/**
 */
package codingConvention.elements.statements.util;

import codingConvention.elements.Element;

import codingConvention.elements.statements.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see codingConvention.elements.statements.StatementsPackage
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
	@Override
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
	protected StatementsSwitch<Adapter> modelSwitch = new StatementsSwitch<Adapter>() {
		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseMethodInvocation(MethodInvocation object) {
			return createMethodInvocationAdapter();
		}

		@Override
		public Adapter caseMethodChaining(MethodChaining object) {
			return createMethodChainingAdapter();
		}

		@Override
		public Adapter caseAccessModifier(AccessModifier object) {
			return createAccessModifierAdapter();
		}

		@Override
		public Adapter caseExceptionHandling(ExceptionHandling object) {
			return createExceptionHandlingAdapter();
		}

		@Override
		public Adapter caseBody(Body object) {
			return createBodyAdapter();
		}

		@Override
		public Adapter caseJavaExceptionHandling(JavaExceptionHandling object) {
			return createJavaExceptionHandlingAdapter();
		}

		@Override
		public Adapter caseCatchClause(CatchClause object) {
			return createCatchClauseAdapter();
		}

		@Override
		public Adapter caseFinallyClause(FinallyClause object) {
			return createFinallyClauseAdapter();
		}

		@Override
		public Adapter caseTryClause(TryClause object) {
			return createTryClauseAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.MethodInvocation
	 * @generated
	 */
	public Adapter createMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.MethodChaining <em>Method Chaining</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.MethodChaining
	 * @generated
	 */
	public Adapter createMethodChainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.AccessModifier
	 * @generated
	 */
	public Adapter createAccessModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.ExceptionHandling <em>Exception Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.ExceptionHandling
	 * @generated
	 */
	public Adapter createExceptionHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.Body
	 * @generated
	 */
	public Adapter createBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.JavaExceptionHandling <em>Java Exception Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.JavaExceptionHandling
	 * @generated
	 */
	public Adapter createJavaExceptionHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.CatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.CatchClause
	 * @generated
	 */
	public Adapter createCatchClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.FinallyClause <em>Finally Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.FinallyClause
	 * @generated
	 */
	public Adapter createFinallyClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.statements.TryClause <em>Try Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.statements.TryClause
	 * @generated
	 */
	public Adapter createTryClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingConvention.elements.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingConvention.elements.Element
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
