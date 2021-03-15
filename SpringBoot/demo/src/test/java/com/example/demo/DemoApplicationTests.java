package com.example.demo;

import com.example.demo.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 *  springboot 单元测试
 *
 */
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;

    @Test
    public void TestBeans(){
        boolean b = ioc.containsBean("onePerson");
        System.out.println(b);
    }

    @Test
    public void TestHelloController01(){
        boolean b = ioc.containsBean("helloController01");
        System.out.println(b);
    }

    @Test
    public void TestHelloController02(){
        boolean b = ioc.containsBean("helloController02");
        System.out.println(b);
    }


    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
