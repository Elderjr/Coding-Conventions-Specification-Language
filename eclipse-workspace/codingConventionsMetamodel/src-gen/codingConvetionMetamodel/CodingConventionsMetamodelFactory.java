/**
 */
package codingConvetionMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codingConvetionMetamodel.CodingConventionsMetamodelPackage
 * @generated
 */
public interface CodingConventionsMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodingConventionsMetamodelFactory eINSTANCE = codingConvetionMetamodel.impl.CodingConventionsMetamodelFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Composite Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Rule</em>'.
	 * @generated
	 */
	CompositeRule createCompositeRule();

	/**
	 * Returns a new object of class '<em>Atomic Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Rule</em>'.
	 * @generated
	 */
	AtomicRule createAtomicRule();

	/**
	 * Returns a new object of class '<em>JAnnotations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JAnnotations</em>'.
	 * @generated
	 */
	JAnnotations createJAnnotations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodingConventionsMetamodelPackage getCodingConventionsMetamodelPackage();

} //CodingConventionsMetamodelFactory
