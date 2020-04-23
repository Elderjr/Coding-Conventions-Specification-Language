package nodeUtils;
import java.util.ArrayList;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ImportDeclaration;
import org.eclipse.gmt.modisco.java.Package;

public class NodeUtils {

	
	public static Package getNodePackage(ASTNode node) {
		if(node instanceof ImportDeclaration) {
			return getNodePackage((ImportDeclaration) node);
		}
		ASTNode content = node;
		while(content != null && !(content instanceof Package)) {
			if(content.eContainer() instanceof ASTNode) {
				content = (ASTNode) content.eContainer();
			} else {
				content = null;	
			}
		}
		if(content != null) {
			return (Package) content;
		}
		return null;
	}
	
	public static Package getNodePackage(ImportDeclaration node) {
		return getNodePackage(node.getOriginalCompilationUnit().getTypes().get(0));
	}
	
	public static String getFullPackageName(Package modiscoPackage) {
		StringBuilder fullPackageName = new StringBuilder("");
		ArrayList<Package> nestedPackages = new ArrayList<>();
		Package nestedPackage = modiscoPackage.getPackage();
		while(nestedPackage != null) {
			nestedPackages.add(nestedPackage);
			nestedPackage = nestedPackage.getPackage();
		}
		for(int i = nestedPackages.size() - 1; i >= 0; i--) {
			fullPackageName.append(nestedPackages.get(i).getName()).append('.');
		}
		fullPackageName.append(modiscoPackage.getName());
		return fullPackageName.toString();
	}
}
