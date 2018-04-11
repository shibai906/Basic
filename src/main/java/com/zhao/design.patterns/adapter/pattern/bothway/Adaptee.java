package com.zhao.design.patterns.adapter.pattern.bothway;

/*
    已经存在的接口，这个接口需要配置
 */
public class Adaptee implements AdapteePort {

    /*
        原本存在的方法
     */
    @Override
    public void specificRequest(){
        // 业务代码
        System.out.println("这里是创建适配器业务代码的地方");
    }

}
