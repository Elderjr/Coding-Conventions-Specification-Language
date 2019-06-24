/**
 */
package ccsl.impl;

import ccsl.AtomicRule;
import ccsl.ccslPackage;

import ccsl.elements.Element;

import ccsl.filters.Filter;

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
 * An implementation of the model object '<em><b>Atomic Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.impl.AtomicRuleImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link ccsl.impl.AtomicRuleImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicRuleImpl extends RuleImpl implements AtomicRule {
	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Element scope;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ccslPackage.Literals.ATOMIC_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Element newScope, NotificationChain msgs) {
		Element oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ccslPackage.ATOMIC_RULE__SCOPE, oldScope, newScope);
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
	public void setScope(Element newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject) scope).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ccslPackage.ATOMIC_RULE__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject) newScope).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ccslPackage.ATOMIC_RULE__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ccslPackage.ATOMIC_RULE__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList(Filter.class, this, ccslPackage.ATOMIC_RULE__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ccslPackage.ATOMIC_RULE__SCOPE:
			return basicSetScope(null, msgs);
		case ccslPackage.ATOMIC_RULE__FILTER:
			return ((InternalEList) getFilter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ccslPackage.ATOMIC_RULE__SCOPE:
			return getScope();
		case ccslPackage.ATOMIC_RULE__FILTER:
			return getFilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ccslPackage.ATOMIC_RULE__SCOPE:
			setScope((Element) newValue);
			return;
		case ccslPackage.ATOMIC_RULE__FILTER:
			getFilter().clear();
			getFilter().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case ccslPackage.ATOMIC_RULE__SCOPE:
			setScope((Element) null);
			return;
		case ccslPackage.ATOMIC_RULE__FILTER:
			getFilter().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ccslPackage.ATOMIC_RULE__SCOPE:
			return scope != null;
		case ccslPackage.ATOMIC_RULE__FILTER:
			return filter != null && !filter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AtomicRuleImpl
