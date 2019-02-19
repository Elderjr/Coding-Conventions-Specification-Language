/**
 */
package codingConvetionMetamodel.filters;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equals Named Element With Literals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals#getNames <em>Names</em>}</li>
 *   <li>{@link codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.filters.FiltersPackage#getEqualsNamedElementWithLiterals()
 * @model
 * @generated
 */
public interface EqualsNamedElementWithLiterals extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' attribute.
	 * @see #setNames(String)
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getEqualsNamedElementWithLiterals_Names()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNames();

	/**
	 * Sets the value of the '{@link codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals#getNames <em>Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Names</em>' attribute.
	 * @see #getNames()
	 * @generated
	 */
	void setNames(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Case</em>' attribute.
	 * @see #setIgnoreCase(boolean)
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getEqualsNamedElementWithLiterals_IgnoreCase()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIgnoreCase();

	/**
	 * Sets the value of the '{@link codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals#isIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Case</em>' attribute.
	 * @see #isIgnoreCase()
	 * @generated
	 */
	void setIgnoreCase(boolean value);

} // EqualsNamedElementWithLiterals
