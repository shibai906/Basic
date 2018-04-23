package com.zhao.studyThread.suspendThread;

public class TestSuspendThread {

	public static void main(String[] args) {
		

		

	}
	
	public static void suspendThreadTest(){
		try {
			MyThread mt = new MyThread();
			mt.start();
			Thread.sleep(5000);
			// A段
			mt.suspend();
			System.out.println("A= " + System.currentTimeMillis()
			+ " i=" + mt.getI());
			mt.sleep(5000);  // 在暂停一段时间 // 确定是否真的暂停
			// B段
			mt.resume();  // 这里恢复线程
			mt.sleep(5000);
			
			// C段
			mt.suspend(); // 这里有暂停
			System.out.println("B= " + System.currentTimeMillis()
			+ "i= " + mt.getI());
			mt.sleep(5000);
			
			System.out.println("C= " + System.currentTimeMillis() + "i= " + mt.getI());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
