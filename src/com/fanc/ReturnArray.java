package com.fanc;

import java.util.Arrays;

/**
 * @Author : fanc
 * @Date : 2019/10/31 7:33 下午
 */
public class ReturnArray {
    public static String[] getArray() {
        String[] string = new String[] {"111", "222"};
        return string;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray()));
    }
}
