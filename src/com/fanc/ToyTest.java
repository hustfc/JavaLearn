package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/23 8:26 下午
 */
class Toy {
    Toy() { }
    Toy(int i) {
    }
}


interface HasBatteries {

}

interface Shoots {

}

class FancyToy extends Toy implements HasBatteries, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    private static void printInfo(Class cc) {
        System.out.println("Class name : " + cc.getName() +
                " is interface ? [" + cc.isInterface() + "]");
        System.out.println("Simple Name : " + cc.getSimpleName());
    }

    public static void main(String[] args) {
        // 是一个引用，需要提前声明
        Class c = null;
        try {
            c = Class.forName("com.fanc.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find FancyToy");
            System.exit(1);
        }
        // Java用一对大括号作为语句块的范围，称为作用域，作为在作用域里定义的一个变量，它只有在那个作用域结束之前才可使用。
        printInfo(c);
        // 得到接口
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        // 得到超类
        Class up = c.getSuperclass();

        Object obj = null;
        try {
            // 得到实例,需要默认的构造器
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Can not Instance");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Illegal Access");
            System.exit(1);
        }

        // 从实例获得对类的引用
        printInfo(obj.getClass());

        StringBuilder str = new StringBuilder("123");
        printInfo(str.getClass());
    }
}
