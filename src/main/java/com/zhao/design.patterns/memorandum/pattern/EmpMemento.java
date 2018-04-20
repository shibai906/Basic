package com.zhao.design.patterns.memorandum.pattern;

public class EmpMemento {

    private String name ;
    private int age ;
    private int salary ;

    public EmpMemento(Emp emp) {
        this.age = emp.getAge() ;
        this.name = emp.getName() ;
        this.salary = emp.getSalary() ;
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
