package com.zhao.design.patterns.flyweight.pattern;

public class Clienter {

    public static void main(String[] args) {

        for(int i = 1 ; i <= 5 ; i ++){
            String yundong = "足球" + i ;
            TiYuGuan tyg = JianZhuFactory.getTyg(yundong);
            tyg.setName("中国体育馆");
            tyg.setShape("圆形");
            tyg.use();
            System.out.println("对象池中对象数量为："+JianZhuFactory.getSize());

        }
    }

}
