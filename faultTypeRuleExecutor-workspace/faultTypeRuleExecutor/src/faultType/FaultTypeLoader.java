package faultType;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import command.InjectionCommand;
import command.InjectionCommandFactory;
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

	private InjectionCommand getAction(Element action) throws FaultTypeDescriptionParserException {
		validateStrategyOrActionElement(action);
		if (action.getAttribute("custom").equals("false")) {
			return InjectionCommandFactory.createsAction(action.getAttribute("name"));
		}
		return null;
	}

	public FaultTypeDescription loadFaultTypeDescription(String pathFile)
			throws ParserConfigurationException, SAXException, IOException, FaultTypeDescriptionParserException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(pathFile);
		Element faultTypeRuleTag = doc.getDocumentElement();
		if (!faultTypeRuleTag.getNodeName().equals("faultTypeRule"))
			throw new FaultTypeDescriptionParserException(
					"Node faultTypeRule expected rather than " + faultTypeRuleTag.getNodeName());
		Element oclTag = getElement(faultTypeRuleTag, "ocl");
		String ocl = oclTag.getTextContent();
		FaultInjectorStrategy strategy = getStrategy(getElement(faultTypeRuleTag, "strategy"));
		InjectionCommand action = getAction(getElement(faultTypeRuleTag, "action"));
		return new FaultTypeDescription(ocl, action, strategy);
	}
}
