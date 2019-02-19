/**
 */
package codingConvetionMetamodel.filters;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.filters.AtomicFilter#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.filters.FiltersPackage#getAtomicFilter()
 * @model abstract="true"
 * @generated
 */
public interface AtomicFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see codingConvetionMetamodel.filters.FiltersPackage#getAtomicFilter_Targets()
	 * @model type="codingConvetionMetamodel.elements.Element"
	 * @generated
	 */
	EList getTargets();

} // AtomicFilter
