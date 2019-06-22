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
 *   <li>{@link ccsl.filters.impl.TemplateFilterImpl#isExactMatch <em>Exact Match</em>}</li>
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
	 * The default value of the '{@link #isExactMatch() <em>Exact Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExactMatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXACT_MATCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExactMatch() <em>Exact Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExactMatch()
	 * @generated
	 * @ordered
	 */
	protected boolean exactMatch = EXACT_MATCH_EDEFAULT;

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
	public boolean isExactMatch() {
		return exactMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExactMatch(boolean newExactMatch) {
		boolean oldExactMatch = exactMatch;
		exactMatch = newExactMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.TEMPLATE_FILTER__EXACT_MATCH,
					oldExactMatch, exactMatch));
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
		case FiltersPackage.TEMPLATE_FILTER__EXACT_MATCH:
			return isExactMatch() ? Boolean.TRUE : Boolean.FALSE;
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
		case FiltersPackage.TEMPLATE_FILTER__EXACT_MATCH:
			setExactMatch(((Boolean) newValue).booleanValue());
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
		case FiltersPackage.TEMPLATE_FILTER__EXACT_MATCH:
			setExactMatch(EXACT_MATCH_EDEFAULT);
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
		case FiltersPackage.TEMPLATE_FILTER__EXACT_MATCH:
			return exactMatch != EXACT_MATCH_EDEFAULT;
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
		result.append(" (exactMatch: ");
		result.append(exactMatch);
		result.append(')');
		return result.toString();
	}

} //TemplateFilterImpl
