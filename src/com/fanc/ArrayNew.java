package com.fanc;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author : fanc
 * @Date : 2019-09-20 17:25
 */
public class ArrayNew {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a1 = new int[rand.nextInt(30)];
        System.out.println(Arrays.toString(a1));
        int[] a2 = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(a2));
        int[] a3 = {4, 5, 6};
        System.out.println(Arrays.toString(a3));
        for (int a : a1) {
            System.out.println(a);
        }

    }
}
