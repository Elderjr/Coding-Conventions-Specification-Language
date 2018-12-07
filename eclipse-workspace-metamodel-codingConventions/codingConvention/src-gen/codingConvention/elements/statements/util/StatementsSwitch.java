/**
 */
package codingConvention.elements.statements.util;

import codingConvention.elements.Element;

import codingConvention.elements.statements.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see codingConvention.elements.statements.StatementsPackage
 * @generated
 */
public class StatementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsSwitch() {
		if (modelPackage == null) {
			modelPackage = StatementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case StatementsPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = caseElement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.METHOD_INVOCATION: {
			MethodInvocation methodInvocation = (MethodInvocation) theEObject;
			T result = caseMethodInvocation(methodInvocation);
			if (result == null)
				result = caseStatement(methodInvocation);
			if (result == null)
				result = caseElement(methodInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.METHOD_CHAINING: {
			MethodChaining methodChaining = (MethodChaining) theEObject;
			T result = caseMethodChaining(methodChaining);
			if (result == null)
				result = caseStatement(methodChaining);
			if (result == null)
				result = caseElement(methodChaining);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.ACCESS_MODIFIER: {
			AccessModifier accessModifier = (AccessModifier) theEObject;
			T result = caseAccessModifier(accessModifier);
			if (result == null)
				result = caseStatement(accessModifier);
			if (result == null)
				result = caseElement(accessModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.EXCEPTION_HANDLING: {
			ExceptionHandling exceptionHandling = (ExceptionHandling) theEObject;
			T result = caseExceptionHandling(exceptionHandling);
			if (result == null)
				result = caseStatement(exceptionHandling);
			if (result == null)
				result = caseElement(exceptionHandling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.BODY: {
			Body body = (Body) theEObject;
			T result = caseBody(body);
			if (result == null)
				result = caseStatement(body);
			if (result == null)
				result = caseElement(body);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.JAVA_EXCEPTION_HANDLING: {
			JavaExceptionHandling javaExceptionHandling = (JavaExceptionHandling) theEObject;
			T result = caseJavaExceptionHandling(javaExceptionHandling);
			if (result == null)
				result = caseExceptionHandling(javaExceptionHandling);
			if (result == null)
				result = caseStatement(javaExceptionHandling);
			if (result == null)
				result = caseElement(javaExceptionHandling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.CATCH_CLAUSE: {
			CatchClause catchClause = (CatchClause) theEObject;
			T result = caseCatchClause(catchClause);
			if (result == null)
				result = caseBody(catchClause);
			if (result == null)
				result = caseStatement(catchClause);
			if (result == null)
				result = caseElement(catchClause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.FINALLY_CLAUSE: {
			FinallyClause finallyClause = (FinallyClause) theEObject;
			T result = caseFinallyClause(finallyClause);
			if (result == null)
				result = caseBody(finallyClause);
			if (result == null)
				result = caseStatement(finallyClause);
			if (result == null)
				result = caseElement(finallyClause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.TRY_CLAUSE: {
			TryClause tryClause = (TryClause) theEObject;
			T result = caseTryClause(tryClause);
			if (result == null)
				result = caseBody(tryClause);
			if (result == null)
				result = caseStatement(tryClause);
			if (result == null)
				result = caseElement(tryClause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocation(MethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Chaining</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Chaining</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodChaining(MethodChaining object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessModifier(AccessModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandling(ExceptionHandling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBody(Body object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Exception Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Exception Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaExceptionHandling(JavaExceptionHandling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchClause(CatchClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finally Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finally Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinallyClause(FinallyClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryClause(TryClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StatementsSwitch
