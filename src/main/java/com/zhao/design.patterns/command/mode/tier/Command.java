package com.zhao.design.patterns.command.mode.tier;

public abstract class Command {

    protected WorkMan workMan  ; // 定义一个程序员

    /*
        执行命令
     */
    public abstract void execute() ;

}
