package com.zhao.studyThread.noThisSynch;

/*
 * 锁非this对象具有一定的优点：如果在一个类中有多个synchronized方法，这时虽然能
 * 	实现同步，但会受到阻塞，影响运行效率；但如果使用同步代码块锁非this对象，则synchronized
 * （非this）代码块中的程序与同步方法是异步的，不与其他锁this同步方法争抢this锁，
 * 	可大大提高运行效率
 * 	
 * 
 * 	如果代码块中锁不是this，那和同步方法的锁一定是不一样的
 */


public class TestNoThisSynch {
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		ThreadA a = new ThreadA(entity);
		a.setName("huan");
		ThreadB b = new ThreadB(entity);
		b.setName("jiao");
		a.start();
		b.start();
		
	}
}
