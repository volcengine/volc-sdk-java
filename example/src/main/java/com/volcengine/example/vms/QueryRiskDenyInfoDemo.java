package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.QueryRiskDenyInfoRequest;
import com.volcengine.service.vms.response.QueryRiskDenyInfoResponse;

/**
 * @author changke.233
 * @Date 2025/1/22
 */
public class QueryRiskDenyInfoDemo {
    // Make sure only get instance once throughout the entire running program.
    // We suggest using Singleton design model to get the instance.
    // And using the Singleton instance to call functions
    private static VmsService vmsService = VmsServiceImpl.getInstance();

    static {
        vmsService.setAccessKey("you access key");
        vmsService.setSecretKey("you secret key");
    }
    public static void main(String[] args) {
        try {
            QueryRiskDenyInfoRequest request = new QueryRiskDenyInfoRequest();
            request.setMobile("13900000000ToMd5");
            request.setAccountRequestId("20260122150000000000000000000000");
            request.setEncryptType(1);
            QueryRiskDenyInfoResponse response = vmsService.queryRiskDenyInfo(request);
            System.out.println("结果:" + JSON.toJSONString(response));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
