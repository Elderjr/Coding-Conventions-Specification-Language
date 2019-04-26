/**
 */
package ccsl.filters.impl;

import ccsl.elements.Element;

import ccsl.filters.FiltersPackage;
import ccsl.filters.TemplateFilter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsl.filters.impl.TemplateFilterImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link ccsl.filters.impl.TemplateFilterImpl#isExact <em>Exact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateFilterImpl extends AtomicFilterImpl implements TemplateFilter {
	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Element template;

	/**
	 * The default value of the '{@link #isExact() <em>Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExact() <em>Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExact()
	 * @generated
	 * @ordered
	 */
	protected boolean exact = EXACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.TEMPLATE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(Element newTemplate, NotificationChain msgs) {
		Element oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FiltersPackage.TEMPLATE_FILTER__TEMPLATE, oldTemplate, newTemplate);
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
	public void setTemplate(Element newTemplate) {
		if (newTemplate != template) {
			NotificationChain msgs = null;
			if (template != null)
				msgs = ((InternalEObject) template).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FiltersPackage.TEMPLATE_FILTER__TEMPLATE, null, msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject) newTemplate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FiltersPackage.TEMPLATE_FILTER__TEMPLATE, null, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.TEMPLATE_FILTER__TEMPLATE, newTemplate,
					newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExact() {
		return exact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExact(boolean newExact) {
		boolean oldExact = exact;
		exact = newExact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.TEMPLATE_FILTER__EXACT, oldExact,
					exact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
			return basicSetTemplate(null, msgs);
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
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
			return getTemplate();
		case FiltersPackage.TEMPLATE_FILTER__EXACT:
			return isExact() ? Boolean.TRUE : Boolean.FALSE;
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
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
			setTemplate((Element) newValue);
			return;
		case FiltersPackage.TEMPLATE_FILTER__EXACT:
			setExact(((Boolean) newValue).booleanValue());
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
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
			setTemplate((Element) null);
			return;
		case FiltersPackage.TEMPLATE_FILTER__EXACT:
			setExact(EXACT_EDEFAULT);
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
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
			return template != null;
		case FiltersPackage.TEMPLATE_FILTER__EXACT:
			return exact != EXACT_EDEFAULT;
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
		result.append(" (exact: ");
		result.append(exact);
		result.append(')');
		return result.toString();
	}

} //TemplateFilterImpl
