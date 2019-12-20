package faultTypeRuleExecutor.xmlReader;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "faultTypeRule")
public class FaultTypeDescriptionXMLNode {

	@JacksonXmlProperty(localName = "ocl")
	private String ocl;

	@JacksonXmlProperty(localName = "strategy")
	private StrategyXMLNode strategy;

	@JacksonXmlProperty(localName = "actions")
	private List<ActionXMLNode> actions;

	public String getOcl() {
		return ocl;
	}

	public StrategyXMLNode getStrategy() {
		return this.strategy;
	}

	public List<ActionXMLNode> getActions() {
		return this.actions;
	}
}
