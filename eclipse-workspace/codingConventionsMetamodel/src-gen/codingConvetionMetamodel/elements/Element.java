/**
 */
package codingConvetionMetamodel.elements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.Element#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.elements.ElementsPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.ElementsPackage#getElement_Property()
	 * @model type="codingConvetionMetamodel.elements.Property" containment="true"
	 * @generated
	 */
	EList getProperty();

} // Element
