package com.zhao.Collection.Set.Sort;

public class Student implements Comparable<Student> {

	private String name;
	private int age;
	private float exam;

	public Student() {
		super();
	}

	public Student(String name, int age, float exam) {
		super();
		this.name = name;
		this.age = age;
		this.exam = exam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getExam() {
		return exam;
	}

	public void setExam(float exam) {
		this.exam = exam;
	}

	@Override
	public int compareTo(Student o) {

		int num = 0;
		num = this.age - o.getAge();
		if (num == 0) {
			num = this.name.compareTo(o.getName());
		}

		return num;

	}

	@Override
	public String toString() {
		return "name:" + name + ",age:" + age + ",exam" + exam;
	}

}
