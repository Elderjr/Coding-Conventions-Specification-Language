/**
 */
package codingConvetionMetamodel.java.impl;

import codingConvetionMetamodel.elements.Element;
import codingConvetionMetamodel.elements.ElementsPackage;
import codingConvetionMetamodel.elements.Property;

import codingConvetionMetamodel.elements.statements.ControlFlow;
import codingConvetionMetamodel.elements.statements.LoopControl;
import codingConvetionMetamodel.elements.statements.Statement;
import codingConvetionMetamodel.elements.statements.StatementsPackage;

import codingConvetionMetamodel.elements.statements.impl.BlockImpl;

import codingConvetionMetamodel.java.JElement;
import codingConvetionMetamodel.java.JFor;
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
 * An implementation of the model object '<em><b>JFor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.java.impl.JForImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link codingConvetionMetamodel.java.impl.JForImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link codingConvetionMetamodel.java.impl.JForImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link codingConvetionMetamodel.java.impl.JForImpl#getUpdaters <em>Updaters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JForImpl extends BlockImpl implements JFor {
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
	 * The cached value of the '{@link #getConditional() <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditional()
	 * @generated
	 * @ordered
	 */
	protected Statement conditional;

	/**
	 * The cached value of the '{@link #getInitializers() <em>Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList initializers;

	/**
	 * The cached value of the '{@link #getUpdaters() <em>Updaters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdaters()
	 * @generated
	 * @ordered
	 */
	protected EList updaters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JFOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList(Property.class, this, JavaPackage.JFOR__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getConditional() {
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditional(Statement newConditional, NotificationChain msgs) {
		Statement oldConditional = conditional;
		conditional = newConditional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JavaPackage.JFOR__CONDITIONAL, oldConditional, newConditional);
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
	public void setConditional(Statement newConditional) {
		if (newConditional != conditional) {
			NotificationChain msgs = null;
			if (conditional != null)
				msgs = ((InternalEObject) conditional).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JavaPackage.JFOR__CONDITIONAL, null, msgs);
			if (newConditional != null)
				msgs = ((InternalEObject) newConditional).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JavaPackage.JFOR__CONDITIONAL, null, msgs);
			msgs = basicSetConditional(newConditional, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JFOR__CONDITIONAL, newConditional,
					newConditional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInitializers() {
		if (initializers == null) {
			initializers = new EObjectContainmentEList(Statement.class, this, JavaPackage.JFOR__INITIALIZERS);
		}
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUpdaters() {
		if (updaters == null) {
			updaters = new EObjectContainmentEList(Statement.class, this, JavaPackage.JFOR__UPDATERS);
		}
		return updaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaPackage.JFOR__PROPERTY:
			return ((InternalEList) getProperty()).basicRemove(otherEnd, msgs);
		case JavaPackage.JFOR__CONDITIONAL:
			return basicSetConditional(null, msgs);
		case JavaPackage.JFOR__INITIALIZERS:
			return ((InternalEList) getInitializers()).basicRemove(otherEnd, msgs);
		case JavaPackage.JFOR__UPDATERS:
			return ((InternalEList) getUpdaters()).basicRemove(otherEnd, msgs);
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
		case JavaPackage.JFOR__PROPERTY:
			return getProperty();
		case JavaPackage.JFOR__CONDITIONAL:
			return getConditional();
		case JavaPackage.JFOR__INITIALIZERS:
			return getInitializers();
		case JavaPackage.JFOR__UPDATERS:
			return getUpdaters();
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
		case JavaPackage.JFOR__PROPERTY:
			getProperty().clear();
			getProperty().addAll((Collection) newValue);
			return;
		case JavaPackage.JFOR__CONDITIONAL:
			setConditional((Statement) newValue);
			return;
		case JavaPackage.JFOR__INITIALIZERS:
			getInitializers().clear();
			getInitializers().addAll((Collection) newValue);
			return;
		case JavaPackage.JFOR__UPDATERS:
			getUpdaters().clear();
			getUpdaters().addAll((Collection) newValue);
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
		case JavaPackage.JFOR__PROPERTY:
			getProperty().clear();
			return;
		case JavaPackage.JFOR__CONDITIONAL:
			setConditional((Statement) null);
			return;
		case JavaPackage.JFOR__INITIALIZERS:
			getInitializers().clear();
			return;
		case JavaPackage.JFOR__UPDATERS:
			getUpdaters().clear();
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
		case JavaPackage.JFOR__PROPERTY:
			return property != null && !property.isEmpty();
		case JavaPackage.JFOR__CONDITIONAL:
			return conditional != null;
		case JavaPackage.JFOR__INITIALIZERS:
			return initializers != null && !initializers.isEmpty();
		case JavaPackage.JFOR__UPDATERS:
			return updaters != null && !updaters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == JElement.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
			case JavaPackage.JFOR__PROPERTY:
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
		if (baseClass == ControlFlow.class) {
			switch (derivedFeatureID) {
			case JavaPackage.JFOR__CONDITIONAL:
				return StatementsPackage.CONTROL_FLOW__CONDITIONAL;
			default:
				return -1;
			}
		}
		if (baseClass == LoopControl.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == JElement.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
			case ElementsPackage.ELEMENT__PROPERTY:
				return JavaPackage.JFOR__PROPERTY;
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
		if (baseClass == ControlFlow.class) {
			switch (baseFeatureID) {
			case StatementsPackage.CONTROL_FLOW__CONDITIONAL:
				return JavaPackage.JFOR__CONDITIONAL;
			default:
				return -1;
			}
		}
		if (baseClass == LoopControl.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //JForImpl
