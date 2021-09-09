package com.staticlearn;

/**
 * 静态代码块的学习
 * @author ME08I
 * @date 2021/9/5
 */
class StaticCode {
    static {
        System.out.println("该静态代码块已经在类加载时执行");
    }
}
class StaticCodeDemo{
    static {
        System.out.println("该静态代码块已经在类加载时执行2");
    }
    public static void main(String[] args){
        System.out.println("已执行");
        new StaticCode();
        System.out.println("已执行2");
        new StaticCode();
        System.out.println("已执行3");
    }
    static {
        System.out.println("该静态代码块已经在类加载时执行3");
    }
}
