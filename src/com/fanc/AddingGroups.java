package com.fanc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author : fanc
 * @Date : 2019/10/8 10:36 下午
 */
public class AddingGroups {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Integer[] moreInts = {7, 8, 9, 10};
        list1.addAll(Arrays.asList(moreInts));
        System.out.println(list1);
        Collections.addAll(list1, 11, 12, 13, 14, 15);
        System.out.println(list1);
        Collections.addAll(list1, moreInts);
        System.out.println(list1);
        list1.add(99);
        System.out.println(list1);
        // 使用这种情况的时候，底层表示仍然是数组，因此不能调整尺寸
        List<Integer> list2 = Arrays.asList(16, 17, 18, 19, 20);
        // 更改元素，不调整尺寸没问题
        list2.set(1, 99);
        System.out.println(list2);
        // 调整尺寸，有问题
        list2.add(21);
        System.out.println(list2);
    }
}
