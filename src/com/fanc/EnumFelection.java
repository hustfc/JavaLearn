package com.fanc;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;
/**
 * @Author : fanc
 * @Date : 2019/11/16 10:48 上午
 */

enum Explore {HERE, THERE}
public class EnumFelection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("-------Analyzing" + enumClass + "----------");
        System.out.println("Interfaces");
        for(Type t : enumClass.getGenericInterfaces()) {
            System.out.println(t);
        }
        System.out.println("SuperClass: " + enumClass.getSuperclass());
        System.out.println("Methods");
        Set<String> methods = new TreeSet<>();
        for(Method m : enumClass.getMethods()) {
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods  = analyze(Enum.class);
    }
}
