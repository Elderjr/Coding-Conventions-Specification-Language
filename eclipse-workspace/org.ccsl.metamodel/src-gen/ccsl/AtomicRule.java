/**
 */
package ccsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.AtomicRule#getElements <em>Elements</em>}</li>
 *   <li>{@link ccsl.AtomicRule#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see ccsl.ccslPackage#getAtomicRule()
 * @model
 * @generated
 */
public interface AtomicRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ccsl.ccslPackage#getAtomicRule_Elements()
	 * @model type="ccsl.elements.Element" containment="true" required="true"
	 * @generated
	 */
	EList getElements();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.filters.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see ccsl.ccslPackage#getAtomicRule_Filter()
	 * @model type="ccsl.filters.Filter" containment="true"
	 * @generated
	 */
	EList getFilter();

} // AtomicRule
