/**
 */
package codingConvention.filters.impl;

import codingConvention.elements.Element;

import codingConvention.filters.FiltersPackage;
import codingConvention.filters.TemplateFilter;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link codingConvention.filters.impl.TemplateFilterImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateFilterImpl extends AtomicFilterImpl implements TemplateFilter {
	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Element template;

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
	@Override
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.TEMPLATE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject) template;
			template = (Element) eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.TEMPLATE_FILTER__TEMPLATE,
							oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Element newTemplate) {
		Element oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.TEMPLATE_FILTER__TEMPLATE, oldTemplate,
					template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
			if (resolve)
				return getTemplate();
			return basicGetTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
			setTemplate((Element) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
			setTemplate((Element) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
			return template != null;
		}
		return super.eIsSet(featureID);
	}

} //TemplateFilterImpl
