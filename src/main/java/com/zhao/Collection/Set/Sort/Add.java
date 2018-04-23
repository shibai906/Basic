package com.zhao.Collection.Set.Sort;

import java.util.TreeSet;

public class Add {
	
	public static void main(String[] args) {
		
		TreeSet<Student> tr = new TreeSet<>();
		Student s1 = new Student("召喚",22,45.6f);
		Student s2 = new Student("偶也",21,99.6f);
		Student s3 = new Student("耶耶",19,79.6f);
		Student s4 = new Student("哈哈",20,89.6f);
		tr.add(s1);
		tr.add(s2);
		tr.add(s3);
		tr.add(s4);
		
		for(Student s:tr){
			System.out.println(s.getName()+"  "+s.getAge()+"  "+s.getExam());
		}
		
		
		
		
	}
	
}
