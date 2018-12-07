/**
 */
package codingConvention.elements.namedElements;

import codingConvention.elements.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.namedElements.Field#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.namedElements.NamedElementsPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Variable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getField_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link codingConvention.elements.namedElements.Field#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Field
