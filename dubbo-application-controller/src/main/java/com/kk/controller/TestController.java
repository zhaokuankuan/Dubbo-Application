package com.kk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kk.api.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 测试的类
 * @author :Mr.kk
 * @date: 2019/2/14 18:07
 */
@RestController
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return "test is ok";
    }

    @GetMapping("/testRpc")
    public String testRpc(){
        return testService.TestRpcServer(new Date().toString());
    }


}
