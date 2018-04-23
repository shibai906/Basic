package com.zhao.XMLjiexi.jaxp;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxDemo {
	public static void main(String[] args) throws Exception {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser parser = saxParserFactory.newSAXParser();
		parser.parse("test.xml", new MyDefaultHandler());
	}
}

class MyDefaultHandler extends DefaultHandler {
	
	private boolean flag = false;
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if("name".equals(qName)){
			flag = true;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(flag == true){
			System.out.println(new String(ch,start,length));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		flag = false;
	}

}