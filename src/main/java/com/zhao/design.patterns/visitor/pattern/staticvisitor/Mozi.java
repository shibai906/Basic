package com.zhao.design.patterns.visitor.pattern.staticvisitor;

public class Mozi {

    public void ride(Horse horse){
        System.out.println("骑马");
    }

    public void ride(WhiteHorse whiteHorse) {
        System.out.println("骑白马");
    }

    public void ride(BlackHorse blackHorse) {
        System.out.println("骑黑马");
    }

    /*
        为什么出来都是骑马，因为是重载的特性
     */
    public static void main(String[] args) {
        Horse bh = new BlackHorse() ;
        Horse wh = new WhiteHorse() ;
        Horse h = new Horse() ;
        Mozi mozi = new Mozi() ;
        mozi.ride(bh);
        mozi.ride(wh);
        mozi.ride(h);

    }

}

class Horse{

}

class WhiteHorse extends Horse {

}

class BlackHorse extends Horse {

}

