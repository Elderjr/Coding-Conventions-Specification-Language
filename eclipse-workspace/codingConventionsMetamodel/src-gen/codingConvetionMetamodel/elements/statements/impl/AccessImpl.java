/**
 */
package codingConvetionMetamodel.elements.statements.impl;

import codingConvetionMetamodel.elements.namedElements.NamedElement;

import codingConvetionMetamodel.elements.statements.Access;
import codingConvetionMetamodel.elements.statements.Statement;
import codingConvetionMetamodel.elements.statements.StatementsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.impl.AccessImpl#getElementAccessed <em>Element Accessed</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.statements.impl.AccessImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessImpl extends StatementImpl implements Access {
	/**
	 * The cached value of the '{@link #getElementAccessed() <em>Element Accessed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementAccessed()
	 * @generated
	 * @ordered
	 */
	protected NamedElement elementAccessed;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Statement from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getElementAccessed() {
		if (elementAccessed != null && elementAccessed.eIsProxy()) {
			InternalEObject oldElementAccessed = (InternalEObject) elementAccessed;
			elementAccessed = (NamedElement) eResolveProxy(oldElementAccessed);
			if (elementAccessed != oldElementAccessed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatementsPackage.ACCESS__ELEMENT_ACCESSED, oldElementAccessed, elementAccessed));
			}
		}
		return elementAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetElementAccessed() {
		return elementAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementAccessed(NamedElement newElementAccessed) {
		NamedElement oldElementAccessed = elementAccessed;
		elementAccessed = newElementAccessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ACCESS__ELEMENT_ACCESSED,
					oldElementAccessed, elementAccessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (Statement) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.ACCESS__FROM, oldFrom,
							from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Statement newFrom) {
		Statement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ACCESS__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatementsPackage.ACCESS__ELEMENT_ACCESSED:
			if (resolve)
				return getElementAccessed();
			return basicGetElementAccessed();
		case StatementsPackage.ACCESS__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
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
		case StatementsPackage.ACCESS__ELEMENT_ACCESSED:
			setElementAccessed((NamedElement) newValue);
			return;
		case StatementsPackage.ACCESS__FROM:
			setFrom((Statement) newValue);
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
		case StatementsPackage.ACCESS__ELEMENT_ACCESSED:
			setElementAccessed((NamedElement) null);
			return;
		case StatementsPackage.ACCESS__FROM:
			setFrom((Statement) null);
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
		case StatementsPackage.ACCESS__ELEMENT_ACCESSED:
			return elementAccessed != null;
		case StatementsPackage.ACCESS__FROM:
			return from != null;
		}
		return super.eIsSet(featureID);
	}

} //AccessImpl
