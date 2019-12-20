package org.ccsl.gen.ocl.services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import ccsl.Context;
import ccsl.Rule;
import ccsl.elements.Element;

public class WalkHelper {

	private static int uniqueId = 1;
	private static final Map<Context, Integer> totalExistsDeclarations = new HashMap<>();
	private static final Map<Element, String> uniqueNamesMap = new HashMap<>();
	private static final Set<Element> elementsVisited = new HashSet<Element>();
	
	public static void clearAllContexts() {
		uniqueNamesMap.clear();
		elementsVisited.clear();
		uniqueId = 1;
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
		if (element.getUniqueName() != null) {
			return element.getUniqueName();
		} else {
			String uniqueName = baseName + uniqueId;
			uniqueId++;
			return uniqueName;
		}
	}

	public static void addElementAsVisited(Element element) {
		elementsVisited.add(element);
	}
	
	public static Set<Element> getElementsVisited() {
		return elementsVisited;
	}

	private static Context getElementContext(Element element) {
		EObject object = null;
		do {
			object = element.eContainer();
		} while (!(object instanceof Context));
		return (Context) object;
	}

	public static void addElementExistsDeclaration(Element element) {
		Context elementContext = getElementContext(element);
		addCustomExistsDeclaration(elementContext);
	}

	public static void addCustomExistsDeclaration(Context context) {
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
