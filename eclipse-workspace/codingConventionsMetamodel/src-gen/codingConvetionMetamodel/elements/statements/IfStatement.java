/**
 */
package codingConvetionMetamodel.elements.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.IfStatement#getTrueStatements <em>True Statements</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.statements.IfStatement#getFalseStatements <em>False Statements</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends ControlFlow {
	/**
	 * Returns the value of the '<em><b>True Statements</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Statements</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getIfStatement_TrueStatements()
	 * @model type="codingConvetionMetamodel.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getTrueStatements();

	/**
	 * Returns the value of the '<em><b>False Statements</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Statements</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getIfStatement_FalseStatements()
	 * @model type="codingConvetionMetamodel.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getFalseStatements();

} // IfStatement
