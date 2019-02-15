package com.kk.api;

/**
 * @author :Mr.kk
 * @date: 2019/2/15 16:13
 */
public interface TestService {

    /** 调用本地测试接口
     * @param str
     * @return
     */
    public String TestLocalServer(String str);

    /** 调用rpc测试接口
     * @param str
     * @return
     */
    public String TestRpcServer(String str);

}
