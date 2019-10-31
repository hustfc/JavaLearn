package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/31 7:15 下午
 */

class Berry {
    @Override
    public String toString() {
        return "Berry";
    }
}

public class ArrayOption {
    Berry[] berries1 = new Berry[3];
    Berry[] berries2 = new Berry[]{new Berry(), new Berry()};
    int[] ints1 = new int[3];
    int[] ints2 = new int[]{1, 2, 3, 4};
    Berry[] berries3 = {new Berry(), new Berry()};
}
