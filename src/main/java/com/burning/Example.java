package com.burning;

import com.burning.car.CarFactory;
import com.burning.car.ICar;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
/**
 * @Description: 第一个Spring Boot工程
 * @Author:You.Hu
 * @Create:2017-03-26 20:36
 */

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }


    @EventListener
    public void test(ApplicationReadyEvent event){
        ICar iCar = CarFactory.getBeanByType("1");
        iCar.driver();
    }
}
