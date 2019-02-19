/**
 */
package codingConvetionMetamodel.impl;

import codingConvetionMetamodel.AtomicRule;
import codingConvetionMetamodel.CodingConventionsMetamodelPackage;

import codingConvetionMetamodel.elements.Element;

import codingConvetionMetamodel.filters.Filter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link codingConvetionMetamodel.impl.AtomicRuleImpl#getElement <em>Element</em>}</li>
 *   <li>{@link codingConvetionMetamodel.impl.AtomicRuleImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicRuleImpl extends RuleImpl implements AtomicRule {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList element;

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
		return CodingConventionsMetamodelPackage.Literals.ATOMIC_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElement() {
		if (element == null) {
			element = new EObjectContainmentEList(Element.class, this,
					CodingConventionsMetamodelPackage.ATOMIC_RULE__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList(Filter.class, this,
					CodingConventionsMetamodelPackage.ATOMIC_RULE__FILTER);
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
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__ELEMENT:
			return ((InternalEList) getElement()).basicRemove(otherEnd, msgs);
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__FILTER:
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
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__ELEMENT:
			return getElement();
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__FILTER:
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
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection) newValue);
			return;
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__FILTER:
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
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__ELEMENT:
			getElement().clear();
			return;
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__FILTER:
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
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__ELEMENT:
			return element != null && !element.isEmpty();
		case CodingConventionsMetamodelPackage.ATOMIC_RULE__FILTER:
			return filter != null && !filter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AtomicRuleImpl
