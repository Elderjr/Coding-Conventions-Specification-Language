/**
 */
package codingConvetionMetamodel.elements.statements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.Block#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getBlock_Statements()
	 * @model type="codingConvetionMetamodel.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getStatements();

} // Block
