/**
 */
package ccsl.elements.statements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.statements.NamedElementAccess#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.statements.StatementsPackage#getNamedElementAccess()
 * @model
 * @generated
 */
public interface NamedElementAccess extends Statement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Statement)
	 * @see ccsl.elements.statements.StatementsPackage#getNamedElementAccess_From()
	 * @model
	 * @generated
	 */
	Statement getFrom();

	/**
	 * Sets the value of the '{@link ccsl.elements.statements.NamedElementAccess#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Statement value);

} // NamedElementAccess
