/**
 */
package ccsl.impl;

import ccsl.MainContent;
import ccsl.Rule;
import ccsl.ccslPackage;

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
 * An implementation of the model object '<em><b>Main Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.impl.MainContentImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link ccsl.impl.MainContentImpl#getPrimitiveTypesReferences <em>Primitive Types References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainContentImpl extends MinimalEObjectImpl.Container implements MainContent {
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ccslPackage.Literals.MAIN_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		Rule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ccslPackage.MAIN_CONTENT__RULE, oldRule, newRule);
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
	public void setRule(Rule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject) rule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ccslPackage.MAIN_CONTENT__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ccslPackage.MAIN_CONTENT__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ccslPackage.MAIN_CONTENT__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPrimitiveTypesReferences() {
		if (primitiveTypesReferences == null) {
			primitiveTypesReferences = new EObjectContainmentEList(PrimitiveType.class, this,
					ccslPackage.MAIN_CONTENT__PRIMITIVE_TYPES_REFERENCES);
		}
		return primitiveTypesReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ccslPackage.MAIN_CONTENT__RULE:
			return basicSetRule(null, msgs);
		case ccslPackage.MAIN_CONTENT__PRIMITIVE_TYPES_REFERENCES:
			return ((InternalEList) getPrimitiveTypesReferences()).basicRemove(otherEnd, msgs);
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
		case ccslPackage.MAIN_CONTENT__RULE:
			return getRule();
		case ccslPackage.MAIN_CONTENT__PRIMITIVE_TYPES_REFERENCES:
			return getPrimitiveTypesReferences();
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
		case ccslPackage.MAIN_CONTENT__RULE:
			setRule((Rule) newValue);
			return;
		case ccslPackage.MAIN_CONTENT__PRIMITIVE_TYPES_REFERENCES:
			getPrimitiveTypesReferences().clear();
			getPrimitiveTypesReferences().addAll((Collection) newValue);
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
		case ccslPackage.MAIN_CONTENT__RULE:
			setRule((Rule) null);
			return;
		case ccslPackage.MAIN_CONTENT__PRIMITIVE_TYPES_REFERENCES:
			getPrimitiveTypesReferences().clear();
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
		case ccslPackage.MAIN_CONTENT__RULE:
			return rule != null;
		case ccslPackage.MAIN_CONTENT__PRIMITIVE_TYPES_REFERENCES:
			return primitiveTypesReferences != null && !primitiveTypesReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MainContentImpl
