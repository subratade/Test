//import java.io.InputStream;
//import java.io.OutputStream;
//import java.io.StringReader;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
//import org.xml.sax.InputSource;
//
//public class Execute {
//	
//	public void execute(TransformationInput transIn, OutputStream outStream) throws Exception {
//		
//        InputStream in = transIn.getInputPayload().getInputStream();
//        String inData = this.convertStreamToString(in);
//        String inData1 = this.removeDoctypeInXml(inData);
//        String out = "";
//        String boundary = "b2Lh0weilHCR3Aw6z30XSc-HGGYpw-LcKSA";
//        String CRLF = "\r\n";
//        String ioCtx = "1";
//        String requestMode = "0";
//        String fileType = "0";
//        String numberLang = "en";
//        String emailTo = "prem.g.yadav@in.ibm.com";
//        String exportDestination = "3";
//        String language = "en";
//        String excpType = "0";
//        String importType = "0";
//        String ePASSRequestDocs = "C:\\SDG\\Temp\\Import.xml";
//        
//        try {
//            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder docBuilder = domFactory.newDocumentBuilder();
//            Document doc = docBuilder.parse(new InputSource(new StringReader(inData1)));
//            doc.getDocumentElement().normalize();
//            
//            NodeList nList = doc.getDocumentElement().getElementsByTagName("Attachment");
//            
//            //int i = 0;
//            InputAttachments inputAttachments = transIn.getInputAttachments();            
//            Collection<String> collectionIDs = inputAttachments.getAllContentIds(true);
//            
////			ArrayList<String> collectionIDs = inputAttachments.getAllContentIds(true);
//            
//            Object[] arrayObj = collectionIDs.toArray();
//            //while (i < nList.getLength()) {
//            //int j = arrayObj.length - 1;
//            for(int i = 0; i < nList.getLength();i++) {
//                //InputAttachments inputAttachments = transIn.getInputAttachments();
//                //Collection<String> collectionIDs = inputAttachments.getAllContentIds(true);
//                //Object[] arrayObj = collectionIDs.toArray();
//                //for (int j = 0; j < arrayObj.length;j++){
//                String attachmentHeaders = "";
//                
//                Element ele = (Element)nList.item(i);
//                String e = ele.getAttribute("AttachmentMIMEType");
//                
//                
//                String attachmentID =(String)arrayObj[i];
//               
//                //String f = ele.getAttribute("AttachmentFolderName");
//                //String g = ele.getAttribute("AttachmentName");
//                Attachment attachment = inputAttachments.getAttachment(attachmentID);
//                String contentType = attachment.getContentType();            
//                //if (g.equals(f)){
//                //if(e.contains("text")){
//                    attachmentHeaders = String.valueOf(attachmentHeaders) + "--" + boundary + CRLF + "Content-Disposition: form-data; name=\"" + ele.getAttribute("AttachmentName") + "\"; filename=\"" + ele.getAttribute("AttachmentLocation") + "\"" + CRLF;
////                    attachmentHeaders = String.valueOf(attachmentHeaders) + "Content-Type:" + "text/plain; charset=ISO-8859-1" + CRLF;
//                    // out = String.valueOf(out) + "Con + CRLF + CRLF;
////                }
////                else{
////                    attachmentHeaders = String.valueOf(attachmentHeaders) + "--" + boundary + CRLF + "Content-Disposition: attachment; name=\"" + ele.getAttribute("AttachmentName") + "\"; filename=\"" + ele.getAttribute("AttachmentLocation") + "\"" + CRLF;
//                    attachmentHeaders = String.valueOf(attachmentHeaders) + "Content-Type:" + contentType + "; charset=ISO-8859-1" + CRLF;
////                    attachmentHeaders = String.valueOf(attachmentHeaders) + "Content-Type:" + e + "; charset=ISO-8859-1" + CRLF;
//                    attachmentHeaders = String.valueOf(attachmentHeaders) + "Content-Transfer-Encoding: binary" + CRLF + CRLF;
////                }
//                    
//                outStream.write(attachmentHeaders.getBytes());
//               byte[] attachmentBytes = attachment.getContent();
//                  outStream.write(attachmentBytes);
//                  outStream.write(CRLF.getBytes());
//                outStream.flush();
//            }
//            
//            out = String.valueOf(out) + "--" + boundary + CRLF + "Content-Disposition: form-data; name=\"ioCtx\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + ioCtx + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"orgname\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + root.getAttribute("submitterOrganization") + CRLF + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF + "Content-Disposition: form-data; name=\"username\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + root.getAttribute("submitterUser") + CRLF + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"password\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + root.getAttribute("submitterPassword") + CRLF + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"requestMode\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + requestMode + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"fileType\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + fileType + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"numberLang\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + numberLang + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"emailTo\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + emailTo + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"exportDestination\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + exportDestination + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"language\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + language + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"excpType\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + excpType + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"importType\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + importType + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"ePASSRequestDocs\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/plain; charset=US-ASCII" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: 8bit" + CRLF + CRLF;
//            out = String.valueOf(out) + ePASSRequestDocs + CRLF;
//            out = String.valueOf(out) + "--" + boundary + CRLF;
//            out = String.valueOf(out) + "Content-Disposition: form-data; name=\"C:\\SDG\\Temp\\Import.xml\"; filename=\"import.xml\"" + CRLF;
//            out = String.valueOf(out) + "Content-Type: text/xml; charset=ISO-8859-1" + CRLF;
//            out = String.valueOf(out) + "Content-Transfer-Encoding: binary" + CRLF + CRLF;
//            out = String.valueOf(out) + inData + CRLF + "--" + boundary + "--";
//            System.out.println(out);
//            outStream.write(out.getBytes());
//        }
//        catch (Exception e) {
//        }
//    }
//
//	
//	private String removeDoctypeInXml(String inData) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	private String convertStreamToString(InputStream in) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	public static void main(String []agres){
//		
//	}
//
//}
