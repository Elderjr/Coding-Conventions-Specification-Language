package ccslFaultTypeDescriptionExecutor.xmiReader;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.Model;

public class XMIReader {

	private static final XMIReader INSTANCE = new XMIReader();

	private XMIReader() {

	}

	public static XMIReader getInstance() {
		return INSTANCE;
	}

	public Model getModelFromXMIFile(String xmiProjectPath){
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource r = rs.getResource(URI.createURI(xmiProjectPath), true);
		TreeIterator<EObject> contents = r.getAllContents();
		return (Model) contents.next();
	}
}
