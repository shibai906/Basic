package com.zhao.design.patterns.command.mode.tier;

public class Client {

    public static void main(String[] args) {

        CodeWorkMan codeWorkMan = new CodeWorkMan() ;
        Command command = new CodeCommand(codeWorkMan) ; // 命令
        LittleLead lead = new LittleLead() ; // 小领导
        lead.setCommand(command);
        lead.action();

    }

}
