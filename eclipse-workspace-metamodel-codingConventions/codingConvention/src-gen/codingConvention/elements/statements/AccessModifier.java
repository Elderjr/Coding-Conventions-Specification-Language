/**
 */
package codingConvention.elements.statements;

import codingConvention.elements.namedElements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.statements.AccessModifier#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.statements.StatementsPackage#getAccessModifier()
 * @model
 * @generated
 */
public interface AccessModifier extends Statement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(NamedElement)
	 * @see codingConvention.elements.statements.StatementsPackage#getAccessModifier_Element()
	 * @model
	 * @generated
	 */
	NamedElement getElement();

	/**
	 * Sets the value of the '{@link codingConvention.elements.statements.AccessModifier#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(NamedElement value);

} // AccessModifier
