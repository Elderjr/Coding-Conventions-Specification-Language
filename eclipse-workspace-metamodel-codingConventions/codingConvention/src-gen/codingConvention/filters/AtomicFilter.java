/**
 */
package codingConvention.filters;

import codingConvention.elements.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.filters.AtomicFilter#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see codingConvention.filters.FiltersPackage#getAtomicFilter()
 * @model abstract="true"
 * @generated
 */
public interface AtomicFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Element)
	 * @see codingConvention.filters.FiltersPackage#getAtomicFilter_Target()
	 * @model required="true"
	 * @generated
	 */
	Element getTarget();

	/**
	 * Sets the value of the '{@link codingConvention.filters.AtomicFilter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Element value);

} // AtomicFilter
