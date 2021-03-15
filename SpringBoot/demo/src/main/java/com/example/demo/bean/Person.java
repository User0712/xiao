package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 心晴_xiao
 * @company 中国工商银行股份有限公司
 * @create 2021-02-28 19:22
 * 将配置文件中配置的每一项属性的值，映射到这个组件中
 * @ConfigurationProperties 告诉springboot 将本类中所有属性与配置文件中的相关配置进行绑定
 * prefix = "person"：配置文件中person下面的所有属性进行一一映射
 * @ConfigurationProperties(prefix = "person")默认从全局配置文件application.yml或者application.properties中获取
 *
 */
@PropertySource(value = "classpath:person.properties")
@Component
@ConfigurationProperties(prefix = "person")
@Validated  //数据格式校验的
public class Person {
    /**
     * <bean class="Person">
     *     <property name = "lastName" value = "1.字面量 / 2.${key}从环境变量、配置文件中获取 / 3.#{SpEL}"></property>
     * </bean>
     */
    @Email  //lastName必须是邮箱格式
//    @Value("${person.last-name}")
    private String lastName;
//    @Value("#{11*2}")
    private String age;
//    @Value("true")
    private boolean boss;
    private Date birth;

    //@value("${person.maps}")会报错， @value不支持复杂类型
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
