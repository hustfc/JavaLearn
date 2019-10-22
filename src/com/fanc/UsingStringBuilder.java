package com.fanc;

import java.util.Random;

/**
 * @Author : fanc
 * @Date : 2019/10/22 4:04 下午
 */
public class UsingStringBuilder {
    public static Random rand = new Random(47);

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
        String string = usb.toString();
        System.out.println(string.charAt(3));
    }
}
