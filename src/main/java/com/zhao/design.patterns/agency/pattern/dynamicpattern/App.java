package com.zhao.design.patterns.agency.pattern.dynamicpattern;

/*
    测试类
 */
public class App {

    /*
        这里需要跑通必须要是接口
     */
    public static void main(String[] args) {
        // 目标对象
        User user = new UserImp() ;
        System.out.println(user.getClass());

        // 给目标对象，创建代理对象，这里必须要是接口
        User proxy = (User) new ProxyFactory(user).getProxyInstance();
        // 内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法 【代理对象】
        proxy.sayUser();

    }


}
