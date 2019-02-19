/**
 */
package codingConvetionMetamodel.elements.statements.impl;

import codingConvetionMetamodel.LogicOperators;

import codingConvetionMetamodel.elements.statements.CompositeExp;
import codingConvetionMetamodel.elements.statements.Expression;
import codingConvetionMetamodel.elements.statements.StatementsPackage;

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
 * An implementation of the model object '<em><b>Composite Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.impl.CompositeExpImpl#getLogicOperator <em>Logic Operator</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.statements.impl.CompositeExpImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeExpImpl extends ExpressionImpl implements CompositeExp {
	/**
	 * The default value of the '{@link #getLogicOperator() <em>Logic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicOperators LOGIC_OPERATOR_EDEFAULT = LogicOperators.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getLogicOperator() <em>Logic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicOperators logicOperator = LOGIC_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.COMPOSITE_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicOperators getLogicOperator() {
		return logicOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicOperator(LogicOperators newLogicOperator) {
		LogicOperators oldLogicOperator = logicOperator;
		logicOperator = newLogicOperator == null ? LOGIC_OPERATOR_EDEFAULT : newLogicOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.COMPOSITE_EXP__LOGIC_OPERATOR,
					oldLogicOperator, logicOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList(Expression.class, this,
					StatementsPackage.COMPOSITE_EXP__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.COMPOSITE_EXP__EXPRESSIONS:
			return ((InternalEList) getExpressions()).basicRemove(otherEnd, msgs);
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
		case StatementsPackage.COMPOSITE_EXP__LOGIC_OPERATOR:
			return getLogicOperator();
		case StatementsPackage.COMPOSITE_EXP__EXPRESSIONS:
			return getExpressions();
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
		case StatementsPackage.COMPOSITE_EXP__LOGIC_OPERATOR:
			setLogicOperator((LogicOperators) newValue);
			return;
		case StatementsPackage.COMPOSITE_EXP__EXPRESSIONS:
			getExpressions().clear();
			getExpressions().addAll((Collection) newValue);
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
		case StatementsPackage.COMPOSITE_EXP__LOGIC_OPERATOR:
			setLogicOperator(LOGIC_OPERATOR_EDEFAULT);
			return;
		case StatementsPackage.COMPOSITE_EXP__EXPRESSIONS:
			getExpressions().clear();
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
		case StatementsPackage.COMPOSITE_EXP__LOGIC_OPERATOR:
			return logicOperator != LOGIC_OPERATOR_EDEFAULT;
		case StatementsPackage.COMPOSITE_EXP__EXPRESSIONS:
			return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (logicOperator: ");
		result.append(logicOperator);
		result.append(')');
		return result.toString();
	}

} //CompositeExpImpl
