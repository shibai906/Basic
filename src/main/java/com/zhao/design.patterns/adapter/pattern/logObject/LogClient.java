package com.zhao.design.patterns.adapter.pattern.logObject;

import java.util.ArrayList;
import java.util.List;

public class LogClient {

    public static void main(String[] args){
        LogBean logBean = new LogBean() ;
        logBean.setLogId("1");
        logBean.setOpeUserId("michael");
        List<LogBean> list = new ArrayList<>() ;
        LogFileOperateApi logFileOperateApi = new LogFileOperate(null) ;

        // 创建操作日志的接口对象
        LogDbOpeApi api = new LogAdapter(logFileOperateApi) ;
        api.createLog(logBean);

    }

}
