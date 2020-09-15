package org.ccsl.checker.modisco;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModelFromJavaProject;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;

public class ModiscoJavaModelDiscover {

	private static ModiscoJavaModelDiscover INSTANCE = new ModiscoJavaModelDiscover();
	private static DiscoverKDMSourceAndJavaModelFromJavaProject DISCOVER = new DiscoverKDMSourceAndJavaModelFromJavaProject();
	
	private Map<IJavaProject, ModiscoJavaModel> discoverProjects;
	
	private ModiscoJavaModelDiscover() {
		this.discoverProjects = new HashMap<>();
	}
	
	public static ModiscoJavaModelDiscover getInstance() {
		return INSTANCE;
	}
	
	public boolean isApplicable(IJavaProject javaProject) {
		return DISCOVER.isApplicableTo(javaProject);
	}
	
	public ModiscoJavaModel discoverProject(IJavaProject javaProject) throws DiscoveryException {
		if(discoverProjects.containsKey(javaProject)) {
			return discoverProjects.get(javaProject);
		}
		DISCOVER.discoverElement(javaProject, new NullProgressMonitor());
		Map<CompilationUnit, List<ASTNodeSourceRegion>> linesExtraInfo = new HashMap<>();
		for(Object obj: DISCOVER.getJavaAppModelResource().getContents()) {
			if(obj instanceof JavaApplication) {
				JavaApplication javaApp = (JavaApplication) obj;
				for(Java2Directory java2Dir: javaApp.getJava2DirectoryChildren()) {
					for(Java2File java2File: java2Dir.getJava2FileChildren()) {
						if(!linesExtraInfo.containsKey(java2File.getJavaUnit())) {
							linesExtraInfo.put(java2File.getJavaUnit(), new LinkedList<>());
						}
						linesExtraInfo.get(java2File.getJavaUnit()).addAll(java2File.getChildren());
					}
				}
			}
		}
		ModiscoJavaModel model = new ModiscoJavaModel(DISCOVER.getJavaModel(), linesExtraInfo);
		discoverProjects.put(javaProject, model);
		return model;
	}
	
}
