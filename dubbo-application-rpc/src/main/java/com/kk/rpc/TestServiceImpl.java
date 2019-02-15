package com.kk.rpc;

import com.kk.api.TestService;
import com.reger.dubbo.annotation.Export;

/**
 * @author :Mr.kk
 * @date: 2019/2/15 16:35
 */
@Export
public class TestServiceImpl implements TestService{


    /**
     * 调用本地测试接口
     *
     * @param str
     * @return
     */
    @Override
    public String TestLocalServer(String str) {
        return null;
    }

    /**
     * 调用rpc测试接口
     *
     * @param str
     * @return
     */
    @Override
    public String TestRpcServer(String str) {
        return "rpc server" + str;
    }
}
