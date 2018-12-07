/**
 */
package codingConvention.elements.statements.impl;

import codingConvention.elements.statements.CatchClause;
import codingConvention.elements.statements.FinallyClause;
import codingConvention.elements.statements.JavaExceptionHandling;
import codingConvention.elements.statements.StatementsPackage;
import codingConvention.elements.statements.TryClause;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Exception Handling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.statements.impl.JavaExceptionHandlingImpl#getFinallyClause <em>Finally Clause</em>}</li>
 *   <li>{@link codingConvention.elements.statements.impl.JavaExceptionHandlingImpl#getCatchClause <em>Catch Clause</em>}</li>
 *   <li>{@link codingConvention.elements.statements.impl.JavaExceptionHandlingImpl#getTryClause <em>Try Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaExceptionHandlingImpl extends ExceptionHandlingImpl implements JavaExceptionHandling {
	/**
	 * The cached value of the '{@link #getFinallyClause() <em>Finally Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinallyClause()
	 * @generated
	 * @ordered
	 */
	protected FinallyClause finallyClause;

	/**
	 * The cached value of the '{@link #getCatchClause() <em>Catch Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClause()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchClause> catchClause;

	/**
	 * The cached value of the '{@link #getTryClause() <em>Try Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTryClause()
	 * @generated
	 * @ordered
	 */
	protected TryClause tryClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaExceptionHandlingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.JAVA_EXCEPTION_HANDLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinallyClause getFinallyClause() {
		return finallyClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinallyClause(FinallyClause newFinallyClause, NotificationChain msgs) {
		FinallyClause oldFinallyClause = finallyClause;
		finallyClause = newFinallyClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatementsPackage.JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE, oldFinallyClause, newFinallyClause);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinallyClause(FinallyClause newFinallyClause) {
		if (newFinallyClause != finallyClause) {
			NotificationChain msgs = null;
			if (finallyClause != null)
				msgs = ((InternalEObject) finallyClause).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE, null, msgs);
			if (newFinallyClause != null)
				msgs = ((InternalEObject) newFinallyClause).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE, null, msgs);
			msgs = basicSetFinallyClause(newFinallyClause, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatementsPackage.JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE, newFinallyClause, newFinallyClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatchClause> getCatchClause() {
		if (catchClause == null) {
			catchClause = new EObjectContainmentEList<CatchClause>(CatchClause.class, this,
					StatementsPackage.JAVA_EXCEPTION_HANDLING__CATCH_CLAUSE);
		}
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryClause getTryClause() {
		return tryClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTryClause(TryClause newTryClause, NotificationChain msgs) {
		TryClause oldTryClause = tryClause;
		tryClause = newTryClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatementsPackage.JAVA_EXCEPTION_HANDLING__TRY_CLAUSE, oldTryClause, newTryClause);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTryClause(TryClause newTryClause) {
		if (newTryClause != tryClause) {
			NotificationChain msgs = null;
			if (tryClause != null)
				msgs = ((InternalEObject) tryClause).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.JAVA_EXCEPTION_HANDLING__TRY_CLAUSE, null, msgs);
			if (newTryClause != null)
				msgs = ((InternalEObject) newTryClause).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.JAVA_EXCEPTION_HANDLING__TRY_CLAUSE, null, msgs);
			msgs = basicSetTryClause(newTryClause, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.JAVA_EXCEPTION_HANDLING__TRY_CLAUSE,
					newTryClause, newTryClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE:
			return basicSetFinallyClause(null, msgs);
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__CATCH_CLAUSE:
			return ((InternalEList<?>) getCatchClause()).basicRemove(otherEnd, msgs);
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__TRY_CLAUSE:
			return basicSetTryClause(null, msgs);
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
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE:
			return getFinallyClause();
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__CATCH_CLAUSE:
			return getCatchClause();
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__TRY_CLAUSE:
			return getTryClause();
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
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE:
			setFinallyClause((FinallyClause) newValue);
			return;
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__CATCH_CLAUSE:
			getCatchClause().clear();
			getCatchClause().addAll((Collection<? extends CatchClause>) newValue);
			return;
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__TRY_CLAUSE:
			setTryClause((TryClause) newValue);
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
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE:
			setFinallyClause((FinallyClause) null);
			return;
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__CATCH_CLAUSE:
			getCatchClause().clear();
			return;
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__TRY_CLAUSE:
			setTryClause((TryClause) null);
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
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__FINALLY_CLAUSE:
			return finallyClause != null;
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__CATCH_CLAUSE:
			return catchClause != null && !catchClause.isEmpty();
		case StatementsPackage.JAVA_EXCEPTION_HANDLING__TRY_CLAUSE:
			return tryClause != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaExceptionHandlingImpl
