package com.example.demo.bean;

/**
 * @author 心晴_xiao
 * @company 中国工商银行股份有限公司
 * @create 2021-02-28 19:27
 */
public class Dog {
    private  String name;
    private  Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
