/**
 */
package codingConvention.elements.namedElements.impl;

import codingConvention.elements.namedElements.Field;
import codingConvention.elements.namedElements.Interface;
import codingConvention.elements.namedElements.Method;
import codingConvention.elements.namedElements.NamedElementsPackage;

import codingConvention.elements.types.impl.ComplexTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvention.elements.namedElements.impl.ClassImpl#getInstanceMethods <em>Instance Methods</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.ClassImpl#getSubClasses <em>Sub Classes</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.ClassImpl#getClassMethods <em>Class Methods</em>}</li>
 *   <li>{@link codingConvention.elements.namedElements.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ComplexTypeImpl implements codingConvention.elements.namedElements.Class {
	/**
	 * The cached value of the '{@link #getInstanceMethods() <em>Instance Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> instanceMethods;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> attributes;

	/**
	 * The cached value of the '{@link #getSubClasses() <em>Sub Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<codingConvention.elements.namedElements.Class> subClasses;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected codingConvention.elements.namedElements.Class superClass;

	/**
	 * The cached value of the '{@link #getClassMethods() <em>Class Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> classMethods;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> implements_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamedElementsPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getInstanceMethods() {
		if (instanceMethods == null) {
			instanceMethods = new EObjectContainmentEList<Method>(Method.class, this,
					NamedElementsPackage.CLASS__INSTANCE_METHODS);
		}
		return instanceMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Field>(Field.class, this, NamedElementsPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<codingConvention.elements.namedElements.Class> getSubClasses() {
		if (subClasses == null) {
			subClasses = new EObjectWithInverseResolvingEList<codingConvention.elements.namedElements.Class>(
					codingConvention.elements.namedElements.Class.class, this, NamedElementsPackage.CLASS__SUB_CLASSES,
					NamedElementsPackage.CLASS__SUPER_CLASS);
		}
		return subClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public codingConvention.elements.namedElements.Class getSuperClass() {
		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject) superClass;
			superClass = (codingConvention.elements.namedElements.Class) eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NamedElementsPackage.CLASS__SUPER_CLASS,
							oldSuperClass, superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public codingConvention.elements.namedElements.Class basicGetSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperClass(codingConvention.elements.namedElements.Class newSuperClass,
			NotificationChain msgs) {
		codingConvention.elements.namedElements.Class oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NamedElementsPackage.CLASS__SUPER_CLASS, oldSuperClass, newSuperClass);
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
	public void setSuperClass(codingConvention.elements.namedElements.Class newSuperClass) {
		if (newSuperClass != superClass) {
			NotificationChain msgs = null;
			if (superClass != null)
				msgs = ((InternalEObject) superClass).eInverseRemove(this, NamedElementsPackage.CLASS__SUB_CLASSES,
						codingConvention.elements.namedElements.Class.class, msgs);
			if (newSuperClass != null)
				msgs = ((InternalEObject) newSuperClass).eInverseAdd(this, NamedElementsPackage.CLASS__SUB_CLASSES,
						codingConvention.elements.namedElements.Class.class, msgs);
			msgs = basicSetSuperClass(newSuperClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamedElementsPackage.CLASS__SUPER_CLASS,
					newSuperClass, newSuperClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getClassMethods() {
		if (classMethods == null) {
			classMethods = new EObjectContainmentEList<Method>(Method.class, this,
					NamedElementsPackage.CLASS__CLASS_METHODS);
		}
		return classMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<Interface>(Interface.class, this,
					NamedElementsPackage.CLASS__IMPLEMENTS);
		}
		return implements_;
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
		case NamedElementsPackage.CLASS__SUB_CLASSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubClasses()).basicAdd(otherEnd, msgs);
		case NamedElementsPackage.CLASS__SUPER_CLASS:
			if (superClass != null)
				msgs = ((InternalEObject) superClass).eInverseRemove(this, NamedElementsPackage.CLASS__SUB_CLASSES,
						codingConvention.elements.namedElements.Class.class, msgs);
			return basicSetSuperClass((codingConvention.elements.namedElements.Class) otherEnd, msgs);
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
		case NamedElementsPackage.CLASS__INSTANCE_METHODS:
			return ((InternalEList<?>) getInstanceMethods()).basicRemove(otherEnd, msgs);
		case NamedElementsPackage.CLASS__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		case NamedElementsPackage.CLASS__SUB_CLASSES:
			return ((InternalEList<?>) getSubClasses()).basicRemove(otherEnd, msgs);
		case NamedElementsPackage.CLASS__SUPER_CLASS:
			return basicSetSuperClass(null, msgs);
		case NamedElementsPackage.CLASS__CLASS_METHODS:
			return ((InternalEList<?>) getClassMethods()).basicRemove(otherEnd, msgs);
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
		case NamedElementsPackage.CLASS__INSTANCE_METHODS:
			return getInstanceMethods();
		case NamedElementsPackage.CLASS__ATTRIBUTES:
			return getAttributes();
		case NamedElementsPackage.CLASS__SUB_CLASSES:
			return getSubClasses();
		case NamedElementsPackage.CLASS__SUPER_CLASS:
			if (resolve)
				return getSuperClass();
			return basicGetSuperClass();
		case NamedElementsPackage.CLASS__CLASS_METHODS:
			return getClassMethods();
		case NamedElementsPackage.CLASS__IMPLEMENTS:
			return getImplements();
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
		case NamedElementsPackage.CLASS__INSTANCE_METHODS:
			getInstanceMethods().clear();
			getInstanceMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case NamedElementsPackage.CLASS__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Field>) newValue);
			return;
		case NamedElementsPackage.CLASS__SUB_CLASSES:
			getSubClasses().clear();
			getSubClasses().addAll((Collection<? extends codingConvention.elements.namedElements.Class>) newValue);
			return;
		case NamedElementsPackage.CLASS__SUPER_CLASS:
			setSuperClass((codingConvention.elements.namedElements.Class) newValue);
			return;
		case NamedElementsPackage.CLASS__CLASS_METHODS:
			getClassMethods().clear();
			getClassMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case NamedElementsPackage.CLASS__IMPLEMENTS:
			getImplements().clear();
			getImplements().addAll((Collection<? extends Interface>) newValue);
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
		case NamedElementsPackage.CLASS__INSTANCE_METHODS:
			getInstanceMethods().clear();
			return;
		case NamedElementsPackage.CLASS__ATTRIBUTES:
			getAttributes().clear();
			return;
		case NamedElementsPackage.CLASS__SUB_CLASSES:
			getSubClasses().clear();
			return;
		case NamedElementsPackage.CLASS__SUPER_CLASS:
			setSuperClass((codingConvention.elements.namedElements.Class) null);
			return;
		case NamedElementsPackage.CLASS__CLASS_METHODS:
			getClassMethods().clear();
			return;
		case NamedElementsPackage.CLASS__IMPLEMENTS:
			getImplements().clear();
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
		case NamedElementsPackage.CLASS__INSTANCE_METHODS:
			return instanceMethods != null && !instanceMethods.isEmpty();
		case NamedElementsPackage.CLASS__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case NamedElementsPackage.CLASS__SUB_CLASSES:
			return subClasses != null && !subClasses.isEmpty();
		case NamedElementsPackage.CLASS__SUPER_CLASS:
			return superClass != null;
		case NamedElementsPackage.CLASS__CLASS_METHODS:
			return classMethods != null && !classMethods.isEmpty();
		case NamedElementsPackage.CLASS__IMPLEMENTS:
			return implements_ != null && !implements_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
