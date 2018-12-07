/**
 */
package codingConvention.elements.namedElements.impl;

import codingConvention.elements.namedElements.Field;
import codingConvention.elements.namedElements.Interface;
import codingConvention.elements.namedElements.Method;
import codingConvention.elements.namedElements.NamedElementsFactory;
import codingConvention.elements.namedElements.NamedElementsPackage;
import codingConvention.elements.namedElements.Parameter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedElementsFactoryImpl extends EFactoryImpl implements NamedElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NamedElementsFactory init() {
		try {
			NamedElementsFactory theNamedElementsFactory = (NamedElementsFactory) EPackage.Registry.INSTANCE
					.getEFactory(NamedElementsPackage.eNS_URI);
			if (theNamedElementsFactory != null) {
				return theNamedElementsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NamedElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NamedElementsPackage.CLASS:
			return createClass();
		case NamedElementsPackage.METHOD:
			return createMethod();
		case NamedElementsPackage.FIELD:
			return createField();
		case NamedElementsPackage.PARAMETER:
			return createParameter();
		case NamedElementsPackage.EXCEPTION:
			return createException();
		case NamedElementsPackage.INTERFACE:
			return createInterface();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public codingConvention.elements.namedElements.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public codingConvention.elements.namedElements.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementsPackage getNamedElementsPackage() {
		return (NamedElementsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NamedElementsPackage getPackage() {
		return NamedElementsPackage.eINSTANCE;
	}

} //NamedElementsFactoryImpl
