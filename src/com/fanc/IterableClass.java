package com.fanc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

/**
 * @Author : fanc
 * @Date : 2019/10/10 10:26 下午
 */
public class IterableClass implements Iterable<String> {
    protected String[] words = "H W R D A D Y F A E I K N P".split(" ");

    // Iterable需要返回一个Iterator
    // Iterator也是一个接口，需要实现两个方法
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public Iterable<String> reversed() {
        // 返回一个新的接口
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int current = words.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled);
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        IterableClass testIterable = new IterableClass();
        for (String s : testIterable) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : testIterable.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for(String s : testIterable.randomized()) {
            System.out.print(s + " ");
        }
    }
}
