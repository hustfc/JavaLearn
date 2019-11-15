package com.fanc;

import java.io.*;

/**
 * @Author : fanc
 * @Date : 2019/11/15 11:16 上午
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
        System.out.println(read("/Users/fanc/Documents/GitHub/JavaLearn/src/com/fanc/read.txt"));
    }
}