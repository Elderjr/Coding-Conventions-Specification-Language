/**
 */
package codingConvention.elements.types;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see codingConvention.elements.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codingConvention/elements/types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = codingConvention.elements.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link codingConvention.elements.types.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.types.impl.DataTypeImpl
	 * @see codingConvention.elements.types.impl.TypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.types.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.types.impl.ComplexTypeImpl
	 * @see codingConvention.elements.types.impl.TypesPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__PROPERTIES = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.types.impl.PrimitiveTypeImpl
	 * @see codingConvention.elements.types.impl.TypesPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.types.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see codingConvention.elements.types.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.types.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see codingConvention.elements.types.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.types.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see codingConvention.elements.types.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link codingConvention.elements.types.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.types.impl.DataTypeImpl
		 * @see codingConvention.elements.types.impl.TypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.types.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.types.impl.ComplexTypeImpl
		 * @see codingConvention.elements.types.impl.TypesPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.types.impl.PrimitiveTypeImpl
		 * @see codingConvention.elements.types.impl.TypesPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

	}

} //TypesPackage
