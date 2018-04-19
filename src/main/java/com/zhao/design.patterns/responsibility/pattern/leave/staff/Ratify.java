package com.zhao.design.patterns.responsibility.pattern.leave.staff;

import com.sun.net.httpserver.Filter;

/*
    其实这个接口是单独定义还是内部接口是没有太大关系的，但是考虑到Chain接口与Ratify接口的关系为提高内聚性就定义为内部接口了。定义Ratify接口是为了处理Request。责任链接口的精髓之处在于：转发功能及可动态扩展“责任人”，这个接口中定义了两个方法，一个是request()就是为了获取request，如果当前Ratify的实现类获取到request之后发现自己不能处理或者说自己只能处理部分请求，那么他将自己的那部分能处理的就处理掉，然后重新构建一个或者直接转发Request给下一个责任人。
 */

/*
    接口描述：处理请求
 */
public interface Ratify {

    // 处理请求
    public Result deal (Chain chain ) ;

    /*
        接口模式：对request和Result封装，用来转发
     */
    interface Chain{

        // 获取当前request
        Request request() ;

        // 转发request
        Result proceed(Request request) ;

    }

}
