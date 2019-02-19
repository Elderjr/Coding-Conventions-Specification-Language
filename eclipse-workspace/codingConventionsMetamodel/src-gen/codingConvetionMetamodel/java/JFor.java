/**
 */
package codingConvetionMetamodel.java;

import codingConvetionMetamodel.elements.statements.Block;
import codingConvetionMetamodel.elements.statements.LoopControl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JFor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.java.JFor#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link codingConvetionMetamodel.java.JFor#getUpdaters <em>Updaters</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.java.JavaPackage#getJFor()
 * @model
 * @generated
 */
public interface JFor extends Block, JElement, LoopControl {
	/**
	 * Returns the value of the '<em><b>Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializers</em>' containment reference list.
	 * @see codingConvetionMetamodel.java.JavaPackage#getJFor_Initializers()
	 * @model type="codingConvetionMetamodel.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getInitializers();

	/**
	 * Returns the value of the '<em><b>Updaters</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updaters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updaters</em>' containment reference list.
	 * @see codingConvetionMetamodel.java.JavaPackage#getJFor_Updaters()
	 * @model type="codingConvetionMetamodel.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getUpdaters();

} // JFor
