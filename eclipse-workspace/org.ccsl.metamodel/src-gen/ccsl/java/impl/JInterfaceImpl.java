/**
 */
package ccsl.java.impl;

import ccsl.elements.Element;
import ccsl.elements.ElementsPackage;
import ccsl.elements.Property;

import ccsl.elements.datatype.DataType;

import ccsl.elements.namedElements.ComplexType;
import ccsl.elements.namedElements.NamedElement;
import ccsl.elements.namedElements.NamedElementsPackage;
import ccsl.elements.namedElements.Variable;

import ccsl.java.JInterface;
import ccsl.java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JInterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.java.impl.JInterfaceImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link ccsl.java.impl.JInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsl.java.impl.JInterfaceImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link ccsl.java.impl.JInterfaceImpl#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JInterfaceImpl extends JElementImpl implements JInterface {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList property;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList fields;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList superTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JINTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList(Property.class, this, JavaPackage.JINTERFACE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JINTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList(Variable.class, this, JavaPackage.JINTERFACE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList(ComplexType.class, this, JavaPackage.JINTERFACE__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaPackage.JINTERFACE__PROPERTY:
			return ((InternalEList) getProperty()).basicRemove(otherEnd, msgs);
		case JavaPackage.JINTERFACE__FIELDS:
			return ((InternalEList) getFields()).basicRemove(otherEnd, msgs);
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
		case JavaPackage.JINTERFACE__PROPERTY:
			return getProperty();
		case JavaPackage.JINTERFACE__NAME:
			return getName();
		case JavaPackage.JINTERFACE__FIELDS:
			return getFields();
		case JavaPackage.JINTERFACE__SUPER_TYPES:
			return getSuperTypes();
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
		case JavaPackage.JINTERFACE__PROPERTY:
			getProperty().clear();
			getProperty().addAll((Collection) newValue);
			return;
		case JavaPackage.JINTERFACE__NAME:
			setName((String) newValue);
			return;
		case JavaPackage.JINTERFACE__FIELDS:
			getFields().clear();
			getFields().addAll((Collection) newValue);
			return;
		case JavaPackage.JINTERFACE__SUPER_TYPES:
			getSuperTypes().clear();
			getSuperTypes().addAll((Collection) newValue);
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
		case JavaPackage.JINTERFACE__PROPERTY:
			getProperty().clear();
			return;
		case JavaPackage.JINTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case JavaPackage.JINTERFACE__FIELDS:
			getFields().clear();
			return;
		case JavaPackage.JINTERFACE__SUPER_TYPES:
			getSuperTypes().clear();
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
		case JavaPackage.JINTERFACE__PROPERTY:
			return property != null && !property.isEmpty();
		case JavaPackage.JINTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case JavaPackage.JINTERFACE__FIELDS:
			return fields != null && !fields.isEmpty();
		case JavaPackage.JINTERFACE__SUPER_TYPES:
			return superTypes != null && !superTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
			case JavaPackage.JINTERFACE__PROPERTY:
				return ElementsPackage.ELEMENT__PROPERTY;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case JavaPackage.JINTERFACE__NAME:
				return NamedElementsPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ComplexType.class) {
			switch (derivedFeatureID) {
			case JavaPackage.JINTERFACE__FIELDS:
				return NamedElementsPackage.COMPLEX_TYPE__FIELDS;
			case JavaPackage.JINTERFACE__SUPER_TYPES:
				return NamedElementsPackage.COMPLEX_TYPE__SUPER_TYPES;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
			case ElementsPackage.ELEMENT__PROPERTY:
				return JavaPackage.JINTERFACE__PROPERTY;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case NamedElementsPackage.NAMED_ELEMENT__NAME:
				return JavaPackage.JINTERFACE__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ComplexType.class) {
			switch (baseFeatureID) {
			case NamedElementsPackage.COMPLEX_TYPE__FIELDS:
				return JavaPackage.JINTERFACE__FIELDS;
			case NamedElementsPackage.COMPLEX_TYPE__SUPER_TYPES:
				return JavaPackage.JINTERFACE__SUPER_TYPES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JInterfaceImpl
