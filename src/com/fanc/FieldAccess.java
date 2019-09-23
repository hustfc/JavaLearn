package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019-09-23 19:58
 */

class Super {
    public int field = 0;
    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}


public class FieldAccess {
    public static void main(String[] args) {
        Super test1 = new Sub();
        System.out.println("field:" + test1.field);
        System.out.println("get field:"  + test1.getField());
        //test1没有SuperField方法
        Sub test2 = new Sub();
        System.out.println("");
        System.out.println("field:" + test2.field);
        System.out.println("get field:"  + test2.getField());
        System.out.println("super field:" + test2.getSuperField());
    }

}
