package com.zhao.dynamic.proxy;

import java.lang.reflect.Proxy;

public class FactoryProxy {


    private Factory factory ;

    public FactoryProxy(Factory factory){
        this.factory = factory ;
    }

    public Factory create(){

        final Class<?>[] interfaces = new Class[]{Factory.class} ;
        final FactoryInvocationHandler handler = new FactoryInvocationHandler(factory);


        /*
            ClassLoader loader：指定当前目标对象使用类加载器，获取加载器的方法是固定的。
            Class<?>[] interfaces：目标对象实现的接口的类型，使用泛型方式确认类型
            InvocationHandler h：事件处理，执行目标对象的方法时，会触发事件处理器的方法，会把当前执行目标对象的方法作为参数传入。
         */
        return (Factory) Proxy.newProxyInstance(Factory.class.getClassLoader(),interfaces,handler);
    }

}
