package com.fanc;

import com.sun.tools.corba.se.idl.IncludeGen;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author : fanc
 * @Date : 2019/10/31 8:55 下午
 */
public class CompType implements Comparable<CompType> {
    int i;

    CompType(int i) {
        this.i = i;
    }
    @Override
    public String toString() {
        return Integer.toString(i);
    }

    @Override
    public int compareTo(CompType t) {
        //return (i < t.i) ? -1 : (i == t.i ? 0 : 1);
        return Integer.compare(i, t.i);
    }

    public static void main(String[] args) {
        CompType[] compTypes = {new CompType(3), new CompType(2), new CompType(4), new CompType(1)};
        Arrays.sort(compTypes, Collections.reverseOrder());
        System.out.println(Arrays.toString(compTypes));
        int location = Arrays.binarySearch(compTypes, compTypes[2]);
        System.out.println(location);
    }
}
