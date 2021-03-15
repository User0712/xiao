package com.example.demo.config;

import com.example.demo.bean.Person;
import com.example.demo.controller.HelloController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 心晴_xiao
 * @company 中国工商银行股份有限公司
 * @create 2021-03-01 22:38
 */

/**
 * @Configuration ：指明当前类是一个配置类：就是用来代替之前的Spring配置文件
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中；容器这个组件默认的id就是方法名
    @Bean
    public HelloController helloController01(){
        System.out.println("配置类@Bean给容器添加组件了helloController01");
        return new HelloController();
    }

    @Bean
    public HelloController helloController02(){
        System.out.println("配置类@Bean给容器添加组件了helloController02");
        return new HelloController();
    }
}
