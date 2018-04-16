package com.zhao.design.patterns.command.mode.tier;

public class LittleLead {

    private Command command ;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute(); // 小领导执行命令，小领导叫员工执行
    }

}
