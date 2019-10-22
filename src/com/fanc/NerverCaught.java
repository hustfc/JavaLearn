package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/21 9:51 下午
 */
public class NerverCaught {
    static void f() {
        try {
            throw new RuntimeException("From f()");
        } catch (RuntimeException e) {
            System.out.println("catch runtime exception");
        }
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
