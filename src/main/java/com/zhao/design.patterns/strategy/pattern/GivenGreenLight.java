package com.zhao.design.patterns.strategy.pattern;
/*
    第二妙计，求吴国太开绿灯
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行!");
    }
}
