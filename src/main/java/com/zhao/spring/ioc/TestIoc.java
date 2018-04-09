package com.zhao.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Map;

public class TestIoc {

    public static void main(String args[]){

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
                "C:\\Users\\zhaoh\\IdeaProjects\\Basic\\src\\main\\resources\\spring\\beans.xml");
        Animal animal = (Animal) applicationContext.getBean("animal");
        animal.say();
        System.out.println(animal.getType());
        Map<String , Object> maps = animal.getProperties();

        for(Map.Entry<String , Object> map : maps.entrySet()) {

            System.out.println("key:" + map.getKey());
            System.out.println("value:" + map.getValue());

        }


    }

}
