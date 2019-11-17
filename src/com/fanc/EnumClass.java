package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/11/15 3:51 下午
 */
enum Shrubbery {
    GROUND(3), CRAWLING(2), HANGING(1);
    int number;
    Shrubbery(int number) {
        this.number = number;
    }
    int getNumber() {
        return number;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println(s + " ordinal: " + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING));
            System.out.println(s.equals(Shrubbery.CRAWLING));
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getClass());
            System.out.println(s.name());
            System.out.println(s.getNumber());
//            System.out.println(s.hashCode());
//            System.out.println(Shrubbery.CRAWLING.hashCode());
            System.out.println("+++++++++");
        }
    }
}

