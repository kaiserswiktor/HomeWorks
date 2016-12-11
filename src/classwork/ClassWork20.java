package classwork;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class ClassWork20 {
	public static void main(String args[]) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		File f = new File("1.xml");
		try {
			doc = builder.parse(f);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Element root = doc.getDocumentElement();
		System.out.println(root.getTagName());
		
		NodeList nList = root.getChildNodes();
		
		for (int i = 0; i < nList.getLength(); i++) {
			if (nList.item(i) instanceof Element) {
				System.out.println(nList.item(i).getNodeName());
				NodeList attributes = ((Element)nList.item(i)).getChildNodes();
				for (int k = 0; k < attributes.getLength(); k++) {
					System.out.println(attributes.item(k).getNodeName());
					String name="1";
					System.out.println(attributes.item(k).getAttributes().getNamedItem(name));
				}
			}
		}
	}
}


