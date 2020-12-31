package com.cl.yun.proxy.dynamic;

/**
 * @author 18611
 * @title: 被代理类
 * @date 2020/12/3115:21
 */
public class Bye implements ByeInterface {
    @Override
    public void sayBye() {
        System.out.println("bye dynamic proxy");
    }
}
