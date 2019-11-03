package com.fanc;

import java.util.*;
/**
 * @Author : fanc
 * @Date : 2019/11/3 4:06 下午
 */

class SetType {
    int i;
    public SetType(int n) {
        i = n;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SetType && (i == ((SetType)obj).i);
    }
}

class HashType extends SetType {
    public HashType(int n) {
        super(n);
    }

    @Override
    public int hashCode() {
        return i;
    }
}

class TreeType extends SetType implements Comparable<TreeType> {
    public TreeType(int n) {
        super(n);
    }

    @Override
    public int compareTo(TreeType o) {
        return Integer.compare(i, o.i);
    }
}
public class TypesForSets {
    static <T> Set<T> fill()
}
