/**
 */
package ccsl.java;

import ccsl.elements.namedElements.ComplexType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.java.JClass#getNestedClasses <em>Nested Classes</em>}</li>
 *   <li>{@link ccsl.java.JClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link ccsl.java.JClass#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @see ccsl.java.JavaPackage#getJClass()
 * @model
 * @generated
 */
public interface JClass extends ComplexType, JElement {
	/**
	 * Returns the value of the '<em><b>Nested Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.java.JClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Classes</em>' containment reference list.
	 * @see ccsl.java.JavaPackage#getJClass_NestedClasses()
	 * @model type="ccsl.java.JClass" containment="true"
	 * @generated
	 */
	EList getNestedClasses();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link ccsl.java.JInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see ccsl.java.JavaPackage#getJClass_Implements()
	 * @model type="ccsl.java.JInterface"
	 * @generated
	 */
	EList getImplements();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.statements.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see ccsl.java.JavaPackage#getJClass_Blocks()
	 * @model type="ccsl.elements.statements.Block" containment="true"
	 * @generated
	 */
	EList getBlocks();

} // JClass
