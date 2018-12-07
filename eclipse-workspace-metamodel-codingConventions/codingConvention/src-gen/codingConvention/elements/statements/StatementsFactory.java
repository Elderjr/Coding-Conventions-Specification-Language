/**
 */
package codingConvention.elements.statements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codingConvention.elements.statements.StatementsPackage
 * @generated
 */
public interface StatementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementsFactory eINSTANCE = codingConvention.elements.statements.impl.StatementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Invocation</em>'.
	 * @generated
	 */
	MethodInvocation createMethodInvocation();

	/**
	 * Returns a new object of class '<em>Method Chaining</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Chaining</em>'.
	 * @generated
	 */
	MethodChaining createMethodChaining();

	/**
	 * Returns a new object of class '<em>Access Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Modifier</em>'.
	 * @generated
	 */
	AccessModifier createAccessModifier();

	/**
	 * Returns a new object of class '<em>Java Exception Handling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Exception Handling</em>'.
	 * @generated
	 */
	JavaExceptionHandling createJavaExceptionHandling();

	/**
	 * Returns a new object of class '<em>Catch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catch Clause</em>'.
	 * @generated
	 */
	CatchClause createCatchClause();

	/**
	 * Returns a new object of class '<em>Finally Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finally Clause</em>'.
	 * @generated
	 */
	FinallyClause createFinallyClause();

	/**
	 * Returns a new object of class '<em>Try Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Try Clause</em>'.
	 * @generated
	 */
	TryClause createTryClause();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatementsPackage getStatementsPackage();

} //StatementsFactory
