/**
 */
package ccsl.java;

import ccsl.elements.statements.Access;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.java.ThrowStatement#getThrows <em>Throws</em>}</li>
 * </ul>
 *
 * @see ccsl.java.JavaPackage#getThrowStatement()
 * @model
 * @generated
 */
public interface ThrowStatement extends JElement {
	/**
	 * Returns the value of the '<em><b>Throws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' containment reference.
	 * @see #setThrows(Access)
	 * @see ccsl.java.JavaPackage#getThrowStatement_Throws()
	 * @model containment="true"
	 * @generated
	 */
	Access getThrows();

	/**
	 * Sets the value of the '{@link ccsl.java.ThrowStatement#getThrows <em>Throws</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' containment reference.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(Access value);

} // ThrowStatement
