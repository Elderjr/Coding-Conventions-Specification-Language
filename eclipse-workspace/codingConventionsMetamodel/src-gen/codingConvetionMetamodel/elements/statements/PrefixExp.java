/**
 */
package codingConvetionMetamodel.elements.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.PrefixExp#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getPrefixExp()
 * @model
 * @generated
 */
public interface PrefixExp extends AtomicExp {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.VariableAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getPrefixExp_Operand()
	 * @model type="codingConvetionMetamodel.elements.statements.VariableAccess" containment="true"
	 * @generated
	 */
	EList getOperand();

} // PrefixExp
