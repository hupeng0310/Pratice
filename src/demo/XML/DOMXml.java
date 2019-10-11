package demo.XML;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMXml {
    public static void main(String[] args){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        File  file = new File("Resource/XML/mysqlConfig.xml");
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            NodeList configureNodeList = document.getElementsByTagName("configure");
            NodeList hostNodeList = document.getElementsByTagName("host");
            NodeList userNodeList = document.getElementsByTagName("user");
            NodeList passwordNodeList = document.getElementsByTagName("password");
            NodeList databaseNodeList = document.getElementsByTagName("database");
            for(int i = 0;i<configureNodeList.getLength();i++){
                System.out.println("第"+(i+1)+"个配置文件信息");
                System.out.println("Host:"+hostNodeList.item(i).getFirstChild().getNodeValue());
                System.out.println("User"+userNodeList.item(i).getFirstChild().getNodeValue());
                System.out.println("Password:"+passwordNodeList.item(i).getFirstChild().getNodeValue());
                System.out.println("Database:"+databaseNodeList.item(i).getFirstChild().getNodeValue());
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
