package com.staticlearn;

/**
 * 本类用于学习静态代码块
 * @author ME08I
 * @date 2021/9/5
 */
public class Person {
    static {
        //静态代码块在类加载时就已经执行，且静态代码块只会执行一次，常常用于创建工具类和加载许多配置文件时
        System.out.println("改静态代码块已在类加载时执行");
    }
    public static void main(String[] args){
        System.out.println("检测静态代码块如何运行");
    }
}
