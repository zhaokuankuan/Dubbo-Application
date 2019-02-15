package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * @author :Mr.kk
 * @date: 2019/2/14 17:43
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.kk.*"})
public class ControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
    }
}
