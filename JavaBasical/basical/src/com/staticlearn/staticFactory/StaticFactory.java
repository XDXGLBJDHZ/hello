package com.staticlearn.staticFactory;

/**
 * 静态工厂方法
 * @author ME08I
 * @date 2021/9/9
 */
public class StaticFactory {
    /**
     * 静态工厂方法可以替代构造器，其可以减少参数暴露
     * 同时静态工厂构造方法有自己的名字，而构造器没有，且不用每次都创建新对象
     *可以返回原类型的子类
     * **/
    public static StaticFactory newStaticFactory(){
        ;return new StaticFactory();
    }
    public static void main(String[] args){
        StaticFactory staticFactory=StaticFactory.newStaticFactory();
        System.out.println(staticFactory);
    }
}
