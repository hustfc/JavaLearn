package com.fanc;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : fanc
 * @Date : 2019/10/29 9:16 下午
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for(T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("B", "C", "D");
        System.out.println(ls);
        ls = makeList("JFDLAJFLAFDJLAJFLA".split(""));
        System.out.println(ls);
    }
}
