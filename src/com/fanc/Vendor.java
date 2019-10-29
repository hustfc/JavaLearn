package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/28 10:35 下午
 */
public class Vendor implements Sell {
    @Override
    public void sell() {
        System.out.println("Sell in Vendor");
    }

    @Override
    public void ad() {
        System.out.println("Ad in Vendor");
    }
}
