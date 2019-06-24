/**
 */
package ccsl.impl;

import ccsl.Rule;
import ccsl.ccslPackage;

import ccsl.elements.Element;

import ccsl.elements.datatype.PrimitiveType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link ccsl.impl.RuleImpl#isNegated <em>Negated</em>}</li>
 *   <li>{@link ccsl.impl.RuleImpl#getPrimitiveTypesReferences <em>Primitive Types References</em>}</li>
 *   <li>{@link ccsl.impl.RuleImpl#getAuxiliaryElements <em>Auxiliary Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean negated = NEGATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimitiveTypesReferences() <em>Primitive Types References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypesReferences()
	 * @generated
	 * @ordered
	 */
	protected EList primitiveTypesReferences;

	/**
	 * The cached value of the '{@link #getAuxiliaryElements() <em>Auxiliary Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryElements()
	 * @generated
	 * @ordered
	 */
	protected EList auxiliaryElements;

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
	protected EClass eStaticClass() {
		return ccslPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegated(boolean newNegated) {
		boolean oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ccslPackage.RULE__NEGATED, oldNegated, negated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPrimitiveTypesReferences() {
		if (primitiveTypesReferences == null) {
			primitiveTypesReferences = new EObjectContainmentEList(PrimitiveType.class, this,
					ccslPackage.RULE__PRIMITIVE_TYPES_REFERENCES);
		}
		return primitiveTypesReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAuxiliaryElements() {
		if (auxiliaryElements == null) {
			auxiliaryElements = new EObjectContainmentEList(Element.class, this, ccslPackage.RULE__AUXILIARY_ELEMENTS);
		}
		return auxiliaryElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ccslPackage.RULE__PRIMITIVE_TYPES_REFERENCES:
			return ((InternalEList) getPrimitiveTypesReferences()).basicRemove(otherEnd, msgs);
		case ccslPackage.RULE__AUXILIARY_ELEMENTS:
			return ((InternalEList) getAuxiliaryElements()).basicRemove(otherEnd, msgs);
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
		case ccslPackage.RULE__NEGATED:
			return isNegated() ? Boolean.TRUE : Boolean.FALSE;
		case ccslPackage.RULE__PRIMITIVE_TYPES_REFERENCES:
			return getPrimitiveTypesReferences();
		case ccslPackage.RULE__AUXILIARY_ELEMENTS:
			return getAuxiliaryElements();
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
		case ccslPackage.RULE__NEGATED:
			setNegated(((Boolean) newValue).booleanValue());
			return;
		case ccslPackage.RULE__PRIMITIVE_TYPES_REFERENCES:
			getPrimitiveTypesReferences().clear();
			getPrimitiveTypesReferences().addAll((Collection) newValue);
			return;
		case ccslPackage.RULE__AUXILIARY_ELEMENTS:
			getAuxiliaryElements().clear();
			getAuxiliaryElements().addAll((Collection) newValue);
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
		case ccslPackage.RULE__NEGATED:
			setNegated(NEGATED_EDEFAULT);
			return;
		case ccslPackage.RULE__PRIMITIVE_TYPES_REFERENCES:
			getPrimitiveTypesReferences().clear();
			return;
		case ccslPackage.RULE__AUXILIARY_ELEMENTS:
			getAuxiliaryElements().clear();
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
		case ccslPackage.RULE__NEGATED:
			return negated != NEGATED_EDEFAULT;
		case ccslPackage.RULE__PRIMITIVE_TYPES_REFERENCES:
			return primitiveTypesReferences != null && !primitiveTypesReferences.isEmpty();
		case ccslPackage.RULE__AUXILIARY_ELEMENTS:
			return auxiliaryElements != null && !auxiliaryElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (negated: ");
		result.append(negated);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
