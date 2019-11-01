package com.fanc;

import java.util.Arrays;

/**
 * @Author : fanc
 * @Date : 2019/10/31 8:03 下午
 */
public class FillingArrays {
    public static void main(String[] args) {
        int size = 6;
        byte[] a1 = new byte[size];
        Arrays.fill(a1, (byte)11);
        System.out.println(Arrays.toString(a1));
        String[] a2 = new String[size];
        Arrays.fill(a2, "Hello");
        System.out.println(Arrays.toString(a2));
        Arrays.fill(a2, 2, 4, "World");
        System.out.println(Arrays.toString(a2));
    }
}
