package com.zhao.design.patterns.visitor.pattern.dynamic.visitor;

public class Client {

    public static void main(String[] args) {
        Horse h = new BlackHorse() ;
        h.eat();
    }

}
