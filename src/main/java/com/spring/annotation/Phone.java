package com.spring.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/2/28.
 * 采用注解和Lombok开发的Phone类
 */
@Component
@Data
public class Phone {
    @Value("iPhone")
    private String brand;

    @Value("6666.66")
    private double price;
}
