/**
 */
package codingConvention.values.impl;

import codingConvention.values.*;

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
public class ValuesFactoryImpl extends EFactoryImpl implements ValuesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValuesFactory init() {
		try {
			ValuesFactory theValuesFactory = (ValuesFactory) EPackage.Registry.INSTANCE
					.getEFactory(ValuesPackage.eNS_URI);
			if (theValuesFactory != null) {
				return theValuesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValuesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesFactoryImpl() {
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
		case ValuesPackage.REFERENCED_VALUE:
			return createReferencedValue();
		case ValuesPackage.LITERAL_VALUE:
			return createLiteralValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedValue createReferencedValue() {
		ReferencedValueImpl referencedValue = new ReferencedValueImpl();
		return referencedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralValue createLiteralValue() {
		LiteralValueImpl literalValue = new LiteralValueImpl();
		return literalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesPackage getValuesPackage() {
		return (ValuesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValuesPackage getPackage() {
		return ValuesPackage.eINSTANCE;
	}

} //ValuesFactoryImpl
