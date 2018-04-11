package com.zhao.design.patterns.adapter.pattern.logObject;

public interface LogDbOpeApi {

    /*
        新增日志
        @param 需要新增日志对象
     */
    public void createLog(LogBean logBean) ;

}
