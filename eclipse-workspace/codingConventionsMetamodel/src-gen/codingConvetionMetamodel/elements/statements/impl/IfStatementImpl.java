/**
 */
package codingConvetionMetamodel.elements.statements.impl;

import codingConvetionMetamodel.elements.statements.IfStatement;
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
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.impl.IfStatementImpl#getTrueStatements <em>True Statements</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.statements.impl.IfStatementImpl#getFalseStatements <em>False Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends ControlFlowImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getTrueStatements() <em>True Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueStatements()
	 * @generated
	 * @ordered
	 */
	protected EList trueStatements;

	/**
	 * The cached value of the '{@link #getFalseStatements() <em>False Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseStatements()
	 * @generated
	 * @ordered
	 */
	protected EList falseStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTrueStatements() {
		if (trueStatements == null) {
			trueStatements = new EObjectContainmentEList(Statement.class, this,
					StatementsPackage.IF_STATEMENT__TRUE_STATEMENTS);
		}
		return trueStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFalseStatements() {
		if (falseStatements == null) {
			falseStatements = new EObjectContainmentEList(Statement.class, this,
					StatementsPackage.IF_STATEMENT__FALSE_STATEMENTS);
		}
		return falseStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.IF_STATEMENT__TRUE_STATEMENTS:
			return ((InternalEList) getTrueStatements()).basicRemove(otherEnd, msgs);
		case StatementsPackage.IF_STATEMENT__FALSE_STATEMENTS:
			return ((InternalEList) getFalseStatements()).basicRemove(otherEnd, msgs);
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
		case StatementsPackage.IF_STATEMENT__TRUE_STATEMENTS:
			return getTrueStatements();
		case StatementsPackage.IF_STATEMENT__FALSE_STATEMENTS:
			return getFalseStatements();
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
		case StatementsPackage.IF_STATEMENT__TRUE_STATEMENTS:
			getTrueStatements().clear();
			getTrueStatements().addAll((Collection) newValue);
			return;
		case StatementsPackage.IF_STATEMENT__FALSE_STATEMENTS:
			getFalseStatements().clear();
			getFalseStatements().addAll((Collection) newValue);
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
		case StatementsPackage.IF_STATEMENT__TRUE_STATEMENTS:
			getTrueStatements().clear();
			return;
		case StatementsPackage.IF_STATEMENT__FALSE_STATEMENTS:
			getFalseStatements().clear();
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
		case StatementsPackage.IF_STATEMENT__TRUE_STATEMENTS:
			return trueStatements != null && !trueStatements.isEmpty();
		case StatementsPackage.IF_STATEMENT__FALSE_STATEMENTS:
			return falseStatements != null && !falseStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
