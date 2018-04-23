package com.zhao.studyThread.single.idler;

public class Entity {

	private static Entity entity;

	private Entity() {
	}
	/*
	 * 这是使用DCL双检查锁机制来实现多线程环境中的延迟加载单例设计模式
	 * 下面这样套用，第一层if
	 * 	先判断，是否为空，目的是让少进synchronized同步代码块，提升效率
	 * 	第二个判断，是为了防止多进去，防止new出多个实例对象
	 * 
	 */
	public static Entity getInstance() {
		if (entity == null) {
			synchronized (Entity.class) {
				// 延迟加载
				if (entity == null) {
					entity = new Entity();
				}
			}
		}
		return entity;

	}

}
