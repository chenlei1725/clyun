package com.cl.yun.proxy.sta;

/**
 * @author 18611
 * @title: 被代理类
 * @date 2020/12/3115:21
 */
public class Hello implements HelloInterface {
    @Override
    public void sayHello() {
        System.out.println("hello static proxy");
    }
}
