package com.zhao.Socket.TCP.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(1325);

		// 监听客户端连接
		Socket s = ss.accept();

		// 获取输入流
		InputStream in = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = in.read(bys); // 阻塞

		System.out.println(new String(bys, 0, len));

		// 获取输出流
		OutputStream os = s.getOutputStream();
		os.write("数据已经接收到".getBytes());

		// 释放资源
		s.close();

	}

}
