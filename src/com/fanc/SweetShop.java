package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/23 7:49 下午
 */

class Gum {
    static {
        System.out.println("Loading Gum");
    }
    Gum() {
        System.out.println("Constructor Gum");
    }
    public void add() {
        System.out.println("Add in Gum");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        try {
            Class gum = Class.forName("com.fanc.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find Gum");
        }
        try {
            Class say = Class.forName("Say");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find Say");
        }

    }
}
