/**
 */
package codingConvention.elements.statements.impl;

import codingConvention.elements.namedElements.NamedElement;

import codingConvention.elements.statements.MethodInvocation;
import codingConvention.elements.statements.Statement;
import codingConvention.elements.statements.StatementsPackage;

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
 * An implementation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.statements.impl.MethodInvocationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link codingConvention.elements.statements.impl.MethodInvocationImpl#getTo <em>To</em>}</li>
 *   <li>{@link codingConvention.elements.statements.impl.MethodInvocationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodInvocationImpl extends StatementImpl implements MethodInvocation {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected NamedElement from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected NamedElement to;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.METHOD_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (NamedElement) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.METHOD_INVOCATION__FROM,
							oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(NamedElement newFrom) {
		NamedElement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.METHOD_INVOCATION__FROM, oldFrom,
					from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (NamedElement) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.METHOD_INVOCATION__TO,
							oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(NamedElement newTo) {
		NamedElement oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.METHOD_INVOCATION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Statement>(Statement.class, this,
					StatementsPackage.METHOD_INVOCATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.METHOD_INVOCATION__ARGUMENTS:
			return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
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
		case StatementsPackage.METHOD_INVOCATION__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case StatementsPackage.METHOD_INVOCATION__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		case StatementsPackage.METHOD_INVOCATION__ARGUMENTS:
			return getArguments();
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
		case StatementsPackage.METHOD_INVOCATION__FROM:
			setFrom((NamedElement) newValue);
			return;
		case StatementsPackage.METHOD_INVOCATION__TO:
			setTo((NamedElement) newValue);
			return;
		case StatementsPackage.METHOD_INVOCATION__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection<? extends Statement>) newValue);
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
		case StatementsPackage.METHOD_INVOCATION__FROM:
			setFrom((NamedElement) null);
			return;
		case StatementsPackage.METHOD_INVOCATION__TO:
			setTo((NamedElement) null);
			return;
		case StatementsPackage.METHOD_INVOCATION__ARGUMENTS:
			getArguments().clear();
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
		case StatementsPackage.METHOD_INVOCATION__FROM:
			return from != null;
		case StatementsPackage.METHOD_INVOCATION__TO:
			return to != null;
		case StatementsPackage.METHOD_INVOCATION__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodInvocationImpl
