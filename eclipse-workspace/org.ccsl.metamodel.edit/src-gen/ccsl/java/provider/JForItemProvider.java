/**
 */
package ccsl.java.provider;

import ccsl.elements.statements.StatementsFactory;
import ccsl.elements.statements.StatementsPackage;

import ccsl.elements.statements.provider.BlockItemProvider;

import ccsl.java.JFor;
import ccsl.java.JavaFactory;
import ccsl.java.JavaPackage;

import ccsl.provider.CcslEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.java.JFor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JForItemProvider extends BlockItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JForItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL);
			childrenFeatures.add(JavaPackage.Literals.JFOR__INITIALIZERS);
			childrenFeatures.add(JavaPackage.Literals.JFOR__UPDATERS);
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
	 * This returns JFor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JFor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_JFor_type");
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

		switch (notification.getFeatureID(JFor.class)) {
		case JavaPackage.JFOR__CONDITIONAL:
		case JavaPackage.JFOR__INITIALIZERS:
		case JavaPackage.JFOR__UPDATERS:
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

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				JavaFactory.eINSTANCE.createJReturnStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors
				.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS, JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				JavaFactory.eINSTANCE.createJReturnStatement()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__INITIALIZERS,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(
				createChildParameter(JavaPackage.Literals.JFOR__UPDATERS, JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(
				createChildParameter(JavaPackage.Literals.JFOR__UPDATERS, JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(
				createChildParameter(JavaPackage.Literals.JFOR__UPDATERS, JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors
				.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS, JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				JavaFactory.eINSTANCE.createJReturnStatement()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(
				createChildParameter(JavaPackage.Literals.JFOR__UPDATERS, StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(
				createChildParameter(JavaPackage.Literals.JFOR__UPDATERS, StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JFOR__UPDATERS,
				StatementsFactory.eINSTANCE.createInstanceCreation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == StatementsPackage.Literals.BLOCK__STATEMENTS
				|| childFeature == StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL
				|| childFeature == JavaPackage.Literals.JFOR__INITIALIZERS
				|| childFeature == JavaPackage.Literals.JFOR__UPDATERS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
