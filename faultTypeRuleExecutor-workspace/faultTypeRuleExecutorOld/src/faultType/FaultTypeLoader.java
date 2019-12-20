package faultType;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import command.InjectionAction;
import command.InjectionCommandFactory;
import command.impl.ActionPipe;
import faultInjectorStrategy.FaultInjectorStrategy;
import faultInjectorStrategy.FaultInjectorStrategyFactory;

public final class FaultTypeLoader {

	private static final FaultTypeLoader INSTANCE = new FaultTypeLoader();

	private FaultTypeLoader() {

	}

	public static FaultTypeLoader getInstance() {
		return INSTANCE;
	}

	private Element getElement(Element root, String tagName) throws FaultTypeDescriptionParserException {
		NodeList nodeList = root.getElementsByTagName(tagName);
		if (nodeList.getLength() == 0 || nodeList.getLength() > 1)
			throw new FaultTypeDescriptionParserException(
					"Exactly one " + tagName + "tag must exist, total found: " + nodeList.getLength());
		return (Element) nodeList.item(0);
	}

	private void validateStrategyOrActionElement(Element element) throws FaultTypeDescriptionParserException {
		String name = element.getAttribute("name");
		String custom = element.getAttribute("custom");
		if (name.isEmpty())
			throw new FaultTypeDescriptionParserException(element.getNodeName() + " tag must has the custom attribute");
		if (custom.isEmpty())
			throw new FaultTypeDescriptionParserException(element.getNodeName() + " tag must has the name attribute");
	}

	private FaultInjectorStrategy getStrategy(Element strategy) throws FaultTypeDescriptionParserException {
		validateStrategyOrActionElement(strategy);
		if (strategy.getAttribute("custom").equals("false")) {
			return FaultInjectorStrategyFactory.createsStrategy(strategy.getAttribute("name"));
		}
		return null;
	}

	private InjectionAction getAction(Element action, String dir) throws Exception {
		validateStrategyOrActionElement(action);
		if (action.getAttribute("custom").equals("false")) {
			return InjectionCommandFactory.createsDefaultAction(action.getAttribute("name"));
		} else {
			return InjectionCommandFactory.compileCustomAction(action.getAttribute("name"),
					dir + "\\" + action.getAttribute("name") + ".java");
		}
	}

	public FaultTypeDescription loadFaultTypeDescription(String pathFile) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		File file = new File(pathFile);
		Document doc = builder.parse(file);
		Element faultTypeRuleTag = doc.getDocumentElement();
		if (!faultTypeRuleTag.getNodeName().equals("faultTypeRule"))
			throw new FaultTypeDescriptionParserException(
					"Node faultTypeRule expected rather than " + faultTypeRuleTag.getNodeName());
		Element oclTag = getElement(faultTypeRuleTag, "ocl");
		String ocl = oclTag.getTextContent();
		System.out.println(ocl);
		FaultInjectorStrategy strategy = getStrategy(getElement(faultTypeRuleTag, "strategy"));
		ActionPipe actionPipe = new ActionPipe();
		NodeList list = faultTypeRuleTag.getElementsByTagName("action");
		int index = 0;
		while (index < list.getLength()) {
			actionPipe.addAction(getAction((Element) list.item(index), file.getParent()));
			index++;
		}

		return new FaultTypeDescription(ocl,actionPipe, strategy);
	}
}
