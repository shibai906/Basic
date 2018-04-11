package com.zhao.design.patterns.observer.pattern;

/*
    抽象被观察者的接口
    声明了添加、删除、通知观察者方法
 */
public interface Observerable {

    public void registerObserver(Observer o) ;
    public void removeObserver(Observer o) ;
    public void notifyObserver() ;

}
