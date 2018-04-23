package com.zhao.nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

public class Client {
	public static void main(String[] args) {

		ByteBuffer bb = null;
		SocketChannel sc = null;
		try {
			bb = ByteBuffer.allocate(1024);
			sc = SocketChannel.open();
			sc.configureBlocking(false); // 非阻塞方式
			sc.connect(new InetSocketAddress(InetAddress.getLocalHost(), 1234));

			if (sc.finishConnect()) // 是否连接
			{
				int i = 0;
				while (true) {
					TimeUnit.SECONDS.sleep(2); //暂停两秒
					String info = "I'm" + i++ +"-th information from client";
					bb.clear();
					bb.put(info.getBytes());
					bb.flip();
					while(bb.hasRemaining()){
						System.out.println(bb);
						sc.write(bb);  //把数据写过去
					}

				}
			}

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
