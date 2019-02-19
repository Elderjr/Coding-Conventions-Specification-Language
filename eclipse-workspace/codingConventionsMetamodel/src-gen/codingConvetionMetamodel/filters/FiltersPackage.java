/**
 */
package codingConvetionMetamodel.filters;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see codingConvetionMetamodel.filters.FiltersFactory
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
	String eNS_URI = "http://www.example.org/codingConvetionMetamodel/filters";

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
	FiltersPackage eINSTANCE = codingConvetionMetamodel.filters.impl.FiltersPackageImpl.init();

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.FilterImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getFilter()
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
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.AtomicFilterImpl <em>Atomic Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.AtomicFilterImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getAtomicFilter()
	 * @generated
	 */
	int ATOMIC_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER__NEGATED = FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER__TARGETS = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.CompositeFilterImpl <em>Composite Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.CompositeFilterImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getCompositeFilter()
	 * @generated
	 */
	int COMPOSITE_FILTER = 2;

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
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER__OPERATOR = FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.PropertyFilterImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getPropertyFilter()
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
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER__PROPERTIES = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.TemplateFilterImpl <em>Template Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.TemplateFilterImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getTemplateFilter()
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
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__TEMPLATE = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER__EXACT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.DefinesMethodImpl <em>Defines Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.DefinesMethodImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getDefinesMethod()
	 * @generated
	 */
	int DEFINES_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_METHOD__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_METHOD__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_METHOD__METHODS = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defines Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_METHOD_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.EqualsNamedElementImpl <em>Equals Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.EqualsNamedElementImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getEqualsNamedElement()
	 * @generated
	 */
	int EQUALS_NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT__ELEMENTS = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT__IGNORE_CASE = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equals Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.RegexLiteralValueFilterImpl <em>Regex Literal Value Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.RegexLiteralValueFilterImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getRegexLiteralValueFilter()
	 * @generated
	 */
	int REGEX_LITERAL_VALUE_FILTER = 7;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_LITERAL_VALUE_FILTER__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_LITERAL_VALUE_FILTER__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_LITERAL_VALUE_FILTER__REGEX = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regex Literal Value Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_LITERAL_VALUE_FILTER_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.CountBlockStatementsFilterImpl <em>Count Block Statements Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.CountBlockStatementsFilterImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getCountBlockStatementsFilter()
	 * @generated
	 */
	int COUNT_BLOCK_STATEMENTS_FILTER = 8;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_BLOCK_STATEMENTS_FILTER__COUNT = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_BLOCK_STATEMENTS_FILTER__OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Count Block Statements Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_BLOCK_STATEMENTS_FILTER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.filters.impl.EqualsNamedElementWithLiteralsImpl <em>Equals Named Element With Literals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.filters.impl.EqualsNamedElementWithLiteralsImpl
	 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getEqualsNamedElementWithLiterals()
	 * @generated
	 */
	int EQUALS_NAMED_ELEMENT_WITH_LITERALS = 9;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT_WITH_LITERALS__NEGATED = ATOMIC_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT_WITH_LITERALS__TARGETS = ATOMIC_FILTER__TARGETS;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT_WITH_LITERALS__NAMES = ATOMIC_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT_WITH_LITERALS__IGNORE_CASE = ATOMIC_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equals Named Element With Literals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_NAMED_ELEMENT_WITH_LITERALS_FEATURE_COUNT = ATOMIC_FILTER_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see codingConvetionMetamodel.filters.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.filters.Filter#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see codingConvetionMetamodel.filters.Filter#isNegated()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Negated();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.AtomicFilter <em>Atomic Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Filter</em>'.
	 * @see codingConvetionMetamodel.filters.AtomicFilter
	 * @generated
	 */
	EClass getAtomicFilter();

	/**
	 * Returns the meta object for the reference list '{@link codingConvetionMetamodel.filters.AtomicFilter#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see codingConvetionMetamodel.filters.AtomicFilter#getTargets()
	 * @see #getAtomicFilter()
	 * @generated
	 */
	EReference getAtomicFilter_Targets();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.CompositeFilter <em>Composite Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Filter</em>'.
	 * @see codingConvetionMetamodel.filters.CompositeFilter
	 * @generated
	 */
	EClass getCompositeFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvetionMetamodel.filters.CompositeFilter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see codingConvetionMetamodel.filters.CompositeFilter#getFilter()
	 * @see #getCompositeFilter()
	 * @generated
	 */
	EReference getCompositeFilter_Filter();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.filters.CompositeFilter#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see codingConvetionMetamodel.filters.CompositeFilter#getOperator()
	 * @see #getCompositeFilter()
	 * @generated
	 */
	EAttribute getCompositeFilter_Operator();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.PropertyFilter <em>Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Filter</em>'.
	 * @see codingConvetionMetamodel.filters.PropertyFilter
	 * @generated
	 */
	EClass getPropertyFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvetionMetamodel.filters.PropertyFilter#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see codingConvetionMetamodel.filters.PropertyFilter#getProperties()
	 * @see #getPropertyFilter()
	 * @generated
	 */
	EReference getPropertyFilter_Properties();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.TemplateFilter <em>Template Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Filter</em>'.
	 * @see codingConvetionMetamodel.filters.TemplateFilter
	 * @generated
	 */
	EClass getTemplateFilter();

	/**
	 * Returns the meta object for the containment reference '{@link codingConvetionMetamodel.filters.TemplateFilter#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see codingConvetionMetamodel.filters.TemplateFilter#getTemplate()
	 * @see #getTemplateFilter()
	 * @generated
	 */
	EReference getTemplateFilter_Template();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.filters.TemplateFilter#isExact <em>Exact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact</em>'.
	 * @see codingConvetionMetamodel.filters.TemplateFilter#isExact()
	 * @see #getTemplateFilter()
	 * @generated
	 */
	EAttribute getTemplateFilter_Exact();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.DefinesMethod <em>Defines Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defines Method</em>'.
	 * @see codingConvetionMetamodel.filters.DefinesMethod
	 * @generated
	 */
	EClass getDefinesMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvetionMetamodel.filters.DefinesMethod#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see codingConvetionMetamodel.filters.DefinesMethod#getMethods()
	 * @see #getDefinesMethod()
	 * @generated
	 */
	EReference getDefinesMethod_Methods();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.EqualsNamedElement <em>Equals Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals Named Element</em>'.
	 * @see codingConvetionMetamodel.filters.EqualsNamedElement
	 * @generated
	 */
	EClass getEqualsNamedElement();

	/**
	 * Returns the meta object for the reference list '{@link codingConvetionMetamodel.filters.EqualsNamedElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see codingConvetionMetamodel.filters.EqualsNamedElement#getElements()
	 * @see #getEqualsNamedElement()
	 * @generated
	 */
	EReference getEqualsNamedElement_Elements();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.filters.EqualsNamedElement#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see codingConvetionMetamodel.filters.EqualsNamedElement#isIgnoreCase()
	 * @see #getEqualsNamedElement()
	 * @generated
	 */
	EAttribute getEqualsNamedElement_IgnoreCase();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.RegexLiteralValueFilter <em>Regex Literal Value Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regex Literal Value Filter</em>'.
	 * @see codingConvetionMetamodel.filters.RegexLiteralValueFilter
	 * @generated
	 */
	EClass getRegexLiteralValueFilter();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.filters.RegexLiteralValueFilter#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see codingConvetionMetamodel.filters.RegexLiteralValueFilter#getRegex()
	 * @see #getRegexLiteralValueFilter()
	 * @generated
	 */
	EAttribute getRegexLiteralValueFilter_Regex();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.CountBlockStatementsFilter <em>Count Block Statements Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Block Statements Filter</em>'.
	 * @see codingConvetionMetamodel.filters.CountBlockStatementsFilter
	 * @generated
	 */
	EClass getCountBlockStatementsFilter();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.filters.CountBlockStatementsFilter#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see codingConvetionMetamodel.filters.CountBlockStatementsFilter#getCount()
	 * @see #getCountBlockStatementsFilter()
	 * @generated
	 */
	EAttribute getCountBlockStatementsFilter_Count();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.filters.CountBlockStatementsFilter#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see codingConvetionMetamodel.filters.CountBlockStatementsFilter#getOperator()
	 * @see #getCountBlockStatementsFilter()
	 * @generated
	 */
	EAttribute getCountBlockStatementsFilter_Operator();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals <em>Equals Named Element With Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals Named Element With Literals</em>'.
	 * @see codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals
	 * @generated
	 */
	EClass getEqualsNamedElementWithLiterals();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Names</em>'.
	 * @see codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals#getNames()
	 * @see #getEqualsNamedElementWithLiterals()
	 * @generated
	 */
	EAttribute getEqualsNamedElementWithLiterals_Names();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see codingConvetionMetamodel.filters.EqualsNamedElementWithLiterals#isIgnoreCase()
	 * @see #getEqualsNamedElementWithLiterals()
	 * @generated
	 */
	EAttribute getEqualsNamedElementWithLiterals_IgnoreCase();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.FilterImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getFilter()
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
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.AtomicFilterImpl <em>Atomic Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.AtomicFilterImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getAtomicFilter()
		 * @generated
		 */
		EClass ATOMIC_FILTER = eINSTANCE.getAtomicFilter();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_FILTER__TARGETS = eINSTANCE.getAtomicFilter_Targets();

		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.CompositeFilterImpl <em>Composite Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.CompositeFilterImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getCompositeFilter()
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
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_FILTER__OPERATOR = eINSTANCE.getCompositeFilter_Operator();

		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.PropertyFilterImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getPropertyFilter()
		 * @generated
		 */
		EClass PROPERTY_FILTER = eINSTANCE.getPropertyFilter();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILTER__PROPERTIES = eINSTANCE.getPropertyFilter_Properties();

		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.TemplateFilterImpl <em>Template Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.TemplateFilterImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getTemplateFilter()
		 * @generated
		 */
		EClass TEMPLATE_FILTER = eINSTANCE.getTemplateFilter();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_FILTER__TEMPLATE = eINSTANCE.getTemplateFilter_Template();

		/**
		 * The meta object literal for the '<em><b>Exact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_FILTER__EXACT = eINSTANCE.getTemplateFilter_Exact();

		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.DefinesMethodImpl <em>Defines Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.DefinesMethodImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getDefinesMethod()
		 * @generated
		 */
		EClass DEFINES_METHOD = eINSTANCE.getDefinesMethod();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINES_METHOD__METHODS = eINSTANCE.getDefinesMethod_Methods();

		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.EqualsNamedElementImpl <em>Equals Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.EqualsNamedElementImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getEqualsNamedElement()
		 * @generated
		 */
		EClass EQUALS_NAMED_ELEMENT = eINSTANCE.getEqualsNamedElement();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALS_NAMED_ELEMENT__ELEMENTS = eINSTANCE.getEqualsNamedElement_Elements();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALS_NAMED_ELEMENT__IGNORE_CASE = eINSTANCE.getEqualsNamedElement_IgnoreCase();

		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.RegexLiteralValueFilterImpl <em>Regex Literal Value Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.RegexLiteralValueFilterImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getRegexLiteralValueFilter()
		 * @generated
		 */
		EClass REGEX_LITERAL_VALUE_FILTER = eINSTANCE.getRegexLiteralValueFilter();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEX_LITERAL_VALUE_FILTER__REGEX = eINSTANCE.getRegexLiteralValueFilter_Regex();

		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.CountBlockStatementsFilterImpl <em>Count Block Statements Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.CountBlockStatementsFilterImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getCountBlockStatementsFilter()
		 * @generated
		 */
		EClass COUNT_BLOCK_STATEMENTS_FILTER = eINSTANCE.getCountBlockStatementsFilter();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT_BLOCK_STATEMENTS_FILTER__COUNT = eINSTANCE.getCountBlockStatementsFilter_Count();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT_BLOCK_STATEMENTS_FILTER__OPERATOR = eINSTANCE.getCountBlockStatementsFilter_Operator();

		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.filters.impl.EqualsNamedElementWithLiteralsImpl <em>Equals Named Element With Literals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.filters.impl.EqualsNamedElementWithLiteralsImpl
		 * @see codingConvetionMetamodel.filters.impl.FiltersPackageImpl#getEqualsNamedElementWithLiterals()
		 * @generated
		 */
		EClass EQUALS_NAMED_ELEMENT_WITH_LITERALS = eINSTANCE.getEqualsNamedElementWithLiterals();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALS_NAMED_ELEMENT_WITH_LITERALS__NAMES = eINSTANCE.getEqualsNamedElementWithLiterals_Names();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALS_NAMED_ELEMENT_WITH_LITERALS__IGNORE_CASE = eINSTANCE
				.getEqualsNamedElementWithLiterals_IgnoreCase();

	}

} //FiltersPackage
