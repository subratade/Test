import java.util.Collection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class A {

	public void execute() {
		try {
			
			TransformationInput transIn = null ;
			
			DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = domFactory.newDocumentBuilder();
			Document doc = docBuilder.parse("c:\\input.xml");	
			
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getDocumentElement().getElementsByTagName("Attachment");
			
			InputAttachments inputAttachments = transIn.getInputAttachments();
			
            Collection<String> collectionIDs = inputAttachments.getAllContentIds(true);
			
			 for(int i = 0; i < nList.getLength();i++) {				 
				 Element ele = (Element)nList.item(i);
	                String e = ele.getAttribute("AttachmentMIMEType");
	                System.out.println("AttachmentMIMEType  :"+e);
			 }
			
			} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		A a = new A();
		a.execute();

	}

}
