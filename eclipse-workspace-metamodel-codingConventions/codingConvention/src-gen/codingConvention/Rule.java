/**
 */
package codingConvention;

import codingConvention.elements.Element;

import codingConvention.filters.Filter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.Rule#getMatchElements <em>Match Elements</em>}</li>
 *   <li>{@link codingConvention.Rule#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see codingConvention.CodingConventionPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Elements</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Elements</em>' containment reference list.
	 * @see codingConvention.CodingConventionPackage#getRule_MatchElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Element> getMatchElements();

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.filters.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see codingConvention.CodingConventionPackage#getRule_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

} // Rule
