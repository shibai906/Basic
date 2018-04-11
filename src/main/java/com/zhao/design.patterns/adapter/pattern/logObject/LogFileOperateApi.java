package com.zhao.design.patterns.adapter.pattern.logObject;

import java.util.List;

/*
    读取日志文件，从文件里面获取存储的日志列表对象
    存储的日志列表对象
 */
public interface LogFileOperateApi {

    public List<LogBean> readLogFile() ;

    /*
        写日志文件，把日志列表写出到日志文件中去
        @param list 要写到日志文件的日志列表
     */
    public void writeLogFile(List<LogBean> list) ;


}
