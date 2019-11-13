package com.fanc;

import java.io.*;
import java.util.regex.*;

/**
 * @Author : fanc
 * @Date : 2019/11/11 10:32 下午
 */


public class DirFilter implements FilenameFilter {
    private Pattern pattern;
    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
