package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/29 5:20 下午
 */
public class TowTuple<A, B> {
    public final A first;
    public final B second;
    public TowTuple(A a, B b) {
        first = a;
        second = b;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
