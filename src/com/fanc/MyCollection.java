package com.fanc;
import java.util.*;
/**
 * @Author : fanc
 * @Date : 2019/10/30 5:19 下午
 */
public class MyCollection {
    public static <T> void copy(List<? super T> dest, List<? extends T> src)
    {
        for (int i=0; i<src.size(); i++) {
            dest.set(i,src.get(i));
        }
    }

    public static void main(String[] args) {
        List<? extends Fruit> fruits = Arrays.asList(new Apple(), new Apple());
        System.out.println(fruits.get(0));
        // 合法
        //fruits.add(null);

        // 不合法
        //fruits.add(new Apple());

        List<? super Apple> apples = new LinkedList<>(Arrays.asList(new Apple(), new Jonathan()));
        apples.add(new Apple());
        apples.add(new Jonathan());
        System.out.println(apples);


    }
}


