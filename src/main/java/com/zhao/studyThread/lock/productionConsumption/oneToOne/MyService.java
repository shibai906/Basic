package com.zhao.studyThread.lock.productionConsumption.oneToOne;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 	在这里写生产销毁有一个好处就是，等待
 * 		生产满了用con1等待，然后释放生产中con2获取执行权
 * 		消费完了，用con2等待，然后使用con1获取执行权
 * 		
 * 
 */
public class MyService {

	private ReentrantLock lock = new ReentrantLock();
	private Condition con1 = lock.newCondition();
	private Condition con2 = lock.newCondition();

	public void set(Entity entity) {
		try {
			lock.lock();
			while (!entity.getName().equals("")) {
				con1.await();
			}
			System.out.println("给set值");
			entity.setName("赵" + Math.random() * 100);
			entity.setPassword("娇" + Math.random() * 100);
			con2.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	public void get(Entity entity) {
		try {
			lock.lock();
			while (entity.getName().equals("")) {
				con2.await();
			}
			System.out.println("给get值" + entity.toString());
			entity.setName("");
			entity.setPassword("");
			con1.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
