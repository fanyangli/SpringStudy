package com.sort1721.spring.hello;

/**
 * Created by lenovo on 2019/2/25.
 */
public class student {
    private String name;
    private int age;
    private Phone phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public student(String name, Phone phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}