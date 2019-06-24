/**
 */
package ccsl.elements.namedElements.impl;

import ccsl.elements.namedElements.NamedElement;
import ccsl.elements.namedElements.NamedElementsPackage;
import ccsl.elements.namedElements.Namespace;

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
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.elements.namedElements.impl.NamespaceImpl#getGroupedElements <em>Grouped Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends MinimalEObjectImpl.Container implements Namespace {
	/**
	 * The cached value of the '{@link #getGroupedElements() <em>Grouped Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedElements()
	 * @generated
	 * @ordered
	 */
	protected EList groupedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NamedElementsPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGroupedElements() {
		if (groupedElements == null) {
			groupedElements = new EObjectContainmentEList(NamedElement.class, this,
					NamedElementsPackage.NAMESPACE__GROUPED_ELEMENTS);
		}
		return groupedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NamedElementsPackage.NAMESPACE__GROUPED_ELEMENTS:
			return ((InternalEList) getGroupedElements()).basicRemove(otherEnd, msgs);
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
		case NamedElementsPackage.NAMESPACE__GROUPED_ELEMENTS:
			return getGroupedElements();
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
		case NamedElementsPackage.NAMESPACE__GROUPED_ELEMENTS:
			getGroupedElements().clear();
			getGroupedElements().addAll((Collection) newValue);
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
		case NamedElementsPackage.NAMESPACE__GROUPED_ELEMENTS:
			getGroupedElements().clear();
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
		case NamedElementsPackage.NAMESPACE__GROUPED_ELEMENTS:
			return groupedElements != null && !groupedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamespaceImpl
