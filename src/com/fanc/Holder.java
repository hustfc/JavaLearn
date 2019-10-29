package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/29 5:08 下午
 */
public class Holder<T> {
    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder<Integer> a = new Holder(1);
        Integer x = a.get();
        System.out.println(x);
    }
}
