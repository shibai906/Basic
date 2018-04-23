package com.zhao.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class ServletSelector {
	private static final int BUF_SIZE = 1024;
	private static final int PORT = 1234;
	private static final int TIMEOUT = 3000;

	public static void main(String[] args) {

		Selector selector = null;
		ServerSocketChannel ssc = null;
		try {
			selector = Selector.open();
			ssc = ServerSocketChannel.open();
			ssc.socket().bind(new InetSocketAddress(PORT)); // 连接端口
			ssc.configureBlocking(false); // 非阻塞
			ssc.register(selector, SelectionKey.OP_ACCEPT); // 连接selector和channel

			while (true) {

				if (selector.select(TIMEOUT) == 0) {
					System.out.println("==,没有端口连接服务器");
					continue;
				}
				Iterator<SelectionKey> it = selector.selectedKeys().iterator();
				while (it.hasNext()) {
					SelectionKey key = it.next();

					if (key.isAcceptable()) {
						handleAccept(key);
					}
					if (key.isReadable()) {
						handleRead(key);
					}
					if (key.isWritable()) {
						handleWrite(key);
					}
					if (key.isConnectable()) {
						System.out.println("链接成功");
					}
					it.remove();
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (selector != null)
					selector.close();
				if (ssc != null) {
					ssc.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void handleWrite(SelectionKey key) throws IOException {
		ByteBuffer bb = (ByteBuffer) key.attachment();
		SocketChannel sc = (SocketChannel) key.channel();
		bb.flip();
		while (bb.hasRemaining()) {
			sc.write(bb);
		}

		bb.compact();
	}

	private static void handleRead(SelectionKey key) throws IOException {

		ByteBuffer bb = (ByteBuffer) key.attachment();
		SocketChannel sc = (SocketChannel) key.channel();

		int read = 0;
		read = sc.read(bb);
		while (read > 0) {
			bb.flip();
			while (bb.hasRemaining()) {
				System.out.print((char)bb.get());
			}
			System.out.println();
			bb.compact();
			read = sc.read(bb);
			if (read == -1) {
				sc.close();
			}
		}

	}

	private static void handleAccept(SelectionKey key) throws IOException {
		ServerSocketChannel ssChannel = (ServerSocketChannel) key.channel();
		ByteBuffer buf = (ByteBuffer) key.attachment();
		SocketChannel sc = ssChannel.accept();
		sc.configureBlocking(false);
		sc.register(key.selector(), SelectionKey.OP_READ, ByteBuffer.allocate(BUF_SIZE));

	}

}
