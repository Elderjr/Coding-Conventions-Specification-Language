/**
 */
package codingConvetionMetamodel.filters;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.filters.PropertyFilter#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.filters.FiltersPackage#getPropertyFilter()
 * @model
 * @generated
 */
public interface PropertyFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getPropertyFilter_Properties()
	 * @model type="codingConvetionMetamodel.elements.Property" containment="true" required="true"
	 * @generated
	 */
	EList getProperties();

} // PropertyFilter
