package ccslFaultTypeDescriptionExecutor.facade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

import ccslFaultTypeDescriptionExecutor.FaultTypeDescriptionExecutor;
import ccslFaultTypeDescriptionExecutor.FaultTypeDescriptionResult;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.FaultTypeDescription;
import ccslFaultTypeDescriptionExecutor.javaCompiler.StringToJavaCompilationException;
import ccslFaultTypeDescriptionExecutor.xmiReader.XMIReader;
import ccslFaultTypeDescriptionExecutor.xmlReader.FaultTypeDescriptionXMLNode;
import ccslFaultTypeDescriptionExecutor.xmlReader.FaultTypeDescriptionXMLReader;
import ccslFultTypeDescriptionExecutor.xmlNodeParser.FaultTypeDescriptionNodeParser;

public class FaultTypeDescriptionExecutorFacade {

	private static final FaultTypeDescriptionExecutorFacade INSTANCE = new FaultTypeDescriptionExecutorFacade();
	private boolean componentesInitialized = false;

	public static FaultTypeDescriptionExecutorFacade getInstance() {
		return INSTANCE;
	}
	
	private void initEssentialComponents() {
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);
		EssentialOCLStandaloneSetup.doSetup();
		componentesInitialized = true;
	}

	public FaultTypeDescriptionResult executeFaultTypeDescription(String faultTypeDescriptionPath,
			String xmiProjectPath) throws StringToJavaCompilationException, FileNotFoundException, IOException {
		if (!componentesInitialized) {
			initEssentialComponents();
		}
		File f = new File(faultTypeDescriptionPath);
		//Get fault type description xml node
		FaultTypeDescriptionXMLNode faultTypeDescriptionXMLNode = FaultTypeDescriptionXMLReader.getInstance()
				.readFaultTypeDescriptionFromXML(faultTypeDescriptionPath);
		
		//Parse fault type description xml node to the fault type description entity
		FaultTypeDescription faultTypeDescription = FaultTypeDescriptionNodeParser.getInstance().xmlNodeToFaultTypeDescription(faultTypeDescriptionXMLNode, f.getParent());
		
		//Get Modisco project model from XMI file
		Model modiscoModel = XMIReader.getInstance().getModelFromXMIFile(xmiProjectPath);
		
		//Execute fault type description in modisco model
		return FaultTypeDescriptionExecutor.getInstance().executeFaultTypeDescription(faultTypeDescription, modiscoModel);
	}
	
	
}
