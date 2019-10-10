package com.fanc;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.*;

/**
 * @Author : fanc
 * @Date : 2019/10/10 9:38 下午
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        List<String> fact = new LinkedList<>(Arrays.asList("F J D L A J L N L G".split(" ")));
        // 通过Collection的构造方法
        PriorityQueue<String> queue1 = new PriorityQueue<>(fact);
        System.out.println(queue1);
        // 通过size和comparator的构造方法
        PriorityQueue<String> queue2 = new PriorityQueue<>(fact.size(), Collections.reverseOrder());
        queue2.addAll(fact);
        System.out.println(queue2);
        System.out.println(queue2.offer("B"));
        System.out.println(queue2.peek());
        System.out.println(queue2);
        System.out.println(queue2.offer("Z"));
        System.out.println(queue2);
        System.out.println(queue2.peek());
    }
}
