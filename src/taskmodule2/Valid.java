package taskmodule2;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class Valid {
	public static boolean validateXMLByXSD(String xml, String xsd) throws SAXException, IOException {
	    try {
	        SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
	        .newSchema(new StreamSource(xsd))
	        .newValidator()
	        .validate(new StreamSource(xml));
	      
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("Eror");
	        return false;
	    }
	    System.out.println("True");
	    return true;
	    
}
	   
	    
	public static void main(String args[]){
		try {
			validateXMLByXSD("src/taskmodule2/greenhouse.xml", "src/taskmodule2/greenhouse.xsd");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
