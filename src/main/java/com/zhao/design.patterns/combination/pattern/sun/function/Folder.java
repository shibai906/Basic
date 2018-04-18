package com.zhao.design.patterns.combination.pattern.sun.function;

import java.util.ArrayList;

public class Folder implements AbstractFile {

    // 定义集合fileList，用于存储AbstractFile类型的成员
    private ArrayList<AbstractFile> fileList = new ArrayList<>() ;
    private String name ;

    public Folder(String name) {
        this.name = name ;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file) ;
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file) ;
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒"); //模拟杀毒

        // 递归调用成员构建的killVirus()方法
        for(AbstractFile object : fileList) {
            object.killVirus();
        }

    }
}
