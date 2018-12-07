/**
 */
package codingConvention.filters;

import codingConvention.elements.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.filters.TemplateFilter#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see codingConvention.filters.FiltersPackage#getTemplateFilter()
 * @model
 * @generated
 */
public interface TemplateFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(Element)
	 * @see codingConvention.filters.FiltersPackage#getTemplateFilter_Template()
	 * @model required="true"
	 * @generated
	 */
	Element getTemplate();

	/**
	 * Sets the value of the '{@link codingConvention.filters.TemplateFilter#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Element value);

} // TemplateFilter
