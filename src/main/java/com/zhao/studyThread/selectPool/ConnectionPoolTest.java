package com.zhao.studyThread.selectPool;

import java.util.concurrent.CountDownLatch;

public class ConnectionPoolTest {
	
	static ConnectionPool pool = new ConnectionPool(10);
	// 保证所有ConnectionRunner能够同时开始
	static CountDownLatch start = new CountDownLatch(1);
	// main线程将会等待所有ConnectionRunner结束后才能继续执行
	static CountDownLatch end ;
	
	
}
