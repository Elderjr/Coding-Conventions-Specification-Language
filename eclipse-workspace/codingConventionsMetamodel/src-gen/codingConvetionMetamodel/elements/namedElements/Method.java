/**
 */
package codingConvetionMetamodel.elements.namedElements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.namedElements.Method#getParams <em>Params</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.namedElements.Method#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.elements.namedElements.NamedElementsPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.namedElements.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.namedElements.NamedElementsPackage#getMethod_Params()
	 * @model type="codingConvetionMetamodel.elements.namedElements.Variable" containment="true"
	 * @generated
	 */
	EList getParams();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.datatype.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference list.
	 * @see codingConvetionMetamodel.elements.namedElements.NamedElementsPackage#getMethod_ReturnType()
	 * @model type="codingConvetionMetamodel.elements.datatype.DataType"
	 * @generated
	 */
	EList getReturnType();

} // Method
