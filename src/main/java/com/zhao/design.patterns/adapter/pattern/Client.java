package com.zhao.design.patterns.adapter.pattern;


/*
    使用适配器的客户端
 */
public class Client {

    public static void main(String[] args){
        // 创建需要被适配的对象
        Adaptee adaptee = new Adaptee() ;
        Target target = new Adapter(adaptee) ;
        target.request();
    }

}
