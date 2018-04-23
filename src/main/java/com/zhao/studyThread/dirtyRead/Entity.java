package com.zhao.studyThread.dirtyRead;

public class Entity {
	
	/*
	 * 这里使用了synchronized关键字，为什么在主函数中，先执行完setValue后才执行getValue
	 * 因为这里加的是同一把锁，只创建了这个对象的一把锁，所以这里执行步完，是不把锁给下一步执行的
	 * 
	 */
	
	private String username = "A";
	private String password = "AA";
	
	public synchronized void setValue(String username,String password){
		
		try {
			this.username = username;
			
			Thread.sleep(2000);
			this.password = password;
			
			System.out.println("setValue , name:"+Thread.currentThread().getName() + ",username:"
					+ username +",password:" + password);
			System.out.println("setValue" + Thread.currentThread().getName() + "end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	public synchronized void getValue(){
		
		System.out.println("getValue , name:"+Thread.currentThread().getName() + ",username:"
				+ username +",password:" + password);
		System.out.println("getValue" + Thread.currentThread().getName() + "end");
		
	}
	
	
}
