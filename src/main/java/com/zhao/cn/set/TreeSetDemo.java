package com.zhao.cn.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {

		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num;
				num = add(o1.getExam()) - add(o2.getExam());
				System.out.println(add(o1.getExam()) + "---" + add(o2.getExam()));
				if (num == 0) {
					num = o1.getName().compareTo(o2.getName());
				}
				return num;
			}

			private int add(Integer[] in) {
				int tatol = 0;
				if (in == null)
					return 0;
				for (int i = 0; i < in.length; i++) {
					tatol += in[i];
				}
				return tatol;
			}
		});
		Student st1 = new Student();
		st1.setName("zhaohuan");
		Integer[] in1 = { 89, 98, 78, 98 };
		st1.setExam(in1);
		set.add(st1);

		Student st2 = new Student();
		st2.setName("jiakaidi");
		Integer[] in2 = { 99, 98, 88, 98 };
		st2.setExam(in2);
		set.add(st2);

		Student st3 = new Student();
		st3.setName("sundan");
		Integer[] in3 = { 82, 18, 28, 58 };
		st3.setExam(in3);
		set.add(st3);

		Student st4 = new Student();
		st4.setName("zhaohuan");
		Integer[] in4 = { 89, 98, 78, 98 };
		st4.setExam(in4);
		set.add(st4);

		for (Student s : set) {
			System.out.println(s.getName() + "---" + Arrays.toString(s.getExam()));
		}
	}
}
