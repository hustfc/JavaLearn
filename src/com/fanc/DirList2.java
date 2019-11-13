package com.fanc;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author : fanc
 * @Date : 2019/11/13 8:15 下午
 */
public class DirList2 {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        }
        else {
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
