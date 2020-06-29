package org.ccsl.checker.ccslChecker;


import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.ccsl.checker.modisco.ModiscoJavaModel;
import org.ccsl.checker.modisco.ModiscoJavaModelDiscover;
import org.ccsl.checker.ocl.OclFacade;
import org.ccsl.checker.rule.Rule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.ocl.pivot.utilities.ParserException;


public class CcslCheckerRunner {


	public static List<Violation> runRule(Rule r, ModiscoJavaModel javaModel) throws  ParserException {
		String ocl = r.getOcl();
		List<?> elementViolations = (EList<?>) OclFacade.evaluateQuery(ocl,
				JavaPackage.eINSTANCE.getASTNode(), javaModel.getJavaModel());
		List<Violation> violations = new LinkedList<>();
		for (Object obj : elementViolations) {
			if (obj != null && obj instanceof ASTNode) {
				ASTNode node = (ASTNode) obj;
				int violationLine = javaModel.getLine(node);
				if (violationLine != -1) {
					violations.add(new Violation(node, violationLine));
				}
			}
		}
		return violations;
	}

}
