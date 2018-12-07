/**
 */
package codingConvention.elements.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Exception Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.statements.JavaExceptionHandling#getFinallyClause <em>Finally Clause</em>}</li>
 *   <li>{@link codingConvention.elements.statements.JavaExceptionHandling#getCatchClause <em>Catch Clause</em>}</li>
 *   <li>{@link codingConvention.elements.statements.JavaExceptionHandling#getTryClause <em>Try Clause</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.statements.StatementsPackage#getJavaExceptionHandling()
 * @model
 * @generated
 */
public interface JavaExceptionHandling extends ExceptionHandling {
	/**
	 * Returns the value of the '<em><b>Finally Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finally Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally Clause</em>' containment reference.
	 * @see #setFinallyClause(FinallyClause)
	 * @see codingConvention.elements.statements.StatementsPackage#getJavaExceptionHandling_FinallyClause()
	 * @model containment="true"
	 * @generated
	 */
	FinallyClause getFinallyClause();

	/**
	 * Sets the value of the '{@link codingConvention.elements.statements.JavaExceptionHandling#getFinallyClause <em>Finally Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finally Clause</em>' containment reference.
	 * @see #getFinallyClause()
	 * @generated
	 */
	void setFinallyClause(FinallyClause value);

	/**
	 * Returns the value of the '<em><b>Catch Clause</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.statements.CatchClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clause</em>' containment reference list.
	 * @see codingConvention.elements.statements.StatementsPackage#getJavaExceptionHandling_CatchClause()
	 * @model containment="true"
	 * @generated
	 */
	EList<CatchClause> getCatchClause();

	/**
	 * Returns the value of the '<em><b>Try Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Try Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Try Clause</em>' containment reference.
	 * @see #setTryClause(TryClause)
	 * @see codingConvention.elements.statements.StatementsPackage#getJavaExceptionHandling_TryClause()
	 * @model containment="true"
	 * @generated
	 */
	TryClause getTryClause();

	/**
	 * Sets the value of the '{@link codingConvention.elements.statements.JavaExceptionHandling#getTryClause <em>Try Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Try Clause</em>' containment reference.
	 * @see #getTryClause()
	 * @generated
	 */
	void setTryClause(TryClause value);

} // JavaExceptionHandling
