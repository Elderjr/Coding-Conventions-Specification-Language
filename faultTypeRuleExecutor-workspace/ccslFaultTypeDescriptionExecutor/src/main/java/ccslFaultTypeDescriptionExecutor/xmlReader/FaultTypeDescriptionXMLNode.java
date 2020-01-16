package ccslFaultTypeDescriptionExecutor.xmlReader;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "faultTypeRule")
public class FaultTypeDescriptionXMLNode {

	FaultTypeDescriptionXMLNode(){
		
	}
	
	@JacksonXmlProperty(localName = "ocl")
	private String ocl;

	@JacksonXmlProperty(localName = "strategy")
	private InjectionStrategyXMLNode strategy;

	@JacksonXmlProperty(localName = "actions")
	private List<InjectionActionXMLNode> actions;

	public String getOcl() {
		return ocl;
	}

	public InjectionStrategyXMLNode getStrategy() {
		return this.strategy;
	}

	public List<InjectionActionXMLNode> getActions() {
		return this.actions;
	}
}
