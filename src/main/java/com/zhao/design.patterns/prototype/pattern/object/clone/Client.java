package com.zhao.design.patterns.prototype.pattern.object.clone;

public class Client {

    public static void main(String args[]) {

        Prototype prototype = new Prototype() ;
        prototype.setName("赵欢");

        ConcretePrototype concretePrototype = new ConcretePrototype(prototype) ;
        Prototype prototype1 = concretePrototype.clone() ;
        System.out.println(prototype1.getName());

    }

}
