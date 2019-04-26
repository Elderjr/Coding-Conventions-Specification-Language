/**
 */
package ccsl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ccsl.ccslFactory
 * @model kind="package"
 * @generated
 */
public interface ccslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ccsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ccsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ccslPackage eINSTANCE = ccsl.impl.ccslPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.impl.RuleImpl
	 * @see ccsl.impl.ccslPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 0;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NEGATED = 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ccsl.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.impl.CompositeRuleImpl
	 * @see ccsl.impl.ccslPackageImpl#getCompositeRule()
	 * @generated
	 */
	int COMPOSITE_RULE = 1;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__NEGATED = RULE__NEGATED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__OPERATOR = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__RULE = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.impl.AtomicRuleImpl <em>Atomic Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.impl.AtomicRuleImpl
	 * @see ccsl.impl.ccslPackageImpl#getAtomicRule()
	 * @generated
	 */
	int ATOMIC_RULE = 2;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RULE__NEGATED = RULE__NEGATED;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RULE__ELEMENTS = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RULE__FILTER = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.impl.JAnnotationsImpl <em>JAnnotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.impl.JAnnotationsImpl
	 * @see ccsl.impl.ccslPackageImpl#getJAnnotations()
	 * @generated
	 */
	int JANNOTATIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANNOTATIONS__NAME = 0;

	/**
	 * The number of structural features of the '<em>JAnnotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JANNOTATIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ccsl.impl.MainContentImpl <em>Main Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.impl.MainContentImpl
	 * @see ccsl.impl.ccslPackageImpl#getMainContent()
	 * @generated
	 */
	int MAIN_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CONTENT__RULE = 0;

	/**
	 * The feature id for the '<em><b>Primitive Types References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CONTENT__PRIMITIVE_TYPES_REFERENCES = 1;

	/**
	 * The number of structural features of the '<em>Main Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ccsl.LogicOperators <em>Logic Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.LogicOperators
	 * @see ccsl.impl.ccslPackageImpl#getLogicOperators()
	 * @generated
	 */
	int LOGIC_OPERATORS = 5;

	/**
	 * Returns the meta object for class '{@link ccsl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see ccsl.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.Rule#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see ccsl.Rule#isNegated()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Negated();

	/**
	 * Returns the meta object for class '{@link ccsl.CompositeRule <em>Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Rule</em>'.
	 * @see ccsl.CompositeRule
	 * @generated
	 */
	EClass getCompositeRule();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.CompositeRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ccsl.CompositeRule#getOperator()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EAttribute getCompositeRule_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.CompositeRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see ccsl.CompositeRule#getRule()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EReference getCompositeRule_Rule();

	/**
	 * Returns the meta object for class '{@link ccsl.AtomicRule <em>Atomic Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Rule</em>'.
	 * @see ccsl.AtomicRule
	 * @generated
	 */
	EClass getAtomicRule();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.AtomicRule#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see ccsl.AtomicRule#getElements()
	 * @see #getAtomicRule()
	 * @generated
	 */
	EReference getAtomicRule_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.AtomicRule#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see ccsl.AtomicRule#getFilter()
	 * @see #getAtomicRule()
	 * @generated
	 */
	EReference getAtomicRule_Filter();

	/**
	 * Returns the meta object for class '{@link ccsl.JAnnotations <em>JAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAnnotations</em>'.
	 * @see ccsl.JAnnotations
	 * @generated
	 */
	EClass getJAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link ccsl.JAnnotations#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccsl.JAnnotations#getName()
	 * @see #getJAnnotations()
	 * @generated
	 */
	EAttribute getJAnnotations_Name();

	/**
	 * Returns the meta object for class '{@link ccsl.MainContent <em>Main Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Content</em>'.
	 * @see ccsl.MainContent
	 * @generated
	 */
	EClass getMainContent();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.MainContent#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see ccsl.MainContent#getRule()
	 * @see #getMainContent()
	 * @generated
	 */
	EReference getMainContent_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.MainContent#getPrimitiveTypesReferences <em>Primitive Types References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Types References</em>'.
	 * @see ccsl.MainContent#getPrimitiveTypesReferences()
	 * @see #getMainContent()
	 * @generated
	 */
	EReference getMainContent_PrimitiveTypesReferences();

	/**
	 * Returns the meta object for enum '{@link ccsl.LogicOperators <em>Logic Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Operators</em>'.
	 * @see ccsl.LogicOperators
	 * @generated
	 */
	EEnum getLogicOperators();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ccslFactory getccslFactory();

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
		 * The meta object literal for the '{@link ccsl.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.impl.RuleImpl
		 * @see ccsl.impl.ccslPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NEGATED = eINSTANCE.getRule_Negated();

		/**
		 * The meta object literal for the '{@link ccsl.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.impl.CompositeRuleImpl
		 * @see ccsl.impl.ccslPackageImpl#getCompositeRule()
		 * @generated
		 */
		EClass COMPOSITE_RULE = eINSTANCE.getCompositeRule();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_RULE__OPERATOR = eINSTANCE.getCompositeRule_Operator();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_RULE__RULE = eINSTANCE.getCompositeRule_Rule();

		/**
		 * The meta object literal for the '{@link ccsl.impl.AtomicRuleImpl <em>Atomic Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.impl.AtomicRuleImpl
		 * @see ccsl.impl.ccslPackageImpl#getAtomicRule()
		 * @generated
		 */
		EClass ATOMIC_RULE = eINSTANCE.getAtomicRule();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RULE__ELEMENTS = eINSTANCE.getAtomicRule_Elements();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RULE__FILTER = eINSTANCE.getAtomicRule_Filter();

		/**
		 * The meta object literal for the '{@link ccsl.impl.JAnnotationsImpl <em>JAnnotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.impl.JAnnotationsImpl
		 * @see ccsl.impl.ccslPackageImpl#getJAnnotations()
		 * @generated
		 */
		EClass JANNOTATIONS = eINSTANCE.getJAnnotations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JANNOTATIONS__NAME = eINSTANCE.getJAnnotations_Name();

		/**
		 * The meta object literal for the '{@link ccsl.impl.MainContentImpl <em>Main Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.impl.MainContentImpl
		 * @see ccsl.impl.ccslPackageImpl#getMainContent()
		 * @generated
		 */
		EClass MAIN_CONTENT = eINSTANCE.getMainContent();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_CONTENT__RULE = eINSTANCE.getMainContent_Rule();

		/**
		 * The meta object literal for the '<em><b>Primitive Types References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_CONTENT__PRIMITIVE_TYPES_REFERENCES = eINSTANCE.getMainContent_PrimitiveTypesReferences();

		/**
		 * The meta object literal for the '{@link ccsl.LogicOperators <em>Logic Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.LogicOperators
		 * @see ccsl.impl.ccslPackageImpl#getLogicOperators()
		 * @generated
		 */
		EEnum LOGIC_OPERATORS = eINSTANCE.getLogicOperators();

	}

} //ccslPackage
