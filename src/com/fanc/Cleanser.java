package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019-09-21 16:32
 */
public class Cleanser {
    private String s;
    public Cleanser() {
        System.out.println("s:" + s);
        s = "Cleanser";
    }
    public void append(String a ) {
        s += a;
    }
    public void scrub() {
        append(" scrub() ");
    }
    public void dilute() {
        append(" dilute() ");
    }
    public void apply() {
        append(" apply() ");
    }

    @Override
    public String toString() {
        return s;
    }
}
