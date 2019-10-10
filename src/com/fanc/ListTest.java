package com.fanc;

import java.util.*;

/**
 * @Author : fanc
 * @Date : 2019/10/10 8:48 下午
 */
public class ListTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // LinkedList有一个更多的方法，因此不需要向上转型
        LinkedList<Integer> list2 = new LinkedList<>(list1);
        System.out.println(list2);
        System.out.println(list2.contains(2));
        list2.addFirst(0);
        System.out.println(list2.peek());
        list2.addLast(8);
        list2.removeFirst();
        System.out.println(list2.getLast());
        System.out.println(list2.element());
        System.out.println(list2.poll());
        Queue<Integer> queue = new LinkedList<>(list2);
    }

}
