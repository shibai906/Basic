package com.zhao.Socket.basic;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * UDP协议接收数据：
 * A:创建接收端Socket对象
 * B:创建一个数据包(接收容器)
 * C:调用Socket对象的接收方法接收数据
 * D:解析数据包，并显示在控制台
 * E:释放资源
 */

public class Reciption {
	public static void main(String[] args) throws Exception {
		// 创建一个接收对象
		DatagramSocket ds = new DatagramSocket(4048);

		// 创建接收对象
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);

		// 先接收数据
		ds.receive(dp);

		byte[] buf2 = dp.getData();
		int len = dp.getLength();
		String s = new String(buf2, 0, len);
		System.out.println(s + "   ");
		System.out.println("clksjdflskjdf");

		ds.close();
	}
}
