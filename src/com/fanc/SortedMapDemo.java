package com.fanc;

import java.util.*;
/**
 * @Author : fanc
 * @Date : 2019/11/4 7:24 下午
 */
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.firstKey();
        sortedMap.lastKey();
        sortedMap.subMap(1, 4);
        sortedMap.headMap(4);
        sortedMap.tailMap(1);
    }
}
