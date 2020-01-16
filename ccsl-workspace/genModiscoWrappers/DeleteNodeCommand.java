package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoVisitor;
import org.eclipse.gmt.modisco.java.*;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.deleteNodeActionHelper.*;

public class DeleteNodeCommand implements InjectionAction, ModiscoVisitor {

  private boolean nodeDeleted;
  private ASTNode field;
  private ASTNode originalField;

  @Override
  public boolean doAction(ASTNode node){
    //TODO
    this.nodeDeleted = false;
    return this.nodeDeleted;
  }

  @Override
  public void accept(AbstractMethodDeclaration abstractMethodDeclaration) {
    this.nodeDeleted = DeleteAbstractMethodDeclarationContent.deleteAbstractMethodDeclarationContent(abstractMethodDeclaration, field, originalField);
  }

  @Override
  public void accept(AbstractMethodInvocation abstractMethodInvocation) {
    this.nodeDeleted = DeleteAbstractMethodInvocationContent.deleteAbstractMethodInvocationContent(abstractMethodInvocation, field, originalField);
  }

  @Override
  public void accept(AbstractTypeDeclaration abstractTypeDeclaration) {
    this.nodeDeleted = DeleteAbstractTypeDeclarationContent.deleteAbstractTypeDeclarationContent(abstractTypeDeclaration, field, originalField);
  }

  @Override
  public void accept(AbstractTypeQualifiedExpression abstractTypeQualifiedExpression) {
    this.nodeDeleted = DeleteAbstractTypeQualifiedExpressionContent.deleteAbstractTypeQualifiedExpressionContent(abstractTypeQualifiedExpression, field, originalField);
  }

  @Override
  public void accept(AbstractVariablesContainer abstractVariablesContainer) {
    this.nodeDeleted = DeleteAbstractVariablesContainerContent.deleteAbstractVariablesContainerContent(abstractVariablesContainer, field, originalField);
  }

  @Override
  public void accept(Annotation annotation) {
    this.nodeDeleted = DeleteAnnotationContent.deleteAnnotationContent(annotation, field, originalField);
  }

  @Override
  public void accept(Archive archive) {
    this.nodeDeleted = DeleteArchiveContent.deleteArchiveContent(archive, field, originalField);
  }

  @Override
  public void accept(AssertStatement assertStatement) {
    this.nodeDeleted = DeleteAssertStatementContent.deleteAssertStatementContent(assertStatement, field, originalField);
  }

  @Override
  public void accept(ASTNode aSTNode) {
    this.nodeDeleted = DeleteASTNodeContent.deleteASTNodeContent(aSTNode, field, originalField);
  }

  @Override
  public void accept(AnnotationMemberValuePair annotationMemberValuePair) {
    this.nodeDeleted = DeleteAnnotationMemberValuePairContent.deleteAnnotationMemberValuePairContent(annotationMemberValuePair, field, originalField);
  }

  @Override
  public void accept(AnnotationTypeDeclaration annotationTypeDeclaration) {
    this.nodeDeleted = DeleteAnnotationTypeDeclarationContent.deleteAnnotationTypeDeclarationContent(annotationTypeDeclaration, field, originalField);
  }

  @Override
  public void accept(AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration) {
    this.nodeDeleted = DeleteAnnotationTypeMemberDeclarationContent.deleteAnnotationTypeMemberDeclarationContent(annotationTypeMemberDeclaration, field, originalField);
  }

  @Override
  public void accept(AnonymousClassDeclaration anonymousClassDeclaration) {
    this.nodeDeleted = DeleteAnonymousClassDeclarationContent.deleteAnonymousClassDeclarationContent(anonymousClassDeclaration, field, originalField);
  }

  @Override
  public void accept(ArrayAccess arrayAccess) {
    this.nodeDeleted = DeleteArrayAccessContent.deleteArrayAccessContent(arrayAccess, field, originalField);
  }

  @Override
  public void accept(ArrayCreation arrayCreation) {
    this.nodeDeleted = DeleteArrayCreationContent.deleteArrayCreationContent(arrayCreation, field, originalField);
  }

  @Override
  public void accept(ArrayInitializer arrayInitializer) {
    this.nodeDeleted = DeleteArrayInitializerContent.deleteArrayInitializerContent(arrayInitializer, field, originalField);
  }

