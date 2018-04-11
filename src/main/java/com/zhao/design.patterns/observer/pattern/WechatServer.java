package com.zhao.design.patterns.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {

    private List<Observer> list ;
    private String message ;

    public WechatServer() {
        list = new ArrayList<Observer>() ;
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o) ;
    }

    @Override
    public void removeObserver(Observer o) {
        int i = list.indexOf(o) ;
        if(i >= 0 ) {
            list.remove(o) ;
        }

    }

    @Override
    public void notifyObserver() {
        for(int i = 0 ; i < list.size() ; i ++) {
            Observer server = list.get(i) ;
            server.update(message);
        }
    }


    // 这里是最重要的代码地方，这个地方该，基本所有地方都就改了。
    public void setInformation(String s) {
        this.message = s ;
        System.out.println("屁信服务更新消息：" + s);
        // 消息更新，通知所有观察者
        notifyObserver();
    }

}
