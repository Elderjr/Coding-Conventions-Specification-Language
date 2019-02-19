/**
 */
package codingConvetionMetamodel.java.impl;

import codingConvetionMetamodel.elements.statements.Access;

import codingConvetionMetamodel.java.JavaPackage;
import codingConvetionMetamodel.java.ThrowStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throw Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.java.impl.ThrowStatementImpl#getThrows <em>Throws</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrowStatementImpl extends JElementImpl implements ThrowStatement {
	/**
	 * The cached value of the '{@link #getThrows() <em>Throws</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected Access throws_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrowStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaPackage.Literals.THROW_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Access getThrows() {
		return throws_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrows(Access newThrows, NotificationChain msgs) {
		Access oldThrows = throws_;
		throws_ = newThrows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JavaPackage.THROW_STATEMENT__THROWS, oldThrows, newThrows);
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
	public void setThrows(Access newThrows) {
		if (newThrows != throws_) {
			NotificationChain msgs = null;
			if (throws_ != null)
				msgs = ((InternalEObject) throws_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JavaPackage.THROW_STATEMENT__THROWS, null, msgs);
			if (newThrows != null)
				msgs = ((InternalEObject) newThrows).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JavaPackage.THROW_STATEMENT__THROWS, null, msgs);
			msgs = basicSetThrows(newThrows, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.THROW_STATEMENT__THROWS, newThrows,
					newThrows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaPackage.THROW_STATEMENT__THROWS:
			return basicSetThrows(null, msgs);
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
		case JavaPackage.THROW_STATEMENT__THROWS:
			return getThrows();
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
		case JavaPackage.THROW_STATEMENT__THROWS:
			setThrows((Access) newValue);
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
		case JavaPackage.THROW_STATEMENT__THROWS:
			setThrows((Access) null);
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
		case JavaPackage.THROW_STATEMENT__THROWS:
			return throws_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ThrowStatementImpl