  @Override
  public void accept(ArrayLengthAccess arrayLengthAccess) {
    this.nodeDeleted = DeleteArrayLengthAccessContent.deleteArrayLengthAccessContent(arrayLengthAccess, field, originalField);
  }

  @Override
  public void accept(ArrayType arrayType) {
    this.nodeDeleted = DeleteArrayTypeContent.deleteArrayTypeContent(arrayType, field, originalField);
  }

  @Override
  public void accept(Assignment assignment) {
    this.nodeDeleted = DeleteAssignmentContent.deleteAssignmentContent(assignment, field, originalField);
  }

  @Override
  public void accept(AssignmentKind assignmentKind) {
    this.nodeDeleted = DeleteAssignmentKindContent.deleteAssignmentKindContent(assignmentKind, field, originalField);
  }

  @Override
  public void accept(BodyDeclaration bodyDeclaration) {
    this.nodeDeleted = DeleteBodyDeclarationContent.deleteBodyDeclarationContent(bodyDeclaration, field, originalField);
  }

  @Override
  public void accept(BooleanLiteral booleanLiteral) {
    this.nodeDeleted = DeleteBooleanLiteralContent.deleteBooleanLiteralContent(booleanLiteral, field, originalField);
  }

  @Override
  public void accept(BlockComment blockComment) {
    this.nodeDeleted = DeleteBlockCommentContent.deleteBlockCommentContent(blockComment, field, originalField);
  }

  @Override
  public void accept(Block block) {
    this.nodeDeleted = DeleteBlockContent.deleteBlockContent(block, field, originalField);
  }

  @Override
  public void accept(BreakStatement breakStatement) {
    this.nodeDeleted = DeleteBreakStatementContent.deleteBreakStatementContent(breakStatement, field, originalField);
  }

  @Override
  public void accept(CastExpression castExpression) {
    this.nodeDeleted = DeleteCastExpressionContent.deleteCastExpressionContent(castExpression, field, originalField);
  }

  @Override
  public void accept(CatchClause catchClause) {
    this.nodeDeleted = DeleteCatchClauseContent.deleteCatchClauseContent(catchClause, field, originalField);
  }

  @Override
  public void accept(CharacterLiteral characterLiteral) {
    this.nodeDeleted = DeleteCharacterLiteralContent.deleteCharacterLiteralContent(characterLiteral, field, originalField);
  }

  @Override
  public void accept(ClassFile classFile) {
    this.nodeDeleted = DeleteClassFileContent.deleteClassFileContent(classFile, field, originalField);
  }

  @Override
  public void accept(ClassInstanceCreation classInstanceCreation) {
    this.nodeDeleted = DeleteClassInstanceCreationContent.deleteClassInstanceCreationContent(classInstanceCreation, field, originalField);
  }

  @Override
  public void accept(ConstructorDeclaration constructorDeclaration) {
    this.nodeDeleted = DeleteConstructorDeclarationContent.deleteConstructorDeclarationContent(constructorDeclaration, field, originalField);
  }

  @Override
  public void accept(ConditionalExpression conditionalExpression) {
    this.nodeDeleted = DeleteConditionalExpressionContent.deleteConditionalExpressionContent(conditionalExpression, field, originalField);
  }

  @Override
  public void accept(ConstructorInvocation constructorInvocation) {
    this.nodeDeleted = DeleteConstructorInvocationContent.deleteConstructorInvocationContent(constructorInvocation, field, originalField);
  }

  @Override
  public void accept(ClassDeclaration classDeclaration) {
    this.nodeDeleted = DeleteClassDeclarationContent.deleteClassDeclarationContent(classDeclaration, field, originalField);
  }

  @Override
  public void accept(Comment comment) {
    this.nodeDeleted = DeleteCommentContent.deleteCommentContent(comment, field, originalField);
  }

  @Override
  public void accept(CompilationUnit compilationUnit) {
    this.nodeDeleted = DeleteCompilationUnitContent.deleteCompilationUnitContent(compilationUnit, field, originalField);
  }

  @Override
  public void accept(ContinueStatement continueStatement) {
    this.nodeDeleted = DeleteContinueStatementContent.deleteContinueStatementContent(continueStatement, field, originalField);
  }

