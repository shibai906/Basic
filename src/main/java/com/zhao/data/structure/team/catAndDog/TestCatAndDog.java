package com.zhao.data.structure.team.catAndDog;

public class TestCatAndDog {
	
	public static void main(String[] args) {
		int j= 0;
		DogCatQueue tcad = new DogCatQueue();
		for(int i = 0 ; i < 10 ; i ++){
			Dog dog = new Dog("dog"+i);
			Cat cat = new Cat("cat"+i);
			tcad.add(cat);
			tcad.add(dog);
		}
		while(!tcad.isEmpty()){
			System.out.println(tcad.pollAll().getType() + (j++) );
		}
		
	}
	
}
