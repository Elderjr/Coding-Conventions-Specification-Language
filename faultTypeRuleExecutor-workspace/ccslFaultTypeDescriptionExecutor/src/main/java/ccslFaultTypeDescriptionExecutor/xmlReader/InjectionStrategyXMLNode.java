package ccslFaultTypeDescriptionExecutor.xmlReader;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "strategy")
public class InjectionStrategyXMLNode {

	InjectionStrategyXMLNode(){
		
	}
	
	@JacksonXmlProperty(localName = "name", isAttribute = true)
	private String name;

	@JacksonXmlProperty(localName = "custom", isAttribute = true)
	private boolean custom;

	public String getName() {
		return this.name;
	}

	public boolean isCustom() {
		return this.custom;
	}
}