  @Override
  public void accept(DoStatement doStatement) {
    this.nodeDeleted = DeleteDoStatementContent.deleteDoStatementContent(doStatement, field, originalField);
  }

  @Override
  public void accept(EmptyStatement emptyStatement) {
    this.nodeDeleted = DeleteEmptyStatementContent.deleteEmptyStatementContent(emptyStatement, field, originalField);
  }

  @Override
  public void accept(EnhancedForStatement enhancedForStatement) {
    this.nodeDeleted = DeleteEnhancedForStatementContent.deleteEnhancedForStatementContent(enhancedForStatement, field, originalField);
  }

  @Override
  public void accept(EnumConstantDeclaration enumConstantDeclaration) {
    this.nodeDeleted = DeleteEnumConstantDeclarationContent.deleteEnumConstantDeclarationContent(enumConstantDeclaration, field, originalField);
  }

  @Override
  public void accept(EnumDeclaration enumDeclaration) {
    this.nodeDeleted = DeleteEnumDeclarationContent.deleteEnumDeclarationContent(enumDeclaration, field, originalField);
  }

  @Override
  public void accept(Expression expression) {
    this.nodeDeleted = DeleteExpressionContent.deleteExpressionContent(expression, field, originalField);
  }

  @Override
  public void accept(ExpressionStatement expressionStatement) {
    this.nodeDeleted = DeleteExpressionStatementContent.deleteExpressionStatementContent(expressionStatement, field, originalField);
  }

  @Override
  public void accept(FieldAccess fieldAccess) {
    this.nodeDeleted = DeleteFieldAccessContent.deleteFieldAccessContent(fieldAccess, field, originalField);
  }

  @Override
  public void accept(FieldDeclaration fieldDeclaration) {
    this.nodeDeleted = DeleteFieldDeclarationContent.deleteFieldDeclarationContent(fieldDeclaration, field, originalField);
  }

  @Override
  public void accept(ForStatement forStatement) {
    this.nodeDeleted = DeleteForStatementContent.deleteForStatementContent(forStatement, field, originalField);
  }

  @Override
  public void accept(IfStatement ifStatement) {
    this.nodeDeleted = DeleteIfStatementContent.deleteIfStatementContent(ifStatement, field, originalField);
  }

  @Override
  public void accept(ImportDeclaration importDeclaration) {
    this.nodeDeleted = DeleteImportDeclarationContent.deleteImportDeclarationContent(importDeclaration, field, originalField);
  }

  @Override
  public void accept(InfixExpression infixExpression) {
    this.nodeDeleted = DeleteInfixExpressionContent.deleteInfixExpressionContent(infixExpression, field, originalField);
  }

  @Override
  public void accept(InfixExpressionKind infixExpressionKind) {
    this.nodeDeleted = DeleteInfixExpressionKindContent.deleteInfixExpressionKindContent(infixExpressionKind, field, originalField);
  }

  @Override
  public void accept(InheritanceKind inheritanceKind) {
    this.nodeDeleted = DeleteInheritanceKindContent.deleteInheritanceKindContent(inheritanceKind, field, originalField);
  }

  @Override
  public void accept(Initializer initializer) {
    this.nodeDeleted = DeleteInitializerContent.deleteInitializerContent(initializer, field, originalField);
  }

  @Override
  public void accept(InstanceofExpression instanceofExpression) {
    this.nodeDeleted = DeleteInstanceofExpressionContent.deleteInstanceofExpressionContent(instanceofExpression, field, originalField);
  }

  @Override
  public void accept(InterfaceDeclaration interfaceDeclaration) {
    this.nodeDeleted = DeleteInterfaceDeclarationContent.deleteInterfaceDeclarationContent(interfaceDeclaration, field, originalField);
  }

  @Override
  public void accept(Javadoc javadoc) {
    this.nodeDeleted = DeleteJavadocContent.deleteJavadocContent(javadoc, field, originalField);
  }

  @Override
  public void accept(LabeledStatement labeledStatement) {
    this.nodeDeleted = DeleteLabeledStatementContent.deleteLabeledStatementContent(labeledStatement, field, originalField);
  }

