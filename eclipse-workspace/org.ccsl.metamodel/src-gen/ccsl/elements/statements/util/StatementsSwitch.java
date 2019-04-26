/**
 */
package ccsl.elements.statements.util;

import ccsl.elements.Element;

import ccsl.elements.statements.*;

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
 * @see ccsl.elements.statements.StatementsPackage
 * @generated
 */
public class StatementsSwitch {
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
		case StatementsPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			Object result = caseStatement(statement);
			if (result == null)
				result = caseElement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.NAMED_ELEMENT_ACCESS: {
			NamedElementAccess namedElementAccess = (NamedElementAccess) theEObject;
			Object result = caseNamedElementAccess(namedElementAccess);
			if (result == null)
				result = caseStatement(namedElementAccess);
			if (result == null)
				result = caseElement(namedElementAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.VARIABLE_ACCESS: {
			VariableAccess variableAccess = (VariableAccess) theEObject;
			Object result = caseVariableAccess(variableAccess);
			if (result == null)
				result = caseAccess(variableAccess);
			if (result == null)
				result = caseStatement(variableAccess);
			if (result == null)
				result = caseElement(variableAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.COMPLEX_TYPE_ACCESS: {
			ComplexTypeAccess complexTypeAccess = (ComplexTypeAccess) theEObject;
			Object result = caseComplexTypeAccess(complexTypeAccess);
			if (result == null)
				result = caseAccess(complexTypeAccess);
			if (result == null)
				result = caseStatement(complexTypeAccess);
			if (result == null)
				result = caseElement(complexTypeAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.METHOD_INVOCATION: {
			MethodInvocation methodInvocation = (MethodInvocation) theEObject;
			Object result = caseMethodInvocation(methodInvocation);
			if (result == null)
				result = caseAccess(methodInvocation);
			if (result == null)
				result = caseStatement(methodInvocation);
			if (result == null)
				result = caseElement(methodInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.ACCESS: {
			Access access = (Access) theEObject;
			Object result = caseAccess(access);
			if (result == null)
				result = caseStatement(access);
			if (result == null)
				result = caseElement(access);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.LITERAL_VALUE: {
			LiteralValue literalValue = (LiteralValue) theEObject;
			Object result = caseLiteralValue(literalValue);
			if (result == null)
				result = caseStatement(literalValue);
			if (result == null)
				result = caseElement(literalValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			Object result = caseExpression(expression);
			if (result == null)
				result = caseStatement(expression);
			if (result == null)
				result = caseElement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.COMPOSITE_EXP: {
			CompositeExp compositeExp = (CompositeExp) theEObject;
			Object result = caseCompositeExp(compositeExp);
			if (result == null)
				result = caseExpression(compositeExp);
			if (result == null)
				result = caseStatement(compositeExp);
			if (result == null)
				result = caseElement(compositeExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.ATOMIC_EXP: {
			AtomicExp atomicExp = (AtomicExp) theEObject;
			Object result = caseAtomicExp(atomicExp);
			if (result == null)
				result = caseExpression(atomicExp);
			if (result == null)
				result = caseStatement(atomicExp);
			if (result == null)
				result = caseElement(atomicExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			Object result = caseControlFlow(controlFlow);
			if (result == null)
				result = caseStatement(controlFlow);
			if (result == null)
				result = caseElement(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.VAR_ASSIGNMENT: {
			VarAssignment varAssignment = (VarAssignment) theEObject;
			Object result = caseVarAssignment(varAssignment);
			if (result == null)
				result = caseStatement(varAssignment);
			if (result == null)
				result = caseElement(varAssignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.BRANCH_CONTROL: {
			BranchControl branchControl = (BranchControl) theEObject;
			Object result = caseBranchControl(branchControl);
			if (result == null)
				result = caseControlFlow(branchControl);
			if (result == null)
				result = caseStatement(branchControl);
			if (result == null)
				result = caseElement(branchControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.LOOP_CONTROL: {
			LoopControl loopControl = (LoopControl) theEObject;
			Object result = caseLoopControl(loopControl);
			if (result == null)
				result = caseControlFlow(loopControl);
			if (result == null)
				result = caseStatement(loopControl);
			if (result == null)
				result = caseElement(loopControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.BLOCK: {
			Block block = (Block) theEObject;
			Object result = caseBlock(block);
			if (result == null)
				result = caseStatement(block);
			if (result == null)
				result = caseElement(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.IF_STATEMENT: {
			IfStatement ifStatement = (IfStatement) theEObject;
			Object result = caseIfStatement(ifStatement);
			if (result == null)
				result = caseControlFlow(ifStatement);
			if (result == null)
				result = caseStatement(ifStatement);
			if (result == null)
				result = caseElement(ifStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.PREFIX_EXP: {
			PrefixExp prefixExp = (PrefixExp) theEObject;
			Object result = casePrefixExp(prefixExp);
			if (result == null)
				result = caseAtomicExp(prefixExp);
			if (result == null)
				result = caseExpression(prefixExp);
			if (result == null)
				result = caseStatement(prefixExp);
			if (result == null)
				result = caseElement(prefixExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.INFIX_EXP: {
			InfixExp infixExp = (InfixExp) theEObject;
			Object result = caseInfixExp(infixExp);
			if (result == null)
				result = caseAtomicExp(infixExp);
			if (result == null)
				result = caseExpression(infixExp);
			if (result == null)
				result = caseStatement(infixExp);
			if (result == null)
				result = caseElement(infixExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.POSTFIX_EXP: {
			PostfixExp postfixExp = (PostfixExp) theEObject;
			Object result = casePostfixExp(postfixExp);
			if (result == null)
				result = caseAtomicExp(postfixExp);
			if (result == null)
				result = caseExpression(postfixExp);
			if (result == null)
				result = caseStatement(postfixExp);
			if (result == null)
				result = caseElement(postfixExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.SUPER_METHOD_INVOCATION: {
			SuperMethodInvocation superMethodInvocation = (SuperMethodInvocation) theEObject;
			Object result = caseSuperMethodInvocation(superMethodInvocation);
			if (result == null)
				result = caseMethodInvocation(superMethodInvocation);
			if (result == null)
				result = caseAccess(superMethodInvocation);
			if (result == null)
				result = caseStatement(superMethodInvocation);
			if (result == null)
				result = caseElement(superMethodInvocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.VAR_DECLARATION: {
			VarDeclaration varDeclaration = (VarDeclaration) theEObject;
			Object result = caseVarDeclaration(varDeclaration);
			if (result == null)
				result = caseStatement(varDeclaration);
			if (result == null)
				result = caseElement(varDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatementsPackage.INSTANCE_CREATION: {
			InstanceCreation instanceCreation = (InstanceCreation) theEObject;
			Object result = caseInstanceCreation(instanceCreation);
			if (result == null)
				result = caseMethodInvocation(instanceCreation);
			if (result == null)
				result = caseAccess(instanceCreation);
			if (result == null)
				result = caseStatement(instanceCreation);
			if (result == null)
				result = caseElement(instanceCreation);
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
	public Object caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElementAccess(NamedElementAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariableAccess(VariableAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComplexTypeAccess(ComplexTypeAccess object) {
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
	public Object caseMethodInvocation(MethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAccess(Access object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLiteralValue(LiteralValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Composite Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompositeExp(CompositeExp object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Var Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVarAssignment(VarAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBranchControl(BranchControl object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrefixExp(PrefixExp object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Postfix Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postfix Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostfixExp(PostfixExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSuperMethodInvocation(SuperMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVarDeclaration(VarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstanceCreation(InstanceCreation object) {
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

} //StatementsSwitch
