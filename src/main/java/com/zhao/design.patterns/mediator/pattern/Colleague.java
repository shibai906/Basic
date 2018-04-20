package com.zhao.design.patterns.mediator.pattern;

public class Colleague {

    protected String name ;
    protected Mediator mediator ;

    public Colleague(String name ,Mediator mediator) {
        this.mediator = mediator ;
        this.name = name ;
    }


}
