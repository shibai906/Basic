package com.zhao.studyThread.communication.changeWait;

public class Subtract {
	private String lock;
	public Subtract(String lock){
		this.lock = lock;
	}
	public void subtract(){
		try{
			synchronized (lock) {
				// 这里改成while不抛出异常是因为，当第一个移除后，size长度有编程0，进入了这个死循环
				// 所以在这里有进入这个while循环了
				while(ValueObject.list.size() == 0){
					System.out.println("wait begin ThreadName=" + Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait end ThreadName=" + Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size=" + ValueObject.list.size());
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
