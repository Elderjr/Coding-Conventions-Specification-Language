/**
 */
package codingConvention.values;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see codingConvention.values.ValuesFactory
 * @model kind="package"
 * @generated
 */
public interface ValuesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "values";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codingConvention/values";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "values";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValuesPackage eINSTANCE = codingConvention.values.impl.ValuesPackageImpl.init();

	/**
	 * The meta object id for the '{@link codingConvention.values.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.values.impl.ValueImpl
	 * @see codingConvention.values.impl.ValuesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codingConvention.values.impl.ReferencedValueImpl <em>Referenced Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.values.impl.ReferencedValueImpl
	 * @see codingConvention.values.impl.ValuesPackageImpl#getReferencedValue()
	 * @generated
	 */
	int REFERENCED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_VALUE__TYPE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referenced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Referenced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.values.impl.LiteralValueImpl <em>Literal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.values.impl.LiteralValueImpl
	 * @see codingConvention.values.impl.ValuesPackageImpl#getLiteralValue()
	 * @generated
	 */
	int LITERAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE__TYPE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE__VALUE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Literal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link codingConvention.values.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see codingConvention.values.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link codingConvention.values.ReferencedValue <em>Referenced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Value</em>'.
	 * @see codingConvention.values.ReferencedValue
	 * @generated
	 */
	EClass getReferencedValue();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.values.ReferencedValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see codingConvention.values.ReferencedValue#getType()
	 * @see #getReferencedValue()
	 * @generated
	 */
	EReference getReferencedValue_Type();

	/**
	 * Returns the meta object for class '{@link codingConvention.values.LiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Value</em>'.
	 * @see codingConvention.values.LiteralValue
	 * @generated
	 */
	EClass getLiteralValue();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.values.LiteralValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see codingConvention.values.LiteralValue#getType()
	 * @see #getLiteralValue()
	 * @generated
	 */
	EReference getLiteralValue_Type();

	/**
	 * Returns the meta object for the attribute '{@link codingConvention.values.LiteralValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see codingConvention.values.LiteralValue#getValue()
	 * @see #getLiteralValue()
	 * @generated
	 */
	EAttribute getLiteralValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValuesFactory getValuesFactory();

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
		 * The meta object literal for the '{@link codingConvention.values.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.values.impl.ValueImpl
		 * @see codingConvention.values.impl.ValuesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link codingConvention.values.impl.ReferencedValueImpl <em>Referenced Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.values.impl.ReferencedValueImpl
		 * @see codingConvention.values.impl.ValuesPackageImpl#getReferencedValue()
		 * @generated
		 */
		EClass REFERENCED_VALUE = eINSTANCE.getReferencedValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_VALUE__TYPE = eINSTANCE.getReferencedValue_Type();

		/**
		 * The meta object literal for the '{@link codingConvention.values.impl.LiteralValueImpl <em>Literal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.values.impl.LiteralValueImpl
		 * @see codingConvention.values.impl.ValuesPackageImpl#getLiteralValue()
		 * @generated
		 */
		EClass LITERAL_VALUE = eINSTANCE.getLiteralValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_VALUE__TYPE = eINSTANCE.getLiteralValue_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_VALUE__VALUE = eINSTANCE.getLiteralValue_Value();

	}

} //ValuesPackage
