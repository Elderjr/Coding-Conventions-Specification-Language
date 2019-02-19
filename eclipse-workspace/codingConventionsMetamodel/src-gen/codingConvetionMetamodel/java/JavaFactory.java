/**
 */
package codingConvetionMetamodel.java;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codingConvetionMetamodel.java.JavaPackage
 * @generated
 */
public interface JavaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaFactory eINSTANCE = codingConvetionMetamodel.java.impl.JavaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JElement</em>'.
	 * @generated
	 */
	JElement createJElement();

	/**
	 * Returns a new object of class '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JClass</em>'.
	 * @generated
	 */
	JClass createJClass();

	/**
	 * Returns a new object of class '<em>JInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JInterface</em>'.
	 * @generated
	 */
	JInterface createJInterface();

	/**
	 * Returns a new object of class '<em>JMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JMethod</em>'.
	 * @generated
	 */
	JMethod createJMethod();

	/**
	 * Returns a new object of class '<em>JConstructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JConstructor</em>'.
	 * @generated
	 */
	JConstructor createJConstructor();

	/**
	 * Returns a new object of class '<em>JTry Catch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JTry Catch</em>'.
	 * @generated
	 */
	JTryCatch createJTryCatch();

	/**
	 * Returns a new object of class '<em>JTry Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JTry Clause</em>'.
	 * @generated
	 */
	JTryClause createJTryClause();

	/**
	 * Returns a new object of class '<em>JCatch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JCatch Clause</em>'.
	 * @generated
	 */
	JCatchClause createJCatchClause();

	/**
	 * Returns a new object of class '<em>Instance Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Of</em>'.
	 * @generated
	 */
	InstanceOf createInstanceOf();

	/**
	 * Returns a new object of class '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throw Statement</em>'.
	 * @generated
	 */
	ThrowStatement createThrowStatement();

	/**
	 * Returns a new object of class '<em>JFor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JFor</em>'.
	 * @generated
	 */
	JFor createJFor();

	/**
	 * Returns a new object of class '<em>JReturn Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JReturn Statement</em>'.
	 * @generated
	 */
	JReturnStatement createJReturnStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaPackage getJavaPackage();

} //JavaFactory
