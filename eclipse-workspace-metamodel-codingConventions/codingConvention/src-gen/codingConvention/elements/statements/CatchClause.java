/**
 */
package codingConvention.elements.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.statements.CatchClause#getExceptionHandled <em>Exception Handled</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.statements.StatementsPackage#getCatchClause()
 * @model
 * @generated
 */
public interface CatchClause extends Body {
	/**
	 * Returns the value of the '<em><b>Exception Handled</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.namedElements.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Handled</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Handled</em>' containment reference list.
	 * @see codingConvention.elements.statements.StatementsPackage#getCatchClause_ExceptionHandled()
	 * @model containment="true"
	 * @generated
	 */
	EList<codingConvention.elements.namedElements.Exception> getExceptionHandled();

} // CatchClause
