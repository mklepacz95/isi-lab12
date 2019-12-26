package org.mycompany;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Waluty {
	
Waluty() {
		
	}
	
	public String getKodWaluty(String kraj) throws ParserConfigurationException  {
		String kodWaluty = null;
		File inputFile = new File("waluty.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;

        dBuilder = dbFactory.newDocumentBuilder();

        Document doc;
		try {
			doc = dBuilder.parse(inputFile);
	        doc.getDocumentElement().normalize();
			
			XPath xPath =  XPathFactory.newInstance().newXPath();
			String expression = "/waluty/waluta[@kraj='" + kraj + "']";	  
			kodWaluty = xPath.compile(expression).evaluate(doc, XPathConstants.STRING).toString().trim();

		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SAXException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return kodWaluty;
	}
}
