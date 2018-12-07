/**
 */
package codingConvention.filters;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.filters.CompositeFilter#getFilter <em>Filter</em>}</li>
 *   <li>{@link codingConvention.filters.CompositeFilter#getNewAttribute <em>New Attribute</em>}</li>
 * </ul>
 *
 * @see codingConvention.filters.FiltersPackage#getCompositeFilter()
 * @model
 * @generated
 */
public interface CompositeFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.filters.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see codingConvention.filters.FiltersPackage#getCompositeFilter_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilter();

	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link codingConvention.filters.FilterOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute</em>' attribute.
	 * @see codingConvention.filters.FilterOperation
	 * @see #setNewAttribute(FilterOperation)
	 * @see codingConvention.filters.FiltersPackage#getCompositeFilter_NewAttribute()
	 * @model
	 * @generated
	 */
	FilterOperation getNewAttribute();

	/**
	 * Sets the value of the '{@link codingConvention.filters.CompositeFilter#getNewAttribute <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Attribute</em>' attribute.
	 * @see codingConvention.filters.FilterOperation
	 * @see #getNewAttribute()
	 * @generated
	 */
	void setNewAttribute(FilterOperation value);

} // CompositeFilter
