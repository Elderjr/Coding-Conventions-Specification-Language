/**
 */
package codingConvetionMetamodel.impl;

import codingConvetionMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CodingConventionsMetamodelFactoryImpl extends EFactoryImpl implements CodingConventionsMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodingConventionsMetamodelFactory init() {
		try {
			CodingConventionsMetamodelFactory theCodingConventionsMetamodelFactory = (CodingConventionsMetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(CodingConventionsMetamodelPackage.eNS_URI);
			if (theCodingConventionsMetamodelFactory != null) {
				return theCodingConventionsMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodingConventionsMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingConventionsMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CodingConventionsMetamodelPackage.COMPOSITE_RULE:
			return createCompositeRule();
		case CodingConventionsMetamodelPackage.ATOMIC_RULE:
			return createAtomicRule();
		case CodingConventionsMetamodelPackage.JANNOTATIONS:
			return createJAnnotations();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CodingConventionsMetamodelPackage.LOGIC_OPERATORS:
			return createLogicOperatorsFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CodingConventionsMetamodelPackage.LOGIC_OPERATORS:
			return convertLogicOperatorsToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeRule createCompositeRule() {
		CompositeRuleImpl compositeRule = new CompositeRuleImpl();
		return compositeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicRule createAtomicRule() {
		AtomicRuleImpl atomicRule = new AtomicRuleImpl();
		return atomicRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAnnotations createJAnnotations() {
		JAnnotationsImpl jAnnotations = new JAnnotationsImpl();
		return jAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicOperators createLogicOperatorsFromString(EDataType eDataType, String initialValue) {
		LogicOperators result = LogicOperators.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingConventionsMetamodelPackage getCodingConventionsMetamodelPackage() {
		return (CodingConventionsMetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static CodingConventionsMetamodelPackage getPackage() {
		return CodingConventionsMetamodelPackage.eINSTANCE;
	}

} //CodingConventionsMetamodelFactoryImpl
