package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/29 10:04 下午
 */
public class Tuple {
    public static <A, B> TowTuple<A, B> tuple(A a, B b) {
        return new TowTuple<>(a, b);
    }
    public static <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c) {
        return new ThreeTuple<>(a, b, c);
    }

    public static void main(String[] args) {
        System.out.println(tuple("13", 123));
        System.out.println(tuple("32", 4232, 1.2F));
    }
}
