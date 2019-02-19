/**
 */
package codingConvetionMetamodel.filters;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equals Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.filters.EqualsNamedElement#getElements <em>Elements</em>}</li>
 *   <li>{@link codingConvetionMetamodel.filters.EqualsNamedElement#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.filters.FiltersPackage#getEqualsNamedElement()
 * @model
 * @generated
 */
public interface EqualsNamedElement extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.namedElements.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getEqualsNamedElement_Elements()
	 * @model type="codingConvetionMetamodel.elements.namedElements.NamedElement"
	 * @generated
	 */
	EList getElements();

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
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getEqualsNamedElement_IgnoreCase()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIgnoreCase();

	/**
	 * Sets the value of the '{@link codingConvetionMetamodel.filters.EqualsNamedElement#isIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Case</em>' attribute.
	 * @see #isIgnoreCase()
	 * @generated
	 */
	void setIgnoreCase(boolean value);

} // EqualsNamedElement
