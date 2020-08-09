package org.ccsl.gen.ocl.services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import ccsl.context.Context;
import ccsl.elements.Element;

public class WalkHelper {

	private static final Map<Class, Integer> uniqueId = new HashMap<>();
	private static final Map<Context, Integer> totalExistsDeclarations = new HashMap<>();
	private static final Map<Element, String> uniqueNamesMap = new HashMap<>();
	private static final Set<Element> elementsVisited = new HashSet<Element>();
	private static final Map<Element, String> declaredElementMetaclass = new HashMap<>();
	
	public static void clearAllContexts() {
		uniqueNamesMap.clear();
		elementsVisited.clear();
		declaredElementMetaclass.clear();
		uniqueId.clear();
	}

	public static String getUniqueName(Element element, String baseName) {
		if (uniqueNamesMap.containsKey(element)) {
			return uniqueNamesMap.get(element);
		} else {
			String uniqueName = generatesUniqueName(element, baseName);
			uniqueNamesMap.put(element, uniqueName);
			return uniqueName;
		}
	}

	private static String generatesUniqueName(Element element, String baseName) {
		Integer id = uniqueId.get(element.getClass());
		if(id == null) {
			id = 1;
		}
		String uniqueName = baseName + "_" + id;
		uniqueId.put(element.getClass(), id + 1);
		return uniqueName;
	}

	public static void addElementAsVisited(Element element) {
		elementsVisited.add(element);
	}
	
	public static void addElementAsVisited(Element element, String metaclass) {
		addElementAsVisited(element);
		declaredElementMetaclass.put(element, metaclass);
	}
	
	public static Set<Element> getElementsVisited() {
		return elementsVisited;
	}

	private static Context getElementContext(Element element) {
		EObject object = element.eContainer();
		while (!(object instanceof Context)) {
			object = object.eContainer();
		}
		return (Context) object;
	}

	public static void addElementExistsDeclaration(Element element) {
		Context elementContext = getElementContext(element);
		addCustomExistsDeclaration(elementContext);
	}

	public static void addElementExistsDeclaration(Element element, String metaclass) {
		addElementExistsDeclaration(element);
		declaredElementMetaclass.put(element, metaclass);
	}
	
	public static String getDeclaredElementMetaclass(Element element) {
		String metaclass = declaredElementMetaclass.get(element);
		if(metaclass != null) {
			return metaclass;
		}
		return "ASTNode";
	}
	
	private static void addCustomExistsDeclaration(Context context) {
		int total = 0;
		if (totalExistsDeclarations.containsKey(context)) {
			total = totalExistsDeclarations.get(context);
		}
		totalExistsDeclarations.put(context, total + 1);
	}

	public static int getTotalElementsDeclaredInExists(Context context) {
		if (totalExistsDeclarations.containsKey(context)) {
			return totalExistsDeclarations.get(context);
		}
		return 0;
	}
}
