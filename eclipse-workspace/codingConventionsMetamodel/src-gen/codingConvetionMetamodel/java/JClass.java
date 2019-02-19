/**
 */
package codingConvetionMetamodel.java;

import codingConvetionMetamodel.elements.namedElements.ComplexType;

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
 *   <li>{@link codingConvetionMetamodel.java.JClass#getNestedClasses <em>Nested Classes</em>}</li>
 *   <li>{@link codingConvetionMetamodel.java.JClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link codingConvetionMetamodel.java.JClass#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.java.JavaPackage#getJClass()
 * @model
 * @generated
 */
public interface JClass extends ComplexType, JElement {
	/**
	 * Returns the value of the '<em><b>Nested Classes</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.java.JClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Classes</em>' containment reference list.
	 * @see codingConvetionMetamodel.java.JavaPackage#getJClass_NestedClasses()
	 * @model type="codingConvetionMetamodel.java.JClass" containment="true"
	 * @generated
	 */
	EList getNestedClasses();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.java.JInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see codingConvetionMetamodel.java.JavaPackage#getJClass_Implements()
	 * @model type="codingConvetionMetamodel.java.JInterface"
	 * @generated
	 */
	EList getImplements();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see codingConvetionMetamodel.java.JavaPackage#getJClass_Blocks()
	 * @model type="codingConvetionMetamodel.elements.statements.Block" containment="true"
	 * @generated
	 */
	EList getBlocks();

} // JClass
