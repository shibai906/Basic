package com.zhao.design.patterns.order.pattern;

public class CodeWorkMan extends WorkMan {
    @Override
    public void writeDocument() {
        System.out.println("写文档中。。。。。。");
    }

    @Override
    public void work() {
        System.out.println("叫你上班就上班，别废话。。。。。。");
    }

    @Override
    public void overWork() {
        System.out.println("领导一句话加班，加班中。。。。。。");
    }
}
