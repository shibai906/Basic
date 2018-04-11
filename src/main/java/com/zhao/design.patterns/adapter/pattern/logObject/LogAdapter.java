package com.zhao.design.patterns.adapter.pattern.logObject;

import java.util.ArrayList;
import java.util.List;

public class LogAdapter implements LogDbOpeApi {

    private LogFileOperateApi adptee ;
    public LogAdapter(LogFileOperateApi adptee) {
        this.adptee = adptee ;
    }

    @Override
    public void createLog(LogBean logBean) {
        List<LogBean> list = new ArrayList<>() ;
        list.add(logBean) ;
        adptee.writeLogFile(list);
        List<LogBean> logBeans = adptee.readLogFile();
        for ( LogBean logBean1 : logBeans) {
            System.out.println(logBean1);
        }
    }
}
