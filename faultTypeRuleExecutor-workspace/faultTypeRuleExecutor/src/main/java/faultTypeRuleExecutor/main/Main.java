package faultTypeRuleExecutor.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import faultTypeRuleExecutor.faultType.FaultTypeDescription;
import faultTypeRuleExecutor.faultType.FaultTypeDescriptionParserException;
import faultTypeRuleExecutor.faultType.FaultTypeExecutor;
import faultTypeRuleExecutor.faultType.FaultTypeLoader;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.xml.sax.SAXException;

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
		System.out.println("Registering MoDisco...");
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);
		System.out.println("Registering MoDisco... OK");
		System.out.println("Initializing OCL standalone lib...");
		EssentialOCLStandaloneSetup.doSetup();
		System.out.println("Initializing OCL standalone lib... OK");
		try {
			System.out.println("Reading fault type formalization from XML...");
			String faultType = MISSING_OR_EXPRESSION_USED_AS_BRANCH_CONDITION;
			String faultTypeXmlPath = FAULT_TYPE_BASE_PATH + faultType + "\\" + faultType + ".xml";
			FaultTypeDescription faultTypeDescription = FaultTypeLoader.getInstance()
					.loadFaultTypeDescriptionNEW(faultTypeXmlPath);
			System.out.println("Reading fault type formalization from XML... OK");
			String testPath = "file:///D:\\git-repositories\\Coding-Conventions-Specification-Language\\faultTypeRuleExecutor-workspace\\sampleProject\\sampleProject_java.xmi";
			String realPath = "file:///D:\\git-repositories\\FaultType-FeasibilityStudy\\gdx-ai-1.8.2\\gdx-ai-1.8.2-original\\gdx-ai-1.8.2_java.xmi";
			Model modiscoModel = FaultTypeExecutor.getInstance().executeFaultType(faultTypeDescription, realPath);
			System.out.println("Regenerating java code...");
			GenerateJavaExtended javaGenerator = new GenerateJavaExtended(modiscoModel,
					new File("./" + modiscoModel.getName() + "-gen-" + faultType), new ArrayList<Object>());
			javaGenerator.doGenerate(null);
			System.out.println("Regenerating java code... OK");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FaultTypeDescriptionParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
