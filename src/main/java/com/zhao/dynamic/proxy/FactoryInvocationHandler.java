package com.zhao.dynamic.proxy;

import com.zhao.dynamic.proxy.Factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FactoryInvocationHandler implements InvocationHandler {

    private Factory factory ;
    public FactoryInvocationHandler(Factory factory){
        this.factory = factory ;
    }

/*    public FactoryInvocationHandler(){

    }*/

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("--before running ...");
     //   Object ret = method.invoke()
        Object ret = method.invoke(factory,args) ;

    //  使用下面这个方式，会产生死循环。
    //    ((Factory)proxy).run();
        System.out.println("--after running ...");
        return ret;
        //    return null ;
    }
}
