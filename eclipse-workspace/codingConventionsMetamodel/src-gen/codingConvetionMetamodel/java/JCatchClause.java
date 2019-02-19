/**
 */
package codingConvetionMetamodel.java;

import codingConvetionMetamodel.elements.namedElements.Variable;

import codingConvetionMetamodel.elements.statements.Block;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCatch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.java.JCatchClause#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link codingConvetionMetamodel.java.JCatchClause#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.java.JavaPackage#getJCatchClause()
 * @model
 * @generated
 */
public interface JCatchClause extends Block {
	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.java.JClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' reference list.
	 * @see codingConvetionMetamodel.java.JavaPackage#getJCatchClause_Exceptions()
	 * @model type="codingConvetionMetamodel.java.JClass"
	 * @generated
	 */
	EList getExceptions();

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference.
	 * @see #setParam(Variable)
	 * @see codingConvetionMetamodel.java.JavaPackage#getJCatchClause_Param()
	 * @model containment="true"
	 * @generated
	 */
	Variable getParam();

	/**
	 * Sets the value of the '{@link codingConvetionMetamodel.java.JCatchClause#getParam <em>Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' containment reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(Variable value);

} // JCatchClause
