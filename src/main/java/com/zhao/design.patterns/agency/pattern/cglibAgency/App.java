package com.zhao.design.patterns.agency.pattern.cglibAgency;

/*
    测试类
 */
public class App {

    public static void main(String args[]) {

        // 目标对象
        UserDao target = new UserDao() ;
        // 代理对象
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        // 执行代理对象的方法
        proxy.save();

        Love love = new Love();
        Love love1 = (Love) new ProxyFactory(love).getProxyInstance();
        love1.loveyou();

    }

}