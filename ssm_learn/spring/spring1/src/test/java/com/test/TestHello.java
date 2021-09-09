package com.test;

import com.service.HelloWorld;
import com.service.impl.HelloWorldImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ME08I
 * @date 2021/8/31
 */
public class TestHello {
    private ApplicationContext context;
    @Before
    public void init(){
        //初始化spring容器，并且加载配置文件
        context=new ClassPathXmlApplicationContext("beans.xml");
    }
    @Test
    public void testSayHi(){
        HelloWorld helloWorld= (HelloWorld) context.getBean("hello");
        System.out.println(helloWorld.sayHi("YZK"));
    }
}
