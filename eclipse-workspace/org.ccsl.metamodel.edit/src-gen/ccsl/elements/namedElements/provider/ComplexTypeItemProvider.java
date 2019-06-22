/**
 */
package ccsl.elements.namedElements.provider;

import ccsl.elements.namedElements.ComplexType;
import ccsl.elements.namedElements.NamedElementsFactory;
import ccsl.elements.namedElements.NamedElementsPackage;

import ccsl.java.JavaFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.namedElements.ComplexType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexTypeItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeItemProvider(AdapterFactory adapterFactory) {
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

			addSuperTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Super Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComplexType_superTypes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_superTypes_feature",
								"_UI_ComplexType_type"),
						NamedElementsPackage.Literals.COMPLEX_TYPE__SUPER_TYPES, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NamedElementsPackage.Literals.COMPLEX_TYPE__FIELDS);
			childrenFeatures.add(NamedElementsPackage.Literals.COMPLEX_TYPE__METHODS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComplexType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComplexType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ComplexType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ComplexType_type")
				: getString("_UI_ComplexType_type") + " " + label;
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

		switch (notification.getFeatureID(ComplexType.class)) {
		case NamedElementsPackage.COMPLEX_TYPE__FIELDS:
		case NamedElementsPackage.COMPLEX_TYPE__METHODS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.COMPLEX_TYPE__FIELDS,
				NamedElementsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.COMPLEX_TYPE__METHODS,
				NamedElementsFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.COMPLEX_TYPE__METHODS,
				NamedElementsFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.COMPLEX_TYPE__METHODS,
				JavaFactory.eINSTANCE.createJMethod()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.COMPLEX_TYPE__METHODS,
				JavaFactory.eINSTANCE.createJConstructor()));
	}

}
