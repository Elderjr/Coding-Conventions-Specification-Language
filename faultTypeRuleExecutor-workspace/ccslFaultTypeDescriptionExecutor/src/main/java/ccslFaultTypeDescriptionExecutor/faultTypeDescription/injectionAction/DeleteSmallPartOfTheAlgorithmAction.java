package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.CatchClause;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Statement;
import org.eclipse.gmt.modisco.java.SwitchStatement;
import org.eclipse.gmt.modisco.java.TryStatement;
import org.eclipse.gmt.modisco.java.WhileStatement;

import ccslFaultTypeDescriptionExecutor.modiscoWrapper.*;

public class DeleteSmallPartOfTheAlgorithmAction implements InjectionAction, ModiscoWrapperVisitor{

	private List<ASTNode> candidatesToDelete;
		
	@Override
	public boolean doAction(ASTNode target) {
		if(!(target instanceof MethodDeclaration)) {
			return false;
		}
		MethodDeclaration methodDecl = (MethodDeclaration) target;
		ModiscoWrapper methodDeclWrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(methodDecl);
		candidatesToDelete = new LinkedList<>();
		methodDeclWrapper.accept(this); //populate candidates to delete
		if(candidatesToDelete.size() > 0) {
			Random r = new Random();
			ASTNode node = candidatesToDelete.get(r.nextInt(candidatesToDelete.size()));
			new DeleteNodeCommand().doAction(node);
			return true;
		}		
		return false;
	}

