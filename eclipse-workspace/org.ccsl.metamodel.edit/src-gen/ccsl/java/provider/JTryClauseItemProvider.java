/**
 */
package ccsl.java.provider;

import ccsl.elements.statements.StatementsFactory;
import ccsl.elements.statements.StatementsPackage;

import ccsl.elements.statements.provider.BlockItemProvider;

import ccsl.java.JTryClause;
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
 * This is the item provider adapter for a {@link ccsl.java.JTryClause} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JTryClauseItemProvider extends BlockItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JTryClauseItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES);
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
	 * This returns JTryClause.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JTryClause"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_JTryClause_type");
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

		switch (notification.getFeatureID(JTryClause.class)) {
		case JavaPackage.JTRY_CLAUSE__RESOURCES:
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

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add(
				createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES, JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				JavaFactory.eINSTANCE.createJReturnStatement()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(JavaPackage.Literals.JTRY_CLAUSE__RESOURCES,
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
				|| childFeature == JavaPackage.Literals.JTRY_CLAUSE__RESOURCES;

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
