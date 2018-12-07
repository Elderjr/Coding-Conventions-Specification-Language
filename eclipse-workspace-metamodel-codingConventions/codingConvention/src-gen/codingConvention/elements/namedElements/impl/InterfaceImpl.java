/**
 */
package codingConvention.elements.namedElements.impl;

import codingConvention.elements.namedElements.Interface;
import codingConvention.elements.namedElements.NamedElementsPackage;

import codingConvention.elements.types.impl.ComplexTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.namedElements.impl.InterfaceImpl#getSubInterfaces <em>Sub Interfaces</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.InterfaceImpl#getInterfaceeOpposite <em>Interfacee Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends ComplexTypeImpl implements Interface {
	/**
	 * The cached value of the '{@link #getSubInterfaces() <em>Sub Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> subInterfaces;

	/**
	 * The cached value of the '{@link #getInterfaceeOpposite() <em>Interfacee Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceeOpposite()
	 * @generated
	 * @ordered
	 */
	protected Interface interfaceeOpposite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamedElementsPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getSubInterfaces() {
		if (subInterfaces == null) {
			subInterfaces = new EObjectWithInverseResolvingEList<Interface>(Interface.class, this,
					NamedElementsPackage.INTERFACE__SUB_INTERFACES,
					NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE);
		}
		return subInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterfaceeOpposite() {
		if (interfaceeOpposite != null && interfaceeOpposite.eIsProxy()) {
			InternalEObject oldInterfaceeOpposite = (InternalEObject) interfaceeOpposite;
			interfaceeOpposite = (Interface) eResolveProxy(oldInterfaceeOpposite);
			if (interfaceeOpposite != oldInterfaceeOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE, oldInterfaceeOpposite,
							interfaceeOpposite));
			}
		}
		return interfaceeOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterfaceeOpposite() {
		return interfaceeOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceeOpposite(Interface newInterfaceeOpposite, NotificationChain msgs) {
		Interface oldInterfaceeOpposite = interfaceeOpposite;
		interfaceeOpposite = newInterfaceeOpposite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE, oldInterfaceeOpposite, newInterfaceeOpposite);
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
	public void setInterfaceeOpposite(Interface newInterfaceeOpposite) {
		if (newInterfaceeOpposite != interfaceeOpposite) {
			NotificationChain msgs = null;
			if (interfaceeOpposite != null)
				msgs = ((InternalEObject) interfaceeOpposite).eInverseRemove(this,
						NamedElementsPackage.INTERFACE__SUB_INTERFACES, Interface.class, msgs);
			if (newInterfaceeOpposite != null)
				msgs = ((InternalEObject) newInterfaceeOpposite).eInverseAdd(this,
						NamedElementsPackage.INTERFACE__SUB_INTERFACES, Interface.class, msgs);
			msgs = basicSetInterfaceeOpposite(newInterfaceeOpposite, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE,
					newInterfaceeOpposite, newInterfaceeOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NamedElementsPackage.INTERFACE__SUB_INTERFACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubInterfaces()).basicAdd(otherEnd, msgs);
		case NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE:
			if (interfaceeOpposite != null)
				msgs = ((InternalEObject) interfaceeOpposite).eInverseRemove(this,
						NamedElementsPackage.INTERFACE__SUB_INTERFACES, Interface.class, msgs);
			return basicSetInterfaceeOpposite((Interface) otherEnd, msgs);
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
		case NamedElementsPackage.INTERFACE__SUB_INTERFACES:
			return ((InternalEList<?>) getSubInterfaces()).basicRemove(otherEnd, msgs);
		case NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE:
			return basicSetInterfaceeOpposite(null, msgs);
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
		case NamedElementsPackage.INTERFACE__SUB_INTERFACES:
			return getSubInterfaces();
		case NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE:
			if (resolve)
				return getInterfaceeOpposite();
			return basicGetInterfaceeOpposite();
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
		case NamedElementsPackage.INTERFACE__SUB_INTERFACES:
			getSubInterfaces().clear();
			getSubInterfaces().addAll((Collection<? extends Interface>) newValue);
			return;
		case NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE:
			setInterfaceeOpposite((Interface) newValue);
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
		case NamedElementsPackage.INTERFACE__SUB_INTERFACES:
			getSubInterfaces().clear();
			return;
		case NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE:
			setInterfaceeOpposite((Interface) null);
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
		case NamedElementsPackage.INTERFACE__SUB_INTERFACES:
			return subInterfaces != null && !subInterfaces.isEmpty();
		case NamedElementsPackage.INTERFACE__INTERFACEE_OPPOSITE:
			return interfaceeOpposite != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
