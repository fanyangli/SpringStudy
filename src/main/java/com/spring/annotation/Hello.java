package com.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/2/28.
 * @Component用于类级别注解，标注本类为一个可被Spring容器托管的
 */
@Component
public class Hello {
    public String gethello(){
        return "Hello World";
    }
}
