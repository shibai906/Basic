package com.zhao.design.patterns.command.mode;

/*
    命令模式的关键在于引入抽象命令类，请求发送者针对抽象命令类编程，只有实现了抽象命令类的具体命令才与请求接收者相关联。在最简单的抽象命令类中只包含了一个抽象的execute()方法，每个具体命令类将一个Receiver类型的对象作为一个实例变量进行存储，从而具体指定一个请求的接收者，不同的具体命令提供了execute()方法的不同实现，并调用不同接收者的请求处理方法。
 */
public abstract class Command {

    public abstract void execute() ;

}
