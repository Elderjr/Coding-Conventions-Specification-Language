/**
 */
package codingConvention.elements.statements.impl;

import codingConvention.elements.statements.*;

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
public class StatementsFactoryImpl extends EFactoryImpl implements StatementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatementsFactory init() {
		try {
			StatementsFactory theStatementsFactory = (StatementsFactory) EPackage.Registry.INSTANCE
					.getEFactory(StatementsPackage.eNS_URI);
			if (theStatementsFactory != null) {
				return theStatementsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsFactoryImpl() {
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
		case StatementsPackage.METHOD_INVOCATION:
			return createMethodInvocation();
		case StatementsPackage.METHOD_CHAINING:
			return createMethodChaining();
		case StatementsPackage.ACCESS_MODIFIER:
			return createAccessModifier();
		case StatementsPackage.JAVA_EXCEPTION_HANDLING:
			return createJavaExceptionHandling();
		case StatementsPackage.CATCH_CLAUSE:
			return createCatchClause();
		case StatementsPackage.FINALLY_CLAUSE:
			return createFinallyClause();
		case StatementsPackage.TRY_CLAUSE:
			return createTryClause();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodInvocation createMethodInvocation() {
		MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
		return methodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodChaining createMethodChaining() {
		MethodChainingImpl methodChaining = new MethodChainingImpl();
		return methodChaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier createAccessModifier() {
		AccessModifierImpl accessModifier = new AccessModifierImpl();
		return accessModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaExceptionHandling createJavaExceptionHandling() {
		JavaExceptionHandlingImpl javaExceptionHandling = new JavaExceptionHandlingImpl();
		return javaExceptionHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchClause createCatchClause() {
		CatchClauseImpl catchClause = new CatchClauseImpl();
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinallyClause createFinallyClause() {
		FinallyClauseImpl finallyClause = new FinallyClauseImpl();
		return finallyClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryClause createTryClause() {
		TryClauseImpl tryClause = new TryClauseImpl();
		return tryClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsPackage getStatementsPackage() {
		return (StatementsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatementsPackage getPackage() {
		return StatementsPackage.eINSTANCE;
	}

} //StatementsFactoryImpl
