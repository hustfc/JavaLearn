package com.fanc;

import java.lang.reflect.Proxy;

/**
 * @Author : fanc
 * @Date : 2019/10/28 10:40 下午
 */
public class ProxyTest {
    public static void main(String[] args) {
        DynamicProxy inter = new DynamicProxy(new Vendor());
        Sell sell = (Sell)(Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[] {Sell.class}, inter));
        // 调用代理类的方法，实际上会转变成为对invoke的调用
        sell.sell();
        sell.ad();
    }
}
