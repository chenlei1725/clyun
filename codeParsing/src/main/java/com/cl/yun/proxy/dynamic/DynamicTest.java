package com.cl.yun.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 18611
 * @title: Test
 * @date 2020/12/31 15:54
 */
public class DynamicTest {

    public static void main(String[] args) {

        ByeInterface Bye = new Bye();
        /**
         * 代理程序控制器 InvocationHandler
         */
        InvocationHandler handler = new ProxyHandler(Bye);
        /**
         * 通过Proxy类的静态方法 newProxyInstance 返回一个接口的代理实例，
         * 针对不同的代理类，传入相应的代理程序控制器 InvocationHandler
         */
        ByeInterface proxyHello = (ByeInterface) Proxy.newProxyInstance(Bye.getClass().getClassLoader(),Bye.getClass().getInterfaces(),handler);
        proxyHello.sayBye();
    }

}
