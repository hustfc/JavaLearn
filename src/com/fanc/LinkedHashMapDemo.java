package com.fanc;

import java.util.LinkedHashMap;

/**
 * @Author : fanc
 * @Date : 2019/11/4 7:38 下午
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "fjdla");
        linkedHashMap.put(2, "fda");
        linkedHashMap.put(3, "fjdla");
        linkedHashMap.put(4, "fda");
        linkedHashMap.put(5, "fea");
        System.out.println(linkedHashMap);
        LinkedHashMap<Integer, String> linkMap = new LinkedHashMap<>(16, 0.75f, true);
        linkMap.putAll(linkedHashMap);
        System.out.println(linkMap);
        for (int i = 1; i <= 3; i ++) {
            linkMap.get(i);
        }
        System.out.println(linkMap);

    }
}
