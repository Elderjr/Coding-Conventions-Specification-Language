/**
 */
package codingConvention.elements.statements.impl;

import codingConvention.elements.statements.MethodChaining;
import codingConvention.elements.statements.MethodInvocation;
import codingConvention.elements.statements.StatementsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Chaining</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.statements.impl.MethodChainingImpl#getInvocations <em>Invocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodChainingImpl extends StatementImpl implements MethodChaining {
	/**
	 * The cached value of the '{@link #getInvocations() <em>Invocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocations()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodInvocation> invocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodChainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.METHOD_CHAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodInvocation> getInvocations() {
		if (invocations == null) {
			invocations = new EObjectContainmentEList<MethodInvocation>(MethodInvocation.class, this,
					StatementsPackage.METHOD_CHAINING__INVOCATIONS);
		}
		return invocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.METHOD_CHAINING__INVOCATIONS:
			return ((InternalEList<?>) getInvocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatementsPackage.METHOD_CHAINING__INVOCATIONS:
			return getInvocations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatementsPackage.METHOD_CHAINING__INVOCATIONS:
			getInvocations().clear();
			getInvocations().addAll((Collection<? extends MethodInvocation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StatementsPackage.METHOD_CHAINING__INVOCATIONS:
			getInvocations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StatementsPackage.METHOD_CHAINING__INVOCATIONS:
			return invocations != null && !invocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodChainingImpl
