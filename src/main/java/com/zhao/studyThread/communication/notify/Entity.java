package com.zhao.studyThread.communication.notify;

public class Entity {
	
	public void method(Object obj){
		try {
			synchronized(obj){
				System.out.println("begin wait()");
				obj.wait();
				Thread.sleep(1000);
				System.out.println("begin end");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void synNotifyMethod(Object obj){
		try {
			synchronized(obj){
				System.out.println("begin notify() ThreadName="
					+ Thread.currentThread().getName() + " time"
					+System.currentTimeMillis());
				obj.notify();
				Thread.sleep(1000);
				System.out.println("end notify() ThreadName="
						+ Thread.currentThread().getName() + " time"
						+System.currentTimeMillis());
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
