/**
 */
package codingConvention.elements.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Chaining</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.statements.MethodChaining#getInvocations <em>Invocations</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.statements.StatementsPackage#getMethodChaining()
 * @model
 * @generated
 */
public interface MethodChaining extends Statement {
	/**
	 * Returns the value of the '<em><b>Invocations</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.statements.MethodInvocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocations</em>' containment reference list.
	 * @see codingConvention.elements.statements.StatementsPackage#getMethodChaining_Invocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodInvocation> getInvocations();

} // MethodChaining
