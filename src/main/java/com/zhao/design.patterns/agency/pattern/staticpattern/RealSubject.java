package com.zhao.design.patterns.agency.pattern.staticpattern;

public class RealSubject implements Subject {
    private String name = "biying" ;
    @Override
    public void visit() {
        System.out.println(name);
    }
}
