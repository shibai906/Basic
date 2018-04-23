package com.zhao.data.structure.team.catAndDog;

/*
 * 需求：
 * 	用户可以调用add方法将cat类或多改造的实例放入队列中；
 * 	用户可以调用pollAll方法，将队列中所有的实例按照进队列的先后顺序依次弹出
 * 	用户可以调用pollDog方法，将队列中dog类的实例按照进队列的先后顺序依次弹出
 * 	用户可以调用pollCat方法，将队列中cat类的实例按照进队列的先后顺序依次弹出
 * 	用户可以屌丝isEmpty方法，检查队列中是否还有dog或cat的实例
 * 	用户可以调用isDogEmpty方法，检查队列中是否有dog类的实例
 * 	用户可以调用isCatEmpty方法，检查队列中是否有cat类的实例
 * 
 * 解决办法
 * 	创建一个PetEnterQueue，主要有存放动物，还有动物的编号
 * 		真的解决办法是，创建两个ArrayList集合，把猫和狗分别放到两个不同的集合中。
 * 		然后操作的是同一个，放到动物园里，标记动物以及进去的编号
 * 	
 */

public class PetEnterQueue {
	
	private Pet pet;
	private long count ;
	
	public PetEnterQueue(Pet pet, long count){
		this.pet = pet ; 
		this.count = count;
	}

	public Pet getPet() {
		return pet;
	}
	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
	
	
	
}
