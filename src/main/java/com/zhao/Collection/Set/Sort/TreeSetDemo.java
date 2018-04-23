package com.zhao.Collection.Set.Sort;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * 如果TreeSet类两个比较都用，类继承了Comparable，TreeSet(这里new Comparator接口)，后面的起作用
	 */
	private static TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
		@Override
		public int compare(Student stu1, Student stu2) {
			int num = 0;
			float f = stu1.getExam() - stu2.getExam();
			if (f > 0) {
				num = 1;
			} else if (f < 0) {
				num = -1;
			} else {
				num = stu1.getAge() - stu2.getAge();
				if (stu1.getName() != null) {
					num = num + stu1.getName().compareTo(stu2.getName());
				}
			}
			return num;
		}
	});

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setAge(23);
		stu1.setExam(55.8f);
		stu1.setName("xcm");
		
		Student stu2 = new Student();
		stu2.setAge(22);
		stu2.setExam(59.8f);
		stu2.setName("ccm");
		
		Student stu3 = new Student();
		stu3.setAge(21);
		stu3.setExam(67f);
		stu3.setName("mmm");
		
		Student stu4 = new Student();
		stu4.setAge(23);
		stu4.setExam(77f);
		stu4.setName("ewd");
		
		Student stu5 = new Student();
		stu5.setAge(26);
		stu5.setExam(99.8f);
		stu5.setName("sdm");
		
		ts.add(stu1);
		ts.add(stu2);
		ts.add(stu3);
		ts.add(stu4);
		ts.add(stu5);
		
		Iterator<Student> it = ts.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			System.out.println(stu.toString());
		}
		
	}

}
