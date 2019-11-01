package com.fanc;

import java.util.Arrays;

/**
 * @Author : fanc
 * @Date : 2019/10/31 8:38 下午
 */
public class CompareArrays {
    public static void main(String[] args) {
        int [] a1 = new int[10];
        int [] a2 = new int[10];
        Arrays.fill(a1, 3);
        Arrays.fill(a2, 3);
        System.out.println(Arrays.equals(a1, a2));
        String[] s1 = new String[4];
        Arrays.fill(s1, "hello");
        String[] s2 = {new String("hello"), new String("hello"), new String("hello"), new String("hello")};
        System.out.println(Arrays.equals(s1, s2));
    }
}
