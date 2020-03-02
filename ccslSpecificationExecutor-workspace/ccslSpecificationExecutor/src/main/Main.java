package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.util.EcoreUtil.ProxyCrossReferencer;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;
import org.eclipse.modisco.kdm.source.extension.CodeUnit2File;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.Query;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.gmt.modisco.java.Package;
import ccslSpecification.CcslSpecificationRunner;
import fileUtils.FileUtils;
import ocl.OclQuery;

public class Main {

	
	private static void runCCSLSpecificationInWebGoat(String oclQuery) throws ParserException {
		String modiscoXmi[] = {
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\auth-bypass\\auth-bypass_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\bypass-restrictions\\bypass-restrictions_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\challenge\\challenge_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\chrome-dev-tools\\chrome-dev-tools_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\cia\\cia_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\client-side-filtering\\client-side-filtering_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\cross-site-scripting\\cross-site-scripting_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\crypto\\crypto_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\csrf\\csrf_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\html-tampering\\html-tampering_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\http-basics\\http-basics_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\http-proxies\\http-proxies_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\idor\\idor_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\insecure-deserialization\\insecure-deserialization_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\insecure-login\\insecure-login_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\jwt\\jwt_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\missing-function-ac\\missing-function-ac_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\password-reset\\password-reset_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\secure-passwords\\secure-passwords_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\sql-injection\\sql-injection_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\ssrf\\ssrf_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\vulnerable-components\\vulnerable-components_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-container\\webgoat-container_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-integration-tests\\webgoat-integration-tests_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\webgoat-introduction\\webgoat-introduction_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\webgoat-lesson-template\\webgoat-lesson-template_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-server\\webgoat-server_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webwolf\\webwolf_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\webwolf-introduction\\webwolf-introduction_java.xmi", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\xxe\\xxe_java.xmi"
		};
		
		String kdmFragmentsFolder[] = {
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\auth-bypass\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\bypass-restrictions\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\challenge\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\chrome-dev-tools\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\cia\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\client-side-filtering\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\cross-site-scripting\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\crypto\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\csrf\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\html-tampering\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\http-basics\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\http-proxies\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\idor\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\insecure-deserialization\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\insecure-login\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\jwt\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\missing-function-ac\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\password-reset\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\secure-passwords\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\sql-injection\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\ssrf\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\vulnerable-components\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-container\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-integration-tests\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\webgoat-introduction\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\webgoat-lesson-template\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-server\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webwolf\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\webwolf-introduction\\java2kdmFragments", 
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\WebGoat-develop\\webgoat-lessons\\xxe\\java2kdmFragments"
		};
		CcslSpecificationRunner.getInstance().runCCSLSpecification(modiscoXmi, kdmFragmentsFolder, oclQuery);
	}
	
	private static void runCCSLSpecificationInTeaStore(String oclQuery) throws ParserException {
		String modiscoXmi[] = {
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.auth\\tools.descartes.teastore.auth_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\utilities\\tools.descartes.teastore.dockermemoryconfigurator\\tools.descartes.teastore.dockermemoryconfigurator_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\interfaces\\tools.descartes.teastore.entities\\tools.descartes.teastore.entities_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.image\\tools.descartes.teastore.image_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\utilities\\tools.descartes.teastore.kieker.probes\\tools.descartes.teastore.kieker.probes_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\utilities\\tools.descartes.teastore.kieker.rabbitmq\\tools.descartes.teastore.kieker.rabbitmq_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.persistence\\tools.descartes.teastore.persistence_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.recommender\\tools.descartes.teastore.recommender_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.registry\\tools.descartes.teastore.registry_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\utilities\\tools.descartes.teastore.registryclient\\tools.descartes.teastore.registryclient_java.xmi",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.webui\\tools.descartes.teastore.webui_java.xmi"

		};
		String kdmFragmentsFolder[] = {
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.auth\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\utilities\\tools.descartes.teastore.dockermemoryconfigurator\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\interfaces\\tools.descartes.teastore.entities\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.image\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\utilities\\tools.descartes.teastore.kieker.probes\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\utilities\\tools.descartes.teastore.kieker.rabbitmq\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.persistence\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.recommender\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.registry\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\utilities\\tools.descartes.teastore.registryclient\\java2kdmFragments",
				"D:\\git-repositories\\pmd-vs-ccsl-workspace\\TeaStore-master\\services\\tools.descartes.teastore.webui\\java2kdmFragments"
		};
		CcslSpecificationRunner.getInstance().runCCSLSpecification(modiscoXmi, kdmFragmentsFolder, oclQuery);
	}

	private static void runCCSLSpecificationInSampleProject(String oclQuery) throws ParserException {
		String modiscoXmi[] = {"D:\\git-repositories\\Coding-Conventions-Specification-Language\\ccslSpecificationExecutor-workspace\\SampleProject\\SampleProject_java.xmi"};
		String kdmFragmentsFolder[] = {"D:\\git-repositories\\Coding-Conventions-Specification-Language\\ccslSpecificationExecutor-workspace\\SampleProject\\java2kdmFragments"};
		CcslSpecificationRunner.getInstance().runCCSLSpecification(modiscoXmi, kdmFragmentsFolder, oclQuery);
	}
	
	public static void main(String[] args) throws ParserException, IOException {
		String oclQuery = FileUtils.fileToString("D:\\git-repositories\\pmd-vs-ccsl-workspace\\ocls\\pmd\\performance\\AvoidInstantiatingObjectsInLoops.ocl");
		runCCSLSpecificationInTeaStore(oclQuery);
		//runCCSLSpecificationInWebGoat(oclQuery);
		//runCCSLSpecificationInSampleProject(oclQuery);
	}
}
