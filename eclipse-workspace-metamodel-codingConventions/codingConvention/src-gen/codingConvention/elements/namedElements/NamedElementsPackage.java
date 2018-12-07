/**
 */
package codingConvention.elements.namedElements;

import codingConvention.elements.ElementsPackage;

import codingConvention.elements.types.TypesPackage;

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
 * @see codingConvention.elements.namedElements.NamedElementsFactory
 * @model kind="package"
 * @generated
 */
public interface NamedElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "namedElements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codingConvention/elements/namedElements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "namedElements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NamedElementsPackage eINSTANCE = codingConvention.elements.namedElements.impl.NamedElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link codingConvention.elements.namedElements.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.namedElements.impl.ClassImpl
	 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTIES = TypesPackage.COMPLEX_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Instance Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INSTANCE_METHODS = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUB_CLASSES = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Class Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_METHODS = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPLEMENTS = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = TypesPackage.COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.namedElements.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.namedElements.impl.MethodImpl
	 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Sub Methods</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SUB_METHODS = 2;

	/**
	 * The feature id for the '<em><b>Super Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SUPER_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__THROWS = 4;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.namedElements.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.namedElements.impl.NamedElementImpl
	 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__PROPERTIES = ElementsPackage.ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ElementsPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ElementsPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.namedElements.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.namedElements.impl.VariableImpl
	 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PROPERTIES = NAMED_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.namedElements.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.namedElements.impl.FieldImpl
	 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PROPERTIES = VARIABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.namedElements.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.namedElements.impl.ParameterImpl
	 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PROPERTIES = VARIABLE__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.namedElements.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.namedElements.impl.ExceptionImpl
	 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__PROPERTIES = CLASS__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Instance Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__INSTANCE_METHODS = CLASS__INSTANCE_METHODS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Sub Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__SUB_CLASSES = CLASS__SUB_CLASSES;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__SUPER_CLASS = CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Class Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__CLASS_METHODS = CLASS__CLASS_METHODS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__IMPLEMENTS = CLASS__IMPLEMENTS;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.namedElements.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.namedElements.impl.InterfaceImpl
	 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PROPERTIES = TypesPackage.COMPLEX_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SUB_INTERFACES = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfacee Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACEE_OPPOSITE = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = TypesPackage.COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingConvention.elements.namedElements.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingConvention.elements.namedElements.impl.ConstructorImpl
	 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 8;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__RETURN_TYPE = METHOD__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETER = METHOD__PARAMETER;

	/**
	 * The feature id for the '<em><b>Sub Methods</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__SUB_METHODS = METHOD__SUB_METHODS;

	/**
	 * The feature id for the '<em><b>Super Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__SUPER_METHOD = METHOD__SUPER_METHOD;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__THROWS = METHOD__THROWS;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.namedElements.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see codingConvention.elements.namedElements.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.elements.namedElements.Class#getInstanceMethods <em>Instance Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Methods</em>'.
	 * @see codingConvention.elements.namedElements.Class#getInstanceMethods()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_InstanceMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.elements.namedElements.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see codingConvention.elements.namedElements.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link codingConvention.elements.namedElements.Class#getSubClasses <em>Sub Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Classes</em>'.
	 * @see codingConvention.elements.namedElements.Class#getSubClasses()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SubClasses();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.elements.namedElements.Class#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see codingConvention.elements.namedElements.Class#getSuperClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SuperClass();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.elements.namedElements.Class#getClassMethods <em>Class Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Methods</em>'.
	 * @see codingConvention.elements.namedElements.Class#getClassMethods()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ClassMethods();

	/**
	 * Returns the meta object for the reference list '{@link codingConvention.elements.namedElements.Class#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see codingConvention.elements.namedElements.Class#getImplements()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Implements();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.namedElements.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see codingConvention.elements.namedElements.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.elements.namedElements.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see codingConvention.elements.namedElements.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link codingConvention.elements.namedElements.Method#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see codingConvention.elements.namedElements.Method#getParameter()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameter();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.elements.namedElements.Method#getSubMethods <em>Sub Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Methods</em>'.
	 * @see codingConvention.elements.namedElements.Method#getSubMethods()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_SubMethods();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.elements.namedElements.Method#getSuperMethod <em>Super Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Method</em>'.
	 * @see codingConvention.elements.namedElements.Method#getSuperMethod()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_SuperMethod();

	/**
	 * Returns the meta object for the reference list '{@link codingConvention.elements.namedElements.Method#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Throws</em>'.
	 * @see codingConvention.elements.namedElements.Method#getThrows()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Throws();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.namedElements.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see codingConvention.elements.namedElements.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.namedElements.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see codingConvention.elements.namedElements.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.elements.namedElements.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see codingConvention.elements.namedElements.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.namedElements.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see codingConvention.elements.namedElements.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.namedElements.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see codingConvention.elements.namedElements.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.namedElements.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see codingConvention.elements.namedElements.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.namedElements.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see codingConvention.elements.namedElements.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link codingConvention.elements.namedElements.Interface#getSubInterfaces <em>Sub Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Interfaces</em>'.
	 * @see codingConvention.elements.namedElements.Interface#getSubInterfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_SubInterfaces();

	/**
	 * Returns the meta object for the reference '{@link codingConvention.elements.namedElements.Interface#getInterfaceeOpposite <em>Interfacee Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interfacee Opposite</em>'.
	 * @see codingConvention.elements.namedElements.Interface#getInterfaceeOpposite()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_InterfaceeOpposite();

	/**
	 * Returns the meta object for class '{@link codingConvention.elements.namedElements.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see codingConvention.elements.namedElements.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NamedElementsFactory getNamedElementsFactory();

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
		 * The meta object literal for the '{@link codingConvention.elements.namedElements.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.namedElements.impl.ClassImpl
		 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Instance Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INSTANCE_METHODS = eINSTANCE.getClass_InstanceMethods();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Sub Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUB_CLASSES = eINSTANCE.getClass_SubClasses();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPER_CLASS = eINSTANCE.getClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Class Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CLASS_METHODS = eINSTANCE.getClass_ClassMethods();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IMPLEMENTS = eINSTANCE.getClass_Implements();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.namedElements.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.namedElements.impl.MethodImpl
		 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETER = eINSTANCE.getMethod_Parameter();

		/**
		 * The meta object literal for the '<em><b>Sub Methods</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__SUB_METHODS = eINSTANCE.getMethod_SubMethods();

		/**
		 * The meta object literal for the '<em><b>Super Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__SUPER_METHOD = eINSTANCE.getMethod_SuperMethod();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__THROWS = eINSTANCE.getMethod_Throws();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.namedElements.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.namedElements.impl.NamedElementImpl
		 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.namedElements.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.namedElements.impl.FieldImpl
		 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.namedElements.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.namedElements.impl.ParameterImpl
		 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.namedElements.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.namedElements.impl.ExceptionImpl
		 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.namedElements.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.namedElements.impl.VariableImpl
		 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.namedElements.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.namedElements.impl.InterfaceImpl
		 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Sub Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SUB_INTERFACES = eINSTANCE.getInterface_SubInterfaces();

		/**
		 * The meta object literal for the '<em><b>Interfacee Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__INTERFACEE_OPPOSITE = eINSTANCE.getInterface_InterfaceeOpposite();

		/**
		 * The meta object literal for the '{@link codingConvention.elements.namedElements.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingConvention.elements.namedElements.impl.ConstructorImpl
		 * @see codingConvention.elements.namedElements.impl.NamedElementsPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

	}

} //NamedElementsPackage
