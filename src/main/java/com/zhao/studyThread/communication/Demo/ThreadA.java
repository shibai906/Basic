package com.zhao.studyThread.communication.Demo;

public class ThreadA extends Thread {
	
	private MyList list;
	
	public ThreadA(MyList list){
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0 ; i < 10 ; i ++){
				list.add();
				Thread.sleep(1000);
				System.out.println("List添加了" + (i+1) + "个元素");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
