/**
 */
package codingConvention.values;

import codingConvention.elements.types.ComplexType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.values.ReferencedValue#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see codingConvention.values.ValuesPackage#getReferencedValue()
 * @model
 * @generated
 */
public interface ReferencedValue extends Value {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComplexType)
	 * @see codingConvention.values.ValuesPackage#getReferencedValue_Type()
	 * @model
	 * @generated
	 */
	ComplexType getType();

	/**
	 * Sets the value of the '{@link codingConvention.values.ReferencedValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComplexType value);

} // ReferencedValue
