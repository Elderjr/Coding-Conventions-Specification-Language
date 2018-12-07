/**
 */
package codingConvention.elements.statements.impl;

import codingConvention.elements.statements.CatchClause;
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
 * An implementation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.statements.impl.CatchClauseImpl#getExceptionHandled <em>Exception Handled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatchClauseImpl extends BodyImpl implements CatchClause {
	/**
	 * The cached value of the '{@link #getExceptionHandled() <em>Exception Handled</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionHandled()
	 * @generated
	 * @ordered
	 */
	protected EList<codingConvention.elements.namedElements.Exception> exceptionHandled;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.CATCH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<codingConvention.elements.namedElements.Exception> getExceptionHandled() {
		if (exceptionHandled == null) {
			exceptionHandled = new EObjectContainmentEList<codingConvention.elements.namedElements.Exception>(
					codingConvention.elements.namedElements.Exception.class, this,
					StatementsPackage.CATCH_CLAUSE__EXCEPTION_HANDLED);
		}
		return exceptionHandled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.CATCH_CLAUSE__EXCEPTION_HANDLED:
			return ((InternalEList<?>) getExceptionHandled()).basicRemove(otherEnd, msgs);
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
		case StatementsPackage.CATCH_CLAUSE__EXCEPTION_HANDLED:
			return getExceptionHandled();
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
		case StatementsPackage.CATCH_CLAUSE__EXCEPTION_HANDLED:
			getExceptionHandled().clear();
			getExceptionHandled()
					.addAll((Collection<? extends codingConvention.elements.namedElements.Exception>) newValue);
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
		case StatementsPackage.CATCH_CLAUSE__EXCEPTION_HANDLED:
			getExceptionHandled().clear();
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
		case StatementsPackage.CATCH_CLAUSE__EXCEPTION_HANDLED:
			return exceptionHandled != null && !exceptionHandled.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CatchClauseImpl
