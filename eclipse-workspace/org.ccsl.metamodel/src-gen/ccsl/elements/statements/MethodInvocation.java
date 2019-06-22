/**
 */
package ccsl.elements.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.MethodInvocation#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.StatementsPackage#getMethodInvocation()
 * @model
 * @generated
 */
public interface MethodInvocation extends Access {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see ccsl.elements.statements.StatementsPackage#getMethodInvocation_Args()
	 * @model type="ccsl.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getArgs();

} // MethodInvocation
