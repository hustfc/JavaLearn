package com.fanc;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @Author : fanc
 * @Date : 2019/10/22 5:10 下午
 */
public class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y) {
        formatter.format("%s The turtle is at (%d, %d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outType = System.out;
        Turtle tommy = new Turtle("Tommy", new Formatter(outType));
        Turtle terry = new Turtle("Terry", new Formatter(System.err));
        tommy.move(1, 2);
        terry.move(2, 3);
        tommy.move(1, 3);
        terry.move(4, 5);
    }
}
