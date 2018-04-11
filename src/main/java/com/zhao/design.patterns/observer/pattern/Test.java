package com.zhao.design.patterns.observer.pattern;

public class Test {

    public static void main(String[] args) {

        WechatServer server = new WechatServer() ;

        Observer userZhao = new User("zhaohuan") ;
        Observer userLiu = new User("liuxiaohan") ;
        Observer userZhang = new User("zhangyanxing") ;

        server.registerObserver(userLiu);
        server.registerObserver(userZhao);
        server.registerObserver(userZhang);
        server.setInformation("PHP时世界上最垃圾的语言，没有之一，包括微信");

        System.out.println("------------------------------------");
        server.removeObserver(userZhang);
        server.setInformation("Java时世界上公认最好用的语言！");

    }

}