  @Override
  public void accept(LineComment lineComment) {
    this.nodeDeleted = DeleteLineCommentContent.deleteLineCommentContent(lineComment, field, originalField);
  }

  @Override
  public void accept(Manifest manifest) {
    this.nodeDeleted = DeleteManifestContent.deleteManifestContent(manifest, field, originalField);
  }

  @Override
  public void accept(ManifestAttribute manifestAttribute) {
    this.nodeDeleted = DeleteManifestAttributeContent.deleteManifestAttributeContent(manifestAttribute, field, originalField);
  }

  @Override
  public void accept(ManifestEntry manifestEntry) {
    this.nodeDeleted = DeleteManifestEntryContent.deleteManifestEntryContent(manifestEntry, field, originalField);
  }

  @Override
  public void accept(MemberRef memberRef) {
    this.nodeDeleted = DeleteMemberRefContent.deleteMemberRefContent(memberRef, field, originalField);
  }

  @Override
  public void accept(MethodDeclaration methodDeclaration) {
    this.nodeDeleted = DeleteMethodDeclarationContent.deleteMethodDeclarationContent(methodDeclaration, field, originalField);
  }

  @Override
  public void accept(MethodInvocation methodInvocation) {
    this.nodeDeleted = DeleteMethodInvocationContent.deleteMethodInvocationContent(methodInvocation, field, originalField);
  }

  @Override
  public void accept(MethodRef methodRef) {
    this.nodeDeleted = DeleteMethodRefContent.deleteMethodRefContent(methodRef, field, originalField);
  }

  @Override
  public void accept(MethodRefParameter methodRefParameter) {
    this.nodeDeleted = DeleteMethodRefParameterContent.deleteMethodRefParameterContent(methodRefParameter, field, originalField);
  }

  @Override
  public void accept(Model model) {
    this.nodeDeleted = DeleteModelContent.deleteModelContent(model, field, originalField);
  }

  @Override
  public void accept(Modifier modifier) {
    this.nodeDeleted = DeleteModifierContent.deleteModifierContent(modifier, field, originalField);
  }

  @Override
  public void accept(NamedElement namedElement) {
    this.nodeDeleted = DeleteNamedElementContent.deleteNamedElementContent(namedElement, field, originalField);
  }

  @Override
  public void accept(NamespaceAccess namespaceAccess) {
    this.nodeDeleted = DeleteNamespaceAccessContent.deleteNamespaceAccessContent(namespaceAccess, field, originalField);
  }

  @Override
  public void accept(NumberLiteral numberLiteral) {
    this.nodeDeleted = DeleteNumberLiteralContent.deleteNumberLiteralContent(numberLiteral, field, originalField);
  }

  @Override
  public void accept(NullLiteral nullLiteral) {
    this.nodeDeleted = DeleteNullLiteralContent.deleteNullLiteralContent(nullLiteral, field, originalField);
  }

  @Override
  public void accept(Package package) {
    this.nodeDeleted = DeletePackageContent.deletePackageContent(package, field, originalField);
  }

  @Override
  public void accept(PackageAccess packageAccess) {
    this.nodeDeleted = DeletePackageAccessContent.deletePackageAccessContent(packageAccess, field, originalField);
  }

  @Override
  public void accept(ParameterizedType parameterizedType) {
    this.nodeDeleted = DeleteParameterizedTypeContent.deleteParameterizedTypeContent(parameterizedType, field, originalField);
  }

  @Override
  public void accept(ParenthesizedExpression parenthesizedExpression) {
    this.nodeDeleted = DeleteParenthesizedExpressionContent.deleteParenthesizedExpressionContent(parenthesizedExpression, field, originalField);
  }

  @Override
  public void accept(PostfixExpression postfixExpression) {
    this.nodeDeleted = DeletePostfixExpressionContent.deletePostfixExpressionContent(postfixExpression, field, originalField);
  }

  @Override
  public void accept(PostfixExpressionKind postfixExpressionKind) {
    this.nodeDeleted = DeletePostfixExpressionKindContent.deletePostfixExpressionKindContent(postfixExpressionKind, field, originalField);
  }

  @Override
  public void accept(PrefixExpression prefixExpression) {
    this.nodeDeleted = DeletePrefixExpressionContent.deletePrefixExpressionContent(prefixExpression, field, originalField);
  }

