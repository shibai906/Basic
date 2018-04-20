package com.zhao.design.patterns.memorandum.pattern;

// 发起者角色
public class Emp {

    private String name ;
    private int age ;
    private int salary ;

    // 进行备份操作，并返回一个备忘录对象
    public EmpMemento memento() {
        return new EmpMemento(this) ;
    }

    public void recovery(EmpMemento em) {
        this.age = em.getAge() ;
        this.name = em.getName() ;
        this.salary = em.getSalary() ;
    }

    public Emp(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
