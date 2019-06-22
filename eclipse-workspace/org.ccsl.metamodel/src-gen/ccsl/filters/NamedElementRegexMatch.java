/**
 */
package ccsl.filters;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Regex Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.filters.NamedElementRegexMatch#getRegex <em>Regex</em>}</li>
 * </ul>
 *
 * @see ccsl.filters.FiltersPackage#getNamedElementRegexMatch()
 * @model
 * @generated
 */
public interface NamedElementRegexMatch extends AtomicFilter {
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
	 * @see ccsl.filters.FiltersPackage#getNamedElementRegexMatch_Regex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link ccsl.filters.NamedElementRegexMatch#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

} // NamedElementRegexMatch
