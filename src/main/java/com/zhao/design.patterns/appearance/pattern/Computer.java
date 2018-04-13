package com.zhao.design.patterns.appearance.pattern;

public class Computer {

    private CPU cpu ;
    private Memory memory ;
    private Disk disk ;

    public Computer() {
        cpu = new CPU() ;
        memory = new Memory() ;
        disk = new Disk() ;
    }

    public void start() {
        cpu.start();
        memory.start();
        disk.start();
    }

    public void shutDown(){
        cpu.shutDown();
        memory.shutDown();
        disk.shutDown();
    }

}
