package com.fanc;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author : fanc
 * @Date : 2019-09-23 22:09
 */

abstract class Instrument {
    public abstract void play(int n);
    public abstract void adjust();
    public String what() {
        return "Instrument";
    }
}

class Wind extends Instrument {
    @Override
    public void play(int n) {
        System.out.println("Wind.play()" + n);
    }

    @Override
    public void adjust() {
        System.out.println("adjust in wind");
    }

    @Override
    public String what() {
        return "Wind";
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Wind wind = new Wind();
        wind.play(1);
    }
}
