/**
 */
package ccsl.filters;

import ccsl.elements.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.filters.TemplateFilter#getTemplate <em>Template</em>}</li>
 *   <li>{@link ccsl.filters.TemplateFilter#isExact <em>Exact</em>}</li>
 * </ul>
 *
 * @see ccsl.filters.FiltersPackage#getTemplateFilter()
 * @model
 * @generated
 */
public interface TemplateFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(Element)
	 * @see ccsl.filters.FiltersPackage#getTemplateFilter_Template()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Element getTemplate();

	/**
	 * Sets the value of the '{@link ccsl.filters.TemplateFilter#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Element value);

	/**
	 * Returns the value of the '<em><b>Exact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact</em>' attribute.
	 * @see #setExact(boolean)
	 * @see ccsl.filters.FiltersPackage#getTemplateFilter_Exact()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isExact();

	/**
	 * Sets the value of the '{@link ccsl.filters.TemplateFilter#isExact <em>Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact</em>' attribute.
	 * @see #isExact()
	 * @generated
	 */
	void setExact(boolean value);

} // TemplateFilter
