package com.zhao.design.patterns.command.mode.army;

public class Invoker {

    private Command command ;

    public Invoker(Command command) {
        this.command = command ;
    }

    public void action() {
        command.exe();
    }

}
