package org.ccsl.xtext;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import ccsl.elements.Element;

public class CcslQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{

	protected QualifiedName qualifiedName(Element e) {
		return QualifiedName.create(e.getUniqueName());
	}
}
