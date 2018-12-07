/**
 */
package codingConvention.elements.namedElements;

import codingConvention.elements.types.ComplexType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.namedElements.Interface#getSubInterfaces <em>Sub Interfaces</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.Interface#getInterfaceeOpposite <em>Interfacee Opposite</em>}</li>
 * </ul>
 *
 * @see codingConvention.elements.namedElements.NamedElementsPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends ComplexType {
	/**
	 * Returns the value of the '<em><b>Sub Interfaces</b></em>' reference list.
	 * The list contents are of type {@link codingConvention.elements.namedElements.Interface}.
	 * It is bidirectional and its opposite is '{@link codingConvention.elements.namedElements.Interface#getInterfaceeOpposite <em>Interfacee Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Interfaces</em>' reference list.
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getInterface_SubInterfaces()
	 * @see codingConvention.elements.namedElements.Interface#getInterfaceeOpposite
	 * @model opposite="interfaceeOpposite"
	 * @generated
	 */
	EList<Interface> getSubInterfaces();

	/**
	 * Returns the value of the '<em><b>Interfacee Opposite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link codingConvention.elements.namedElements.Interface#getSubInterfaces <em>Sub Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacee Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacee Opposite</em>' reference.
	 * @see #setInterfaceeOpposite(Interface)
	 * @see codingConvention.elements.namedElements.NamedElementsPackage#getInterface_InterfaceeOpposite()
	 * @see codingConvention.elements.namedElements.Interface#getSubInterfaces
	 * @model opposite="subInterfaces"
	 * @generated
	 */
	Interface getInterfaceeOpposite();

	/**
	 * Sets the value of the '{@link codingConvention.elements.namedElements.Interface#getInterfaceeOpposite <em>Interfacee Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfacee Opposite</em>' reference.
	 * @see #getInterfaceeOpposite()
	 * @generated
	 */
	void setInterfaceeOpposite(Interface value);

} // Interface
