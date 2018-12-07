/**
 */
package codingConvention.elements.statements;

import codingConvention.elements.namedElements.NamedElement;

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
 *   <li>{@link codingConvention.elements.statements.MethodInvocation#getFrom <em>From</em>}</li>
 *   <li>{@link codingConvention.elements.statements.MethodInvocation#getTo <em>To</em>}</li>
 *   <li>{@link codingConvention.elements.statements.MethodInvocation#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.statements.StatementsPackage#getMethodInvocation()
 * @model
 * @generated
 */
public interface MethodInvocation extends Statement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(NamedElement)
	 * @see codingConvention.elements.statements.StatementsPackage#getMethodInvocation_From()
	 * @model
	 * @generated
	 */
	NamedElement getFrom();

	/**
	 * Sets the value of the '{@link codingConvention.elements.statements.MethodInvocation#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(NamedElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(NamedElement)
	 * @see codingConvention.elements.statements.StatementsPackage#getMethodInvocation_To()
	 * @model
	 * @generated
	 */
	NamedElement getTo();

	/**
	 * Sets the value of the '{@link codingConvention.elements.statements.MethodInvocation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see codingConvention.elements.statements.StatementsPackage#getMethodInvocation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getArguments();

} // MethodInvocation
