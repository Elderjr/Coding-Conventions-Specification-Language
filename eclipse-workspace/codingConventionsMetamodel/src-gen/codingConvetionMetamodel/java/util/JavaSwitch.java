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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see codingConvetionMetamodel.java.JavaPackage
 * @generated
 */
public class JavaSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case JavaPackage.JELEMENT: {
			JElement jElement = (JElement) theEObject;
			Object result = caseJElement(jElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.JCLASS: {
			JClass jClass = (JClass) theEObject;
			Object result = caseJClass(jClass);
			if (result == null)
				result = caseComplexType(jClass);
			if (result == null)
				result = caseJElement(jClass);
			if (result == null)
				result = caseNamedElement(jClass);
			if (result == null)
				result = caseDataType(jClass);
			if (result == null)
				result = caseElement(jClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.JINTERFACE: {
			JInterface jInterface = (JInterface) theEObject;
			Object result = caseJInterface(jInterface);
			if (result == null)
				result = caseJElement(jInterface);
			if (result == null)
				result = caseComplexType(jInterface);
			if (result == null)
				result = caseNamedElement(jInterface);
			if (result == null)
				result = caseDataType(jInterface);
			if (result == null)
				result = caseElement(jInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.JMETHOD: {
			JMethod jMethod = (JMethod) theEObject;
			Object result = caseJMethod(jMethod);
			if (result == null)
				result = caseMethod(jMethod);
			if (result == null)
				result = caseNamedElement(jMethod);
			if (result == null)
				result = caseElement(jMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.JCONSTRUCTOR: {
			JConstructor jConstructor = (JConstructor) theEObject;
			Object result = caseJConstructor(jConstructor);
			if (result == null)
				result = caseJMethod(jConstructor);
			if (result == null)
				result = caseMethod(jConstructor);
			if (result == null)
				result = caseNamedElement(jConstructor);
			if (result == null)
				result = caseElement(jConstructor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.JTRY_CATCH: {
			JTryCatch jTryCatch = (JTryCatch) theEObject;
			Object result = caseJTryCatch(jTryCatch);
			if (result == null)
				result = caseJElement(jTryCatch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.JTRY_CLAUSE: {
			JTryClause jTryClause = (JTryClause) theEObject;
			Object result = caseJTryClause(jTryClause);
			if (result == null)
				result = caseBlock(jTryClause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.JCATCH_CLAUSE: {
			JCatchClause jCatchClause = (JCatchClause) theEObject;
			Object result = caseJCatchClause(jCatchClause);
			if (result == null)
				result = caseBlock(jCatchClause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.INSTANCE_OF: {
			InstanceOf instanceOf = (InstanceOf) theEObject;
			Object result = caseInstanceOf(instanceOf);
			if (result == null)
				result = caseJElement(instanceOf);
			if (result == null)
				result = caseInfixExp(instanceOf);
			if (result == null)
				result = caseElement(instanceOf);
			if (result == null)
				result = caseAtomicExp(instanceOf);
			if (result == null)
				result = caseExpression(instanceOf);
			if (result == null)
				result = caseStatement(instanceOf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.THROW_STATEMENT: {
			ThrowStatement throwStatement = (ThrowStatement) theEObject;
			Object result = caseThrowStatement(throwStatement);
			if (result == null)
				result = caseJElement(throwStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.JFOR: {
			JFor jFor = (JFor) theEObject;
			Object result = caseJFor(jFor);
			if (result == null)
				result = caseBlock(jFor);
			if (result == null)
				result = caseJElement(jFor);
			if (result == null)
				result = caseLoopControl(jFor);
			if (result == null)
				result = caseControlFlow(jFor);
			if (result == null)
				result = caseStatement(jFor);
			if (result == null)
				result = caseElement(jFor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaPackage.JRETURN_STATEMENT: {
			JReturnStatement jReturnStatement = (JReturnStatement) theEObject;
			Object result = caseJReturnStatement(jReturnStatement);
			if (result == null)
				result = caseJElement(jReturnStatement);
			if (result == null)
				result = caseStatement(jReturnStatement);
			if (result == null)
				result = caseElement(jReturnStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJElement(JElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJClass(JClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJInterface(JInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJMethod(JMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JConstructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JConstructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJConstructor(JConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JTry Catch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JTry Catch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJTryCatch(JTryCatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JTry Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JTry Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJTryClause(JTryClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JCatch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JCatch Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJCatchClause(JCatchClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstanceOf(InstanceOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseThrowStatement(ThrowStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JFor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JFor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJFor(JFor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JReturn Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JReturn Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJReturnStatement(JReturnStatement object) {
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
	public Object caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComplexType(ComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlock(Block object) {
		return null;
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
	public Object caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAtomicExp(AtomicExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInfixExp(InfixExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLoopControl(LoopControl object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //JavaSwitch
