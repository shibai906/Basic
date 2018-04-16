package com.zhao.design.patterns.prototype.pattern.object.clone;

public class ConcretePrototype implements Cloneable {


    private Prototype prototype ;
    public ConcretePrototype(Prototype prototype) {
        this.prototype = prototype ;
    }


    public Prototype clone(){

        Prototype object = null;
        try {
            object = prototype.clone() ;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype) object ;

    }

}
