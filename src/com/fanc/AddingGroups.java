package com.fanc;

import java.util.ArrayList;
import java.util.Arrays;
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
    }
}
