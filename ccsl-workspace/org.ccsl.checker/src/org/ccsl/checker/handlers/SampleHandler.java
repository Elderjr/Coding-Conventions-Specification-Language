package org.ccsl.checker.handlers;

import java.util.HashSet;
import java.util.Set;

import org.ccsl.checker.modisco.ModiscoJavaModelDiscover;
import org.ccsl.checker.windows.SelectionWindow;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;



public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
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
