/**
 */
package ccsl.java.impl;

import ccsl.elements.Element;
import ccsl.elements.ElementsPackage;
import ccsl.elements.Property;

import ccsl.elements.statements.AtomicExp;
import ccsl.elements.statements.Expression;
import ccsl.elements.statements.InfixExp;
import ccsl.elements.statements.Statement;
import ccsl.elements.statements.StatementsPackage;

import ccsl.java.InstanceOf;
import ccsl.java.JavaPackage;

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
 * An implementation of the model object '<em><b>Instance Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.java.impl.InstanceOfImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link ccsl.java.impl.InstanceOfImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link ccsl.java.impl.InstanceOfImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link ccsl.java.impl.InstanceOfImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceOfImpl extends JElementImpl implements InstanceOf {
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
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EList right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaPackage.Literals.INSTANCE_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList(Property.class, this, JavaPackage.INSTANCE_OF__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.INSTANCE_OF__OPERATOR, oldOperator,
					operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLeft() {
		if (left == null) {
			left = new EObjectContainmentEList(Statement.class, this, JavaPackage.INSTANCE_OF__LEFT);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRight() {
		if (right == null) {
			right = new EObjectContainmentEList(Statement.class, this, JavaPackage.INSTANCE_OF__RIGHT);
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaPackage.INSTANCE_OF__PROPERTY:
			return ((InternalEList) getProperty()).basicRemove(otherEnd, msgs);
		case JavaPackage.INSTANCE_OF__LEFT:
			return ((InternalEList) getLeft()).basicRemove(otherEnd, msgs);
		case JavaPackage.INSTANCE_OF__RIGHT:
			return ((InternalEList) getRight()).basicRemove(otherEnd, msgs);
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
		case JavaPackage.INSTANCE_OF__PROPERTY:
			return getProperty();
		case JavaPackage.INSTANCE_OF__OPERATOR:
			return getOperator();
		case JavaPackage.INSTANCE_OF__LEFT:
			return getLeft();
		case JavaPackage.INSTANCE_OF__RIGHT:
			return getRight();
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
		case JavaPackage.INSTANCE_OF__PROPERTY:
			getProperty().clear();
			getProperty().addAll((Collection) newValue);
			return;
		case JavaPackage.INSTANCE_OF__OPERATOR:
			setOperator((String) newValue);
			return;
		case JavaPackage.INSTANCE_OF__LEFT:
			getLeft().clear();
			getLeft().addAll((Collection) newValue);
			return;
		case JavaPackage.INSTANCE_OF__RIGHT:
			getRight().clear();
			getRight().addAll((Collection) newValue);
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
		case JavaPackage.INSTANCE_OF__PROPERTY:
			getProperty().clear();
			return;
		case JavaPackage.INSTANCE_OF__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case JavaPackage.INSTANCE_OF__LEFT:
			getLeft().clear();
			return;
		case JavaPackage.INSTANCE_OF__RIGHT:
			getRight().clear();
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
		case JavaPackage.INSTANCE_OF__PROPERTY:
			return property != null && !property.isEmpty();
		case JavaPackage.INSTANCE_OF__OPERATOR:
			return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
		case JavaPackage.INSTANCE_OF__LEFT:
			return left != null && !left.isEmpty();
		case JavaPackage.INSTANCE_OF__RIGHT:
			return right != null && !right.isEmpty();
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
			case JavaPackage.INSTANCE_OF__PROPERTY:
				return ElementsPackage.ELEMENT__PROPERTY;
			default:
				return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == AtomicExp.class) {
			switch (derivedFeatureID) {
			case JavaPackage.INSTANCE_OF__OPERATOR:
				return StatementsPackage.ATOMIC_EXP__OPERATOR;
			default:
				return -1;
			}
		}
		if (baseClass == InfixExp.class) {
			switch (derivedFeatureID) {
			case JavaPackage.INSTANCE_OF__LEFT:
				return StatementsPackage.INFIX_EXP__LEFT;
			case JavaPackage.INSTANCE_OF__RIGHT:
				return StatementsPackage.INFIX_EXP__RIGHT;
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
				return JavaPackage.INSTANCE_OF__PROPERTY;
			default:
				return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == AtomicExp.class) {
			switch (baseFeatureID) {
			case StatementsPackage.ATOMIC_EXP__OPERATOR:
				return JavaPackage.INSTANCE_OF__OPERATOR;
			default:
				return -1;
			}
		}
		if (baseClass == InfixExp.class) {
			switch (baseFeatureID) {
			case StatementsPackage.INFIX_EXP__LEFT:
				return JavaPackage.INSTANCE_OF__LEFT;
			case StatementsPackage.INFIX_EXP__RIGHT:
				return JavaPackage.INSTANCE_OF__RIGHT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //InstanceOfImpl
