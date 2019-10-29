package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/29 5:26 下午
 */
public class ThreeTuple<A, B, C> extends TowTuple<A, B> {
    public final C thrid;

    public ThreeTuple(A a, B b, C c) {
        // 没有默认的构造器，因此要显式构造
        super(a, b);
        thrid = c;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + thrid + ")";
    }
}
