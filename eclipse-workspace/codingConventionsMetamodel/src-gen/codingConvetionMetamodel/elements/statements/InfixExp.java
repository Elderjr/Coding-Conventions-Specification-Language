/**
 */
package codingConvetionMetamodel.elements.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infix Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.InfixExp#getLeft <em>Left</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.statements.InfixExp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getInfixExp()
 * @model
 * @generated
 */
public interface InfixExp extends AtomicExp {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getInfixExp_Left()
	 * @model type="codingConvetionMetamodel.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getLeft();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getInfixExp_Right()
	 * @model type="codingConvetionMetamodel.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getRight();

} // InfixExp
