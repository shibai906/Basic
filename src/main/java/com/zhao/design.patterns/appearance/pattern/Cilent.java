package com.zhao.design.patterns.appearance.pattern;

/*
    客户端
 */
public class Cilent {

    public static void main(String[] args) {
        Computer computer = new Computer() ;
        computer.start();
        System.out.println("=================");
        computer.shutDown();
    }

}
