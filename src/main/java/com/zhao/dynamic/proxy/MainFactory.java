package com.zhao.dynamic.proxy;

public class MainFactory {

    public static void main(String[] args) {

        Factory factory = new ImpFactory();
        FactoryProxy proxy = new FactoryProxy(factory) ;
        Factory proxyObj = proxy.create() ;
//        ImpFactory impFactory = (ImpFactory) proxyObj;
        proxyObj.run();
//        impFactory.Test();

    }

}
