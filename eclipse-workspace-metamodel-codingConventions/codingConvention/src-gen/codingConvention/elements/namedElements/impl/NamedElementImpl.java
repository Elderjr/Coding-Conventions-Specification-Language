/**
 */
package codingConvention.elements.namedElements.impl;

import codingConvention.elements.impl.ElementImpl;

import codingConvention.elements.namedElements.NamedElement;
import codingConvention.elements.namedElements.NamedElementsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NamedElementImpl extends ElementImpl implements NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamedElementsPackage.Literals.NAMED_ELEMENT;
	}

} //NamedElementImpl
