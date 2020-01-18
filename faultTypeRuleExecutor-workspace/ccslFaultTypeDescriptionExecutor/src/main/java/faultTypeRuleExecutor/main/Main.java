package faultTypeRuleExecutor.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

import ccslFaultTypeDescriptionExecutor.FaultTypeDescriptionRunMetrics;
import ccslFaultTypeDescriptionExecutor.facade.FaultTypeDescriptionExecutorFacade;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.FaultTypeDescription;
import ccslFaultTypeDescriptionExecutor.javaCompiler.StringToJavaCompilationException;
import ccslFaultTypeDescriptionExecutor.xmiReader.XMIReader;
import ccslFaultTypeDescriptionExecutor.xmlReader.FaultTypeDescriptionXMLNode;
import ccslFaultTypeDescriptionExecutor.xmlReader.FaultTypeDescriptionXMLReader;
import ccslFultTypeDescriptionExecutor.xmlNodeParser.FaultTypeDescriptionNodeParser;

public final class Main {

	private static final String GDX_PROJECT = "file:///D:\\git-repositories\\FaultType-FeasibilityStudy\\gdx\\gdx-ai-1.8.2\\gdx-ai-1.8.2_java.xmi";
	private static final String MALMO_PROJECT = "file:///D:\\git-repositories\\FaultType-FeasibilityStudy\\malmo\\malmo-0.37.0\\malmo-0.37.0_java.xmi";
	private static final String TINK_PROJECT = "file:///D:\\git-repositories\\FaultType-FeasibilityStudy\\tink\\tink-1.3.0-rc3\\tink-1.3.0-rc3_java.xmi";
	
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

	private static FaultTypeDescriptionRunMetrics runFaultTypeDescription(String projectPath,
			String faultTypeDescriptionPath, String saveDir) {
		FaultTypeDescriptionRunMetrics metrics = null;
		try {
			metrics = FaultTypeDescriptionExecutorFacade.getInstance()
					.executeFaultTypeDescription(faultTypeDescriptionPath, projectPath, saveDir);
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
		return metrics;
	}

	public static void main2(String[] args) {
		String projectPath = TINK_PROJECT;
		String saveDir = "./tink-gen-Modisco";
		// Get Modisco project model from XMI file
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);
		Model modiscoModel = XMIReader.getInstance().getModelFromXMIFile(projectPath);
		try {
			GenerateJavaExtended javaGenerator = new GenerateJavaExtended(modiscoModel,
					new File(saveDir), new ArrayList<Object>());
			javaGenerator.doGenerate(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public static void main(String[] args) {
		String projectPath = TINK_PROJECT;
		String faultTypes[] = { //MISSING_FUNCTION_CALL, 
				//MISSING_VARIABLE_INITIALIZATION_USING_A_VALUE,
				//MISSING_VARIABLE_ASSIGNMENT_USING_A_VALUE, 
				//MISSING_VARIABLE_ASSIGNMENT_USING_AN_EXPRESSION,
				//MISSING_IF_CONSTRUCT_AROUND_STATEMENTS, 
				//MISSING_IF_CONSTRUCT_PLUS_STATEMENTS,
				//MISSING_IF_CONSTRUCT_PLUS_STATEMENTS_PLUS_ELSE_BEFORE_STATEMENTS,
				//MISSING_AND_EXPRESSION_USED_AS_BRANCH_CONDITION,
				//MISSING_OR_EXPRESSION_USED_AS_BRANCH_CONDITION,
				//WRONG_VALUE_ASSIGNED_TO_VARIABLE,
				//WRONG_ARITHMETIC_EXPRESSION_PARAMETER_OF_A_FUNCTION_CALL,
				//MISSING_SMALL_AND_LOCALIZED_PART_OF_THE_ALGORITHM,
				WRONG_VARIABLE_USED_IN_PARAMETER_OF_FUNCTION_CALL
		};
		String testPath = "file:///D:\\git-repositories\\Coding-Conventions-Specification-Language\\faultTypeRuleExecutor-workspace\\sampleProject\\sampleProject_java.xmi";
		for(String faultType: faultTypes) {
			System.out.println("Running: " + faultType);
			String saveDir = "./tink-gen-" + faultType;
			String faultTypePath = FAULT_TYPE_BASE_PATH + faultType + "-gen\\" + faultType + ".xml";
			FaultTypeDescriptionRunMetrics metrics = runFaultTypeDescription(projectPath, faultTypePath, saveDir);
			if (metrics != null) {
				System.out.println("[");
				System.out.println("  Fault: " + faultType);
				System.out.println("  Query time: " + metrics.getQueryTime());
				System.out.println("  Total elements selected by query: " + metrics.getTotalElementsSelectedByQuery());
				System.out.println("  Injection time: " + metrics.getInjectionTime());
				System.out.println("  Total elements modified by injection: " + metrics.getTotalElementsModified());
				System.out.println("  Regeneration project time: " + metrics.getRegenerateProjectTime());
				System.out.println("]");
			}	
		}
	}
}
