package com.volcengine.example.vms.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.QueryResourceRequest;
import com.volcengine.service.vms.response.CommonResponse;
import com.volcengine.service.vms.response.QueryOpenGetResourceResult;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
public class QueryOpenGetResourceDemo {
    // Make sure only get instance once throughout the entire running program.
    // We suggest using Singleton design model to get the instance.
    // And using the Singleton instance to call functions
    private static VmsService vmsService = VmsServiceImpl.getInstance();

    static {
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");
    }
    public static void main(String[] args) {
        try {
            QueryResourceRequest request = new QueryResourceRequest();
            request.setType(0);
            request.setLimit(2);
            CommonResponse<QueryOpenGetResourceResult> commonResponse = vmsService.queryOpenGetResource(request);
            System.out.println(JSON.toJSONString(commonResponse));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
