package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/30 4:32 下午
 */

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}
class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}
class Jonathan extends Apple {
    @Override
    public String toString() {
        return "Jonathan";
    }
}
class Orange extends Fruit {}
public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        try {
            fruits[1] = new Jonathan();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
