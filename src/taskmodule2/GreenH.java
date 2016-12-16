package taskmodule2;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GreenH {
	public static void main(String args[]) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		File f = new File("src/taskmodule2/greenhouse.xml");
		try {
			doc = builder.parse(f);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Element root = doc.getDocumentElement();
		System.out.println(root.getTagName());
		System.out.println();
		NodeList nList = root.getChildNodes();
		for (int i = 0; i < nList.getLength(); i++) {
			if (nList.item(i) instanceof Element) {
				System.out.println(nList.item(i).getNodeName() + ":");
				System.out.println();
				NodeList attributes = ((Element) nList.item(i)).getChildNodes();
				for (int k = 0; k < attributes.getLength(); k++) {
					if (k < 3) {
						System.out.print(attributes.item(k).getNodeName() + "-");
						// System.out.print(attributes.item(k).getFirstChild());
						System.out.print(attributes.item(k).getFirstChild().getNodeValue() + ".");
						System.out.println();
					} else if (k == 3 || k == 4) {
						NodeList noList = (attributes.item(k).getChildNodes());
						System.out.println(attributes.item(k).getNodeName() + ":");
						for (int u = 0; u < noList.getLength(); u++) {

							if (noList.item(u) instanceof Element) {
								System.out.print("  "+noList.item(u).getNodeName() + "-");
								System.out.print(noList.item(u).getFirstChild().getNodeValue() + ".");
								System.out.println();
							}
						}
					}

					else {
						System.out.print(attributes.item(k).getNodeName() + "-");
						System.out.print(attributes.item(k).getFirstChild().getNodeValue() + ".");
						System.out.println();
					}

				}
			}
		}
	}
}