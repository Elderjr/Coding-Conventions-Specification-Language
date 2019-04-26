/**
 */
package ccsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.CompositeRule#getOperator <em>Operator</em>}</li>
 *   <li>{@link ccsl.CompositeRule#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see ccsl.ccslPackage#getCompositeRule()
 * @model
 * @generated
 */
public interface CompositeRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ccsl.LogicOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ccsl.LogicOperators
	 * @see #setOperator(LogicOperators)
	 * @see ccsl.ccslPackage#getCompositeRule_Operator()
	 * @model
	 * @generated
	 */
	LogicOperators getOperator();

	/**
	 * Sets the value of the '{@link ccsl.CompositeRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ccsl.LogicOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicOperators value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see ccsl.ccslPackage#getCompositeRule_Rule()
	 * @model type="ccsl.Rule" containment="true" lower="2"
	 * @generated
	 */
	EList getRule();

} // CompositeRule
