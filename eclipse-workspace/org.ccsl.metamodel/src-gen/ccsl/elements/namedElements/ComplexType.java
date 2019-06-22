/**
 */
package ccsl.elements.namedElements;

import ccsl.elements.datatype.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.ComplexType#getFields <em>Fields</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.ComplexType#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.ComplexType#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see ccsl.elements.namedElements.NamedElementsPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends NamedElement, DataType {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see ccsl.elements.namedElements.NamedElementsPackage#getComplexType_Fields()
	 * @model type="ccsl.elements.namedElements.Variable" containment="true"
	 * @generated
	 */
	EList getFields();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see ccsl.elements.namedElements.NamedElementsPackage#getComplexType_SuperTypes()
	 * @model type="ccsl.elements.namedElements.ComplexType"
	 * @generated
	 */
	EList getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.namedElements.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see ccsl.elements.namedElements.NamedElementsPackage#getComplexType_Methods()
	 * @model type="ccsl.elements.namedElements.Method" containment="true"
	 * @generated
	 */
	EList getMethods();

} // ComplexType
