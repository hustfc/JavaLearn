package com.fanc;

import java.lang.reflect.*;

/**
 * @Author : fanc
 * @Date : 2019/10/24 4:14 下午
 */

class Cons {
    public Cons() {
        System.out.println("no parameters");
    }

    public Cons(int i, int j) {
        System.out.println("int i int j");
    }

    public Cons(int x, String m) {
        System.out.println("int x String m");
    }

}
public class StringReflection {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Cons.class;
        Constructor constructor1 = c.getConstructor();
        Object obj1 = constructor1.newInstance();
        Constructor constructor2 = c.getConstructor(int.class, int.class);
        Object obj2 = constructor2.newInstance(2, 3);
        Constructor constructor3 = c.getConstructor(int.class, String.class);
        Object obj3 = constructor3.newInstance(2, "234");
    }
}
