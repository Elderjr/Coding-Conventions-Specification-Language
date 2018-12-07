/**
 */
package codingConvention.elements.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.statements.Body#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.statements.StatementsPackage#getBody()
 * @model abstract="true"
 * @generated
 */
public interface Body extends Statement {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see codingConvention.elements.statements.StatementsPackage#getBody_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // Body
