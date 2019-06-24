/**
 */
package ccsl.filters.provider;

import ccsl.elements.ElementsFactory;

import ccsl.elements.namedElements.NamedElementsFactory;

import ccsl.elements.statements.StatementsFactory;

import ccsl.filters.FiltersPackage;
import ccsl.filters.TemplateFilter;

import ccsl.java.JavaFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.filters.TemplateFilter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateFilterItemProvider extends AtomicFilterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateFilterItemProvider(AdapterFactory adapterFactory) {
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

			addExactMatchPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Exact Match feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExactMatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TemplateFilter_exactMatch_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TemplateFilter_exactMatch_feature",
								"_UI_TemplateFilter_type"),
						FiltersPackage.Literals.TEMPLATE_FILTER__EXACT_MATCH, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE);
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
	 * This returns TemplateFilter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemplateFilter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		TemplateFilter templateFilter = (TemplateFilter) object;
		return getString("_UI_TemplateFilter_type") + " " + templateFilter.isNegated();
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

		switch (notification.getFeatureID(TemplateFilter.class)) {
		case FiltersPackage.TEMPLATE_FILTER__EXACT_MATCH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FiltersPackage.TEMPLATE_FILTER__TEMPLATE:
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

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				ElementsFactory.eINSTANCE.createElement()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				NamedElementsFactory.eINSTANCE.createNamedElement()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				NamedElementsFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				NamedElementsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				NamedElementsFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				NamedElementsFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				JavaFactory.eINSTANCE.createJavaClass()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				JavaFactory.eINSTANCE.createJInterface()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				JavaFactory.eINSTANCE.createJMethod()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				JavaFactory.eINSTANCE.createJConstructor()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.TEMPLATE_FILTER__TEMPLATE,
				JavaFactory.eINSTANCE.createJReturnStatement()));
	}

}
