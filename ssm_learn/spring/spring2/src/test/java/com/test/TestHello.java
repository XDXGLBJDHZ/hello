package com.test;

import com.service.HelloWorld;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author ME08I
 * @date 2021/8/31
 */
public class TestHello {
    private ApplicationContext context;

    @Before
    public void init() {
        //初始化spring容器，并且加载配置文件
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSayHi() {
        HelloWorld helloWorld = (HelloWorld) context.getBean("hello");
        System.out.println(helloWorld.sayHi("YZK"));
    }

    @Test
    public void xmlBeanSayHi() {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("hello");
        System.out.println(helloWorld.sayHi("yzk"));
    }
    @Test
    public void testSayHi3(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        HelloWorld helloWorld= (HelloWorld) applicationContext.getBean("hello");
        System.out.println(helloWorld.sayHi("yzk"));
    }
}
