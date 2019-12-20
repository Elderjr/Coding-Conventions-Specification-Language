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
			FaultTypeDescription faultTypeDescription = FaultTypeLoader.getInstance().loadFaultTypeDescriptionNEW(
					"D:\\git-repositories\\Coding-Conventions-Specification-Language\\ccsl-workspace\\org.ccsl.metamodel.examples\\FaultInjector\\WrongArithmeticExpressionInParameterOfAFunctionCall\\WrongArithmeticExpressionInParameterOfAFunctionCall.xml");
			System.out.println("Reading fault type formalization from XML... OK");
			Model modiscoModel = FaultTypeExecutor.getInstance().executeFaultType(faultTypeDescription,
					"file:///D:\\git-repositories\\Coding-Conventions-Specification-Language\\faultTypeRuleExecutor-workspace\\sampleProject\\sampleProject_java.xmi");
			System.out.println("Regenerating java code...");
			GenerateJavaExtended javaGenerator = new GenerateJavaExtended(modiscoModel, new File("./"),
					new ArrayList<Object>());
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
