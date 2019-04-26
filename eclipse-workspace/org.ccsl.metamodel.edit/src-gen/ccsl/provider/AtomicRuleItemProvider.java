/**
 */
package ccsl.provider;

import ccsl.AtomicRule;
import ccsl.ccslPackage;

import ccsl.elements.ElementsFactory;

import ccsl.elements.namedElements.NamedElementsFactory;

import ccsl.elements.statements.StatementsFactory;

import ccsl.filters.FiltersFactory;

import ccsl.java.JavaFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.AtomicRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicRuleItemProvider extends RuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicRuleItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS);
			childrenFeatures.add(ccslPackage.Literals.ATOMIC_RULE__FILTER);
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
	 * This returns AtomicRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AtomicRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		AtomicRule atomicRule = (AtomicRule) object;
		return getString("_UI_AtomicRule_type") + " " + atomicRule.isNegated();
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

		switch (notification.getFeatureID(AtomicRule.class)) {
		case ccslPackage.ATOMIC_RULE__ELEMENTS:
		case ccslPackage.ATOMIC_RULE__FILTER:
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

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				ElementsFactory.eINSTANCE.createElement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				NamedElementsFactory.eINSTANCE.createNamedElement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				NamedElementsFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				NamedElementsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				NamedElementsFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(
				createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS, JavaFactory.eINSTANCE.createJClass()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				JavaFactory.eINSTANCE.createJInterface()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				JavaFactory.eINSTANCE.createJMethod()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				JavaFactory.eINSTANCE.createJConstructor()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add(
				createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS, JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__ELEMENTS,
				JavaFactory.eINSTANCE.createJReturnStatement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__FILTER,
				FiltersFactory.eINSTANCE.createCompositeFilter()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__FILTER,
				FiltersFactory.eINSTANCE.createPropertyFilter()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__FILTER,
				FiltersFactory.eINSTANCE.createTemplateFilter()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__FILTER,
				FiltersFactory.eINSTANCE.createDefinesMethod()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__FILTER,
				FiltersFactory.eINSTANCE.createEqualsNamedElement()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__FILTER,
				FiltersFactory.eINSTANCE.createRegexLiteralValueFilter()));

		newChildDescriptors.add(createChildParameter(ccslPackage.Literals.ATOMIC_RULE__FILTER,
				FiltersFactory.eINSTANCE.createEqualsNamedElementWithLiterals()));
	}

}
