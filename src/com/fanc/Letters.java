package com.fanc;

import javafx.util.Pair;

import java.util.Iterator;

/**
 * @Author : fanc
 * @Date : 2019/11/1 9:09 下午
 */
public class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<>(number++, String.valueOf(letter++));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number ++;
            }
        };
    }
}
