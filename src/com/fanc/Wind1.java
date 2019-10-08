package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019-09-23 22:47
 */
public class Wind1 implements Instru {
    @Override
    public void play(int n) {
        System.out.println(this + " play()." + n);
    }

    @Override
    public void adjust() {

    }

    @Override
    public String toString() {
        return "Wind***";
    }

    public static void main(String[] args) {
        Wind1 wind1 = new Wind1();
        wind1.play(3);
    }
}
