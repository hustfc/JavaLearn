package com.fanc;

import java.util.*;
/**
 * @Author : fanc
 * @Date : 2019/10/30 5:07 下午
 */
public class Compile {
    public static void main(String[] args) {
        List<? extends Fruit> flist =
                Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0); // No warning
        flist.contains(new Apple()); // Argument is ‘Object’
        flist.indexOf(new Apple()); // Argument is ‘Object’

        //flist.add(new Apple());  // 无法编译

    }
}
