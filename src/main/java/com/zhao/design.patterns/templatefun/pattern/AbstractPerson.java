package com.zhao.design.patterns.templatefun.pattern;

public abstract class AbstractPerson {

    // 抽象类定义整个流程骨架
    public void prepareGotoSchool() {
        dreeUp();
        eatBreakfast();
        takeThings();
    }

    // 下面是不同子类根据自身特征完成的具体步骤
    protected abstract void dreeUp() ;
    protected abstract void eatBreakfast() ;
    protected abstract void takeThings() ;


}
