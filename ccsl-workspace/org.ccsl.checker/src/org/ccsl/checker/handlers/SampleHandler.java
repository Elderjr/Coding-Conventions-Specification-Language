package org.ccsl.checker.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.ccsl.checker.modisco.ModiscoJavaModelDiscover;
import org.ccsl.checker.ocl.OclFacade;
import org.ccsl.checker.windows.SelectionWindow;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModelFromJavaProject;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.javaapplication.JavaJar2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		Set<IJavaProject> javaProjects = new HashSet<>();
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = workspaceRoot.getProjects();
		for (int i = 0; i < projects.length; i++) {
			IProject project = projects[i];
			IJavaProject javaProject = JavaCore.create(project);
			if(ModiscoJavaModelDiscover.getInstance().isApplicable(javaProject)) {
				javaProjects.add(javaProject);
			}
		}
		new SelectionWindow(javaProjects).show();
		return null;
	}
}
