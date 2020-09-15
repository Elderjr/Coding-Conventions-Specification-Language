package org.ccsl.checker.modisco;

import java.util.List;
import java.util.Map;

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;

public class ModiscoJavaModel {

	private Model javaModel;
	private Map<CompilationUnit, List<ASTNodeSourceRegion>> linesExtraInfo;

	ModiscoJavaModel(Model javaModel, Map<CompilationUnit, List<ASTNodeSourceRegion>> linesExtraInfo) {
		this.javaModel = javaModel;
		this.linesExtraInfo = linesExtraInfo;
	}

	public Model getJavaModel() {
		return this.javaModel;
	}

	public int getLine(ASTNode astNode) {
		if (astNode.getOriginalCompilationUnit() != null) {
			if (linesExtraInfo.containsKey(astNode.getOriginalCompilationUnit())) {
				for (ASTNodeSourceRegion sourceRegion : linesExtraInfo.get(astNode.getOriginalCompilationUnit())) {
					if (sourceRegion.getNode().equals(astNode)) {
						return sourceRegion.getStartLine();
					}
				}
			}
		}
		return -1;
	}
}
