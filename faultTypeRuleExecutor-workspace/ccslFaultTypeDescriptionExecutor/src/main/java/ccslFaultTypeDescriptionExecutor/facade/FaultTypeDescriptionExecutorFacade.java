package ccslFaultTypeDescriptionExecutor.facade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

import ccslFaultTypeDescriptionExecutor.FaultTypeDescriptionExecutor;
import ccslFaultTypeDescriptionExecutor.FaultTypeDescriptionRunMetrics;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.FaultTypeDescription;
import ccslFaultTypeDescriptionExecutor.javaCompiler.StringToJavaCompilationException;
import ccslFaultTypeDescriptionExecutor.xmiReader.XMIReader;
import ccslFaultTypeDescriptionExecutor.xmlNodeParser.FaultTypeDescriptionNodeParser;
import ccslFaultTypeDescriptionExecutor.xmlReader.FaultTypeDescriptionXMLNode;
import ccslFaultTypeDescriptionExecutor.xmlReader.FaultTypeDescriptionXMLReader;

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

	public FaultTypeDescriptionRunMetrics executeFaultTypeDescription(String faultTypeDescriptionPath,
			String xmiProjectPath, String saveDir)
			throws StringToJavaCompilationException, FileNotFoundException, IOException {
		if (!componentesInitialized) {
			initEssentialComponents();
		}
		File f = new File(faultTypeDescriptionPath);
		// Get fault type description xml node
		FaultTypeDescriptionXMLNode faultTypeDescriptionXMLNode = FaultTypeDescriptionXMLReader.getInstance()
				.readFaultTypeDescriptionFromXML(faultTypeDescriptionPath);

		// Parse fault type description xml node to the fault type description entity
		FaultTypeDescription faultTypeDescription = FaultTypeDescriptionNodeParser.getInstance()
				.xmlNodeToFaultTypeDescription(faultTypeDescriptionXMLNode, f.getParent());

		// Get Modisco project model from XMI file
		Model modiscoModel = XMIReader.getInstance().getModelFromXMIFile(xmiProjectPath);

		// Execute fault type description in modisco model
		FaultTypeDescriptionRunMetrics metrics = FaultTypeDescriptionExecutor.getInstance()
				.executeFaultTypeDescription(faultTypeDescription, modiscoModel);
		//FaultTypeDescriptionRunMetrics metrics = new FaultTypeDescriptionRunMetrics();
		//Regenerate project
		long regenerateProjectTime = System.currentTimeMillis();
		GenerateJavaExtended javaGenerator = new GenerateJavaExtended(modiscoModel,
				new File(saveDir), new ArrayList<Object>());
		javaGenerator.doGenerate(null);
		regenerateProjectTime = System.currentTimeMillis() - regenerateProjectTime;
		metrics.setRegenerateProjectTime(regenerateProjectTime);
		
		return metrics;
	}

}
