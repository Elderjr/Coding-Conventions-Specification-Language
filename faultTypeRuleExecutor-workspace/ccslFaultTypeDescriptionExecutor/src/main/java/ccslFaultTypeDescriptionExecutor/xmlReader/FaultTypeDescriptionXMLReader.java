package ccslFaultTypeDescriptionExecutor.xmlReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class FaultTypeDescriptionXMLReader {

	private static final FaultTypeDescriptionXMLReader INSTANCE = new FaultTypeDescriptionXMLReader();

	private FaultTypeDescriptionXMLReader() {

	}

	public static FaultTypeDescriptionXMLReader getInstance() {
		return INSTANCE;
	}

	public FaultTypeDescriptionXMLNode readFaultTypeDescriptionFromXML(String pathFile)
			throws FileNotFoundException, IOException {
		File xmlFile = new File(pathFile);
		XmlMapper xmlMapper = new XmlMapper();
		String xml = inputStreamToString(new FileInputStream(xmlFile));
		FaultTypeDescriptionXMLNode faultTypeDescriptionXMLNode = xmlMapper.readValue(xml, FaultTypeDescriptionXMLNode.class);
		return faultTypeDescriptionXMLNode;

	}

	private String inputStreamToString(InputStream is) throws IOException {
		StringBuilder sb = new StringBuilder();
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while ((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		br.close();
		return sb.toString();
	}
}
