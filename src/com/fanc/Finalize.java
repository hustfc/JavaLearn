package com.fanc;

import com.fanc.Book;

/**
 * @Author : fanc
 * @Date : 2019-09-20 15:58
 */
public class Finalize {

    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
