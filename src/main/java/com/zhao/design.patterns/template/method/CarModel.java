package com.zhao.design.patterns.template.method;

public abstract class CarModel {

     abstract void start() ;

     abstract void stop() ;


    public void excet() {
        start();
        stop();
    }


}
