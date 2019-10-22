package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/22 4:27 下午
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "JFDLAJLGJFLA";
        byte[] bytes = a.getBytes();
        System.out.println(bytes);
        char[] chars = a.toCharArray();
        System.out.println(chars);
    }


}
