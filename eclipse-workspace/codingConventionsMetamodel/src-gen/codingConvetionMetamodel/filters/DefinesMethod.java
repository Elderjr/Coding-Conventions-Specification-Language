/**
 */
package codingConvetionMetamodel.filters;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defines Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.filters.DefinesMethod#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.filters.FiltersPackage#getDefinesMethod()
 * @model
 * @generated
 */
public interface DefinesMethod extends AtomicFilter {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.namedElements.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getDefinesMethod_Methods()
	 * @model type="codingConvetionMetamodel.elements.namedElements.Method" containment="true" required="true"
	 * @generated
	 */
	EList getMethods();

} // DefinesMethod
