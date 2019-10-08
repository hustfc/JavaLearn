package com.fanc;

/**
 * @Author : fanc
 * @Date : 2019-09-25 20:40
 */

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Service1 implements Service {
    @Override
    public void method1() {
        System.out.println("method1 in service1");
    }

    @Override
    public void method2() {
        System.out.println("method2 in service2");
    }
}

class Service1Factory implements ServiceFactory {
    @Override
    public  Service getService() {
        return new Service1();
    }
}
public class InterfaceFactory {

}
