package com.zhao.design.patterns.builder.pattern;

public class PersonDirector {

    public Person constructPersion(PersonBuilder pb) {
        // 建造出来
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }

}
