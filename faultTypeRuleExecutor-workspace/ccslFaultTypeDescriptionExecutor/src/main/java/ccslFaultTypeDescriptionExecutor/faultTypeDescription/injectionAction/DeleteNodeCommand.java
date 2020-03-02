package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.ExpressionStatement;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import org.eclipse.gmt.modisco.java.SwitchStatement;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.deleteNodeHelpers.DeleteIfContent;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.deleteNodeHelpers.DeleteInfixContent;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.*;

public class DeleteNodeCommand implements InjectionAction, ModiscoWrapperVisitor {

	private ASTNode fieldToBeDeleted;
	private boolean hasNodeBeenDeleted;
	
	@Override
	public boolean doAction(ASTNode node) {
		if(node.eContainer() != null && node.eContainer() instanceof ASTNode) {
			ModiscoWrapper container = ModiscoJavaToWrapper.modiscoJavaToWrapper((ASTNode) node.eContainer());
			fieldToBeDeleted = node;
			hasNodeBeenDeleted = false;
			/*
			 * Call visit method for the specific type of container.
			 * Each visit method means: Delete the @fieldToBeDeleted of the @container
			 */
			container.accept(this);
			return hasNodeBeenDeleted;	
		}
		return false;
	}

	@Override
	public void visit(AbstractMethodDeclarationWrapper abstractMethodDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AbstractMethodInvocationWrapper abstractMethodInvocation) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AbstractTypeDeclarationWrapper abstractTypeDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AbstractTypeQualifiedExpressionWrapper abstractTypeQualifiedExpression) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AbstractVariablesContainerWrapper abstractVariablesContainer) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AnnotationWrapper annotation) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ArchiveWrapper archive) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AssertStatementWrapper assertStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ASTNodeWrapper aSTNode) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AnnotationMemberValuePairWrapper annotationMemberValuePair) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AnnotationTypeDeclarationWrapper annotationTypeDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AnnotationTypeMemberDeclarationWrapper annotationTypeMemberDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AnonymousClassDeclarationWrapper anonymousClassDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ArrayAccessWrapper arrayAccess) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ArrayCreationWrapper arrayCreation) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ArrayInitializerWrapper arrayInitializer) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ArrayLengthAccessWrapper arrayLengthAccess) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ArrayTypeWrapper arrayType) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(AssignmentWrapper assignmentWrapper) {
		Assignment assignment = (Assignment) assignmentWrapper.getASTNode();
		if(assignment.getRightHandSide() == fieldToBeDeleted) {
			if(assignment.eContainer() != null && assignment.eContainer() instanceof ExpressionStatement) {
				hasNodeBeenDeleted = new DeleteNodeCommand().doAction(assignment);
			} else if(assignment.eContainer() != null) {
				hasNodeBeenDeleted = ActionUtils.setValue(assignment, assignment.getLeftHandSide());
			} else {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		} else {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	@Override
	public void visit(BodyDeclarationWrapper bodyDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(BooleanLiteralWrapper booleanLiteral) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(BlockCommentWrapper blockComment) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(BlockWrapper blockWrapper) {
		Block block = (Block) blockWrapper.getASTNode();
		if (block.getStatements().contains(fieldToBeDeleted)) {
			block.getStatements().remove(fieldToBeDeleted);
			hasNodeBeenDeleted = true;
		} else {
			hasNodeBeenDeleted = false;
		}
	}

	@Override
	public void visit(BreakStatementWrapper breakStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(CastExpressionWrapper castExpression) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(CatchClauseWrapper catchClause) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(CharacterLiteralWrapper characterLiteral) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ClassFileWrapper classFile) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ClassInstanceCreationWrapper classInstanceCreation) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ConstructorDeclarationWrapper constructorDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ConditionalExpressionWrapper conditionalExpression) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ConstructorInvocationWrapper constructorInvocation) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ClassDeclarationWrapper classDeclaration) {
		ClassDeclaration clazzDecl = (ClassDeclaration) classDeclaration.getASTNode();
		if(clazzDecl.getBodyDeclarations().contains(fieldToBeDeleted)) {
			clazzDecl.getBodyDeclarations().remove(fieldToBeDeleted);
			hasNodeBeenDeleted = true;
		} else {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	@Override
	public void visit(CommentWrapper comment) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(CompilationUnitWrapper compilationUnit) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ContinueStatementWrapper continueStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(DoStatementWrapper doStatementWrapper) {
		DoStatement doStatement = (DoStatement) doStatementWrapper.getASTNode();
		if (doStatement.getBody() == fieldToBeDeleted) {
			doStatement.setBody(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
			hasNodeBeenDeleted = true;
		} else {
			hasNodeBeenDeleted = false;
			throw new IllegalArgumentException("field is not an field of DoStatement");
		}
	}

	@Override
	public void visit(EmptyStatementWrapper emptyStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(EnhancedForStatementWrapper enhancedForStatement) {
		EnhancedForStatement forStatement = (EnhancedForStatement) enhancedForStatement.getASTNode();
		if (forStatement.getBody() == fieldToBeDeleted) {
			forStatement.setBody(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
			hasNodeBeenDeleted = true;
		} else {
			hasNodeBeenDeleted = false;
			throw new IllegalArgumentException("field is not an field of EnhancedForStatement");
		}
	}

	@Override
	public void visit(EnumConstantDeclarationWrapper enumConstantDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(EnumDeclarationWrapper enumDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ExpressionWrapper expression) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ExpressionStatementWrapper expressionStatementWrapper) {
		hasNodeBeenDeleted = new DeleteNodeCommand().doAction(expressionStatementWrapper.getASTNode());
	}

	@Override
	public void visit(FieldAccessWrapper fieldAccess) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(FieldDeclarationWrapper fieldDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ForStatementWrapper forStatementWrapper) {
		ForStatement forStatement = (ForStatement) forStatementWrapper.getASTNode();
		if (forStatement.getBody() == fieldToBeDeleted) {
			forStatement.setBody(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
			hasNodeBeenDeleted = true;
		} else {
			hasNodeBeenDeleted = false;
			throw new IllegalArgumentException("field is not an field of ForStatement");
		}

	}

	@Override
	public void visit(IfStatementWrapper ifStatementWrapper) {
		hasNodeBeenDeleted = DeleteIfContent.deleteIfContent((IfStatement) ifStatementWrapper.getASTNode(), fieldToBeDeleted);
	}

	@Override
	public void visit(ImportDeclarationWrapper importDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(InfixExpressionWrapper infixExpressionWrapper) {
		hasNodeBeenDeleted = DeleteInfixContent.deleteInfixExpressionContent((InfixExpression) infixExpressionWrapper.getASTNode(), fieldToBeDeleted);
	}

	@Override
	public void visit(InitializerWrapper initializer) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(InstanceofExpressionWrapper instanceofExpression) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(InterfaceDeclarationWrapper interfaceDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(JavadocWrapper javadoc) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(LabeledStatementWrapper labeledStatementWrapper) {
		LabeledStatement labeledStatement = (LabeledStatement) labeledStatementWrapper.getASTNode();
		if(labeledStatement.getBody() == fieldToBeDeleted) {
			labeledStatement.setBody(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
			hasNodeBeenDeleted = true;
		} else {
			hasNodeBeenDeleted = false;
		}
		
	}

	@Override
	public void visit(LineCommentWrapper lineComment) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(MemberRefWrapper memberRef) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(MethodDeclarationWrapper methodDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(MethodInvocationWrapper methodInvocation) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(MethodRefWrapper methodRef) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(MethodRefParameterWrapper methodRefParameter) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ModifierWrapper modifier) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(NamedElementWrapper namedElement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(NamespaceAccessWrapper namespaceAccess) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(NumberLiteralWrapper numberLiteral) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(NullLiteralWrapper nullLiteral) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PackageWrapper pack) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PackageAccessWrapper packageAccess) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ParameterizedTypeWrapper parameterizedType) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ParenthesizedExpressionWrapper parenthesizedExpression) {
		hasNodeBeenDeleted = new DeleteNodeCommand().doAction(parenthesizedExpression.getASTNode());
	}

	@Override
	public void visit(PostfixExpressionWrapper postfixExpression) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrefixExpressionWrapper prefixExpression) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeWrapper primitiveType) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeBooleanWrapper primitiveTypeBoolean) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeByteWrapper primitiveTypeByte) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeCharWrapper primitiveTypeChar) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeDoubleWrapper primitiveTypeDouble) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeShortWrapper primitiveTypeShort) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeFloatWrapper primitiveTypeFloat) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeIntWrapper primitiveTypeInt) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeLongWrapper primitiveTypeLong) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(PrimitiveTypeVoidWrapper primitiveTypeVoid) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ReturnStatementWrapper returnStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(SingleVariableAccessWrapper singleVariableAccess) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(SingleVariableDeclarationWrapper singleVariableDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(StatementWrapper statement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(StringLiteralWrapper stringLiteral) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(SuperConstructorInvocationWrapper superConstructorInvocation) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(SuperFieldAccessWrapper superFieldAccess) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(SuperMethodInvocationWrapper superMethodInvocation) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(SwitchCaseWrapper switchCase) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(SwitchStatementWrapper switchStatementWrapper) {
		SwitchStatement switchStatement = (SwitchStatement) switchStatementWrapper.getASTNode();
		if(switchStatement.getStatements().contains(fieldToBeDeleted)) {
			switchStatement.getStatements().remove(fieldToBeDeleted);
			hasNodeBeenDeleted = true;
		} else {
			hasNodeBeenDeleted = false;
			throw new IllegalArgumentException(fieldToBeDeleted + "is not a field of SwitchStatement");
		}
	}

	@Override
	public void visit(SynchronizedStatementWrapper synchronizedStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(TagElementWrapper tagElement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(TextElementWrapper textElement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ThisExpressionWrapper thisExpression) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(ThrowStatementWrapper throwStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(TryStatementWrapper tryStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(TypeWrapper type) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(TypeAccessWrapper typeAccess) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(TypeDeclarationWrapper typeDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(TypeDeclarationStatementWrapper typeDeclarationStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(TypeLiteralWrapper typeLiteral) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(TypeParameterWrapper typeParameter) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedItemWrapper unresolvedItem) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedItemAccessWrapper unresolvedItemAccess) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedAnnotationDeclarationWrapper unresolvedAnnotationDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedAnnotationTypeMemberDeclarationWrapper unresolvedAnnotationTypeMemberDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedClassDeclarationWrapper unresolvedClassDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedEnumDeclarationWrapper unresolvedEnumDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedInterfaceDeclarationWrapper unresolvedInterfaceDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedLabeledStatementWrapper unresolvedLabeledStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedMethodDeclarationWrapper unresolvedMethodDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedSingleVariableDeclarationWrapper unresolvedSingleVariableDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedTypeWrapper unresolvedType) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedTypeDeclarationWrapper unresolvedTypeDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(UnresolvedVariableDeclarationFragmentWrapper unresolvedVariableDeclarationFragment) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(VariableDeclarationWrapper variableDeclaration) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(VariableDeclarationExpressionWrapper variableDeclarationExpression) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(VariableDeclarationFragmentWrapper varDeclWrapper) {
		VariableDeclarationFragment varDecl = (VariableDeclarationFragment) varDeclWrapper.getASTNode();
		if (varDecl.getInitializer() == fieldToBeDeleted) {
			varDecl.setInitializer(null);
			hasNodeBeenDeleted = true;
		} else {
			hasNodeBeenDeleted = false;
			throw new IllegalArgumentException(fieldToBeDeleted + "is not a field of VariableDeclarationFragment");
		}
	}

	@Override
	public void visit(VariableDeclarationStatementWrapper variableDeclarationStatement) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(WildCardTypeWrapper wildCardType) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void visit(WhileStatementWrapper whileStatementWrapper) {
		WhileStatement whileStatement = (WhileStatement) whileStatementWrapper.getASTNode();
		if (whileStatement.getBody() == fieldToBeDeleted) {
			whileStatement.setBody(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
			hasNodeBeenDeleted = true;
		} else {
			hasNodeBeenDeleted = false;
			throw new UnsupportedOperationException(fieldToBeDeleted + "is not a field of WhileStatement");
		}
	}
}
