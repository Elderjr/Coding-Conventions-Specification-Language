/**
 */
package codingConvetionMetamodel.elements.statements.impl;

import codingConvetionMetamodel.elements.statements.InfixExp;
import codingConvetionMetamodel.elements.statements.Statement;
import codingConvetionMetamodel.elements.statements.StatementsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.impl.InfixExpImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.statements.impl.InfixExpImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfixExpImpl extends AtomicExpImpl implements InfixExp {
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
	protected InfixExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.INFIX_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLeft() {
		if (left == null) {
			left = new EObjectContainmentEList(Statement.class, this, StatementsPackage.INFIX_EXP__LEFT);
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
			right = new EObjectContainmentEList(Statement.class, this, StatementsPackage.INFIX_EXP__RIGHT);
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
		case StatementsPackage.INFIX_EXP__LEFT:
			return ((InternalEList) getLeft()).basicRemove(otherEnd, msgs);
		case StatementsPackage.INFIX_EXP__RIGHT:
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
		case StatementsPackage.INFIX_EXP__LEFT:
			return getLeft();
		case StatementsPackage.INFIX_EXP__RIGHT:
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
		case StatementsPackage.INFIX_EXP__LEFT:
			getLeft().clear();
			getLeft().addAll((Collection) newValue);
			return;
		case StatementsPackage.INFIX_EXP__RIGHT:
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
		case StatementsPackage.INFIX_EXP__LEFT:
			getLeft().clear();
			return;
		case StatementsPackage.INFIX_EXP__RIGHT:
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
		case StatementsPackage.INFIX_EXP__LEFT:
			return left != null && !left.isEmpty();
		case StatementsPackage.INFIX_EXP__RIGHT:
			return right != null && !right.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfixExpImpl
