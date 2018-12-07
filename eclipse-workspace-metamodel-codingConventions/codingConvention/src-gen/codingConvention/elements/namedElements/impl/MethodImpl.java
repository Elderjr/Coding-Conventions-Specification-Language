/**
 */
package codingConvention.elements.namedElements.impl;

import codingConvention.elements.namedElements.Method;
import codingConvention.elements.namedElements.NamedElementsPackage;
import codingConvention.elements.namedElements.Parameter;

import codingConvention.elements.types.DataType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.namedElements.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.MethodImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.MethodImpl#getSubMethods <em>Sub Methods</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.MethodImpl#getSuperMethod <em>Super Method</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.MethodImpl#getThrows <em>Throws</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnType;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getSubMethods() <em>Sub Methods</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubMethods()
	 * @generated
	 * @ordered
	 */
	protected Method subMethods;

	/**
	 * The cached value of the '{@link #getSuperMethod() <em>Super Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperMethod()
	 * @generated
	 * @ordered
	 */
	protected Method superMethod;

	/**
	 * The cached value of the '{@link #getThrows() <em>Throws</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected EList<codingConvention.elements.namedElements.Exception> throws_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamedElementsPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject) returnType;
			returnType = (DataType) eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NamedElementsPackage.METHOD__RETURN_TYPE,
							oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(DataType newReturnType) {
		DataType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamedElementsPackage.METHOD__RETURN_TYPE,
					oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					NamedElementsPackage.METHOD__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getSubMethods() {
		if (subMethods != null && subMethods.eIsProxy()) {
			InternalEObject oldSubMethods = (InternalEObject) subMethods;
			subMethods = (Method) eResolveProxy(oldSubMethods);
			if (subMethods != oldSubMethods) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NamedElementsPackage.METHOD__SUB_METHODS,
							oldSubMethods, subMethods));
			}
		}
		return subMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetSubMethods() {
		return subMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubMethods(Method newSubMethods, NotificationChain msgs) {
		Method oldSubMethods = subMethods;
		subMethods = newSubMethods;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NamedElementsPackage.METHOD__SUB_METHODS, oldSubMethods, newSubMethods);
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
	public void setSubMethods(Method newSubMethods) {
		if (newSubMethods != subMethods) {
			NotificationChain msgs = null;
			if (subMethods != null)
				msgs = ((InternalEObject) subMethods).eInverseRemove(this, NamedElementsPackage.METHOD__SUPER_METHOD,
						Method.class, msgs);
			if (newSubMethods != null)
				msgs = ((InternalEObject) newSubMethods).eInverseAdd(this, NamedElementsPackage.METHOD__SUPER_METHOD,
						Method.class, msgs);
			msgs = basicSetSubMethods(newSubMethods, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamedElementsPackage.METHOD__SUB_METHODS,
					newSubMethods, newSubMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getSuperMethod() {
		if (superMethod != null && superMethod.eIsProxy()) {
			InternalEObject oldSuperMethod = (InternalEObject) superMethod;
			superMethod = (Method) eResolveProxy(oldSuperMethod);
			if (superMethod != oldSuperMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NamedElementsPackage.METHOD__SUPER_METHOD,
							oldSuperMethod, superMethod));
			}
		}
		return superMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetSuperMethod() {
		return superMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperMethod(Method newSuperMethod, NotificationChain msgs) {
		Method oldSuperMethod = superMethod;
		superMethod = newSuperMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NamedElementsPackage.METHOD__SUPER_METHOD, oldSuperMethod, newSuperMethod);
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
	public void setSuperMethod(Method newSuperMethod) {
		if (newSuperMethod != superMethod) {
			NotificationChain msgs = null;
			if (superMethod != null)
				msgs = ((InternalEObject) superMethod).eInverseRemove(this, NamedElementsPackage.METHOD__SUB_METHODS,
						Method.class, msgs);
			if (newSuperMethod != null)
				msgs = ((InternalEObject) newSuperMethod).eInverseAdd(this, NamedElementsPackage.METHOD__SUB_METHODS,
						Method.class, msgs);
			msgs = basicSetSuperMethod(newSuperMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamedElementsPackage.METHOD__SUPER_METHOD,
					newSuperMethod, newSuperMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<codingConvention.elements.namedElements.Exception> getThrows() {
		if (throws_ == null) {
			throws_ = new EObjectResolvingEList<codingConvention.elements.namedElements.Exception>(
					codingConvention.elements.namedElements.Exception.class, this, NamedElementsPackage.METHOD__THROWS);
		}
		return throws_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NamedElementsPackage.METHOD__SUB_METHODS:
			if (subMethods != null)
				msgs = ((InternalEObject) subMethods).eInverseRemove(this, NamedElementsPackage.METHOD__SUPER_METHOD,
						Method.class, msgs);
			return basicSetSubMethods((Method) otherEnd, msgs);
		case NamedElementsPackage.METHOD__SUPER_METHOD:
			if (superMethod != null)
				msgs = ((InternalEObject) superMethod).eInverseRemove(this, NamedElementsPackage.METHOD__SUB_METHODS,
						Method.class, msgs);
			return basicSetSuperMethod((Method) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NamedElementsPackage.METHOD__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
		case NamedElementsPackage.METHOD__SUB_METHODS:
			return basicSetSubMethods(null, msgs);
		case NamedElementsPackage.METHOD__SUPER_METHOD:
			return basicSetSuperMethod(null, msgs);
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
		case NamedElementsPackage.METHOD__RETURN_TYPE:
			if (resolve)
				return getReturnType();
			return basicGetReturnType();
		case NamedElementsPackage.METHOD__PARAMETER:
			return getParameter();
		case NamedElementsPackage.METHOD__SUB_METHODS:
			if (resolve)
				return getSubMethods();
			return basicGetSubMethods();
		case NamedElementsPackage.METHOD__SUPER_METHOD:
			if (resolve)
				return getSuperMethod();
			return basicGetSuperMethod();
		case NamedElementsPackage.METHOD__THROWS:
			return getThrows();
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
		case NamedElementsPackage.METHOD__RETURN_TYPE:
			setReturnType((DataType) newValue);
			return;
		case NamedElementsPackage.METHOD__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
			return;
		case NamedElementsPackage.METHOD__SUB_METHODS:
			setSubMethods((Method) newValue);
			return;
		case NamedElementsPackage.METHOD__SUPER_METHOD:
			setSuperMethod((Method) newValue);
			return;
		case NamedElementsPackage.METHOD__THROWS:
			getThrows().clear();
			getThrows().addAll((Collection<? extends codingConvention.elements.namedElements.Exception>) newValue);
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
		case NamedElementsPackage.METHOD__RETURN_TYPE:
			setReturnType((DataType) null);
			return;
		case NamedElementsPackage.METHOD__PARAMETER:
			getParameter().clear();
			return;
		case NamedElementsPackage.METHOD__SUB_METHODS:
			setSubMethods((Method) null);
			return;
		case NamedElementsPackage.METHOD__SUPER_METHOD:
			setSuperMethod((Method) null);
			return;
		case NamedElementsPackage.METHOD__THROWS:
			getThrows().clear();
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
		case NamedElementsPackage.METHOD__RETURN_TYPE:
			return returnType != null;
		case NamedElementsPackage.METHOD__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case NamedElementsPackage.METHOD__SUB_METHODS:
			return subMethods != null;
		case NamedElementsPackage.METHOD__SUPER_METHOD:
			return superMethod != null;
		case NamedElementsPackage.METHOD__THROWS:
			return throws_ != null && !throws_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
