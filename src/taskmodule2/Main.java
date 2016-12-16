package taskmodule2;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Main {
	public static void main(String[] args) {
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			// установка используемого XSL-преобразования
			Transformer transformer = tf.newTransformer(new StreamSource("src/taskmodule2/greenhouse.xsl"));
			// установка исходного XML-документа и конечного XML-файла
			transformer.transform(new StreamSource("src/taskmodule2/greenhouse.xml"),	new StreamResult("taskmodule2.html"));
			System.out.println("Transform " + " complete");
		} catch (TransformerException e) {
			System.err.println("Impossible transform file " + " : " + e);
		}	
	}
}
