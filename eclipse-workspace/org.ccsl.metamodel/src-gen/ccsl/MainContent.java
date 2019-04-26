/**
 */
package ccsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ccsl.MainContent#getRule <em>Rule</em>}</li>
 *   <li>{@link ccsl.MainContent#getPrimitiveTypesReferences <em>Primitive Types References</em>}</li>
 * </ul>
 *
 * @see ccsl.ccslPackage#getMainContent()
 * @model
 * @generated
 */
public interface MainContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Rule)
	 * @see ccsl.ccslPackage#getMainContent_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link ccsl.MainContent#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

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
	 * @see ccsl.ccslPackage#getMainContent_PrimitiveTypesReferences()
	 * @model type="ccsl.elements.datatype.PrimitiveType" containment="true"
	 * @generated
	 */
	EList getPrimitiveTypesReferences();

} // MainContent
