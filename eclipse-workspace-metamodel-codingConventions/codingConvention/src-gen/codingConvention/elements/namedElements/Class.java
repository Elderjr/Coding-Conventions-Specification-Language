/**
 */
package codingConvention.elements.namedElements;

import codingConvention.elements.types.ComplexType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.namedElements.Class#getInstanceMethods <em>Instance Methods</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Class#getSubClasses <em>Sub Classes</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Class#getClassMethods <em>Class Methods</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Class#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.namedElements.NamedElementsPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ComplexType {
	/**
	 * Returns the value of the '<em><b>Instance Methods</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.namedElements.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Methods</em>' containment reference list.
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getClass_InstanceMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getInstanceMethods();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.namedElements.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getAttributes();

	/**
	 * Returns the value of the '<em><b>Sub Classes</b></em>' reference list.
	 * The list contents are of type {@link codingConvention.elements.namedElements.Class}.
	 * It is bidirectional and its opposite is '{@link codingConvention.elements.namedElements.Class#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Classes</em>' reference list.
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getClass_SubClasses()
	 * @see codingConvention.elements.namedElements.Class#getSuperClass
	 * @model opposite="superClass"
	 * @generated
	 */
	EList<Class> getSubClasses();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link codingConvention.elements.namedElements.Class#getSubClasses <em>Sub Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(Class)
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getClass_SuperClass()
	 * @see codingConvention.elements.namedElements.Class#getSubClasses
	 * @model opposite="subClasses"
	 * @generated
	 */
	Class getSuperClass();

	/**
	 * Sets the value of the '{@link codingConvention.elements.namedElements.Class#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(Class value);

	/**
	 * Returns the value of the '<em><b>Class Methods</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvention.elements.namedElements.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Methods</em>' containment reference list.
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getClass_ClassMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getClassMethods();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link codingConvention.elements.namedElements.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getClass_Implements()
	 * @model
	 * @generated
	 */
	EList<Interface> getImplements();

} // Class
