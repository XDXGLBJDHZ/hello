package com.service.impl;

import com.service.HelloWorld;

/**
 * @author ME08I
 * @date 2021/9/8
 */
public class HelloWorldBeanFactory {
    //静态工厂方法
    public static HelloWorld createHelloWorldBean1(){
        return new HelloWorldImpl();
    }
    //实例工厂方法
    public  HelloWorld createHelloWorldBean2(){
        return new HelloWorldImpl();
    }

}
