package com.fanc;

import java.io.*;
import java.util.Arrays;

/**
 * @Author : fanc
 * @Date : 2019/11/11 10:25 下午
 */


public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if(args.length == 0) {
            list = path.list();
        }
        else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
