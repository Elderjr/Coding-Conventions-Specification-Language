/**
 */
package codingConvention.impl;

import codingConvention.CodingConventionPackage;
import codingConvention.Rule;

import codingConvention.elements.Element;

import codingConvention.filters.Filter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.impl.RuleImpl#getMatchElements <em>Match Elements</em>}</li>
 *   <li>{@link codingConvention.impl.RuleImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The cached value of the '{@link #getMatchElements() <em>Match Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> matchElements;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodingConventionPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getMatchElements() {
		if (matchElements == null) {
			matchElements = new EObjectContainmentEList<Element>(Element.class, this,
					CodingConventionPackage.RULE__MATCH_ELEMENTS);
		}
		return matchElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, CodingConventionPackage.RULE__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CodingConventionPackage.RULE__MATCH_ELEMENTS:
			return ((InternalEList<?>) getMatchElements()).basicRemove(otherEnd, msgs);
		case CodingConventionPackage.RULE__FILTERS:
			return ((InternalEList<?>) getFilters()).basicRemove(otherEnd, msgs);
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
		case CodingConventionPackage.RULE__MATCH_ELEMENTS:
			return getMatchElements();
		case CodingConventionPackage.RULE__FILTERS:
			return getFilters();
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
		case CodingConventionPackage.RULE__MATCH_ELEMENTS:
			getMatchElements().clear();
			getMatchElements().addAll((Collection<? extends Element>) newValue);
			return;
		case CodingConventionPackage.RULE__FILTERS:
			getFilters().clear();
			getFilters().addAll((Collection<? extends Filter>) newValue);
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
		case CodingConventionPackage.RULE__MATCH_ELEMENTS:
			getMatchElements().clear();
			return;
		case CodingConventionPackage.RULE__FILTERS:
			getFilters().clear();
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
		case CodingConventionPackage.RULE__MATCH_ELEMENTS:
			return matchElements != null && !matchElements.isEmpty();
		case CodingConventionPackage.RULE__FILTERS:
			return filters != null && !filters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleImpl
