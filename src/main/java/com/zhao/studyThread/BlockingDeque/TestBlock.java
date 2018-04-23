package com.zhao.studyThread.BlockingDeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class TestBlock {
	public static void main(String[] args) throws InterruptedException {
		BlockingDeque<Integer> block = new LinkedBlockingDeque<Integer>();
		ThreadA ta = new ThreadA(block);
		ThreadB tb = new ThreadB(block);
		ta.start();
		Thread.sleep(10000);
		tb.start();
	}
	
}
