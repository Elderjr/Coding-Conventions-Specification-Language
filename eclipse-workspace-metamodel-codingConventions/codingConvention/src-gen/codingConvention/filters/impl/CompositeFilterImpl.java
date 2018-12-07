/**
 */
package codingConvention.filters.impl;

import codingConvention.filters.CompositeFilter;
import codingConvention.filters.Filter;
import codingConvention.filters.FilterOperation;
import codingConvention.filters.FiltersPackage;

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
 * An implementation of the model object '<em><b>Composite Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.filters.impl.CompositeFilterImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link codingConvention.filters.impl.CompositeFilterImpl#getNewAttribute <em>New Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeFilterImpl extends FilterImpl implements CompositeFilter {
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filter;

	/**
	 * The default value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final FilterOperation NEW_ATTRIBUTE_EDEFAULT = FilterOperation.AND;

	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected FilterOperation newAttribute = NEW_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.COMPOSITE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Filter>(Filter.class, this, FiltersPackage.COMPOSITE_FILTER__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperation getNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAttribute(FilterOperation newNewAttribute) {
		FilterOperation oldNewAttribute = newAttribute;
		newAttribute = newNewAttribute == null ? NEW_ATTRIBUTE_EDEFAULT : newNewAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.COMPOSITE_FILTER__NEW_ATTRIBUTE,
					oldNewAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FiltersPackage.COMPOSITE_FILTER__FILTER:
			return ((InternalEList<?>) getFilter()).basicRemove(otherEnd, msgs);
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
		case FiltersPackage.COMPOSITE_FILTER__FILTER:
			return getFilter();
		case FiltersPackage.COMPOSITE_FILTER__NEW_ATTRIBUTE:
			return getNewAttribute();
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
		case FiltersPackage.COMPOSITE_FILTER__FILTER:
			getFilter().clear();
			getFilter().addAll((Collection<? extends Filter>) newValue);
			return;
		case FiltersPackage.COMPOSITE_FILTER__NEW_ATTRIBUTE:
			setNewAttribute((FilterOperation) newValue);
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
		case FiltersPackage.COMPOSITE_FILTER__FILTER:
			getFilter().clear();
			return;
		case FiltersPackage.COMPOSITE_FILTER__NEW_ATTRIBUTE:
			setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
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
		case FiltersPackage.COMPOSITE_FILTER__FILTER:
			return filter != null && !filter.isEmpty();
		case FiltersPackage.COMPOSITE_FILTER__NEW_ATTRIBUTE:
			return newAttribute != NEW_ATTRIBUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (newAttribute: ");
		result.append(newAttribute);
		result.append(')');
		return result.toString();
	}

} //CompositeFilterImpl
