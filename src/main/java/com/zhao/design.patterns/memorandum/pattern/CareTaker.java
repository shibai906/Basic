package com.zhao.design.patterns.memorandum.pattern;
// 管理者角色：负责管理备忘录类，只保存了一个备忘录对象，可以通过设值栈保存多个对象
public class CareTaker {

    private EmpMemento memento ;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
