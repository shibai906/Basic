package com.zhao.design.patterns.agency.pattern.staticpattern;

public class Client {

    public static void main(String[] args) {
        ProxySubject subject = new ProxySubject(new RealSubject()) ;
        subject.visit();
    }

}
