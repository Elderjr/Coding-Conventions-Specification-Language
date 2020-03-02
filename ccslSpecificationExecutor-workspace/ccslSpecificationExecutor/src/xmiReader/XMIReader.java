package xmiReader;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class XMIReader {

	private static final XMIReader INSTANCE = new XMIReader();

	private XMIReader() {

	}

	public static XMIReader getInstance() {
		return INSTANCE;
	}

	public ResourceSet createsResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return rs;
	}
	public Resource loadResourceFromXMI(ResourceSet rs, String xmiProjectPath){
		Resource r = rs.getResource(URI.createFileURI(xmiProjectPath), true);
		return r;
	}
}
