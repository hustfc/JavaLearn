package com.fanc;

import java.util.*;

/**
 * @Author : fanc
 * @Date : 2019/10/10 9:08 下午
 */
public class SetTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, 1, 2, 4, 5, 5, 6, 6, 7, 8);
        System.out.println(list);
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }

}
