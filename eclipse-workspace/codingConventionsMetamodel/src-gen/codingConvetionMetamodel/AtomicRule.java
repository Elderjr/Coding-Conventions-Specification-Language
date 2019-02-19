/**
 */
package codingConvetionMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.AtomicRule#getElement <em>Element</em>}</li>
 *   <li>{@link codingConvetionMetamodel.AtomicRule#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.CodingConventionsMetamodelPackage#getAtomicRule()
 * @model
 * @generated
 */
public interface AtomicRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see codingConvetionMetamodel.CodingConventionsMetamodelPackage#getAtomicRule_Element()
	 * @model type="codingConvetionMetamodel.elements.Element" containment="true" required="true"
	 * @generated
	 */
	EList getElement();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.filters.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see codingConvetionMetamodel.CodingConventionsMetamodelPackage#getAtomicRule_Filter()
	 * @model type="codingConvetionMetamodel.filters.Filter" containment="true"
	 * @generated
	 */
	EList getFilter();

} // AtomicRule
