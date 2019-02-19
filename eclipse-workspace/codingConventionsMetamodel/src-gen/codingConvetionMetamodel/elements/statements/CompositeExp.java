/**
 */
package codingConvetionMetamodel.elements.statements;

import codingConvetionMetamodel.LogicOperators;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.CompositeExp#getLogicOperator <em>Logic Operator</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.statements.CompositeExp#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getCompositeExp()
 * @model
 * @generated
 */
public interface CompositeExp extends Expression {
	/**
	 * Returns the value of the '<em><b>Logic Operator</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link codingConvetionMetamodel.LogicOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Operator</em>' attribute.
	 * @see codingConvetionMetamodel.LogicOperators
	 * @see #setLogicOperator(LogicOperators)
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getCompositeExp_LogicOperator()
	 * @model default="ANY"
	 * @generated
	 */
	LogicOperators getLogicOperator();

	/**
	 * Sets the value of the '{@link codingConvetionMetamodel.elements.statements.CompositeExp#getLogicOperator <em>Logic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Operator</em>' attribute.
	 * @see codingConvetionMetamodel.LogicOperators
	 * @see #getLogicOperator()
	 * @generated
	 */
	void setLogicOperator(LogicOperators value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getCompositeExp_Expressions()
	 * @model type="codingConvetionMetamodel.elements.statements.Expression" containment="true"
	 * @generated
	 */
	EList getExpressions();

} // CompositeExp
