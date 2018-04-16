package com.zhao.design.patterns.prototype.pattern.object.clone;

public class Prototype implements Cloneable {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
