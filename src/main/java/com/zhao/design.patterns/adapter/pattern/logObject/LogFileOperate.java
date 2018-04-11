package com.zhao.design.patterns.adapter.pattern.logObject;

import sun.rmi.runtime.Log;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
    实现对日志文件的操作
 */
public class LogFileOperate implements LogFileOperateApi {
    /*
        设置日志文件的路劲和文件名称
     */
    private String logFileName = "C:\\file.log" ;

    public LogFileOperate(String logFileName) {
        if(logFileName != null ){
            this.logFileName = logFileName ;
        }
    }

    @Override
    public List<LogBean> readLogFile() {
        File file = new File(logFileName) ;
        List<LogBean> list = new ArrayList<>();
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file)) ;
            while (oin.readBoolean()){
                LogBean logBean = (LogBean) oin.readObject();

            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        // 业务代码
        return list ;
    }

    @Override
    public void writeLogFile(List<LogBean> list) {

        File file = new File(logFileName) ;
        try {
            ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file)) ;
            for (LogBean logBean : list) {
                oout.writeObject(logBean);
            }

            oout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 业务代码

    }
}
