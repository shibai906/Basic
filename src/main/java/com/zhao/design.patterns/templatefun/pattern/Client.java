package com.zhao.design.patterns.templatefun.pattern;

public class Client {

    public static void main(String[] args) {

        Student student = new Student() ;
        student.prepareGotoSchool();

        Teacher teacher = new Teacher() ;
        teacher.prepareGotoSchool();

    }

}
