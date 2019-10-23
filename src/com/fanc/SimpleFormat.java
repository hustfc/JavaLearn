package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/22 4:44 下午
 */
public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.3;
        System.out.printf("%d %f\n", x, y);
        System.out.format("%d %f\n", x, y);
    }
}
