package com.zhao.design.patterns.command.mode.tier;

public class CodeCommand extends Command {

    public CodeCommand(WorkMan workMan) {
        super.workMan = workMan ;
    }

    @Override
    public void execute() {
        super.workMan.work(); // 工作
        super.workMan.writeDocument(); // 写文档
        super.workMan.overWork(); // 加班
    }
}
