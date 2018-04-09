package com.zhao.dynamic.proxy;

public class ImpFactory implements Factory {
    public void run() {
        System.out.println("ImpFactory is running");
    }

    public void Test(){
        System.out.println("Test is running");
    }

}
