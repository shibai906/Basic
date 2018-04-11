package com.zhao.design.patterns.strategy.pattern;

/*
    计谋有了，这里需要锦囊
 */
public class Context {

    // 构造函数，选择使用那个妙计
    private IStrategy strategy ;
    public Context(IStrategy strategy){
        this.strategy = strategy ;
    }

    // 使用计谋了，出招
    public void operate() {
        this.strategy.operate();
    }

}
