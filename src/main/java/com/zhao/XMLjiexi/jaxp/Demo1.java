package com.zhao.XMLjiexi.jaxp;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class Demo1 {

	public static void main(String[] args) throws Exception {

		// selectAll();
//		selectOne();
//		addOne();
//		updata();
//		delete();
		getAll();

	}

	private static void getAll() throws Exception {
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse("test.xml");
		
		duigui(document);
		
		
	}

	private static void duigui(Node node) {
		if(node.getNodeType() == Node.ELEMENT_NODE){
			System.out.println(node.getNodeName());
		}
		NodeList list = node.getChildNodes();
		for(int i = 0;i<list.getLength();i++){
			
			Node node1 = list.item(i);
			
			duigui(node1);
			
		}
		
		
	}

	private static void delete() throws Exception {
	
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse("test.xml");
//		Node node = document.getElementsByTagName("Account").item(0);
		
		Node nodes = document.getElementsByTagName("Love").item(0);
		Node node = nodes.getParentNode();
		node.removeChild(nodes);
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("test.xml"));
		
	
	
	
	}

	private static void updata() throws Exception {
		/*
		 * 修改
		 * 可以直接调用setTextContent修改值
		 * 
		 */
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		
		Document document = builder.parse("test.xml");
		
		Node node = document.getElementsByTagName("Love").item(0);
		
		node.setTextContent("贾凯迪");
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("test.xml"));
		
		
	}

	private static void addOne() throws Exception {

		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse("test.xml");

		// 得到所有的account

		NodeList list = document.getElementsByTagName("Account");

		// 先得到第一个account
		Node p1 = list.item(1);

		// 创建标签
		Element love = document.createElement("Love");
		// 创建内容
		Text text1 = document.createTextNode("赵欢");
		// 把内容添加到text1中
		love.appendChild(text1);
		// 把love添加到p1中
		p1.appendChild(love);
		//回写操作
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer trans = factory.newTransformer();
		
		trans.transform(new DOMSource(document), new StreamResult("test.xml"));
		

	}

	private static void selectOne() throws Exception {

		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();

		Document document = builder.parse("test.xml");

		Element element = (Element) document.getDocumentElement();
		String str = element.getAttribute("Account");
		System.out.println(str);

	}

	private static void selectAll() throws Exception {
		// 首先得到工厂
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

		// 得到解析类
		DocumentBuilder builder = builderFactory.newDocumentBuilder();

		// 加载xml
		Document document = builder.parse("test.xml");

		// 获取到NodeList集合
		NodeList list = document.getElementsByTagName("name");

		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			System.out.println(node.getTextContent());
		}
	}
}
