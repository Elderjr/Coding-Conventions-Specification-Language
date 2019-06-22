/**
 */
package ccsl.provider;

import ccsl.Rule;
import ccsl.ccslPackage;

import ccsl.elements.ElementsFactory;

import ccsl.elements.datatype.DatatypeFactory;

import ccsl.elements.namedElements.NamedElementsFactory;

import ccsl.elements.statements.StatementsFactory;

import ccsl.java.JavaFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.Rule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleItemProvider(AdapterFactory adapterFactory) {
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

			addNegatedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Negated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Rule_negated_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Rule_negated_feature", "_UI_Rule_type"),
						ccslPackage.Literals.RULE__NEGATED, true, false, false,
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
			childrenFeatures.add(ccslPackage.Literals.RULE__PRIMITIVE_TYPES_REFERENCES);
			childrenFeatures.add(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Rule rule = (Rule) object;
		return getString("_UI_Rule_type") + " " + rule.isNegated();
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

		switch (notification.getFeatureID(Rule.class)) {
		case ccslPackage.RULE__NEGATED:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ccslPackage.RULE__PRIMITIVE_TYPES_REFERENCES:
		case ccslPackage.RULE__AUXILIARY_ELEMENTS:
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

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__PRIMITIVE_TYPES_REFERENCES,
				DatatypeFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				ElementsFactory.eINSTANCE.createElement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				NamedElementsFactory.eINSTANCE.createNamedElement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				NamedElementsFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				NamedElementsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				NamedElementsFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				NamedElementsFactory.eINSTANCE.createConstructor()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				JavaFactory.eINSTANCE.createJClass()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				JavaFactory.eINSTANCE.createJInterface()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				JavaFactory.eINSTANCE.createJMethod()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				JavaFactory.eINSTANCE.createJConstructor()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.RULE__AUXILIARY_ELEMENTS,
				JavaFactory.eINSTANCE.createJReturnStatement()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return CcslEditPlugin.INSTANCE;
	}

}
