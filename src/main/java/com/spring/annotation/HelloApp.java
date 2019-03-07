package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2019/2/28.
 * @Component
 */

@ComponentScan3
public class HelloApp {
    public static void main(String[] args) {
        //1 通过注解创建上下文对象
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloApp.class);
        //2 读取bean
        Hello hello = context.getBean(Hello.class);
        //3 运行

    }
}
