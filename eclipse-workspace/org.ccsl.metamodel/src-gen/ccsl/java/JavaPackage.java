/**
 */
package ccsl.java;

import ccsl.elements.namedElements.NamedElementsPackage;

import ccsl.elements.statements.StatementsPackage;

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
 * @see ccsl.java.JavaFactory
 * @model kind="package"
 * @generated
 */
public interface JavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ccsl/java";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaPackage eINSTANCE = ccsl.java.impl.JavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JElementImpl <em>JElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JElementImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJElement()
	 * @generated
	 */
	int JELEMENT = 0;

	/**
	 * The number of structural features of the '<em>JElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JClassImpl <em>JClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JClassImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJClass()
	 * @generated
	 */
	int JCLASS = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__PROPERTY = NamedElementsPackage.COMPLEX_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__NAME = NamedElementsPackage.COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__FIELDS = NamedElementsPackage.COMPLEX_TYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__SUPER_TYPES = NamedElementsPackage.COMPLEX_TYPE__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Nested Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__NESTED_CLASSES = NamedElementsPackage.COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__IMPLEMENTS = NamedElementsPackage.COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__BLOCKS = NamedElementsPackage.COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_FEATURE_COUNT = NamedElementsPackage.COMPLEX_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JInterfaceImpl <em>JInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JInterfaceImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJInterface()
	 * @generated
	 */
	int JINTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__PROPERTY = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__NAME = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__FIELDS = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__SUPER_TYPES = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>JInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JMethodImpl <em>JMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JMethodImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJMethod()
	 * @generated
	 */
	int JMETHOD = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__PROPERTY = NamedElementsPackage.METHOD__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__NAME = NamedElementsPackage.METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__PARAMS = NamedElementsPackage.METHOD__PARAMS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__RETURN_TYPE = NamedElementsPackage.METHOD__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__THROWS = NamedElementsPackage.METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD_FEATURE_COUNT = NamedElementsPackage.METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JConstructorImpl <em>JConstructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JConstructorImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJConstructor()
	 * @generated
	 */
	int JCONSTRUCTOR = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTOR__PROPERTY = JMETHOD__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTOR__NAME = JMETHOD__NAME;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTOR__PARAMS = JMETHOD__PARAMS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTOR__RETURN_TYPE = JMETHOD__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTOR__THROWS = JMETHOD__THROWS;

	/**
	 * The number of structural features of the '<em>JConstructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTOR_FEATURE_COUNT = JMETHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JTryCatchImpl <em>JTry Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JTryCatchImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJTryCatch()
	 * @generated
	 */
	int JTRY_CATCH = 5;

	/**
	 * The feature id for the '<em><b>Try</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRY_CATCH__TRY = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRY_CATCH__CATCHES = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JTry Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRY_CATCH_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JTryClauseImpl <em>JTry Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JTryClauseImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJTryClause()
	 * @generated
	 */
	int JTRY_CLAUSE = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRY_CLAUSE__PROPERTY = StatementsPackage.BLOCK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRY_CLAUSE__STATEMENTS = StatementsPackage.BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRY_CLAUSE__RESOURCES = StatementsPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JTry Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRY_CLAUSE_FEATURE_COUNT = StatementsPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JCatchClauseImpl <em>JCatch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JCatchClauseImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJCatchClause()
	 * @generated
	 */
	int JCATCH_CLAUSE = 7;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCATCH_CLAUSE__PROPERTY = StatementsPackage.BLOCK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCATCH_CLAUSE__STATEMENTS = StatementsPackage.BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCATCH_CLAUSE__EXCEPTIONS = StatementsPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCATCH_CLAUSE__PARAM = StatementsPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JCatch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCATCH_CLAUSE_FEATURE_COUNT = StatementsPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.InstanceOfImpl <em>Instance Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.InstanceOfImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getInstanceOf()
	 * @generated
	 */
	int INSTANCE_OF = 8;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__PROPERTY = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__OPERATOR = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__LEFT = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__RIGHT = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Instance Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.ThrowStatementImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getThrowStatement()
	 * @generated
	 */
	int THROW_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__THROWS = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JForImpl <em>JFor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JForImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJFor()
	 * @generated
	 */
	int JFOR = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFOR__PROPERTY = StatementsPackage.BLOCK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFOR__STATEMENTS = StatementsPackage.BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFOR__CONDITIONAL = StatementsPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFOR__INITIALIZERS = StatementsPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFOR__UPDATERS = StatementsPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JFor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFOR_FEATURE_COUNT = StatementsPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ccsl.java.impl.JReturnStatementImpl <em>JReturn Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccsl.java.impl.JReturnStatementImpl
	 * @see ccsl.java.impl.JavaPackageImpl#getJReturnStatement()
	 * @generated
	 */
	int JRETURN_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRETURN_STATEMENT__PROPERTY = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JReturn Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRETURN_STATEMENT_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link ccsl.java.JElement <em>JElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JElement</em>'.
	 * @see ccsl.java.JElement
	 * @generated
	 */
	EClass getJElement();

	/**
	 * Returns the meta object for class '{@link ccsl.java.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClass</em>'.
	 * @see ccsl.java.JClass
	 * @generated
	 */
	EClass getJClass();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.java.JClass#getNestedClasses <em>Nested Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Classes</em>'.
	 * @see ccsl.java.JClass#getNestedClasses()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_NestedClasses();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.java.JClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see ccsl.java.JClass#getImplements()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Implements();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.java.JClass#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see ccsl.java.JClass#getBlocks()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Blocks();

	/**
	 * Returns the meta object for class '{@link ccsl.java.JInterface <em>JInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JInterface</em>'.
	 * @see ccsl.java.JInterface
	 * @generated
	 */
	EClass getJInterface();

	/**
	 * Returns the meta object for class '{@link ccsl.java.JMethod <em>JMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JMethod</em>'.
	 * @see ccsl.java.JMethod
	 * @generated
	 */
	EClass getJMethod();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.java.JMethod#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Throws</em>'.
	 * @see ccsl.java.JMethod#getThrows()
	 * @see #getJMethod()
	 * @generated
	 */
	EReference getJMethod_Throws();

	/**
	 * Returns the meta object for class '{@link ccsl.java.JConstructor <em>JConstructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JConstructor</em>'.
	 * @see ccsl.java.JConstructor
	 * @generated
	 */
	EClass getJConstructor();

	/**
	 * Returns the meta object for class '{@link ccsl.java.JTryCatch <em>JTry Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JTry Catch</em>'.
	 * @see ccsl.java.JTryCatch
	 * @generated
	 */
	EClass getJTryCatch();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.java.JTryCatch#getTry <em>Try</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Try</em>'.
	 * @see ccsl.java.JTryCatch#getTry()
	 * @see #getJTryCatch()
	 * @generated
	 */
	EReference getJTryCatch_Try();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.java.JTryCatch#getCatches <em>Catches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catches</em>'.
	 * @see ccsl.java.JTryCatch#getCatches()
	 * @see #getJTryCatch()
	 * @generated
	 */
	EReference getJTryCatch_Catches();

	/**
	 * Returns the meta object for class '{@link ccsl.java.JTryClause <em>JTry Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JTry Clause</em>'.
	 * @see ccsl.java.JTryClause
	 * @generated
	 */
	EClass getJTryClause();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.java.JTryClause#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see ccsl.java.JTryClause#getResources()
	 * @see #getJTryClause()
	 * @generated
	 */
	EReference getJTryClause_Resources();

	/**
	 * Returns the meta object for class '{@link ccsl.java.JCatchClause <em>JCatch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JCatch Clause</em>'.
	 * @see ccsl.java.JCatchClause
	 * @generated
	 */
	EClass getJCatchClause();

	/**
	 * Returns the meta object for the reference list '{@link ccsl.java.JCatchClause#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exceptions</em>'.
	 * @see ccsl.java.JCatchClause#getExceptions()
	 * @see #getJCatchClause()
	 * @generated
	 */
	EReference getJCatchClause_Exceptions();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.java.JCatchClause#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param</em>'.
	 * @see ccsl.java.JCatchClause#getParam()
	 * @see #getJCatchClause()
	 * @generated
	 */
	EReference getJCatchClause_Param();

	/**
	 * Returns the meta object for class '{@link ccsl.java.InstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Of</em>'.
	 * @see ccsl.java.InstanceOf
	 * @generated
	 */
	EClass getInstanceOf();

	/**
	 * Returns the meta object for class '{@link ccsl.java.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Statement</em>'.
	 * @see ccsl.java.ThrowStatement
	 * @generated
	 */
	EClass getThrowStatement();

	/**
	 * Returns the meta object for the containment reference '{@link ccsl.java.ThrowStatement#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throws</em>'.
	 * @see ccsl.java.ThrowStatement#getThrows()
	 * @see #getThrowStatement()
	 * @generated
	 */
	EReference getThrowStatement_Throws();

	/**
	 * Returns the meta object for class '{@link ccsl.java.JFor <em>JFor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JFor</em>'.
	 * @see ccsl.java.JFor
	 * @generated
	 */
	EClass getJFor();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.java.JFor#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initializers</em>'.
	 * @see ccsl.java.JFor#getInitializers()
	 * @see #getJFor()
	 * @generated
	 */
	EReference getJFor_Initializers();

	/**
	 * Returns the meta object for the containment reference list '{@link ccsl.java.JFor#getUpdaters <em>Updaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Updaters</em>'.
	 * @see ccsl.java.JFor#getUpdaters()
	 * @see #getJFor()
	 * @generated
	 */
	EReference getJFor_Updaters();

	/**
	 * Returns the meta object for class '{@link ccsl.java.JReturnStatement <em>JReturn Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JReturn Statement</em>'.
	 * @see ccsl.java.JReturnStatement
	 * @generated
	 */
	EClass getJReturnStatement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaFactory getJavaFactory();

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
		 * The meta object literal for the '{@link ccsl.java.impl.JElementImpl <em>JElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JElementImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJElement()
		 * @generated
		 */
		EClass JELEMENT = eINSTANCE.getJElement();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.JClassImpl <em>JClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JClassImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJClass()
		 * @generated
		 */
		EClass JCLASS = eINSTANCE.getJClass();

		/**
		 * The meta object literal for the '<em><b>Nested Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__NESTED_CLASSES = eINSTANCE.getJClass_NestedClasses();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__IMPLEMENTS = eINSTANCE.getJClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__BLOCKS = eINSTANCE.getJClass_Blocks();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.JInterfaceImpl <em>JInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JInterfaceImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJInterface()
		 * @generated
		 */
		EClass JINTERFACE = eINSTANCE.getJInterface();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.JMethodImpl <em>JMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JMethodImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJMethod()
		 * @generated
		 */
		EClass JMETHOD = eINSTANCE.getJMethod();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHOD__THROWS = eINSTANCE.getJMethod_Throws();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.JConstructorImpl <em>JConstructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JConstructorImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJConstructor()
		 * @generated
		 */
		EClass JCONSTRUCTOR = eINSTANCE.getJConstructor();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.JTryCatchImpl <em>JTry Catch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JTryCatchImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJTryCatch()
		 * @generated
		 */
		EClass JTRY_CATCH = eINSTANCE.getJTryCatch();

		/**
		 * The meta object literal for the '<em><b>Try</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JTRY_CATCH__TRY = eINSTANCE.getJTryCatch_Try();

		/**
		 * The meta object literal for the '<em><b>Catches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JTRY_CATCH__CATCHES = eINSTANCE.getJTryCatch_Catches();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.JTryClauseImpl <em>JTry Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JTryClauseImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJTryClause()
		 * @generated
		 */
		EClass JTRY_CLAUSE = eINSTANCE.getJTryClause();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JTRY_CLAUSE__RESOURCES = eINSTANCE.getJTryClause_Resources();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.JCatchClauseImpl <em>JCatch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JCatchClauseImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJCatchClause()
		 * @generated
		 */
		EClass JCATCH_CLAUSE = eINSTANCE.getJCatchClause();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCATCH_CLAUSE__EXCEPTIONS = eINSTANCE.getJCatchClause_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCATCH_CLAUSE__PARAM = eINSTANCE.getJCatchClause_Param();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.InstanceOfImpl <em>Instance Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.InstanceOfImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getInstanceOf()
		 * @generated
		 */
		EClass INSTANCE_OF = eINSTANCE.getInstanceOf();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.ThrowStatementImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getThrowStatement()
		 * @generated
		 */
		EClass THROW_STATEMENT = eINSTANCE.getThrowStatement();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_STATEMENT__THROWS = eINSTANCE.getThrowStatement_Throws();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.JForImpl <em>JFor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JForImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJFor()
		 * @generated
		 */
		EClass JFOR = eINSTANCE.getJFor();

		/**
		 * The meta object literal for the '<em><b>Initializers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JFOR__INITIALIZERS = eINSTANCE.getJFor_Initializers();

		/**
		 * The meta object literal for the '<em><b>Updaters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JFOR__UPDATERS = eINSTANCE.getJFor_Updaters();

		/**
		 * The meta object literal for the '{@link ccsl.java.impl.JReturnStatementImpl <em>JReturn Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccsl.java.impl.JReturnStatementImpl
		 * @see ccsl.java.impl.JavaPackageImpl#getJReturnStatement()
		 * @generated
		 */
		EClass JRETURN_STATEMENT = eINSTANCE.getJReturnStatement();

	}

} //JavaPackage
