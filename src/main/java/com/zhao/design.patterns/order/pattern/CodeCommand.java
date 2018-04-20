package com.zhao.design.patterns.order.pattern;

public class CodeCommand extends Command {
    @Override
    public void execute() {
        super.codeWorkMan.work(); // 工作
        super.codeWorkMan.overWork(); // 加班
        super.codeWorkMan.writeDocument(); // 写文档


    }
}
