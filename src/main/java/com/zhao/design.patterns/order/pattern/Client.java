package com.zhao.design.patterns.order.pattern;

public class Client {
    public static void main(String args[]) { // 领导发出命令，并不用关心你的工作，发出命令就可以。
        Command command = new CodeCommand() ; //命令
        LittleLead lead = new LittleLead() ; // 小领导
        lead.setCommand(command);
        lead.action();

    }
}
