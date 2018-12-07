/**
 */
package codingConvention.filters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.filters.Filter#isNegated <em>Negated</em>}</li>
 * </ul>
 *
 * @see codingConvention.filters.FiltersPackage#getFilter()
 * @model abstract="true"
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see codingConvention.filters.FiltersPackage#getFilter_Negated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link codingConvention.filters.Filter#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

} // Filter
