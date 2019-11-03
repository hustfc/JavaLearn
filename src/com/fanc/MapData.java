package com.fanc;

import javafx.util.Pair;

import java.util.*;

/**
 * @Author : fanc
 * @Date : 2019/11/1 8:46 下午
 */
public class MapData<K, V> extends LinkedHashMap<K, V> {
    public MapData(Generator<Pair<K, V>> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Pair<K, V> p= gen.next();
            putIfAbsent(p.getKey(), p.getValue());
        }
    }

    public MapData(Generator<K> genk, V value, int quantity) {
        for (int i = 0; i < quantity; i ++) {
            put(genk.next(), value);
        }
    }

    public MapData(Iterable<K> genk, V value) {
        for(K key : genk) {
            put(key, value);
        }
    }


    public static void main(String[] args) {
        System.out.println(new MapData<>(new Letters(), 11));
        //System.out.println(new MapData<>(new IntegerGenerator, randomString, 11));
        System.out.println(new MapData<>(new Letters(), "A"));
    }
}
