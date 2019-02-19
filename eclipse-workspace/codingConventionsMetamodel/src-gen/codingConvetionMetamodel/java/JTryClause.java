/**
 */
package codingConvetionMetamodel.java;

import codingConvetionMetamodel.elements.statements.Block;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JTry Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.java.JTryClause#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.java.JavaPackage#getJTryClause()
 * @model
 * @generated
 */
public interface JTryClause extends Block {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see codingConvetionMetamodel.java.JavaPackage#getJTryClause_Resources()
	 * @model type="codingConvetionMetamodel.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getResources();

} // JTryClause
