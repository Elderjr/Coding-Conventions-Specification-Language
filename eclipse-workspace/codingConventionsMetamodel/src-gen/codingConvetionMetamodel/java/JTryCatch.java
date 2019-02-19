/**
 */
package codingConvetionMetamodel.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JTry Catch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.java.JTryCatch#getTry <em>Try</em>}</li>
 *   <li>{@link codingConvetionMetamodel.java.JTryCatch#getCatches <em>Catches</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.java.JavaPackage#getJTryCatch()
 * @model
 * @generated
 */
public interface JTryCatch extends JElement {
	/**
	 * Returns the value of the '<em><b>Try</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Try</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Try</em>' containment reference.
	 * @see #setTry(JTryClause)
	 * @see codingConvetionMetamodel.java.JavaPackage#getJTryCatch_Try()
	 * @model containment="true"
	 * @generated
	 */
	JTryClause getTry();

	/**
	 * Sets the value of the '{@link codingConvetionMetamodel.java.JTryCatch#getTry <em>Try</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Try</em>' containment reference.
	 * @see #getTry()
	 * @generated
	 */
	void setTry(JTryClause value);

	/**
	 * Returns the value of the '<em><b>Catches</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.java.JCatchClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catches</em>' containment reference list.
	 * @see codingConvetionMetamodel.java.JavaPackage#getJTryCatch_Catches()
	 * @model type="codingConvetionMetamodel.java.JCatchClause" containment="true"
	 * @generated
	 */
	EList getCatches();

} // JTryCatch
