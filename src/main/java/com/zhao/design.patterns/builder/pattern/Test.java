package com.zhao.design.patterns.builder.pattern;

public class Test {

    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector() ;
        Person person = pd.constructPersion(new ManBuilder()) ;
        System.out.println(person.toString());
    }

}
