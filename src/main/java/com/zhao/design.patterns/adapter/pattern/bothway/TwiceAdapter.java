package com.zhao.design.patterns.adapter.pattern.bothway;

public class TwiceAdapter implements AdapteePort,Target {

    private Adaptee adaptee ;
    private Adapter adapter ;

    public TwiceAdapter(Adapter adapter , Adaptee adaptee ){
        this.adaptee = adaptee ;
        this.adapter = adapter ;
    }

    @Override
    public void specificRequest() {

    }

    @Override
    public void request() {

    }
}
