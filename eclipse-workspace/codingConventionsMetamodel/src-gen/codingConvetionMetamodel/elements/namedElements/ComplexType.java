/**
 */
package codingConvetionMetamodel.elements.namedElements;

import codingConvetionMetamodel.elements.datatype.DataType;

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
 *   <li>{@link codingConvetionMetamodel.elements.namedElements.ComplexType#getFields <em>Fields</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.namedElements.ComplexType#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.elements.namedElements.NamedElementsPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends NamedElement, DataType {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.namedElements.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.namedElements.NamedElementsPackage#getComplexType_Fields()
	 * @model type="codingConvetionMetamodel.elements.namedElements.Variable" containment="true"
	 * @generated
	 */
	EList getFields();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.namedElements.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see codingConvetionMetamodel.elements.namedElements.NamedElementsPackage#getComplexType_SuperTypes()
	 * @model type="codingConvetionMetamodel.elements.namedElements.ComplexType"
	 * @generated
	 */
	EList getSuperTypes();

} // ComplexType
