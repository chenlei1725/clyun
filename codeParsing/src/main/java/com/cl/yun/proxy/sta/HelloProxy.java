package com.cl.yun.proxy.sta;

/**
 * @author 18611
 * @title: 代理类
 * @date 2020/12/31 15:24
 */
public class HelloProxy implements HelloInterface{

    private HelloInterface helloInterface = new Hello();

    @Override
    public void sayHello() {
        System.out.println("before invoke sayHello");
        helloInterface.sayHello();
        System.out.println("after invoke sayHello");
    }
}
