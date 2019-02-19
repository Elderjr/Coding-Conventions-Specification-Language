/**
 */
package codingConvetionMetamodel.java.impl;

import codingConvetionMetamodel.java.JCatchClause;
import codingConvetionMetamodel.java.JTryCatch;
import codingConvetionMetamodel.java.JTryClause;
import codingConvetionMetamodel.java.JavaPackage;

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
 * An implementation of the model object '<em><b>JTry Catch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.java.impl.JTryCatchImpl#getTry <em>Try</em>}</li>
 *   <li>{@link codingConvetionMetamodel.java.impl.JTryCatchImpl#getCatches <em>Catches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JTryCatchImpl extends JElementImpl implements JTryCatch {
	/**
	 * The cached value of the '{@link #getTry() <em>Try</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTry()
	 * @generated
	 * @ordered
	 */
	protected JTryClause try_;

	/**
	 * The cached value of the '{@link #getCatches() <em>Catches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatches()
	 * @generated
	 * @ordered
	 */
	protected EList catches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JTryCatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JTRY_CATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JTryClause getTry() {
		return try_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTry(JTryClause newTry, NotificationChain msgs) {
		JTryClause oldTry = try_;
		try_ = newTry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.JTRY_CATCH__TRY,
					oldTry, newTry);
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
	public void setTry(JTryClause newTry) {
		if (newTry != try_) {
			NotificationChain msgs = null;
			if (try_ != null)
				msgs = ((InternalEObject) try_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JavaPackage.JTRY_CATCH__TRY, null, msgs);
			if (newTry != null)
				msgs = ((InternalEObject) newTry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JavaPackage.JTRY_CATCH__TRY, null, msgs);
			msgs = basicSetTry(newTry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JTRY_CATCH__TRY, newTry, newTry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCatches() {
		if (catches == null) {
			catches = new EObjectContainmentEList(JCatchClause.class, this, JavaPackage.JTRY_CATCH__CATCHES);
		}
		return catches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaPackage.JTRY_CATCH__TRY:
			return basicSetTry(null, msgs);
		case JavaPackage.JTRY_CATCH__CATCHES:
			return ((InternalEList) getCatches()).basicRemove(otherEnd, msgs);
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
		case JavaPackage.JTRY_CATCH__TRY:
			return getTry();
		case JavaPackage.JTRY_CATCH__CATCHES:
			return getCatches();
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
		case JavaPackage.JTRY_CATCH__TRY:
			setTry((JTryClause) newValue);
			return;
		case JavaPackage.JTRY_CATCH__CATCHES:
			getCatches().clear();
			getCatches().addAll((Collection) newValue);
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
		case JavaPackage.JTRY_CATCH__TRY:
			setTry((JTryClause) null);
			return;
		case JavaPackage.JTRY_CATCH__CATCHES:
			getCatches().clear();
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
		case JavaPackage.JTRY_CATCH__TRY:
			return try_ != null;
		case JavaPackage.JTRY_CATCH__CATCHES:
			return catches != null && !catches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JTryCatchImpl
