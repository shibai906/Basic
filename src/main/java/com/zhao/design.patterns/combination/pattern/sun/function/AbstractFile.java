package com.zhao.design.patterns.combination.pattern.sun.function;

/*
    抽象文件类：抽象构建
        之前使用的是
 */
public interface AbstractFile {

    public abstract void add(AbstractFile file) ;
    public abstract void remove(AbstractFile file) ;
    public abstract AbstractFile getChild(int i) ;
    public abstract void killVirus() ;


}
