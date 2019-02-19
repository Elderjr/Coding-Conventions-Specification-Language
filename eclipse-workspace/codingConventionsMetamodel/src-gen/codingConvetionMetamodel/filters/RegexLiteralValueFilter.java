/**
 */
package codingConvetionMetamodel.filters;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regex Literal Value Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.filters.RegexLiteralValueFilter#getRegex <em>Regex</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.filters.FiltersPackage#getRegexLiteralValueFilter()
 * @model
 * @generated
 */
public interface RegexLiteralValueFilter extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getRegexLiteralValueFilter_Regex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link codingConvetionMetamodel.filters.RegexLiteralValueFilter#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

} // RegexLiteralValueFilter
