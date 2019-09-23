package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019-09-23 19:43
 */
public class MyOver extends PrivateOverride{
    @Override
    public void f() {
        System.out.println("f in child");
    }

    public static void main(String[] args) {
        PrivateOverride test = new MyOver();
        test.f();
    }
}
