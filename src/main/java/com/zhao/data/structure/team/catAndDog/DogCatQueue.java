package com.zhao.data.structure.team.catAndDog;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {
	
	private Queue<PetEnterQueue> dogQ;
	private Queue<PetEnterQueue> catQ;
	private long count;
	
	public DogCatQueue(){
		dogQ = new LinkedList<PetEnterQueue>();
		catQ = new LinkedList<PetEnterQueue>();
		this.count = 0 ;
	}
	
	public void add(Pet pet){
		
		if(pet instanceof Dog){
			this.dogQ.add(new PetEnterQueue(pet, count++));
		} else if(pet instanceof Cat){
			this.catQ.add(new PetEnterQueue(pet, count++));
		} else {
			System.out.println("你到底属于什么类型");
		}
	}
	
	public Pet pollAll(){
		if(!this.dogQ.isEmpty() && !this.catQ.isEmpty()){
			if(this.dogQ.peek().getCount() > this.catQ.peek().getCount()){
				System.out.println("里面的"+this.dogQ.peek().getCount());
				return this.catQ.poll().getPet();
			}else{
				return this.dogQ.poll().getPet();
			}
		} else if(!this.dogQ.isEmpty()){
			return this.dogQ.poll().getPet();
		} else if(!this.catQ.isEmpty()){
			return this.catQ.poll().getPet();
		} else{
			throw new RuntimeException("狗和猫都取光了，没存货了");
			
		}
	}
	
	public Dog pollDog(){
		if(!this.dogQ.isEmpty()){
			return (Dog) this.dogQ.poll().getPet();
		}else{
			throw new RuntimeException("没有狗了");
		}
	}
	
	public Cat pollCat(){
		if(!this.catQ.isEmpty()){
			return (Cat) this.catQ.poll().getPet();
		}else{
			throw new RuntimeException("没有猫了");
		}
	}
	
	public boolean isEmpty(){
		return this.dogQ.isEmpty() && this.catQ.isEmpty();
	}
	
	public boolean isDogQueueEmpty(){
		
		return this.dogQ.isEmpty();
	}
	
	public boolean isCatQueueEmpty(){
		return this.catQ.isEmpty();
	}
	
	
}








