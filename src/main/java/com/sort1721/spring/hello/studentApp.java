package com.sort1721.spring.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;

/**
 * Created by lenovo on 2019/2/25.
 */
public class studentApp {
    public static void main(String[] args) {
        //读入配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("/beans.xml");
        //读取配置好的xml
        student student= (com.sort1721.spring.hello.student) context.getBean("student");
        //运行hello world的方法
        System.out.println(student);



    }
}
