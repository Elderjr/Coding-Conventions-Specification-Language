/**
 */
package codingConvention.elements.namedElements;

import codingConvention.elements.types.DataType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.namedElements.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Method#getParameter <em>Parameter</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Method#getSubMethods <em>Sub Methods</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Method#getSuperMethod <em>Super Method</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Method#getThrows <em>Throws</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.namedElements.NamedElementsPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(DataType)
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link codingConvention.elements.namedElements.Method#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.namedElements.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getMethod_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Sub Methods</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link codingConvention.elements.namedElements.Method#getSuperMethod <em>Super Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Methods</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Methods</em>' reference.
	 * @see #setSubMethods(Method)
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getMethod_SubMethods()
	 * @see codingConvention.elements.namedElements.Method#getSuperMethod
	 * @model opposite="superMethod"
	 * @generated
	 */
	Method getSubMethods();

	/**
	 * Sets the value of the '{@link codingConvention.elements.namedElements.Method#getSubMethods <em>Sub Methods</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Methods</em>' reference.
	 * @see #getSubMethods()
	 * @generated
	 */
	void setSubMethods(Method value);

	/**
	 * Returns the value of the '<em><b>Super Method</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link codingConvention.elements.namedElements.Method#getSubMethods <em>Sub Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Method</em>' reference.
	 * @see #setSuperMethod(Method)
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getMethod_SuperMethod()
	 * @see codingConvention.elements.namedElements.Method#getSubMethods
	 * @model opposite="subMethods"
	 * @generated
	 */
	Method getSuperMethod();

	/**
	 * Sets the value of the '{@link codingConvention.elements.namedElements.Method#getSuperMethod <em>Super Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Method</em>' reference.
	 * @see #getSuperMethod()
	 * @generated
	 */
	void setSuperMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' reference list.
	 * The list contents are of type {@link codingConvention.elements.namedElements.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' reference list.
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getMethod_Throws()
	 * @model
	 * @generated
	 */
	EList<codingConvention.elements.namedElements.Exception> getThrows();

} // Method
