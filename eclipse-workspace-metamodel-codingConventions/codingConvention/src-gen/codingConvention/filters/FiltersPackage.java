/**
 */
package codingConvention.filters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see codingConvention.filters.FiltersFactory
 * @model kind="package"
 * @generated
 */
public interface FiltersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codingConvention/filters";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "filters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiltersPackage eINSTANCE = codingConvention.filters.impl.FiltersPackageImpl.init();

	/**
	 * The meta object id for the '{@link codingConvention.filters.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.filters.impl.FilterImpl
	 * @see codingConvention.filters.impl.FiltersPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 0;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NEGATED = 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codingConvention.filters.impl.CompositeFilterImpl <em>Composite Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.filters.impl.CompositeFilterImpl
	 * @see codingConvention.filters.impl.FiltersPackageImpl#getCompositeFilter()
	 * @generated
	 */
	int COMPOSITE_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER__NEGATED = FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER__FILTER = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER__NEW_ATTRIBUTE = FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.filters.impl.AtomicFilterImpl <em>Atomic Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.filters.impl.AtomicFilterImpl
	 * @see codingConvention.filters.impl.FiltersPackageImpl#getAtomicFilter()
	 * @generated
	 */
	int ATOMIC_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER__NEGATED = FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER__TARGET = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atomic Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.filters.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.filters.impl.PropertyFilterImpl
	 * @see codingConvention.filters.impl.FiltersPackageImpl#getPropertyFilter()
	 * @generated
	 */
	int PROPERTY_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER__TARGET = ATOMIC_FILTER__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER__PROPERTY = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_OPERATION_COUNT = ATOMIC_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.filters.impl.TemplateFilterImpl <em>Template Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.filters.impl.TemplateFilterImpl
	 * @see codingConvention.filters.impl.FiltersPackageImpl#getTemplateFilter()
	 * @generated
	 */
	int TEMPLATE_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__TARGET = ATOMIC_FILTER__TARGET;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__TEMPLATE = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER_OPERATION_COUNT = ATOMIC_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.filters.FilterOperation <em>Filter Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.filters.FilterOperation
	 * @see codingConvention.filters.impl.FiltersPackageImpl#getFilterOperation()
	 * @generated
	 */
	int FILTER_OPERATION = 5;

	/**
	 * Returns the meta object for class '{@link codingConvention.filters.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see codingConvention.filters.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link codingConvention.filters.Filter#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see codingConvention.filters.Filter#isNegated()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Negated();

	/**
	 * Returns the meta object for class '{@link codingConvention.filters.CompositeFilter <em>Composite Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Filter</em>'.
	 * @see codingConvention.filters.CompositeFilter
	 * @generated
	 */
	EClass getCompositeFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.filters.CompositeFilter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see codingConvention.filters.CompositeFilter#getFilter()
	 * @see #getCompositeFilter()
	 * @generated
	 */
	EReference getCompositeFilter_Filter();

	/**
	 * Returns the meta object for the attribute '{@link codingConvention.filters.CompositeFilter#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see codingConvention.filters.CompositeFilter#getNewAttribute()
	 * @see #getCompositeFilter()
	 * @generated
	 */
	EAttribute getCompositeFilter_NewAttribute();

	/**
	 * Returns the meta object for class '{@link codingConvention.filters.AtomicFilter <em>Atomic Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Filter</em>'.
	 * @see codingConvention.filters.AtomicFilter
	 * @generated
	 */
	EClass getAtomicFilter();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.filters.AtomicFilter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see codingConvention.filters.AtomicFilter#getTarget()
	 * @see #getAtomicFilter()
	 * @generated
	 */
	EReference getAtomicFilter_Target();

	/**
	 * Returns the meta object for class '{@link codingConvention.filters.PropertyFilter <em>Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Filter</em>'.
	 * @see codingConvention.filters.PropertyFilter
	 * @generated
	 */
	EClass getPropertyFilter();

	/**
	 * Returns the meta object for the containment reference '{@link codingConvention.filters.PropertyFilter#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see codingConvention.filters.PropertyFilter#getProperty()
	 * @see #getPropertyFilter()
	 * @generated
	 */
	EReference getPropertyFilter_Property();

	/**
	 * Returns the meta object for class '{@link codingConvention.filters.TemplateFilter <em>Template Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Filter</em>'.
	 * @see codingConvention.filters.TemplateFilter
	 * @generated
	 */
	EClass getTemplateFilter();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.filters.TemplateFilter#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see codingConvention.filters.TemplateFilter#getTemplate()
	 * @see #getTemplateFilter()
	 * @generated
	 */
	EReference getTemplateFilter_Template();

	/**
	 * Returns the meta object for enum '{@link codingConvention.filters.FilterOperation <em>Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Operation</em>'.
	 * @see codingConvention.filters.FilterOperation
	 * @generated
	 */
	EEnum getFilterOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FiltersFactory getFiltersFactory();

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
		 * The meta object literal for the '{@link codingConvention.filters.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.filters.impl.FilterImpl
		 * @see codingConvention.filters.impl.FiltersPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__NEGATED = eINSTANCE.getFilter_Negated();

		/**
		 * The meta object literal for the '{@link codingConvention.filters.impl.CompositeFilterImpl <em>Composite Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.filters.impl.CompositeFilterImpl
		 * @see codingConvention.filters.impl.FiltersPackageImpl#getCompositeFilter()
		 * @generated
		 */
		EClass COMPOSITE_FILTER = eINSTANCE.getCompositeFilter();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_FILTER__FILTER = eINSTANCE.getCompositeFilter_Filter();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_FILTER__NEW_ATTRIBUTE = eINSTANCE.getCompositeFilter_NewAttribute();

		/**
		 * The meta object literal for the '{@link codingConvention.filters.impl.AtomicFilterImpl <em>Atomic Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.filters.impl.AtomicFilterImpl
		 * @see codingConvention.filters.impl.FiltersPackageImpl#getAtomicFilter()
		 * @generated
		 */
		EClass ATOMIC_FILTER = eINSTANCE.getAtomicFilter();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_FILTER__TARGET = eINSTANCE.getAtomicFilter_Target();

		/**
		 * The meta object literal for the '{@link codingConvention.filters.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.filters.impl.PropertyFilterImpl
		 * @see codingConvention.filters.impl.FiltersPackageImpl#getPropertyFilter()
		 * @generated
		 */
		EClass PROPERTY_FILTER = eINSTANCE.getPropertyFilter();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILTER__PROPERTY = eINSTANCE.getPropertyFilter_Property();

		/**
		 * The meta object literal for the '{@link codingConvention.filters.impl.TemplateFilterImpl <em>Template Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.filters.impl.TemplateFilterImpl
		 * @see codingConvention.filters.impl.FiltersPackageImpl#getTemplateFilter()
		 * @generated
		 */
		EClass TEMPLATE_FILTER = eINSTANCE.getTemplateFilter();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_FILTER__TEMPLATE = eINSTANCE.getTemplateFilter_Template();

		/**
		 * The meta object literal for the '{@link codingConvention.filters.FilterOperation <em>Filter Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.filters.FilterOperation
		 * @see codingConvention.filters.impl.FiltersPackageImpl#getFilterOperation()
		 * @generated
		 */
		EEnum FILTER_OPERATION = eINSTANCE.getFilterOperation();

	}

} //FiltersPackage
