package com.zhao.design.patterns.command.mode;

/*
    对于请求发送者即调用者而言，将针对抽象命令类进行编程，可以通过构造注入或者设值注入的方式在运行时传入具体命令类对象，并在业务方法中调用命令对象的execute()方法。
 */
public class Invoker {

    private Command command;

    // 构造注入
    public Invoker(Command command) {
        this.command = command;
    }

    // 设值注入
    public void setCommand(Command command) {
        this.command = command;
    }

    // 业务方法，用于调用命令类的execute()方法
    public void call() {
        command.execute();
    }

}
