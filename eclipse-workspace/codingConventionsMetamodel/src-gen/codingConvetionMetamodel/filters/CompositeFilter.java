/**
 */
package codingConvetionMetamodel.filters;

import codingConvetionMetamodel.LogicOperators;

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
 *   <li>{@link codingConvetionMetamodel.filters.CompositeFilter#getFilter <em>Filter</em>}</li>
 *   <li>{@link codingConvetionMetamodel.filters.CompositeFilter#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.filters.FiltersPackage#getCompositeFilter()
 * @model
 * @generated
 */
public interface CompositeFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.filters.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getCompositeFilter_Filter()
	 * @model type="codingConvetionMetamodel.filters.Filter" containment="true" required="true"
	 * @generated
	 */
	EList getFilter();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link codingConvetionMetamodel.LogicOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see codingConvetionMetamodel.LogicOperators
	 * @see #setOperator(LogicOperators)
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getCompositeFilter_Operator()
	 * @model
	 * @generated
	 */
	LogicOperators getOperator();

	/**
	 * Sets the value of the '{@link codingConvetionMetamodel.filters.CompositeFilter#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see codingConvetionMetamodel.LogicOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicOperators value);

} // CompositeFilter
