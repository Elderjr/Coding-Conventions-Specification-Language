/**
 */
package codingConvention.values;

import codingConvention.elements.types.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.values.LiteralValue#getType <em>Type</em>}</li>
 *   <li>{@link codingConvention.values.LiteralValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see codingConvention.values.ValuesPackage#getLiteralValue()
 * @model
 * @generated
 */
public interface LiteralValue extends Value {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(PrimitiveType)
	 * @see codingConvention.values.ValuesPackage#getLiteralValue_Type()
	 * @model
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link codingConvention.values.LiteralValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see codingConvention.values.ValuesPackage#getLiteralValue_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link codingConvention.values.LiteralValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LiteralValue
