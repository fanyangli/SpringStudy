package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




/**
 * Created by Administrator on 2019/2/28.
 * @Component
 */

@Component
public class HelloApp {
    public static void main(String[] args) {
        //1.
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloApp.class);
        //2.读取bean
        hello hello=context.getBean(hello.class);
        //3.运行
        System.out.println(hello.gethello());
    }
}
