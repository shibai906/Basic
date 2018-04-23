package com.zhao.studyThread.ThreaGroup;

public class TestThreadGroup {
	public static void main(String[] args) {
		getGroupParent();
	}
	
	public static void getGroupParent(){
		// 主线程所在的组名为main
		// 主线程所在的线程组的父线程组的名称是：system
		System.out.println("线程：" + Thread.currentThread().getName()
				+" 所在的线程组名为：" + Thread.currentThread().getThreadGroup().getName());
		System.out.println("main线程所在的线程组的父线程组的名称是："
				+ Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println("main线程所在的线程组的父线程组的父线程组的名称是"+
				Thread.currentThread().getThreadGroup().getParent().getParent().getName());
		
	}
	
	public static void threadAffiliation(){
		
		// 方法activeGroupCount()取得当前线程组对象中的子线程组数量
		// 方法enumerate()的作用是将线程组中的子线程组以复制的形式
		// 拷贝到ThreadGroup[]数组对象中
		
		System.out.println("A处线程：" + Thread.currentThread().getName()
				+"所属的线程组名为："
				+Thread.currentThread().getThreadGroup().getName() + " "
				+ " 中有线程组数量：" 
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup group = new ThreadGroup("新的组"); // 自动加到main组中
		// 为啥这里为1了，应为线程组x使如果不指定所属的线程组，则x线程组自动归到当前线程对象所属的线程中，也就使隐士的在一个
		// 线程组中添加了一个子线程组
		System.out.println("B处线程：" + Thread.currentThread().getName() + " 所属的线程组名为："
				+ Thread.currentThread().getThreadGroup().getName() + " 中有线程组孰料："
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadgroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadgroup);
		for(int i = 0 ; i < threadgroup.length; i ++){
			System.out.println("第一个线程组的名称为：" + threadgroup[i].getName());
		}
		
		
	}
	
	public static void multistageGroup(){
		
		ThreadGroup tgroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(tgroup , "A");
		ThreadA ta = new ThreadA();
		Thread t1 = new Thread(group,ta);
		Runnable run = new Runnable(){
			@Override
			public void run() {
				try{
					System.out.println("runMethod!");
					Thread.sleep(10000); // 线程必须在运行状态才可以受阻管理
				} catch(InterruptedException e){
					e.printStackTrace();
				}
				
			}
		};
		
		Thread newT = new Thread(group,run);
		newT.setName("Z");
		newT.start(); // 线程必须启动然后才归到组A中
		
		ThreadGroup[] listGrop = new ThreadGroup[Thread.currentThread()
		                                         .getThreadGroup().activeGroupCount()];
		// enumerate方法复制该线程组及其子组中的所有活动线程到指定的数组。
		Thread.currentThread().getThreadGroup().enumerate(listGrop);
		System.out.println("main线程中有多少个子线程组：" + listGrop.length + 
				" 名字为：" + listGrop[0].getName());
		Thread[] listThread = new Thread[listGrop[0].activeCount()];
		listGrop[0].enumerate(listThread);
		System.out.println(listThread[0].getName());
		
	}
	
	public static void singleGroup(){
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ThreadGroup group = new ThreadGroup("赵欢的线程组");
		Thread at = new Thread(group,ta);
		Thread bt = new Thread(group,tb);
		at.start();
		bt.start();
		System.out.println("活动的线程数为" + group.activeCount());
		System.out.println("线程的名称为" + group.getName());
	}
	
	
}
