package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019-09-23 20:45
 */

class Useful {
    public void f() {
        System.out.println("1");
    }
    public void g() {}
}

class MoreUseful extends Useful {
    @Override
    public void f() {
        System.out.println("2 ");
    }

    @Override
    public void g() {}

    public void u() {}
}
public class RTTI {
    public static void main(String[] args) {
        // 向上转型
        Useful[] x = {new Useful(), new MoreUseful()};
        // ok
        ((MoreUseful)x[1]).u();
        // 异常
        ((MoreUseful)x[0]).u();
    }
}
