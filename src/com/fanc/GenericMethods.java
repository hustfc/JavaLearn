package com.fanc;


/**
 * @Author : fanc
 * @Date : 2019/10/29 8:59 下午
 */

class GenericClass<T> {
    public void f(T x) {
        System.out.println(x.getClass().getName());
    }
}
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        // 这个时候使用泛型类就不好，每一个都要创建新的类
        GenericClass<String> genericClass= new GenericClass<>();
        genericClass.f("123");

        //使用泛型方法不需要创建新的类就能够输出不同类型
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("123");
        genericMethods.f(23);
        genericMethods.f(1.0);
        genericMethods.f(1.0F);
    }
}
