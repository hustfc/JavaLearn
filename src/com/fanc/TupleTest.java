package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/29 5:39 下午
 */
public class TupleTest {
    static TowTuple<String, Integer> f() {
        return new TowTuple<>("aaa", 22);
    }
    static ThreeTuple<String, Integer, Double> g() {
        return new ThreeTuple("aaa", 3333, 3.24);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(g());
    }
}
