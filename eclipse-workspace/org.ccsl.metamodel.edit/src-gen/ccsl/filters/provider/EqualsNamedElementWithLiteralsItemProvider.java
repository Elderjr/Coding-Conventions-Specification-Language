/**
 */
package ccsl.filters.provider;

import ccsl.filters.EqualsNamedElementWithLiterals;
import ccsl.filters.FiltersPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.filters.EqualsNamedElementWithLiterals} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EqualsNamedElementWithLiteralsItemProvider extends AtomicFilterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualsNamedElementWithLiteralsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamesPropertyDescriptor(object);
			addIgnoreCasePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EqualsNamedElementWithLiterals_names_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EqualsNamedElementWithLiterals_names_feature",
						"_UI_EqualsNamedElementWithLiterals_type"),
				FiltersPackage.Literals.EQUALS_NAMED_ELEMENT_WITH_LITERALS__NAMES, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ignore Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreCasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EqualsNamedElementWithLiterals_ignoreCase_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EqualsNamedElementWithLiterals_ignoreCase_feature",
						"_UI_EqualsNamedElementWithLiterals_type"),
				FiltersPackage.Literals.EQUALS_NAMED_ELEMENT_WITH_LITERALS__IGNORE_CASE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EqualsNamedElementWithLiterals.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EqualsNamedElementWithLiterals"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EqualsNamedElementWithLiterals) object).getNames();
		return label == null || label.length() == 0 ? getString("_UI_EqualsNamedElementWithLiterals_type")
				: getString("_UI_EqualsNamedElementWithLiterals_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EqualsNamedElementWithLiterals.class)) {
		case FiltersPackage.EQUALS_NAMED_ELEMENT_WITH_LITERALS__NAMES:
		case FiltersPackage.EQUALS_NAMED_ELEMENT_WITH_LITERALS__IGNORE_CASE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
