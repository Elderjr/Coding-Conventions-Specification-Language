/**
 */
package ccsl.java.impl;

import ccsl.elements.namedElements.impl.ComplexTypeImpl;

import ccsl.elements.statements.Block;

import ccsl.java.JClass;
import ccsl.java.JInterface;
import ccsl.java.JavaPackage;

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
 * An implementation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.java.impl.JClassImpl#getNestedClasses <em>Nested Classes</em>}</li>
 *   <li>{@link ccsl.java.impl.JClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link ccsl.java.impl.JClassImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JClassImpl extends ComplexTypeImpl implements JClass {
	/**
	 * The cached value of the '{@link #getNestedClasses() <em>Nested Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList nestedClasses;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList implements_;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList blocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedClasses() {
		if (nestedClasses == null) {
			nestedClasses = new EObjectContainmentEList(JClass.class, this, JavaPackage.JCLASS__NESTED_CLASSES);
		}
		return nestedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList(JInterface.class, this, JavaPackage.JCLASS__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList(Block.class, this, JavaPackage.JCLASS__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaPackage.JCLASS__NESTED_CLASSES:
			return ((InternalEList) getNestedClasses()).basicRemove(otherEnd, msgs);
		case JavaPackage.JCLASS__BLOCKS:
			return ((InternalEList) getBlocks()).basicRemove(otherEnd, msgs);
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
		case JavaPackage.JCLASS__NESTED_CLASSES:
			return getNestedClasses();
		case JavaPackage.JCLASS__IMPLEMENTS:
			return getImplements();
		case JavaPackage.JCLASS__BLOCKS:
			return getBlocks();
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
		case JavaPackage.JCLASS__NESTED_CLASSES:
			getNestedClasses().clear();
			getNestedClasses().addAll((Collection) newValue);
			return;
		case JavaPackage.JCLASS__IMPLEMENTS:
			getImplements().clear();
			getImplements().addAll((Collection) newValue);
			return;
		case JavaPackage.JCLASS__BLOCKS:
			getBlocks().clear();
			getBlocks().addAll((Collection) newValue);
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
		case JavaPackage.JCLASS__NESTED_CLASSES:
			getNestedClasses().clear();
			return;
		case JavaPackage.JCLASS__IMPLEMENTS:
			getImplements().clear();
			return;
		case JavaPackage.JCLASS__BLOCKS:
			getBlocks().clear();
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
		case JavaPackage.JCLASS__NESTED_CLASSES:
			return nestedClasses != null && !nestedClasses.isEmpty();
		case JavaPackage.JCLASS__IMPLEMENTS:
			return implements_ != null && !implements_.isEmpty();
		case JavaPackage.JCLASS__BLOCKS:
			return blocks != null && !blocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JClassImpl
