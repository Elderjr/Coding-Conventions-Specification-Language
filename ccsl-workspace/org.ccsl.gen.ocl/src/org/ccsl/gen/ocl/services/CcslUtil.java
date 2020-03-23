package org.ccsl.gen.ocl.services;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ccsl.elements.Element;

public class CcslUtil {

	private static EObject deepCopyRec(EObject objectToCopy, Set<EStructuralFeature> featuresCopied) {
		EObject copy = EcoreUtil.copy(objectToCopy);
		for(EStructuralFeature feature : copy.eClass().getEAllStructuralFeatures()) {
			if(!featuresCopied.contains(feature)) {
				Object featureValue = copy.eGet(feature);
				if(featureValue instanceof EObject) {
					copy.eSet(feature, deepCopyRec((EObject) featureValue, featuresCopied));
				} else if(featureValue instanceof EList) {
					int index = 0;
					for(Object obj : (EList) featureValue) {
						if(obj instanceof EObject) {
							((EList) obj).set(index, deepCopyRec((EObject) obj, featuresCopied));
						}
						index++;
					}
				}
			}
		}
		return copy;
	}
	
	public static Element deepCopy(Element elementToCopy) {
		return (Element) deepCopyRec(elementToCopy, new HashSet<EStructuralFeature>());
	}
}
