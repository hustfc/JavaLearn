package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019-09-15 23:04
 */
public class BinaryTest {
    public static void main(String[] args) {
        int i1 = 0x2f;
        int i2 = 0177;
        System.out.println(i1);
        System.out.println(Integer.toString(i1));
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toBinaryString(i2));
        String string = Integer.toBinaryString(i1);
        System.out.println(string.charAt(2));
        long n1 = 1111L;
        System.out.println(Long.toBinaryString(n1));

    }
}
