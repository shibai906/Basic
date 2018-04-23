package com.zhao.Socket.TCP.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket对象
		Socket s = new Socket("172.51.11.156", 1325);

		// 获取输出流
		OutputStream out = s.getOutputStream();
		out.write("我操了你妈，今天很高兴".getBytes());

		// 获取输入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		System.out.println(new String(bys, 0, len));

		// 释放资源
		s.close();

	}
}