  @Override
  public void accept(PrefixExpressionKind prefixExpressionKind) {
    this.nodeDeleted = DeletePrefixExpressionKindContent.deletePrefixExpressionKindContent(prefixExpressionKind, field, originalField);
  }

  @Override
  public void accept(PrimitiveType primitiveType) {
    this.nodeDeleted = DeletePrimitiveTypeContent.deletePrimitiveTypeContent(primitiveType, field, originalField);
  }

  @Override
  public void accept(PrimitiveTypeBoolean primitiveTypeBoolean) {
    this.nodeDeleted = DeletePrimitiveTypeBooleanContent.deletePrimitiveTypeBooleanContent(primitiveTypeBoolean, field, originalField);
  }

  @Override
  public void accept(PrimitiveTypeByte primitiveTypeByte) {
    this.nodeDeleted = DeletePrimitiveTypeByteContent.deletePrimitiveTypeByteContent(primitiveTypeByte, field, originalField);
  }

  @Override
  public void accept(PrimitiveTypeChar primitiveTypeChar) {
    this.nodeDeleted = DeletePrimitiveTypeCharContent.deletePrimitiveTypeCharContent(primitiveTypeChar, field, originalField);
  }

  @Override
  public void accept(PrimitiveTypeDouble primitiveTypeDouble) {
    this.nodeDeleted = DeletePrimitiveTypeDoubleContent.deletePrimitiveTypeDoubleContent(primitiveTypeDouble, field, originalField);
  }

  @Override
  public void accept(PrimitiveTypeShort primitiveTypeShort) {
    this.nodeDeleted = DeletePrimitiveTypeShortContent.deletePrimitiveTypeShortContent(primitiveTypeShort, field, originalField);
  }

  @Override
  public void accept(PrimitiveTypeFloat primitiveTypeFloat) {
    this.nodeDeleted = DeletePrimitiveTypeFloatContent.deletePrimitiveTypeFloatContent(primitiveTypeFloat, field, originalField);
  }

  @Override
  public void accept(PrimitiveTypeInt primitiveTypeInt) {
    this.nodeDeleted = DeletePrimitiveTypeIntContent.deletePrimitiveTypeIntContent(primitiveTypeInt, field, originalField);
  }

  @Override
  public void accept(PrimitiveTypeLong primitiveTypeLong) {
    this.nodeDeleted = DeletePrimitiveTypeLongContent.deletePrimitiveTypeLongContent(primitiveTypeLong, field, originalField);
  }

  @Override
  public void accept(PrimitiveTypeVoid primitiveTypeVoid) {
    this.nodeDeleted = DeletePrimitiveTypeVoidContent.deletePrimitiveTypeVoidContent(primitiveTypeVoid, field, originalField);
  }

  @Override
  public void accept(ReturnStatement returnStatement) {
    this.nodeDeleted = DeleteReturnStatementContent.deleteReturnStatementContent(returnStatement, field, originalField);
  }

  @Override
  public void accept(SingleVariableAccess singleVariableAccess) {
    this.nodeDeleted = DeleteSingleVariableAccessContent.deleteSingleVariableAccessContent(singleVariableAccess, field, originalField);
  }

  @Override
  public void accept(SingleVariableDeclaration singleVariableDeclaration) {
    this.nodeDeleted = DeleteSingleVariableDeclarationContent.deleteSingleVariableDeclarationContent(singleVariableDeclaration, field, originalField);
  }

  @Override
  public void accept(Statement statement) {
    this.nodeDeleted = DeleteStatementContent.deleteStatementContent(statement, field, originalField);
  }

  @Override
  public void accept(StringLiteral stringLiteral) {
    this.nodeDeleted = DeleteStringLiteralContent.deleteStringLiteralContent(stringLiteral, field, originalField);
  }

  @Override
  public void accept(SuperConstructorInvocation superConstructorInvocation) {
    this.nodeDeleted = DeleteSuperConstructorInvocationContent.deleteSuperConstructorInvocationContent(superConstructorInvocation, field, originalField);
  }

  @Override
  public void accept(SuperFieldAccess superFieldAccess) {
    this.nodeDeleted = DeleteSuperFieldAccessContent.deleteSuperFieldAccessContent(superFieldAccess, field, originalField);
  }

