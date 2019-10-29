package com.fanc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author : fanc
 * @Date : 2019/10/28 9:28 下午
 */

public class DynamicProxy implements InvocationHandler {
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(proxy, args);
        System.out.println("after");
        return result;
    }
}

