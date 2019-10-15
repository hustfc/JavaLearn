package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019/10/15 10:32 下午
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Get Message: " + e.getMessage());
            System.out.println("Get Loacal Message: " + e.getLocalizedMessage());
            System.out.println("to String(): " + e.toString());
            System.out.println("pringStackTrace: ");
            e.printStackTrace(System.err);
            for(StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getClassName());
                System.out.println(ste.getMethodName());
            }
        }
    }
}
