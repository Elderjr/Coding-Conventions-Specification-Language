/**
 */
package ccsl.elements.statements.provider;

import ccsl.elements.statements.InfixExp;
import ccsl.elements.statements.StatementsFactory;
import ccsl.elements.statements.StatementsPackage;

import ccsl.java.JavaFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.statements.InfixExp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InfixExpItemProvider extends AtomicExpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementsPackage.Literals.INFIX_EXP__LEFT);
			childrenFeatures.add(StatementsPackage.Literals.INFIX_EXP__RIGHT);
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
	 * This returns InfixExp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InfixExp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((InfixExp) object).getOperator();
		return label == null || label.length() == 0 ? getString("_UI_InfixExp_type")
				: getString("_UI_InfixExp_type") + " " + label;
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

		switch (notification.getFeatureID(InfixExp.class)) {
		case StatementsPackage.INFIX_EXP__LEFT:
		case StatementsPackage.INFIX_EXP__RIGHT:
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

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add(
				createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT, JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__LEFT,
				JavaFactory.eINSTANCE.createJReturnStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add(
				createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT, JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.INFIX_EXP__RIGHT,
				JavaFactory.eINSTANCE.createJReturnStatement()));
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

		boolean qualify = childFeature == StatementsPackage.Literals.INFIX_EXP__LEFT
				|| childFeature == StatementsPackage.Literals.INFIX_EXP__RIGHT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
