/**
 */
package codingConvetionMetamodel;

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
 * @see codingConvetionMetamodel.CodingConventionsMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface CodingConventionsMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codingConvetionMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codingConvetionMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codingConvetionMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodingConventionsMetamodelPackage eINSTANCE = codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link codingConvetionMetamodel.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.impl.RuleImpl
	 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getRule()
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
	 * The meta object id for the '{@link codingConvetionMetamodel.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.impl.CompositeRuleImpl
	 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getCompositeRule()
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
	 * The meta object id for the '{@link codingConvetionMetamodel.impl.AtomicRuleImpl <em>Atomic Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.impl.AtomicRuleImpl
	 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getAtomicRule()
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
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RULE__ELEMENT = RULE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link codingConvetionMetamodel.impl.JAnnotationsImpl <em>JAnnotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.impl.JAnnotationsImpl
	 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getJAnnotations()
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
	 * The meta object id for the '{@link codingConvetionMetamodel.LogicOperators <em>Logic Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvetionMetamodel.LogicOperators
	 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getLogicOperators()
	 * @generated
	 */
	int LOGIC_OPERATORS = 4;

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see codingConvetionMetamodel.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.Rule#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see codingConvetionMetamodel.Rule#isNegated()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Negated();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.CompositeRule <em>Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Rule</em>'.
	 * @see codingConvetionMetamodel.CompositeRule
	 * @generated
	 */
	EClass getCompositeRule();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.CompositeRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see codingConvetionMetamodel.CompositeRule#getOperator()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EAttribute getCompositeRule_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvetionMetamodel.CompositeRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see codingConvetionMetamodel.CompositeRule#getRule()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EReference getCompositeRule_Rule();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.AtomicRule <em>Atomic Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Rule</em>'.
	 * @see codingConvetionMetamodel.AtomicRule
	 * @generated
	 */
	EClass getAtomicRule();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvetionMetamodel.AtomicRule#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see codingConvetionMetamodel.AtomicRule#getElement()
	 * @see #getAtomicRule()
	 * @generated
	 */
	EReference getAtomicRule_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvetionMetamodel.AtomicRule#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see codingConvetionMetamodel.AtomicRule#getFilter()
	 * @see #getAtomicRule()
	 * @generated
	 */
	EReference getAtomicRule_Filter();

	/**
	 * Returns the meta object for class '{@link codingConvetionMetamodel.JAnnotations <em>JAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAnnotations</em>'.
	 * @see codingConvetionMetamodel.JAnnotations
	 * @generated
	 */
	EClass getJAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link codingConvetionMetamodel.JAnnotations#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see codingConvetionMetamodel.JAnnotations#getName()
	 * @see #getJAnnotations()
	 * @generated
	 */
	EAttribute getJAnnotations_Name();

	/**
	 * Returns the meta object for enum '{@link codingConvetionMetamodel.LogicOperators <em>Logic Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Operators</em>'.
	 * @see codingConvetionMetamodel.LogicOperators
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
	CodingConventionsMetamodelFactory getCodingConventionsMetamodelFactory();

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
		 * The meta object literal for the '{@link codingConvetionMetamodel.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.impl.RuleImpl
		 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getRule()
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
		 * The meta object literal for the '{@link codingConvetionMetamodel.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.impl.CompositeRuleImpl
		 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getCompositeRule()
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
		 * The meta object literal for the '{@link codingConvetionMetamodel.impl.AtomicRuleImpl <em>Atomic Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.impl.AtomicRuleImpl
		 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getAtomicRule()
		 * @generated
		 */
		EClass ATOMIC_RULE = eINSTANCE.getAtomicRule();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RULE__ELEMENT = eINSTANCE.getAtomicRule_Element();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RULE__FILTER = eINSTANCE.getAtomicRule_Filter();

		/**
		 * The meta object literal for the '{@link codingConvetionMetamodel.impl.JAnnotationsImpl <em>JAnnotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.impl.JAnnotationsImpl
		 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getJAnnotations()
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
		 * The meta object literal for the '{@link codingConvetionMetamodel.LogicOperators <em>Logic Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvetionMetamodel.LogicOperators
		 * @see codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl#getLogicOperators()
		 * @generated
		 */
		EEnum LOGIC_OPERATORS = eINSTANCE.getLogicOperators();

	}

} //CodingConventionsMetamodelPackage
