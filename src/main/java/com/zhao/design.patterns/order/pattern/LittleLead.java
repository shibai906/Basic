package com.zhao.design.patterns.order.pattern;

public class LittleLead {

    private Command command ;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() { // 小领导执行命令，小领导在叫你加班
        command.execute();
    }

}