  @Override
  public void accept(SuperMethodInvocation superMethodInvocation) {
    this.nodeDeleted = DeleteSuperMethodInvocationContent.deleteSuperMethodInvocationContent(superMethodInvocation, field, originalField);
  }

  @Override
  public void accept(SwitchCase switchCase) {
    this.nodeDeleted = DeleteSwitchCaseContent.deleteSwitchCaseContent(switchCase, field, originalField);
  }

  @Override
  public void accept(SwitchStatement switchStatement) {
    this.nodeDeleted = DeleteSwitchStatementContent.deleteSwitchStatementContent(switchStatement, field, originalField);
  }

  @Override
  public void accept(SynchronizedStatement synchronizedStatement) {
    this.nodeDeleted = DeleteSynchronizedStatementContent.deleteSynchronizedStatementContent(synchronizedStatement, field, originalField);
  }

  @Override
  public void accept(TagElement tagElement) {
    this.nodeDeleted = DeleteTagElementContent.deleteTagElementContent(tagElement, field, originalField);
  }

  @Override
  public void accept(TextElement textElement) {
    this.nodeDeleted = DeleteTextElementContent.deleteTextElementContent(textElement, field, originalField);
  }

  @Override
  public void accept(ThisExpression thisExpression) {
    this.nodeDeleted = DeleteThisExpressionContent.deleteThisExpressionContent(thisExpression, field, originalField);
  }

  @Override
  public void accept(ThrowStatement throwStatement) {
    this.nodeDeleted = DeleteThrowStatementContent.deleteThrowStatementContent(throwStatement, field, originalField);
  }

  @Override
  public void accept(TryStatement tryStatement) {
    this.nodeDeleted = DeleteTryStatementContent.deleteTryStatementContent(tryStatement, field, originalField);
  }

  @Override
  public void accept(Type type) {
    this.nodeDeleted = DeleteTypeContent.deleteTypeContent(type, field, originalField);
  }

  @Override
  public void accept(TypeAccess typeAccess) {
    this.nodeDeleted = DeleteTypeAccessContent.deleteTypeAccessContent(typeAccess, field, originalField);
  }

  @Override
  public void accept(TypeDeclaration typeDeclaration) {
    this.nodeDeleted = DeleteTypeDeclarationContent.deleteTypeDeclarationContent(typeDeclaration, field, originalField);
  }

  @Override
  public void accept(TypeDeclarationStatement typeDeclarationStatement) {
    this.nodeDeleted = DeleteTypeDeclarationStatementContent.deleteTypeDeclarationStatementContent(typeDeclarationStatement, field, originalField);
  }

  @Override
  public void accept(TypeLiteral typeLiteral) {
    this.nodeDeleted = DeleteTypeLiteralContent.deleteTypeLiteralContent(typeLiteral, field, originalField);
  }

  @Override
  public void accept(TypeParameter typeParameter) {
    this.nodeDeleted = DeleteTypeParameterContent.deleteTypeParameterContent(typeParameter, field, originalField);
  }

  @Override
  public void accept(UnresolvedItem unresolvedItem) {
    this.nodeDeleted = DeleteUnresolvedItemContent.deleteUnresolvedItemContent(unresolvedItem, field, originalField);
  }

  @Override
  public void accept(UnresolvedItemAccess unresolvedItemAccess) {
    this.nodeDeleted = DeleteUnresolvedItemAccessContent.deleteUnresolvedItemAccessContent(unresolvedItemAccess, field, originalField);
  }

  @Override
  public void accept(UnresolvedAnnotationDeclaration unresolvedAnnotationDeclaration) {
    this.nodeDeleted = DeleteUnresolvedAnnotationDeclarationContent.deleteUnresolvedAnnotationDeclarationContent(unresolvedAnnotationDeclaration, field, originalField);
  }

  @Override
  public void accept(UnresolvedAnnotationTypeMemberDeclaration unresolvedAnnotationTypeMemberDeclaration) {
    this.nodeDeleted = DeleteUnresolvedAnnotationTypeMemberDeclarationContent.deleteUnresolvedAnnotationTypeMemberDeclarationContent(unresolvedAnnotationTypeMemberDeclaration, field, originalField);
  }

