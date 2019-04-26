/**
 */
package ccsl.elements.statements.provider;

import ccsl.elements.statements.IfStatement;
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
 * This is the item provider adapter for a {@link ccsl.elements.statements.IfStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfStatementItemProvider extends ControlFlowItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS);
			childrenFeatures.add(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS);
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
	 * This returns IfStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_IfStatement_type");
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

		switch (notification.getFeatureID(IfStatement.class)) {
		case StatementsPackage.IF_STATEMENT__TRUE_STATEMENTS:
		case StatementsPackage.IF_STATEMENT__FALSE_STATEMENTS:
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

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS,
				JavaFactory.eINSTANCE.createJReturnStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createNamedElementAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createComplexTypeAccess()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createLiteralValue()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createCompositeExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createAtomicExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createVarAssignment()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createBranchControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createLoopControl()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createPrefixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createInfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createPostfixExp()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createSuperMethodInvocation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createVarDeclaration()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				StatementsFactory.eINSTANCE.createInstanceCreation()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				JavaFactory.eINSTANCE.createJTryClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				JavaFactory.eINSTANCE.createJCatchClause()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				JavaFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
				JavaFactory.eINSTANCE.createJFor()));

		newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS,
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

		boolean qualify = childFeature == StatementsPackage.Literals.CONTROL_FLOW__CONDITIONAL
				|| childFeature == StatementsPackage.Literals.IF_STATEMENT__TRUE_STATEMENTS
				|| childFeature == StatementsPackage.Literals.IF_STATEMENT__FALSE_STATEMENTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
