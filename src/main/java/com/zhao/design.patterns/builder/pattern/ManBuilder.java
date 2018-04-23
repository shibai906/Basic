package com.zhao.design.patterns.builder.pattern;

public class ManBuilder implements PersonBuilder {

    Person person ;

    public ManBuilder(){
        person = new Person() ; // 创建persion实例，防止空指针一场
    }

    @Override
    public void buildHead() {
        person.setHead("建造身体头部");
    }

    @Override
    public void buildBody() {
        person.setBody("建造身体部分");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造四肢部分");
    }

    @Override
    public Person buildPerson() {
        return person; // 返回一个persion实例
    }
}
