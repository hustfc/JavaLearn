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
    }
}
