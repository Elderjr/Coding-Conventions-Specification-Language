package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import faultType.FaultTypeDescription;
import faultType.FaultTypeDescriptionParserException;
import faultType.FaultTypeExecutor;
import faultType.FaultTypeLoader;

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
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);
		EssentialOCLStandaloneSetup.doSetup();
		try {
			FaultTypeDescription faultTypeDescription = FaultTypeLoader.getInstance().loadFaultTypeDescription(
					"file:///D:\\git-repositories\\Coding-Conventions-Specification-Language\\ccsl-workspace\\org.ccsl.metamodel.examples\\FaultInjector\\MissMethodInvocation.xml");
			Model modiscoModel = FaultTypeExecutor.getInstance().executeFaultType(faultTypeDescription,
					"file:///D:\\documentos\\sampleProject_java.xmi");
			GenerateJavaExtended javaGenerator = new GenerateJavaExtended(modiscoModel, new File("./"),
					new ArrayList<Object>());
			javaGenerator.doGenerate(null);
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
		}
	}
}
