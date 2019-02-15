package com.kk.service;

import com.kk.api.TestService;
import org.springframework.stereotype.Service;

/**
 * @author :Mr.kk
 * @date: 2019/2/15 16:35
 */
@Service
public class TestServiceImpl implements TestService{


    /**
     * 调用本地测试接口
     *
     * @param str
     * @return
     */
    @Override
    public String TestLocalServer(String str) {
        return "local server" + str;
    }

    /**
     * 调用rpc测试接口
     *
     * @param str
     * @return
     */
    @Override
    public String TestRpcServer(String str) {
        return null;
    }
}
