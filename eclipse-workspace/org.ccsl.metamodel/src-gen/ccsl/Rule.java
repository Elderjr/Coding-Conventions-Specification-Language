/**
 */
package ccsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.Rule#isNegated <em>Negated</em>}</li>
 *   <li>{@link ccsl.Rule#getPrimitiveTypesReferences <em>Primitive Types References</em>}</li>
 *   <li>{@link ccsl.Rule#getAuxiliaryElements <em>Auxiliary Elements</em>}</li>
 * </ul>
 *
 * @see ccsl.ccslPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see ccsl.ccslPackage#getRule_Negated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link ccsl.Rule#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

	/**
	 * Returns the value of the '<em><b>Primitive Types References</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.datatype.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Types References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Types References</em>' containment reference list.
	 * @see ccsl.ccslPackage#getRule_PrimitiveTypesReferences()
	 * @model type="ccsl.elements.datatype.PrimitiveType" containment="true"
	 * @generated
	 */
	EList getPrimitiveTypesReferences();

	/**
	 * Returns the value of the '<em><b>Auxiliary Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ccsl.elements.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Elements</em>' containment reference list.
	 * @see ccsl.ccslPackage#getRule_AuxiliaryElements()
	 * @model type="ccsl.elements.Element" containment="true"
	 * @generated
	 */
	EList getAuxiliaryElements();

} // Rule
