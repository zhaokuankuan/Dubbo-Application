package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Rpc服务的启动类
 * @author :Mr.kk
 * @date: 2019/2/14 17:50
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.kk.*"})
public class RpcControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RpcControllerApplication.class, args);
    }
}
