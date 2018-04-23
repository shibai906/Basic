package com.zhao.Socket.basic;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP协议接收数据：
 * A:创建发送端Socket对象
 * B:创建一个数据包(发送容器)
 * C:调用Socket对象的接收方法发送数据
 * D:释放资源
 * 
 * 一般接收数据不用加密
 */

public class Send {
	public static void main(String[] args) throws Exception {

		/*
		 * // 这里是怎么显示主机名和IP地址 InetAddress address =
		 * InetAddress.getByName("192.168.1.112");
		 * 
		 * // 获取IP地址 String ip = address.getHostAddress();
		 * 
		 * // 获取主机名 String name = address.getHostName(); System.out.println(ip +
		 * "   " + name);
		 */

		// 上面这些是如何获取主机名 直接获取
		// InetAddress address = InetAddress.getLocalHost();
		// System.out.println(address.getHostName()+"   "+address.getHostAddress());
		
		//创建发送对象
		DatagramSocket ds = new DatagramSocket();
		byte[] b = "草泥马草泥马爱武瑞得".getBytes();
		
		//创建一个容器(数据发送包)
		DatagramPacket  dp = new DatagramPacket(b, b.length, InetAddress.getByName("192.168.1.112"),4048 );
		
		//发送数据
		ds.send(dp);
		ds.close();
	}
}
