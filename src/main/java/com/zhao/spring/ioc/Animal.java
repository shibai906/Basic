package com.zhao.spring.ioc;

import java.util.HashMap;
import java.util.Map;

public class Animal {
    private String name ;
    private String type ;
    private Map<String,Object> properties = new HashMap<>() ;
    public void say(){
        System.out.println("I " + name + " say");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}
