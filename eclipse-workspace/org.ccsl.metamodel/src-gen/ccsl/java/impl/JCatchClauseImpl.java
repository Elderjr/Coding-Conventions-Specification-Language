/**
 */
package ccsl.java.impl;

import ccsl.elements.namedElements.Variable;

import ccsl.elements.statements.impl.BlockImpl;

import ccsl.java.JCatchClause;
import ccsl.java.JClass;
import ccsl.java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JCatch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.java.impl.JCatchClauseImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link ccsl.java.impl.JCatchClauseImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JCatchClauseImpl extends BlockImpl implements JCatchClause {
	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList exceptions;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected Variable param;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JCatchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JCATCH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectResolvingEList(JClass.class, this, JavaPackage.JCATCH_CLAUSE__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getParam() {
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam(Variable newParam, NotificationChain msgs) {
		Variable oldParam = param;
		param = newParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JavaPackage.JCATCH_CLAUSE__PARAM, oldParam, newParam);
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
	public void setParam(Variable newParam) {
		if (newParam != param) {
			NotificationChain msgs = null;
			if (param != null)
				msgs = ((InternalEObject) param).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JavaPackage.JCATCH_CLAUSE__PARAM, null, msgs);
			if (newParam != null)
				msgs = ((InternalEObject) newParam).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JavaPackage.JCATCH_CLAUSE__PARAM, null, msgs);
			msgs = basicSetParam(newParam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCATCH_CLAUSE__PARAM, newParam,
					newParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaPackage.JCATCH_CLAUSE__PARAM:
			return basicSetParam(null, msgs);
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
		case JavaPackage.JCATCH_CLAUSE__EXCEPTIONS:
			return getExceptions();
		case JavaPackage.JCATCH_CLAUSE__PARAM:
			return getParam();
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
		case JavaPackage.JCATCH_CLAUSE__EXCEPTIONS:
			getExceptions().clear();
			getExceptions().addAll((Collection) newValue);
			return;
		case JavaPackage.JCATCH_CLAUSE__PARAM:
			setParam((Variable) newValue);
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
		case JavaPackage.JCATCH_CLAUSE__EXCEPTIONS:
			getExceptions().clear();
			return;
		case JavaPackage.JCATCH_CLAUSE__PARAM:
			setParam((Variable) null);
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
		case JavaPackage.JCATCH_CLAUSE__EXCEPTIONS:
			return exceptions != null && !exceptions.isEmpty();
		case JavaPackage.JCATCH_CLAUSE__PARAM:
			return param != null;
		}
		return super.eIsSet(featureID);
	}

} //JCatchClauseImpl