	@Override
	public void visit(AbstractMethodDeclarationWrapper abstractMethodDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AbstractMethodInvocationWrapper abstractMethodInvocation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AbstractTypeDeclarationWrapper abstractTypeDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AbstractTypeQualifiedExpressionWrapper abstractTypeQualifiedExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AbstractVariablesContainerWrapper abstractVariablesContainer) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AnnotationWrapper annotation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ArchiveWrapper archive) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AssertStatementWrapper assertStatement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ASTNodeWrapper aSTNode) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AnnotationMemberValuePairWrapper annotationMemberValuePair) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AnnotationTypeDeclarationWrapper annotationTypeDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AnnotationTypeMemberDeclarationWrapper annotationTypeMemberDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AnonymousClassDeclarationWrapper anonymousClassDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ArrayAccessWrapper arrayAccess) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ArrayCreationWrapper arrayCreation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ArrayInitializerWrapper arrayInitializer) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ArrayLengthAccessWrapper arrayLengthAccess) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ArrayTypeWrapper arrayType) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AssignmentWrapper assignment) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(BodyDeclarationWrapper bodyDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(BooleanLiteralWrapper booleanLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(BlockCommentWrapper blockComment) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(BlockWrapper blockWrapper) {
		Block block = (Block) blockWrapper.getASTNode();
		for(Statement stmt : block.getStatements()) {
			ModiscoWrapper stmtWrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(stmt);
			stmtWrapper.accept(this);
		}
	}

	@Override
	public void visit(BreakStatementWrapper breakStatement) {
		candidatesToDelete.add(breakStatement.getASTNode());
	}

	@Override
	public void visit(CastExpressionWrapper castExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(CatchClauseWrapper catchClauseWrapper) {
		CatchClause catchClause = (CatchClause) catchClauseWrapper.getASTNode();
		ModiscoWrapper wrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(catchClause.getBody());
		wrapper.accept(this);
	}

	@Override
	public void visit(CharacterLiteralWrapper characterLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ClassFileWrapper classFile) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ClassInstanceCreationWrapper classInstanceCreation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ConstructorDeclarationWrapper constructorDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ConditionalExpressionWrapper conditionalExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ConstructorInvocationWrapper constructorInvocation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ClassDeclarationWrapper classDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(CommentWrapper comment) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(CompilationUnitWrapper compilationUnit) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ContinueStatementWrapper continueStatement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(DoStatementWrapper doStatementWrapper) {
		DoStatement doStmt = (DoStatement) doStatementWrapper.getASTNode();
		ModiscoWrapper wrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(doStmt.getBody());
		wrapper.accept(this);
	}

	@Override
	public void visit(EmptyStatementWrapper emptyStatement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(EnhancedForStatementWrapper enhancedForStatement) {
		EnhancedForStatement node = (EnhancedForStatement) enhancedForStatement.getASTNode();
		ModiscoWrapper wrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(node.getBody());
		wrapper.accept(this);
	}

	@Override
	public void visit(EnumConstantDeclarationWrapper enumConstantDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(EnumDeclarationWrapper enumDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ExpressionWrapper expression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ExpressionStatementWrapper expressionStatementWrapper) {
		candidatesToDelete.add(expressionStatementWrapper.getASTNode());
	}

	@Override
	public void visit(FieldAccessWrapper fieldAccess) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(FieldDeclarationWrapper fieldDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ForStatementWrapper forStatementWrapper) {
		ForStatement node = (ForStatement) forStatementWrapper.getASTNode();
		ModiscoWrapper wrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(node.getBody());
		wrapper.accept(this);
	}

	@Override
	public void visit(IfStatementWrapper ifStatementWrapper) {
		IfStatement node = (IfStatement) ifStatementWrapper.getASTNode();
		ModiscoWrapper thenWrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(node.getThenStatement());
		thenWrapper.accept(this);
		if(node.getElseStatement() != null) {
			ModiscoWrapper elseWrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(node.getElseStatement());
			elseWrapper.accept(this);
		}
	}

	@Override
	public void visit(ImportDeclarationWrapper importDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(InfixExpressionWrapper infixExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(InitializerWrapper initializer) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(InstanceofExpressionWrapper instanceofExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(InterfaceDeclarationWrapper interfaceDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(JavadocWrapper javadoc) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(LabeledStatementWrapper labeledStatementWrapper) {
		LabeledStatement node = (LabeledStatement) labeledStatementWrapper.getASTNode();
		ModiscoWrapper wrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(node.getBody());
		wrapper.accept(this);
	}

	@Override
	public void visit(LineCommentWrapper lineComment) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(MemberRefWrapper memberRef) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(MethodDeclarationWrapper methodDeclarationWrapper) {
		MethodDeclaration node = (MethodDeclaration) methodDeclarationWrapper.getASTNode();
		if(node.getBody() != null) {
			ModiscoWrapper wrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(node.getBody());
			wrapper.accept(this);
		}
	}

	@Override
	public void visit(MethodInvocationWrapper methodInvocation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(MethodRefWrapper methodRef) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(MethodRefParameterWrapper methodRefParameter) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ModifierWrapper modifier) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(NamedElementWrapper namedElement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(NamespaceAccessWrapper namespaceAccess) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(NumberLiteralWrapper numberLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(NullLiteralWrapper nullLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PackageWrapper pack) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PackageAccessWrapper packageAccess) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ParameterizedTypeWrapper parameterizedType) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ParenthesizedExpressionWrapper parenthesizedExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PostfixExpressionWrapper postfixExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrefixExpressionWrapper prefixExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeWrapper primitiveType) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeBooleanWrapper primitiveTypeBoolean) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeByteWrapper primitiveTypeByte) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeCharWrapper primitiveTypeChar) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeDoubleWrapper primitiveTypeDouble) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeShortWrapper primitiveTypeShort) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeFloatWrapper primitiveTypeFloat) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeIntWrapper primitiveTypeInt) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeLongWrapper primitiveTypeLong) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(PrimitiveTypeVoidWrapper primitiveTypeVoid) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ReturnStatementWrapper returnStatement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(SingleVariableAccessWrapper singleVariableAccess) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(SingleVariableDeclarationWrapper singleVariableDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(StatementWrapper statement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(StringLiteralWrapper stringLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(SuperConstructorInvocationWrapper superConstructorInvocation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(SuperFieldAccessWrapper superFieldAccess) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(SuperMethodInvocationWrapper superMethodInvocation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(SwitchCaseWrapper switchCaseWrapper) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(SwitchStatementWrapper switchStatementWrapper) {
		SwitchStatement switchStmt = (SwitchStatement) switchStatementWrapper.getASTNode();
		for(Statement stmt : switchStmt.getStatements()) {
			ModiscoWrapper stmtWrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(stmt);
			stmtWrapper.accept(this);
		}
	}

	@Override
	public void visit(SynchronizedStatementWrapper synchronizedStatement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(TagElementWrapper tagElement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(TextElementWrapper textElement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ThisExpressionWrapper thisExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(ThrowStatementWrapper throwStatement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(TryStatementWrapper tryStatementWrapper) {
		TryStatement tryStmt = (TryStatement) tryStatementWrapper.getASTNode();
		ModiscoWrapper wrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(tryStmt.getBody());
		wrapper.accept(this);
	}

	@Override
	public void visit(TypeWrapper type) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(TypeAccessWrapper typeAccess) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(TypeDeclarationWrapper typeDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(TypeDeclarationStatementWrapper typeDeclarationStatement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(TypeLiteralWrapper typeLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(TypeParameterWrapper typeParameter) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedItemWrapper unresolvedItem) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedItemAccessWrapper unresolvedItemAccess) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedAnnotationDeclarationWrapper unresolvedAnnotationDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedAnnotationTypeMemberDeclarationWrapper unresolvedAnnotationTypeMemberDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedClassDeclarationWrapper unresolvedClassDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedEnumDeclarationWrapper unresolvedEnumDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedInterfaceDeclarationWrapper unresolvedInterfaceDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedLabeledStatementWrapper unresolvedLabeledStatement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedMethodDeclarationWrapper unresolvedMethodDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedSingleVariableDeclarationWrapper unresolvedSingleVariableDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedTypeWrapper unresolvedType) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedTypeDeclarationWrapper unresolvedTypeDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(UnresolvedVariableDeclarationFragmentWrapper unresolvedVariableDeclarationFragment) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(VariableDeclarationWrapper variableDeclaration) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(VariableDeclarationExpressionWrapper variableDeclarationExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(VariableDeclarationFragmentWrapper variableDeclarationFragment) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(VariableDeclarationStatementWrapper variableDeclarationStatement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(WildCardTypeWrapper wildCardType) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(WhileStatementWrapper whileStatementWrapper) {
		WhileStatement node = (WhileStatement) whileStatementWrapper.getASTNode();
		ModiscoWrapper wrapper = ModiscoJavaToWrapper.modiscoJavaToWrapper(node.getBody());
		wrapper.accept(this);
	}

	
}
