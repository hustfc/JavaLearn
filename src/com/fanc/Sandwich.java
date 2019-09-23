package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019-09-23 20:23
 */

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class ProtableLunch extends Lunch {
    ProtableLunch() {
        System.out.println("ProtableLunch()");
    }
}
public class Sandwich extends ProtableLunch{
    Bread bread = new Bread();
    Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
    }
}
