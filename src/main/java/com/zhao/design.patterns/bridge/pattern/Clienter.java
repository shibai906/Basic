package com.zhao.design.patterns.bridge.pattern;

public class Clienter {

    public static void main(String[] args) {

        AreaA a = new AreaA2() ;
        a.qiao = new AreaB3() ;
        a.fromAreaA();
        a.qiao.targetAreaB();

    }

}
