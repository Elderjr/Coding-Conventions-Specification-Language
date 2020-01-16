package faultTypeRuleExecutor.main;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;

import ccslFaultTypeDescriptionExecutor.FaultTypeDescriptionResult;
import ccslFaultTypeDescriptionExecutor.facade.FaultTypeDescriptionExecutorFacade;
import ccslFaultTypeDescriptionExecutor.javaCompiler.StringToJavaCompilationException;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoJavaToWrapper;

public final class Main {

	private static final String FAULT_TYPE_BASE_PATH = "D:\\git-repositories\\Coding-Conventions-Specification-Language\\ccsl-workspace\\org.ccsl.metamodel.examples\\FaultInjector\\";
	private static final String MISSING_FUNCTION_CALL = "MissingFunctionCall";
	private static final String MISSING_VARIABLE_INITIALIZATION_USING_A_VALUE = "MissingVariableInitializationUsingAValue";
	private static final String MISSING_VARIABLE_ASSIGNMENT_USING_A_VALUE = "MissingVariableAssignmentUsingAValue";
	private static final String MISSING_VARIABLE_ASSIGNMENT_USING_AN_EXPRESSION = "MissingVariableAssignmentUsingAnExpression";
	private static final String MISSING_IF_CONSTRUCT_AROUND_STATEMENTS = "MissingIfConstructAroundStatements";
	private static final String MISSING_IF_CONSTRUCT_PLUS_STATEMENTS = "MissingIfConstructPlusStatements";
	private static final String MISSING_IF_CONSTRUCT_PLUS_STATEMENTS_PLUS_ELSE_BEFORE_STATEMENTS = "MissingIfConstructPlusStatementsPlusElseBeforeStatements";
	private static final String MISSING_AND_EXPRESSION_USED_AS_BRANCH_CONDITION = "MissingANDExpressionUsedAsBranchCondition";
	private static final String MISSING_OR_EXPRESSION_USED_AS_BRANCH_CONDITION = "MissingORExpressionUsedAsBranchCondition";
	private static final String WRONG_VALUE_ASSIGNED_TO_VARIABLE = "WrongValueAssignedToVariable";
	private static final String WRONG_ARITHMETIC_EXPRESSION_PARAMETER_OF_A_FUNCTION_CALL = "WrongArithmeticExpressionInParameterOfAFunctionCall";
	private static final String MISSING_SMALL_AND_LOCALIZED_PART_OF_THE_ALGORITHM = "MissingSmallAndLocalizedPartOfTheAlgorithm";
	private static final String WRONG_VARIABLE_USED_IN_PARAMETER_OF_FUNCTION_CALL = "WrongVariableUsedInParameterOfFunctionCall";
	
	private Main() {

	}

	public static void main(String[] args) {
		String faultType = MISSING_VARIABLE_ASSIGNMENT_USING_AN_EXPRESSION;
		String faultTypeXmlPath = FAULT_TYPE_BASE_PATH + faultType + "-gen\\" + faultType + ".xml";
		String testPath = "file:///D:\\git-repositories\\Coding-Conventions-Specification-Language\\faultTypeRuleExecutor-workspace\\sampleProject\\sampleProject_java.xmi";
		String realPath = "file:///D:\\git-repositories\\FaultType-FeasibilityStudy\\gdx-ai-1.8.2\\gdx-ai-1.8.2-original\\gdx-ai-1.8.2_java.xmi";
		try {
			FaultTypeDescriptionResult result = FaultTypeDescriptionExecutorFacade.getInstance().executeFaultTypeDescription(faultTypeXmlPath, realPath);
			System.out.println("Performance: " + result.getPerformance());
			System.out.println("Elements selected: " + result.getTotalElementsSelectedByStrategy());
			System.out.println("Elements modified: " + result.getTotalElementsModified());
			System.out.println("Regenerating project...");
			long regeneratingProjectTime = System.currentTimeMillis();
			GenerateJavaExtended javaGenerator = new GenerateJavaExtended(result.getModifiedModiscoModel(),
					new File("./" + result.getModifiedModiscoModel().getName() + "-gen-" + faultType), new ArrayList<Object>());
			javaGenerator.doGenerate(null);
			regeneratingProjectTime = System.currentTimeMillis() - regeneratingProjectTime;
			System.out.println("Regenerating project time: " + regeneratingProjectTime);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StringToJavaCompilationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
