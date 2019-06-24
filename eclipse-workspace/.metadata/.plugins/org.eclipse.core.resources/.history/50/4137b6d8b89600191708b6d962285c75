/**
 */
package ccsl.elements.namedElements.impl;

import ccsl.elements.datatype.DataType;

import ccsl.elements.namedElements.Method;
import ccsl.elements.namedElements.NamedElementsPackage;
import ccsl.elements.namedElements.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link ccsl.elements.namedElements.impl.MethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ccsl.elements.namedElements.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends NamedElementImpl implements Method {
	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList params;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected EList returnType;

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
	protected EClass eStaticClass() {
		return NamedElementsPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParams() {
		if (params == null) {
			params = new EObjectContainmentEList(Variable.class, this, NamedElementsPackage.METHOD__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReturnType() {
		if (returnType == null) {
			returnType = new EObjectResolvingEList(DataType.class, this, NamedElementsPackage.METHOD__RETURN_TYPE);
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NamedElementsPackage.METHOD__PARAMS:
			return ((InternalEList) getParams()).basicRemove(otherEnd, msgs);
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
		case NamedElementsPackage.METHOD__PARAMS:
			return getParams();
		case NamedElementsPackage.METHOD__RETURN_TYPE:
			return getReturnType();
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
		case NamedElementsPackage.METHOD__PARAMS:
			getParams().clear();
			getParams().addAll((Collection) newValue);
			return;
		case NamedElementsPackage.METHOD__RETURN_TYPE:
			getReturnType().clear();
			getReturnType().addAll((Collection) newValue);
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
		case NamedElementsPackage.METHOD__PARAMS:
			getParams().clear();
			return;
		case NamedElementsPackage.METHOD__RETURN_TYPE:
			getReturnType().clear();
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
		case NamedElementsPackage.METHOD__PARAMS:
			return params != null && !params.isEmpty();
		case NamedElementsPackage.METHOD__RETURN_TYPE:
			return returnType != null && !returnType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