  @Override
  public void accept(UnresolvedClassDeclaration unresolvedClassDeclaration) {
    this.nodeDeleted = DeleteUnresolvedClassDeclarationContent.deleteUnresolvedClassDeclarationContent(unresolvedClassDeclaration, field, originalField);
  }

  @Override
  public void accept(UnresolvedEnumDeclaration unresolvedEnumDeclaration) {
    this.nodeDeleted = DeleteUnresolvedEnumDeclarationContent.deleteUnresolvedEnumDeclarationContent(unresolvedEnumDeclaration, field, originalField);
  }

  @Override
  public void accept(UnresolvedInterfaceDeclaration unresolvedInterfaceDeclaration) {
    this.nodeDeleted = DeleteUnresolvedInterfaceDeclarationContent.deleteUnresolvedInterfaceDeclarationContent(unresolvedInterfaceDeclaration, field, originalField);
  }

  @Override
  public void accept(UnresolvedLabeledStatement unresolvedLabeledStatement) {
    this.nodeDeleted = DeleteUnresolvedLabeledStatementContent.deleteUnresolvedLabeledStatementContent(unresolvedLabeledStatement, field, originalField);
  }

  @Override
  public void accept(UnresolvedMethodDeclaration unresolvedMethodDeclaration) {
    this.nodeDeleted = DeleteUnresolvedMethodDeclarationContent.deleteUnresolvedMethodDeclarationContent(unresolvedMethodDeclaration, field, originalField);
  }

  @Override
  public void accept(UnresolvedSingleVariableDeclaration unresolvedSingleVariableDeclaration) {
    this.nodeDeleted = DeleteUnresolvedSingleVariableDeclarationContent.deleteUnresolvedSingleVariableDeclarationContent(unresolvedSingleVariableDeclaration, field, originalField);
  }

  @Override
  public void accept(UnresolvedType unresolvedType) {
    this.nodeDeleted = DeleteUnresolvedTypeContent.deleteUnresolvedTypeContent(unresolvedType, field, originalField);
  }

  @Override
  public void accept(UnresolvedTypeDeclaration unresolvedTypeDeclaration) {
    this.nodeDeleted = DeleteUnresolvedTypeDeclarationContent.deleteUnresolvedTypeDeclarationContent(unresolvedTypeDeclaration, field, originalField);
  }

  @Override
  public void accept(UnresolvedVariableDeclarationFragment unresolvedVariableDeclarationFragment) {
    this.nodeDeleted = DeleteUnresolvedVariableDeclarationFragmentContent.deleteUnresolvedVariableDeclarationFragmentContent(unresolvedVariableDeclarationFragment, field, originalField);
  }

  @Override
  public void accept(VariableDeclaration variableDeclaration) {
    this.nodeDeleted = DeleteVariableDeclarationContent.deleteVariableDeclarationContent(variableDeclaration, field, originalField);
  }

  @Override
  public void accept(VariableDeclarationExpression variableDeclarationExpression) {
    this.nodeDeleted = DeleteVariableDeclarationExpressionContent.deleteVariableDeclarationExpressionContent(variableDeclarationExpression, field, originalField);
  }

  @Override
  public void accept(VariableDeclarationFragment variableDeclarationFragment) {
    this.nodeDeleted = DeleteVariableDeclarationFragmentContent.deleteVariableDeclarationFragmentContent(variableDeclarationFragment, field, originalField);
  }

  @Override
  public void accept(VariableDeclarationStatement variableDeclarationStatement) {
    this.nodeDeleted = DeleteVariableDeclarationStatementContent.deleteVariableDeclarationStatementContent(variableDeclarationStatement, field, originalField);
  }

  @Override
  public void accept(VisibilityKind visibilityKind) {
    this.nodeDeleted = DeleteVisibilityKindContent.deleteVisibilityKindContent(visibilityKind, field, originalField);
  }

  @Override
  public void accept(WildCardType wildCardType) {
    this.nodeDeleted = DeleteWildCardTypeContent.deleteWildCardTypeContent(wildCardType, field, originalField);
  }

  @Override
  public void accept(WhileStatement whileStatement) {
    this.nodeDeleted = DeleteWhileStatementContent.deleteWhileStatementContent(whileStatement, field, originalField);
  }
}
