package com.service.impl;

import com.service.HelloWorld;

/**
 * @author ME08I
 * @date 2021/8/31
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHi(String name) {
        return "欢迎"+name+"学习";
    }
}
